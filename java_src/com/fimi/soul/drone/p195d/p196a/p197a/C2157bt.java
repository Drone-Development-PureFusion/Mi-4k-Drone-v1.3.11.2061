package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bt */
/* loaded from: classes.dex */
public class C2157bt extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6628a = 100;

    /* renamed from: c */
    public static final int f6629c = 11;
    private static final long serialVersionUID = 100;

    /* renamed from: d */
    public byte f6630d;

    /* renamed from: e */
    public byte f6631e;

    /* renamed from: f */
    public byte f6632f;

    /* renamed from: g */
    public byte f6633g;

    /* renamed from: h */
    public byte f6634h;

    /* renamed from: i */
    public byte f6635i;

    /* renamed from: j */
    public byte f6636j;

    /* renamed from: k */
    public byte f6637k;

    /* renamed from: l */
    public byte f6638l;

    /* renamed from: m */
    public byte f6639m;

    /* renamed from: n */
    public byte f6640n;

    /* renamed from: o */
    public C2196c f6641o;

    public C2157bt() {
        this.f6910b = 100;
    }

    public C2157bt(C2196c c2196c) {
        this.f6641o = c2196c;
        this.f6910b = 100;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6630d = c2197d.m32739d();
        this.f6631e = c2197d.m32739d();
        this.f6632f = c2197d.m32739d();
        this.f6633g = c2197d.m32739d();
        this.f6634h = c2197d.m32739d();
        this.f6635i = c2197d.m32739d();
        this.f6636j = c2197d.m32739d();
        this.f6637k = c2197d.m32739d();
        this.f6638l = c2197d.m32739d();
        this.f6639m = c2197d.m32739d();
        this.f6640n = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 11;
        c2196c.f6913c = 100;
        c2196c.f6914d.m32744b(this.f6630d);
        c2196c.f6914d.m32744b(this.f6631e);
        c2196c.f6914d.m32744b(this.f6632f);
        c2196c.f6914d.m32744b(this.f6633g);
        c2196c.f6914d.m32744b(this.f6634h);
        c2196c.f6914d.m32744b(this.f6635i);
        c2196c.f6914d.m32744b(this.f6636j);
        c2196c.f6914d.m32744b(this.f6637k);
        c2196c.f6914d.m32744b(this.f6638l);
        c2196c.f6914d.m32744b(this.f6639m);
        c2196c.f6914d.m32744b(this.f6640n);
        return c2196c;
    }

    public String toString() {
        return "msg_simulatorINfo [ADC0=" + ((int) this.f6630d) + ", ADC1=" + ((int) this.f6631e) + ", ADC2=" + ((int) this.f6632f) + ", ADC3=" + ((int) this.f6633g) + ", ADC4=" + ((int) this.f6634h) + ", ADC5=" + ((int) this.f6635i) + ", battery=" + ((int) this.f6636j) + ", switch1=" + ((int) this.f6637k) + ", switch2=" + ((int) this.f6638l) + ", left3=" + ((int) this.f6639m) + ", right3=" + ((int) this.f6640n) + "]";
    }
}
