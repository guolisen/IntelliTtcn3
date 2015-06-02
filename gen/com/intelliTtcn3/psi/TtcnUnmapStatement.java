// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnUnmapStatement extends PsiElement {

  @Nullable
  TtcnAllCompsAllPortsSpec getAllCompsAllPortsSpec();

  @Nullable
  TtcnAllConnectionsSpec getAllConnectionsSpec();

  @Nullable
  TtcnAllPortsSpec getAllPortsSpec();

  @NotNull
  List<TtcnArrayIdentifierRefAssignment> getArrayIdentifierRefAssignmentList();

  @NotNull
  List<TtcnComponentOrDefaultReference> getComponentOrDefaultReferenceList();

  @NotNull
  List<TtcnComponentRefAssignment> getComponentRefAssignmentList();

  @NotNull
  List<TtcnDerivedRefWithParList> getDerivedRefWithParListList();

  @NotNull
  List<TtcnFieldOrBitNumber> getFieldOrBitNumberList();

  @NotNull
  List<TtcnSignature> getSignatureList();

  @NotNull
  List<TtcnTemplateBody> getTemplateBodyList();

  @NotNull
  List<TtcnTemplateInstanceAssignment> getTemplateInstanceAssignmentList();

  @NotNull
  List<TtcnType> getTypeList();

}
