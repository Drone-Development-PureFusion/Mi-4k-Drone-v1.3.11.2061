package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bn */
/* loaded from: classes.dex */
public class C2151bn extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6583a = 131;

    /* renamed from: c */
    public static final int f6584c = 20;
    private static final long serialVersionUID = 131;

    /* renamed from: d */
    public short f6585d;

    /* renamed from: e */
    public float f6586e;

    /* renamed from: f */
    public float f6587f;

    /* renamed from: g */
    public short f6588g;

    /* renamed from: h */
    public short f6589h;

    /* renamed from: i */
    public byte f6590i;

    /* renamed from: j */
    public byte f6591j;

    /* renamed from: k */
    public byte f6592k;

    /* renamed from: l */
    public short f6593l;

    public C2151bn() {
        this.f6910b = 131;
    }

    public C2151bn(C2196c c2196c) {
        this.f6910b = 131;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6585d = c2197d.m32738e();
        this.f6586e = c2197d.m32734i();
        this.f6587f = c2197d.m32734i();
        this.f6588g = c2197d.m32738e();
        this.f6589h = c2197d.m32738e();
        this.f6590i = c2197d.m32739d();
        this.f6591j = c2197d.m32739d();
        this.f6592k = c2197d.m32739d();
        this.f6593l = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 20;
        c2196c.f6913c = 131;
        c2196c.f6914d.m32746a(this.f6585d);
        c2196c.f6914d.m32749a(this.f6586e);
        c2196c.f6914d.m32749a(this.f6587f);
        c2196c.f6914d.m32746a(this.f6588g);
        c2196c.f6914d.m32746a(this.f6589h);
        c2196c.f6914d.m32744b(this.f6590i);
        c2196c.f6914d.m32744b(this.f6592k);
        c2196c.f6914d.m32746a(this.f6593l);
        return c2196c;
    }

    public String toString() {
        return "msg_SettingWaypointUplink [number=" + ((int) this.f6585d) + ", Longitude=" + this.f6586e + ", Latitude=" + this.f6587f + ", Altitude=" + ((int) this.f6588g) + ", yaw_angle=" + ((int) this.f6589h) + ", hover_time=" + ((int) this.f6590i) + ", report=" + ((int) this.f6592k) + ", Number_to_be_transmited=" + ((int) this.f6593l) + "]";
    }
}
