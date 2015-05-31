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

public class TtcnFloatENotationImpl extends ASTWrapperPsiElement implements TtcnFloatENotation {

  public TtcnFloatENotationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitFloatENotation(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnDecimalNumber getDecimalNumber() {
    return findChildByClass(TtcnDecimalNumber.class);
  }

  @Override
  @NotNull
  public TtcnExponential getExponential() {
    return findNotNullChildByClass(TtcnExponential.class);
  }

  @Override
  @NotNull
  public List<TtcnNumber> getNumberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnNumber.class);
  }

}
