package com.tencent.p263mm.sdk.platformtools;

import android.os.Handler;
/* renamed from: com.tencent.mm.sdk.platformtools.SyncTask */
/* loaded from: classes2.dex */
public abstract class SyncTask<R> {

    /* renamed from: ba */
    private final long f31659ba;

    /* renamed from: bb */
    private long f31660bb;

    /* renamed from: bc */
    private long f31661bc;

    /* renamed from: bd */
    private Runnable f31662bd;
    private Object lock;
    private R result;

    public SyncTask() {
        this(0L, null);
    }

    public SyncTask(long j, R r) {
        this.lock = new Object();
        this.f31662bd = new Runnable() { // from class: com.tencent.mm.sdk.platformtools.SyncTask.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                SyncTask.this.f31661bc = Util.ticksToNow(SyncTask.this.f31660bb);
                SyncTask.this.setResult(SyncTask.this.run());
            }
        };
        this.f31659ba = j;
        this.result = r;
    }

    public R exec(Handler handler) {
        if (handler == null) {
            Log.m5877d("MicroMsg.SDK.SyncTask", "null handler, task in exec thread, return now");
            return run();
        } else if (Thread.currentThread().getId() == handler.getLooper().getThread().getId()) {
            Log.m5877d("MicroMsg.SDK.SyncTask", "same tid, task in exec thread, return now");
            return run();
        } else {
            this.f31660bb = Util.currentTicks();
            handler.post(this.f31662bd);
            try {
                synchronized (this.lock) {
                    this.lock.wait(this.f31659ba);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long ticksToNow = Util.ticksToNow(this.f31660bb);
            Log.m5868v("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", new StringBuilder().append(this.result).toString(), Long.valueOf(ticksToNow), Long.valueOf(this.f31661bc), Long.valueOf(ticksToNow - this.f31661bc));
            return this.result;
        }
    }

    protected abstract R run();

    public void setResult(R r) {
        this.result = r;
        synchronized (this.lock) {
            this.lock.notify();
        }
    }
}
