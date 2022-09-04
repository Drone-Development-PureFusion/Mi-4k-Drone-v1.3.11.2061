package com.xiaomi.smack;

import com.xiaomi.network.HostManager;
/* renamed from: com.xiaomi.smack.k */
/* loaded from: classes2.dex */
class RunnableC10729k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f33448a;

    /* renamed from: b */
    final /* synthetic */ AbstractC10726h f33449b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10729k(AbstractC10726h abstractC10726h, String str) {
        this.f33449b = abstractC10726h;
        this.f33448a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        HostManager.getInstance().getFallbacksByHost(this.f33448a, true);
    }
}
