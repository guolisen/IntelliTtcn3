// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnTypeDef extends PsiElement {

  @Nullable
  TtcnArrayDef getArrayDef();

  @Nullable
  TtcnComponentDef getComponentDef();

  @Nullable
  TtcnEnumDef getEnumDef();

  @Nullable
  TtcnPortDef getPortDef();

  @Nullable
  TtcnRecordDef getRecordDef();

  @Nullable
  TtcnRecordOfDef getRecordOfDef();

  @Nullable
  TtcnSetDef getSetDef();

  @Nullable
  TtcnSetOfDef getSetOfDef();

  @Nullable
  TtcnSubTypeSpec getSubTypeSpec();

  @Nullable
  TtcnType getType();

  @Nullable
  TtcnUnionDef getUnionDef();

  @Nullable
  PsiElement getTtcnId();

}
