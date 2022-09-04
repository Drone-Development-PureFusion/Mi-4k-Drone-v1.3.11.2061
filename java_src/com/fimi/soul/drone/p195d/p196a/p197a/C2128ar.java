package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.ar */
/* loaded from: classes.dex */
public class C2128ar extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6423a = 198;

    /* renamed from: c */
    public static final int f6424c = 10;
    private static final long serialVersionUID = 198;

    /* renamed from: d */
    public short f6425d;

    /* renamed from: e */
    public short f6426e;

    /* renamed from: f */
    public short f6427f;

    /* renamed from: g */
    public short f6428g;

    /* renamed from: h */
    public short f6429h;

    /* renamed from: i */
    public C2196c f6430i;

    public C2128ar() {
        this.f6910b = 198;
    }

    public C2128ar(C2196c c2196c) {
        this.f6910b = 198;
        this.f6430i = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6425d = c2197d.m32738e();
        this.f6426e = c2197d.m32738e();
        this.f6428g = c2197d.m32738e();
        this.f6429h = c2197d.m32738e();
        this.f6427f = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 10;
        c2196c.f6913c = 198;
        c2196c.f6914d.m32746a(this.f6425d);
        c2196c.f6914d.m32746a(this.f6426e);
        c2196c.f6914d.m32746a(this.f6428g);
        c2196c.f6914d.m32746a(this.f6429h);
        c2196c.f6914d.m32746a(this.f6427f);
        return c2196c;
    }

    public String toString() {
        return "msg_BatteryAnswerUplink [Battery_IDA=" + ((int) this.f6425d) + ", Battery_IDB=" + ((int) this.f6426e) + ", Cycle_count=" + ((int) this.f6427f) + ", Design_capacity=" + ((int) this.f6428g) + ", Full_charge_capacity=" + ((int) this.f6429h) + "]";
    }
}
