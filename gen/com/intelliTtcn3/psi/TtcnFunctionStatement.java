// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnFunctionStatement extends PsiElement {

  @Nullable
  TtcnBasicStatements getBasicStatements();

  @Nullable
  TtcnBehaviourStatements getBehaviourStatements();

  @Nullable
  TtcnCommunicationStatements getCommunicationStatements();

  @Nullable
  TtcnConfigurationStatements getConfigurationStatements();

  @Nullable
  TtcnSUTStatements getSUTStatements();

  @Nullable
  TtcnSetLocalVerdict getSetLocalVerdict();

  @Nullable
  TtcnTestcaseOperation getTestcaseOperation();

  @Nullable
  TtcnTimerStatements getTimerStatements();

}
