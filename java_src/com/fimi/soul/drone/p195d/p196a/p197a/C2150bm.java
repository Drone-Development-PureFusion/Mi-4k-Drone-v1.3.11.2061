package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bm */
/* loaded from: classes.dex */
public class C2150bm extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6579a = 198;

    /* renamed from: c */
    public static final int f6580c = 2;
    private static final long serialVersionUID = 198;

    /* renamed from: d */
    public byte f6581d;

    /* renamed from: e */
    public byte f6582e;

    public C2150bm() {
        this.f6910b = 198;
    }

    public C2150bm(C2196c c2196c) {
        this.f6910b = 198;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6581d = c2197d.m32739d();
        this.f6582e = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 2;
        c2196c.f6913c = 198;
        c2196c.f6914d.m32744b(this.f6581d);
        c2196c.f6914d.m32744b(this.f6582e);
        return c2196c;
    }

    public String toString() {
        return "msg_RequestbatteryDownlink [MILINK_MSG_ID_RCDATA=198+APP_version=" + ((int) this.f6581d) + ", reserve=" + ((int) this.f6582e) + "]";
    }
}
