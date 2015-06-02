// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnFunctionDef extends PsiElement {

  @Nullable
  TtcnFunctionFormalParList getFunctionFormalParList();

  @Nullable
  TtcnMtcSpec getMtcSpec();

  @Nullable
  TtcnReturnType getReturnType();

  @Nullable
  TtcnRunsOnSpec getRunsOnSpec();

  @NotNull
  TtcnStatementBlock getStatementBlock();

  @Nullable
  TtcnSystemSpec getSystemSpec();

  @NotNull
  PsiElement getTtcnId();

}
