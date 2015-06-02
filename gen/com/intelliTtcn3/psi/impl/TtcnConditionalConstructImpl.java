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

public class TtcnConditionalConstructImpl extends ASTWrapperPsiElement implements TtcnConditionalConstruct {

  public TtcnConditionalConstructImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitConditionalConstruct(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnElseClause getElseClause() {
    return findChildByClass(TtcnElseClause.class);
  }

  @Override
  @NotNull
  public List<TtcnElseIfClause> getElseIfClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnElseIfClause.class);
  }

  @Override
  @NotNull
  public TtcnSingleExpression getSingleExpression() {
    return findNotNullChildByClass(TtcnSingleExpression.class);
  }

  @Override
  @NotNull
  public TtcnStatementBlock getStatementBlock() {
    return findNotNullChildByClass(TtcnStatementBlock.class);
  }

}
