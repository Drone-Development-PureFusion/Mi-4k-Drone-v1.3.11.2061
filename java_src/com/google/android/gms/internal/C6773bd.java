package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;
/* renamed from: com.google.android.gms.internal.bd */
/* loaded from: classes2.dex */
public class C6773bd {
    /* renamed from: a */
    public static ace m16201a(Context context) {
        return m16200a(context, null);
    }

    /* renamed from: a */
    public static ace m16200a(Context context, apm apmVar) {
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = new StringBuilder(String.valueOf(packageName).length() + 12).append(packageName).append("/").append(context.getPackageManager().getPackageInfo(packageName, 0).versionCode).toString();
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (apmVar == null) {
            apmVar = Build.VERSION.SDK_INT >= 9 ? new aqn() : new ank(AndroidHttpClient.newInstance(str));
        }
        ace aceVar = new ace(new amj(file), new akh(apmVar));
        aceVar.m18231a();
        return aceVar;
    }
}
