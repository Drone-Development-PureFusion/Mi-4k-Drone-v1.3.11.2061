package com.fimi.p140a;

import android.content.Context;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.p140a.p143c.AbstractC1497a;
import com.fimi.p140a.p143c.AbstractC1499c;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.p170b.C1769c;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.module.update.p218a.C3021a;
/* renamed from: com.fimi.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1488a implements AbstractC1497a {

    /* renamed from: a */
    protected String f3551a = C1756a.f4517J;

    /* renamed from: b */
    protected boolean f3552b;

    /* renamed from: c */
    protected C1681v f3553c;

    /* renamed from: d */
    private C1827d f3554d;

    public AbstractC1488a(Context context, AbstractC1499c abstractC1499c) {
    }

    /* renamed from: a */
    public void m35501a(Context context) {
        this.f3553c = C1681v.m34543a(context);
        this.f3551a = C1756a.f4517J;
        this.f3552b = C1642c.m34887c().mo34872d(C1756a.f4519L);
        C3021a.m29616a().m29609c();
        C1772d.m34208a().m34201b((String) null);
        C1769c.m34218a().m34213b((String) null);
        this.f3554d = (C1827d) C1783b.m34166a().m34150d();
        this.f3554d.m33987w().m33996b();
        if (this.f3554d.e()) {
            this.f3554d.m33989u().m34037k();
        }
    }

    /* renamed from: e_ */
    public abstract void mo28266e_();
}
