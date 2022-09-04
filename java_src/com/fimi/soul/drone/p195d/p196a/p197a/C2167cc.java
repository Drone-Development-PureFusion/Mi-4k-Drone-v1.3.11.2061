package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.cc */
/* loaded from: classes.dex */
public class C2167cc extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6696a = 203;

    /* renamed from: c */
    public static final int f6697c = 2;
    private static final long serialVersionUID = 203;

    /* renamed from: d */
    public byte f6698d;

    /* renamed from: e */
    public byte f6699e;

    public C2167cc() {
        this.f6910b = 203;
    }

    public C2167cc(C2196c c2196c) {
        this.f6910b = 203;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6698d = c2197d.m32739d();
        this.f6699e = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 2;
        c2196c.f6913c = 203;
        c2196c.f6914d.m32744b(this.f6698d);
        c2196c.f6914d.m32744b(this.f6699e);
        return c2196c;
    }

    public String toString() {
        return "updatedronefinishCRC [target_ID=" + ((int) this.f6698d) + ", report=" + ((int) this.f6699e) + "]";
    }
}
