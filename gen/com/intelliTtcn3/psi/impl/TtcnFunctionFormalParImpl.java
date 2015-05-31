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

public class TtcnFunctionFormalParImpl extends ASTWrapperPsiElement implements TtcnFunctionFormalPar {

  public TtcnFunctionFormalParImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitFunctionFormalPar(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnFormalPortPar getFormalPortPar() {
    return findChildByClass(TtcnFormalPortPar.class);
  }

  @Override
  @Nullable
  public TtcnFormalTemplatePar getFormalTemplatePar() {
    return findChildByClass(TtcnFormalTemplatePar.class);
  }

  @Override
  @Nullable
  public TtcnFormalTimerPar getFormalTimerPar() {
    return findChildByClass(TtcnFormalTimerPar.class);
  }

  @Override
  @Nullable
  public TtcnFormalValuePar getFormalValuePar() {
    return findChildByClass(TtcnFormalValuePar.class);
  }

}
