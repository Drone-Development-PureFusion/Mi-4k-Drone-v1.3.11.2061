package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.AbstractC4335e;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.cast.framework.media.a */
/* loaded from: classes2.dex */
public class C4291a {

    /* renamed from: a */
    public static final int f16315a = 0;

    /* renamed from: b */
    public static final int f16316b = 1;

    /* renamed from: c */
    public static final int f16317c = 2;

    /* renamed from: d */
    private final AbstractC4335e f16318d = new BinderC4293a();

    /* renamed from: com.google.android.gms.cast.framework.media.a$a */
    /* loaded from: classes2.dex */
    private class BinderC4293a extends AbstractC4335e.AbstractBinderC4336a {
        private BinderC4293a() {
        }

        @Override // com.google.android.gms.cast.framework.media.AbstractC4335e
        /* renamed from: a */
        public int mo24489a() {
            return 9683208;
        }

        @Override // com.google.android.gms.cast.framework.media.AbstractC4335e
        /* renamed from: a */
        public WebImage mo24488a(MediaMetadata mediaMetadata, int i) {
            return C4291a.this.m24634a(mediaMetadata, i);
        }

        @Override // com.google.android.gms.cast.framework.media.AbstractC4335e
        /* renamed from: b */
        public AbstractC4170e mo24487b() {
            return BinderC4173f.m25293a(C4291a.this);
        }
    }

    /* renamed from: a */
    public AbstractC4335e m24635a() {
        return this.f16318d;
    }

    /* renamed from: a */
    public WebImage m24634a(MediaMetadata mediaMetadata, int i) {
        if (mediaMetadata == null || !mediaMetadata.m25101g()) {
            return null;
        }
        return mediaMetadata.m25103f().get(0);
    }
}
