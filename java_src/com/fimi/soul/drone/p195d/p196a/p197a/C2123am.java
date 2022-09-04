package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.am */
/* loaded from: classes.dex */
public class C2123am extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6366a = 106;

    /* renamed from: c */
    public static final int f6367c = 1;
    private static final long serialVersionUID = 106;

    /* renamed from: d */
    public byte f6368d;

    public C2123am() {
        this.f6910b = 106;
    }

    public C2123am(C2196c c2196c) {
        this.f6910b = 106;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6368d = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 1;
        c2196c.f6913c = 106;
        c2196c.f6914d.m32744b(this.f6368d);
        return c2196c;
    }
}
