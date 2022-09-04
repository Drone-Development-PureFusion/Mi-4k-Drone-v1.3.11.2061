package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.az */
/* loaded from: classes.dex */
public class C2136az extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6481a = 147;

    /* renamed from: c */
    public static final int f6482c = 4;
    private static final long serialVersionUID = 147;

    /* renamed from: d */
    public short f6483d;

    /* renamed from: e */
    public byte f6484e;

    /* renamed from: f */
    public byte f6485f;

    public C2136az() {
        this.f6910b = 147;
    }

    public C2136az(C2196c c2196c) {
        this.f6910b = 147;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6483d = c2197d.m32738e();
        this.f6484e = c2197d.m32739d();
        this.f6485f = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 4;
        c2196c.f6913c = 147;
        c2196c.f6914d.m32746a(this.f6483d);
        c2196c.f6914d.m32744b(this.f6484e);
        c2196c.f6914d.m32744b(this.f6485f);
        return c2196c;
    }

    public String toString() {
        return "msg_Gohome [Packet_sequence=" + ((int) this.f6483d) + "]";
    }
}
