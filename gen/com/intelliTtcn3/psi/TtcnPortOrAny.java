// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnPortOrAny extends PsiElement {

  @NotNull
  List<TtcnFieldOrBitNumber> getFieldOrBitNumberList();

  @Nullable
  TtcnVariableRef getVariableRef();

  @Nullable
  PsiElement getTtcnId();

}
