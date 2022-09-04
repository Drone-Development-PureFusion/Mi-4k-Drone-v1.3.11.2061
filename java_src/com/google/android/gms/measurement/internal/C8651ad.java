package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C4588d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ad */
/* loaded from: classes2.dex */
public class C8651ad extends BroadcastReceiver {

    /* renamed from: a */
    static final String f27676a = C8651ad.class.getName();

    /* renamed from: b */
    private final C8668aj f27677b;

    /* renamed from: c */
    private boolean f27678c;

    /* renamed from: d */
    private boolean f27679d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8651ad(C8668aj c8668aj) {
        C4588d.m23627a(c8668aj);
        this.f27677b = c8668aj;
    }

    /* renamed from: d */
    private Context m10815d() {
        return this.f27677b.m10686r();
    }

    /* renamed from: e */
    private C8643ab m10814e() {
        return this.f27677b.m10698f();
    }

    @WorkerThread
    /* renamed from: a */
    public void m10819a() {
        this.f27677b.m10732a();
        this.f27677b.m10678z();
        if (this.f27678c) {
            return;
        }
        m10815d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f27679d = this.f27677b.m10687q().m10821f();
        m10814e().m10843E().m10830a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f27679d));
        this.f27678c = true;
    }

    @WorkerThread
    /* renamed from: b */
    public void m10817b() {
        this.f27677b.m10732a();
        this.f27677b.m10678z();
        if (!m10816c()) {
            return;
        }
        m10814e().m10843E().m10831a("Unregistering connectivity change receiver");
        this.f27678c = false;
        this.f27679d = false;
        try {
            m10815d().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            m10814e().m10834f().m10830a("Failed to unregister the network broadcast receiver", e);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public boolean m10816c() {
        this.f27677b.m10678z();
        return this.f27678c;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context, Intent intent) {
        this.f27677b.m10732a();
        String action = intent.getAction();
        m10814e().m10843E().m10830a("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            m10814e().m10832z().m10830a("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        final boolean m10821f = this.f27677b.m10687q().m10821f();
        if (this.f27679d == m10821f) {
            return;
        }
        this.f27679d = m10821f;
        this.f27677b.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ad.1
            @Override // java.lang.Runnable
            public void run() {
                C8651ad.this.f27677b.m10711a(m10821f);
            }
        });
    }
}
