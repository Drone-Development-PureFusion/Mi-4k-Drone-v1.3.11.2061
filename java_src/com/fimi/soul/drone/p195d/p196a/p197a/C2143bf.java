package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bf */
/* loaded from: classes.dex */
public class C2143bf extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6525a = 128;

    /* renamed from: c */
    public static final int f6526c = 13;
    private static final long serialVersionUID = 128;

    /* renamed from: d */
    public byte f6527d;

    /* renamed from: e */
    public double f6528e;

    /* renamed from: f */
    public double f6529f;

    /* renamed from: g */
    public short f6530g;

    /* renamed from: h */
    public byte f6531h;

    /* renamed from: i */
    public byte f6532i;

    public C2143bf() {
        this.f6910b = 128;
    }

    public C2143bf(C2196c c2196c) {
        this.f6910b = 128;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6527d = c2197d.m32739d();
        this.f6528e = c2197d.m32734i();
        this.f6529f = c2197d.m32734i();
        this.f6530g = c2197d.m32738e();
        this.f6531h = c2197d.m32739d();
        this.f6532i = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 13;
        c2196c.f6913c = 128;
        c2196c.f6914d.m32744b(this.f6527d);
        c2196c.f6914d.m32750a(this.f6528e);
        c2196c.f6914d.m32750a(this.f6529f);
        c2196c.f6914d.m32746a(this.f6530g);
        c2196c.f6914d.m32744b(this.f6531h);
        c2196c.f6914d.m32744b(this.f6532i);
        return c2196c;
    }

    public String toString() {
        return "msg_PosionUplink_home [MILINK_MSG_ID_RCDATA=128+PacketSequence=" + ((int) this.f6527d) + ", HomeLongitude=" + this.f6528e + ", HomeLatitude=" + this.f6529f + ", HomeAltitude=" + ((int) this.f6530g) + ", reserve=" + ((int) this.f6531h) + ", reserve2=" + ((int) this.f6532i) + "]";
    }
}
