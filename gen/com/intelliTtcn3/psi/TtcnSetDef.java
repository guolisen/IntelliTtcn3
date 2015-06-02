// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnSetDef extends PsiElement {

  @NotNull
  List<TtcnArrayDef> getArrayDefList();

  @NotNull
  List<TtcnNestedTypeDef> getNestedTypeDefList();

  @NotNull
  List<TtcnSubTypeSpec> getSubTypeSpecList();

  @NotNull
  List<TtcnType> getTypeList();

}
