package com.xiaomi.mistatistic.sdk.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.places.AbstractC8240d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.k */
/* loaded from: classes2.dex */
public class HandlerC10530k extends Handler {

    /* renamed from: a */
    final /* synthetic */ C10529j f32685a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10530k(C10529j c10529j, Looper looper) {
        super(looper);
        this.f32685a = c10529j;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case AbstractC8240d.f27013bp /* 1023 */:
                C10521b.m4854b().m4856a(new C10531l(this));
                return;
            default:
                return;
        }
    }
}
