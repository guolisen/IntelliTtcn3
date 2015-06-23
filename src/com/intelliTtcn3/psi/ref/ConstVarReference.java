package com.intelliTtcn3.psi.ref;


import com.intelliTtcn3.psi.TtcnConstVarName;
import com.intelliTtcn3.psi.TtcnTemplateName;
import com.intelliTtcn3.psi.TtcnFile;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiFile;
import com.intellij.psi.ResolveResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq on 2015/6/23.
 */
public class ConstVarReference extends MyPsiPolyVariantReference {
    ConstVarReference(PsiElement _element) {
        this(_element, null);
    }

    ConstVarReference(PsiElement _element, TextRange _range) {
        super(_element, _range);
    }

    public ResolveResult[] resolveInner() {
        Project project = myElement.getProject();
        PsiFile elementFile =  myElement.getContainingFile();
        TtcnFile ttcnFile = (TtcnFile)elementFile;
        List<ResolveResult> results = new ArrayList<ResolveResult>();

        final List<TtcnConstVarName> properties = TtcnUtil.findElementInLocalFile(
                project, ttcnFile, psiElement.getText(), TtcnConstVarName.class);
        for (TtcnConstVarName property : properties) {
            results.add(new PsiElementResolveResult(property));
        }

        final List<TtcnTemplateName> templateElements = TtcnUtil.findElementInLocalFile(
                project, ttcnFile, psiElement.getText(), TtcnTemplateName.class);
        for (TtcnTemplateName templateName : templateElements) {
            results.add(new PsiElementResolveResult(templateName));
        }

        return results.toArray(new ResolveResult[results.size()]);
    }
}
