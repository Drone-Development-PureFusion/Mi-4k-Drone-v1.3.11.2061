package com.fimi.kernel.utils;

import java.io.File;
import java.io.IOException;
/* renamed from: com.fimi.kernel.utils.u */
/* loaded from: classes.dex */
public class C1680u {
    /* renamed from: a */
    public static String m34548a(File file) {
        try {
            return C1672m.m34669a(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34547a(String str) {
        return m34548a(new File(str));
    }
}
