package com.google.android.gms.analytics.internal;

import android.os.Build;
import java.io.File;
/* renamed from: com.google.android.gms.analytics.internal.an */
/* loaded from: classes2.dex */
public class C3881an {
    /* renamed from: a */
    public static int m26341a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            C3892f.m26294a("Invalid version number", Build.VERSION.SDK);
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m26340a(String str) {
        if (m26341a() < 9) {
            return false;
        }
        File file = new File(str);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
        return true;
    }
}
