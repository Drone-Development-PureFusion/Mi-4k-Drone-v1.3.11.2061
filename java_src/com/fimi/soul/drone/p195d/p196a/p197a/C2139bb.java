package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bb */
/* loaded from: classes.dex */
public class C2139bb extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6495a = 4;

    /* renamed from: c */
    public static final int f6496c = 16;
    private static final long serialVersionUID = 4;

    /* renamed from: d */
    public float f6497d;

    /* renamed from: e */
    public float f6498e;

    /* renamed from: f */
    public float f6499f;

    /* renamed from: g */
    public byte f6500g;

    /* renamed from: h */
    public float f6501h;

    /* renamed from: i */
    public C2196c f6502i;

    /* renamed from: j */
    public byte f6503j;

    public C2139bb() {
        this.f6910b = 4;
    }

    public C2139bb(C2196c c2196c) {
        this.f6910b = 4;
        this.f6502i = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6497d = c2197d.m32734i();
        this.f6498e = c2197d.m32734i();
        this.f6499f = c2197d.m32733j();
        this.f6500g = c2197d.m32739d();
        this.f6501h = c2197d.m32734i();
        this.f6503j = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        return null;
    }

    public String toString() {
        return "msg_MessionState [HomeLongitude=" + this.f6497d + ", HomeLatitude=" + this.f6498e + ", HomeAltitude=" + this.f6499f + ", CurrentWaypoint=" + ((int) this.f6500g) + "]";
    }
}
