package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bx */
/* loaded from: classes.dex */
public class C2161bx extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6664a = 199;

    /* renamed from: c */
    public static final int f6665c = 3;
    private static final long serialVersionUID = 199;

    /* renamed from: d */
    public byte f6666d;

    /* renamed from: e */
    public byte f6667e;

    /* renamed from: f */
    public byte f6668f;

    public C2161bx() {
        this.f6910b = 199;
    }

    public C2161bx(C2196c c2196c) {
        this.f6910b = 199;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = 199;
        c2196c.f6914d.m32744b(this.f6666d);
        c2196c.f6914d.m32744b(this.f6667e);
        c2196c.f6914d.m32744b(this.f6668f);
        return c2196c;
    }

    public String toString() {
        return "updateOrder [Packet_sequence=, target_ID=" + ((int) this.f6666d) + "]";
    }
}
