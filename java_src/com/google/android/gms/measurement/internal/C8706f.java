package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes.dex */
public final class C8706f {

    /* renamed from: d */
    private static Boolean f27875d;

    /* renamed from: e */
    private static Boolean f27876e;

    /* renamed from: a */
    private final Handler f27877a = new Handler();

    /* renamed from: b */
    private final Context f27878b;

    /* renamed from: c */
    private final AbstractC8709a f27879c;

    /* renamed from: com.google.android.gms.measurement.internal.f$a */
    /* loaded from: classes.dex */
    public interface AbstractC8709a {
        /* renamed from: a */
        Context mo10578a();

        /* renamed from: a */
        boolean mo10577a(int i);
    }

    public C8706f(AbstractC8709a abstractC8709a) {
        this.f27878b = abstractC8709a.mo10578a();
        C4588d.m23627a(this.f27878b);
        this.f27879c = abstractC8709a;
    }

    /* renamed from: a */
    public static boolean m10587a(Context context, boolean z) {
        C4588d.m23627a(context);
        if (f27875d == null || z) {
            if (f27876e != null && z) {
                return f27876e.booleanValue();
            }
            boolean m10548a = C8723m.m10548a(context, z ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService");
            if (z) {
                f27876e = Boolean.valueOf(m10548a);
                return m10548a;
            }
            f27875d = Boolean.valueOf(m10548a);
            return m10548a;
        }
        return f27875d.booleanValue();
    }

    /* renamed from: c */
    private C8643ab m10580c() {
        return C8668aj.m10727a(this.f27878b).m10698f();
    }

    @MainThread
    /* renamed from: a */
    public int m10585a(Intent intent, int i, final int i2) {
        final C8668aj m10727a = C8668aj.m10727a(this.f27878b);
        final C8643ab m10698f = m10727a.m10698f();
        if (intent == null) {
            m10698f.m10832z().m10831a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            if (m10727a.m10701d().m10471N()) {
                m10698f.m10843E().m10829a("Device PackageMeasurementService called. startId, action", Integer.valueOf(i2), action);
            } else {
                m10698f.m10843E().m10829a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            }
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                m10727a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.f.1
                    @Override // java.lang.Runnable
                    public void run() {
                        m10727a.m10738K();
                        m10727a.m10740I();
                        C8706f.this.f27877a.post(new Runnable() { // from class: com.google.android.gms.measurement.internal.f.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (C8706f.this.f27879c.mo10577a(i2)) {
                                    if (m10727a.m10701d().m10471N()) {
                                        m10698f.m10843E().m10831a("Device PackageMeasurementService processed last upload request");
                                    } else {
                                        m10698f.m10843E().m10831a("Local AppMeasurementService processed last upload request");
                                    }
                                }
                            }
                        });
                    }
                });
            }
        }
        return 2;
    }

    @MainThread
    /* renamed from: a */
    public IBinder m10586a(Intent intent) {
        if (intent == null) {
            m10580c().m10834f().m10831a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC8673ak(C8668aj.m10727a(this.f27878b));
        }
        m10580c().m10832z().m10830a("onBind received unknown action", action);
        return null;
    }

    @MainThread
    /* renamed from: a */
    public void m10588a() {
        C8668aj m10727a = C8668aj.m10727a(this.f27878b);
        C8643ab m10698f = m10727a.m10698f();
        if (m10727a.m10701d().m10471N()) {
            m10698f.m10843E().m10831a("Device PackageMeasurementService is starting up");
        } else {
            m10698f.m10843E().m10831a("Local AppMeasurementService is starting up");
        }
    }

    @MainThread
    /* renamed from: b */
    public void m10583b() {
        C8668aj m10727a = C8668aj.m10727a(this.f27878b);
        C8643ab m10698f = m10727a.m10698f();
        if (m10727a.m10701d().m10471N()) {
            m10698f.m10843E().m10831a("Device PackageMeasurementService is shutting down");
        } else {
            m10698f.m10843E().m10831a("Local AppMeasurementService is shutting down");
        }
    }

    @MainThread
    /* renamed from: b */
    public boolean m10582b(Intent intent) {
        if (intent == null) {
            m10580c().m10834f().m10831a("onUnbind called with null intent");
        } else {
            m10580c().m10843E().m10830a("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }

    @MainThread
    /* renamed from: c */
    public void m10579c(Intent intent) {
        if (intent == null) {
            m10580c().m10834f().m10831a("onRebind called with null intent");
            return;
        }
        m10580c().m10843E().m10830a("onRebind called. action", intent.getAction());
    }
}
