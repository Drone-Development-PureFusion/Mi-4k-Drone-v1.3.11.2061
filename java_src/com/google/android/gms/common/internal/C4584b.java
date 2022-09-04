package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ajp;
/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes2.dex */
public class C4584b {

    /* renamed from: a */
    private static Object f17038a = new Object();

    /* renamed from: b */
    private static boolean f17039b;

    /* renamed from: c */
    private static String f17040c;

    /* renamed from: d */
    private static int f17041d;

    /* renamed from: a */
    public static String m23638a(Context context) {
        m23636c(context);
        return f17040c;
    }

    /* renamed from: b */
    public static int m23637b(Context context) {
        m23636c(context);
        return f17041d;
    }

    /* renamed from: c */
    private static void m23636c(Context context) {
        Bundle bundle;
        synchronized (f17038a) {
            if (f17039b) {
                return;
            }
            f17039b = true;
            try {
                bundle = ajp.m17106b(context).m17110a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            f17040c = bundle.getString("com.google.app.id");
            f17041d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
