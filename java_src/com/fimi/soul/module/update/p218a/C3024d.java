package com.fimi.soul.module.update.p218a;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
/* renamed from: com.fimi.soul.module.update.a.d */
/* loaded from: classes.dex */
public class C3024d {
    /* renamed from: a */
    public static C2196c m29574a(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 204;
        c2196c.f6912b = 2;
        c2196c.f6914d.m32744b((byte) i);
        c2196c.f6914d.m32744b((byte) 2);
        return c2196c;
    }

    /* renamed from: a */
    public static void m29573a(C2083a c2083a) {
        m29572a(c2083a, 0);
        m29572a(c2083a, 9);
        m29572a(c2083a, 10);
        m29572a(c2083a, 6);
        m29572a(c2083a, 3);
        m29572a(c2083a, 1);
    }

    /* renamed from: a */
    public static void m29572a(C2083a c2083a, int i) {
        try {
            c2083a.mo32906ab().mo32587a(m29574a(i));
            Thread.sleep(200L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
