package com.xiaomi.push.service.receivers;

import android.content.Context;
/* renamed from: com.xiaomi.push.service.receivers.a */
/* loaded from: classes.dex */
class RunnableC10691a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f33234a;

    /* renamed from: b */
    final /* synthetic */ NetworkStatusReceiver f33235b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10691a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f33235b = networkStatusReceiver;
        this.f33234a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33235b.m4113a(this.f33234a);
    }
}
