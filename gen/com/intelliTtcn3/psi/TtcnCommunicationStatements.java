// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnCommunicationStatements extends PsiElement {

  @Nullable
  TtcnCallStatement getCallStatement();

  @Nullable
  TtcnCatchStatement getCatchStatement();

  @Nullable
  TtcnCheckStateStatement getCheckStateStatement();

  @Nullable
  TtcnCheckStatement getCheckStatement();

  @Nullable
  TtcnClearStatement getClearStatement();

  @Nullable
  TtcnGetCallStatement getGetCallStatement();

  @Nullable
  TtcnGetReplyStatement getGetReplyStatement();

  @Nullable
  TtcnHaltStatement getHaltStatement();

  @Nullable
  TtcnRaiseStatement getRaiseStatement();

  @Nullable
  TtcnReceiveStatement getReceiveStatement();

  @Nullable
  TtcnReplyStatement getReplyStatement();

  @Nullable
  TtcnSendStatement getSendStatement();

  @Nullable
  TtcnStartStatement getStartStatement();

  @Nullable
  TtcnStopStatement getStopStatement();

  @Nullable
  TtcnTriggerStatement getTriggerStatement();

}
