// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnGuardOp extends PsiElement {

  @Nullable
  TtcnCatchStatement getCatchStatement();

  @Nullable
  TtcnCheckStatement getCheckStatement();

  @Nullable
  TtcnDoneStatement getDoneStatement();

  @Nullable
  TtcnGetCallStatement getGetCallStatement();

  @Nullable
  TtcnGetReplyStatement getGetReplyStatement();

  @Nullable
  TtcnKilledStatement getKilledStatement();

  @Nullable
  TtcnReceiveStatement getReceiveStatement();

  @Nullable
  TtcnTimeoutStatement getTimeoutStatement();

  @Nullable
  TtcnTriggerStatement getTriggerStatement();

}
