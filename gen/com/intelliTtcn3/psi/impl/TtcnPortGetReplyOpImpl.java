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

public class TtcnPortGetReplyOpImpl extends ASTWrapperPsiElement implements TtcnPortGetReplyOp {

  public TtcnPortGetReplyOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitPortGetReplyOp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnFromClause getFromClause() {
    return findChildByClass(TtcnFromClause.class);
  }

  @Override
  @Nullable
  public TtcnInLineTemplate getInLineTemplate() {
    return findChildByClass(TtcnInLineTemplate.class);
  }

  @Override
  @Nullable
  public TtcnPortRedirectWithValueAndParam getPortRedirectWithValueAndParam() {
    return findChildByClass(TtcnPortRedirectWithValueAndParam.class);
  }

  @Override
  @Nullable
  public TtcnValueMatchSpec getValueMatchSpec() {
    return findChildByClass(TtcnValueMatchSpec.class);
  }

}
