package com.intelliTtcn3;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.intelliTtcn3.parser.TtcnParser;
import com.intelliTtcn3.psi.TtcnFile;
import com.intelliTtcn3.psi.TtcnTypes;
import com.intelliTtcn3.TtcnLanguage;
import com.intelliTtcn3.TtcnLexerAdapter;
import org.jetbrains.annotations.NotNull;

public class TtcnParserDefinition implements ParserDefinition{
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(TtcnTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(Language.<TtcnLanguage>findInstance(TtcnLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new TtcnLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new TtcnParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new TtcnFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return TtcnTypes.Factory.createElement(node);
    }
}