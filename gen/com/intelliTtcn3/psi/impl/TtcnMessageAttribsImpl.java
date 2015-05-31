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

public class TtcnMessageAttribsImpl extends ASTWrapperPsiElement implements TtcnMessageAttribs {

  public TtcnMessageAttribsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitMessageAttribs(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnAddressDecl> getAddressDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnAddressDecl.class);
  }

  @Override
  @NotNull
  public List<TtcnConfigParamDef> getConfigParamDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnConfigParamDef.class);
  }

  @Override
  @NotNull
  public List<TtcnMessageList> getMessageListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnMessageList.class);
  }

}
