package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.cb */
/* loaded from: classes.dex */
public class C2166cb extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6691a = 202;

    /* renamed from: c */
    public static final int f6692c = 4;
    private static final long serialVersionUID = 202;

    /* renamed from: d */
    public byte f6693d;

    /* renamed from: e */
    public int f6694e;

    /* renamed from: f */
    public byte f6695f;

    public C2166cb() {
        this.f6910b = 202;
    }

    public C2166cb(C2196c c2196c) {
        this.f6910b = 202;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6693d = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 4;
        c2196c.f6913c = 202;
        c2196c.f6914d.m32744b(this.f6693d);
        c2196c.f6914d.m32744b(this.f6695f);
        c2196c.f6914d.m32744b(this.f6695f);
        c2196c.f6914d.m32744b(this.f6695f);
        return c2196c;
    }
}
