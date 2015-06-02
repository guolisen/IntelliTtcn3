// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnPortRaiseOp extends PsiElement {

  @Nullable
  TtcnDerivedRefWithParList getDerivedRefWithParList();

  @NotNull
  List<TtcnSignature> getSignatureList();

  @NotNull
  TtcnTemplateBody getTemplateBody();

  @Nullable
  TtcnToClause getToClause();

  @Nullable
  TtcnType getType();

}
