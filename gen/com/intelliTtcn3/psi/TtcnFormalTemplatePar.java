// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnFormalTemplatePar extends PsiElement {

  @NotNull
  TtcnIdentifier getIdentifier();

  @Nullable
  TtcnInLineTemplate getInLineTemplate();

  @Nullable
  TtcnInOutParKeyword getInOutParKeyword();

  @Nullable
  TtcnInParKeyword getInParKeyword();

  @Nullable
  TtcnOutParKeyword getOutParKeyword();

  @Nullable
  TtcnRestrictedTemplate getRestrictedTemplate();

  @NotNull
  TtcnType getType();

}
