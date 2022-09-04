package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.AbstractC3456a;
import com.google.android.gms.ads.internal.formats.BinderC3597c;
import com.google.android.gms.ads.mediation.AbstractC3814k;
import com.google.android.gms.internal.AbstractC8020xv;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.yb */
/* loaded from: classes.dex */
public class BinderC8029yb extends AbstractC8020xv.AbstractBinderC8021a {

    /* renamed from: a */
    private final AbstractC3814k f26329a;

    public BinderC8029yb(AbstractC3814k abstractC3814k) {
        this.f26329a = abstractC3814k;
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: a */
    public String mo13000a() {
        return this.f26329a.m26759e();
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: a */
    public void mo12999a(AbstractC4170e abstractC4170e) {
        this.f26329a.c((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: b */
    public List mo12998b() {
        List<AbstractC3456a.AbstractC3457a> m26758f = this.f26329a.m26758f();
        if (m26758f != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC3456a.AbstractC3457a abstractC3457a : m26758f) {
                arrayList.add(new BinderC3597c(abstractC3457a.mo13404a(), abstractC3457a.mo13403b(), abstractC3457a.mo13402c()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: b */
    public void mo12997b(AbstractC4170e abstractC4170e) {
        this.f26329a.a((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: c */
    public String mo12996c() {
        return this.f26329a.m26757g();
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: c */
    public void mo12995c(AbstractC4170e abstractC4170e) {
        this.f26329a.b((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: d */
    public AbstractC7813uu mo12994d() {
        AbstractC3456a.AbstractC3457a m26756h = this.f26329a.m26756h();
        if (m26756h != null) {
            return new BinderC3597c(m26756h.mo13404a(), m26756h.mo13403b(), m26756h.mo13402c());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: e */
    public String mo12993e() {
        return this.f26329a.m26755i();
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: f */
    public String mo12992f() {
        return this.f26329a.m26754j();
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: g */
    public void mo12991g() {
        this.f26329a.d();
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: h */
    public boolean mo12990h() {
        return this.f26329a.a();
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: i */
    public boolean mo12989i() {
        return this.f26329a.b();
    }

    @Override // com.google.android.gms.internal.AbstractC8020xv
    /* renamed from: j */
    public Bundle mo12988j() {
        return this.f26329a.c();
    }
}
