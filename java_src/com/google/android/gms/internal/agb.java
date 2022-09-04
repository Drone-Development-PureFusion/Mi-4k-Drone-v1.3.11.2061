package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class agb extends AbstractC4294a {

    /* renamed from: a */
    private final ImageView f21540a;

    /* renamed from: b */
    private final View f21541b;

    /* renamed from: c */
    private final boolean f21542c;

    /* renamed from: d */
    private final Drawable f21543d;

    /* renamed from: e */
    private final String f21544e;

    /* renamed from: f */
    private final Drawable f21545f;

    /* renamed from: g */
    private final String f21546g;

    /* renamed from: h */
    private final Drawable f21547h;

    /* renamed from: i */
    private final String f21548i;

    /* renamed from: j */
    private final View.OnClickListener f21549j;

    public agb(@NonNull ImageView imageView, Context context, @NonNull Drawable drawable, @NonNull Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.f21540a = imageView;
        this.f21543d = drawable;
        this.f21545f = drawable2;
        this.f21547h = drawable3 == null ? drawable2 : drawable3;
        this.f21544e = context.getString(C3424R.C3427string.cast_play);
        this.f21546g = context.getString(C3424R.C3427string.cast_pause);
        this.f21548i = context.getString(C3424R.C3427string.cast_stop);
        this.f21541b = view;
        this.f21542c = z;
        this.f21549j = new View.OnClickListener() { // from class: com.google.android.gms.internal.agb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                C4298c a = agb.this.a();
                if (a == null || !a.m24515t()) {
                    return;
                }
                a.m24516s();
            }
        };
    }

    /* renamed from: a */
    private void m17692a(Drawable drawable, String str) {
        this.f21540a.setImageDrawable(drawable);
        this.f21540a.setContentDescription(str);
        this.f21540a.setVisibility(0);
        this.f21540a.setEnabled(true);
        if (this.f21541b != null) {
            this.f21541b.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m17690a(boolean z) {
        boolean z2 = false;
        if (this.f21541b != null) {
            this.f21541b.setVisibility(0);
        }
        this.f21540a.setVisibility(this.f21542c ? 4 : 0);
        ImageView imageView = this.f21540a;
        if (!z) {
            z2 = true;
        }
        imageView.setEnabled(z2);
    }

    /* renamed from: e */
    private void m17689e() {
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            return;
        }
        if (a.m24522m()) {
            m17692a(this.f21543d, this.f21544e);
        } else if (a.m24523l()) {
            if (a.m24524k()) {
                m17692a(this.f21547h, this.f21548i);
            } else {
                m17692a(this.f21545f, this.f21546g);
            }
        } else if (a.m24521n()) {
            m17690a(false);
        } else if (!a.m24520o()) {
        } else {
            m17690a(true);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21540a.setOnClickListener(this.f21549j);
        m17689e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21540a.setOnClickListener(null);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17689e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: d */
    public void mo17680d() {
        m17690a(true);
    }
}
