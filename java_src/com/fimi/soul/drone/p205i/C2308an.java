package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.an */
/* loaded from: classes.dex */
public class C2308an extends C2247e {

    /* renamed from: b */
    private byte f7442b;

    /* renamed from: c */
    private short f7443c;

    /* renamed from: d */
    private short f7444d;

    /* renamed from: e */
    private short f7445e;

    /* renamed from: f */
    private short f7446f;

    /* renamed from: g */
    private short f7447g;

    /* renamed from: h */
    private short f7448h;

    /* renamed from: i */
    private byte f7449i;

    /* renamed from: j */
    private byte f7450j;

    /* renamed from: k */
    private byte f7451k;

    /* renamed from: l */
    private byte f7452l;

    /* renamed from: m */
    private byte f7453m;

    public C2308an(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32230a() {
        return this.f7442b;
    }

    /* renamed from: a */
    public void m32229a(byte b) {
        this.f7442b = b;
    }

    /* renamed from: a */
    public void m32228a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12) {
        this.f7442b = b;
        this.f7443c = (short) (b2 & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f7444d = (short) (b3 & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f7445e = (short) (b4 & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f7446f = (short) (b5 & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f7447g = (short) (b6 & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f7448h = (short) (b6 & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f7449i = b8;
        this.f7450j = b9;
        this.f7451k = b10;
        this.f7452l = b11;
        this.f7453m = b12;
        this.f7081a.mo32909a(C2104d.EnumC2105a.PTZ_GAIN);
    }

    /* renamed from: a */
    public void m32227a(short s) {
        this.f7443c = s;
    }

    /* renamed from: b */
    public short m32226b() {
        return this.f7443c;
    }

    /* renamed from: b */
    public void m32225b(byte b) {
        this.f7449i = b;
    }

    /* renamed from: b */
    public void m32224b(short s) {
        this.f7444d = s;
    }

    /* renamed from: c */
    public short m32223c() {
        return this.f7444d;
    }

    /* renamed from: c */
    public void m32222c(byte b) {
        this.f7450j = b;
    }

    /* renamed from: c */
    public void m32221c(short s) {
        this.f7445e = s;
    }

    /* renamed from: d */
    public short m32220d() {
        return this.f7445e;
    }

    /* renamed from: d */
    public void m32219d(byte b) {
        this.f7452l = b;
    }

    /* renamed from: d */
    public void m32218d(short s) {
        this.f7446f = s;
    }

    /* renamed from: e */
    public short m32217e() {
        return this.f7446f;
    }

    /* renamed from: e */
    public void m32216e(short s) {
        this.f7447g = s;
    }

    /* renamed from: f */
    public short m32215f() {
        return this.f7447g;
    }

    /* renamed from: f */
    public void m32214f(short s) {
        this.f7448h = s;
    }

    /* renamed from: g */
    public short m32213g() {
        return this.f7448h;
    }

    /* renamed from: h */
    public byte m32212h() {
        return this.f7449i;
    }

    /* renamed from: i */
    public byte m32211i() {
        return this.f7450j;
    }

    /* renamed from: j */
    public byte m32210j() {
        return this.f7452l;
    }

    public String toString() {
        return "PTZGainVariable{hearbest=" + ((int) this.f7442b) + ", rollPosition=" + ((int) this.f7443c) + ", pitchPosition=" + ((int) this.f7444d) + ", yawPosition=" + ((int) this.f7445e) + ", rollCurrent=" + ((int) this.f7446f) + ", pitchCurrent=" + ((int) this.f7447g) + ", yawCurrent=" + ((int) this.f7448h) + ", driverStatus=" + ((int) this.f7449i) + ", gimalErrode=" + ((int) this.f7450j) + ", rev=" + ((int) this.f7451k) + ", pitchAngle=" + ((int) this.f7452l) + ", rev1=" + ((int) this.f7453m) + C0494h.f735w;
    }
}
