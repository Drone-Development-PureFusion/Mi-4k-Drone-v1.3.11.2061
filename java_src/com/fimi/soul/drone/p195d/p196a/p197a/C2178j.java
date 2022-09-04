package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.j */
/* loaded from: classes.dex */
public class C2178j extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6762a = 37;

    /* renamed from: c */
    public static final int f6763c = 25;
    private static final long serialVersionUID = 37;

    /* renamed from: d */
    public byte f6764d;

    /* renamed from: e */
    public byte f6765e;

    /* renamed from: f */
    public short f6766f;

    /* renamed from: g */
    public short f6767g;

    /* renamed from: h */
    public short f6768h;

    /* renamed from: i */
    public C2196c f6769i;

    public C2178j() {
        this.f6910b = 37;
    }

    public C2178j(C2196c c2196c) {
        this.f6910b = 37;
        this.f6769i = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32740c(3);
        this.f6765e = c2197d.m32739d();
        this.f6766f = c2197d.m32738e();
        this.f6767g = c2197d.m32738e();
        this.f6768h = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 25;
        c2196c.f6913c = 37;
        return c2196c;
    }

    public String toString() {
        return "CompassInfoDwonLink{compassOneX=" + ((int) this.f6766f) + ", compassOneY=" + ((int) this.f6767g) + ", compassOneZ=" + ((int) this.f6768h) + ", miLinkPacket=" + this.f6769i + C0494h.f735w;
    }
}
