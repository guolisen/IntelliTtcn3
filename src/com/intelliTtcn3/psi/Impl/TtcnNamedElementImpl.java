package com.intelliTtcn3.psi.Impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intelliTtcn3.psi.TtcnNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class TtcnNamedElementImpl extends ASTWrapperPsiElement implements TtcnNamedElement {
    public TtcnNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}