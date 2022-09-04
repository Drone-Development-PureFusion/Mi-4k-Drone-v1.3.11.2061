package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.ce */
/* loaded from: classes.dex */
public class C2169ce extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6704a = 203;

    /* renamed from: c */
    public static final int f6705c = 1;
    private static final long serialVersionUID = 203;

    /* renamed from: d */
    public byte f6706d;

    public C2169ce() {
        this.f6910b = 203;
    }

    public C2169ce(C2196c c2196c) {
        this.f6910b = 203;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6706d = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 1;
        c2196c.f6913c = 203;
        c2196c.f6914d.m32744b(this.f6706d);
        return c2196c;
    }

    public String toString() {
        return "updatedronefinishbackCRC [report=" + ((int) this.f6706d) + "]";
    }
}
