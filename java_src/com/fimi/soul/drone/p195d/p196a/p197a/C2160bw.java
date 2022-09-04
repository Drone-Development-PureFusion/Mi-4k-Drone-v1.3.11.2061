package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bw */
/* loaded from: classes.dex */
public class C2160bw extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6659a = 200;

    /* renamed from: c */
    public static final int f6660c = 6;
    private static final long serialVersionUID = 200;

    /* renamed from: d */
    public byte f6661d;

    /* renamed from: e */
    public byte f6662e;

    /* renamed from: f */
    public int f6663f;

    public C2160bw() {
        this.f6910b = 200;
    }

    public C2160bw(C2196c c2196c) {
        this.f6910b = 200;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6661d = c2197d.m32739d();
        this.f6662e = c2197d.m32739d();
        this.f6663f = c2197d.m32737f();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 6;
        c2196c.f6913c = 200;
        c2196c.f6914d.m32744b(this.f6661d);
        c2196c.f6914d.m32744b(this.f6662e);
        c2196c.f6914d.m32743b(this.f6663f);
        return c2196c;
    }

    public String toString() {
        return "updateDroneOrder [Packet_sequence=" + ((int) this.f6661d) + ", target_ID=" + ((int) this.f6662e) + ", length=" + this.f6663f + "]";
    }
}
