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

public class TtcnMatchOpImpl extends ASTWrapperPsiElement implements TtcnMatchOp {

  public TtcnMatchOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitMatchOp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnDerivedRefWithParList getDerivedRefWithParList() {
    return findChildByClass(TtcnDerivedRefWithParList.class);
  }

  @Override
  @NotNull
  public TtcnExpression getExpression() {
    return findNotNullChildByClass(TtcnExpression.class);
  }

  @Override
  @Nullable
  public TtcnSignature getSignature() {
    return findChildByClass(TtcnSignature.class);
  }

  @Override
  @NotNull
  public TtcnTemplateBody getTemplateBody() {
    return findNotNullChildByClass(TtcnTemplateBody.class);
  }

  @Override
  @Nullable
  public TtcnType getType() {
    return findChildByClass(TtcnType.class);
  }

}
