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

public class TtcnDisconnectStatementImpl extends ASTWrapperPsiElement implements TtcnDisconnectStatement {

  public TtcnDisconnectStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TtcnVisitor) ((TtcnVisitor)visitor).visitDisconnectStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TtcnAllCompsAllPortsSpec getAllCompsAllPortsSpec() {
    return findChildByClass(TtcnAllCompsAllPortsSpec.class);
  }

  @Override
  @Nullable
  public TtcnAllConnectionsSpec getAllConnectionsSpec() {
    return findChildByClass(TtcnAllConnectionsSpec.class);
  }

  @Override
  @Nullable
  public TtcnAllPortsSpec getAllPortsSpec() {
    return findChildByClass(TtcnAllPortsSpec.class);
  }

  @Override
  @NotNull
  public List<TtcnComponentOrDefaultReference> getComponentOrDefaultReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnComponentOrDefaultReference.class);
  }

  @Override
  @NotNull
  public List<TtcnFieldOrBitNumber> getFieldOrBitNumberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TtcnFieldOrBitNumber.class);
  }

}
