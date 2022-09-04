package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
/* renamed from: com.google.android.gms.common.util.i */
/* loaded from: classes2.dex */
public final class C4686i {

    /* renamed from: a */
    private static Boolean f17293a;

    /* renamed from: b */
    private static Boolean f17294b;

    /* renamed from: c */
    private static Boolean f17295c;

    /* renamed from: d */
    private static Boolean f17296d;

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m23137a(Context context) {
        if (f17295c == null) {
            f17295c = Boolean.valueOf(C4696s.m23105i() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f17295c.booleanValue();
    }

    /* renamed from: a */
    public static boolean m23136a(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (f17293a == null) {
            boolean z2 = (resources.getConfiguration().screenLayout & 15) > 3;
            if ((C4696s.m23114a() && z2) || m23134b(resources)) {
                z = true;
            }
            f17293a = Boolean.valueOf(z);
        }
        return f17293a.booleanValue();
    }

    @TargetApi(21)
    /* renamed from: b */
    public static boolean m23135b(Context context) {
        if (f17296d == null) {
            f17296d = Boolean.valueOf(C4696s.m23103k() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f17296d.booleanValue();
    }

    @TargetApi(13)
    /* renamed from: b */
    private static boolean m23134b(Resources resources) {
        if (f17294b == null) {
            Configuration configuration = resources.getConfiguration();
            f17294b = Boolean.valueOf(C4696s.m23111c() && (configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600);
        }
        return f17294b.booleanValue();
    }
}
