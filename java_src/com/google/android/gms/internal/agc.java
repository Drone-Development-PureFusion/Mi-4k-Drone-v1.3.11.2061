package com.google.android.gms.internal;

import android.widget.ProgressBar;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class agc extends AbstractC4294a implements C4298c.AbstractC4325d {

    /* renamed from: a */
    private final ProgressBar f21551a;

    /* renamed from: b */
    private final long f21552b;

    public agc(ProgressBar progressBar, long j) {
        this.f21551a = progressBar;
        this.f21552b = j;
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4325d
    /* renamed from: a */
    public void mo17676a(long j, long j2) {
        this.f21551a.setProgress((int) j);
        this.f21551a.setMax((int) j2);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        C4298c a = a();
        if (a != null) {
            a.m24563a(this, this.f21552b);
            if (a.m24515t()) {
                this.f21551a.setProgress((int) a.m24534e());
                this.f21551a.setMax((int) a.m24531f());
                return;
            }
            this.f21551a.setProgress(0);
            this.f21551a.setMax(1);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        if (a() != null) {
            a().m24564a(this);
        }
        this.f21551a.setProgress(0);
        this.f21551a.setMax(1);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            this.f21551a.setProgress(0);
            this.f21551a.setMax(1);
        }
    }
}
