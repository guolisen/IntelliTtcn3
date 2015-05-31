// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intelliTtcn3.psi.TtcnTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intelliTtcn3.psi.*;

public class TtcnTestcaseOperationImpl extends ASTWrapperPsiElement implements TtcnTestcaseOperation {

  public TtcnTestcaseOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitTestcaseOperation(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnFreeText> getFreeTextList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnFreeText.class);
  }

  @Override
  @NotNull
  public List<TtcnInLineTemplate> getInLineTemplateList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnInLineTemplate.class);
  }

}
