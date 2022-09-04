package com.xiaomi.mistatistic.sdk.controller;

import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.controller.p270a.AbstractC10511c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.u */
/* loaded from: classes2.dex */
public class C10540u implements AbstractC10511c {

    /* renamed from: a */
    final /* synthetic */ C10539t f32693a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10540u(C10539t c10539t) {
        this.f32693a = c10539t;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.p270a.AbstractC10511c
    /* renamed from: a */
    public void mo4796a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            boolean unused = C10539t.f32691b = false;
            return;
        }
        this.f32693a.f32692a = j;
        this.f32693a.m4802a(str);
    }
}
