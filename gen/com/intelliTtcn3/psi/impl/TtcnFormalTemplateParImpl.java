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

public class TtcnFormalTemplateParImpl extends ASTWrapperPsiElement implements TtcnFormalTemplatePar {

  public TtcnFormalTemplateParImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitFormalTemplatePar(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TtcnIdentifier getIdentifier() {
    return findNotNullChildByClass(TtcnIdentifier.class);
  }

  @Override
  @Nullable
  public TtcnInLineTemplate getInLineTemplate() {
    return findChildByClass(TtcnInLineTemplate.class);
  }

  @Override
  @Nullable
  public TtcnInOutParKeyword getInOutParKeyword() {
    return findChildByClass(TtcnInOutParKeyword.class);
  }

  @Override
  @Nullable
  public TtcnInParKeyword getInParKeyword() {
    return findChildByClass(TtcnInParKeyword.class);
  }

  @Override
  @Nullable
  public TtcnOutParKeyword getOutParKeyword() {
    return findChildByClass(TtcnOutParKeyword.class);
  }

  @Override
  @Nullable
  public TtcnRestrictedTemplate getRestrictedTemplate() {
    return findChildByClass(TtcnRestrictedTemplate.class);
  }

  @Override
  @NotNull
  public TtcnType getType() {
    return findNotNullChildByClass(TtcnType.class);
  }

}
