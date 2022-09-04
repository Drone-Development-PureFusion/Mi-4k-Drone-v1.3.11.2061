package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.b */
/* loaded from: classes.dex */
public class C2137b extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6486a = 152;

    /* renamed from: c */
    public static final int f6487c = 4;
    private static final long serialVersionUID = 152;

    /* renamed from: d */
    public short f6488d;

    /* renamed from: e */
    public byte f6489e;

    /* renamed from: f */
    public byte f6490f;

    public C2137b() {
        this.f6910b = 152;
    }

    public C2137b(C2196c c2196c) {
        this.f6910b = 152;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6488d = c2197d.m32738e();
        this.f6489e = c2197d.m32739d();
        this.f6490f = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 4;
        c2196c.f6913c = 152;
        c2196c.f6914d.m32746a(this.f6488d);
        c2196c.f6914d.m32744b(this.f6489e);
        c2196c.f6914d.m32744b(this.f6490f);
        return c2196c;
    }

    public String toString() {
        return "BeginFollowmeback{Packet_sequence=" + ((int) this.f6488d) + ", cmd=" + ((int) this.f6489e) + ", report=" + ((int) this.f6490f) + C0494h.f735w;
    }
}
