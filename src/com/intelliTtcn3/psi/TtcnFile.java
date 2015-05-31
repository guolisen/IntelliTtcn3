package com.intelliTtcn3.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intelliTtcn3.TTCNFileType;
import com.intelliTtcn3.TtcnLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class TtcnFile extends PsiFileBase {
    public TtcnFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TtcnLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TTCNFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}