package com.fimi.kernel;

import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
/* renamed from: com.fimi.kernel.b */
/* loaded from: classes.dex */
public abstract class AbstractC1584b {

    /* renamed from: a */
    private HandlerC1585a f3912a = new HandlerC1585a();

    /* renamed from: com.fimi.kernel.b$a */
    /* loaded from: classes.dex */
    class HandlerC1585a extends Handler {
        HandlerC1585a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC1584b.this.mo30955a(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Handler m35094a() {
        return this.f3912a;
    }

    /* renamed from: a */
    protected abstract void mo30955a(Message message);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m35093a(Runnable runnable) {
        C1685x.m34457a(runnable);
    }
}
