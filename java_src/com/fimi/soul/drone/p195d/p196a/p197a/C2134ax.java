package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.ax */
/* loaded from: classes.dex */
public class C2134ax extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6460a = 192;

    /* renamed from: c */
    public static final int f6461c = 2;
    private static final long serialVersionUID = 192;

    /* renamed from: d */
    public byte f6462d;

    /* renamed from: e */
    public byte f6463e;

    public C2134ax() {
        this.f6910b = 192;
    }

    public C2134ax(C2196c c2196c) {
        this.f6910b = 192;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6462d = c2197d.m32739d();
        this.f6463e = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 2;
        c2196c.f6913c = 192;
        c2196c.f6914d.m32744b(this.f6462d);
        c2196c.f6914d.m32744b(this.f6463e);
        return c2196c;
    }

    public String toString() {
        return "msg_GoupOrderUplink [MILINK_MSG_ID_RCDATA=192+Packet_sequence=" + ((int) this.f6462d) + ", target_ID=" + ((int) this.f6463e) + "]";
    }
}
