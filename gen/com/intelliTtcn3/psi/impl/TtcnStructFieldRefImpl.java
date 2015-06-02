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

public class TtcnStructFieldRefImpl extends ASTWrapperPsiElement implements TtcnStructFieldRef {

  public TtcnStructFieldRefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitStructFieldRef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnTypeReference getTypeReference() {
    return findChildByClass(TtcnTypeReference.class);
  }

  @Override
  @Nullable
  public PsiElement getTtcnId() {
    return findChildByType(TTCN_ID);
  }

}
