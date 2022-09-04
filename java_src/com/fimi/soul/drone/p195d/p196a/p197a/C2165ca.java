package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.ca */
/* loaded from: classes.dex */
public class C2165ca extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6686a = 201;

    /* renamed from: c */
    public static final int f6687c = 4;
    private static final long serialVersionUID = 201;

    /* renamed from: d */
    public byte f6688d;

    /* renamed from: e */
    public short f6689e;

    /* renamed from: f */
    public byte f6690f;

    public C2165ca() {
        this.f6910b = 201;
    }

    public C2165ca(C2196c c2196c) {
        this.f6910b = 201;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6688d = c2197d.m32739d();
        this.f6689e = c2197d.m32738e();
        this.f6690f = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 4;
        c2196c.f6913c = 201;
        c2196c.f6914d.m32744b(this.f6688d);
        c2196c.f6914d.m32746a(this.f6689e);
        c2196c.f6914d.m32744b(this.f6690f);
        return c2196c;
    }

    public String toString() {
        return "updatedronebackreport [Packet_sequence=" + ((int) this.f6689e) + ", report=" + ((int) this.f6690f) + "]";
    }
}
