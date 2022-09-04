package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4291a;
import com.google.android.gms.cast.framework.media.C4297b;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.images.WebImage;
/* loaded from: classes2.dex */
public class afu extends AbstractC4294a {

    /* renamed from: a */
    private final ImageView f21507a;

    /* renamed from: b */
    private final Context f21508b;

    /* renamed from: c */
    private final int f21509c;

    /* renamed from: d */
    private final Bitmap f21510d;

    /* renamed from: e */
    private final View f21511e;

    /* renamed from: f */
    private final C4291a f21512f;

    /* renamed from: g */
    private afn f21513g;

    /* renamed from: h */
    private Uri f21514h;

    /* renamed from: i */
    private Bitmap f21515i;

    public afu(ImageView imageView, Context context, int i, int i2) {
        C4291a c4291a = null;
        this.f21507a = imageView;
        this.f21508b = context.getApplicationContext();
        this.f21509c = i;
        this.f21510d = BitmapFactory.decodeResource(context.getResources(), i2);
        this.f21511e = null;
        CastMediaOptions m24907g = C4251c.m24868a(context).m24870a().m24907g();
        this.f21512f = m24907g != null ? m24907g.m24699e() : c4291a;
    }

    public afu(ImageView imageView, Context context, int i, View view) {
        C4291a c4291a = null;
        this.f21507a = imageView;
        this.f21508b = context.getApplicationContext();
        this.f21509c = i;
        this.f21511e = view;
        this.f21510d = null;
        CastMediaOptions m24907g = C4251c.m24868a(context).m24870a().m24907g();
        this.f21512f = m24907g != null ? m24907g.m24699e() : c4291a;
    }

    /* renamed from: a */
    private Uri m17712a(MediaInfo mediaInfo) {
        WebImage m24634a;
        if (mediaInfo == null) {
            return null;
        }
        return (this.f21512f == null || (m24634a = this.f21512f.m24634a(mediaInfo.m25139e(), this.f21509c)) == null || m24634a.m23763b() == null) ? C4297b.m24586b(mediaInfo, 0) : m24634a.m23763b();
    }

    /* renamed from: e */
    private void m17706e() {
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            this.f21514h = null;
            m17705f();
            return;
        }
        final Uri m17712a = m17712a(a.m24527h());
        if (m17712a == null) {
            this.f21514h = null;
            m17705f();
        } else if (C4430f.m24206a(this.f21514h, m17712a)) {
        } else {
            this.f21514h = m17712a;
            m17705f();
            this.f21513g = new afn(this.f21508b) { // from class: com.google.android.gms.internal.afu.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public void onPostExecute(Bitmap bitmap) {
                    if (bitmap == null || !C4430f.m24206a(afu.this.f21514h, m17712a)) {
                        return;
                    }
                    if (afu.this.f21511e != null) {
                        afu.this.f21511e.setVisibility(4);
                    }
                    afu.this.f21507a.setVisibility(0);
                    afu.this.f21507a.setImageBitmap(bitmap);
                    if (afu.this.f21515i != null) {
                        afu.this.f21515i.recycle();
                    }
                    afu.this.f21515i = bitmap;
                }
            };
            this.f21513g.m17762a(m17712a);
        }
    }

    /* renamed from: f */
    private void m17705f() {
        if (this.f21511e != null) {
            this.f21511e.setVisibility(0);
            this.f21507a.setVisibility(4);
        }
        if (this.f21510d != null) {
            this.f21507a.setImageBitmap(this.f21510d);
        }
        if (this.f21515i != null) {
            this.f21515i.recycle();
            this.f21515i = null;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        m17705f();
        m17706e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21514h = null;
        if (this.f21513g != null) {
            this.f21513g.cancel(true);
            this.f21513g = null;
        }
        m17705f();
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17706e();
    }
}
