// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnAltstepDef extends PsiElement {

  @NotNull
  List<TtcnAltGuardList> getAltGuardListList();

  @NotNull
  List<TtcnAltstepLocalDefList> getAltstepLocalDefListList();

  @Nullable
  TtcnFunctionFormalParList getFunctionFormalParList();

  @NotNull
  TtcnIdentifier getIdentifier();

  @Nullable
  TtcnMtcSpec getMtcSpec();

  @Nullable
  TtcnRunsOnSpec getRunsOnSpec();

  @Nullable
  TtcnSystemSpec getSystemSpec();

}
