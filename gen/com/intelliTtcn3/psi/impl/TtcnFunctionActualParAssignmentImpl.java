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

public class TtcnFunctionActualParAssignmentImpl extends ASTWrapperPsiElement implements TtcnFunctionActualParAssignment {

  public TtcnFunctionActualParAssignmentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitFunctionActualParAssignment(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnArrayIdentifierRefAssignment getArrayIdentifierRefAssignment() {
    return findChildByClass(TtcnArrayIdentifierRefAssignment.class);
  }

  @Override
  @Nullable
  public TtcnComponentRefAssignment getComponentRefAssignment() {
    return findChildByClass(TtcnComponentRefAssignment.class);
  }

  @Override
  @Nullable
  public TtcnTemplateInstanceAssignment getTemplateInstanceAssignment() {
    return findChildByClass(TtcnTemplateInstanceAssignment.class);
  }

}
