package com.google.android.gms.auth.api.credentials.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.auth.api.credentials.internal.b */
/* loaded from: classes2.dex */
public class C4013b {
    /* renamed from: a */
    public static String m25744a(String str) {
        boolean z = false;
        C4588d.m23618b(!TextUtils.isEmpty(str), "account type cannot be empty");
        String scheme = Uri.parse(str).getScheme();
        if (UriUtil.HTTP_SCHEME.equalsIgnoreCase(scheme) || UriUtil.HTTPS_SCHEME.equalsIgnoreCase(scheme)) {
            z = true;
        }
        C4588d.m23618b(z, "Account type must be an http or https URI");
        return str;
    }
}
