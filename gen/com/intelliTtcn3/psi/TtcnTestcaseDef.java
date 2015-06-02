// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnTestcaseDef extends PsiElement {

  @NotNull
  TtcnConfigSpec getConfigSpec();

  @NotNull
  List<TtcnDerivedRefWithParList> getDerivedRefWithParListList();

  @NotNull
  List<TtcnExpression> getExpressionList();

  @NotNull
  List<TtcnSignature> getSignatureList();

  @NotNull
  TtcnStatementBlock getStatementBlock();

  @NotNull
  List<TtcnTemplateBody> getTemplateBodyList();

  @NotNull
  List<TtcnType> getTypeList();

}
