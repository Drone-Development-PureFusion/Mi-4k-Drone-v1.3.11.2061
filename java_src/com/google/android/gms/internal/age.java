package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class age extends AbstractC4294a {

    /* renamed from: a */
    private final View f21559a;

    /* renamed from: b */
    private final View.OnClickListener f21560b;

    public age(View view, final long j) {
        this.f21559a = view;
        this.f21560b = new View.OnClickListener() { // from class: com.google.android.gms.internal.age.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                C4298c a = age.this.a();
                if (a == null || !a.m24515t()) {
                    return;
                }
                a.m24578a(a.m24534e() + j);
            }
        };
    }

    /* renamed from: e */
    private void m17684e() {
        C4298c a = a();
        if (a == null || !a.m24515t() || a.m24524k() || a.m24514u()) {
            this.f21559a.setEnabled(false);
        } else {
            this.f21559a.setEnabled(true);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21559a.setOnClickListener(this.f21560b);
        m17684e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21559a.setOnClickListener(null);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17684e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: d */
    public void mo17680d() {
        this.f21559a.setEnabled(false);
    }
}
