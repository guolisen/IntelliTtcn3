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

public class TtcnAllRefImpl extends ASTWrapperPsiElement implements TtcnAllRef {

  public TtcnAllRefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitAllRef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnIdentifierList getIdentifierList() {
    return findChildByClass(TtcnIdentifierList.class);
  }

  @Override
  @Nullable
  public TtcnQualifiedIdentifierList getQualifiedIdentifierList() {
    return findChildByClass(TtcnQualifiedIdentifierList.class);
  }

}
