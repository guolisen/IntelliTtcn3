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

public class TtcnStatementBlockImpl extends ASTWrapperPsiElement implements TtcnStatementBlock {

  public TtcnStatementBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitStatementBlock(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnConstDef> getConstDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnConstDef.class);
  }

  @Override
  @NotNull
  public List<TtcnFunctionStatement> getFunctionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnFunctionStatement.class);
  }

  @Override
  @NotNull
  public List<TtcnTemplateDef> getTemplateDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnTemplateDef.class);
  }

  @Override
  @NotNull
  public List<TtcnTimerInstance> getTimerInstanceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnTimerInstance.class);
  }

  @Override
  @NotNull
  public List<TtcnVarInstance> getVarInstanceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnVarInstance.class);
  }

  @Override
  @NotNull
  public List<TtcnWithStatement> getWithStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnWithStatement.class);
  }

}
