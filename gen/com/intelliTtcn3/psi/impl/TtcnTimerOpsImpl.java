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

public class TtcnTimerOpsImpl extends ASTWrapperPsiElement implements TtcnTimerOps {

  public TtcnTimerOpsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitTimerOps(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnReadTimerOp getReadTimerOp() {
    return findChildByClass(TtcnReadTimerOp.class);
  }

  @Override
  @Nullable
  public TtcnRunningTimerOp getRunningTimerOp() {
    return findChildByClass(TtcnRunningTimerOp.class);
  }

}
