package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.ads.C3392a;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.util.client.b */
/* loaded from: classes.dex */
public class C3784b {
    /* renamed from: a */
    public static void m26846a(String str) {
        if (m26847a(3)) {
            Log.d(C3392a.f13627b, str);
        }
    }

    /* renamed from: a */
    public static void m26845a(String str, Throwable th) {
        if (m26847a(3)) {
            Log.d(C3392a.f13627b, str, th);
        }
    }

    /* renamed from: a */
    public static boolean m26847a(int i) {
        return i >= 5 || Log.isLoggable(C3392a.f13627b, i);
    }

    /* renamed from: b */
    public static void m26844b(String str) {
        if (m26847a(6)) {
            Log.e(C3392a.f13627b, str);
        }
    }

    /* renamed from: b */
    public static void m26843b(String str, Throwable th) {
        if (m26847a(6)) {
            Log.e(C3392a.f13627b, str, th);
        }
    }

    /* renamed from: c */
    public static void m26842c(String str) {
        if (m26847a(4)) {
            Log.i(C3392a.f13627b, str);
        }
    }

    /* renamed from: c */
    public static void m26841c(String str, Throwable th) {
        if (m26847a(4)) {
            Log.i(C3392a.f13627b, str, th);
        }
    }

    /* renamed from: d */
    public static void m26840d(String str) {
        if (m26847a(5)) {
            Log.w(C3392a.f13627b, str);
        }
    }

    /* renamed from: d */
    public static void m26839d(String str, Throwable th) {
        if (m26847a(5)) {
            Log.w(C3392a.f13627b, str, th);
        }
    }
}
