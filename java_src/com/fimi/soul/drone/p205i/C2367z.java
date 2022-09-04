package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.z */
/* loaded from: classes.dex */
public class C2367z extends C2247e {

    /* renamed from: b */
    private short f7777b;

    public C2367z(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public short m31745a() {
        return this.f7777b;
    }

    /* renamed from: a */
    public void m31744a(short s) {
        this.f7777b = s;
        this.f7081a.mo32909a(C2104d.EnumC2105a.ExitWaypoint);
    }

    /* renamed from: b */
    public void m31743b() {
        this.f7777b = (short) 0;
    }
}
