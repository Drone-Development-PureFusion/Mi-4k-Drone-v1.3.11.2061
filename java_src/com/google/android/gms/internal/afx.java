package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class afx extends AbstractC4294a {

    /* renamed from: a */
    private final View f21526a;

    public afx(View view) {
        this.f21526a = view;
    }

    /* renamed from: e */
    private void m17700e() {
        C4298c a = a();
        if (a == null || !a.m24515t() || !a.m24521n()) {
            this.f21526a.setVisibility(8);
        } else {
            this.f21526a.setVisibility(0);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        m17700e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21526a.setVisibility(8);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17700e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: d */
    public void mo17680d() {
        this.f21526a.setVisibility(0);
    }
}
