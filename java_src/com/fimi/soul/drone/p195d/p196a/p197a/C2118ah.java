package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.ah */
/* loaded from: classes.dex */
public class C2118ah extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6323a = 7;

    /* renamed from: c */
    public static final int f6324c = 11;
    private static final long serialVersionUID = 7;

    /* renamed from: d */
    public byte f6325d;

    /* renamed from: e */
    public short f6326e;

    /* renamed from: f */
    public float f6327f;

    /* renamed from: g */
    public float f6328g;

    /* renamed from: h */
    public byte f6329h;

    /* renamed from: i */
    public short f6330i;

    /* renamed from: j */
    public byte f6331j;

    /* renamed from: k */
    public byte f6332k;

    /* renamed from: l */
    public byte f6333l;

    /* renamed from: m */
    public byte f6334m;

    /* renamed from: n */
    public short f6335n;

    /* renamed from: o */
    public short f6336o;

    /* renamed from: p */
    public short f6337p;

    public C2118ah() {
        this.f6910b = 7;
    }

    public C2118ah(C2196c c2196c) {
        this.f6910b = 7;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6325d = c2197d.m32739d();
        this.f6326e = c2197d.m32738e();
        this.f6327f = c2197d.m32734i();
        this.f6328g = c2197d.m32734i();
        this.f6329h = c2197d.m32739d();
        this.f6330i = c2197d.m32738e();
        this.f6331j = c2197d.m32739d();
        this.f6332k = c2197d.m32739d();
        this.f6333l = c2197d.m32739d();
        this.f6334m = c2197d.m32739d();
        this.f6335n = c2197d.m32738e();
        this.f6336o = c2197d.m32738e();
        this.f6337p = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 11;
        c2196c.f6913c = 7;
        c2196c.f6914d.m32746a(this.f6326e);
        c2196c.f6914d.m32749a(this.f6327f);
        c2196c.f6914d.m32749a(this.f6328g);
        c2196c.f6914d.m32744b(this.f6329h);
        return c2196c;
    }

    public String toString() {
        return "NoFlyArea{Opration_code=" + ((int) this.f6325d) + ", number=" + ((int) this.f6326e) + ", Forbiden_Longitude=" + this.f6327f + ", Forbiden_Latitude=" + this.f6328g + ", type=" + ((int) this.f6329h) + ", radius=" + ((int) this.f6330i) + ", SafetyZoneState=" + ((int) this.f6331j) + ", NFZ_Function_State=" + ((int) this.f6332k) + ", Vehicle_State=" + ((int) this.f6333l) + ", NFZ_Type=" + ((int) this.f6334m) + ", HeightLimit=" + ((int) this.f6335n) + ", WFZRadius=" + ((int) this.f6336o) + ", HeightLimitRadius=" + ((int) this.f6337p) + C0494h.f735w;
    }
}
