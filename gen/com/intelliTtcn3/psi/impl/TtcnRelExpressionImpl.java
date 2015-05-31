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

public class TtcnRelExpressionImpl extends ASTWrapperPsiElement implements TtcnRelExpression {

  public TtcnRelExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitRelExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnCompoundExpression getCompoundExpression() {
    return findChildByClass(TtcnCompoundExpression.class);
  }

  @Override
  @Nullable
  public TtcnRelOp getRelOp() {
    return findChildByClass(TtcnRelOp.class);
  }

  @Override
  @NotNull
  public List<TtcnShiftExpression> getShiftExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnShiftExpression.class);
  }

}
