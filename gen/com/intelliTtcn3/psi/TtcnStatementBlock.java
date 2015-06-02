// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnStatementBlock extends PsiElement {

  @NotNull
  List<TtcnConstDef> getConstDefList();

  @NotNull
  List<TtcnFunctionStatement> getFunctionStatementList();

  @NotNull
  List<TtcnTemplateDef> getTemplateDefList();

  @NotNull
  List<TtcnTimerInstance> getTimerInstanceList();

  @NotNull
  List<TtcnVarInstance> getVarInstanceList();

  @NotNull
  List<TtcnWithStatement> getWithStatementList();

}
