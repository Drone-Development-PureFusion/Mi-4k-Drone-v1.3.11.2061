package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.ab */
/* loaded from: classes.dex */
public class C2112ab extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6267a = 36;

    /* renamed from: c */
    public static final int f6268c = 25;
    private static final long serialVersionUID = 36;

    /* renamed from: d */
    public byte f6269d;

    /* renamed from: e */
    public byte f6270e;

    /* renamed from: f */
    public int f6271f;

    /* renamed from: g */
    public byte f6272g;

    /* renamed from: h */
    public C2196c f6273h;

    public C2112ab() {
        this.f6910b = 36;
    }

    public C2112ab(C2196c c2196c) {
        this.f6910b = 36;
        this.f6273h = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        c2197d.m32740c(3);
        this.f6270e = c2197d.m32739d();
        this.f6271f = c2197d.m32737f();
        c2197d.m32740c(24);
        this.f6272g = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 25;
        c2196c.f6913c = 36;
        return c2196c;
    }

    public String toString() {
        return "IMUWorkStateInfoDwonLink{imuWorkState=" + (this.f6271f & 255) + ", miLinkPacket=" + this.f6273h + ", CMD_ACK=" + ((int) this.f6272g) + C0494h.f735w;
    }
}
