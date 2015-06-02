// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnAddressRefList extends PsiElement {

  @NotNull
  List<TtcnDerivedRefWithParList> getDerivedRefWithParListList();

  @NotNull
  List<TtcnSignature> getSignatureList();

  @NotNull
  List<TtcnTemplateBody> getTemplateBodyList();

  @NotNull
  List<TtcnType> getTypeList();

}
