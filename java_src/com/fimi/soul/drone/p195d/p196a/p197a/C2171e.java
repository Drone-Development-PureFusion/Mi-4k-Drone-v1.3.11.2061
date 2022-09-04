package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.e */
/* loaded from: classes.dex */
public class C2171e extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6713a = 5;

    /* renamed from: c */
    public static final int f6714c = 16;
    private static final long serialVersionUID = 5;

    /* renamed from: d */
    public byte f6715d;

    /* renamed from: e */
    public byte f6716e;

    /* renamed from: f */
    public byte f6717f;

    /* renamed from: g */
    public byte f6718g;

    /* renamed from: h */
    public byte f6719h;

    /* renamed from: i */
    public byte f6720i;

    /* renamed from: j */
    public short f6721j;

    /* renamed from: k */
    public short f6722k;

    /* renamed from: l */
    public byte f6723l;

    /* renamed from: m */
    public byte f6724m;

    /* renamed from: n */
    public byte f6725n;

    /* renamed from: o */
    public byte f6726o;

    /* renamed from: p */
    public byte f6727p;

    /* renamed from: q */
    public byte f6728q;

    /* renamed from: r */
    public C2196c f6729r;

    public C2171e() {
        this.f6910b = 5;
    }

    public C2171e(C2196c c2196c) {
        this.f6910b = 5;
        this.f6729r = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6715d = c2197d.m32739d();
        this.f6716e = c2197d.m32739d();
        this.f6717f = c2197d.m32739d();
        this.f6718g = c2197d.m32739d();
        this.f6719h = c2197d.m32739d();
        this.f6720i = c2197d.m32739d();
        this.f6721j = c2197d.m32738e();
        this.f6722k = c2197d.m32738e();
        this.f6723l = c2197d.m32739d();
        this.f6724m = c2197d.m32739d();
        this.f6725n = c2197d.m32739d();
        this.f6726o = c2197d.m32739d();
        this.f6727p = c2197d.m32739d();
        this.f6728q = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 16;
        c2196c.f6913c = 5;
        return null;
    }

    public String toString() {
        return "CellDwonLink{Cell_1_Voltage=" + ((int) this.f6715d) + ", Cell_2_Voltage=" + ((int) this.f6716e) + ", Cell_3_Voltage=" + ((int) this.f6717f) + ", Cell_4_Voltage=" + ((int) this.f6718g) + ", Cell_5_Voltage=" + ((int) this.f6719h) + ", Cell_6_Voltage=" + ((int) this.f6720i) + ", Current_Capacity=" + ((int) this.f6721j) + ", Current=" + ((int) this.f6722k) + ", battery_temperature=" + ((int) this.f6723l) + ", battery_temperature1=" + ((int) this.f6724m) + ", batteryLevel=" + ((int) this.f6725n) + ", battery_param_err=" + ((int) this.f6726o) + ", battery_over_discharge=" + ((int) this.f6727p) + ", RCNoUpdateCnt=" + ((int) this.f6728q) + ", miLinkPacket=" + this.f6729r + C0494h.f735w;
    }
}
