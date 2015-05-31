// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnBasicStatements extends PsiElement {

  @Nullable
  TtcnAssignment getAssignment();

  @Nullable
  TtcnConditionalConstruct getConditionalConstruct();

  @Nullable
  TtcnLogStatement getLogStatement();

  @Nullable
  TtcnLoopConstruct getLoopConstruct();

  @Nullable
  TtcnSelectCaseConstruct getSelectCaseConstruct();

  @Nullable
  TtcnStatementBlock getStatementBlock();

}
