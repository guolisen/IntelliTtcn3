package com.intelliTtcn3;

/**
 * Created by qq on 2015/5/15.
 */
public class TtcnLanguage extends com.intellij.lang.Language {
    public static final TtcnLanguage INSTANCE = new TtcnLanguage();

    private TtcnLanguage() {
        super("Ttcn3", "");
    }

    @Override
    public String getDisplayName() {
        return "Ttcn3";
    }
}
