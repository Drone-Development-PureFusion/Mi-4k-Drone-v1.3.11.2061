package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import com.fimi.soul.drone.p205i.C2300af;
/* renamed from: com.fimi.soul.drone.d.a.a.av */
/* loaded from: classes.dex */
public class C2132av extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6450a = 16;

    /* renamed from: c */
    public static final int f6451c = 112;

    /* renamed from: d */
    public static final int f6452d = 113;

    /* renamed from: g */
    private static final int f6453g = 3;

    /* renamed from: e */
    public C2196c f6454e;

    /* renamed from: f */
    private C2300af f6455f;

    public C2132av(int i) {
        this.f6910b = i;
    }

    public C2132av(C2196c c2196c, int i) {
        this.f6910b = i;
        this.f6454e = c2196c;
        mo32763a(c2196c.f6914d);
    }

    /* renamed from: a */
    public C2300af m32871a() {
        return this.f6455f;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        this.f6455f = new C2300af(null);
        c2197d.m32741c();
        c2197d.m32739d();
        this.f6455f.m32339a(c2197d.m32739d());
        this.f6455f.m32338a(c2197d.m32739d());
        this.f6455f.m32336b(c2197d.m32739d());
    }

    /* renamed from: a */
    public void m32870a(C2300af c2300af) {
        this.f6455f = c2300af;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = this.f6910b;
        c2196c.f6914d.m32744b(this.f6455f.m32340a());
        c2196c.f6914d.m32744b((byte) this.f6455f.m32337b());
        c2196c.f6914d.m32744b(this.f6455f.m32335c());
        return c2196c;
    }
}
