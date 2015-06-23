/* AdvancedTools, 2007, all rights reserved */
package com.intelliTtcn3.psi.ref;

import com.intelliTtcn3.psi.TtcnConstVarName;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.util.ArrayUtil;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;


class MyPsiPolyVariantReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
  public final PsiElement psiElement;
    public final TextRange range;

  MyPsiPolyVariantReference(PsiElement _element) {
    this(_element, null);
  }

  MyPsiPolyVariantReference(PsiElement _element, TextRange _range) {
      super(_element, _range);
    psiElement = _element;
    range = _range;
  }

  static class MyResolver implements ResolveCache.PolyVariantResolver {
    static ResolveCache.PolyVariantResolver INSTANCE = new MyResolver();

    public Object resolve(PsiReference psiReference, boolean b) {
      return ((MyPsiPolyVariantReference)psiReference).resolveInner();
    }

    @NotNull
    public ResolveResult[] resolve(@NotNull PsiPolyVariantReference psiReference, boolean b) {
      return ((MyPsiPolyVariantReference) psiReference).resolveInner();
    }
  }

  public PsiElement getElement() {
    return psiElement;
  }

  public TextRange getRangeInElement() {
    return range != null ? range:new TextRange(0, psiElement.getTextLength());
  }

  @Nullable
  public PsiElement resolve() {
    final ResolveResult[] resolveResults = multiResolve(true);
    return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
  }

  public String getCanonicalText() {
    String s = psiElement.getText();
    if (range != null) s = s.substring(range.getStartOffset(), range.getEndOffset());
    return s;
  }

  public PsiElement handleElementRename(String string) throws IncorrectOperationException {
    if (range != null) {
      final String s = psiElement.getText();
      string = s.substring(0, range.getStartOffset()) + string + s.substring(range.getEndOffset());
    }
    //psiElement.getNode().replaceChild(psiElement.getFirstChild().getNode(), TtcnElementBaseImpl.createNameIdentifier(psiElement.getProject(), string));
    return psiElement;
  }

  public PsiElement bindToElement(PsiElement psiElement) throws IncorrectOperationException {
    return null;
  }

  public boolean isReferenceTo(PsiElement _psiElement) {
    return psiElement == _psiElement;
  }

  public boolean isSoft() {
    return true;
  }

  @NotNull
  public ResolveResult[] multiResolve(boolean b) {
    return ResolveCache.getInstance(psiElement.getProject()).resolveWithCaching(
      this,
      MyResolver.INSTANCE,
      false,
      false
    );
  }

  public Object[] getVariants() {
    return ArrayUtil.EMPTY_OBJECT_ARRAY;
  }

  public ResolveResult[] resolveInner() {
      return ResolveResult.EMPTY_ARRAY;
  }
}
