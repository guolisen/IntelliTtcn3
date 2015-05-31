// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnTimerStatements extends PsiElement {

  @Nullable
  TtcnStartTimerStatement getStartTimerStatement();

  @Nullable
  TtcnStopTimerStatement getStopTimerStatement();

  @Nullable
  TtcnTimeoutStatement getTimeoutStatement();

}
