package com.fimi.soul.biz.p180h;

import com.fimi.kernel.p165d.C1648b;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2301ag;
/* renamed from: com.fimi.soul.biz.h.f */
/* loaded from: classes.dex */
public class C1859f implements C2104d.AbstractC2106b {

    /* renamed from: a */
    private C2083a f5053a;

    /* renamed from: b */
    private C1648b f5054b;

    /* renamed from: c */
    private boolean f5055c;

    /* renamed from: d */
    private int f5056d;

    /* renamed from: e */
    private int f5057e;

    /* renamed from: f */
    private boolean f5058f;

    public C1859f(C2083a c2083a) {
        this.f5053a = c2083a;
        c2083a.mo32908a(this);
        this.f5054b = C1648b.m34863b(c2083a.f5919d);
    }

    /* renamed from: a */
    private synchronized void m33884a(C2301ag c2301ag) {
        boolean z = true;
        synchronized (this) {
            if ((c2301ag.m32317g() & 15) != 1) {
                z = false;
            }
            if (!this.f5055c && z && !this.f5053a.m33009am()) {
                switch (this.f5057e) {
                    case 0:
                        m33883a(m33885a(C1704R.C1707string.can_takeOff_ATTi));
                        break;
                    case 1:
                        m33883a(m33885a(C1704R.C1707string.can_takeOff_GLOBAL));
                        break;
                    case 2:
                        m33883a(m33885a(C1704R.C1707string.can_takeOff_Local));
                        break;
                }
            }
            if (this.f5055c && !z && !this.f5053a.m33009am()) {
                if (this.f5053a.m32999aw().m32257j()) {
                    m33883a(m33885a(C1704R.C1707string.can_takeOff_ATTi));
                } else {
                    m33883a(m33885a(C1704R.C1707string.self_error_result));
                }
            }
            if (this.f5055c != z) {
                this.f5055c = z;
            }
        }
    }

    /* renamed from: c */
    private synchronized void m33881c() {
        if (!this.f5058f) {
            this.f5058f = true;
            this.f5056d = this.f5057e;
        }
        if (this.f5056d != this.f5057e) {
            switch (this.f5057e) {
                case 0:
                    m33883a(m33885a(C1704R.C1707string.change_contype_ATTi));
                    break;
                case 1:
                    m33883a(m33885a(C1704R.C1707string.change_contype_GLOBAL));
                    break;
                case 2:
                    m33883a(m33885a(C1704R.C1707string.change_contype_Local));
                    break;
            }
            this.f5056d = this.f5057e;
        }
    }

    /* renamed from: a */
    public String m33885a(int i) {
        return this.f5053a.f5919d.getResources().getString(i);
    }

    /* renamed from: a */
    public void m33886a() {
        this.f5053a.mo32903b(this);
        this.f5055c = false;
    }

    /* renamed from: a */
    public void m33883a(String str) {
        this.f5054b.m34867a(str);
    }

    /* renamed from: b */
    public void m33882b() {
        this.f5053a.mo32908a(this);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case NEWFRONEMODEL:
                this.f5057e = c2083a.m33001au().m32393d();
                C2301ag mo32894t = c2083a.mo32894t();
                m33881c();
                m33884a(mo32894t);
                return;
            default:
                return;
        }
    }
}
