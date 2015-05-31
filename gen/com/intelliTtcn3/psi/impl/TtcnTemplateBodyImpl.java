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

public class TtcnTemplateBodyImpl extends ASTWrapperPsiElement implements TtcnTemplateBody {

  public TtcnTemplateBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitTemplateBody(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnArrayValueOrAttrib getArrayValueOrAttrib() {
    return findChildByClass(TtcnArrayValueOrAttrib.class);
  }

  @Override
  @Nullable
  public TtcnExtraMatchingAttributes getExtraMatchingAttributes() {
    return findChildByClass(TtcnExtraMatchingAttributes.class);
  }

  @Override
  @Nullable
  public TtcnFieldSpecList getFieldSpecList() {
    return findChildByClass(TtcnFieldSpecList.class);
  }

  @Override
  @Nullable
  public TtcnSimpleSpec getSimpleSpec() {
    return findChildByClass(TtcnSimpleSpec.class);
  }

}
