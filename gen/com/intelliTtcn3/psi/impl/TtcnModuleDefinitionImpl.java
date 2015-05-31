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

public class TtcnModuleDefinitionImpl extends ASTWrapperPsiElement implements TtcnModuleDefinition {

  public TtcnModuleDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitModuleDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnAltstepDef getAltstepDef() {
    return findChildByClass(TtcnAltstepDef.class);
  }

  @Override
  @Nullable
  public TtcnConstDef getConstDef() {
    return findChildByClass(TtcnConstDef.class);
  }

  @Override
  @Nullable
  public TtcnExtConstDef getExtConstDef() {
    return findChildByClass(TtcnExtConstDef.class);
  }

  @Override
  @Nullable
  public TtcnExtFunctionDef getExtFunctionDef() {
    return findChildByClass(TtcnExtFunctionDef.class);
  }

  @Override
  @Nullable
  public TtcnFriendModuleDef getFriendModuleDef() {
    return findChildByClass(TtcnFriendModuleDef.class);
  }

  @Override
  @Nullable
  public TtcnFunctionDef getFunctionDef() {
    return findChildByClass(TtcnFunctionDef.class);
  }

  @Override
  @Nullable
  public TtcnGroupDef getGroupDef() {
    return findChildByClass(TtcnGroupDef.class);
  }

  @Override
  @Nullable
  public TtcnImportDef getImportDef() {
    return findChildByClass(TtcnImportDef.class);
  }

  @Override
  @Nullable
  public TtcnModuleParDef getModuleParDef() {
    return findChildByClass(TtcnModuleParDef.class);
  }

  @Override
  @Nullable
  public TtcnSignatureDef getSignatureDef() {
    return findChildByClass(TtcnSignatureDef.class);
  }

  @Override
  @Nullable
  public TtcnTemplateDef getTemplateDef() {
    return findChildByClass(TtcnTemplateDef.class);
  }

  @Override
  @Nullable
  public TtcnTestcaseDef getTestcaseDef() {
    return findChildByClass(TtcnTestcaseDef.class);
  }

  @Override
  @Nullable
  public TtcnTypeDef getTypeDef() {
    return findChildByClass(TtcnTypeDef.class);
  }

  @Override
  @Nullable
  public TtcnVisibility getVisibility() {
    return findChildByClass(TtcnVisibility.class);
  }

  @Override
  @Nullable
  public TtcnWithStatement getWithStatement() {
    return findChildByClass(TtcnWithStatement.class);
  }

}
