package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.g */
/* loaded from: classes.dex */
public class C2337g extends C2247e {

    /* renamed from: b */
    public byte f7603b;

    /* renamed from: c */
    public byte f7604c;

    /* renamed from: d */
    public byte f7605d;

    /* renamed from: e */
    public byte f7606e;

    public C2337g(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m31990a() {
        return this.f7604c;
    }

    /* renamed from: a */
    public void m31989a(byte b, byte b2, byte b3, byte b4) {
        this.f7603b = b;
        this.f7604c = b2;
        this.f7605d = b3;
        this.f7606e = b4;
        this.f7081a.mo32909a(C2104d.EnumC2105a.CALIREMOTESUSTOMBUTTON);
    }

    /* renamed from: b */
    public byte m31988b() {
        return this.f7606e;
    }

    /* renamed from: c */
    public byte m31987c() {
        return this.f7605d;
    }

    /* renamed from: d */
    public byte m31986d() {
        return this.f7603b;
    }
}
