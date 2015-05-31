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

public class TtcnSingleWithAttribImpl extends ASTWrapperPsiElement implements TtcnSingleWithAttrib {

  public TtcnSingleWithAttribImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitSingleWithAttrib(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TtcnAttribKeyword getAttribKeyword() {
    return findNotNullChildByClass(TtcnAttribKeyword.class);
  }

  @Override
  @Nullable
  public TtcnAttribQualifier getAttribQualifier() {
    return findChildByClass(TtcnAttribQualifier.class);
  }

  @Override
  @NotNull
  public TtcnFreeText getFreeText() {
    return findNotNullChildByClass(TtcnFreeText.class);
  }

}
