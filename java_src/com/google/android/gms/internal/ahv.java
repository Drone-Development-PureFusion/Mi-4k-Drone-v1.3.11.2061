package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4593i;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aia;
/* loaded from: classes2.dex */
public class ahv implements ahz {

    /* renamed from: a */
    private final aia f21790a;

    /* renamed from: b */
    private boolean f21791b = false;

    public ahv(aia aiaVar) {
        this.f21790a = aiaVar;
    }

    /* renamed from: c */
    private <A extends C4467a.AbstractC4474c> void m17422c(ahl.AbstractC6343a<? extends AbstractC4502m, A> abstractC6343a) {
        this.f21790a.f21876i.f21842k.m17174a(abstractC6343a);
        C4467a.AbstractC4477f m17370b = this.f21790a.f21876i.m17370b((C4467a.C4475d<?>) abstractC6343a.m17475g());
        if (!m17370b.m24004t() && this.f21790a.f21871d.containsKey(abstractC6343a.m17475g())) {
            abstractC6343a.mo7412c(new Status(17));
            return;
        }
        boolean z = m17370b instanceof C4593i;
        C4467a.AbstractC4479h abstractC4479h = m17370b;
        if (z) {
            abstractC4479h = ((C4593i) m17370b).m23603h();
        }
        abstractC6343a.m17476b((ahl.AbstractC6343a<? extends AbstractC4502m, A>) abstractC4479h);
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17335a(T t) {
        return (T) mo17333b(t);
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17339a() {
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17338a(int i) {
        this.f21790a.m17331a((ConnectionResult) null);
        this.f21790a.f21877j.mo17230a(i, this.f21791b);
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17337a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17336a(ConnectionResult connectionResult, C4467a<?> c4467a, int i) {
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17333b(T t) {
        try {
            m17422c(t);
        } catch (DeadObjectException e) {
            this.f21790a.m17330a(new aia.AbstractC6373a(this) { // from class: com.google.android.gms.internal.ahv.1
                @Override // com.google.android.gms.internal.aia.AbstractC6373a
                /* renamed from: a */
                public void mo17323a() {
                    ahv.this.mo17338a(1);
                }
            });
        }
        return t;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: b */
    public boolean mo17334b() {
        if (this.f21791b) {
            return false;
        }
        if (!this.f21790a.f21876i.m17348p()) {
            this.f21790a.m17331a((ConnectionResult) null);
            return true;
        }
        this.f21791b = true;
        for (aiw aiwVar : this.f21790a.f21876i.f21841j) {
            aiwVar.m17191a();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: c */
    public void mo17332c() {
        if (this.f21791b) {
            this.f21791b = false;
            this.f21790a.m17330a(new aia.AbstractC6373a(this) { // from class: com.google.android.gms.internal.ahv.2
                @Override // com.google.android.gms.internal.aia.AbstractC6373a
                /* renamed from: a */
                public void mo17323a() {
                    ahv.this.f21790a.f21877j.mo17229a((Bundle) null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m17421d() {
        if (this.f21791b) {
            this.f21791b = false;
            this.f21790a.f21876i.f21842k.m17175a();
            mo17334b();
        }
    }
}
