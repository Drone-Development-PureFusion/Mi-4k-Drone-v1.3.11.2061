package com.google.android.gms.common.util;

import android.util.Base64;
/* renamed from: com.google.android.gms.common.util.c */
/* loaded from: classes2.dex */
public final class C4680c {
    /* renamed from: a */
    public static String m23160a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m23159b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: c */
    public static String m23158c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
