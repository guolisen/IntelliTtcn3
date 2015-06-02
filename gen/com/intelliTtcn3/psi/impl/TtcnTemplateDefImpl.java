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

public class TtcnTemplateDefImpl extends ASTWrapperPsiElement implements TtcnTemplateDef {

  public TtcnTemplateDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitTemplateDef(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TtcnBaseTemplate getBaseTemplate() {
    return findNotNullChildByClass(TtcnBaseTemplate.class);
  }

  @Override
  @Nullable
  public TtcnDerivedDef getDerivedDef() {
    return findChildByClass(TtcnDerivedDef.class);
  }

  @Override
  @NotNull
  public TtcnTemplateBody getTemplateBody() {
    return findNotNullChildByClass(TtcnTemplateBody.class);
  }

}
