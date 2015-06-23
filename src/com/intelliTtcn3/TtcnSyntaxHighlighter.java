package com.intelliTtcn3;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NotNull;
import com.intelliTtcn3.psi.TtcnTypes;

import java.util.Map;

/**
 * @author Stephen Abrams
 */
public class TtcnSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> keys1;
    private static final Map<IElementType, TextAttributesKey> keys2;

    @NotNull
    public Lexer getHighlightingLexer() {
        return new TtcnLexerAdapter();
    }


    public static final TextAttributesKey IMPORT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_IMPORT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey FROM = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_FROM.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RECURSIVE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_RECURSIVE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ALL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ALL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey EXCEPT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_EXCEPT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SYSTEM = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SYSTEM.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MODULE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MODULE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey FUNCTIOIN = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_FUNCTIOIN.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RUNS = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_RUNS.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ON = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ON.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CONST = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CONST.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PASS = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PASS.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey FAIL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_FAIL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey INCONC = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_INCONC.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NONE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NONE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ERROR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ERROR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CONTROL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CONTROL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey EXECUTE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_EXECUTE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ALTSTEP = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ALTSTEP.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TESTCASE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TESTCASE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PUBLIC = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PUBLIC.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey FRIEND = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_FRIEND.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PRIVATE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PRIVATE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ACTIVTE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ACTIVTE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey DEACTIVTE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_DEACTIVTE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ACTION = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ACTION.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey GETVERDICT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_GETVERDICT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SETVERDICT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SETVERDICT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey LANGUAGE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_LANGUAGE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MODIFIES = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MODIFIES.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey VALUE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_VALUE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SENDER = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SENDER.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MTC = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MTC.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RETURN = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_RETURN.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PROCEDURE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PROCEDURE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MIXED = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MIXED.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PATTERN = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PATTERN.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey COMPLEMENT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_COMPLEMENT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SUBSET = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SUBSET.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SUPERSET = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SUPERSET.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PERMUTATION = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PERMUTATION.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey IFPRESENT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_IFPRESENT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey INFINITY = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_INFINITY.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MATCH = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MATCH.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey VALUEOF = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_VALUEOF.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey DISCONNECT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_DISCONNECT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MAP = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MAP.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey UNMAP = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_UNMAP.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey START = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_START.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey GROUP = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_GROUP.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TYPE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TYPE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PORT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PORT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SIGNATURE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SIGNATURE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey EXTERNAL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_EXTERNAL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TEMPLATE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TEMPLATE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey VAR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_VAR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TIMER = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TIMER.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MODULEPAR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MODULEPAR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey LOG = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_LOG.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey IF = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_IF.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ELSE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ELSE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey WHILE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_WHILE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey DO = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_DO.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ALT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ALT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey FOR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_FOR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CASE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CASE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CONTINUE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CONTINUE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey BREAK = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_BREAK.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REPEAT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_REPEAT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey GOTO = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_GOTO.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey LABEL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_LABEL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey INTERLEAVE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_INTERLEAVE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey EXTENDS = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_EXTENDS.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TO = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TO.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REM = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_REM.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey INTEGER = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_INTEGER.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CHAR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CHAR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey UCHAR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_UCHAR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey FLOAT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_FLOAT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey BOOL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_BOOL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TRUE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TRUE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey FALSE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_FALSE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OBJID = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OBJID.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey VERDICTTYPE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_VERDICTTYPE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey BITSTRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_BITSTRING.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey HEXSTRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_HEXSTRING.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OCTETSTRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OCTETSTRING.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CHARSTRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CHARSTRING.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey UNIVERSAL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_UNIVERSAL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RECORD = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_RECORD.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OF = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OF.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SET = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SET.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ENUMERATED = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ENUMERATED.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey UNION = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_UNION.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ANYTYPE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ANYTYPE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ADDRESS = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ADDRESS.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey COMPONENT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_COMPONENT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey DEFAULT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_DEFAULT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OMIT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OMIT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OPTIONAL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OPTIONAL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey LENGTH = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_LENGTH.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SIZEOF = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SIZEOF.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NOT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NOT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey AND = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_AND.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey XOR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_XOR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OR4B = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OR4B.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey XOR4B = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_XOR4B.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey AND4B = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_AND4B.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NOT4B = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NOT4B.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey IN = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_IN.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OUT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OUT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey INOUT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_INOUT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MOD = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MOD.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NOWAIT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NOWAIT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ANY = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ANY.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CHECKSTATE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CHECKSTATE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MESSAGE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_MESSAGE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SEND = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SEND.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RECEIVE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_RECEIVE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TRIGGER = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TRIGGER.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CALL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CALL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey GETCALL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_GETCALL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REPLY = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_REPLY.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey GETREPLY = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_GETREPLY.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RAISE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_RAISE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SELECT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SELECT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey WITH = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_WITH.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NULL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NULL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CREATE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CREATE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ALIVE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ALIVE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CONNECTS = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CONNECTS.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RUNNING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_RUNNING.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey DONE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_DONE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey KILLED = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_KILLED.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey SELF = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_SELF.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PARAM = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PARAM.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey PRESENT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_PRESENT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey EXCEPTION = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_EXCEPTION.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NOBLOCK = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NOBLOCK.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey KILL = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_KILL.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CATCH = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CATCH.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CKECK = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CKECK.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey CLEAR = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_CLEAR.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey STOP = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_STOP.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey HALT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_HALT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey READ = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_READ.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey TIMEOUT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_TIMEOUT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NOT_A_NUM = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NOT_A_NUM.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ENCODE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ENCODE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey VARIANT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_VARIANT.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey DISPLAY = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_DISPLAY.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey EXTENSION = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_EXTENSION.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OVERRIDE = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OVERRIDE.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey AT_INDEX = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_AT_INDEX.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey AT_DETERMINISTIC = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_AT_DETERMINISTIC.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey AT_LAZY = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_AT_LAZY.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey AT_FUZZY = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_AT_FUZZY.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );


    public static final TextAttributesKey LINECOMMENT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_LINECOMMENT.toString(),
            DefaultLanguageHighlighterColors.LINE_COMMENT
    );
    public static final TextAttributesKey BLOCKCOMMENT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_BLOCKCOMMENT.toString(),
            DefaultLanguageHighlighterColors.BLOCK_COMMENT
    );
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_COMMENT.toString(),
            DefaultLanguageHighlighterColors.BLOCK_COMMENT
    );
    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NUMBER.toString(),
            DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey NON_ZERO_NUMBER = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NON_ZERO_NUMBER.toString(),
            DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey NUM = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_NUM.toString(),
            DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey ID = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_ID.toString(),
            DefaultLanguageHighlighterColors.IDENTIFIER
    );
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_STRING.toString(),
            DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey HEX = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_HEX.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey BIN = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_BIN.toString(),
            DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey BSTRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_BSTRING.toString(),
            DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey HSTRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_HSTRING.toString(),
            DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey OSTRING = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.TTCN_OSTRING.toString(),
            DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey FUNC_NAME_DEF = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.FUNCTION_NAME.toString(),
            DefaultLanguageHighlighterColors.FUNCTION_DECLARATION
    );
    public static final TextAttributesKey FUNC_NAME_DEF2 = TextAttributesKey.createTextAttributesKey(
            TtcnTypes.FUNCTION_REF.toString(),
            DefaultLanguageHighlighterColors.FUNCTION_DECLARATION
    );

    static {
        keys1 = new THashMap<IElementType, TextAttributesKey>();
        keys2 = new THashMap<IElementType, TextAttributesKey>();

        keys1.put(TtcnTypes.TTCN_IMPORT, IMPORT);
        keys1.put(TtcnTypes.TTCN_FROM, FROM);
        keys1.put(TtcnTypes.TTCN_RECURSIVE, RECURSIVE);
        keys1.put(TtcnTypes.TTCN_ALL, ALL);
        keys1.put(TtcnTypes.TTCN_EXCEPT, EXCEPT);
        keys1.put(TtcnTypes.TTCN_SYSTEM, SYSTEM);
        keys1.put(TtcnTypes.TTCN_MODULE, MODULE);
        keys1.put(TtcnTypes.TTCN_FUNCTIOIN, FUNCTIOIN);
        keys1.put(TtcnTypes.TTCN_RUNS, RUNS);
        keys1.put(TtcnTypes.TTCN_ON, ON);
        keys1.put(TtcnTypes.TTCN_CONST, CONST);
        keys1.put(TtcnTypes.TTCN_PASS, PASS);
        keys1.put(TtcnTypes.TTCN_FAIL, FAIL);
        keys1.put(TtcnTypes.TTCN_INCONC, INCONC);
        keys1.put(TtcnTypes.TTCN_NONE, NONE);
        keys1.put(TtcnTypes.TTCN_ERROR, ERROR);
        keys1.put(TtcnTypes.TTCN_CONTROL, CONTROL);
        keys1.put(TtcnTypes.TTCN_EXECUTE, EXECUTE);
        keys1.put(TtcnTypes.TTCN_ALTSTEP, ALTSTEP);
        keys1.put(TtcnTypes.TTCN_TESTCASE, TESTCASE);
        keys1.put(TtcnTypes.TTCN_PUBLIC, PUBLIC);
        keys1.put(TtcnTypes.TTCN_FRIEND, FRIEND);
        keys1.put(TtcnTypes.TTCN_PRIVATE, PRIVATE);
        keys1.put(TtcnTypes.TTCN_ACTIVTE, ACTIVTE);
        keys1.put(TtcnTypes.TTCN_DEACTIVTE, DEACTIVTE);
        keys1.put(TtcnTypes.TTCN_ACTION, ACTION);
        keys1.put(TtcnTypes.TTCN_GETVERDICT, GETVERDICT);
        keys1.put(TtcnTypes.TTCN_SETVERDICT, SETVERDICT);
        keys1.put(TtcnTypes.TTCN_LANGUAGE, LANGUAGE);
        keys1.put(TtcnTypes.TTCN_MODIFIES, MODIFIES);
        keys1.put(TtcnTypes.TTCN_VALUE, VALUE);
        keys1.put(TtcnTypes.TTCN_SENDER, SENDER);
        keys1.put(TtcnTypes.TTCN_MTC, MTC);
        keys1.put(TtcnTypes.TTCN_RETURN, RETURN);
        keys1.put(TtcnTypes.TTCN_PROCEDURE, PROCEDURE);
        keys1.put(TtcnTypes.TTCN_MIXED, MIXED);
        keys1.put(TtcnTypes.TTCN_PATTERN, PATTERN);
        keys1.put(TtcnTypes.TTCN_COMPLEMENT, COMPLEMENT);
        keys1.put(TtcnTypes.TTCN_SUBSET, SUBSET);
        keys1.put(TtcnTypes.TTCN_SUPERSET, SUPERSET);
        keys1.put(TtcnTypes.TTCN_PERMUTATION, PERMUTATION);
        keys1.put(TtcnTypes.TTCN_IFPRESENT, IFPRESENT);
        keys1.put(TtcnTypes.TTCN_INFINITY, INFINITY);
        keys1.put(TtcnTypes.TTCN_MATCH, MATCH);
        keys1.put(TtcnTypes.TTCN_VALUEOF, VALUEOF);
        keys1.put(TtcnTypes.TTCN_DISCONNECT, DISCONNECT);
        keys1.put(TtcnTypes.TTCN_MAP, MAP);
        keys1.put(TtcnTypes.TTCN_UNMAP, UNMAP);
        keys1.put(TtcnTypes.TTCN_START, START);
        keys1.put(TtcnTypes.TTCN_GROUP, GROUP);
        keys1.put(TtcnTypes.TTCN_TYPE, TYPE);
        keys1.put(TtcnTypes.TTCN_PORT, PORT);
        keys1.put(TtcnTypes.TTCN_COMPONENT, COMPONENT);
        keys1.put(TtcnTypes.TTCN_SIGNATURE, SIGNATURE);
        keys1.put(TtcnTypes.TTCN_EXTERNAL, EXTERNAL);
        keys1.put(TtcnTypes.TTCN_TEMPLATE, TEMPLATE);
        keys1.put(TtcnTypes.TTCN_VAR, VAR);
        keys1.put(TtcnTypes.TTCN_TIMER, TIMER);
        keys1.put(TtcnTypes.TTCN_MODULEPAR, MODULEPAR);
        keys1.put(TtcnTypes.TTCN_LOG, LOG);
        keys1.put(TtcnTypes.TTCN_IF, IF);
        keys1.put(TtcnTypes.TTCN_ELSE, ELSE);
        keys1.put(TtcnTypes.TTCN_WHILE, WHILE);
        keys1.put(TtcnTypes.TTCN_DO, DO);
        keys1.put(TtcnTypes.TTCN_ALT, ALT);
        keys1.put(TtcnTypes.TTCN_FOR, FOR);
        keys1.put(TtcnTypes.TTCN_CASE, CASE);
        keys1.put(TtcnTypes.TTCN_CONTINUE, CONTINUE);
        keys1.put(TtcnTypes.TTCN_BREAK, BREAK);
        keys1.put(TtcnTypes.TTCN_REPEAT, REPEAT);
        keys1.put(TtcnTypes.TTCN_GOTO, GOTO);
        keys1.put(TtcnTypes.TTCN_LABEL, LABEL);
        keys1.put(TtcnTypes.TTCN_INTERLEAVE, INTERLEAVE);
        keys1.put(TtcnTypes.TTCN_EXTENDS, EXTENDS);
        keys1.put(TtcnTypes.TTCN_TO, TO);
        keys1.put(TtcnTypes.TTCN_REM, REM);
        keys1.put(TtcnTypes.TTCN_INTEGER, INTEGER);
        keys1.put(TtcnTypes.TTCN_CHAR, CHAR);
        keys1.put(TtcnTypes.TTCN_UCHAR, UCHAR);
        keys1.put(TtcnTypes.TTCN_FLOAT, FLOAT);
        keys1.put(TtcnTypes.TTCN_BOOL, BOOL);
        keys1.put(TtcnTypes.TTCN_TRUE, TRUE);
        keys1.put(TtcnTypes.TTCN_FALSE, FALSE);
        keys1.put(TtcnTypes.TTCN_OBJID, OBJID);
        keys1.put(TtcnTypes.TTCN_VERDICTTYPE, VERDICTTYPE);
        keys1.put(TtcnTypes.TTCN_BITSTRING, BITSTRING);
        keys1.put(TtcnTypes.TTCN_HEXSTRING, HEXSTRING);
        keys1.put(TtcnTypes.TTCN_OCTETSTRING, OCTETSTRING);
        keys1.put(TtcnTypes.TTCN_CHARSTRING, CHARSTRING);
        keys1.put(TtcnTypes.TTCN_UNIVERSAL, UNIVERSAL);
        keys1.put(TtcnTypes.TTCN_RECORD, RECORD);
        keys1.put(TtcnTypes.TTCN_OF, OF);
        keys1.put(TtcnTypes.TTCN_SET, SET);
        keys1.put(TtcnTypes.TTCN_ENUMERATED, ENUMERATED);
        keys1.put(TtcnTypes.TTCN_UNION, UNION);
        keys1.put(TtcnTypes.TTCN_ANYTYPE, ANYTYPE);
        keys1.put(TtcnTypes.TTCN_ADDRESS, ADDRESS);
        keys1.put(TtcnTypes.TTCN_DEFAULT, DEFAULT);
        keys1.put(TtcnTypes.TTCN_OMIT, OMIT);
        keys1.put(TtcnTypes.TTCN_OPTIONAL, OPTIONAL);
        keys1.put(TtcnTypes.TTCN_LENGTH, LENGTH);
        keys1.put(TtcnTypes.TTCN_SIZEOF, SIZEOF);
        keys1.put(TtcnTypes.TTCN_NOT, NOT);
        keys1.put(TtcnTypes.TTCN_AND, AND);
        keys1.put(TtcnTypes.TTCN_XOR, XOR);
        keys1.put(TtcnTypes.TTCN_OR, OR);
        keys1.put(TtcnTypes.TTCN_OR4B, OR4B);
        keys1.put(TtcnTypes.TTCN_XOR4B, XOR4B);
        keys1.put(TtcnTypes.TTCN_AND4B, AND4B);
        keys1.put(TtcnTypes.TTCN_NOT4B, NOT4B);
        keys1.put(TtcnTypes.TTCN_IN, IN);
        keys1.put(TtcnTypes.TTCN_OUT, OUT);
        keys1.put(TtcnTypes.TTCN_INOUT, INOUT);
        keys1.put(TtcnTypes.TTCN_MOD, MOD);
        keys1.put(TtcnTypes.TTCN_NOWAIT, NOWAIT);
        keys1.put(TtcnTypes.TTCN_ANY, ANY);
        keys1.put(TtcnTypes.TTCN_CHECKSTATE, CHECKSTATE);
        keys1.put(TtcnTypes.TTCN_MESSAGE, MESSAGE);
        keys1.put(TtcnTypes.TTCN_SEND, SEND);
        keys1.put(TtcnTypes.TTCN_RECEIVE, RECEIVE);
        keys1.put(TtcnTypes.TTCN_TRIGGER, TRIGGER);
        keys1.put(TtcnTypes.TTCN_CALL, CALL);
        keys1.put(TtcnTypes.TTCN_GETCALL, GETCALL);
        keys1.put(TtcnTypes.TTCN_REPLY, REPLY);
        keys1.put(TtcnTypes.TTCN_GETREPLY, GETREPLY);
        keys1.put(TtcnTypes.TTCN_RAISE, RAISE);
        keys1.put(TtcnTypes.TTCN_SELECT, SELECT);
        keys1.put(TtcnTypes.TTCN_WITH, WITH);
        keys1.put(TtcnTypes.TTCN_NULL, NULL);
        keys1.put(TtcnTypes.TTCN_CREATE, CREATE);
        keys1.put(TtcnTypes.TTCN_ALIVE, ALIVE);
        keys1.put(TtcnTypes.TTCN_CONNECTS, CONNECTS);
        keys1.put(TtcnTypes.TTCN_RUNNING, RUNNING);
        keys1.put(TtcnTypes.TTCN_DONE, DONE);
        keys1.put(TtcnTypes.TTCN_KILLED, KILLED);
        keys1.put(TtcnTypes.TTCN_SELF, SELF);
        keys1.put(TtcnTypes.TTCN_PARAM, PARAM);
        keys1.put(TtcnTypes.TTCN_PRESENT, PRESENT);
        keys1.put(TtcnTypes.TTCN_EXCEPTION, EXCEPTION);
        keys1.put(TtcnTypes.TTCN_NOBLOCK, NOBLOCK);
        keys1.put(TtcnTypes.TTCN_KILL, KILL);
        keys1.put(TtcnTypes.TTCN_CATCH, CATCH);
        keys1.put(TtcnTypes.TTCN_CKECK, CKECK);
        keys1.put(TtcnTypes.TTCN_CLEAR, CLEAR);
        keys1.put(TtcnTypes.TTCN_STOP, STOP);
        keys1.put(TtcnTypes.TTCN_HALT, HALT);
        keys1.put(TtcnTypes.TTCN_READ, READ);
        keys1.put(TtcnTypes.TTCN_TIMEOUT, TIMEOUT);
        keys1.put(TtcnTypes.TTCN_NOT_A_NUM, NOT_A_NUM);
        keys1.put(TtcnTypes.TTCN_ENCODE, ENCODE);
        keys1.put(TtcnTypes.TTCN_VARIANT, VARIANT);
        keys1.put(TtcnTypes.TTCN_DISPLAY, DISPLAY);
        keys1.put(TtcnTypes.TTCN_EXTENSION, EXTENSION);
        keys1.put(TtcnTypes.TTCN_OVERRIDE, OVERRIDE);
        keys1.put(TtcnTypes.TTCN_AT_INDEX, AT_INDEX);
        keys1.put(TtcnTypes.TTCN_AT_DETERMINISTIC, AT_DETERMINISTIC);
        keys1.put(TtcnTypes.TTCN_AT_LAZY, AT_LAZY);
        keys1.put(TtcnTypes.TTCN_AT_FUZZY, AT_FUZZY);

        keys1.put(TtcnTypes.TTCN_LINECOMMENT, LINECOMMENT);
        keys1.put(TtcnTypes.TTCN_BLOCKCOMMENT, BLOCKCOMMENT);
        keys1.put(TtcnTypes.TTCN_COMMENT, COMMENT);
        keys1.put(TtcnTypes.TTCN_NUMBER, NUMBER);
        keys1.put(TtcnTypes.TTCN_NON_ZERO_NUMBER, NON_ZERO_NUMBER);
        keys1.put(TtcnTypes.TTCN_NUM, NUM);
        keys1.put(TtcnTypes.TTCN_STRING, STRING);
        keys1.put(TtcnTypes.TTCN_ID, ID);
        keys1.put(TtcnTypes.TTCN_HEX, HEX);
        keys1.put(TtcnTypes.TTCN_BIN, BIN);
        keys1.put(TtcnTypes.TTCN_BSTRING, BSTRING);
        keys1.put(TtcnTypes.TTCN_HSTRING, HSTRING);
        keys1.put(TtcnTypes.TTCN_OSTRING, OSTRING);

        keys1.put(TtcnTypes.FUNCTION_NAME, FUNC_NAME_DEF);
        keys1.put(TtcnTypes.FUNCTION_REF, FUNC_NAME_DEF2);


    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(keys1.get(tokenType), keys2.get(tokenType));
    }
}
