package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.ae */
/* loaded from: classes.dex */
public class C2115ae extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6298a = 138;

    /* renamed from: c */
    public static final int f6299c = 8;
    private static final long serialVersionUID = 138;

    /* renamed from: d */
    public byte f6300d;

    /* renamed from: e */
    public byte f6301e;

    /* renamed from: f */
    public byte f6302f;

    /* renamed from: g */
    public byte f6303g;

    /* renamed from: h */
    public C2196c f6304h;

    public C2115ae() {
        this.f6910b = 138;
    }

    public C2115ae(C2196c c2196c) {
        this.f6910b = 138;
        this.f6304h = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32739d();
        this.f6300d = c2197d.m32739d();
        this.f6301e = c2197d.m32739d();
        this.f6302f = c2197d.m32739d();
        this.f6303g = c2197d.m32739d();
        c2197d.m32739d();
        c2197d.m32739d();
        c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        return null;
    }

    public String toString() {
        return "MsgEmergency{targetId=" + ((int) this.f6300d) + ", sourceId=" + ((int) this.f6301e) + ", cmdId=" + ((int) this.f6302f) + ", cmdCode=" + ((int) this.f6303g) + C0494h.f735w;
    }
}
