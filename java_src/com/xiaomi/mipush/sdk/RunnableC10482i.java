package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.i */
/* loaded from: classes2.dex */
public final class RunnableC10482i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f32577a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10482i(Context context) {
        this.f32577a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.f32577a.getPackageManager().getPackageInfo(this.f32577a.getPackageName(), 4612);
            C10479h.m4974c(this.f32577a);
            C10479h.m4972d(this.f32577a, packageInfo);
            C10479h.m4973c(this.f32577a, packageInfo);
        } catch (Throwable th) {
            Log.e("ManifestChecker", "", th);
        }
    }
}
