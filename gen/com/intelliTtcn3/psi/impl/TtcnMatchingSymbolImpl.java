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

public class TtcnMatchingSymbolImpl extends ASTWrapperPsiElement implements TtcnMatchingSymbol {

  public TtcnMatchingSymbolImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitMatchingSymbol(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnBitStringMatch getBitStringMatch() {
    return findChildByClass(TtcnBitStringMatch.class);
  }

  @Override
  @Nullable
  public TtcnCharStringMatch getCharStringMatch() {
    return findChildByClass(TtcnCharStringMatch.class);
  }

  @Override
  @Nullable
  public TtcnComplement getComplement() {
    return findChildByClass(TtcnComplement.class);
  }

  @Override
  @Nullable
  public TtcnHexStringMatch getHexStringMatch() {
    return findChildByClass(TtcnHexStringMatch.class);
  }

  @Override
  @Nullable
  public TtcnListOfTemplates getListOfTemplates() {
    return findChildByClass(TtcnListOfTemplates.class);
  }

  @Override
  @Nullable
  public TtcnOctetStringMatch getOctetStringMatch() {
    return findChildByClass(TtcnOctetStringMatch.class);
  }

  @Override
  @Nullable
  public TtcnRange getRange() {
    return findChildByClass(TtcnRange.class);
  }

  @Override
  @Nullable
  public TtcnSubsetMatch getSubsetMatch() {
    return findChildByClass(TtcnSubsetMatch.class);
  }

  @Override
  @Nullable
  public TtcnSupersetMatch getSupersetMatch() {
    return findChildByClass(TtcnSupersetMatch.class);
  }

  @Override
  @Nullable
  public TtcnWildcardLengthMatch getWildcardLengthMatch() {
    return findChildByClass(TtcnWildcardLengthMatch.class);
  }

}
