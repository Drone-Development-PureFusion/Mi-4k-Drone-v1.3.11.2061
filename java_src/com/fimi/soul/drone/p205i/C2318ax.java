package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.ax */
/* loaded from: classes.dex */
public class C2318ax extends C2247e {

    /* renamed from: b */
    public int f7509b;

    /* renamed from: c */
    public int f7510c;

    /* renamed from: d */
    public int f7511d;

    public C2318ax(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public int m32139a() {
        return this.f7509b;
    }

    /* renamed from: a */
    public void m32138a(int i, int i2, int i3) {
        this.f7509b = i;
        this.f7510c = i2;
        this.f7511d = i3;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RELEASECHAIN);
    }

    /* renamed from: b */
    public int m32137b() {
        return this.f7510c;
    }

    /* renamed from: c */
    public int m32136c() {
        return this.f7511d;
    }

    public String toString() {
        return "ReleaseChainVariable{targetID=" + this.f7509b + ", state=" + this.f7510c + ", report=" + this.f7511d + C0494h.f735w;
    }
}
