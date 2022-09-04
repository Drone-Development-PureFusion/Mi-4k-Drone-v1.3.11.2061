package com.fimi.soul.drone.p205i.p206a;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.entity.DroneModelType;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.a.f */
/* loaded from: classes.dex */
public class C2292f extends C2247e {

    /* renamed from: b */
    private byte f7332b;

    /* renamed from: d */
    private byte f7334d;

    /* renamed from: f */
    private byte f7336f;

    /* renamed from: g */
    private byte f7337g;

    /* renamed from: h */
    private byte f7338h;

    /* renamed from: c */
    private byte f7333c = 50;

    /* renamed from: e */
    private byte f7335e = 90;

    /* renamed from: i */
    private DroneModelType f7339i = new DroneModelType();

    public C2292f() {
    }

    public C2292f(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32397a() {
        return this.f7335e;
    }

    /* renamed from: a */
    public void m32396a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7) {
        this.f7332b = b;
        this.f7333c = b2;
        this.f7339i.setCtrlType(b);
        this.f7339i.setCtrlMode(b2);
        this.f7335e = b4;
        this.f7336f = b5;
        this.f7337g = b6;
        this.f7334d = b3;
        this.f7338h = b7;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.NEWFRONEMODEL);
        }
    }

    /* renamed from: b */
    public byte m32395b() {
        return this.f7337g;
    }

    /* renamed from: c */
    public byte m32394c() {
        return this.f7336f;
    }

    /* renamed from: d */
    public byte m32393d() {
        return this.f7332b;
    }

    /* renamed from: e */
    public byte m32392e() {
        return this.f7333c;
    }

    /* renamed from: f */
    public byte m32391f() {
        return this.f7334d;
    }

    /* renamed from: g */
    public DroneModelType m32390g() {
        return this.f7339i;
    }

    /* renamed from: h */
    public byte m32389h() {
        return this.f7338h;
    }

    public String toString() {
        return "NewDroneModel{CtrlType=" + ((int) this.f7332b) + ", CtrlMode=" + ((int) this.f7333c) + ", WP_STA=" + ((int) this.f7334d) + C0494h.f735w;
    }
}
