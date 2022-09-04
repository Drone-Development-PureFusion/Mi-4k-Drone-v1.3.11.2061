package com.xiaomi.mistatistic.sdk.controller;

import com.xiaomi.mistatistic.sdk.C10501a;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.ag */
/* loaded from: classes2.dex */
public class C10520ag implements AbstractC10524e {

    /* renamed from: a */
    final /* synthetic */ C10515ab f32667a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10520ag(C10515ab c10515ab) {
        this.f32667a = c10515ab;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        if (!MiStatInterface.isExceptionCatcherEnabled() || MiStatInterface.shouldExceptionUploadImmediately()) {
            return;
        }
        for (Throwable th : C10501a.m4897b()) {
            C10501a.m4899a(th);
        }
        C10501a.m4895c();
    }
}
