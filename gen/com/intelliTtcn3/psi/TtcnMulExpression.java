// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnMulExpression extends PsiElement {

  @Nullable
  TtcnCompoundExpression getCompoundExpression();

  @NotNull
  List<TtcnMultiplyOp> getMultiplyOpList();

  @NotNull
  List<TtcnUnaryExpression> getUnaryExpressionList();

}
