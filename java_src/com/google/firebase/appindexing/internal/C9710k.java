package com.google.firebase.appindexing.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.webkit.URLUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.appindexing.C9676c;
import com.google.firebase.appindexing.C9677d;
import com.google.firebase.appindexing.C9678e;
/* renamed from: com.google.firebase.appindexing.internal.k */
/* loaded from: classes.dex */
public class C9710k {
    /* renamed from: a */
    public static C9676c m7396a(@NonNull Status status, String str) {
        C4588d.m23627a(status);
        String m24021c = status.m24021c();
        if (m24021c != null && !m24021c.isEmpty()) {
            str = m24021c;
        }
        switch (status.m24015i()) {
            case 17510:
                return new C9677d(str);
            case 17511:
                return new C9678e(str);
            default:
                return new C9676c(str);
        }
    }

    /* renamed from: a */
    public static void m7395a(@NonNull String str) {
        C4588d.m23627a(str);
        Uri parse = Uri.parse(str);
        if (parse == null || !parse.isAbsolute()) {
            throw new C9677d(new StringBuilder(String.valueOf(str).length() + 33).append("Invalid String passed as url: '").append(str).append("'.").toString());
        }
    }

    /* renamed from: b */
    public static void m7394b(@NonNull String str) {
        C4588d.m23627a(str);
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return;
        }
        throw new C9677d(new StringBuilder(String.valueOf(str).length() + 46).append("Web url must be with http or https scheme: '").append(str).append("'.").toString());
    }
}
