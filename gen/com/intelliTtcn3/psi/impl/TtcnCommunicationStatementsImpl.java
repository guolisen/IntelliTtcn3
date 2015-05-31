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

public class TtcnCommunicationStatementsImpl extends ASTWrapperPsiElement implements TtcnCommunicationStatements {

  public TtcnCommunicationStatementsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitCommunicationStatements(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnCallStatement getCallStatement() {
    return findChildByClass(TtcnCallStatement.class);
  }

  @Override
  @Nullable
  public TtcnCatchStatement getCatchStatement() {
    return findChildByClass(TtcnCatchStatement.class);
  }

  @Override
  @Nullable
  public TtcnCheckStateStatement getCheckStateStatement() {
    return findChildByClass(TtcnCheckStateStatement.class);
  }

  @Override
  @Nullable
  public TtcnCheckStatement getCheckStatement() {
    return findChildByClass(TtcnCheckStatement.class);
  }

  @Override
  @Nullable
  public TtcnClearStatement getClearStatement() {
    return findChildByClass(TtcnClearStatement.class);
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
  public TtcnHaltStatement getHaltStatement() {
    return findChildByClass(TtcnHaltStatement.class);
  }

  @Override
  @Nullable
  public TtcnRaiseStatement getRaiseStatement() {
    return findChildByClass(TtcnRaiseStatement.class);
  }

  @Override
  @Nullable
  public TtcnReceiveStatement getReceiveStatement() {
    return findChildByClass(TtcnReceiveStatement.class);
  }

  @Override
  @Nullable
  public TtcnReplyStatement getReplyStatement() {
    return findChildByClass(TtcnReplyStatement.class);
  }

  @Override
  @Nullable
  public TtcnSendStatement getSendStatement() {
    return findChildByClass(TtcnSendStatement.class);
  }

  @Override
  @Nullable
  public TtcnStartStatement getStartStatement() {
    return findChildByClass(TtcnStartStatement.class);
  }

  @Override
  @Nullable
  public TtcnStopStatement getStopStatement() {
    return findChildByClass(TtcnStopStatement.class);
  }

  @Override
  @Nullable
  public TtcnTriggerStatement getTriggerStatement() {
    return findChildByClass(TtcnTriggerStatement.class);
  }

}
