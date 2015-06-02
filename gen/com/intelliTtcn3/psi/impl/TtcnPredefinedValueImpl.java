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

public class TtcnPredefinedValueImpl extends ASTWrapperPsiElement implements TtcnPredefinedValue {

  public TtcnPredefinedValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitPredefinedValue(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnBooleanValue getBooleanValue() {
    return findChildByClass(TtcnBooleanValue.class);
  }

  @Override
  @Nullable
  public TtcnCharStringValue getCharStringValue() {
    return findChildByClass(TtcnCharStringValue.class);
  }

  @Override
  @Nullable
  public TtcnFloatValue getFloatValue() {
    return findChildByClass(TtcnFloatValue.class);
  }

  @Override
  @Nullable
  public TtcnVerdictTypeValue getVerdictTypeValue() {
    return findChildByClass(TtcnVerdictTypeValue.class);
  }

  @Override
  @Nullable
  public PsiElement getTtcnBstring() {
    return findChildByType(TTCN_BSTRING);
  }

  @Override
  @Nullable
  public PsiElement getTtcnHstring() {
    return findChildByType(TTCN_HSTRING);
  }

  @Override
  @Nullable
  public PsiElement getTtcnId() {
    return findChildByType(TTCN_ID);
  }

  @Override
  @Nullable
  public PsiElement getTtcnNumber() {
    return findChildByType(TTCN_NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getTtcnOstring() {
    return findChildByType(TTCN_OSTRING);
  }

}
