package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class afv extends AbstractC4294a {

    /* renamed from: a */
    private final View f21518a;

    /* renamed from: b */
    private final WeakReference<Activity> f21519b;

    /* renamed from: c */
    private final View.OnClickListener f21520c;

    /* renamed from: d */
    private final ComponentName f21521d;

    public afv(View view, Activity activity) {
        this.f21518a = view;
        this.f21519b = new WeakReference<>(activity);
        CastMediaOptions m24907g = C4251c.m24868a((Context) activity).m24870a().m24907g();
        if (m24907g == null || TextUtils.isEmpty(m24907g.m24700d())) {
            this.f21521d = null;
            this.f21520c = null;
            return;
        }
        this.f21521d = new ComponentName(activity.getApplicationContext(), m24907g.m24700d());
        this.f21520c = new View.OnClickListener() { // from class: com.google.android.gms.internal.afv.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Activity activity2 = (Activity) afv.this.f21519b.get();
                if (activity2 != null) {
                    Intent intent = new Intent();
                    intent.setComponent(afv.this.f21521d);
                    activity2.startActivity(intent);
                }
            }
        };
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21518a.setOnClickListener(this.f21520c);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21518a.setOnClickListener(null);
        super.mo17671b();
    }
}
