package com.fimi.soul.drone.p205i.p206a;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.a.c */
/* loaded from: classes.dex */
public class C2289c extends C2247e {

    /* renamed from: b */
    public byte f7318b;

    /* renamed from: c */
    public short f7319c;

    /* renamed from: d */
    public float f7320d;

    /* renamed from: e */
    public float f7321e;

    /* renamed from: f */
    public byte f7322f;

    /* renamed from: g */
    public short f7323g;

    /* renamed from: h */
    public byte f7324h = 10;

    /* renamed from: i */
    public byte f7325i;

    /* renamed from: j */
    public byte f7326j;

    /* renamed from: k */
    public byte f7327k;

    /* renamed from: l */
    public short f7328l;

    /* renamed from: m */
    public short f7329m;

    /* renamed from: n */
    public short f7330n;

    public C2289c() {
    }

    public C2289c(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32415a() {
        return this.f7318b;
    }

    /* renamed from: a */
    public void m32414a(byte b) {
        this.f7322f = b;
    }

    /* renamed from: a */
    public void m32413a(byte b, short s, float f, float f2, byte b2, short s2, byte b3, byte b4, byte b5, byte b6, short s3, short s4, short s5) {
        this.f7318b = b;
        this.f7319c = s;
        this.f7320d = f;
        this.f7321e = f2;
        this.f7322f = b2;
        this.f7323g = s2;
        this.f7324h = b3;
        this.f7325i = b4;
        this.f7326j = b5;
        this.f7327k = b6;
        this.f7328l = s3;
        this.f7329m = s4;
        this.f7330n = s5;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.NOFLYZONE);
        }
    }

    /* renamed from: a */
    public void m32412a(short s) {
        this.f7319c = s;
    }

    /* renamed from: b */
    public byte m32411b() {
        return this.f7324h;
    }

    /* renamed from: b */
    public void m32410b(short s) {
        this.f7323g = s;
    }

    /* renamed from: c */
    public short m32409c() {
        return this.f7323g;
    }

    /* renamed from: d */
    public short m32408d() {
        return this.f7319c;
    }

    /* renamed from: e */
    public byte m32407e() {
        return this.f7322f;
    }

    /* renamed from: f */
    public float m32406f() {
        return this.f7321e;
    }

    /* renamed from: g */
    public float m32405g() {
        return this.f7320d;
    }

    /* renamed from: h */
    public byte m32404h() {
        return this.f7325i;
    }

    /* renamed from: i */
    public byte m32403i() {
        return this.f7326j;
    }

    /* renamed from: j */
    public byte m32402j() {
        return this.f7327k;
    }

    /* renamed from: k */
    public short m32401k() {
        return this.f7328l;
    }

    /* renamed from: l */
    public short m32400l() {
        return this.f7329m;
    }

    /* renamed from: m */
    public short m32399m() {
        return this.f7330n;
    }

    public String toString() {
        return "FlyZone{Opration_code=" + ((int) this.f7318b) + ", number=" + ((int) this.f7319c) + ", Forbiden_Longitude=" + this.f7320d + ", Forbiden_Latitude=" + this.f7321e + ", type=" + ((int) this.f7322f) + ", radius=" + ((int) this.f7323g) + ", status=" + ((int) this.f7324h) + ", NFZ_Function_State=" + ((int) this.f7325i) + ", Vehicle_State=" + ((int) this.f7326j) + ", NFZ_Type=" + ((int) this.f7327k) + ", HeightLimit=" + ((int) this.f7328l) + ", WFZRadius=" + ((int) this.f7329m) + ", HeightLimitRadius=" + ((int) this.f7330n) + C0494h.f735w;
    }
}
