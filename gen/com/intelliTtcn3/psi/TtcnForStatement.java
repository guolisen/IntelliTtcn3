// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnForStatement extends PsiElement {

  @NotNull
  TtcnAssignment getAssignment();

  @NotNull
  TtcnInitial getInitial();

  @NotNull
  TtcnSingleExpression getSingleExpression();

  @NotNull
  TtcnStatementBlock getStatementBlock();

}
