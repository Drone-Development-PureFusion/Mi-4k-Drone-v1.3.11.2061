package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.af */
/* loaded from: classes.dex */
public class C2116af extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6305a = 11;

    /* renamed from: c */
    public static final int f6306c = 3;
    private static final long serialVersionUID = 11;

    /* renamed from: d */
    public byte f6307d;

    /* renamed from: e */
    public byte f6308e;

    /* renamed from: f */
    public byte f6309f;

    /* renamed from: g */
    public byte f6310g;

    /* renamed from: h */
    public byte f6311h;

    /* renamed from: i */
    public byte f6312i;

    /* renamed from: j */
    public byte f6313j;

    public C2116af() {
        this.f6910b = 11;
    }

    public C2116af(C2196c c2196c) {
        this.f6910b = 11;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6307d = c2197d.m32739d();
        this.f6308e = c2197d.m32739d();
        this.f6309f = c2197d.m32739d();
        this.f6310g = c2197d.m32739d();
        this.f6311h = c2197d.m32739d();
        this.f6312i = c2197d.m32739d();
        this.f6313j = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = 11;
        return c2196c;
    }

    public String toString() {
        return "NewDroneModel{CtrlType=" + ((int) this.f6307d) + ", CtrlMode=" + ((int) this.f6308e) + ", WP_SPA=" + ((int) this.f6309f) + C0494h.f735w;
    }
}
