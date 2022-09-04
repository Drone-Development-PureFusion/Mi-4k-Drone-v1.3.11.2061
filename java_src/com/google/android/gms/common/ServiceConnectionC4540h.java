package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C4588d;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.google.android.gms.common.h */
/* loaded from: classes2.dex */
public class ServiceConnectionC4540h implements ServiceConnection {

    /* renamed from: a */
    boolean f16940a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f16941b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m23801a() {
        C4588d.m23616c("BlockingServiceConnection.getService() called on main thread");
        if (this.f16940a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f16940a = true;
        return this.f16941b.take();
    }

    /* renamed from: a */
    public IBinder m23800a(long j, TimeUnit timeUnit) {
        C4588d.m23616c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f16940a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f16940a = true;
        IBinder poll = this.f16941b.poll(j, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16941b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
