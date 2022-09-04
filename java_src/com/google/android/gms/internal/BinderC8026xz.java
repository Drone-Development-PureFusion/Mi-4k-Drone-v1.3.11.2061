package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.AbstractC3456a;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.formats.BinderC3597c;
import com.google.android.gms.ads.mediation.AbstractC3813j;
import com.google.android.gms.internal.AbstractC8017xu;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.xz */
/* loaded from: classes.dex */
public class BinderC8026xz extends AbstractC8017xu.AbstractBinderC8018a {

    /* renamed from: a */
    private final AbstractC3813j f26328a;

    public BinderC8026xz(AbstractC3813j abstractC3813j) {
        this.f26328a = abstractC3813j;
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: a */
    public String mo13016a() {
        return this.f26328a.m26775e();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: a */
    public void mo13015a(AbstractC4170e abstractC4170e) {
        this.f26328a.c((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: b */
    public List mo13014b() {
        List<AbstractC3456a.AbstractC3457a> m26773f = this.f26328a.m26773f();
        if (m26773f != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC3456a.AbstractC3457a abstractC3457a : m26773f) {
                arrayList.add(new BinderC3597c(abstractC3457a.mo13404a(), abstractC3457a.mo13403b(), abstractC3457a.mo13402c()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: b */
    public void mo13013b(AbstractC4170e abstractC4170e) {
        this.f26328a.a((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: c */
    public String mo13012c() {
        return this.f26328a.m26772g();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: c */
    public void mo13011c(AbstractC4170e abstractC4170e) {
        this.f26328a.b((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: d */
    public AbstractC7813uu mo13010d() {
        AbstractC3456a.AbstractC3457a m26771h = this.f26328a.m26771h();
        if (m26771h != null) {
            return new BinderC3597c(m26771h.mo13404a(), m26771h.mo13403b(), m26771h.mo13402c());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: e */
    public String mo13009e() {
        return this.f26328a.m26770i();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: f */
    public double mo13008f() {
        return this.f26328a.m26769j();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: g */
    public String mo13007g() {
        return this.f26328a.m26768k();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: h */
    public String mo13006h() {
        return this.f26328a.m26767l();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: i */
    public void mo13005i() {
        this.f26328a.d();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: j */
    public boolean mo13004j() {
        return this.f26328a.a();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: k */
    public boolean mo13003k() {
        return this.f26328a.b();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: l */
    public Bundle mo13002l() {
        return this.f26328a.c();
    }

    @Override // com.google.android.gms.internal.AbstractC8017xu
    /* renamed from: m */
    public AbstractC3553c mo13001m() {
        if (this.f26328a.m26766m() != null) {
            return this.f26328a.m26766m().m27701a();
        }
        return null;
    }
}
