package com.fimi.soul.biz.p188p;

import com.fimi.kernel.p158b.p162d.C1629c;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.entity.ChangeWifiPAs;
import com.fimi.soul.entity.CommadBean;
import com.fimi.soul.entity.Fwap;
import com.fimi.soul.utils.C3082aj;
/* renamed from: com.fimi.soul.biz.p.a */
/* loaded from: classes.dex */
public class C2024a {

    /* renamed from: a */
    private volatile String f5695a;

    /* renamed from: b */
    private volatile String f5696b;

    /* renamed from: com.fimi.soul.biz.p.a$a */
    /* loaded from: classes.dex */
    private static class C2026a {

        /* renamed from: a */
        private static final C2024a f5698a = new C2024a();

        private C2026a() {
        }
    }

    /* renamed from: a */
    public static C2024a m33219a() {
        return C2026a.f5698a;
    }

    /* renamed from: a */
    public void m33217a(String str) {
        this.f5695a = str;
    }

    /* renamed from: b */
    public void m33216b() {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.p.a.1
            @Override // java.lang.Runnable
            public void run() {
                CommadBean commadBean = new CommadBean();
                commadBean.setType("0");
                commadBean.setData("fwdap");
                commadBean.setName("modify");
                Fwap fwap = new Fwap();
                fwap.setKey(C2024a.this.f5696b);
                fwap.setSsid(C2024a.this.f5695a);
                C1629c m34183o = C1772d.m34208a().m34183o();
                ChangeWifiPAs changeWifiPAs = new ChangeWifiPAs();
                changeWifiPAs.setmCommadBean(commadBean);
                changeWifiPAs.setmFwap(fwap);
                m34183o.m34943a(C3082aj.m29330a(changeWifiPAs).getBytes());
            }
        });
    }

    /* renamed from: b */
    public void m33214b(String str) {
        this.f5696b = str;
    }

    /* renamed from: c */
    public String m33213c() {
        return this.f5695a;
    }

    /* renamed from: d */
    public String m33212d() {
        return this.f5696b;
    }
}
