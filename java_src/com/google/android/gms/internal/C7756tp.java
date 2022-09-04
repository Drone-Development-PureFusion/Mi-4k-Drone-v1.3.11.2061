package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.C4696s;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.tp */
/* loaded from: classes.dex */
public class C7756tp {

    /* renamed from: a */
    private final Object f25651a = new Object();

    /* renamed from: b */
    private C7757a f25652b = null;

    /* renamed from: c */
    private boolean f25653c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: com.google.android.gms.internal.tp$a */
    /* loaded from: classes2.dex */
    public static class C7757a implements Application.ActivityLifecycleCallbacks {
        @Nullable

        /* renamed from: a */
        private Activity f25654a;

        /* renamed from: b */
        private Context f25655b;

        /* renamed from: g */
        private Runnable f25660g;

        /* renamed from: i */
        private long f25662i;

        /* renamed from: c */
        private final Object f25656c = new Object();

        /* renamed from: d */
        private boolean f25657d = true;

        /* renamed from: e */
        private boolean f25658e = false;

        /* renamed from: f */
        private List<AbstractC7759b> f25659f = new ArrayList();

        /* renamed from: h */
        private boolean f25661h = false;

        C7757a() {
        }

        /* renamed from: a */
        private void m13554a(Activity activity) {
            synchronized (this.f25656c) {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f25654a = activity;
                }
            }
        }

        @Nullable
        /* renamed from: a */
        public Activity m13555a() {
            return this.f25654a;
        }

        /* renamed from: a */
        public void m13553a(Application application, Context context) {
            if (!this.f25661h) {
                application.registerActivityLifecycleCallbacks(this);
                if (context instanceof Activity) {
                    m13554a((Activity) context);
                }
                this.f25655b = context;
                this.f25662i = C7788uf.f25784ap.m13486c().longValue();
                this.f25661h = true;
            }
        }

        /* renamed from: a */
        public void m13550a(AbstractC7759b abstractC7759b) {
            this.f25659f.add(abstractC7759b);
        }

        @Nullable
        /* renamed from: b */
        public Context m13549b() {
            return this.f25655b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            synchronized (this.f25656c) {
                if (this.f25654a == null) {
                    return;
                }
                if (this.f25654a.equals(activity)) {
                    this.f25654a = null;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            m13554a(activity);
            this.f25658e = true;
            if (this.f25660g != null) {
                abv.f21039a.removeCallbacks(this.f25660g);
            }
            Handler handler = abv.f21039a;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.tp.a.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C7757a.this.f25656c) {
                        if (!C7757a.this.f25657d || !C7757a.this.f25658e) {
                            abr.a("App is still foreground");
                        } else {
                            C7757a.this.f25657d = false;
                            abr.a("App went background");
                            for (AbstractC7759b abstractC7759b : C7757a.this.f25659f) {
                                try {
                                    abstractC7759b.mo13545a(false);
                                } catch (Exception e) {
                                    abr.b("OnForegroundStateChangedListener threw exception.", e);
                                }
                            }
                        }
                    }
                }
            };
            this.f25660g = runnable;
            handler.postDelayed(runnable, this.f25662i);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            boolean z = false;
            m13554a(activity);
            this.f25658e = false;
            if (!this.f25657d) {
                z = true;
            }
            this.f25657d = true;
            if (this.f25660g != null) {
                abv.f21039a.removeCallbacks(this.f25660g);
            }
            synchronized (this.f25656c) {
                if (z) {
                    for (AbstractC7759b abstractC7759b : this.f25659f) {
                        try {
                            abstractC7759b.mo13545a(true);
                        } catch (Exception e) {
                            abr.b("OnForegroundStateChangedListener threw exception.", e);
                        }
                    }
                } else {
                    abr.a("App is still foreground.");
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            m13554a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.google.android.gms.internal.tp$b */
    /* loaded from: classes2.dex */
    public interface AbstractC7759b {
        /* renamed from: a */
        void mo13545a(boolean z);
    }

    @Nullable
    /* renamed from: a */
    public Activity m13559a() {
        Activity activity = null;
        synchronized (this.f25651a) {
            if (C4696s.m23110d()) {
                if (this.f25652b != null) {
                    activity = this.f25652b.m13555a();
                }
            }
        }
        return activity;
    }

    /* renamed from: a */
    public void m13558a(Context context) {
        synchronized (this.f25651a) {
            if (!this.f25653c) {
                if (!C4696s.m23110d()) {
                    return;
                }
                if (!C7788uf.f25783ao.m13486c().booleanValue()) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    abr.d("Can not cast Context to Application");
                    return;
                }
                if (this.f25652b == null) {
                    this.f25652b = new C7757a();
                }
                this.f25652b.m13553a(application, context);
                this.f25653c = true;
            }
        }
    }

    /* renamed from: a */
    public void m13557a(AbstractC7759b abstractC7759b) {
        synchronized (this.f25651a) {
            if (!C4696s.m23110d()) {
                return;
            }
            if (!C7788uf.f25783ao.m13486c().booleanValue()) {
                return;
            }
            if (this.f25652b == null) {
                this.f25652b = new C7757a();
            }
            this.f25652b.m13550a(abstractC7759b);
        }
    }

    @Nullable
    /* renamed from: b */
    public Context m13556b() {
        Context context = null;
        synchronized (this.f25651a) {
            if (C4696s.m23110d()) {
                if (this.f25652b != null) {
                    context = this.f25652b.m13549b();
                }
            }
        }
        return context;
    }
}
