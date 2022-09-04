package com.fimi.soul.biz.p182j;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.module.p214c.C2519b;
/* renamed from: com.fimi.soul.biz.j.n */
/* loaded from: classes.dex */
public class C1888n implements C2104d.AbstractC2106b, C2519b.AbstractC2521b {

    /* renamed from: a */
    private C2083a f5174a;

    /* renamed from: b */
    private C1892p f5175b;

    /* renamed from: c */
    private C1880f f5176c;

    /* renamed from: d */
    private C1886l f5177d;

    public C1888n(C2083a c2083a) {
        this.f5174a = c2083a;
        c2083a.mo32908a(this);
        C2519b.m31392a().m31391a(this);
        this.f5175b = new C1892p(c2083a);
        this.f5176c = new C1880f(c2083a);
        this.f5177d = new C1886l(c2083a);
    }

    /* renamed from: a */
    public void m33735a() {
        this.f5174a.mo32903b(this);
    }

    @Override // com.fimi.soul.module.p214c.C2519b.AbstractC2521b
    /* renamed from: a */
    public void mo31388a(int i) {
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case RECEIVERWAYPOINTS:
                this.f5175b.m33711a();
                return;
            case UPWAYPOINT:
                c2083a.mo32909a(C2104d.EnumC2105a.SHOWOUTTIMEPROBAR);
                this.f5175b.mo33708a(C1877d.m33782p().m33788j());
                return;
            case READWAYPOINT:
                this.f5175b.m33707b(1);
                return;
            case RECEIVERPOINTS:
                C2540a.m31307a().m31305a("130");
                this.f5175b.m33709a(c2083a.mo32899o());
                return;
            case ASSIGNWAYPOINT:
                this.f5176c.mo33708a(C1877d.m33782p().m33788j());
                return;
            case READFLYTO:
                this.f5176c.m33766a();
                return;
            case INTERESTWAYPOINT:
                this.f5177d.mo33708a(C1877d.m33782p().m33788j());
                return;
            case READPOI:
                this.f5177d.m33736a();
                return;
            default:
                return;
        }
    }
}
