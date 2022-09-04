package com.p255mi.live.openlivesdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;
/* renamed from: com.mi.live.openlivesdk.d */
/* loaded from: classes2.dex */
public class C10029d {

    /* renamed from: a */
    public static final String f30921a = "com.wali.live";

    /* renamed from: b */
    public static final int f30922b = 101020;

    /* renamed from: c */
    public static final int f30923c = 1;

    /* renamed from: d */
    public static final int f30924d = -2;

    /* renamed from: e */
    public static final int f30925e = -3;

    /* renamed from: a */
    public static int m6431a(Context context) {
        int i = 0;
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            while (true) {
                int i2 = i;
                if (i2 >= installedPackages.size()) {
                    break;
                }
                PackageInfo packageInfo = installedPackages.get(i2);
                if (f30921a.equals(packageInfo.packageName)) {
                    return packageInfo.versionCode >= 101020 ? 1 : -3;
                }
                i = i2 + 1;
            }
        }
        return -2;
    }
}
