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

public class TtcnFunctionStatementImpl extends ASTWrapperPsiElement implements TtcnFunctionStatement {

  public TtcnFunctionStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitFunctionStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnBasicStatements getBasicStatements() {
    return findChildByClass(TtcnBasicStatements.class);
  }

  @Override
  @Nullable
  public TtcnBehaviourStatements getBehaviourStatements() {
    return findChildByClass(TtcnBehaviourStatements.class);
  }

  @Override
  @Nullable
  public TtcnCommunicationStatements getCommunicationStatements() {
    return findChildByClass(TtcnCommunicationStatements.class);
  }

  @Override
  @Nullable
  public TtcnConfigurationStatements getConfigurationStatements() {
    return findChildByClass(TtcnConfigurationStatements.class);
  }

  @Override
  @Nullable
  public TtcnSUTStatements getSUTStatements() {
    return findChildByClass(TtcnSUTStatements.class);
  }

  @Override
  @Nullable
  public TtcnSetLocalVerdict getSetLocalVerdict() {
    return findChildByClass(TtcnSetLocalVerdict.class);
  }

  @Override
  @Nullable
  public TtcnTestcaseOperation getTestcaseOperation() {
    return findChildByClass(TtcnTestcaseOperation.class);
  }

  @Override
  @Nullable
  public TtcnTimerStatements getTimerStatements() {
    return findChildByClass(TtcnTimerStatements.class);
  }

}
