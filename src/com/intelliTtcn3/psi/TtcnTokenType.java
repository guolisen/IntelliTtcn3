package com.intelliTtcn3.psi;

import com.intellij.psi.tree.IElementType;
import com.intelliTtcn3.TtcnLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TtcnTokenType extends IElementType {
    public TtcnTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TtcnLanguage.INSTANCE);
    }
    @Override
    public String toString() {
        return "tTtcnTokenType." + super.toString();
    }
}