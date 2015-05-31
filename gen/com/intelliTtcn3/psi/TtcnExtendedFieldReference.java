// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnExtendedFieldReference extends PsiElement {

  @NotNull
  List<TtcnArrayOrBitRef> getArrayOrBitRefList();

  @NotNull
  List<TtcnIdentifier> getIdentifierList();

  @NotNull
  List<TtcnPredefinedType> getPredefinedTypeList();

}
