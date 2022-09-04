package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.k */
/* loaded from: classes.dex */
public class C2179k extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6770a = 134;

    /* renamed from: c */
    public static final int f6771c = 7;
    private static final long serialVersionUID = 134;

    /* renamed from: d */
    public byte f6772d;

    /* renamed from: e */
    public byte f6773e;

    /* renamed from: f */
    public float f6774f;

    /* renamed from: g */
    public byte f6775g;

    public C2179k() {
        this.f6910b = 134;
    }

    public C2179k(C2196c c2196c) {
        this.f6910b = 134;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6772d = c2197d.m32739d();
        this.f6773e = c2197d.m32739d();
        this.f6774f = c2197d.m32734i();
        this.f6775g = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 7;
        c2196c.f6913c = 134;
        c2196c.f6914d.m32744b(this.f6772d);
        c2196c.f6914d.m32744b(this.f6773e);
        c2196c.f6914d.m32749a(this.f6774f);
        c2196c.f6914d.m32744b(this.f6775g);
        return c2196c;
    }

    public String toString() {
        return "DroneRTHMessage{Packet_sequence=" + ((int) this.f6772d) + ", cmdID=" + ((int) this.f6773e) + ", height=" + this.f6774f + ", report=" + ((int) this.f6775g) + C0494h.f735w;
    }
}
