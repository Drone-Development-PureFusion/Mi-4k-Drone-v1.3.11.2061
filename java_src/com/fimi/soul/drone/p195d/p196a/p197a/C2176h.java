package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.AbstractC2108a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.drone.p205i.C2349j;
/* renamed from: com.fimi.soul.drone.d.a.a.h */
/* loaded from: classes.dex */
public final class C2176h {
    /* renamed from: a */
    public static C2175g m32830a(int i, C2196c c2196c) {
        AbstractC2108a c2349j;
        switch (i) {
            case 49:
                c2349j = new C2349j();
                break;
            case 50:
                c2349j = new C2338h();
                break;
            case 51:
                c2349j = new C2349j();
                break;
            default:
                c2349j = null;
                break;
        }
        if (c2349j != null) {
            c2349j.mo32434a(i);
            C2175g c2175g = new C2175g(c2349j);
            c2175g.f6910b = i;
            c2175g.mo32763a(c2196c.f6914d);
            return c2175g;
        }
        return null;
    }

    /* renamed from: a */
    public static C2196c m32831a(int i, int i2, C2197d c2197d) {
        C2196c c2196c = new C2196c(c2197d);
        c2196c.f6912b = i;
        c2196c.f6913c = i2;
        return c2196c;
    }

    /* renamed from: a */
    public static C2196c m32829a(int i, byte[] bArr) {
        C2196c c2196c = new C2196c(m32828a(bArr));
        c2196c.f6912b = bArr.length;
        c2196c.f6913c = i;
        return c2196c;
    }

    /* renamed from: a */
    public static C2197d m32828a(byte[] bArr) {
        C2197d c2197d = new C2197d();
        for (byte b : bArr) {
            c2197d.m32744b(b);
        }
        return c2197d;
    }
}
