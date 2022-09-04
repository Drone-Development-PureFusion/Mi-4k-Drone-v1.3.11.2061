package com.fimi.soul.drone.p205i;

import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3084al;
/* renamed from: com.fimi.soul.drone.i.bc */
/* loaded from: classes.dex */
public class C2324bc extends C2247e {

    /* renamed from: b */
    public double f7524b;

    /* renamed from: c */
    public byte f7525c;

    /* renamed from: d */
    public double f7526d;

    /* renamed from: e */
    public double f7527e;

    /* renamed from: f */
    public double f7528f;

    /* renamed from: g */
    public byte f7529g;

    /* renamed from: h */
    public int f7530h;

    /* renamed from: i */
    public double f7531i;

    /* renamed from: j */
    public double f7532j;

    public C2324bc(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public double m32110a() {
        return this.f7524b;
    }

    /* renamed from: a */
    public void m32109a(double d) {
        this.f7524b = d;
    }

    /* renamed from: a */
    public void m32108a(double d, float f, float f2, double d2, byte b, double d3, double d4, double d5, byte b2) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al c3084al = new C3084al(f2, f);
            this.f7526d = c3084al.m29320b();
            this.f7527e = c3084al.m29322a();
        } else {
            this.f7526d = f;
            this.f7527e = f2;
        }
        this.f7524b = d;
        this.f7528f = d2;
        this.f7529g = b;
        this.f7530h = ((int) d3) & 255;
        this.f7531i = d4;
        this.f7532j = d5;
        this.f7525c = b2;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RETURNASSIGNWAYPOINT);
    }

    /* renamed from: a */
    public void m32107a(float f) {
        this.f7527e = f;
    }

    /* renamed from: b */
    public double m32106b() {
        return this.f7526d;
    }

    /* renamed from: b */
    public void m32105b(double d) {
        this.f7528f = d;
    }

    /* renamed from: b */
    public void m32104b(float f) {
        this.f7526d = f;
    }

    /* renamed from: c */
    public double m32103c() {
        return this.f7528f;
    }

    /* renamed from: c */
    public void m32102c(double d) {
        this.f7531i = d;
    }

    /* renamed from: d */
    public byte m32101d() {
        return this.f7529g;
    }

    /* renamed from: d */
    public void m32100d(double d) {
        this.f7532j = d;
    }

    /* renamed from: e */
    public int m32099e() {
        return this.f7530h;
    }

    /* renamed from: f */
    public double m32098f() {
        return this.f7531i;
    }

    /* renamed from: g */
    public double m32097g() {
        return this.f7532j;
    }

    /* renamed from: h */
    public double m32096h() {
        return this.f7527e;
    }

    /* renamed from: i */
    public byte m32095i() {
        return this.f7525c;
    }
}
