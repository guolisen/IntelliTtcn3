// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TtcnTemplateDef extends PsiElement {

  @NotNull
  TtcnBaseTemplate getBaseTemplate();

  @Nullable
  TtcnDerivedDef getDerivedDef();

  @NotNull
  TtcnTemplateBody getTemplateBody();

  @Nullable
  TtcnTemplateRestriction getTemplateRestriction();

}