package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class agg extends AbstractC4294a {

    /* renamed from: a */
    private final View f21567a;

    /* renamed from: b */
    private final int f21568b;

    /* renamed from: c */
    private final View.OnClickListener f21569c = new View.OnClickListener() { // from class: com.google.android.gms.internal.agg.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4298c a = agg.this.a();
            if (a == null || !a.m24515t()) {
                return;
            }
            a.m24535d((JSONObject) null);
        }
    };

    public agg(View view, int i) {
        this.f21567a = view;
        this.f21568b = i;
    }

    /* renamed from: e */
    private void m17679e() {
        boolean z;
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            return;
        }
        MediaStatus m24529g = a.m24529g();
        if (m24529g.m25042o() == 0) {
            Integer m25052e = m24529g.m25052e(m24529g.m25045l());
            z = m25052e != null && m25052e.intValue() > 0;
        } else {
            z = true;
        }
        if (!z || a.m24514u()) {
            this.f21567a.setVisibility(this.f21568b);
            this.f21567a.setClickable(false);
            this.f21567a.setEnabled(false);
            return;
        }
        this.f21567a.setVisibility(0);
        this.f21567a.setClickable(true);
        this.f21567a.setEnabled(true);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21567a.setOnClickListener(this.f21569c);
        m17679e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21567a.setOnClickListener(null);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17679e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: d */
    public void mo17680d() {
        this.f21567a.setEnabled(false);
    }
}
