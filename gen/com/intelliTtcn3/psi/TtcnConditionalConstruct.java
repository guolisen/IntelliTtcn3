// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnConditionalConstruct extends PsiElement {

  @NotNull
  TtcnBooleanExpression getBooleanExpression();

  @Nullable
  TtcnElseClause getElseClause();

  @NotNull
  List<TtcnElseIfClause> getElseIfClauseList();

  @NotNull
  TtcnStatementBlock getStatementBlock();

}
