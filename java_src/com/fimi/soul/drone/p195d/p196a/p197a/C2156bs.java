package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bs */
/* loaded from: classes.dex */
public class C2156bs extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6620a = 99;

    /* renamed from: c */
    public static final int f6621c = 5;
    private static final long serialVersionUID = 99;

    /* renamed from: d */
    public byte f6622d;

    /* renamed from: e */
    public byte f6623e;

    /* renamed from: f */
    public byte f6624f;

    /* renamed from: g */
    public byte f6625g;

    /* renamed from: h */
    public byte f6626h;

    /* renamed from: i */
    public byte f6627i;

    public C2156bs() {
        this.f6910b = 99;
    }

    public C2156bs(C2196c c2196c) {
        this.f6910b = 99;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6622d = c2197d.m32739d();
        this.f6623e = c2197d.m32739d();
        this.f6624f = c2197d.m32739d();
        this.f6625g = c2197d.m32739d();
        this.f6626h = c2197d.m32739d();
        this.f6627i = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 5;
        c2196c.f6913c = 99;
        c2196c.f6914d.m32744b(this.f6622d);
        c2196c.f6914d.m32744b(this.f6623e);
        c2196c.f6914d.m32744b(this.f6624f);
        c2196c.f6914d.m32744b(this.f6625g);
        c2196c.f6914d.m32744b(this.f6626h);
        return c2196c;
    }

    public String toString() {
        return "msg_remotecontrol [ number1=" + ((int) this.f6622d) + ", number2=" + ((int) this.f6623e) + ", number3=" + ((int) this.f6624f) + ", number4=" + ((int) this.f6625g) + ", number5=" + ((int) this.f6626h) + "]";
    }
}
