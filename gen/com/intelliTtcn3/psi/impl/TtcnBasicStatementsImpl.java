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

public class TtcnBasicStatementsImpl extends ASTWrapperPsiElement implements TtcnBasicStatements {

  public TtcnBasicStatementsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitBasicStatements(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnAssignment getAssignment() {
    return findChildByClass(TtcnAssignment.class);
  }

  @Override
  @Nullable
  public TtcnConditionalConstruct getConditionalConstruct() {
    return findChildByClass(TtcnConditionalConstruct.class);
  }

  @Override
  @Nullable
  public TtcnLogStatement getLogStatement() {
    return findChildByClass(TtcnLogStatement.class);
  }

  @Override
  @Nullable
  public TtcnLoopConstruct getLoopConstruct() {
    return findChildByClass(TtcnLoopConstruct.class);
  }

  @Override
  @Nullable
  public TtcnSelectCaseConstruct getSelectCaseConstruct() {
    return findChildByClass(TtcnSelectCaseConstruct.class);
  }

  @Override
  @Nullable
  public TtcnStatementBlock getStatementBlock() {
    return findChildByClass(TtcnStatementBlock.class);
  }

}
