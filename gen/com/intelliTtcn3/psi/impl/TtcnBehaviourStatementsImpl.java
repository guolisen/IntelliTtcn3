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

public class TtcnBehaviourStatementsImpl extends ASTWrapperPsiElement implements TtcnBehaviourStatements {

  public TtcnBehaviourStatementsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitBehaviourStatements(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnActivateOp getActivateOp() {
    return findChildByClass(TtcnActivateOp.class);
  }

  @Override
  @Nullable
  public TtcnAltConstruct getAltConstruct() {
    return findChildByClass(TtcnAltConstruct.class);
  }

  @Override
  @Nullable
  public TtcnAltstepInstance getAltstepInstance() {
    return findChildByClass(TtcnAltstepInstance.class);
  }

  @Override
  @Nullable
  public TtcnDeactivateStatement getDeactivateStatement() {
    return findChildByClass(TtcnDeactivateStatement.class);
  }

  @Override
  @Nullable
  public TtcnFunctionInstance getFunctionInstance() {
    return findChildByClass(TtcnFunctionInstance.class);
  }

  @Override
  @Nullable
  public TtcnGotoStatement getGotoStatement() {
    return findChildByClass(TtcnGotoStatement.class);
  }

  @Override
  @Nullable
  public TtcnInterleavedConstruct getInterleavedConstruct() {
    return findChildByClass(TtcnInterleavedConstruct.class);
  }

  @Override
  @Nullable
  public TtcnLabelStatement getLabelStatement() {
    return findChildByClass(TtcnLabelStatement.class);
  }

  @Override
  @Nullable
  public TtcnReturnStatement getReturnStatement() {
    return findChildByClass(TtcnReturnStatement.class);
  }

  @Override
  @Nullable
  public TtcnTestcaseInstance getTestcaseInstance() {
    return findChildByClass(TtcnTestcaseInstance.class);
  }

}
