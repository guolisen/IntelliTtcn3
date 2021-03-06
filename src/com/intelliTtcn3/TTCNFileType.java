package com.intelliTtcn3;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by qq on 2015/5/15.
 */
public class TtcnFileType extends LanguageFileType {
    public static final Icon TTCN_ICON = IconLoader.findIcon("/robot_icon.png");
    public static final TtcnFileType INSTANCE = new TtcnFileType();

    public static TtcnFileType getInstance() {
        return INSTANCE;
    }

    private TtcnFileType() {
        super(TtcnLanguage.INSTANCE);
    }

    @NotNull
    public String getName() {
        return "ttcn3 Feature";
    }

    @NotNull
    public String getDescription() {
        return "ttcn3 Feature Files";
    }

    @NotNull
    public String getDefaultExtension() {
        return "ttcn3";
    }

    @Nullable
    public Icon getIcon() {
        return TTCN_ICON;
    }
}
