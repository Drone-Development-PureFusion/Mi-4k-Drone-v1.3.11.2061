package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.bh */
/* loaded from: classes.dex */
public class C2329bh extends C2247e {

    /* renamed from: b */
    public byte f7555b;

    /* renamed from: c */
    public byte f7556c;

    /* renamed from: d */
    public byte f7557d;

    public C2329bh(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32058a() {
        return this.f7555b;
    }

    /* renamed from: a */
    public void m32057a(byte b, byte b2, byte b3) {
        this.f7555b = b;
        this.f7556c = b2;
        this.f7557d = b3;
        this.f7081a.mo32909a(C2104d.EnumC2105a.UPDATEDRONEOBJECTREPORT);
    }

    /* renamed from: b */
    public byte m32056b() {
        return this.f7556c;
    }

    /* renamed from: c */
    public byte m32055c() {
        return this.f7557d;
    }
}
