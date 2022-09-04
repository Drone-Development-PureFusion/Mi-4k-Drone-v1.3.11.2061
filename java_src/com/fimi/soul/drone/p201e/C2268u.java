package com.fimi.soul.drone.p201e;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import java.util.Calendar;
/* renamed from: com.fimi.soul.drone.e.u */
/* loaded from: classes.dex */
public class C2268u {
    /* renamed from: a */
    public static void m32524a(C2083a c2083a) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 11;
        c2196c.f6913c = 18;
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(5);
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        int i5 = calendar.get(13);
        c2196c.f6914d.m32746a((short) i);
        c2196c.f6914d.m32744b((byte) (calendar.get(2) + 1));
        c2196c.f6914d.m32744b((byte) i2);
        c2196c.f6914d.m32744b((byte) i3);
        c2196c.f6914d.m32744b((byte) i4);
        c2196c.f6914d.m32744b((byte) i5);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2083a.mo32906ab().mo32587a(c2196c);
    }
}
