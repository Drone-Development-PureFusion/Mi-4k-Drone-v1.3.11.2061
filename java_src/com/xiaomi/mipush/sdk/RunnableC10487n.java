package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.n */
/* loaded from: classes2.dex */
public final class RunnableC10487n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f32583a;

    /* renamed from: b */
    final /* synthetic */ Context f32584b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10487n(String[] strArr, Context context) {
        this.f32583a = strArr;
        this.f32584b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String[] strArr;
        PackageInfo packageInfo;
        try {
            for (String str : this.f32583a) {
                if (!TextUtils.isEmpty(str) && (packageInfo = this.f32584b.getPackageManager().getPackageInfo(str, 4)) != null) {
                    MiPushClient.awakePushServiceByPackageInfo(this.f32584b, packageInfo);
                }
            }
        } catch (Throwable th) {
            AbstractC10404b.m5267a(th);
        }
    }
}
