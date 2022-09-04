package com.xiaomi.mistatistic.sdk.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.y */
/* loaded from: classes2.dex */
public class HandlerC10544y extends Handler {

    /* renamed from: a */
    final /* synthetic */ C10543x f32699a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10544y(C10543x c10543x, Looper looper) {
        super(looper);
        this.f32699a = c10543x;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case 31415927:
                long m4811a = C10538s.m4811a(AbstractC10508a.m4880a(), "session_begin", 0L);
                long m4811a2 = C10538s.m4811a(AbstractC10508a.m4880a(), "last_deactivate", 0L);
                String m4810a = C10538s.m4810a(AbstractC10508a.m4880a(), "pv_path", "");
                if (m4811a > 0 && m4811a2 > m4811a) {
                    this.f32699a.m4792a(AbstractC10508a.m4880a(), m4811a, m4811a2);
                }
                if (TextUtils.isEmpty(m4810a)) {
                    return;
                }
                this.f32699a.m4791a(AbstractC10508a.m4880a(), m4810a);
                return;
            default:
                return;
        }
    }
}
