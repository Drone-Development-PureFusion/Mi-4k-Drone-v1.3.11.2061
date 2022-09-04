package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C4686i;
/* loaded from: classes2.dex */
public class akk {

    /* renamed from: a */
    private static int f22128a = -1;

    /* renamed from: a */
    private static boolean m17028a() {
        return false;
    }

    /* renamed from: a */
    public static boolean m17027a(Context context) {
        return C4686i.m23137a(context);
    }

    /* renamed from: b */
    public static int m17025b(Context context) {
        if (f22128a == -1) {
            if (m17027a(context)) {
                f22128a = 3;
            } else if (m17022e(context) || m17028a()) {
                f22128a = 0;
            } else if (m17024c(context)) {
                f22128a = 2;
            } else if (m17026b()) {
                f22128a = 6;
            } else {
                f22128a = 1;
            }
        }
        return f22128a;
    }

    /* renamed from: b */
    private static boolean m17026b() {
        return !TextUtils.isEmpty(Build.PRODUCT) && Build.PRODUCT.startsWith("glass_");
    }

    /* renamed from: c */
    private static boolean m17024c(Context context) {
        return C4686i.m23136a(context.getResources()) && !m17023d(context);
    }

    /* renamed from: d */
    private static boolean m17023d(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
        } catch (Resources.NotFoundException e) {
            Log.wtf("Fitness", "Unable to determine type of device, assuming phone.", e);
            return true;
        }
    }

    /* renamed from: e */
    private static boolean m17022e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback");
    }
}
