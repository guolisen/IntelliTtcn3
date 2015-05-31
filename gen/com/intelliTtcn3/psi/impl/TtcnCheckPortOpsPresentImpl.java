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

public class TtcnCheckPortOpsPresentImpl extends ASTWrapperPsiElement implements TtcnCheckPortOpsPresent {

  public TtcnCheckPortOpsPresentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitCheckPortOpsPresent(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnPortCatchOp getPortCatchOp() {
    return findChildByClass(TtcnPortCatchOp.class);
  }

  @Override
  @Nullable
  public TtcnPortGetCallOp getPortGetCallOp() {
    return findChildByClass(TtcnPortGetCallOp.class);
  }

  @Override
  @Nullable
  public TtcnPortGetReplyOp getPortGetReplyOp() {
    return findChildByClass(TtcnPortGetReplyOp.class);
  }

  @Override
  @Nullable
  public TtcnPortReceiveOp getPortReceiveOp() {
    return findChildByClass(TtcnPortReceiveOp.class);
  }

}
