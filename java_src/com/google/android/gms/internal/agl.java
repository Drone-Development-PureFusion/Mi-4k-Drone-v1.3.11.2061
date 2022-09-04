package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class agl extends AbstractC4294a {

    /* renamed from: a */
    private final View f21580a;

    /* renamed from: b */
    private final int f21581b;

    public agl(View view, int i) {
        this.f21580a = view;
        this.f21581b = i;
    }

    /* renamed from: e */
    private void m17669e() {
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            this.f21580a.setVisibility(this.f21581b);
        } else {
            this.f21580a.setVisibility(0);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        m17669e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21580a.setVisibility(this.f21581b);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17669e();
    }
}
