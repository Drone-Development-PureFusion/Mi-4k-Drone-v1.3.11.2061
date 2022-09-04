package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
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
public class aft extends AbstractC4294a {

    /* renamed from: a */
    private final ImageView f21498a;

    /* renamed from: b */
    private final Context f21499b;

    /* renamed from: c */
    private final int f21500c;

    /* renamed from: d */
    private final Bitmap f21501d;

    /* renamed from: e */
    private final C4291a f21502e;

    /* renamed from: f */
    private afn f21503f;

    /* renamed from: g */
    private Uri f21504g;

    public aft(ImageView imageView, Context context, int i, int i2) {
        this.f21498a = imageView;
        this.f21499b = context.getApplicationContext();
        this.f21500c = i;
        this.f21501d = BitmapFactory.decodeResource(context.getResources(), i2);
        CastMediaOptions m24907g = C4251c.m24868a(context).m24870a().m24907g();
        this.f21502e = m24907g != null ? m24907g.m24699e() : null;
    }

    /* renamed from: a */
    private Uri m17717a(MediaQueueItem mediaQueueItem) {
        MediaInfo m25089b;
        WebImage m24634a;
        if (mediaQueueItem == null || (m25089b = mediaQueueItem.m25089b()) == null) {
            return null;
        }
        return (this.f21502e == null || (m24634a = this.f21502e.m24634a(m25089b.m25139e(), this.f21500c)) == null || m24634a.m23763b() == null) ? C4297b.m24586b(m25089b, 0) : m24634a.m23763b();
    }

    /* renamed from: e */
    private void m17714e() {
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            this.f21498a.setImageBitmap(this.f21501d);
            return;
        }
        final Uri m17717a = m17717a(a.m24517r());
        if (m17717a == null) {
            this.f21504g = null;
            this.f21498a.setImageBitmap(this.f21501d);
        } else if (C4430f.m24206a(this.f21504g, m17717a)) {
        } else {
            this.f21504g = m17717a;
            this.f21498a.setImageBitmap(this.f21501d);
            this.f21503f = new afn(this.f21499b) { // from class: com.google.android.gms.internal.aft.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public void onPostExecute(Bitmap bitmap) {
                    if (bitmap == null || !C4430f.m24206a(aft.this.f21504g, m17717a)) {
                        return;
                    }
                    aft.this.f21498a.setImageBitmap(bitmap);
                }
            };
            this.f21503f.m17762a(m17717a);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21498a.setImageBitmap(this.f21501d);
        m17714e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21504g = null;
        if (this.f21503f != null) {
            this.f21503f.cancel(true);
            this.f21503f = null;
        }
        this.f21498a.setImageBitmap(this.f21501d);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17714e();
    }
}
