package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.be */
/* loaded from: classes.dex */
public class C2142be extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6519a = 129;

    /* renamed from: c */
    public static final int f6520c = 11;
    private static final long serialVersionUID = 129;

    /* renamed from: d */
    public byte f6521d;

    /* renamed from: e */
    public int f6522e;

    /* renamed from: f */
    public int f6523f;

    /* renamed from: g */
    public short f6524g;

    public C2142be() {
        this.f6910b = 129;
    }

    public C2142be(C2196c c2196c) {
        this.f6910b = 129;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6521d = c2197d.m32739d();
        this.f6522e = c2197d.m32737f();
        this.f6523f = c2197d.m32737f();
        this.f6524g = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 11;
        c2196c.f6913c = 129;
        c2196c.f6914d.m32744b(this.f6521d);
        c2196c.f6914d.m32743b(this.f6522e);
        c2196c.f6914d.m32743b(this.f6523f);
        c2196c.f6914d.m32746a(this.f6524g);
        return c2196c;
    }

    public String toString() {
        return "msg_PosionUpLink [MILINK_MSG_ID_RCDATA=129+PacketSequence=" + ((int) this.f6521d) + ", HomeLongitude=" + this.f6522e + ", HomeLatitude=" + this.f6523f + ", HomeAltitude=" + ((int) this.f6524g) + "]";
    }
}
