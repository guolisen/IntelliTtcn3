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

public class TtcnValueSpecImpl extends ASTWrapperPsiElement implements TtcnValueSpec {

  public TtcnValueSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitValueSpec(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnSingleValueSpec> getSingleValueSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnSingleValueSpec.class);
  }

  @Override
  @Nullable
  public TtcnVariableRef getVariableRef() {
    return findChildByClass(TtcnVariableRef.class);
  }

}
