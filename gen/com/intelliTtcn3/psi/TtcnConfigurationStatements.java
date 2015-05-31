// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnConfigurationStatements extends PsiElement {

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
  TtcnStartTCStatement getStartTCStatement();

  @Nullable
  TtcnStopTCStatement getStopTCStatement();

  @Nullable
  TtcnUnmapStatement getUnmapStatement();

}
