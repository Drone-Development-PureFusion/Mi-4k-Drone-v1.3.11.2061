package com.tencent.map.p262b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* renamed from: com.tencent.map.b.l */
/* loaded from: classes2.dex */
public final class C10188l {

    /* renamed from: b */
    private static C10188l f31530b;

    /* renamed from: a */
    private Context f31531a;

    private C10188l() {
    }

    /* renamed from: a */
    public static C10188l m5903a() {
        if (f31530b == null) {
            f31530b = new C10188l();
        }
        return f31530b;
    }

    /* renamed from: b */
    public static Context m5901b() {
        return m5903a().f31531a;
    }

    /* renamed from: c */
    public static boolean m5900c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) m5903a().f31531a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1) {
                    return true;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m5899d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) m5903a().f31531a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
        } catch (Exception e) {
        }
        return false;
    }

    /* renamed from: a */
    public final void m5902a(Context context) {
        if (this.f31531a == null) {
            this.f31531a = context.getApplicationContext();
        }
    }
}
