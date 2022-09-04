package com.tencent.p263mm.sdk.platformtools;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* renamed from: com.tencent.mm.sdk.platformtools.MTimerHandler */
/* loaded from: classes2.dex */
public class MTimerHandler extends Handler {

    /* renamed from: av */
    private static int f31633av;

    /* renamed from: aG */
    private final boolean f31634aG;

    /* renamed from: aI */
    private final CallBack f31636aI;

    /* renamed from: aH */
    private long f31635aH = 0;

    /* renamed from: aw */
    private final int f31637aw = m5865d();

    /* renamed from: com.tencent.mm.sdk.platformtools.MTimerHandler$CallBack */
    /* loaded from: classes2.dex */
    public interface CallBack {
        boolean onTimerExpired();
    }

    public MTimerHandler(Looper looper, CallBack callBack, boolean z) {
        super(looper);
        this.f31636aI = callBack;
        this.f31634aG = z;
    }

    public MTimerHandler(CallBack callBack, boolean z) {
        this.f31636aI = callBack;
        this.f31634aG = z;
    }

    /* renamed from: d */
    private static int m5865d() {
        if (f31633av >= 8192) {
            f31633av = 0;
        }
        int i = f31633av + 1;
        f31633av = i;
        return i;
    }

    protected void finalize() {
        stopTimer();
        super.finalize();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != this.f31637aw || this.f31636aI == null || !this.f31636aI.onTimerExpired() || !this.f31634aG) {
            return;
        }
        sendEmptyMessageDelayed(this.f31637aw, this.f31635aH);
    }

    public void startTimer(long j) {
        this.f31635aH = j;
        stopTimer();
        sendEmptyMessageDelayed(this.f31637aw, j);
    }

    public void stopTimer() {
        removeMessages(this.f31637aw);
    }

    public boolean stopped() {
        return !hasMessages(this.f31637aw);
    }
}
