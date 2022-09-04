package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.C0920o;
import java.io.File;
/* renamed from: com.android.volley.toolbox.t */
/* loaded from: classes.dex */
public class C0966t {

    /* renamed from: a */
    private static final String f2163a = "volley";

    /* renamed from: a */
    public static C0920o m37269a(Context context) {
        return m37267a(context, (AbstractC0946i) null);
    }

    /* renamed from: a */
    public static C0920o m37268a(Context context, int i) {
        return m37266a(context, null, i);
    }

    /* renamed from: a */
    public static C0920o m37267a(Context context, AbstractC0946i abstractC0946i) {
        return m37266a(context, abstractC0946i, -1);
    }

    /* renamed from: a */
    public static C0920o m37266a(Context context, AbstractC0946i abstractC0946i, int i) {
        String packageName;
        File file = new File(context.getCacheDir(), f2163a);
        String str = "volley/0";
        try {
            str = context.getPackageName() + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (abstractC0946i == null) {
            abstractC0946i = Build.VERSION.SDK_INT >= 9 ? new C0947j() : new C0943g(AndroidHttpClient.newInstance(str));
        }
        C0935c c0935c = new C0935c(abstractC0946i);
        C0920o c0920o = i <= -1 ? new C0920o(new C0939f(file), c0935c) : new C0920o(new C0939f(file, i), c0935c);
        c0920o.m37396a();
        return c0920o;
    }
}
