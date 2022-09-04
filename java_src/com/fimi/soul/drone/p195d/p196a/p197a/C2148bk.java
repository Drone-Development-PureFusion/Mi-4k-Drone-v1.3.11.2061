package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bk */
/* loaded from: classes.dex */
public class C2148bk extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6560a = 197;

    /* renamed from: c */
    public static final int f6561c = 6;
    private static final long serialVersionUID = 197;

    /* renamed from: d */
    public byte f6562d;

    /* renamed from: e */
    public byte f6563e;

    /* renamed from: f */
    public byte f6564f;

    /* renamed from: g */
    public byte f6565g;

    /* renamed from: h */
    public byte f6566h;

    public C2148bk() {
        this.f6910b = 197;
    }

    public C2148bk(C2196c c2196c) {
        this.f6910b = 197;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6562d = c2197d.m32739d();
        this.f6563e = c2197d.m32739d();
        this.f6564f = c2197d.m32739d();
        this.f6565g = c2197d.m32739d();
        this.f6566h = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 6;
        c2196c.f6913c = 197;
        c2196c.f6914d.m32744b(this.f6562d);
        c2196c.f6914d.m32744b(this.f6563e);
        c2196c.f6914d.m32744b(this.f6564f);
        c2196c.f6914d.m32744b(this.f6565g);
        c2196c.f6914d.m32744b(this.f6566h);
        return c2196c;
    }

    public String toString() {
        return "msg_ReportAnswerFlightDownlink [Battery_hardware_version=" + ((int) this.f6562d) + ", Battery_software_version=" + ((int) this.f6563e) + ", Gimbal_hardware_version=" + ((int) this.f6564f) + ", Gimbal_software_version=" + ((int) this.f6565g) + ", Other_equipment_vesion=" + ((int) this.f6566h) + "]";
    }
}
