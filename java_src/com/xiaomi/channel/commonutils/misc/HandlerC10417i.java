package com.xiaomi.channel.commonutils.misc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.channel.commonutils.misc.C10414h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.channel.commonutils.misc.i */
/* loaded from: classes2.dex */
public class HandlerC10417i extends Handler {

    /* renamed from: a */
    final /* synthetic */ C10414h f32363a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10417i(C10414h c10414h, Looper looper) {
        super(looper);
        this.f32363a = c10414h;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C10414h.AbstractC10416b abstractC10416b = (C10414h.AbstractC10416b) message.obj;
        if (message.what == 0) {
            abstractC10416b.m5234a();
        } else if (message.what == 1) {
            abstractC10416b.mo4323c();
        }
        super.handleMessage(message);
    }
}
