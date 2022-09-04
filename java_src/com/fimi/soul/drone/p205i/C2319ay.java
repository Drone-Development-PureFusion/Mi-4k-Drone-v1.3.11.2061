package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.drone.i.ay */
/* loaded from: classes.dex */
public class C2319ay extends C2247e {

    /* renamed from: b */
    private byte f7512b;

    /* renamed from: c */
    private byte f7513c;

    /* renamed from: d */
    private byte f7514d;

    /* renamed from: e */
    private byte f7515e;

    /* renamed from: f */
    private byte f7516f;

    /* renamed from: g */
    private byte f7517g;

    public C2319ay() {
    }

    public C2319ay(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32135a() {
        return this.f7512b;
    }

    /* renamed from: a */
    public void m32134a(byte b) {
        this.f7512b = b;
    }

    /* renamed from: a */
    public void m32133a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6) {
        this.f7512b = b;
        this.f7513c = b2;
        this.f7514d = b3;
        this.f7515e = b4;
        this.f7516f = b5;
        this.f7517g = b6;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.Remotecontrol);
        }
    }

    /* renamed from: b */
    public byte m32132b() {
        return this.f7513c;
    }

    /* renamed from: b */
    public void m32131b(byte b) {
        this.f7517g = b;
    }

    /* renamed from: c */
    public byte m32130c() {
        return this.f7514d;
    }

    /* renamed from: d */
    public byte m32129d() {
        return this.f7515e;
    }

    /* renamed from: e */
    public byte m32128e() {
        return this.f7516f;
    }

    /* renamed from: f */
    public byte m32127f() {
        return this.f7517g;
    }

    /* renamed from: g */
    public boolean m32126g() {
        return C3103au.m29241a(this.f7516f, Math.abs(0)) > 0;
    }

    /* renamed from: h */
    public boolean m32125h() {
        return C3103au.m29241a(this.f7516f, Math.abs(1)) > 0;
    }
}
