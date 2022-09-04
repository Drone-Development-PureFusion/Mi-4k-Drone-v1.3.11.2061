package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.az */
/* loaded from: classes.dex */
public class C2320az extends C2247e {

    /* renamed from: b */
    public int f7518b;

    public C2320az(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public int m32124a() {
        return this.f7518b;
    }

    /* renamed from: a */
    public void m32123a(int i) {
        this.f7518b = i;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RESETRC);
    }

    public String toString() {
        return "RestVariable{targetID=" + this.f7518b + C0494h.f735w;
    }
}
