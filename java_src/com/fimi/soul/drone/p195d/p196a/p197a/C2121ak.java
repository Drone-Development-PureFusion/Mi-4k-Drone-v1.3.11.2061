package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.ak */
/* loaded from: classes.dex */
public class C2121ak extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6357a = 204;

    /* renamed from: c */
    public static final int f6358c = 3;
    private static final long serialVersionUID = 204;

    /* renamed from: d */
    public byte f6359d;

    /* renamed from: e */
    public byte f6360e;

    /* renamed from: f */
    public byte f6361f;

    public C2121ak() {
        this.f6910b = 204;
    }

    public C2121ak(C2196c c2196c) {
        this.f6910b = 204;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6359d = c2197d.m32739d();
        this.f6360e = c2197d.m32739d();
        this.f6361f = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = 204;
        c2196c.f6914d.m32744b(this.f6359d);
        c2196c.f6914d.m32744b(this.f6360e);
        c2196c.f6914d.m32744b(this.f6361f);
        return c2196c;
    }
}
