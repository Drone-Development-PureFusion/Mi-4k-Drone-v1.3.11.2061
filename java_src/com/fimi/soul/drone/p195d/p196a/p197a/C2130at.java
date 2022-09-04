package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.at */
/* loaded from: classes.dex */
public class C2130at extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6435a = 151;

    /* renamed from: c */
    public static final int f6436c = 3;
    private static final long serialVersionUID = 151;

    /* renamed from: d */
    public short f6437d;

    /* renamed from: e */
    public byte f6438e;

    public C2130at() {
        this.f6910b = 151;
    }

    public C2130at(C2196c c2196c) {
        this.f6910b = 151;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6437d = c2197d.m32738e();
        this.f6438e = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = 151;
        c2196c.f6914d.m32746a(this.f6437d);
        c2196c.f6914d.m32744b(this.f6438e);
        return c2196c;
    }

    public String toString() {
        return "msg_Gohome [Packet_sequence=" + ((int) this.f6437d) + "]";
    }
}
