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
  TtcnConnectStatement getConnectStatement();

  @Nullable
  TtcnDisconnectStatement getDisconnectStatement();

  @Nullable
  TtcnDoneStatement getDoneStatement();

  @Nullable
  TtcnKillTCStatement getKillTCStatement();

  @Nullable
  TtcnKilledStatement getKilledStatement();

  @Nullable
  TtcnMapStatement getMapStatement();

  @Nullable
  TtcnSUTStatements getSUTStatements();

  @Nullable
  TtcnSetLocalVerdict getSetLocalVerdict();

  @Nullable
  TtcnStartTCStatement getStartTCStatement();

  @Nullable
  TtcnStopTCStatement getStopTCStatement();

  @Nullable
  TtcnTestcaseOperation getTestcaseOperation();

  @Nullable
  TtcnTimerStatements getTimerStatements();

  @Nullable
  TtcnUnmapStatement getUnmapStatement();

}
