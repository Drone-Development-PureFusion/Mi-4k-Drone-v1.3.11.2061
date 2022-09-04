package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.util.C4696s;
/* loaded from: classes2.dex */
public class ajo {

    /* renamed from: a */
    protected final Context f22031a;

    public ajo(Context context) {
        this.f22031a = context;
    }

    /* renamed from: a */
    public int m17109a(String str, String str2) {
        return this.f22031a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public ApplicationInfo m17110a(String str, int i) {
        return this.f22031a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public CharSequence m17111a(String str) {
        return this.f22031a.getPackageManager().getApplicationLabel(this.f22031a.getPackageManager().getApplicationInfo(str, 0));
    }

    @TargetApi(19)
    /* renamed from: a */
    public boolean m17112a(int i, String str) {
        if (C4696s.m23106h()) {
            try {
                ((AppOpsManager) this.f22031a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = this.f22031a.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (String str2 : packagesForUid) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public PackageInfo m17108b(String str, int i) {
        return this.f22031a.getPackageManager().getPackageInfo(str, i);
    }
}
