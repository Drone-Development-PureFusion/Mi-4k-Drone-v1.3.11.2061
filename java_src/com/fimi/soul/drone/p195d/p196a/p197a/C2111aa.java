package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.aa */
/* loaded from: classes.dex */
public class C2111aa extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6260a = 38;

    /* renamed from: c */
    public static final int f6261c = 25;
    private static final long serialVersionUID = 38;

    /* renamed from: d */
    public byte f6262d;

    /* renamed from: e */
    public byte f6263e;

    /* renamed from: f */
    public int f6264f;

    /* renamed from: g */
    public byte f6265g;

    /* renamed from: h */
    public C2196c f6266h;

    public C2111aa() {
        this.f6910b = 38;
    }

    public C2111aa(C2196c c2196c) {
        this.f6910b = 38;
        this.f6266h = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32740c(3);
        this.f6263e = c2197d.m32739d();
        this.f6264f = c2197d.m32737f();
        c2197d.m32740c(24);
        this.f6265g = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 25;
        c2196c.f6913c = 38;
        return c2196c;
    }

    public String toString() {
        return "IMUWorkStateInfoDwonLink{imuWorkState=" + (this.f6264f & 255) + ", CMD_ACK=" + ((int) this.f6265g) + ", miLinkPacket=" + this.f6266h + C0494h.f735w;
    }
}
