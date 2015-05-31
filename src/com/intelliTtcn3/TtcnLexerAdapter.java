package com.intelliTtcn3;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class TtcnLexerAdapter extends FlexAdapter {
    public TtcnLexerAdapter() {
        super(new Scanner((Reader) null));
    }
}
