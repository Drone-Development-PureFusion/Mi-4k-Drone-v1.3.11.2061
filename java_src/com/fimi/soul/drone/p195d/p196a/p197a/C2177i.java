package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.i */
/* loaded from: classes.dex */
public class C2177i extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6751a = 39;

    /* renamed from: c */
    public static final int f6752c = 25;
    private static final long serialVersionUID = 39;

    /* renamed from: d */
    public byte f6753d;

    /* renamed from: e */
    public byte f6754e;

    /* renamed from: f */
    public short f6755f;

    /* renamed from: g */
    public short f6756g;

    /* renamed from: h */
    public short f6757h;

    /* renamed from: i */
    public short f6758i;

    /* renamed from: j */
    public short f6759j;

    /* renamed from: k */
    public short f6760k;

    /* renamed from: l */
    public C2196c f6761l;

    public C2177i() {
        this.f6910b = 39;
    }

    public C2177i(C2196c c2196c) {
        this.f6910b = 39;
        this.f6761l = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32740c(3);
        this.f6754e = c2197d.m32739d();
        this.f6755f = c2197d.m32738e();
        this.f6756g = c2197d.m32738e();
        this.f6757h = c2197d.m32738e();
        this.f6758i = c2197d.m32738e();
        this.f6759j = c2197d.m32738e();
        this.f6760k = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 25;
        c2196c.f6913c = 39;
        return c2196c;
    }

    public String toString() {
        return "CompassInfoDwonLink{compassOneX=" + ((int) this.f6755f) + ", compassOneY=" + ((int) this.f6756g) + ", compassOneZ=" + ((int) this.f6757h) + ", compassTwoX=" + ((int) this.f6758i) + ", compassTwoY=" + ((int) this.f6759j) + ", compassTwoZ=" + ((int) this.f6760k) + ", miLinkPacket=" + this.f6761l + C0494h.f735w;
    }
}
