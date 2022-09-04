package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.bi */
/* loaded from: classes.dex */
public class C2330bi extends C2247e {

    /* renamed from: b */
    public byte f7558b;

    /* renamed from: c */
    public byte f7559c;

    public C2330bi(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32054a() {
        return this.f7558b;
    }

    /* renamed from: a */
    public void m32053a(byte b, byte b2) {
        this.f7558b = b;
        this.f7559c = b2;
        this.f7081a.mo32909a(C2104d.EnumC2105a.UPDATEDRONEORDERREPORT);
    }

    /* renamed from: b */
    public byte m32052b() {
        return this.f7559c;
    }
}
