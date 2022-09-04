package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.ba */
/* loaded from: classes.dex */
public class C2322ba extends C2247e {

    /* renamed from: b */
    private short f7521b;

    public C2322ba(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public short m32118a() {
        return this.f7521b;
    }

    /* renamed from: a */
    public void m32117a(short s) {
        this.f7521b = s;
        this.f7081a.mo32909a(C2104d.EnumC2105a.ResumeWaypoint);
    }

    /* renamed from: b */
    public void m32116b() {
        this.f7521b = (short) 0;
    }
}
