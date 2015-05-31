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

public class TtcnGuardOpImpl extends ASTWrapperPsiElement implements TtcnGuardOp {

  public TtcnGuardOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitGuardOp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnCatchStatement getCatchStatement() {
    return findChildByClass(TtcnCatchStatement.class);
  }

  @Override
  @Nullable
  public TtcnCheckStatement getCheckStatement() {
    return findChildByClass(TtcnCheckStatement.class);
  }

  @Override
  @Nullable
  public TtcnDoneStatement getDoneStatement() {
    return findChildByClass(TtcnDoneStatement.class);
  }

  @Override
  @Nullable
  public TtcnGetCallStatement getGetCallStatement() {
    return findChildByClass(TtcnGetCallStatement.class);
  }

  @Override
  @Nullable
  public TtcnGetReplyStatement getGetReplyStatement() {
    return findChildByClass(TtcnGetReplyStatement.class);
  }

  @Override
  @Nullable
  public TtcnKilledStatement getKilledStatement() {
    return findChildByClass(TtcnKilledStatement.class);
  }

  @Override
  @Nullable
  public TtcnReceiveStatement getReceiveStatement() {
    return findChildByClass(TtcnReceiveStatement.class);
  }

  @Override
  @Nullable
  public TtcnTimeoutStatement getTimeoutStatement() {
    return findChildByClass(TtcnTimeoutStatement.class);
  }

  @Override
  @Nullable
  public TtcnTriggerStatement getTriggerStatement() {
    return findChildByClass(TtcnTriggerStatement.class);
  }

}
