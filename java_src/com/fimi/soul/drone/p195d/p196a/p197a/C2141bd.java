package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.bd */
/* loaded from: classes.dex */
public class C2141bd extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6508a = 3;

    /* renamed from: c */
    public static final int f6509c = 19;
    private static final long serialVersionUID = 3;

    /* renamed from: d */
    public short f6510d;

    /* renamed from: e */
    public byte f6511e;

    /* renamed from: f */
    public float f6512f;

    /* renamed from: g */
    public float f6513g;

    /* renamed from: h */
    public float f6514h;

    /* renamed from: i */
    public float f6515i;

    /* renamed from: j */
    public byte f6516j;

    /* renamed from: k */
    public C2196c f6517k;

    /* renamed from: l */
    private short f6518l;

    public C2141bd() {
        this.f6910b = 3;
    }

    public C2141bd(C2196c c2196c) {
        this.f6910b = 3;
        this.f6517k = c2196c;
        mo32763a(c2196c.f6914d);
    }

    /* renamed from: a */
    public short m32869a() {
        return this.f6518l;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6510d = c2197d.m32738e();
        this.f6511e = c2197d.m32739d();
        this.f6512f = c2197d.m32734i();
        this.f6513g = c2197d.m32734i();
        this.f6514h = c2197d.m32733j();
        this.f6515i = c2197d.m32734i();
        this.f6516j = c2197d.m32739d();
        m32868a(c2197d.m32738e());
    }

    /* renamed from: a */
    public void m32868a(short s) {
        this.f6518l = s;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        return null;
    }

    public String toString() {
        return "msg_PosionDownlink{flightTime=" + ((int) this.f6510d) + ", SatelliteNumber=" + ((int) this.f6511e) + ", CurrentLongitude=" + this.f6512f + ", CurrentLatitude=" + this.f6513g + ", Height=" + this.f6514h + ", Distance=" + this.f6515i + ", RFsignalstrength=" + ((int) this.f6516j) + C0494h.f735w;
    }
}
