package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.bq */
/* loaded from: classes.dex */
public class C2154bq extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6607a = 132;

    /* renamed from: c */
    public static final int f6608c = 12;
    private static final long serialVersionUID = 132;

    /* renamed from: d */
    public short f6609d;

    /* renamed from: e */
    public float f6610e;

    /* renamed from: f */
    public float f6611f;

    /* renamed from: g */
    public byte f6612g;

    /* renamed from: h */
    public byte f6613h;

    public C2154bq() {
        this.f6910b = 132;
    }

    public C2154bq(C2196c c2196c) {
        this.f6910b = 132;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6609d = c2197d.m32738e();
        this.f6610e = c2197d.m32734i();
        this.f6611f = c2197d.m32734i();
        this.f6612g = c2197d.m32739d();
        this.f6613h = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 12;
        c2196c.f6913c = 132;
        c2196c.f6914d.m32746a(this.f6609d);
        c2196c.f6914d.m32749a(this.f6610e);
        c2196c.f6914d.m32749a(this.f6611f);
        c2196c.f6914d.m32744b(this.f6612g);
        c2196c.f6914d.m32744b(this.f6613h);
        return c2196c;
    }

    public String toString() {
        return "msg_forbiddenpointUplink{number=" + ((int) this.f6609d) + ", Longitude=" + this.f6610e + ", Latitude=" + this.f6611f + ", Altitude=" + ((int) this.f6612g) + ", Operation_code=" + ((int) this.f6613h) + C0494h.f735w;
    }
}
