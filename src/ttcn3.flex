/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 1998-2015  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/* Java 1.2 language lexer specification */

/* Use together with unicode.flex for Unicode preprocesssing */
/* and java12.cup for a Java 1.2 parser                      */

/* Note that this lexer specification is not tuned for speed.
   It is in fact quite slow on integer and floating point literals,
   because the input is read twice and the methods used to parse
   the numbers are not very fast.
   For a production quality application (e.g. a Java compiler)
   this could be optimized */

package com.intelliTtcn3;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
//import com.intellij.psi.TokenType;
import com.intelliTtcn3.psi.TtcnTypes;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.String;
%%

%public
%class Scanner
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%line
%column


%{
  StringBuilder string = new StringBuilder();
  private int yyline;
  private int yycolumn;

  private Collection<String> macroDefinePool = new ArrayList<String>();
  private int currentMacroBool = -1;

  public boolean checkMacroDefine(String defineStr) {
      for (String def : macroDefinePool) {
            if (defineStr.equals(def))
                return true;
      }
      return false;
  }
%}


/* main character classes */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/*" "*"+ [^/*] ~"*/"

/* identifiers */
Identifier = [:jletter:][:jletterdigit:]*

/* integer literals */
DecIntegerLiteral = [+-]?(0 | [1-9][0-9]*)

/* floating point literals */
FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}) {Exponent}? [fF]
DoubleLiteral = ({FLit1}|{FLit2}|{FLit3}) {Exponent}?

FLit1    = [0-9]+\.[^\.][0-9]*
FLit2    = \.[^\.][0-9]+
FLit3    = [0-9]+
Exponent = [eE] [+-]? [0-9]+

/* string and character literals */
StringCharacter = [^\r\n\"\\]
SingleCharacter = [^\r\n\'\\]

BSTRING=\'[0-1]*\'B
HSTRING=\'[0-9A-Fa-f]*\'H
OSTRING=\'[0-9A-Fa-f]+[0-9A-Fa-f]+\'O

ESC = "\\" ( [^] )
CHAR = {ESC} | [^\'\"\\]
STRING_BAD1 = \" ({CHAR} | \') *
StringLiteral = {STRING_BAD1} \"

%state STRING, CHARLITERAL, MACRO_IF, MACRO_IFDEF, MACRO_IFNDEF, MACRO_DEFINE, MACRO_ELSE, MACRO_ELIF, MACRO_STATMENT

%%


<MACRO_STATMENT>
{
    "#elif"                      { yybegin(MACRO_ELIF); return TtcnTypes.TTCN_S_ELIF;}
    "#else"                      { yybegin(MACRO_ELSE); return TtcnTypes.TTCN_S_ELSE;}
    "#endif"                     { currentMacroBool = -1; yybegin(YYINITIAL); return TtcnTypes.TTCN_S_ENDIF;}
    {StringCharacter}+           { return TtcnTypes.TTCN_COMMENT; }
    {WhiteSpace}                   { /* ignore */ }
          \\.                            {yybegin(YYINITIAL);  }
}

<MACRO_IFDEF>
{
    {Identifier}                 { if (checkMacroDefine(yytext().toString())) {currentMacroBool = 1; yybegin(YYINITIAL);} else {currentMacroBool = 0; yybegin(MACRO_STATMENT);}  }
    {LineTerminator}             { yybegin(YYINITIAL); }
    {WhiteSpace}                   { /* ignore */ }
          \\.                            { yybegin(YYINITIAL); }
}

<MACRO_IFNDEF>
{

    {Identifier}                 { if (checkMacroDefine(yytext().toString()) == false) {currentMacroBool = 1; yybegin(YYINITIAL);} else {currentMacroBool = 0; yybegin(MACRO_STATMENT);}  }
    {LineTerminator}             { yybegin(YYINITIAL); }
    {WhiteSpace}                   { /* ignore */ }
    \\.                            { yybegin(YYINITIAL); }
}

<MACRO_DEFINE>
{

    {Identifier}                 { macroDefinePool.add(yytext().toString()); }
    {LineTerminator}             { yybegin(YYINITIAL); }
    {WhiteSpace}                   { /* ignore */ }
          \\.                            { yybegin(YYINITIAL); }
}

<MACRO_ELSE>
{

    {LineTerminator}             { if (currentMacroBool == 0) { yybegin(YYINITIAL); } else { yybegin(MACRO_STATMENT);} }
    {WhiteSpace}                   { /* ignore */ }
          \\.                            { yybegin(YYINITIAL); }
}

<MACRO_ELIF, MACRO_IF>
{
    // TODO: Express Calu
    {Identifier}                 { if (checkMacroDefine(yytext().toString())) {currentMacroBool = 1; yybegin(YYINITIAL);} else {currentMacroBool = 0; yybegin(MACRO_STATMENT);} }
    {DecIntegerLiteral}          { int exp = new Integer(yytext().toString()); if (exp != 0) {currentMacroBool = 1; yybegin(YYINITIAL);} else {currentMacroBool = 0; yybegin(MACRO_STATMENT);}  }
    {LineTerminator}             { yybegin(YYINITIAL); }
    {WhiteSpace}                   { /* ignore */ }
          \\.                            { yybegin(YYINITIAL); }
}



<YYINITIAL> {
     "import"                { return TtcnTypes.TTCN_IMPORT; }
     "from"                    { return TtcnTypes.TTCN_FROM; }
     "recursive"          { return TtcnTypes.TTCN_RECURSIVE; }
     "all"                      { return TtcnTypes.TTCN_ALL; }
     "except"                { return TtcnTypes.TTCN_EXCEPT; }
     "system"                { return TtcnTypes.TTCN_SYSTEM; }
     "module"                { return TtcnTypes.TTCN_MODULE; }
     "function"           { return TtcnTypes.TTCN_FUNCTIOIN; }
     "runs"                    { return TtcnTypes.TTCN_RUNS; }
     "on"                        { return TtcnTypes.TTCN_ON; }
     "const"                  { return TtcnTypes.TTCN_CONST; }
     "pass"                    { return TtcnTypes.TTCN_PASS; }
     "fail"                    { return TtcnTypes.TTCN_FAIL; }
     "inconc"                { return TtcnTypes.TTCN_INCONC; }
     "none"                    { return TtcnTypes.TTCN_NONE; }
     "error"                  { return TtcnTypes.TTCN_ERROR; }
     "control"              { return TtcnTypes.TTCN_CONTROL; }
     "execute"              { return TtcnTypes.TTCN_EXECUTE; }
     "altstep"              { return TtcnTypes.TTCN_ALTSTEP; }
     "testcase"            { return TtcnTypes.TTCN_TESTCASE; }
     "public"                { return TtcnTypes.TTCN_PUBLIC; }
     "friend"                { return TtcnTypes.TTCN_FRIEND; }
     "private"              { return TtcnTypes.TTCN_PRIVATE; }
     "activate"             { return TtcnTypes.TTCN_ACTIVTE; }
     "deactivate"         { return TtcnTypes.TTCN_DEACTIVTE; }
     "action"                { return TtcnTypes.TTCN_ACTION; }
     "getverdict"        { return TtcnTypes.TTCN_GETVERDICT; }
     "setverdict"        { return TtcnTypes.TTCN_SETVERDICT; }
     "language"            { return TtcnTypes.TTCN_LANGUAGE; }
     "modifies"            { return TtcnTypes.TTCN_MODIFIES; }
     "value"                  { return TtcnTypes.TTCN_VALUE; }
     "sender"                { return TtcnTypes.TTCN_SENDER; }
     "mtc"                      { return TtcnTypes.TTCN_MTC; }
     "return"                { return TtcnTypes.TTCN_RETURN; }
     "procedure"          { return TtcnTypes.TTCN_PROCEDURE; }
     "mixed"                  { return TtcnTypes.TTCN_MIXED; }
     "pattern"              { return TtcnTypes.TTCN_PATTERN; }
     "complement"        { return TtcnTypes.TTCN_COMPLEMENT; }
     "subset"                { return TtcnTypes.TTCN_SUBSET; }
     "superset"            { return TtcnTypes.TTCN_SUPERSET; }
     "permutation"      { return TtcnTypes.TTCN_PERMUTATION; }
     "ifpresent"          { return TtcnTypes.TTCN_IFPRESENT; }
     "infinity"            { return TtcnTypes.TTCN_INFINITY; }
     "match"                  { return TtcnTypes.TTCN_MATCH; }
     "valueof"              { return TtcnTypes.TTCN_VALUEOF; }
     "disconnect"        { return TtcnTypes.TTCN_DISCONNECT; }
     "map"                      { return TtcnTypes.TTCN_MAP; }
     "unmap"                  { return TtcnTypes.TTCN_UNMAP; }
     "start"                  { return TtcnTypes.TTCN_START; }

     "group"                  { return TtcnTypes.TTCN_GROUP; }
     "type"                    { return TtcnTypes.TTCN_TYPE; }
     "port"                    { return TtcnTypes.TTCN_PORT; }
     "component"          { return TtcnTypes.TTCN_COMPONENT; }
     "signature"          { return TtcnTypes.TTCN_SIGNATURE; }
     "external"            { return TtcnTypes.TTCN_EXTERNAL; }
     "template"            { return TtcnTypes.TTCN_TEMPLATE; }
     "var"                      { return TtcnTypes.TTCN_VAR; }
     "timer"                  { return TtcnTypes.TTCN_TIMER; }
     "modulepar"          { return TtcnTypes.TTCN_MODULEPAR; }
     "log"                      { return TtcnTypes.TTCN_LOG; }
     "length"                { return TtcnTypes.TTCN_LENGTH; }


     "if"                        { return TtcnTypes.TTCN_IF; }
     "else"                    { return TtcnTypes.TTCN_ELSE; }
     "while"                  { return TtcnTypes.TTCN_WHILE; }
     "do"                        { return TtcnTypes.TTCN_DO; }
     "alt"                      { return TtcnTypes.TTCN_ALT; }
     "for"                      { return TtcnTypes.TTCN_FOR; }
     "case"                    { return TtcnTypes.TTCN_CASE; }
     "continue"            { return TtcnTypes.TTCN_CONTINUE; }
     "break"                  { return TtcnTypes.TTCN_BREAK; }
     "repeat"                { return TtcnTypes.TTCN_REPEAT; }
     "goto"                    { return TtcnTypes.TTCN_GOTO; }
     "label"                  { return TtcnTypes.TTCN_LABEL; }
     "interleave"        { return TtcnTypes.TTCN_INTERLEAVE; }
     "extends"              { return TtcnTypes.TTCN_EXTENDS; }
     "to"                        { return TtcnTypes.TTCN_TO; }
     "rem"                      { return TtcnTypes.TTCN_REM; }

     "integer"              { return TtcnTypes.TTCN_INTEGER; }
     "char"                    { return TtcnTypes.TTCN_CHAR; }
     "universal char"         { return TtcnTypes.TTCN_UCHAR; }
     "float"                  { return TtcnTypes.TTCN_FLOAT; }
     "boolean"                 { return TtcnTypes.TTCN_BOOL; }
     "true"                    { return TtcnTypes.TTCN_TRUE; }
     "false"                  { return TtcnTypes.TTCN_FALSE; }
     "objid"                  { return TtcnTypes.TTCN_OBJID; }
     "verdicttype"      { return TtcnTypes.TTCN_VERDICTTYPE; }
     "bitstring"          { return TtcnTypes.TTCN_BITSTRING; }
     "hexstring"          { return TtcnTypes.TTCN_HEXSTRING; }
     "octetstring"      { return TtcnTypes.TTCN_OCTETSTRING; }
     "charstring"        { return TtcnTypes.TTCN_CHARSTRING; }
     "universal"          { return TtcnTypes.TTCN_UNIVERSAL; }
     "record"                { return TtcnTypes.TTCN_RECORD; }
     "of"                        { return TtcnTypes.TTCN_OF; }
     "set"                      { return TtcnTypes.TTCN_SET; }
     "enumerated"        { return TtcnTypes.TTCN_ENUMERATED; }
     "union"                  { return TtcnTypes.TTCN_UNION; }
     "anytype"              { return TtcnTypes.TTCN_ANYTYPE; }
     //"address"              { return TtcnTypes.TTCN_ADDRESS; }
     "port"                    { return TtcnTypes.TTCN_PORT; }
     "component"          { return TtcnTypes.TTCN_COMPONENT; }
     "default"              { return TtcnTypes.TTCN_DEFAULT; }
     "omit"                    { return TtcnTypes.TTCN_OMIT; }
     "optional"            { return TtcnTypes.TTCN_OPTIONAL; }
     "length"                { return TtcnTypes.TTCN_LENGTH; }
     "sizeof"                { return TtcnTypes.TTCN_SIZEOF; }
     "not"                      { return TtcnTypes.TTCN_NOT; }
     "and"                      { return TtcnTypes.TTCN_AND; }
     "xor"                      { return TtcnTypes.TTCN_XOR; }
     "or"                        { return TtcnTypes.TTCN_OR; }
     "or4b"                    { return TtcnTypes.TTCN_OR4B; }
     "xor4b"                  { return TtcnTypes.TTCN_XOR4B; }
     "and4b"                  { return TtcnTypes.TTCN_AND4B; }
     "not4b"                  { return TtcnTypes.TTCN_NOT4B; }
     "in"                        { return TtcnTypes.TTCN_IN; }
     "out"                      { return TtcnTypes.TTCN_OUT; }
     "inout"                  { return TtcnTypes.TTCN_INOUT; }
     "mod"                      { return TtcnTypes.TTCN_MOD; }
     "nowait"                { return TtcnTypes.TTCN_NOWAIT; }
     "any"                      { return TtcnTypes.TTCN_ANY; }
     "checkstate"        { return TtcnTypes.TTCN_CHECKSTATE; }
     "message"              { return TtcnTypes.TTCN_MESSAGE; }

     "send"                    { return TtcnTypes.TTCN_SEND; }
     "receive"              { return TtcnTypes.TTCN_RECEIVE; }
     "trigger"              { return TtcnTypes.TTCN_TRIGGER; }
     "call"                    { return TtcnTypes.TTCN_CALL; }
     "getcall"              { return TtcnTypes.TTCN_GETCALL; }
     "reply"                  { return TtcnTypes.TTCN_REPLY; }
     "getreply"            { return TtcnTypes.TTCN_GETREPLY; }
     "raise"                  { return TtcnTypes.TTCN_RAISE; }
     "select"                { return TtcnTypes.TTCN_SELECT; }
     "with"                    { return TtcnTypes.TTCN_WITH; }
     "null"                    { return TtcnTypes.TTCN_NULL; }
     "create"                { return TtcnTypes.TTCN_CREATE; }
     "alive"                  { return TtcnTypes.TTCN_ALIVE; }
     "connect"             { return TtcnTypes.TTCN_CONNECTS; }
     "running"              { return TtcnTypes.TTCN_RUNNING; }
     "done"                    { return TtcnTypes.TTCN_DONE; }
     "killed"                { return TtcnTypes.TTCN_KILLED; }
     "self"                    { return TtcnTypes.TTCN_SELF; }
     "param"                  { return TtcnTypes.TTCN_PARAM; }
     "present"              { return TtcnTypes.TTCN_PRESENT; }
     "exception"          { return TtcnTypes.TTCN_EXCEPTION; }
     "noblock"              { return TtcnTypes.TTCN_NOBLOCK; }
     "kill"                    { return TtcnTypes.TTCN_KILL; }
     "catch"                  { return TtcnTypes.TTCN_CATCH; }
     "check"                  { return TtcnTypes.TTCN_CKECK; }
     "clear"                  { return TtcnTypes.TTCN_CLEAR; }
     "stop"                    { return TtcnTypes.TTCN_STOP; }
     "halt"                    { return TtcnTypes.TTCN_HALT; }
     "read"                    { return TtcnTypes.TTCN_READ; }
     "timeout"              { return TtcnTypes.TTCN_TIMEOUT; }
     "not_a_number"       { return TtcnTypes.TTCN_NOT_A_NUM; }
     "encode"                { return TtcnTypes.TTCN_ENCODE; }
     "variant"              { return TtcnTypes.TTCN_VARIANT; }
     "display"              { return TtcnTypes.TTCN_DISPLAY; }
     "extension"          { return TtcnTypes.TTCN_EXTENSION; }
     "override"            { return TtcnTypes.TTCN_OVERRIDE; }
     "@index"              { return TtcnTypes.TTCN_AT_INDEX; }
     "@deterministic"   { return TtcnTypes.TTCN_AT_DETERMINISTIC; }
     "@lazy"                { return TtcnTypes.TTCN_AT_LAZY; }
     "@fuzzy"              { return TtcnTypes.TTCN_AT_FUZZY; }


     "["                         { return TtcnTypes.TTCN_LM; }
     "]"                         { return TtcnTypes.TTCN_RM; }
     ":="                    { return TtcnTypes.TTCN_ASSIGN; }
     "{"                         { return TtcnTypes.TTCN_LB; }
     "}"                         { return TtcnTypes.TTCN_RB; }
     ","                      { return TtcnTypes.TTCN_COMMA; }
     "."                        { return TtcnTypes.TTCN_DOT; }
     "&"                    { return TtcnTypes.TTCN_CONNECT; }
     ".."             { return TtcnTypes.TTCN_POINT_CONNECT; }
     ";"                       { return TtcnTypes.TTCN_SEMI; }
     "("                         { return TtcnTypes.TTCN_LP; }
     ")"                         { return TtcnTypes.TTCN_RP; }
     "+"                        { return TtcnTypes.TTCN_ADD; }
     "-"                        { return TtcnTypes.TTCN_SUB; }
     "*"                        { return TtcnTypes.TTCN_MUL; }
     "/"                        { return TtcnTypes.TTCN_DIV; }
     "!"                       { return TtcnTypes.TTCN_EXCL; }
     ":"                      { return TtcnTypes.TTCN_COLON; }
     "?"                   { return TtcnTypes.TTCN_QUESTION; }
     "->"                  { return TtcnTypes.TTCN_POINT_TO; }
     ">"                     { return TtcnTypes.TTCN_LARGER; }
     "<"                       { return TtcnTypes.TTCN_LESS; }
     ">="                 { return TtcnTypes.TTCN_LARGER_EQ; }
     "<="                   { return TtcnTypes.TTCN_LESS_EQ; }
     "=="                        { return TtcnTypes.TTCN_EQ; }
     "!="                    { return TtcnTypes.TTCN_NOT_EQ; }
     "<<"                { return TtcnTypes.TTCN_LEFT_SHIFT; }
     ">>"               { return TtcnTypes.TTCN_RIGHT_SHIFT; }
     "<@"             { return TtcnTypes.TTCN_LEFT_SHIFT_AT; }
     "@>"            { return TtcnTypes.TTCN_RIGHT_SHIFT_AT; }
     "_"                 { return TtcnTypes.TTCN_UNDERSCORE; }
    // "#if"                 { return TtcnTypes.TTCN_S_IF; }
    // "#ifdef"              { return TtcnTypes.TTCN_S_IFELSE; }
    // "#else"               { return TtcnTypes.TTCN_S_ELSE; }
    // "#endif"              { return TtcnTypes.TTCN_S_ENDIF; }
    // "#ifndef"             { return TtcnTypes.TTCN_S_IFNDEF; }
    // "#elif"               { return TtcnTypes.TTCN_S_ELIF; }
     "#endif"              { currentMacroBool = -1; yybegin(YYINITIAL); return TtcnTypes.TTCN_S_ENDIF;}
     "#if"                 { yybegin(MACRO_IF);  return TtcnTypes.TTCN_S_IF; }
     "#ifdef"              { yybegin(MACRO_IFDEF); return TtcnTypes.TTCN_S_IFELSE;}
     "#ifndef"             { yybegin(MACRO_IFNDEF); return TtcnTypes.TTCN_S_IFNDEF;}
     "#define"             { yybegin(MACRO_DEFINE); return TtcnTypes.TTCN_S_DEFINE;}
     "#else"               { yybegin(MACRO_ELSE); return TtcnTypes.TTCN_S_ELSE;}
     "#elif"               { yybegin(MACRO_ELIF); return TtcnTypes.TTCN_S_ELIF;}



  /* string literal */
  \"                             { yybegin(STRING); string.setLength(0); }

  /* character literal */
  //\'                             { yybegin(CHARLITERAL); string.setLength(0); }

  /* numeric literals */

  /* This is matched together with the minus, because the number is too big to
     be represented by a positive integer. */
  "-2147483648"                  {  }

    {DecIntegerLiteral}            { return TtcnTypes.TTCN_NUMBER; }
    {FloatLiteral}                 { return TtcnTypes.TTCN_NUMBER; }
    {DoubleLiteral}                { return TtcnTypes.TTCN_NUMBER; }

  /* comments */
  {Comment}                      { return TtcnTypes.TTCN_COMMENT; }

  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }

  /* identifiers */
  {Identifier}                   { return TtcnTypes.TTCN_ID; }

  {BSTRING}                      { return TtcnTypes.TTCN_BSTRING; }
  {HSTRING}                      { return TtcnTypes.TTCN_HSTRING; }
  {OSTRING}                      { return TtcnTypes.TTCN_OSTRING; }
  //{StringLiteral}                { return TtcnTypes.TTCN_STRING; }
}


<STRING> {
  \"                             { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING; }

  {StringCharacter}+             { string.append( yytext() ); }

  //escape sequences
  "\\b"                          { string.append( '\b' ); }
  "\\t"                          { string.append( '\t' ); }
  "\\n"                          { string.append( '\n' ); }
  "\\f"                          { string.append( '\f' ); }
  "\\r"                          { string.append( '\r' ); }
  "\\\""                         { string.append( '\"' ); }
  "\\'"                          { string.append( '\'' ); }
  "\\\\"                         { string.append( '\\' ); }
  "\\o"                          { string.append( 'o' ); }
 // \\[0-3]?{OctDigit}?{OctDigit}  { char val = (char) Integer.parseInt(yytext().substring(1),8);
  //                      				   string.append( val ); }

  //error cases
  \\.                            { throw new RuntimeException("Illegal escape sequence \""+yytext()+"\"" + " " + yycolumn + " " + yyline); }
 // {LineTerminator}               { throw new RuntimeException("Unterminated string at end of line"); }
}

<CHARLITERAL> {
//  {SingleCharacter}\'            { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING; }
  {StringCharacter}+             { string.append( yytext() ); }
  /* escape sequences */
//  \'B                          { yybegin(YYINITIAL); return TtcnTypes.TTCN_BSTRING;}
//  \'H                          { yybegin(YYINITIAL); return TtcnTypes.TTCN_HSTRING;}
//  \'O                          { yybegin(YYINITIAL); return TtcnTypes.TTCN_OSTRING;}
//  "\\b"\'                        { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
//  "\\t"\'                        { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
//  "\\n"\'                        { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
//  "\\f"\'                        { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
//  "\\r"\'                        { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
//  "\\\""\'                       { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
//  "\\'"\'                        { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
//  "\\\\"\'                       { yybegin(YYINITIAL); return TtcnTypes.TTCN_STRING;}
 // \\[0-3]?{OctDigit}?{OctDigit}\' { yybegin(YYINITIAL);
//			                              int val = Integer.parseInt(yytext().substring(1,yylength()-1),8);
//			                            return TtcnTypes.TTCN_STRING; }

  /* error cases */
  \\.                            { throw new RuntimeException("Illegal escape sequence \""+yytext()+"\"" + " " + yycolumn + " " + yyline); }
  {LineTerminator}               { throw new RuntimeException("Unterminated character literal at end of line" + " " + yycolumn + " " + yyline); }
}



/* error fallback */
//[^]                              { throw new RuntimeException("Illegal character \""+yytext()+
//                                                              "\" at line "+yyline+", column "+yycolumn); }
//<<EOF>>                          { return symbol(EOF); }