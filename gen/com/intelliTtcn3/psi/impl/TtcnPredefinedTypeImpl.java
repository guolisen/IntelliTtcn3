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

public class TtcnPredefinedTypeImpl extends ASTWrapperPsiElement implements TtcnPredefinedType {

  public TtcnPredefinedTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitPredefinedType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnAddressKeyword getAddressKeyword() {
    return findChildByClass(TtcnAddressKeyword.class);
  }

  @Override
  @Nullable
  public TtcnAnyTypeKeyword getAnyTypeKeyword() {
    return findChildByClass(TtcnAnyTypeKeyword.class);
  }

  @Override
  @Nullable
  public TtcnBitStringKeyword getBitStringKeyword() {
    return findChildByClass(TtcnBitStringKeyword.class);
  }

  @Override
  @Nullable
  public TtcnBooleanKeyword getBooleanKeyword() {
    return findChildByClass(TtcnBooleanKeyword.class);
  }

  @Override
  @Nullable
  public TtcnCharStringKeyword getCharStringKeyword() {
    return findChildByClass(TtcnCharStringKeyword.class);
  }

  @Override
  @Nullable
  public TtcnDefaultKeyword getDefaultKeyword() {
    return findChildByClass(TtcnDefaultKeyword.class);
  }

  @Override
  @Nullable
  public TtcnFloatKeyword getFloatKeyword() {
    return findChildByClass(TtcnFloatKeyword.class);
  }

  @Override
  @Nullable
  public TtcnHexStringKeyword getHexStringKeyword() {
    return findChildByClass(TtcnHexStringKeyword.class);
  }

  @Override
  @Nullable
  public TtcnIntegerKeyword getIntegerKeyword() {
    return findChildByClass(TtcnIntegerKeyword.class);
  }

  @Override
  @Nullable
  public TtcnOctetStringKeyword getOctetStringKeyword() {
    return findChildByClass(TtcnOctetStringKeyword.class);
  }

  @Override
  @Nullable
  public TtcnUniversalCharString getUniversalCharString() {
    return findChildByClass(TtcnUniversalCharString.class);
  }

  @Override
  @Nullable
  public TtcnVerdictTypeKeyword getVerdictTypeKeyword() {
    return findChildByClass(TtcnVerdictTypeKeyword.class);
  }

}
