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

public class TtcnComponentElementDefImpl extends ASTWrapperPsiElement implements TtcnComponentElementDef {

  public TtcnComponentElementDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitComponentElementDef(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnConstDef getConstDef() {
    return findChildByClass(TtcnConstDef.class);
  }

  @Override
  @Nullable
  public TtcnPortInstance getPortInstance() {
    return findChildByClass(TtcnPortInstance.class);
  }

  @Override
  @Nullable
  public TtcnTemplateDef getTemplateDef() {
    return findChildByClass(TtcnTemplateDef.class);
  }

  @Override
  @Nullable
  public TtcnTimerInstance getTimerInstance() {
    return findChildByClass(TtcnTimerInstance.class);
  }

  @Override
  @Nullable
  public TtcnVarInstance getVarInstance() {
    return findChildByClass(TtcnVarInstance.class);
  }

}
