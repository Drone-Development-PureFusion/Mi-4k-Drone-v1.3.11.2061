package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.analytics.internal.AbstractC3888d;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.stats.C4669b;
import java.util.Collections;
/* renamed from: com.google.android.gms.analytics.internal.y */
/* loaded from: classes2.dex */
public class C3926y extends AbstractC3920t {

    /* renamed from: a */
    private final ServiceConnectionC3928a f15180a = new ServiceConnectionC3928a();

    /* renamed from: b */
    private AbstractC3888d f15181b;

    /* renamed from: c */
    private final AbstractC3876aj f15182c;

    /* renamed from: d */
    private C3905m f15183d;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.analytics.internal.y$a */
    /* loaded from: classes2.dex */
    public class ServiceConnectionC3928a implements ServiceConnection {

        /* renamed from: b */
        private volatile AbstractC3888d f15186b;

        /* renamed from: c */
        private volatile boolean f15187c;

        protected ServiceConnectionC3928a() {
        }

        /* renamed from: a */
        public AbstractC3888d m26052a() {
            AbstractC3888d abstractC3888d = null;
            C3926y.this.m();
            Intent intent = new Intent("com.google.android.gms.analytics.service.START");
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            Context o = C3926y.this.o();
            intent.putExtra("app_package_name", o.getPackageName());
            C4669b m23204a = C4669b.m23204a();
            synchronized (this) {
                this.f15186b = null;
                this.f15187c = true;
                boolean m23201a = m23204a.m23201a(o, intent, C3926y.this.f15180a, 129);
                C3926y.this.a("Bind to service requested", Boolean.valueOf(m23201a));
                if (!m23201a) {
                    this.f15187c = false;
                } else {
                    try {
                        wait(C3926y.this.q().m26361w());
                    } catch (InterruptedException e) {
                        C3926y.this.t("Wait for service connect was interrupted");
                    }
                    this.f15187c = false;
                    abstractC3888d = this.f15186b;
                    this.f15186b = null;
                    if (abstractC3888d == null) {
                        C3926y.this.u("Successfully bound to service but never got onServiceConnected callback");
                    }
                }
            }
            return abstractC3888d;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4588d.m23620b("AnalyticsServiceConnection.onServiceConnected");
            synchronized (this) {
                if (iBinder == null) {
                    C3926y.this.u("Service connected with null binder");
                    notifyAll();
                    return;
                }
                final AbstractC3888d abstractC3888d = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        abstractC3888d = AbstractC3888d.AbstractBinderC3889a.m26303a(iBinder);
                        C3926y.this.q("Bound to IAnalyticsService interface");
                    } else {
                        C3926y.this.e("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e) {
                    C3926y.this.u("Service connect failed to get IAnalyticsService");
                }
                if (abstractC3888d == null) {
                    try {
                        C4669b.m23204a().m23200a(C3926y.this.o(), C3926y.this.f15180a);
                    } catch (IllegalArgumentException e2) {
                    }
                } else if (!this.f15187c) {
                    C3926y.this.t("onServiceConnected received after the timeout limit");
                    C3926y.this.r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.y.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!C3926y.this.m26061b()) {
                                C3926y.this.r("Connected to service after a timeout");
                                C3926y.this.m26065a(abstractC3888d);
                            }
                        }
                    });
                } else {
                    this.f15186b = abstractC3888d;
                }
                notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(final ComponentName componentName) {
            C4588d.m23620b("AnalyticsServiceConnection.onServiceDisconnected");
            C3926y.this.r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.y.a.2
                @Override // java.lang.Runnable
                public void run() {
                    C3926y.this.m26067a(componentName);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C3926y(C3922v c3922v) {
        super(c3922v);
        this.f15183d = new C3905m(c3922v.m26110d());
        this.f15182c = new AbstractC3876aj(c3922v) { // from class: com.google.android.gms.analytics.internal.y.1
            @Override // com.google.android.gms.analytics.internal.AbstractC3876aj
            /* renamed from: a */
            public void mo26053a() {
                C3926y.this.m26055g();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26067a(ComponentName componentName) {
        m();
        if (this.f15181b != null) {
            this.f15181b = null;
            a("Disconnected from device AnalyticsService", componentName);
            m26054h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26065a(AbstractC3888d abstractC3888d) {
        m();
        this.f15181b = abstractC3888d;
        m26056f();
        t().m26158h();
    }

    /* renamed from: f */
    private void m26056f() {
        this.f15183d.m26222a();
        this.f15182c.m26357a(q().m26362v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m26055g() {
        m();
        if (!m26061b()) {
            return;
        }
        q("Inactivity, disconnecting from device AnalyticsService");
        m26057e();
    }

    /* renamed from: h */
    private void m26054h() {
        t().m26160f();
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
    }

    /* renamed from: a */
    public boolean m26066a(C3887c c3887c) {
        C4588d.m23627a(c3887c);
        m();
        D();
        AbstractC3888d abstractC3888d = this.f15181b;
        if (abstractC3888d == null) {
            return false;
        }
        try {
            abstractC3888d.mo26301a(c3887c.m26311b(), c3887c.m26308d(), c3887c.m26306f() ? q().m26369o() : q().m26368p(), Collections.emptyList());
            m26056f();
            return true;
        } catch (RemoteException e) {
            q("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* renamed from: b */
    public boolean m26061b() {
        m();
        D();
        return this.f15181b != null;
    }

    /* renamed from: c */
    public boolean m26059c() {
        m();
        D();
        AbstractC3888d abstractC3888d = this.f15181b;
        if (abstractC3888d == null) {
            return false;
        }
        try {
            abstractC3888d.mo26302a();
            m26056f();
            return true;
        } catch (RemoteException e) {
            q("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    /* renamed from: d */
    public boolean m26058d() {
        m();
        D();
        if (this.f15181b != null) {
            return true;
        }
        AbstractC3888d m26052a = this.f15180a.m26052a();
        if (m26052a == null) {
            return false;
        }
        this.f15181b = m26052a;
        m26056f();
        return true;
    }

    /* renamed from: e */
    public void m26057e() {
        m();
        D();
        try {
            C4669b.m23204a().m23200a(o(), this.f15180a);
        } catch (IllegalArgumentException e) {
        } catch (IllegalStateException e2) {
        }
        if (this.f15181b != null) {
            this.f15181b = null;
            m26054h();
        }
    }
}
