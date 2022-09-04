package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.aq */
/* loaded from: classes.dex */
public class C2127aq extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6412a = 130;

    /* renamed from: c */
    public static final int f6413c = 19;
    private static final long serialVersionUID = 130;

    /* renamed from: d */
    public short f6414d;

    /* renamed from: e */
    public float f6415e;

    /* renamed from: f */
    public float f6416f;

    /* renamed from: g */
    public short f6417g;

    /* renamed from: h */
    public short f6418h;

    /* renamed from: i */
    public byte f6419i;

    /* renamed from: j */
    public byte f6420j;

    /* renamed from: k */
    public short f6421k;

    /* renamed from: l */
    private volatile C2196c f6422l;

    public C2127aq() {
        this.f6910b = 130;
    }

    public C2127aq(C2196c c2196c) {
        this.f6422l = c2196c;
        this.f6910b = 130;
        mo32763a(c2196c.f6914d);
    }

    /* renamed from: a */
    public C2196c m32872a() {
        return this.f6422l;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6414d = c2197d.m32738e();
        this.f6415e = c2197d.m32734i();
        this.f6416f = c2197d.m32734i();
        this.f6417g = c2197d.m32738e();
        this.f6418h = c2197d.m32738e();
        this.f6419i = c2197d.m32739d();
        this.f6420j = c2197d.m32739d();
        this.f6421k = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 19;
        c2196c.f6913c = 130;
        c2196c.f6914d.m32746a(this.f6414d);
        c2196c.f6914d.m32749a(this.f6415e);
        c2196c.f6914d.m32749a(this.f6416f);
        c2196c.f6914d.m32746a(this.f6417g);
        c2196c.f6914d.m32746a(this.f6418h);
        c2196c.f6914d.m32746a(this.f6419i);
        c2196c.f6914d.m32744b(this.f6420j);
        c2196c.f6914d.m32746a(this.f6421k);
        return c2196c;
    }

    public String toString() {
        return "msg_SettingWaypointUplink [number=" + ((int) this.f6414d) + ", Longitude=" + this.f6415e + ", Latitude=" + this.f6416f + ", Altitude=" + ((int) this.f6417g) + ", yaw_angle=" + ((int) this.f6418h) + ", hover_time=" + ((int) this.f6419i) + ", speed=" + ((int) this.f6420j) + ", Number_to_be_transmited=" + ((int) this.f6421k) + "]";
    }
}
