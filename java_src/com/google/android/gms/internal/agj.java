package com.google.android.gms.internal;

import android.text.format.DateUtils;
import android.widget.TextView;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class agj extends AbstractC4294a implements C4298c.AbstractC4325d {

    /* renamed from: a */
    private final TextView f21574a;

    /* renamed from: b */
    private final long f21575b;

    /* renamed from: c */
    private final String f21576c;

    /* renamed from: d */
    private boolean f21577d = true;

    public agj(TextView textView, long j, String str) {
        this.f21574a = textView;
        this.f21575b = j;
        this.f21576c = str;
    }

    /* renamed from: a */
    public void m17677a(long j) {
        this.f21574a.setText(DateUtils.formatElapsedTime(j / 1000));
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4325d
    /* renamed from: a */
    public void mo17676a(long j, long j2) {
        if (m17674e()) {
            this.f21574a.setText(DateUtils.formatElapsedTime(j / 1000));
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        C4298c a = a();
        if (a != null) {
            a.m24563a(this, this.f21575b);
            if (a.m24515t()) {
                this.f21574a.setText(DateUtils.formatElapsedTime(a.m24534e() / 1000));
            } else {
                this.f21574a.setText(this.f21576c);
            }
        }
    }

    /* renamed from: a */
    public void m17675a(boolean z) {
        this.f21577d = z;
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21574a.setText(this.f21576c);
        if (a() != null) {
            a().m24564a(this);
        }
        super.mo17671b();
    }

    /* renamed from: e */
    public boolean m17674e() {
        return this.f21577d;
    }
}
