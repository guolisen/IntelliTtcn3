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

public class TtcnAddressRefListImpl extends ASTWrapperPsiElement implements TtcnAddressRefList {

  public TtcnAddressRefListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitAddressRefList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnDerivedRefWithParList> getDerivedRefWithParListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnDerivedRefWithParList.class);
  }

  @Override
  @NotNull
  public List<TtcnSignature> getSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnSignature.class);
  }

  @Override
  @NotNull
  public List<TtcnTemplateBody> getTemplateBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnTemplateBody.class);
  }

  @Override
  @NotNull
  public List<TtcnType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnType.class);
  }

}
