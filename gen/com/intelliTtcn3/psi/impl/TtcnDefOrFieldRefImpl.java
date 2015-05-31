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

public class TtcnDefOrFieldRefImpl extends ASTWrapperPsiElement implements TtcnDefOrFieldRef {

  public TtcnDefOrFieldRefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitDefOrFieldRef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnAllRef getAllRef() {
    return findChildByClass(TtcnAllRef.class);
  }

  @Override
  @Nullable
  public TtcnExtendedFieldReference getExtendedFieldReference() {
    return findChildByClass(TtcnExtendedFieldReference.class);
  }

  @Override
  @Nullable
  public TtcnFieldReference getFieldReference() {
    return findChildByClass(TtcnFieldReference.class);
  }

  @Override
  @Nullable
  public TtcnQualifiedIdentifier getQualifiedIdentifier() {
    return findChildByClass(TtcnQualifiedIdentifier.class);
  }

}
