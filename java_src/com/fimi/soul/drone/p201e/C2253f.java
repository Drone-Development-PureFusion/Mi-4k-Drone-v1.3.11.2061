package com.fimi.soul.drone.p201e;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.p197a.C2149bl;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3025e;
import com.fimi.soul.utils.C3103au;
import java.util.Map;
/* renamed from: com.fimi.soul.drone.e.f */
/* loaded from: classes.dex */
public class C2253f {

    /* renamed from: a */
    public static final C2149bl f7092a = new C2149bl();

    /* renamed from: b */
    public static C2196c f7093b = f7092a.mo32762b();

    static {
        f7092a.f6910b = 193;
    }

    /* renamed from: a */
    public static void m32554a() {
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m32553a(Context context) {
        PackageInfo m29183s = C3103au.m29183s(context);
        if (m29183s != null) {
            int i = m29183s.versionCode;
            String str = m29183s.versionName;
            f7092a.f6570e = (byte) i;
            try {
                String substring = str.substring(str.lastIndexOf(".") + 1, str.length());
                f7092a.f6571f = (byte) Integer.parseInt(substring);
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    public static void m32552a(C2083a c2083a) {
        f7092a.f6569d = (byte) 0;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: b */
    public static void m32551b(C2083a c2083a) {
        f7092a.f6569d = (byte) 1;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: c */
    public static void m32550c(C2083a c2083a) {
        f7092a.f6569d = (byte) 3;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: d */
    public static void m32549d(C2083a c2083a) {
        f7092a.f6569d = (byte) 10;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: e */
    public static void m32548e(C2083a c2083a) {
        f7092a.f6569d = (byte) -3;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: f */
    public static void m32547f(C2083a c2083a) {
        f7092a.f6569d = (byte) 5;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: g */
    public static void m32546g(C2083a c2083a) {
        f7092a.f6569d = (byte) 9;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: h */
    public static void m32545h(C2083a c2083a) {
        f7092a.f6569d = (byte) 6;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: i */
    public static void m32544i(C2083a c2083a) {
        f7092a.f6569d = (byte) 5;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: j */
    public static void m32543j(C2083a c2083a) {
        f7092a.f6569d = (byte) 8;
        c2083a.mo32906ab().mo32587a(f7092a.mo32762b());
    }

    /* renamed from: k */
    public static void m32542k(C2083a c2083a) {
        m32550c(c2083a);
        m32554a();
        m32551b(c2083a);
        m32554a();
        m32552a(c2083a);
        m32554a();
        m32546g(c2083a);
        m32554a();
        m32549d(c2083a);
        m32554a();
        m32545h(c2083a);
        m32554a();
    }

    /* renamed from: l */
    public static void m32541l(C2083a c2083a) {
        m32553a(c2083a.f5919d);
        Map<Integer, C3025e> m29611b = C3021a.m29616a().m29611b();
        if (!m29611b.containsKey(3)) {
            C2523d.m31374a(c2083a).m31370b(3);
            m32550c(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(1)) {
            C2523d.m31374a(c2083a).m31370b(1);
            m32551b(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(0)) {
            C2523d.m31374a(c2083a).m31370b(0);
            m32552a(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(9)) {
            C2523d.m31374a(c2083a).m31370b(9);
            m32546g(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(10)) {
            C2523d.m31374a(c2083a).m31370b(10);
            m32549d(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(6)) {
            C2523d.m31374a(c2083a).m31370b(6);
            m32545h(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(253)) {
            C2523d.m31374a(c2083a).m31370b(253);
            m32548e(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(5)) {
            C2523d.m31374a(c2083a).m31370b(5);
            m32544i(c2083a);
            m32554a();
        }
        if (!m29611b.containsKey(27)) {
            m32543j(c2083a);
            m32554a();
        }
    }
}
