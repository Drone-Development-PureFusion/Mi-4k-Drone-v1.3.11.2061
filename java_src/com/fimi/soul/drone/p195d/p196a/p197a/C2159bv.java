package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bv */
/* loaded from: classes.dex */
public class C2159bv extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6654a = 200;

    /* renamed from: c */
    public static final int f6655c = 3;
    private static final long serialVersionUID = 200;

    /* renamed from: d */
    public byte f6656d;

    /* renamed from: e */
    public byte f6657e;

    /* renamed from: f */
    public byte f6658f;

    public C2159bv() {
        this.f6910b = 200;
    }

    public C2159bv(C2196c c2196c) {
        this.f6910b = 200;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6656d = c2197d.m32739d();
        this.f6657e = c2197d.m32739d();
        this.f6658f = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = 200;
        c2196c.f6914d.m32744b(this.f6656d);
        c2196c.f6914d.m32744b(this.f6657e);
        c2196c.f6914d.m32744b(this.f6658f);
        return c2196c;
    }

    public String toString() {
        return "updateOrderbackreport [Packet_sequence=" + ((int) this.f6656d) + ", target_ID=" + ((int) this.f6657e) + ", report=" + ((int) this.f6658f) + "]";
    }
}
