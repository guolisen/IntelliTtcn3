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

public class TtcnDecimalNumberImpl extends ASTWrapperPsiElement implements TtcnDecimalNumber {

  public TtcnDecimalNumberImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitDecimalNumber(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnNum> getNumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnNum.class);
  }

}
