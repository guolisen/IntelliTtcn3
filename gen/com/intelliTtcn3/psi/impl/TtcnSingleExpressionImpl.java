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

public class TtcnSingleExpressionImpl extends ASTWrapperPsiElement implements TtcnSingleExpression {

  public TtcnSingleExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitSingleExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnAddOp> getAddOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnAddOp.class);
  }

  @Override
  @NotNull
  public List<TtcnCompoundExpression> getCompoundExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnCompoundExpression.class);
  }

  @Override
  @NotNull
  public List<TtcnEqualOp> getEqualOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnEqualOp.class);
  }

  @Override
  @NotNull
  public List<TtcnMultiplyOp> getMultiplyOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnMultiplyOp.class);
  }

  @Override
  @NotNull
  public List<TtcnPrimary> getPrimaryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnPrimary.class);
  }

  @Override
  @NotNull
  public List<TtcnRelOp> getRelOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnRelOp.class);
  }

  @Override
  @NotNull
  public List<TtcnShiftOp> getShiftOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnShiftOp.class);
  }

  @Override
  @NotNull
  public List<TtcnUnaryOp> getUnaryOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnUnaryOp.class);
  }

}
