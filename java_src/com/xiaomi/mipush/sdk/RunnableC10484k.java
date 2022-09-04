package com.xiaomi.mipush.sdk;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.k */
/* loaded from: classes2.dex */
public final class RunnableC10484k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f32580a;

    /* renamed from: b */
    final /* synthetic */ String f32581b;

    /* renamed from: c */
    final /* synthetic */ String f32582c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10484k(Context context, String str, String str2) {
        this.f32580a = context;
        this.f32581b = str;
        this.f32582c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        MiPushClient.initialize(this.f32580a, this.f32581b, this.f32582c, null);
    }
}
