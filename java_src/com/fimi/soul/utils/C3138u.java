package com.fimi.soul.utils;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: com.fimi.soul.utils.u */
/* loaded from: classes.dex */
public class C3138u {
    /* renamed from: a */
    public static String[] m29025a() {
        return m29024a(C3129m.m29064c(), new FilenameFilter() { // from class: com.fimi.soul.utils.u.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.contains(".txt");
            }
        });
    }

    /* renamed from: a */
    public static String[] m29024a(String str, FilenameFilter filenameFilter) {
        File file = new File(str);
        try {
            file.mkdirs();
            if (file.exists()) {
                return file.list(filenameFilter);
            }
        } catch (SecurityException e) {
        }
        return new String[0];
    }

    /* renamed from: b */
    public static String[] m29023b() {
        return m29024a(C3129m.m29067b(), new FilenameFilter() { // from class: com.fimi.soul.utils.u.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.contains(".param");
            }
        });
    }

    /* renamed from: c */
    public static String[] m29022c() {
        return m29024a(C3129m.m29063d(), new FilenameFilter() { // from class: com.fimi.soul.utils.u.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.contains(".kml") || str.contains(".kmz");
            }
        });
    }

    /* renamed from: d */
    public static String[] m29021d() {
        return m29024a(C3129m.m29060g(), new FilenameFilter() { // from class: com.fimi.soul.utils.u.4
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.contains(".xml");
            }
        });
    }
}
