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

public class TtcnModuleDefinitionsListImpl extends ASTWrapperPsiElement implements TtcnModuleDefinitionsList {

  public TtcnModuleDefinitionsListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitModuleDefinitionsList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TtcnAltstepDef> getAltstepDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnAltstepDef.class);
  }

  @Override
  @NotNull
  public List<TtcnConstDef> getConstDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnConstDef.class);
  }

  @Override
  @NotNull
  public List<TtcnExtConstDef> getExtConstDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnExtConstDef.class);
  }

  @Override
  @NotNull
  public List<TtcnExtFunctionDef> getExtFunctionDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnExtFunctionDef.class);
  }

  @Override
  @NotNull
  public List<TtcnFriendModuleDef> getFriendModuleDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnFriendModuleDef.class);
  }

  @Override
  @NotNull
  public List<TtcnFunctionDef> getFunctionDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnFunctionDef.class);
  }

  @Override
  @NotNull
  public List<TtcnGroupDef> getGroupDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnGroupDef.class);
  }

  @Override
  @NotNull
  public List<TtcnImportDef> getImportDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnImportDef.class);
  }

  @Override
  @NotNull
  public List<TtcnModuleParDef> getModuleParDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnModuleParDef.class);
  }

  @Override
  @NotNull
  public List<TtcnSignatureDef> getSignatureDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnSignatureDef.class);
  }

  @Override
  @NotNull
  public List<TtcnTemplateDef> getTemplateDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnTemplateDef.class);
  }

  @Override
  @NotNull
  public List<TtcnTestcaseDef> getTestcaseDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnTestcaseDef.class);
  }

  @Override
  @NotNull
  public List<TtcnTypeDef> getTypeDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnTypeDef.class);
  }

  @Override
  @NotNull
  public List<TtcnWithStatement> getWithStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnWithStatement.class);
  }

}
