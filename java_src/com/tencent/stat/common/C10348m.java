package com.tencent.stat.common;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;
/* renamed from: com.tencent.stat.common.m */
/* loaded from: classes2.dex */
class C10348m implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
