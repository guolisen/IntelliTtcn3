// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnControlStatementOrDef extends PsiElement {

  @Nullable
  TtcnConstDef getConstDef();

  @Nullable
  TtcnControlStatement getControlStatement();

  @Nullable
  TtcnTemplateDef getTemplateDef();

  @Nullable
  TtcnTimerInstance getTimerInstance();

  @Nullable
  TtcnVarInstance getVarInstance();

  @Nullable
  TtcnWithStatement getWithStatement();

}
