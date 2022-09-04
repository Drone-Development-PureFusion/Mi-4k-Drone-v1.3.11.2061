package com.fimi.soul.drone.p195d.p196a.p197a;

import android.util.Log;
import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.ad */
/* loaded from: classes.dex */
public class C2114ad extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6288a = 138;

    /* renamed from: c */
    public static final int f6289c = 12;
    private static final long serialVersionUID = 138;

    /* renamed from: d */
    public byte f6290d;

    /* renamed from: e */
    public byte f6291e;

    /* renamed from: f */
    public byte f6292f;

    /* renamed from: g */
    public byte f6293g;

    /* renamed from: h */
    public short f6294h;

    /* renamed from: i */
    public byte f6295i;

    /* renamed from: j */
    public byte f6296j;

    /* renamed from: k */
    public C2196c f6297k;

    public C2114ad() {
        this.f6910b = 138;
    }

    public C2114ad(C2196c c2196c) {
        this.f6910b = 138;
        this.f6297k = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32739d();
        this.f6290d = c2197d.m32739d();
        this.f6291e = c2197d.m32739d();
        this.f6292f = c2197d.m32739d();
        this.f6293g = c2197d.m32739d();
        this.f6294h = c2197d.m32738e();
        this.f6295i = c2197d.m32739d();
        c2197d.m32739d();
        c2197d.m32739d();
        c2197d.m32739d();
        this.f6296j = c2197d.m32739d();
        Log.i("istep", "unpack " + toString());
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 12;
        c2196c.f6913c = 138;
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b(this.f6290d);
        c2196c.f6914d.m32744b(this.f6291e);
        c2196c.f6914d.m32744b(this.f6292f);
        c2196c.f6914d.m32744b(this.f6293g);
        c2196c.f6914d.m32746a(this.f6294h);
        c2196c.f6914d.m32744b(this.f6295i);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        Log.i("istep", "pack " + toString());
        return c2196c;
    }

    public String toString() {
        return "MsgBrightnessSetting{targetId=" + ((int) this.f6290d) + ", sourceId=" + ((int) this.f6291e) + ", cmdId=" + ((int) this.f6292f) + ", cmdCode=" + ((int) this.f6293g) + ", brightness=" + ((int) this.f6294h) + ", model=" + ((int) this.f6295i) + ", report=" + ((int) this.f6296j) + C0494h.f735w;
    }
}
