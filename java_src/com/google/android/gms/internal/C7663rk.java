package com.google.android.gms.internal;

import android.content.ComponentName;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.gms.internal.rk */
/* loaded from: classes2.dex */
public class C7663rk extends CustomTabsServiceConnection {

    /* renamed from: a */
    private WeakReference<AbstractC7664rl> f25445a;

    public C7663rk(AbstractC7664rl abstractC7664rl) {
        this.f25445a = new WeakReference<>(abstractC7664rl);
    }

    /* renamed from: a */
    public void m13810a(ComponentName componentName) {
        AbstractC7664rl abstractC7664rl = this.f25445a.get();
        if (abstractC7664rl != null) {
            abstractC7664rl.mo13416a();
        }
    }

    /* renamed from: a */
    public void m13809a(ComponentName componentName, CustomTabsClient customTabsClient) {
        AbstractC7664rl abstractC7664rl = this.f25445a.get();
        if (abstractC7664rl != null) {
            abstractC7664rl.mo13412a(customTabsClient);
        }
    }
}
