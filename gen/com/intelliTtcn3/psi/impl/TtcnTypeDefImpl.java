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

public class TtcnTypeDefImpl extends ASTWrapperPsiElement implements TtcnTypeDef {

  public TtcnTypeDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitTypeDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnArrayDef getArrayDef() {
    return findChildByClass(TtcnArrayDef.class);
  }

  @Override
  @Nullable
  public TtcnComponentDef getComponentDef() {
    return findChildByClass(TtcnComponentDef.class);
  }

  @Override
  @Nullable
  public TtcnEnumDef getEnumDef() {
    return findChildByClass(TtcnEnumDef.class);
  }

  @Override
  @Nullable
  public TtcnPortDef getPortDef() {
    return findChildByClass(TtcnPortDef.class);
  }

  @Override
  @Nullable
  public TtcnRecordDef getRecordDef() {
    return findChildByClass(TtcnRecordDef.class);
  }

  @Override
  @Nullable
  public TtcnRecordOfDef getRecordOfDef() {
    return findChildByClass(TtcnRecordOfDef.class);
  }

  @Override
  @Nullable
  public TtcnSetDef getSetDef() {
    return findChildByClass(TtcnSetDef.class);
  }

  @Override
  @Nullable
  public TtcnSetOfDef getSetOfDef() {
    return findChildByClass(TtcnSetOfDef.class);
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
  public TtcnUnionDef getUnionDef() {
    return findChildByClass(TtcnUnionDef.class);
  }

  @Override
  @Nullable
  public PsiElement getTtcnId() {
    return findChildByType(TTCN_ID);
  }

}
