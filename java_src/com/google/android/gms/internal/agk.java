package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class agk extends AbstractC4294a {

    /* renamed from: a */
    private final View f21578a;

    /* renamed from: b */
    private final int f21579b;

    public agk(View view, int i) {
        this.f21578a = view;
        this.f21579b = i;
    }

    /* renamed from: e */
    private void m17673e() {
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            this.f21578a.setVisibility(this.f21579b);
        } else if (a.m24529g().m25043n() == 0) {
            this.f21578a.setVisibility(this.f21579b);
        } else {
            this.f21578a.setVisibility(0);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        m17673e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21578a.setVisibility(this.f21579b);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17673e();
    }
}
