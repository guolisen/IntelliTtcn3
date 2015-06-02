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

public class TtcnAltstepDefImpl extends ASTWrapperPsiElement implements TtcnAltstepDef {

  public TtcnAltstepDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitAltstepDef(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnAltGuardList> getAltGuardListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnAltGuardList.class);
  }

  @Override
  @NotNull
  public List<TtcnAltstepLocalDefList> getAltstepLocalDefListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnAltstepLocalDefList.class);
  }

  @Override
  @Nullable
  public TtcnFunctionFormalParList getFunctionFormalParList() {
    return findChildByClass(TtcnFunctionFormalParList.class);
  }

  @Override
  @Nullable
  public TtcnMtcSpec getMtcSpec() {
    return findChildByClass(TtcnMtcSpec.class);
  }

  @Override
  @Nullable
  public TtcnRunsOnSpec getRunsOnSpec() {
    return findChildByClass(TtcnRunsOnSpec.class);
  }

  @Override
  @Nullable
  public TtcnSystemSpec getSystemSpec() {
    return findChildByClass(TtcnSystemSpec.class);
  }

  @Override
  @NotNull
  public PsiElement getTtcnId() {
    return findNotNullChildByType(TTCN_ID);
  }

}
