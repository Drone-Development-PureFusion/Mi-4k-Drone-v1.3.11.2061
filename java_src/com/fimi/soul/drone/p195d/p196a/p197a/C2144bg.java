package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.bg */
/* loaded from: classes.dex */
public class C2144bg extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6533a = 129;

    /* renamed from: c */
    public static final int f6534c = 19;
    private static final long serialVersionUID = 129;

    /* renamed from: d */
    public byte f6535d;

    /* renamed from: e */
    public byte f6536e;

    /* renamed from: f */
    public float f6537f;

    /* renamed from: g */
    public float f6538g;

    /* renamed from: h */
    public short f6539h;

    /* renamed from: i */
    public short f6540i;

    /* renamed from: j */
    public byte f6541j;

    /* renamed from: k */
    public byte f6542k;

    /* renamed from: l */
    public byte f6543l;

    /* renamed from: m */
    public byte f6544m;

    /* renamed from: n */
    public byte f6545n;

    public C2144bg() {
        this.f6910b = 129;
    }

    public C2144bg(C2196c c2196c) {
        this.f6910b = 129;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6535d = c2197d.m32739d();
        this.f6536e = c2197d.m32739d();
        this.f6537f = c2197d.m32734i();
        this.f6538g = c2197d.m32734i();
        this.f6539h = c2197d.m32738e();
        this.f6540i = c2197d.m32738e();
        this.f6541j = c2197d.m32739d();
        this.f6542k = c2197d.m32739d();
        this.f6543l = c2197d.m32739d();
        this.f6544m = c2197d.m32739d();
        this.f6545n = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 19;
        c2196c.f6913c = 129;
        return c2196c;
    }

    public String toString() {
        return "msg_PosionUplink_poi{PacketSequence=" + ((int) this.f6535d) + ", Opration_Code=" + ((int) this.f6536e) + ", POI_Longitude=" + this.f6537f + ", POI_Latitude=" + this.f6538g + ", POI_Altitude=" + ((int) this.f6539h) + ", Radius=" + ((int) this.f6540i) + ", speek=" + ((int) this.f6541j) + ", Start_Point_Pole_Angle=" + ((int) this.f6542k) + ", Paral=" + ((int) this.f6543l) + ", yaw_mode=" + ((int) this.f6544m) + ", report=" + ((int) this.f6545n) + C0494h.f735w;
    }
}
