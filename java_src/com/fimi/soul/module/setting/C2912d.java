package com.fimi.soul.module.setting;

import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
/* renamed from: com.fimi.soul.module.setting.d */
/* loaded from: classes.dex */
public class C2912d {

    /* renamed from: a */
    public static final int f10394a = 7;

    /* renamed from: b */
    public static final int f10395b = 120;

    /* renamed from: c */
    public static final int f10396c = 30;

    /* renamed from: h */
    private static C2083a f10401h;

    /* renamed from: i */
    private static C2912d f10402i;

    /* renamed from: d */
    public static int f10397d = 16;

    /* renamed from: e */
    public static int f10398e = 17;

    /* renamed from: f */
    public static int f10399f = 0;

    /* renamed from: g */
    public static int f10400g = 1880;

    /* renamed from: j */
    private static boolean f10403j = false;

    /* renamed from: a */
    public static C2912d m29999a(C2083a c2083a) {
        f10401h = c2083a;
        if (f10402i == null) {
            f10402i = new C2912d();
        }
        f10403j = C1642c.m34885e().m34501p();
        return f10402i;
    }

    /* renamed from: b */
    private C2196c m29998b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 7;
        c2196c.f6913c = 134;
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) f10398e);
        c2196c.f6914d.m32749a(0.0f);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: b */
    private C2196c m29997b(float f) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 6;
        c2196c.f6913c = 134;
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) f10397d);
        c2196c.f6914d.m32749a(f);
        return c2196c;
    }

    /* renamed from: a */
    public void m30001a() {
        f10401h.mo32906ab().mo32587a(m29998b());
    }

    /* renamed from: a */
    public void m30000a(float f) {
        float f2 = 30.0f;
        float m34549e = f10403j ? (float) C1679t.m34549e(f) : f;
        if (m34549e >= 30.0f) {
            f2 = m34549e > 120.0f ? 120.0f : m34549e;
        }
        f10401h.mo32906ab().mo32587a(m29997b(f2));
    }
}
