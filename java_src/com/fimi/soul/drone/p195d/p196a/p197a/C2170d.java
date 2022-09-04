package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.d */
/* loaded from: classes.dex */
public class C2170d extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6707a = 102;

    /* renamed from: c */
    public static final int f6708c = 4;
    private static final long serialVersionUID = 102;

    /* renamed from: d */
    public byte f6709d;

    /* renamed from: e */
    public byte f6710e;

    /* renamed from: f */
    public byte f6711f;

    /* renamed from: g */
    public byte f6712g;

    public C2170d() {
        this.f6910b = 102;
    }

    public C2170d(C2196c c2196c) {
        this.f6910b = 102;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6709d = c2197d.m32739d();
        this.f6710e = c2197d.m32739d();
        this.f6711f = c2197d.m32739d();
        this.f6712g = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 4;
        c2196c.f6913c = 102;
        c2196c.f6914d.m32744b(this.f6709d);
        c2196c.f6914d.m32744b(this.f6710e);
        c2196c.f6914d.m32744b(this.f6711f);
        c2196c.f6914d.m32744b(this.f6712g);
        return c2196c;
    }
}
