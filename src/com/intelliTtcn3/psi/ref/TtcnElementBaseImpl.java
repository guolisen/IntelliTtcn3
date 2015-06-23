/* AdvancedTools, 2007, all rights reserved */
package com.intelliTtcn3.psi.ref;


import com.intelliTtcn3.TtcnLanguage;
import com.intelliTtcn3.psi.ITtcnElementBase;
import com.intelliTtcn3.psi.TtcnTypes;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.StringTokenizer;

/**
 * @author maxim
 */
public class TtcnElementBaseImpl extends ASTWrapperPsiElement implements ITtcnElementBase {
  private PsiReference[] myCachedRefs;
  private long myStamp;

  public TtcnElementBaseImpl(ASTNode astNode) {
    super(astNode);
  }

  @NotNull
  public PsiReference[] getReferences() {
    final long count = manager(this).getModificationTracker().getModificationCount();
    if (myCachedRefs == null || myStamp != count) {
      IElementType elementType = getNode().getElementType();
      PsiReference[] refs;

      if (elementType == TtcnTypes.TTCN_STRING) {
        final String text = getNode().getText();
        StringTokenizer tokenizer = new StringTokenizer(StringUtil.stripQuotesAroundValue(text),"/\\");
        refs = new PsiReference[tokenizer.countTokens()];
        int i = 0;
        while(tokenizer.hasMoreElements()) {
          final String token = tokenizer.nextToken();
          final int index = text.indexOf(token);
          refs[i++] = new MyPsiPolyVariantReference(this, new TextRange(index, index + token.length()));
        }
      } else if (elementType == TtcnTypes.VAR_REF_NAME) {
        refs = new PsiReference[] {
                new ConstVarReference(this)
        };
      } else if (elementType == TtcnTypes.MODULE_NAME) {
        refs = new PsiReference[] {
                new ModuleReference(this)
        };
      } else {
        refs = PsiReference.EMPTY_ARRAY;
      }

      myCachedRefs = refs;
      myStamp = count;
    }
    return myCachedRefs;
  }

  private static PsiManager manager(PsiElement cppElement) {
    return cppElement.getManager();
  }

  public String getName() {
    return getText();
  }

  public PsiElement setName(@NonNls @NotNull String string) throws IncorrectOperationException {
    getNode().replaceChild(getFirstChild().getNode(), createNameIdentifier(getProject(), string));
    return this;
  }
    
  public String toString() {
    return getNode().getElementType().toString();
  }

  public PsiReference getReference() {
    final PsiReference[] references = getReferences();
    return references.length != 0 ? references[0]:null;
  }

  @NotNull
  public Language getLanguage() {
    return TtcnLanguage.INSTANCE;
  }

  public static ASTNode createNameIdentifier(Project project, String name) {
    final PsiFile dummyFile = PsiFileFactory.getInstance(project).createFileFromText("A.cpp", name);
    final TtcnElementBaseImpl element = (TtcnElementBaseImpl)dummyFile.getFirstChild();

    return element.getNode().getFirstChildNode();
  }

  public ItemPresentation getPresentation() {
    return new MyItemPresentation();
  }

  public void accept(@NotNull PsiElementVisitor psiElementVisitor) {
  //  if (psiElementVisitor instanceof TtcnVisitor) {
  //    ((TtcnVisitor)psiElementVisitor).visitCppElement(this);
  //  } else {
  //    psiElementVisitor.visitElement(this);
  //  }
  }

  private class MyItemPresentation implements ItemPresentation {
    public String getPresentableText() {
      return getText();
    }

    @Nullable
    public String getLocationString() {
      VirtualFile file = getContainingFile().getViewProvider().getVirtualFile();
      //return FileUsage.formatFile(file);
      return "!!!!";
    }

    @Nullable
    public Icon getIcon(boolean b) {
      return null;
    }
  }
}
