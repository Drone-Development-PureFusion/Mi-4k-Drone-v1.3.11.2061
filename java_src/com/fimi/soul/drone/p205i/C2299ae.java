package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.ae */
/* loaded from: classes.dex */
public class C2299ae extends C2247e {

    /* renamed from: b */
    private byte f7373b;

    /* renamed from: c */
    private byte f7374c;

    /* renamed from: d */
    private byte f7375d;

    /* renamed from: e */
    private byte f7376e;

    /* renamed from: f */
    private byte f7377f;

    /* renamed from: g */
    private byte f7378g;

    /* renamed from: h */
    private byte f7379h;

    public C2299ae(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32355a() {
        return this.f7373b;
    }

    /* renamed from: a */
    public void m32354a(byte b) {
        this.f7373b = b;
    }

    /* renamed from: a */
    public void m32353a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7) {
        this.f7373b = b;
        this.f7374c = b2;
        this.f7375d = b3;
        this.f7376e = b4;
        this.f7377f = b5;
        this.f7378g = b6;
        this.f7379h = b7;
        this.f7081a.mo32909a(C2104d.EnumC2105a.GIMAL_PARAMETER_CONFIG);
    }

    /* renamed from: b */
    public byte m32352b() {
        return this.f7374c;
    }

    /* renamed from: b */
    public void m32351b(byte b) {
        this.f7374c = b;
    }

    /* renamed from: c */
    public byte m32350c() {
        return this.f7375d;
    }

    /* renamed from: c */
    public void m32349c(byte b) {
        this.f7375d = b;
    }

    /* renamed from: d */
    public byte m32348d() {
        return this.f7376e;
    }

    /* renamed from: d */
    public void m32347d(byte b) {
        this.f7376e = b;
    }

    /* renamed from: e */
    public byte m32346e() {
        return this.f7377f;
    }

    /* renamed from: e */
    public void m32345e(byte b) {
        this.f7377f = b;
    }

    /* renamed from: f */
    public byte m32344f() {
        return this.f7378g;
    }

    /* renamed from: f */
    public void m32343f(byte b) {
        this.f7378g = b;
    }

    /* renamed from: g */
    public byte m32342g() {
        return this.f7379h;
    }

    /* renamed from: g */
    public void m32341g(byte b) {
        this.f7379h = b;
    }

    public String toString() {
        return "GimalParameterConfig{version=" + ((int) this.f7373b) + ", report=" + ((int) this.f7374c) + ", configIndex=" + ((int) this.f7375d) + ", commandType=" + ((int) this.f7376e) + ", configData1=" + ((int) this.f7377f) + ", configData2=" + ((int) this.f7378g) + ", configData3=" + ((int) this.f7379h) + C0494h.f735w;
    }
}
