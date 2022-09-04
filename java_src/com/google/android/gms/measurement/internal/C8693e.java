package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.stats.C4669b;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.measurement.internal.AbstractC8740y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.measurement.internal.e */
/* loaded from: classes2.dex */
public class C8693e extends AbstractC8683b {

    /* renamed from: b */
    private AbstractC8740y f27847b;

    /* renamed from: c */
    private Boolean f27848c;

    /* renamed from: d */
    private final AbstractC8731r f27849d;

    /* renamed from: e */
    private final C8718i f27850e;

    /* renamed from: g */
    private final AbstractC8731r f27852g;

    /* renamed from: f */
    private final List<Runnable> f27851f = new ArrayList();

    /* renamed from: a */
    private final ServiceConnectionC8701a f27846a = new ServiceConnectionC8701a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.measurement.internal.e$a */
    /* loaded from: classes2.dex */
    public class ServiceConnectionC8701a implements ServiceConnection, AbstractC4600p.AbstractC4602b, AbstractC4600p.AbstractC4603c {

        /* renamed from: b */
        private volatile boolean f27866b;

        /* renamed from: c */
        private volatile C8642aa f27867c;

        protected ServiceConnectionC8701a() {
        }

        @WorkerThread
        /* renamed from: a */
        public void m10594a() {
            C8693e.this.mo10307j();
            Context mo10300q = C8693e.this.mo10300q();
            synchronized (this) {
                if (this.f27866b) {
                    C8693e.this.mo10294w().m10843E().m10831a("Connection attempt already in progress");
                } else if (this.f27867c != null) {
                    C8693e.this.mo10294w().m10843E().m10831a("Already awaiting connection attempt");
                } else {
                    this.f27867c = new C8642aa(mo10300q, Looper.getMainLooper(), this, this);
                    C8693e.this.mo10294w().m10843E().m10831a("Connecting to remote service");
                    this.f27866b = true;
                    this.f27867c.A();
                }
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
        @MainThread
        /* renamed from: a */
        public void mo10593a(int i) {
            C4588d.m23620b("MeasurementServiceConnection.onConnectionSuspended");
            C8693e.this.mo10294w().m10844D().m10831a("Service connection suspended");
            C8693e.this.mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.a.4
                @Override // java.lang.Runnable
                public void run() {
                    C8693e.this.m10609a(new ComponentName(C8693e.this.mo10300q(), (!C8693e.this.mo10292y().m10471N() || C8693e.this.f27815n.m10745D()) ? "com.google.android.gms.measurement.AppMeasurementService" : "com.google.android.gms.measurement.PackageMeasurementService"));
                }
            });
        }

        @WorkerThread
        /* renamed from: a */
        public void m10592a(Intent intent) {
            C8693e.this.mo10307j();
            Context mo10300q = C8693e.this.mo10300q();
            C4669b m23204a = C4669b.m23204a();
            synchronized (this) {
                if (this.f27866b) {
                    C8693e.this.mo10294w().m10843E().m10831a("Connection attempt already in progress");
                    return;
                }
                this.f27866b = true;
                m23204a.m23201a(mo10300q, intent, C8693e.this.f27846a, 129);
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
        @MainThread
        /* renamed from: a */
        public void mo10591a(@Nullable Bundle bundle) {
            C4588d.m23620b("MeasurementServiceConnection.onConnected");
            synchronized (this) {
                try {
                    final AbstractC8740y G = this.f27867c.G();
                    this.f27867c = null;
                    C8693e.this.mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.a.3
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (ServiceConnectionC8701a.this) {
                                ServiceConnectionC8701a.this.f27866b = false;
                                if (!C8693e.this.m10597f()) {
                                    C8693e.this.mo10294w().m10844D().m10831a("Connected to remote service");
                                    C8693e.this.m10603a(G);
                                }
                            }
                        }
                    });
                } catch (DeadObjectException | IllegalStateException e) {
                    this.f27867c = null;
                    this.f27866b = false;
                }
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4603c
        @MainThread
        /* renamed from: a */
        public void mo10590a(@NonNull ConnectionResult connectionResult) {
            C4588d.m23620b("MeasurementServiceConnection.onConnectionFailed");
            C8643ab m10697g = C8693e.this.f27815n.m10697g();
            if (m10697g != null) {
                m10697g.m10832z().m10830a("Service connection failed", connectionResult);
            }
            synchronized (this) {
                this.f27866b = false;
                this.f27867c = null;
            }
        }

        @Override // android.content.ServiceConnection
        @MainThread
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4588d.m23620b("MeasurementServiceConnection.onServiceConnected");
            synchronized (this) {
                if (iBinder == null) {
                    this.f27866b = false;
                    C8693e.this.mo10294w().m10834f().m10831a("Service connected with null binder");
                    return;
                }
                final AbstractC8740y abstractC8740y = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        abstractC8740y = AbstractC8740y.AbstractBinderC8741a.m10327a(iBinder);
                        C8693e.this.mo10294w().m10843E().m10831a("Bound to IMeasurementService interface");
                    } else {
                        C8693e.this.mo10294w().m10834f().m10830a("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e) {
                    C8693e.this.mo10294w().m10834f().m10831a("Service connect failed to get IMeasurementService");
                }
                if (abstractC8740y == null) {
                    this.f27866b = false;
                    try {
                        C4669b.m23204a().m23200a(C8693e.this.mo10300q(), C8693e.this.f27846a);
                    } catch (IllegalArgumentException e2) {
                    }
                } else {
                    C8693e.this.mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (ServiceConnectionC8701a.this) {
                                ServiceConnectionC8701a.this.f27866b = false;
                                if (!C8693e.this.m10597f()) {
                                    C8693e.this.mo10294w().m10843E().m10831a("Connected to service");
                                    C8693e.this.m10603a(abstractC8740y);
                                }
                            }
                        }
                    });
                }
            }
        }

        @Override // android.content.ServiceConnection
        @MainThread
        public void onServiceDisconnected(final ComponentName componentName) {
            C4588d.m23620b("MeasurementServiceConnection.onServiceDisconnected");
            C8693e.this.mo10294w().m10844D().m10831a("Service disconnected");
            C8693e.this.mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.a.2
                @Override // java.lang.Runnable
                public void run() {
                    C8693e.this.m10609a(componentName);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8693e(C8668aj c8668aj) {
        super(c8668aj);
        this.f27850e = new C8718i(c8668aj.m10685s());
        this.f27849d = new AbstractC8731r(c8668aj) { // from class: com.google.android.gms.measurement.internal.e.1
            @Override // com.google.android.gms.measurement.internal.AbstractC8731r
            /* renamed from: a */
            public void mo10361a() {
                C8693e.this.m10612F();
            }
        };
        this.f27852g = new AbstractC8731r(c8668aj) { // from class: com.google.android.gms.measurement.internal.e.2
            @Override // com.google.android.gms.measurement.internal.AbstractC8731r
            /* renamed from: a */
            public void mo10361a() {
                C8693e.this.mo10294w().m10832z().m10831a("Tasks have been queued for a long time");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: D */
    public void m10614D() {
        mo10307j();
        this.f27850e.m10562a();
        if (!this.f27815n.m10745D()) {
            this.f27849d.m10360a(mo10292y().m10475J());
        }
    }

    /* renamed from: E */
    private boolean m10613E() {
        List<ResolveInfo> queryIntentServices;
        return !mo10292y().m10471N() && (queryIntentServices = mo10300q().getPackageManager().queryIntentServices(new Intent().setClassName(mo10300q(), "com.google.android.gms.measurement.AppMeasurementService"), 65536)) != null && queryIntentServices.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: F */
    public void m10612F() {
        mo10307j();
        if (!m10597f()) {
            return;
        }
        mo10294w().m10843E().m10831a("Inactivity, disconnecting from the service");
        m10615C();
    }

    @WorkerThread
    /* renamed from: G */
    private void m10611G() {
        mo10307j();
        m10617A();
    }

    @WorkerThread
    /* renamed from: H */
    private void m10610H() {
        mo10307j();
        mo10294w().m10843E().m10830a("Processing queued up service tasks", Integer.valueOf(this.f27851f.size()));
        for (Runnable runnable : this.f27851f) {
            mo10295v().m10762a(runnable);
        }
        this.f27851f.clear();
        this.f27852g.m10355c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public void m10609a(ComponentName componentName) {
        mo10307j();
        if (this.f27847b != null) {
            this.f27847b = null;
            mo10294w().m10843E().m10830a("Disconnected from device MeasurementService", componentName);
            m10611G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public void m10603a(AbstractC8740y abstractC8740y) {
        mo10307j();
        C4588d.m23627a(abstractC8740y);
        this.f27847b = abstractC8740y;
        m10614D();
        m10610H();
    }

    @WorkerThread
    /* renamed from: a */
    private void m10602a(Runnable runnable) {
        mo10307j();
        if (m10597f()) {
            runnable.run();
        } else if (this.f27851f.size() >= mo10292y().m10464U()) {
            mo10294w().m10834f().m10831a("Discarding data. Max runnable queue size reached");
        } else {
            this.f27851f.add(runnable);
            if (!this.f27815n.m10745D()) {
                this.f27852g.m10360a(60000L);
            }
            m10617A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public void m10617A() {
        mo10307j();
        c();
        if (m10597f()) {
            return;
        }
        if (this.f27848c == null) {
            this.f27848c = mo10293x().m10808B();
            if (this.f27848c == null) {
                mo10294w().m10843E().m10831a("State of service unknown");
                this.f27848c = Boolean.valueOf(m10616B());
                mo10293x().m10801a(this.f27848c.booleanValue());
            }
        }
        if (this.f27848c.booleanValue()) {
            mo10294w().m10843E().m10831a("Using measurement service");
            this.f27846a.m10594a();
        } else if (this.f27815n.m10745D() || !m10613E()) {
            mo10294w().m10834f().m10831a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        } else {
            mo10294w().m10843E().m10831a("Using local app measurement service");
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(mo10300q(), mo10292y().m10471N() ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService"));
            this.f27846a.m10592a(intent);
        }
    }

    @WorkerThread
    /* renamed from: B */
    protected boolean m10616B() {
        mo10307j();
        c();
        if (mo10292y().m10471N()) {
            return true;
        }
        mo10294w().m10843E().m10831a("Checking service availability");
        switch (C4648j.m23370b().mo23375a(mo10300q())) {
            case 0:
                mo10294w().m10843E().m10831a("Service available");
                return true;
            case 1:
                mo10294w().m10843E().m10831a("Service missing");
                return false;
            case 2:
                mo10294w().m10844D().m10831a("Service container out of date");
                return true;
            case 3:
                mo10294w().m10832z().m10831a("Service disabled");
                return false;
            case 9:
                mo10294w().m10832z().m10831a("Service invalid");
                return false;
            case 18:
                mo10294w().m10832z().m10831a("Service updating");
                return true;
            default:
                return false;
        }
    }

    @WorkerThread
    /* renamed from: C */
    public void m10615C() {
        mo10307j();
        c();
        try {
            C4669b.m23204a().m23200a(mo10300q(), this.f27846a);
        } catch (IllegalArgumentException e) {
        } catch (IllegalStateException e2) {
        }
        this.f27847b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public void m10608a(final EventParcel eventParcel, final String str) {
        C4588d.m23627a(eventParcel);
        mo10307j();
        c();
        m10602a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.4
            @Override // java.lang.Runnable
            public void run() {
                AbstractC8740y abstractC8740y = C8693e.this.f27847b;
                if (abstractC8740y == null) {
                    C8693e.this.mo10294w().m10834f().m10831a("Discarding data. Failed to send event to service");
                    return;
                }
                try {
                    if (TextUtils.isEmpty(str)) {
                        abstractC8740y.mo10324a(eventParcel, C8693e.this.mo10304m().m10313a(C8693e.this.mo10294w().m10842F()));
                    } else {
                        abstractC8740y.mo10322a(eventParcel, str, C8693e.this.mo10294w().m10842F());
                    }
                    C8693e.this.m10614D();
                } catch (RemoteException e) {
                    C8693e.this.mo10294w().m10834f().m10830a("Failed to send event to the service", e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public void m10607a(final UserAttributeParcel userAttributeParcel) {
        mo10307j();
        c();
        m10602a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.5
            @Override // java.lang.Runnable
            public void run() {
                AbstractC8740y abstractC8740y = C8693e.this.f27847b;
                if (abstractC8740y == null) {
                    C8693e.this.mo10294w().m10834f().m10831a("Discarding data. Failed to set user attribute");
                    return;
                }
                try {
                    abstractC8740y.mo10321a(userAttributeParcel, C8693e.this.mo10304m().m10313a(C8693e.this.mo10294w().m10842F()));
                    C8693e.this.m10614D();
                } catch (RemoteException e) {
                    C8693e.this.mo10294w().m10834f().m10830a("Failed to send attribute to the service", e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public void m10601a(final AtomicReference<List<UserAttributeParcel>> atomicReference, final boolean z) {
        mo10307j();
        c();
        m10602a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.6
            @Override // java.lang.Runnable
            public void run() {
                AbstractC8740y abstractC8740y;
                synchronized (atomicReference) {
                    try {
                        abstractC8740y = C8693e.this.f27847b;
                    } catch (RemoteException e) {
                        C8693e.this.mo10294w().m10834f().m10830a("Failed to get user properties", e);
                        atomicReference.notify();
                    }
                    if (abstractC8740y == null) {
                        C8693e.this.mo10294w().m10834f().m10831a("Failed to get user properties");
                        atomicReference.notify();
                        return;
                    }
                    atomicReference.set(abstractC8740y.mo10325a(C8693e.this.mo10304m().m10313a((String) null), z));
                    C8693e.this.m10614D();
                    atomicReference.notify();
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }

    @WorkerThread
    /* renamed from: f */
    public boolean m10597f() {
        mo10307j();
        c();
        return this.f27847b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: g */
    public void m10596g() {
        mo10307j();
        c();
        m10602a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractC8740y abstractC8740y = C8693e.this.f27847b;
                if (abstractC8740y == null) {
                    C8693e.this.mo10294w().m10834f().m10831a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    abstractC8740y.mo10320b(C8693e.this.mo10304m().m10313a(C8693e.this.mo10294w().m10842F()));
                    C8693e.this.m10614D();
                } catch (RemoteException e) {
                    C8693e.this.mo10294w().m10834f().m10830a("Failed to send measurementEnabled to the service", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10309h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo10308i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo10307j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8725o mo10306k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C8685d mo10305l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8743z mo10304m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C8733s mo10303n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C8693e mo10302o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC4682e mo10301p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: q */
    public /* bridge */ /* synthetic */ Context mo10300q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8727q mo10299r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8723m mo10298s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8662ah mo10297t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: u */
    public /* bridge */ /* synthetic */ C8710g mo10296u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8663ai mo10295v() {
        return super.v();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8643ab mo10294w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: x */
    public /* bridge */ /* synthetic */ C8654af mo10293x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: y */
    public /* bridge */ /* synthetic */ C8726p mo10292y() {
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: z */
    public void m10595z() {
        mo10307j();
        c();
        m10602a(new Runnable() { // from class: com.google.android.gms.measurement.internal.e.7
            @Override // java.lang.Runnable
            public void run() {
                AbstractC8740y abstractC8740y = C8693e.this.f27847b;
                if (abstractC8740y == null) {
                    C8693e.this.mo10294w().m10834f().m10831a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    abstractC8740y.mo10326a(C8693e.this.mo10304m().m10313a(C8693e.this.mo10294w().m10842F()));
                    C8693e.this.m10614D();
                } catch (RemoteException e) {
                    C8693e.this.mo10294w().m10834f().m10830a("Failed to send app launch to the service", e);
                }
            }
        });
    }
}
