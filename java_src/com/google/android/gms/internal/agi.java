package com.google.android.gms.internal;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class agi extends AbstractC4294a implements C4298c.AbstractC4325d {

    /* renamed from: a */
    private final TextView f21571a;

    /* renamed from: b */
    private final String f21572b;

    /* renamed from: c */
    private final View f21573c;

    public agi(TextView textView, String str, View view) {
        this.f21571a = textView;
        this.f21572b = str;
        this.f21573c = view;
    }

    /* renamed from: a */
    private void m17678a(long j, boolean z) {
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            this.f21571a.setVisibility(0);
            this.f21571a.setText(this.f21572b);
            if (this.f21573c == null) {
                return;
            }
            this.f21573c.setVisibility(4);
        } else if (a.m24524k()) {
            this.f21571a.setText(this.f21572b);
            if (this.f21573c == null) {
                return;
            }
            this.f21571a.setVisibility(4);
            this.f21573c.setVisibility(0);
        } else {
            if (z) {
                j = a.m24531f();
            }
            this.f21571a.setVisibility(0);
            this.f21571a.setText(DateUtils.formatElapsedTime(j / 1000));
            if (this.f21573c == null) {
                return;
            }
            this.f21573c.setVisibility(4);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4325d
    /* renamed from: a */
    public void mo17676a(long j, long j2) {
        m17678a(j2, false);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        if (a() != null) {
            a().m24563a(this, 1000L);
        }
        m17678a(-1L, true);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21571a.setText(this.f21572b);
        if (a() != null) {
            a().m24564a(this);
        }
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17678a(-1L, true);
    }
}
