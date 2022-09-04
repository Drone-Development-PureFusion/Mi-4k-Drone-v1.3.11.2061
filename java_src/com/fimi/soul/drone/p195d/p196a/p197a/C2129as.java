package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.as */
/* loaded from: classes.dex */
public class C2129as extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6431a = 148;

    /* renamed from: c */
    public static final int f6432c = 3;
    private static final long serialVersionUID = 148;

    /* renamed from: d */
    public short f6433d;

    /* renamed from: e */
    public byte f6434e;

    public C2129as() {
        this.f6910b = 148;
    }

    public C2129as(C2196c c2196c) {
        this.f6910b = 148;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6433d = c2197d.m32738e();
        this.f6434e = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = 148;
        c2196c.f6914d.m32746a(this.f6433d);
        c2196c.f6914d.m32744b(this.f6434e);
        return c2196c;
    }

    public String toString() {
        return "msg_Gohome [Packet_sequence=" + ((int) this.f6433d) + "]";
    }
}
