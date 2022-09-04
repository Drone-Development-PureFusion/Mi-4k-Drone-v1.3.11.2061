package com.google.android.gms.cast.framework.media;

import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
/* renamed from: com.google.android.gms.cast.framework.media.b */
/* loaded from: classes2.dex */
public class C4297b {
    private C4297b() {
    }

    /* renamed from: a */
    public static String m24587a(MediaInfo mediaInfo, int i) {
        Uri m24586b = m24586b(mediaInfo, i);
        if (m24586b == null) {
            return null;
        }
        return m24586b.toString();
    }

    /* renamed from: b */
    public static Uri m24586b(MediaInfo mediaInfo, int i) {
        MediaMetadata m25139e;
        if (mediaInfo == null || (m25139e = mediaInfo.m25139e()) == null || m25139e.m25103f() == null || m25139e.m25103f().size() <= i) {
            return null;
        }
        return m25139e.m25103f().get(i).m23763b();
    }
}
