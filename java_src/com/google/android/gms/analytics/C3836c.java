package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import com.google.android.gms.analytics.internal.C3882ao;
import com.google.android.gms.analytics.internal.C3892f;
import com.google.android.gms.analytics.internal.C3906n;
import com.google.android.gms.analytics.internal.C3908o;
import com.google.android.gms.analytics.internal.C3910q;
import com.google.android.gms.analytics.internal.C3911r;
import com.google.android.gms.analytics.internal.C3922v;
import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.android.gms.analytics.c */
/* loaded from: classes.dex */
public final class C3836c extends C3855h {

    /* renamed from: b */
    private static List<Runnable> f14915b = new ArrayList();

    /* renamed from: c */
    private boolean f14916c;

    /* renamed from: d */
    private Set<AbstractC3837a> f14917d = new HashSet();

    /* renamed from: e */
    private boolean f14918e;

    /* renamed from: f */
    private boolean f14919f;

    /* renamed from: g */
    private volatile boolean f14920g;

    /* renamed from: h */
    private boolean f14921h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.analytics.c$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3837a {
        /* renamed from: a */
        void mo26474a(Activity activity);

        /* renamed from: b */
        void mo26471b(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: com.google.android.gms.analytics.c$b */
    /* loaded from: classes2.dex */
    public class C3838b implements Application.ActivityLifecycleCallbacks {
        C3838b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C3836c.this.m26583b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C3836c.this.m26577d(activity);
        }
    }

    public C3836c(C3922v c3922v) {
        super(c3922v);
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: a */
    public static C3836c m26590a(Context context) {
        return C3922v.m26114a(context).m26103k();
    }

    /* renamed from: d */
    public static void m26578d() {
        synchronized (C3836c.class) {
            if (f14915b != null) {
                for (Runnable runnable : f14915b) {
                    runnable.run();
                }
                f14915b = null;
            }
        }
    }

    /* renamed from: p */
    private C3911r m26570p() {
        return k().m26105i();
    }

    /* renamed from: q */
    private C3910q m26569q() {
        return k().m26102l();
    }

    /* renamed from: a */
    public C3852g m26593a(int i) {
        C3852g c3852g;
        C3908o a;
        synchronized (this) {
            c3852g = new C3852g(k(), null, null);
            if (i > 0 && (a = new C3906n(k()).a(i)) != null) {
                c3852g.m26515a(a);
            }
            c3852g.E();
        }
        return c3852g;
    }

    /* renamed from: a */
    public C3852g m26587a(String str) {
        C3852g c3852g;
        synchronized (this) {
            c3852g = new C3852g(k(), str, null);
            c3852g.E();
        }
        return c3852g;
    }

    /* renamed from: a */
    public void m26594a() {
        m26585b();
        this.f14916c = true;
    }

    /* renamed from: a */
    public void m26592a(Activity activity) {
        if (!this.f14918e) {
            m26583b(activity);
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public void m26591a(Application application) {
        if (Build.VERSION.SDK_INT < 14 || this.f14918e) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C3838b());
        this.f14918e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m26589a(AbstractC3837a abstractC3837a) {
        this.f14917d.add(abstractC3837a);
        Context m26112b = k().m26112b();
        if (m26112b instanceof Application) {
            m26591a((Application) m26112b);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m26588a(AbstractC3849e abstractC3849e) {
        C3892f.m26296a(abstractC3849e);
        if (!this.f14921h) {
            String m26339a = C3882ao.f15038c.m26339a();
            Log.i(C3882ao.f15038c.m26339a(), new StringBuilder(String.valueOf(m26339a).length() + 112).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(m26339a).append(" DEBUG").toString());
            this.f14921h = true;
        }
    }

    /* renamed from: a */
    public void m26586a(boolean z) {
        this.f14919f = z;
    }

    /* renamed from: b */
    void m26585b() {
        AbstractC3849e m26298a;
        C3910q m26569q = m26569q();
        if (m26569q.m26178d()) {
            m26574g().mo9149a(m26569q.m26177e());
        }
        if (m26569q.m26174h()) {
            m26586a(m26569q.m26173i());
        }
        if (!m26569q.m26178d() || (m26298a = C3892f.m26298a()) == null) {
            return;
        }
        m26298a.mo9149a(m26569q.m26177e());
    }

    /* renamed from: b */
    public void m26584b(int i) {
        m26570p().m26171a(i);
    }

    /* renamed from: b */
    void m26583b(Activity activity) {
        for (AbstractC3837a abstractC3837a : this.f14917d) {
            abstractC3837a.mo26474a(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m26582b(AbstractC3837a abstractC3837a) {
        this.f14917d.remove(abstractC3837a);
    }

    /* renamed from: b */
    public void m26581b(boolean z) {
        this.f14920g = z;
        if (this.f14920g) {
            m26570p().m26163c();
        }
    }

    /* renamed from: c */
    public void m26579c(Activity activity) {
        if (!this.f14918e) {
            m26577d(activity);
        }
    }

    /* renamed from: c */
    public boolean m26580c() {
        return this.f14916c;
    }

    /* renamed from: d */
    void m26577d(Activity activity) {
        for (AbstractC3837a abstractC3837a : this.f14917d) {
            abstractC3837a.mo26471b(activity);
        }
    }

    /* renamed from: e */
    public boolean m26576e() {
        return this.f14919f;
    }

    /* renamed from: f */
    public boolean m26575f() {
        return this.f14920g;
    }

    @Deprecated
    /* renamed from: g */
    public AbstractC3849e m26574g() {
        return C3892f.m26298a();
    }

    /* renamed from: h */
    public String m26573h() {
        C4588d.m23616c("getClientId can not be called from the main thread");
        return k().m26098p().m26400b();
    }

    /* renamed from: i */
    public void m26572i() {
        m26570p().m26162d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m26571j() {
        m26570p().m26161e();
    }
}
