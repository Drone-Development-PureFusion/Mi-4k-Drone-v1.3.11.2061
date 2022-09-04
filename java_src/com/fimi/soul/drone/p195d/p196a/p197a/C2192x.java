package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.x */
/* loaded from: classes.dex */
public class C2192x extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6875a = 41;

    /* renamed from: c */
    public static final int f6876c = 25;
    private static final long serialVersionUID = 41;

    /* renamed from: d */
    public byte f6877d;

    /* renamed from: e */
    public byte f6878e;

    /* renamed from: f */
    public short f6879f;

    /* renamed from: g */
    public short f6880g;

    /* renamed from: h */
    public short f6881h;

    /* renamed from: i */
    public short f6882i;

    /* renamed from: j */
    public short f6883j;

    /* renamed from: k */
    public short f6884k;

    /* renamed from: l */
    public byte f6885l;

    /* renamed from: m */
    public C2196c f6886m;

    public C2192x() {
        this.f6910b = 41;
    }

    public C2192x(C2196c c2196c) {
        this.f6910b = 41;
        this.f6886m = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32740c(3);
        this.f6878e = c2197d.m32739d();
        this.f6879f = c2197d.m32738e();
        this.f6880g = c2197d.m32738e();
        this.f6881h = c2197d.m32738e();
        this.f6882i = c2197d.m32738e();
        this.f6883j = c2197d.m32738e();
        this.f6884k = c2197d.m32738e();
        c2197d.m32740c(24);
        this.f6885l = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 25;
        c2196c.f6913c = 41;
        return c2196c;
    }

    public String toString() {
        return "IMUInfoDwonLink{gyroX=" + ((int) this.f6879f) + ", gyroY=" + ((int) this.f6880g) + ", gyroZ=" + ((int) this.f6881h) + ", accelX=" + ((int) this.f6882i) + ", accelY=" + ((int) this.f6883j) + ", accelZ=" + ((int) this.f6884k) + ", CMD_ACK=" + ((int) this.f6885l) + ", miLinkPacket=" + this.f6886m + C0494h.f735w;
    }
}
