package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.u */
/* loaded from: classes.dex */
public class C2189u extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6847a = 133;

    /* renamed from: c */
    public static final int f6848c = 16;
    private static final long serialVersionUID = 133;

    /* renamed from: d */
    public byte f6849d;

    /* renamed from: e */
    public byte f6850e;

    /* renamed from: f */
    public float f6851f;

    /* renamed from: g */
    public float f6852g;

    /* renamed from: h */
    public short f6853h;

    /* renamed from: i */
    public byte f6854i;

    /* renamed from: j */
    public byte f6855j;

    /* renamed from: k */
    public byte f6856k;

    /* renamed from: l */
    public byte f6857l;

    public C2189u() {
        this.f6910b = 133;
    }

    public C2189u(C2196c c2196c) {
        this.f6910b = 133;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6849d = c2197d.m32739d();
        this.f6850e = c2197d.m32739d();
        this.f6851f = c2197d.m32734i();
        this.f6852g = c2197d.m32734i();
        this.f6853h = c2197d.m32738e();
        this.f6854i = c2197d.m32739d();
        this.f6855j = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 16;
        c2196c.f6913c = 133;
        c2196c.f6914d.m32746a(this.f6849d);
        c2196c.f6914d.m32749a(this.f6851f);
        c2196c.f6914d.m32749a(this.f6852g);
        c2196c.f6914d.m32746a(this.f6853h);
        c2196c.f6914d.m32744b(this.f6854i);
        c2196c.f6914d.m32744b(this.f6855j);
        c2196c.f6914d.m32744b(this.f6856k);
        c2196c.f6914d.m32744b(this.f6857l);
        return c2196c;
    }
}
