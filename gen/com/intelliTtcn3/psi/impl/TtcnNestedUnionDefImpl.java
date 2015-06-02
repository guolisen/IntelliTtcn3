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

public class TtcnNestedUnionDefImpl extends ASTWrapperPsiElement implements TtcnNestedUnionDef {

  public TtcnNestedUnionDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitNestedUnionDef(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnArrayDef> getArrayDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnArrayDef.class);
  }

  @Override
  @NotNull
  public List<TtcnNestedTypeDef> getNestedTypeDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnNestedTypeDef.class);
  }

  @Override
  @NotNull
  public List<TtcnSubTypeSpec> getSubTypeSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnSubTypeSpec.class);
  }

  @Override
  @NotNull
  public List<TtcnType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnType.class);
  }

}
