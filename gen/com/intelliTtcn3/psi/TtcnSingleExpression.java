// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnSingleExpression extends PsiElement {

  @NotNull
  List<TtcnAddOp> getAddOpList();

  @NotNull
  List<TtcnCompoundExpression> getCompoundExpressionList();

  @NotNull
  List<TtcnEqualOp> getEqualOpList();

  @NotNull
  List<TtcnMultiplyOp> getMultiplyOpList();

  @NotNull
  List<TtcnPrimary> getPrimaryList();

  @NotNull
  List<TtcnRelOp> getRelOpList();

  @NotNull
  List<TtcnShiftOp> getShiftOpList();

  @NotNull
  List<TtcnUnaryOp> getUnaryOpList();

}
