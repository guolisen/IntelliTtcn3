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

public class TtcnModuleParDefImpl extends ASTWrapperPsiElement implements TtcnModuleParDef {

  public TtcnModuleParDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitModuleParDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnModulePar getModulePar() {
    return findChildByClass(TtcnModulePar.class);
  }

  @Override
  @NotNull
  public List<TtcnMultitypedModuleParList> getMultitypedModuleParListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnMultitypedModuleParList.class);
  }

}
