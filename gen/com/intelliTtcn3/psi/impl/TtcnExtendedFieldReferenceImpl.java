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

public class TtcnExtendedFieldReferenceImpl extends ASTWrapperPsiElement implements TtcnExtendedFieldReference {

  public TtcnExtendedFieldReferenceImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitExtendedFieldReference(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnArrayOrBitRef> getArrayOrBitRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnArrayOrBitRef.class);
  }

  @Override
  @NotNull
  public List<TtcnIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnIdentifier.class);
  }

  @Override
  @NotNull
  public List<TtcnPredefinedType> getPredefinedTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnPredefinedType.class);
  }

}
