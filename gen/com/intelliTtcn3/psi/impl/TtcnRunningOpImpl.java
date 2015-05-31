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

public class TtcnRunningOpImpl extends ASTWrapperPsiElement implements TtcnRunningOp {

  public TtcnRunningOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitRunningOp(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TtcnComponentOrAny getComponentOrAny() {
    return findNotNullChildByClass(TtcnComponentOrAny.class);
  }

  @Override
  @Nullable
  public TtcnIndexAssignment getIndexAssignment() {
    return findChildByClass(TtcnIndexAssignment.class);
  }

}
