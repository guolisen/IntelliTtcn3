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

public class TtcnCheckParameterImpl extends ASTWrapperPsiElement implements TtcnCheckParameter {

  public TtcnCheckParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitCheckParameter(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnCheckPortOpsPresent getCheckPortOpsPresent() {
    return findChildByClass(TtcnCheckPortOpsPresent.class);
  }

  @Override
  @Nullable
  public TtcnFromClausePresent getFromClausePresent() {
    return findChildByClass(TtcnFromClausePresent.class);
  }

  @Override
  @Nullable
  public TtcnRedirectPresent getRedirectPresent() {
    return findChildByClass(TtcnRedirectPresent.class);
  }

}
