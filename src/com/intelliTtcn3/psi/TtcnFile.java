package com.intelliTtcn3.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intelliTtcn3.TtcnFileType;
import com.intelliTtcn3.TtcnLanguage;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import org.jetbrains.annotations.NotNull;
import com.intelliTtcn3.psi.ref.TtcnUtil;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class TtcnFile extends PsiFileBase {
    public Collection<VirtualFile> importFilePool;

    public TtcnFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TtcnLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TtcnFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Ttcn File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }


    public Collection<VirtualFile> getImportFileList(Project project)
    {
        importFilePool = TtcnUtil.collectImportFile(project, this);
        return importFilePool;
    }

}