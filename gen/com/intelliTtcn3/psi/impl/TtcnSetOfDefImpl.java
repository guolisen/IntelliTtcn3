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

public class TtcnSetOfDefImpl extends ASTWrapperPsiElement implements TtcnSetOfDef {

  public TtcnSetOfDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitSetOfDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnBound getBound() {
    return findChildByClass(TtcnBound.class);
  }

  @Override
  @Nullable
  public TtcnNestedTypeDef getNestedTypeDef() {
    return findChildByClass(TtcnNestedTypeDef.class);
  }

  @Override
  @Nullable
  public TtcnSingleExpression getSingleExpression() {
    return findChildByClass(TtcnSingleExpression.class);
  }

  @Override
  @Nullable
  public TtcnSubTypeSpec getSubTypeSpec() {
    return findChildByClass(TtcnSubTypeSpec.class);
  }

  @Override
  @Nullable
  public TtcnType getType() {
    return findChildByClass(TtcnType.class);
  }

  @Override
  @Nullable
  public PsiElement getTtcnId() {
    return findChildByType(TTCN_ID);
  }

}
