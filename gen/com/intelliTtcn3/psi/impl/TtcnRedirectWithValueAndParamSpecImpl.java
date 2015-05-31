// This is a generated file. Not intended for manual editing.
package com.intelliTtcn3.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intelliTtcn3.psi.TtcnTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intelliTtcn3.psi.*;

public class TtcnRedirectWithValueAndParamSpecImpl extends ASTWrapperPsiElement implements TtcnRedirectWithValueAndParamSpec {

  public TtcnRedirectWithValueAndParamSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitRedirectWithValueAndParamSpec(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnIndexSpec getIndexSpec() {
    return findChildByClass(TtcnIndexSpec.class);
  }

  @Override
  @Nullable
  public TtcnParamSpec getParamSpec() {
    return findChildByClass(TtcnParamSpec.class);
  }

  @Override
  @Nullable
  public TtcnRedirectWithParamSpec getRedirectWithParamSpec() {
    return findChildByClass(TtcnRedirectWithParamSpec.class);
  }

  @Override
  @Nullable
  public TtcnSenderSpec getSenderSpec() {
    return findChildByClass(TtcnSenderSpec.class);
  }

  @Override
  @Nullable
  public TtcnValueSpec getValueSpec() {
    return findChildByClass(TtcnValueSpec.class);
  }

}
