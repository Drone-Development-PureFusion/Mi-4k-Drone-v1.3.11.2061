package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* renamed from: com.google.android.gms.internal.gh */
/* loaded from: classes2.dex */
public class C7029gh {
    @Nullable
    /* renamed from: a */
    public static String m15749a(@NonNull String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (invoke != null && String.class.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
