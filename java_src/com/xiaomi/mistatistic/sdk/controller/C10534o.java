package com.xiaomi.mistatistic.sdk.controller;

import android.util.Log;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.o */
/* loaded from: classes2.dex */
public class C10534o {

    /* renamed from: a */
    private static boolean f32688a = false;

    /* renamed from: a */
    public static void m4824a() {
        f32688a = true;
    }

    /* renamed from: a */
    public void m4823a(String str) {
        if (f32688a) {
            Log.v("MI_STAT", str);
        }
    }

    /* renamed from: a */
    public void m4822a(String str, Throwable th) {
        if (f32688a) {
            Log.e("MI_STAT", str, th);
        }
    }
}
