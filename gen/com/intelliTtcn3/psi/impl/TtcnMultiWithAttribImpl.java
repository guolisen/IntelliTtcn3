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

public class TtcnMultiWithAttribImpl extends ASTWrapperPsiElement implements TtcnMultiWithAttrib {

  public TtcnMultiWithAttribImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitMultiWithAttrib(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnSingleWithAttrib> getSingleWithAttribList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnSingleWithAttrib.class);
  }

}
