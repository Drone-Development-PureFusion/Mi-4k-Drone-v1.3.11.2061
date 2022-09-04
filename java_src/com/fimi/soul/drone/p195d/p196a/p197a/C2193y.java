package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.y */
/* loaded from: classes.dex */
public class C2193y extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6887a = 48;

    /* renamed from: c */
    public static final int f6888c = 25;
    private static final long serialVersionUID = 48;

    /* renamed from: d */
    public byte f6889d;

    /* renamed from: e */
    public byte f6890e;

    /* renamed from: f */
    public short f6891f;

    /* renamed from: g */
    public short f6892g;

    /* renamed from: h */
    public short f6893h;

    /* renamed from: i */
    public short f6894i;

    /* renamed from: j */
    public short f6895j;

    /* renamed from: k */
    public short f6896k;

    /* renamed from: l */
    public byte f6897l;

    /* renamed from: m */
    public C2196c f6898m;

    public C2193y() {
        this.f6910b = 48;
    }

    public C2193y(C2196c c2196c) {
        this.f6910b = 48;
        this.f6898m = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32740c(3);
        this.f6890e = c2197d.m32739d();
        this.f6891f = c2197d.m32738e();
        this.f6892g = c2197d.m32738e();
        this.f6893h = c2197d.m32738e();
        this.f6894i = c2197d.m32738e();
        this.f6895j = c2197d.m32738e();
        this.f6896k = c2197d.m32738e();
        c2197d.m32740c(24);
        this.f6897l = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 25;
        c2196c.f6913c = 48;
        return c2196c;
    }

    public String toString() {
        return "IMUInfoDwonLink{gyroX=" + ((int) this.f6891f) + ", gyroY=" + ((int) this.f6892g) + ", gyroZ=" + ((int) this.f6893h) + ", accelX=" + ((int) this.f6894i) + ", accelY=" + ((int) this.f6895j) + ", accelZ=" + ((int) this.f6896k) + ", CMD_ACK=" + ((int) this.f6897l) + ", miLinkPacket=" + this.f6898m + C0494h.f735w;
    }
}
