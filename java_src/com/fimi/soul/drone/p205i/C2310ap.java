package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.ap */
/* loaded from: classes.dex */
public class C2310ap extends C2247e {

    /* renamed from: b */
    private short f7459b;

    public C2310ap(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public short m32199a() {
        return this.f7459b;
    }

    /* renamed from: a */
    public void m32198a(short s) {
        this.f7459b = s;
        this.f7081a.mo32909a(C2104d.EnumC2105a.PauseWaypoint);
    }

    /* renamed from: b */
    public void m32197b() {
        this.f7459b = (short) 0;
    }
}
