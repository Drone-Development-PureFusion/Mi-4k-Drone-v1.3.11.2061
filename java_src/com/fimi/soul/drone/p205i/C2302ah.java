package com.fimi.soul.drone.p205i;

import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
/* renamed from: com.fimi.soul.drone.i.ah */
/* loaded from: classes.dex */
public class C2302ah extends C2247e {

    /* renamed from: b */
    private double f7397b;

    /* renamed from: c */
    private double f7398c;

    /* renamed from: d */
    private double f7399d;

    /* renamed from: e */
    private int f7400e;

    /* renamed from: f */
    private float f7401f;

    /* renamed from: g */
    private byte f7402g;

    public C2302ah() {
    }

    public C2302ah(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public float m32306a() {
        return this.f7401f;
    }

    /* renamed from: a */
    public void m32305a(double d) {
        this.f7397b = d;
    }

    /* renamed from: a */
    public void m32304a(double d, double d2, double d3, int i, byte b, byte b2, byte b3, byte b4, byte b5) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(d2, d);
            this.f7398c = m29346a.m29320b();
            this.f7397b = m29346a.m29322a();
        } else {
            this.f7398c = d;
            this.f7397b = d2;
        }
        this.f7399d = d3;
        this.f7400e = i;
        this.f7402g = b5;
    }

    /* renamed from: a */
    public void m32303a(double d, double d2, double d3, int i, float f, byte b) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(d2, d);
            this.f7398c = m29346a.m29320b();
            this.f7397b = m29346a.m29322a();
        } else {
            this.f7398c = d;
            this.f7397b = d2;
        }
        this.f7399d = d3;
        this.f7400e = i;
        this.f7401f = f;
        this.f7402g = b;
        this.f7081a.mo32909a(C2104d.EnumC2105a.HOMEPOINT);
    }

    /* renamed from: b */
    public double m32302b() {
        return this.f7397b;
    }

    /* renamed from: c */
    public double m32301c() {
        return this.f7398c;
    }

    /* renamed from: d */
    public double m32300d() {
        return this.f7399d;
    }

    /* renamed from: e */
    public int m32299e() {
        return this.f7400e;
    }

    /* renamed from: f */
    public boolean m32298f() {
        return (this.f7402g & 15) == 1;
    }

    /* renamed from: g */
    public boolean m32297g() {
        return ((this.f7402g & 240) >> 4) == 1;
    }
}
