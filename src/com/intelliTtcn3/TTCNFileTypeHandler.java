package com.intelliTtcn3;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by qq on 2015/5/15.
 */
public class TTCNFileTypeHandler  extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(TTCNFileType.getInstance());
    }
}
