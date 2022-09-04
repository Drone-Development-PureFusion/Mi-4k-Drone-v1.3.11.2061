package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.C4201a;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import com.google.android.gms.cast.internal.C4440m;
import java.io.IOException;
/* loaded from: classes2.dex */
public class aga extends AbstractC4294a {

    /* renamed from: a */
    private static final C4440m f21531a = new C4440m("MuteToggleUIController");

    /* renamed from: b */
    private final ImageView f21532b;

    /* renamed from: c */
    private final String f21533c;

    /* renamed from: d */
    private final String f21534d;

    /* renamed from: e */
    private final Context f21535e;

    /* renamed from: f */
    private final C4201a.C4215d f21536f = new C4201a.C4215d() { // from class: com.google.android.gms.internal.aga.1
        @Override // com.google.android.gms.cast.C4201a.C4215d
        /* renamed from: b */
        public void mo17693b() {
            aga.this.m17694f();
        }
    };

    /* renamed from: g */
    private final View.OnClickListener f21537g = new View.OnClickListener() { // from class: com.google.android.gms.internal.aga.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4253d m24715b = C4251c.m24868a(aga.this.f21535e).m24862b().m24715b();
            if (m24715b == null || !m24715b.o()) {
                return;
            }
            try {
                if (m24715b.m24827i()) {
                    m24715b.m24840b(false);
                    aga.this.m17697a(true);
                } else {
                    m24715b.m24840b(true);
                    aga.this.m17697a(false);
                }
            } catch (IOException | IllegalArgumentException e) {
                aga.f21531a.m24154e("Unable to call CastSession.setMute(boolean).", e);
            }
        }
    };

    public aga(ImageView imageView, Context context) {
        this.f21532b = imageView;
        this.f21535e = context.getApplicationContext();
        this.f21533c = this.f21535e.getString(C3424R.C3427string.cast_mute);
        this.f21534d = this.f21535e.getString(C3424R.C3427string.cast_unmute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17697a(boolean z) {
        this.f21532b.setSelected(z);
        this.f21532b.setContentDescription(z ? this.f21533c : this.f21534d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m17694f() {
        C4253d m24715b = C4251c.m24868a(this.f21535e).m24862b().m24715b();
        if (m24715b == null || !m24715b.o()) {
            this.f21532b.setEnabled(false);
            return;
        }
        this.f21532b.setEnabled(true);
        if (m24715b.m24827i()) {
            m17697a(false);
        } else {
            m17697a(true);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21532b.setOnClickListener(this.f21537g);
        c4253d.m24851a(this.f21536f);
        m17694f();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21532b.setOnClickListener(null);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        this.f21532b.setEnabled(true);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: d */
    public void mo17680d() {
        this.f21532b.setEnabled(false);
    }
}
