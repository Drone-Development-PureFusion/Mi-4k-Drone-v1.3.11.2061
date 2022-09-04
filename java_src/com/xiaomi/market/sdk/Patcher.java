package com.xiaomi.market.sdk;

import android.util.Log;
/* loaded from: classes2.dex */
public class Patcher {
    private static final String TAG = "MarketPatcher";

    /* renamed from: aX */
    private static final String f32388aX = "sdk_patcher_jni";

    /* renamed from: a */
    public static int m5169a(String str, String str2, String str3) {
        return new Patcher().applyPatch(str, str2, str3);
    }

    /* renamed from: o */
    public static boolean m5168o() {
        try {
            System.loadLibrary(f32388aX);
            return true;
        } catch (Throwable th) {
            Log.e(TAG, "load patcher library failed : " + th.toString());
            return false;
        }
    }

    public native int applyPatch(String str, String str2, String str3);
}
