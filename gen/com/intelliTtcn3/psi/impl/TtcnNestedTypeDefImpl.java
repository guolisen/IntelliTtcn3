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

public class TtcnNestedTypeDefImpl extends ASTWrapperPsiElement implements TtcnNestedTypeDef {

  public TtcnNestedTypeDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitNestedTypeDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnNestedEnumDef getNestedEnumDef() {
    return findChildByClass(TtcnNestedEnumDef.class);
  }

  @Override
  @Nullable
  public TtcnNestedRecordDef getNestedRecordDef() {
    return findChildByClass(TtcnNestedRecordDef.class);
  }

  @Override
  @Nullable
  public TtcnNestedRecordOfDef getNestedRecordOfDef() {
    return findChildByClass(TtcnNestedRecordOfDef.class);
  }

  @Override
  @Nullable
  public TtcnNestedSetDef getNestedSetDef() {
    return findChildByClass(TtcnNestedSetDef.class);
  }

  @Override
  @Nullable
  public TtcnNestedSetOfDef getNestedSetOfDef() {
    return findChildByClass(TtcnNestedSetOfDef.class);
  }

  @Override
  @Nullable
  public TtcnNestedUnionDef getNestedUnionDef() {
    return findChildByClass(TtcnNestedUnionDef.class);
  }

}
