package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.bf */
/* loaded from: classes.dex */
public class C2327bf extends C2247e {

    /* renamed from: b */
    public byte f7551b;

    /* renamed from: c */
    public byte f7552c;

    public C2327bf(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32063a() {
        return this.f7551b;
    }

    /* renamed from: a */
    public void m32062a(byte b, byte b2) {
        this.f7552c = b;
        this.f7551b = b2;
        this.f7081a.mo32909a(C2104d.EnumC2105a.UPDATEDRONEFINISHREPORT);
    }
}
