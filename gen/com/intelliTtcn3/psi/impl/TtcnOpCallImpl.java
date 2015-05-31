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

public class TtcnOpCallImpl extends ASTWrapperPsiElement implements TtcnOpCall {

  public TtcnOpCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitOpCall(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnActivateOp getActivateOp() {
    return findChildByClass(TtcnActivateOp.class);
  }

  @Override
  @Nullable
  public TtcnConfigurationOps getConfigurationOps() {
    return findChildByClass(TtcnConfigurationOps.class);
  }

  @Override
  @Nullable
  public TtcnExtendedFieldReference getExtendedFieldReference() {
    return findChildByClass(TtcnExtendedFieldReference.class);
  }

  @Override
  @Nullable
  public TtcnFunctionInstance getFunctionInstance() {
    return findChildByClass(TtcnFunctionInstance.class);
  }

  @Override
  @Nullable
  public TtcnTemplateOps getTemplateOps() {
    return findChildByClass(TtcnTemplateOps.class);
  }

  @Override
  @Nullable
  public TtcnTestcaseInstance getTestcaseInstance() {
    return findChildByClass(TtcnTestcaseInstance.class);
  }

  @Override
  @Nullable
  public TtcnTimerOps getTimerOps() {
    return findChildByClass(TtcnTimerOps.class);
  }

}
