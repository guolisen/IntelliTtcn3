      /*
package com.intelliTtcn3.psi.Impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intelliTtcn3.psi.TtcnIcons;
//import com.intelliTtcn3.psi.TtcnElementFactory;
import com.intelliTtcn3.psi.TtcnNamedElement;
import com.intelliTtcn3.psi.TtcnTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TtcnPsiImplUtil {
    public static String getKey(TtcnNamedElement element) {
        ASTNode keyNode = element.getNode().findChildByType(TtcnTypes.KEY);
        if (keyNode != null) {
            return keyNode.getText();
        } else {
            return null;
        }
    }

    public static String getValue(TtcnNamedElement element) {
        ASTNode valueNode = element.getNode().findChildByType(TtcnTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(TtcnNamedElement element) {
        return getKey(element);
    }

    public static PsiElement setName(SimpleProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(TtcnTypes.KEY);
        if (keyNode != null) {

            SimpleProperty property = SimpleElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(TtcnNamedElement element) {
        ASTNode keyNode = element.getNode().findChildByType(TtcnTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final TtcnNamedElement element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return TtcnIcons.FILE;
            }
        };
    }
}

                        */