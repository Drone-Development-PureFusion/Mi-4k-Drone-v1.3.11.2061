package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.bd */
/* loaded from: classes.dex */
public class C2325bd extends C2247e {

    /* renamed from: b */
    public byte f7533b;

    /* renamed from: c */
    public byte f7534c;

    /* renamed from: d */
    public byte f7535d;

    /* renamed from: e */
    public byte f7536e;

    /* renamed from: f */
    public byte f7537f;

    /* renamed from: g */
    public byte f7538g;

    /* renamed from: h */
    public byte f7539h;

    /* renamed from: i */
    public byte f7540i;

    /* renamed from: j */
    public byte f7541j;

    /* renamed from: k */
    public byte f7542k;

    /* renamed from: l */
    public byte f7543l;

    public C2325bd(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32094a() {
        return this.f7533b;
    }

    /* renamed from: a */
    public void m32093a(byte b) {
        this.f7533b = b;
    }

    /* renamed from: a */
    public void m32092a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11) {
        this.f7533b = b;
        this.f7534c = b2;
        this.f7535d = b3;
        this.f7536e = b4;
        this.f7537f = b5;
        this.f7538g = b6;
        this.f7539h = b7;
        this.f7540i = b8;
        this.f7541j = b9;
        this.f7542k = b10;
        this.f7543l = b11;
        this.f7081a.mo32909a(C2104d.EnumC2105a.SIMULATORINFO);
    }

    /* renamed from: b */
    public byte m32091b() {
        return this.f7534c;
    }

    /* renamed from: b */
    public void m32090b(byte b) {
        this.f7534c = b;
    }

    /* renamed from: c */
    public byte m32089c() {
        return this.f7535d;
    }

    /* renamed from: c */
    public void m32088c(byte b) {
        this.f7535d = b;
    }

    /* renamed from: d */
    public byte m32087d() {
        return this.f7536e;
    }

    /* renamed from: d */
    public void m32086d(byte b) {
        this.f7536e = b;
    }

    /* renamed from: e */
    public byte m32085e() {
        return this.f7537f;
    }

    /* renamed from: e */
    public void m32084e(byte b) {
        this.f7537f = b;
    }

    /* renamed from: f */
    public byte m32083f() {
        return this.f7538g;
    }

    /* renamed from: f */
    public void m32082f(byte b) {
        this.f7538g = b;
    }

    /* renamed from: g */
    public byte m32081g() {
        return this.f7539h;
    }

    /* renamed from: g */
    public void m32080g(byte b) {
        this.f7539h = b;
    }

    /* renamed from: h */
    public byte m32079h() {
        return this.f7540i;
    }

    /* renamed from: h */
    public void m32078h(byte b) {
        this.f7540i = b;
    }

    /* renamed from: i */
    public byte m32077i() {
        return this.f7541j;
    }

    /* renamed from: i */
    public void m32076i(byte b) {
        this.f7541j = b;
    }

    /* renamed from: j */
    public byte m32075j() {
        return this.f7542k;
    }

    /* renamed from: j */
    public void m32074j(byte b) {
        this.f7542k = b;
    }

    /* renamed from: k */
    public byte m32073k() {
        return this.f7543l;
    }

    /* renamed from: k */
    public void m32072k(byte b) {
        this.f7543l = b;
    }

    public String toString() {
        return "SimulatorInfo [ADC0=" + ((int) this.f7533b) + ", ADC1=" + ((int) this.f7534c) + ", ADC2=" + ((int) this.f7535d) + ", ADC3=" + ((int) this.f7536e) + ", ADC4=" + ((int) this.f7537f) + ", ADC5=" + ((int) this.f7538g) + ", battery=" + ((int) this.f7539h) + ", switch1=" + ((int) this.f7540i) + ", switch2=" + ((int) this.f7541j) + ", left3=" + ((int) this.f7542k) + ", right3=" + ((int) this.f7543l) + "]";
    }
}
