package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.h */
/* loaded from: classes2.dex */
public class C10527h implements AbstractC10524e {

    /* renamed from: a */
    private Context f32678a;

    public C10527h(Context context) {
        this.f32678a = context;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        String str;
        String m4810a = C10538s.m4810a(this.f32678a, "device_id", "");
        if (!TextUtils.isEmpty(m4810a)) {
            String unused = C10526g.f32677a = m4810a;
            return;
        }
        String unused2 = C10526g.f32677a = C10526g.m4852a(this.f32678a);
        Context context = this.f32678a;
        str = C10526g.f32677a;
        C10538s.m4807b(context, "device_id", str);
    }
}
