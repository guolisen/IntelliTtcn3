package com.intelliTtcn3.psi.ref;

import com.intelliTtcn3.psi.TtcnFile;
import com.intelliTtcn3.psi.TtcnModuleName;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by qq on 2015/6/23.
 */
public class ModuleReference extends MyPsiPolyVariantReference {
    ModuleReference(PsiElement _element) {
        this(_element, null);
    }

    ModuleReference(PsiElement _element, TextRange _range) {
        super(_element, _range);
    }

    public ResolveResult[] resolveInner() {
        Collection<TtcnModuleName> searchResult = null;
        Project project = myElement.getProject();

        String nameStr = myElement.getText();
        String nameStrWithOutSp = nameStr.substring(0, nameStr.length() - 1);

        PsiFile file = myElement.getContainingFile();
        TtcnFile ttcnFile = (TtcnFile)file;
        Collection<VirtualFile> virtualFiles = ttcnFile.getImportFileList(project);
        if (virtualFiles == null)
            return ResolveResult.EMPTY_ARRAY;

        for (VirtualFile virtualFile : virtualFiles) {
            String fileName = virtualFile.getName();
            String fileNameWithOutExt = fileName.substring(0, fileName.length() - 6);
            if (!fileNameWithOutExt.equals(nameStrWithOutSp))
            {
                continue;
            }

            TtcnFile ttcnImportFile = (TtcnFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (ttcnImportFile != null) {
                TtcnModuleName[] properties = PsiTreeUtil.getChildrenOfType(ttcnImportFile, TtcnModuleName.class);
                if (properties == null)
                    return ResolveResult.EMPTY_ARRAY;
                for (TtcnModuleName property : properties) {
                    String ttt = property.getText();
                    if (fileNameWithOutExt.equals(ttt.substring(0, ttt.length() - 1))) {
                        if (searchResult == null) {
                            searchResult = new ArrayList<TtcnModuleName>();
                        }
                        searchResult.add(property);
                    }
                }
            }
        }

        if (searchResult == null)
            return ResolveResult.EMPTY_ARRAY;

        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (TtcnModuleName property : searchResult) {
            results.add(new PsiElementResolveResult(property));
        }

        return results.toArray(new ResolveResult[results.size()]);
    }
}
