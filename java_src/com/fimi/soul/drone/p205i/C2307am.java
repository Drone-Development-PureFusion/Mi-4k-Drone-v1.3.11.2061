package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3103au;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.am */
/* loaded from: classes.dex */
public class C2307am extends C2247e {

    /* renamed from: b */
    private byte f7432b;

    /* renamed from: c */
    private short f7433c;

    /* renamed from: d */
    private short f7434d;

    /* renamed from: e */
    private short f7435e;

    /* renamed from: f */
    private short f7436f;

    /* renamed from: g */
    private short f7437g;

    /* renamed from: h */
    private short f7438h;

    /* renamed from: i */
    private short f7439i;

    /* renamed from: j */
    private volatile short f7440j;

    /* renamed from: k */
    private byte f7441k;

    public C2307am() {
    }

    public C2307am(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public int m32253a(int i, int i2) {
        return ((1 << i2) & i) >> i2;
    }

    /* renamed from: a */
    public void m32254a(byte b) {
        this.f7432b = b;
    }

    /* renamed from: a */
    public void m32252a(short s) {
        this.f7440j = s;
    }

    /* renamed from: a */
    public boolean m32255a() {
        return 1 == m32253a(this.f7440j, 4);
    }

    /* renamed from: b */
    public short m32251b() {
        return this.f7440j;
    }

    /* renamed from: b */
    public void m32250b(byte b) {
        this.f7441k = b;
    }

    /* renamed from: b */
    public void m32249b(short s) {
        this.f7439i = s;
    }

    /* renamed from: c */
    public short m32248c() {
        return this.f7439i;
    }

    /* renamed from: c */
    public void m32247c(short s) {
        this.f7438h = s;
    }

    /* renamed from: d */
    public short m32246d() {
        return this.f7438h;
    }

    /* renamed from: d */
    public void m32245d(short s) {
        this.f7437g = s;
    }

    /* renamed from: e */
    public short m32244e() {
        return this.f7437g;
    }

    /* renamed from: e */
    public void m32243e(short s) {
        this.f7436f = s;
    }

    /* renamed from: f */
    public short m32242f() {
        return this.f7436f;
    }

    /* renamed from: f */
    public void m32241f(short s) {
        this.f7435e = s;
    }

    /* renamed from: g */
    public short m32240g() {
        return this.f7435e;
    }

    /* renamed from: g */
    public void m32239g(short s) {
        this.f7434d = s;
    }

    /* renamed from: h */
    public short m32238h() {
        return this.f7434d;
    }

    /* renamed from: h */
    public void m32237h(short s) {
        this.f7433c = s;
    }

    /* renamed from: i */
    public short m32236i() {
        return this.f7433c;
    }

    /* renamed from: j */
    public byte m32235j() {
        return this.f7432b;
    }

    /* renamed from: k */
    public boolean m32234k() {
        return C3103au.m29241a(this.f7440j, 4) == 0;
    }

    /* renamed from: l */
    public byte m32233l() {
        return this.f7441k;
    }

    /* renamed from: m */
    public boolean m32232m() {
        return C3103au.m29241a(this.f7441k, Math.abs(0)) > 0;
    }

    /* renamed from: n */
    public boolean m32231n() {
        return C3103au.m29241a(this.f7441k, Math.abs(1)) > 0;
    }

    public String toString() {
        return "NewRemoteMode{type=" + ((int) this.f7432b) + ", AD_Value0=" + ((int) this.f7433c) + ", AD_Value1=" + ((int) this.f7434d) + ", AD_Value2=" + ((int) this.f7435e) + ", AD_Value3=" + ((int) this.f7436f) + ", AD_Value4=" + ((int) this.f7437g) + ", AD_Value5=" + ((int) this.f7438h) + ", battery_voltage=" + ((int) this.f7439i) + ", statuts=" + ((int) this.f7440j) + C0494h.f735w;
    }
}
