package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bh */
/* loaded from: classes.dex */
public class C2145bh extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6546a = 1;

    /* renamed from: c */
    public static final int f6547c = 10;
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    public short f6548d;

    /* renamed from: e */
    public short f6549e;

    /* renamed from: f */
    public short f6550f;

    /* renamed from: g */
    public short f6551g;

    /* renamed from: h */
    public short f6552h;

    public C2145bh() {
        this.f6910b = 1;
    }

    public C2145bh(C2196c c2196c) {
        this.f6910b = 1;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6548d = c2197d.m32738e();
        this.f6549e = c2197d.m32738e();
        this.f6550f = c2197d.m32738e();
        this.f6551g = c2197d.m32738e();
        this.f6552h = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 10;
        c2196c.f6913c = 1;
        c2196c.f6914d.m32746a(this.f6548d);
        c2196c.f6914d.m32746a(this.f6549e);
        c2196c.f6914d.m32746a(this.f6550f);
        c2196c.f6914d.m32746a(this.f6551g);
        c2196c.f6914d.m32746a(this.f6552h);
        return c2196c;
    }

    public String toString() {
        return "MILINK_MSG_ID_RCDATA - rc1:" + ((int) this.f6548d) + " rc2:" + ((int) this.f6549e) + " rc3:" + ((int) this.f6550f) + " rc4:" + ((int) this.f6551g) + " rc5:" + ((int) this.f6552h) + "";
    }
}
