package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4683f;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.measurement.internal.d */
/* loaded from: classes2.dex */
public class C8685d extends AbstractC8683b {

    /* renamed from: a */
    private C8692a f27818a;

    /* renamed from: b */
    private AppMeasurement.AbstractC8636b f27819b;

    /* renamed from: c */
    private final Set<AppMeasurement.AbstractC8637c> f27820c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private boolean f27821d;

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    @MainThread
    /* renamed from: com.google.android.gms.measurement.internal.d$a */
    /* loaded from: classes2.dex */
    public class C8692a implements Application.ActivityLifecycleCallbacks {
        private C8692a() {
        }

        /* renamed from: a */
        private boolean m10618a(String str) {
            if (!TextUtils.isEmpty(str)) {
                C8685d.this.m10628a("auto", "_ldl", str);
                return true;
            }
            return false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Uri data;
            Bundle m10546a;
            try {
                C8685d.this.mo10294w().m10843E().m10831a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null || (data = intent.getData()) == null || !data.isHierarchical()) {
                    return;
                }
                if (bundle == null && (m10546a = C8685d.this.mo10298s().m10546a(data)) != null) {
                    C8685d.this.m10632a("auto", "_cmp", m10546a);
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                if (!queryParameter.contains("gclid")) {
                    C8685d.this.mo10294w().m10844D().m10831a("Activity created with data 'referrer' param without gclid");
                    return;
                }
                C8685d.this.mo10294w().m10844D().m10830a("Activity created with referrer", queryParameter);
                m10618a(queryParameter);
            } catch (Throwable th) {
                C8685d.this.mo10294w().m10834f().m10830a("Throwable caught in onActivityCreated", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @MainThread
        public void onActivityPaused(Activity activity) {
            C8685d.this.mo10296u().m10566g();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @MainThread
        public void onActivityResumed(Activity activity) {
            C8685d.this.mo10296u().m10567f();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8685d(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: A */
    private String m10643A() {
        return "com.google.android.gms.tagmanager.TagManagerService";
    }

    /* renamed from: a */
    private void m10629a(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        m10634a(str, str2, mo10301p().mo16434a(), bundle, z, z2, z3, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public void m10627a(String str, String str2, Object obj, long j) {
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        mo10307j();
        mo10309h();
        c();
        if (!this.f27815n.m10744E()) {
            mo10294w().m10844D().m10831a("User property not set since app measurement is disabled");
        } else if (!this.f27815n.m10710b()) {
        } else {
            mo10294w().m10844D().m10829a("Setting user property (FE)", str2, obj);
            mo10302o().m10607a(new UserAttributeParcel(str2, j, obj, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: b */
    public void m10624b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        C4588d.m23627a(bundle);
        mo10307j();
        c();
        if (!this.f27815n.m10744E()) {
            mo10294w().m10844D().m10831a("Event not sent since app measurement is disabled");
            return;
        }
        if (!this.f27821d) {
            this.f27821d = true;
            m10619z();
        }
        boolean m10496l = C8723m.m10496l(str2);
        if (z && this.f27819b != null && !m10496l) {
            mo10294w().m10844D().m10829a("Passing event to registered event handler (FE)", str2, bundle);
            this.f27819b.mo8894a(str, str2, bundle, j);
        } else if (this.f27815n.m10710b()) {
            int m10510c = mo10298s().m10510c(str2);
            if (m10510c != 0) {
                this.f27815n.m10689o().m10550a(m10510c, "_ev", mo10298s().m10535a(str2, mo10292y().m10441c(), true), str2 != null ? str2.length() : 0);
                return;
            }
            bundle.putString("_o", str);
            Bundle m10534a = mo10298s().m10534a(str2, bundle, C4683f.m23151a("_o"), z3);
            Bundle m10641a = z2 ? m10641a(m10534a) : m10534a;
            mo10294w().m10844D().m10829a("Logging event (FE)", str2, m10641a);
            mo10302o().m10608a(new EventParcel(str2, new EventParams(m10641a), str, j), str3);
            for (AppMeasurement.AbstractC8637c abstractC8637c : this.f27820c) {
                abstractC8637c.mo8893a(str, str2, new Bundle(m10641a), j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: c */
    public void m10622c(boolean z) {
        mo10307j();
        mo10309h();
        c();
        mo10294w().m10844D().m10830a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo10293x().m10798b(z);
        mo10302o().m10596g();
    }

    @WorkerThread
    /* renamed from: z */
    private void m10619z() {
        try {
            m10635a(Class.forName(m10643A()));
        } catch (ClassNotFoundException e) {
            mo10294w().m10845C().m10831a("Tag Manager is not found and thus will not be used");
        }
    }

    /* renamed from: a */
    Bundle m10641a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m10513b = mo10298s().m10513b(str, bundle.get(str));
                if (m10513b == null) {
                    mo10294w().m10832z().m10830a("Param value can't be null", str);
                } else {
                    mo10298s().m10543a(bundle2, str, m10513b);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    public void m10642a(final long j) {
        mo10309h();
        mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.d.2
            @Override // java.lang.Runnable
            public void run() {
                C8685d.this.mo10293x().f27694h.m10787a(j);
                C8685d.this.mo10294w().m10844D().m10830a("Minimum session duration set", Long.valueOf(j));
            }
        });
    }

    @WorkerThread
    /* renamed from: a */
    public void m10640a(AppMeasurement.AbstractC8636b abstractC8636b) {
        mo10307j();
        mo10309h();
        c();
        if (abstractC8636b != null && abstractC8636b != this.f27819b) {
            C4588d.m23622a(this.f27819b == null, "EventInterceptor already set.");
        }
        this.f27819b = abstractC8636b;
    }

    /* renamed from: a */
    public void m10639a(AppMeasurement.AbstractC8637c abstractC8637c) {
        mo10309h();
        c();
        C4588d.m23627a(abstractC8637c);
        if (!this.f27820c.add(abstractC8637c)) {
            mo10294w().m10832z().m10831a("OnEventListener already registered");
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m10635a(Class<?> cls) {
        try {
            cls.getDeclaredMethod("initialize", Context.class).invoke(null, mo10300q());
        } catch (Exception e) {
            mo10294w().m10832z().m10830a("Failed to invoke Tag Manager's initialize() method", e);
        }
    }

    /* renamed from: a */
    protected void m10634a(final String str, final String str2, final long j, Bundle bundle, final boolean z, final boolean z2, final boolean z3, final String str3) {
        final Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.d.4
            @Override // java.lang.Runnable
            public void run() {
                C8685d.this.m10624b(str, str2, j, bundle2, z, z2, z3, str3);
            }
        });
    }

    /* renamed from: a */
    void m10633a(final String str, final String str2, final long j, final Object obj) {
        mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.d.5
            @Override // java.lang.Runnable
            public void run() {
                C8685d.this.m10627a(str, str2, obj, j);
            }
        });
    }

    /* renamed from: a */
    public void m10632a(String str, String str2, Bundle bundle) {
        mo10309h();
        m10629a(str, str2, bundle, true, this.f27819b == null || C8723m.m10496l(str2), false, null);
    }

    /* renamed from: a */
    public void m10631a(String str, String str2, Bundle bundle, long j) {
        mo10309h();
        m10634a(str, str2, j, bundle, false, true, true, null);
    }

    /* renamed from: a */
    public void m10630a(String str, String str2, Bundle bundle, boolean z) {
        mo10309h();
        m10629a(str, str2, bundle, true, this.f27819b == null || C8723m.m10496l(str2), z, null);
    }

    /* renamed from: a */
    public void m10628a(String str, String str2, Object obj) {
        int i = 0;
        C4588d.m23625a(str);
        long mo16434a = mo10301p().mo16434a();
        int m10503e = mo10298s().m10503e(str2);
        if (m10503e != 0) {
            String m10535a = mo10298s().m10535a(str2, mo10292y().m10439d(), true);
            if (str2 != null) {
                i = str2.length();
            }
            this.f27815n.m10689o().m10550a(m10503e, "_ev", m10535a, i);
        } else if (obj == null) {
            m10633a(str, str2, mo16434a, (Object) null);
        } else {
            int m10509c = mo10298s().m10509c(str2, obj);
            if (m10509c == 0) {
                Object m10505d = mo10298s().m10505d(str2, obj);
                if (m10505d == null) {
                    return;
                }
                m10633a(str, str2, mo16434a, m10505d);
                return;
            }
            String m10535a2 = mo10298s().m10535a(str2, mo10292y().m10439d(), true);
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                i = String.valueOf(obj).length();
            }
            this.f27815n.m10689o().m10550a(m10509c, "_ev", m10535a2, i);
        }
    }

    /* renamed from: a */
    public void m10626a(final boolean z) {
        c();
        mo10309h();
        mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.d.1
            @Override // java.lang.Runnable
            public void run() {
                C8685d.this.m10622c(z);
            }
        });
    }

    /* renamed from: b */
    public List<UserAttributeParcel> m10623b(final boolean z) {
        mo10309h();
        c();
        mo10294w().m10844D().m10831a("Fetching user attributes (FE)");
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.f27815n.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.d.6
                @Override // java.lang.Runnable
                public void run() {
                    C8685d.this.mo10302o().m10601a(atomicReference, z);
                }
            });
            try {
                atomicReference.wait(5000L);
            } catch (InterruptedException e) {
                mo10294w().m10832z().m10830a("Interrupted waiting for get user properties", e);
            }
        }
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list == null) {
            mo10294w().m10832z().m10831a("Timed out waiting for get user properties");
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: b */
    public void m10625b(final long j) {
        mo10309h();
        mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.d.3
            @Override // java.lang.Runnable
            public void run() {
                C8685d.this.mo10293x().f27695i.m10787a(j);
                C8685d.this.mo10294w().m10844D().m10830a("Session timeout duration set", Long.valueOf(j));
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }

    @TargetApi(14)
    /* renamed from: f */
    public void m10621f() {
        if (mo10300q().getApplicationContext() instanceof Application) {
            Application application = (Application) mo10300q().getApplicationContext();
            if (this.f27818a == null) {
                this.f27818a = new C8692a();
            }
            application.unregisterActivityLifecycleCallbacks(this.f27818a);
            application.registerActivityLifecycleCallbacks(this.f27818a);
            mo10294w().m10843E().m10831a("Registered activity lifecycle callback");
        }
    }

    @WorkerThread
    /* renamed from: g */
    public void m10620g() {
        mo10307j();
        mo10309h();
        c();
        if (!this.f27815n.m10710b()) {
            return;
        }
        mo10302o().m10595z();
        String m10806D = mo10293x().m10806D();
        if (TextUtils.isEmpty(m10806D) || m10806D.equals(mo10303n().m10350g())) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_po", m10806D);
        m10632a("auto", "_ou", bundle);
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
}
