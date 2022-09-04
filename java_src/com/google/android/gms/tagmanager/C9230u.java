package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.os.Build;
import java.io.File;
/* renamed from: com.google.android.gms.tagmanager.u */
/* loaded from: classes2.dex */
class C9230u {
    /* renamed from: a */
    public static int m8875a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(Build.VERSION.SDK);
            C9065aw.m9301a(valueOf.length() != 0 ? "Invalid version number: ".concat(valueOf) : new String("Invalid version number: "));
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(9)
    /* renamed from: a */
    public static boolean m8874a(String str) {
        if (m8875a() < 9) {
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
