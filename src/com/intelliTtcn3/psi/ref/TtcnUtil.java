package com.intelliTtcn3.psi.ref;

import com.intelliTtcn3.psi.TtcnModuleName;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.intelliTtcn3.psi.TtcnFile;
import com.intelliTtcn3.psi.TtcnConstVarName;
import com.intelliTtcn3.TtcnFileType;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TtcnUtil {
    public static <T extends PsiElement> List<T> findElementInProject(Project project, String key, Class<T> className) {
        List<T> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, TtcnFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            TtcnFile ttcnFile = (TtcnFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (ttcnFile != null) {
                Collection<T> properties = PsiTreeUtil.collectElementsOfType(ttcnFile, className);
                for (T property : properties) {
                    String ttt = property.getText();
                    if (key.equals(ttt.substring(0, ttt.length() - 1))) {
                        if (result == null) {
                            result = new ArrayList<T>();
                        }
                        result.add(property);
                    }
                }
            }
        }
        return result != null ? result : Collections.<T>emptyList();
    }

    public static <T extends PsiElement> List<T> findElementInLocalFile(Project project, TtcnFile ttcnFile, String key, Class<T> className) {
        List<T> result = null;
        Collection<VirtualFile> virtualFiles = ttcnFile.getImportFileList(project);
        if (virtualFiles == null)
            return result;
        for (VirtualFile virtualFile : virtualFiles) {
            TtcnFile ttcnImportFile = (TtcnFile) PsiManager.getInstance(project).findFile(virtualFile);

            if (ttcnImportFile != null) {
                Collection<T> properties = PsiTreeUtil.collectElementsOfType(ttcnImportFile, className);
                for (T property : properties) {
                    String ttt = property.getText();
                    if (key.equals(ttt.substring(0, ttt.length() - 1))) {
                        if (result == null) {
                            result = new ArrayList<T>();
                        }
                        result.add(property);
                    }
                }
            }
        }
        return result != null ? result : Collections.<T>emptyList();
    }

    public static <T extends PsiElement> List<T> findElementInFilePool(Project project, Collection<VirtualFile> filePool, String key, Class<T> className) {
        List<T> result = null;
        for (VirtualFile virtualFile : filePool) {
            TtcnFile ttcnFile = (TtcnFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (ttcnFile != null) {
                Collection<T> properties = PsiTreeUtil.collectElementsOfType(ttcnFile, className);
                if (properties != null) {
                    for (T property : properties) {
                        String ttt = property.getText();
                        if (key.equals(ttt.substring(0, ttt.length() - 1))) {
                            if (result == null) {
                                result = new ArrayList<T>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<T>emptyList();
    }

    public static <T extends PsiElement> List<T> findElementInProject(Project project, Class<T> className) {
        List<T> result = new ArrayList<T>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, TtcnFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            TtcnFile ttcnFile = (TtcnFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (ttcnFile != null) {
                T[] properties = PsiTreeUtil.getChildrenOfType(ttcnFile, className);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }

    public static Collection<VirtualFile> collectImportFile(Project project, TtcnFile ttcnFile) {
        Collection<VirtualFile> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, TtcnFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        Collection<TtcnModuleName> moduleNamePool = PsiTreeUtil.collectElementsOfType(ttcnFile, TtcnModuleName.class);

        for (TtcnModuleName moduleName : moduleNamePool) {
            String nameStr = moduleName.getText();
            String nameStrWithOutSp = nameStr.substring(0, nameStr.length() - 1);
            for (VirtualFile file : virtualFiles) {
                String fileName = file.getName();
                String fileNameWithOutExt = fileName.substring(0, fileName.length() - 6);
                if (fileNameWithOutExt.equals(nameStrWithOutSp))
                {
                    if(result == null)
                        result = new ArrayList<VirtualFile>();
                    result.add(file);
                }
            }
        }

        return result;
    }

    public static <T extends PsiElement, V extends PsiElement> V findFromRootElementInLocalFile(Project project, PsiElement element, String key, Class<T> rootClass, Class<V> targetClass) {
        T parent = PsiTreeUtil.getParentOfType(element, rootClass);
        if (parent == null)
            return null;

        Collection<V> funcParNames =  PsiTreeUtil.collectElementsOfType(parent, targetClass);
        if (funcParNames == null)
            return null;

        for (V name : funcParNames) {
            String nameStr = name.getText();
            String nameStrWithOutSp = nameStr.substring(0, nameStr.length() - 1);
            //String keyWithOutSp = key.substring(0, nameStr.length() - 1);

            if (key.equals(nameStr))
            {
                return name;
            }
        }

        return null;
    }

}