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

public class TtcnImportElementImpl extends ASTWrapperPsiElement implements TtcnImportElement {

  public TtcnImportElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitImportElement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnImportAltstepSpec getImportAltstepSpec() {
    return findChildByClass(TtcnImportAltstepSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportConstSpec getImportConstSpec() {
    return findChildByClass(TtcnImportConstSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportFunctionSpec getImportFunctionSpec() {
    return findChildByClass(TtcnImportFunctionSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportGroupSpec getImportGroupSpec() {
    return findChildByClass(TtcnImportGroupSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportImportSpec getImportImportSpec() {
    return findChildByClass(TtcnImportImportSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportModuleParSpec getImportModuleParSpec() {
    return findChildByClass(TtcnImportModuleParSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportSignatureSpec getImportSignatureSpec() {
    return findChildByClass(TtcnImportSignatureSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportTemplateSpec getImportTemplateSpec() {
    return findChildByClass(TtcnImportTemplateSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportTestcaseSpec getImportTestcaseSpec() {
    return findChildByClass(TtcnImportTestcaseSpec.class);
  }

  @Override
  @Nullable
  public TtcnImportTypeDefSpec getImportTypeDefSpec() {
    return findChildByClass(TtcnImportTypeDefSpec.class);
  }

}
