// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnFormalValuePar extends PsiElement {

  @Nullable
  TtcnExpression getExpression();

  @NotNull
  TtcnIdentifier getIdentifier();

  @Nullable
  TtcnInOutParKeyword getInOutParKeyword();

  @Nullable
  TtcnInParKeyword getInParKeyword();

  @Nullable
  TtcnOutParKeyword getOutParKeyword();

  @NotNull
  TtcnType getType();

}
