package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.ay */
/* loaded from: classes.dex */
public class C2135ay extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6464a = 2;

    /* renamed from: c */
    public static final int f6465c = 19;
    private static final long serialVersionUID = 2;

    /* renamed from: d */
    public C2196c f6466d;

    /* renamed from: e */
    public byte f6467e;

    /* renamed from: f */
    public byte f6468f;

    /* renamed from: g */
    public byte f6469g;

    /* renamed from: h */
    public byte f6470h;

    /* renamed from: i */
    public byte f6471i;

    /* renamed from: j */
    public short f6472j;

    /* renamed from: k */
    public short f6473k;

    /* renamed from: l */
    public short f6474l;

    /* renamed from: m */
    public byte f6475m;

    /* renamed from: n */
    public byte f6476n;

    /* renamed from: o */
    public short f6477o;

    /* renamed from: p */
    public short f6478p;

    /* renamed from: q */
    public byte f6479q;

    /* renamed from: r */
    public byte f6480r;

    public C2135ay() {
        this.f6910b = 2;
    }

    public C2135ay(C2196c c2196c) {
        this.f6910b = 2;
        this.f6466d = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6467e = c2197d.m32739d();
        this.f6468f = c2197d.m32739d();
        this.f6469g = c2197d.m32739d();
        this.f6470h = c2197d.m32739d();
        this.f6471i = c2197d.m32739d();
        this.f6472j = c2197d.m32738e();
        this.f6473k = c2197d.m32738e();
        this.f6474l = c2197d.m32738e();
        this.f6475m = c2197d.m32739d();
        this.f6476n = c2197d.m32739d();
        this.f6477o = c2197d.m32738e();
        this.f6478p = c2197d.m32738e();
        this.f6479q = c2197d.m32739d();
        this.f6480r = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 19;
        c2196c.f6913c = 2;
        c2196c.f6914d.m32744b(this.f6467e);
        c2196c.f6914d.m32744b(this.f6468f);
        c2196c.f6914d.m32744b(this.f6469g);
        c2196c.f6914d.m32744b(this.f6470h);
        c2196c.f6914d.m32744b(this.f6471i);
        c2196c.f6914d.m32746a(this.f6472j);
        c2196c.f6914d.m32746a(this.f6473k);
        c2196c.f6914d.m32746a(this.f6474l);
        c2196c.f6914d.m32744b(this.f6475m);
        c2196c.f6914d.m32744b(this.f6476n);
        c2196c.f6914d.m32746a(this.f6477o);
        c2196c.f6914d.m32746a(this.f6478p);
        c2196c.f6914d.m32744b(this.f6479q);
        c2196c.f6914d.m32744b(this.f6480r);
        return c2196c;
    }

    public String toString() {
        return "msg_Heartbeat{Heartbeat=" + ((int) this.f6467e) + ", ThrottleStick=" + ((int) this.f6468f) + ", RollStick=" + ((int) this.f6469g) + ", PitchStick=" + ((int) this.f6470h) + ", YawStick=" + ((int) this.f6471i) + ", RollAngle=" + ((int) this.f6472j) + ", PitchAngle=" + ((int) this.f6473k) + ", HeadingAngle=" + ((int) this.f6474l) + ", DisarmCount=" + ((int) this.f6475m) + ", FlightMode=" + ((int) this.f6476n) + ", GroundSpeed=" + ((int) this.f6477o) + ", DownVelocity=" + ((int) this.f6478p) + ", rcReceiver=" + ((int) this.f6479q) + ", takeoffTag=" + ((int) this.f6480r) + C0494h.f735w;
    }
}
