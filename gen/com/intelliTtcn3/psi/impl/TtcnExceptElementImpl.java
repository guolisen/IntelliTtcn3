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

public class TtcnExceptElementImpl extends ASTWrapperPsiElement implements TtcnExceptElement {

  public TtcnExceptElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitExceptElement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnExceptAltstepSpec getExceptAltstepSpec() {
    return findChildByClass(TtcnExceptAltstepSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptConstSpec getExceptConstSpec() {
    return findChildByClass(TtcnExceptConstSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptFunctionSpec getExceptFunctionSpec() {
    return findChildByClass(TtcnExceptFunctionSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptGroupSpec getExceptGroupSpec() {
    return findChildByClass(TtcnExceptGroupSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptModuleParSpec getExceptModuleParSpec() {
    return findChildByClass(TtcnExceptModuleParSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptSignatureSpec getExceptSignatureSpec() {
    return findChildByClass(TtcnExceptSignatureSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptTemplateSpec getExceptTemplateSpec() {
    return findChildByClass(TtcnExceptTemplateSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptTestcaseSpec getExceptTestcaseSpec() {
    return findChildByClass(TtcnExceptTestcaseSpec.class);
  }

  @Override
  @Nullable
  public TtcnExceptTypeDefSpec getExceptTypeDefSpec() {
    return findChildByClass(TtcnExceptTypeDefSpec.class);
  }

}
