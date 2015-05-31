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

public class TtcnNestedSetOfDefImpl extends ASTWrapperPsiElement implements TtcnNestedSetOfDef {

  public TtcnNestedSetOfDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitNestedSetOfDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnNestedTypeDef getNestedTypeDef() {
    return findChildByClass(TtcnNestedTypeDef.class);
  }

  @Override
  @Nullable
  public TtcnStringLength getStringLength() {
    return findChildByClass(TtcnStringLength.class);
  }

  @Override
  @Nullable
  public TtcnType getType() {
    return findChildByClass(TtcnType.class);
  }

}
