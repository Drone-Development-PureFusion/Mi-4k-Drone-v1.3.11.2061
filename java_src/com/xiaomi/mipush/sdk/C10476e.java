package com.xiaomi.mipush.sdk;

import android.net.wifi.ScanResult;
import java.util.Comparator;
/* renamed from: com.xiaomi.mipush.sdk.e */
/* loaded from: classes2.dex */
class C10476e implements Comparator<ScanResult> {

    /* renamed from: a */
    final /* synthetic */ C10475d f32565a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10476e(C10475d c10475d) {
        this.f32565a = c10475d;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(ScanResult scanResult, ScanResult scanResult2) {
        return scanResult2.level - scanResult.level;
    }
}
