package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.AbstractC3849e;
@Deprecated
/* renamed from: com.google.android.gms.analytics.internal.f */
/* loaded from: classes.dex */
public class C3892f {

    /* renamed from: a */
    private static volatile AbstractC3849e f15086a;

    static {
        m26296a(new C3875ai());
    }

    /* renamed from: a */
    public static AbstractC3849e m26298a() {
        return f15086a;
    }

    /* renamed from: a */
    public static void m26296a(AbstractC3849e abstractC3849e) {
        f15086a = abstractC3849e;
    }

    /* renamed from: a */
    public static void m26295a(String str) {
        C3893g m26287b = C3893g.m26287b();
        if (m26287b != null) {
            m26287b.s(str);
        } else if (m26297a(1)) {
            Log.i(C3882ao.f15038c.m26339a(), str);
        }
        AbstractC3849e abstractC3849e = f15086a;
        if (abstractC3849e != null) {
            abstractC3849e.mo9145b(str);
        }
    }

    /* renamed from: a */
    public static void m26294a(String str, Object obj) {
        String str2;
        C3893g m26287b = C3893g.m26287b();
        if (m26287b != null) {
            m26287b.e(str, obj);
        } else if (m26297a(3)) {
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                str2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length()).append(str).append(":").append(valueOf).toString();
            } else {
                str2 = str;
            }
            Log.e(C3882ao.f15038c.m26339a(), str2);
        }
        AbstractC3849e abstractC3849e = f15086a;
        if (abstractC3849e != null) {
            abstractC3849e.mo9143d(str);
        }
    }

    /* renamed from: a */
    public static boolean m26297a(int i) {
        return m26298a() != null && m26298a().mo9150a() <= i;
    }

    /* renamed from: b */
    public static void m26293b(String str) {
        C3893g m26287b = C3893g.m26287b();
        if (m26287b != null) {
            m26287b.q(str);
        } else if (m26297a(0)) {
            Log.v(C3882ao.f15038c.m26339a(), str);
        }
        AbstractC3849e abstractC3849e = f15086a;
        if (abstractC3849e != null) {
            abstractC3849e.mo9147a(str);
        }
    }

    /* renamed from: c */
    public static void m26292c(String str) {
        C3893g m26287b = C3893g.m26287b();
        if (m26287b != null) {
            m26287b.t(str);
        } else if (m26297a(2)) {
            Log.w(C3882ao.f15038c.m26339a(), str);
        }
        AbstractC3849e abstractC3849e = f15086a;
        if (abstractC3849e != null) {
            abstractC3849e.mo9144c(str);
        }
    }
}
