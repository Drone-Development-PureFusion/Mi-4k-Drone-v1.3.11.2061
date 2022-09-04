package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.os.Build;
import java.io.File;
/* loaded from: classes2.dex */
class aox {
    /* renamed from: a */
    public static int m16425a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(Build.VERSION.SDK);
            aph.m16396a(valueOf.length() != 0 ? "Invalid version number: ".concat(valueOf) : new String("Invalid version number: "));
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(9)
    /* renamed from: a */
    public static boolean m16424a(String str) {
        if (m16425a() < 9) {
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
