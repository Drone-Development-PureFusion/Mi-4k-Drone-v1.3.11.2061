package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.n */
/* loaded from: classes.dex */
public class C2355n extends C2247e {

    /* renamed from: b */
    private String f7718b = "";

    public C2355n(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public String m31902a() {
        return this.f7718b;
    }

    /* renamed from: a */
    public void m31901a(String str) {
        this.f7718b = str;
        this.f7081a.mo32909a(C2104d.EnumC2105a.DRONEERRORACTIONCODE);
    }
}
