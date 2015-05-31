// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnMatchingSymbol extends PsiElement {

  @Nullable
  TtcnBitStringMatch getBitStringMatch();

  @Nullable
  TtcnCharStringMatch getCharStringMatch();

  @Nullable
  TtcnComplement getComplement();

  @Nullable
  TtcnHexStringMatch getHexStringMatch();

  @Nullable
  TtcnListOfTemplates getListOfTemplates();

  @Nullable
  TtcnOctetStringMatch getOctetStringMatch();

  @Nullable
  TtcnRange getRange();

  @Nullable
  TtcnSubsetMatch getSubsetMatch();

  @Nullable
  TtcnSupersetMatch getSupersetMatch();

  @Nullable
  TtcnWildcardLengthMatch getWildcardLengthMatch();

}
