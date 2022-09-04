package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C4657m;
import com.google.android.gms.internal.ajp;
/* renamed from: com.google.android.gms.common.util.y */
/* loaded from: classes2.dex */
public final class C4702y {
    /* renamed from: a */
    public static boolean m23090a(Context context, int i) {
        if (!m23089a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C4657m.m23326a(context).m23320b(context.getPackageManager(), context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException e) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m23089a(Context context, int i, String str) {
        return ajp.m17106b(context).m17112a(i, str);
    }
}
