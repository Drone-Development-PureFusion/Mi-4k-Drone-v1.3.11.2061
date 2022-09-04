package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.by */
/* loaded from: classes.dex */
public class C2162by extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6669a = 199;

    /* renamed from: c */
    public static final int f6670c = 2;
    private static final long serialVersionUID = 199;

    /* renamed from: d */
    public byte f6671d;

    /* renamed from: e */
    public byte f6672e;

    public C2162by() {
        this.f6910b = 199;
    }

    public C2162by(C2196c c2196c) {
        this.f6910b = 199;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6671d = c2197d.m32739d();
        this.f6672e = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 2;
        c2196c.f6913c = 199;
        c2196c.f6914d.m32744b(this.f6671d);
        c2196c.f6914d.m32744b(this.f6672e);
        return c2196c;
    }

    public String toString() {
        return "updateOrderbackreport [Packet_sequence=, target_ID=" + ((int) this.f6671d) + ", report=" + ((int) this.f6672e) + "]";
    }
}
