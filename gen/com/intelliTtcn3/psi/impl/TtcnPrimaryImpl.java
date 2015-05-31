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

public class TtcnPrimaryImpl extends ASTWrapperPsiElement implements TtcnPrimary {

  public TtcnPrimaryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitPrimary(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnOpCall getOpCall() {
    return findChildByClass(TtcnOpCall.class);
  }

  @Override
  @Nullable
  public TtcnSingleExpression getSingleExpression() {
    return findChildByClass(TtcnSingleExpression.class);
  }

  @Override
  @Nullable
  public TtcnValue getValue() {
    return findChildByClass(TtcnValue.class);
  }

}
