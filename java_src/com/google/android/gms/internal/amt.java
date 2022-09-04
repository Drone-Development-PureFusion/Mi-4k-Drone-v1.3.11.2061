package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C4657m;
/* loaded from: classes2.dex */
final class amt {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m16756a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (C4657m.m23326a(context).m23320b(packageManager, packageManager.getPackageInfo("com.google.android.gms", 64))) {
                return true;
            }
            Log.e("InstantAppsApi", "Incorrect signature for Google Play Services");
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
