// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnModuleDefinitionsList extends PsiElement {

  @NotNull
  List<TtcnAltstepDef> getAltstepDefList();

  @NotNull
  List<TtcnConstDef> getConstDefList();

  @NotNull
  List<TtcnExtConstDef> getExtConstDefList();

  @NotNull
  List<TtcnExtFunctionDef> getExtFunctionDefList();

  @NotNull
  List<TtcnFriendModuleDef> getFriendModuleDefList();

  @NotNull
  List<TtcnFunctionDef> getFunctionDefList();

  @NotNull
  List<TtcnGroupDef> getGroupDefList();

  @NotNull
  List<TtcnImportDef> getImportDefList();

  @NotNull
  List<TtcnModuleParDef> getModuleParDefList();

  @NotNull
  List<TtcnSignatureDef> getSignatureDefList();

  @NotNull
  List<TtcnTemplateDef> getTemplateDefList();

  @NotNull
  List<TtcnTestcaseDef> getTestcaseDefList();

  @NotNull
  List<TtcnTypeDef> getTypeDefList();

  @NotNull
  List<TtcnWithStatement> getWithStatementList();

}
