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

public class TtcnFunctionDefImpl extends ASTWrapperPsiElement implements TtcnFunctionDef {

  public TtcnFunctionDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitFunctionDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnFunctionFormalParList getFunctionFormalParList() {
    return findChildByClass(TtcnFunctionFormalParList.class);
  }

  @Override
  @NotNull
  public TtcnIdentifier getIdentifier() {
    return findNotNullChildByClass(TtcnIdentifier.class);
  }

  @Override
  @Nullable
  public TtcnMtcSpec getMtcSpec() {
    return findChildByClass(TtcnMtcSpec.class);
  }

  @Override
  @Nullable
  public TtcnReturnType getReturnType() {
    return findChildByClass(TtcnReturnType.class);
  }

  @Override
  @Nullable
  public TtcnRunsOnSpec getRunsOnSpec() {
    return findChildByClass(TtcnRunsOnSpec.class);
  }

  @Override
  @NotNull
  public TtcnStatementBlock getStatementBlock() {
    return findNotNullChildByClass(TtcnStatementBlock.class);
  }

  @Override
  @Nullable
  public TtcnSystemSpec getSystemSpec() {
    return findChildByClass(TtcnSystemSpec.class);
  }

}
