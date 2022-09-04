package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.p225a.C3433a;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4517d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.io.IOException;
/* renamed from: com.google.android.gms.tagmanager.g */
/* loaded from: classes2.dex */
public class C9209g {

    /* renamed from: l */
    private static Object f29026l = new Object();

    /* renamed from: m */
    private static C9209g f29027m;

    /* renamed from: a */
    private volatile long f29028a;

    /* renamed from: b */
    private volatile long f29029b;

    /* renamed from: c */
    private volatile boolean f29030c;

    /* renamed from: d */
    private volatile C3433a.C3434a f29031d;

    /* renamed from: e */
    private volatile long f29032e;

    /* renamed from: f */
    private volatile long f29033f;

    /* renamed from: g */
    private final Context f29034g;

    /* renamed from: h */
    private final AbstractC4682e f29035h;

    /* renamed from: i */
    private final Thread f29036i;

    /* renamed from: j */
    private final Object f29037j;

    /* renamed from: k */
    private AbstractC9212a f29038k;

    /* renamed from: com.google.android.gms.tagmanager.g$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9212a {
        /* renamed from: a */
        C3433a.C3434a mo8915a();
    }

    private C9209g(Context context) {
        this(context, null, C4685h.m23138d());
    }

    public C9209g(Context context, AbstractC9212a abstractC9212a, AbstractC4682e abstractC4682e) {
        this.f29028a = 900000L;
        this.f29029b = NotificationOptions.f16268b;
        this.f29030c = false;
        this.f29037j = new Object();
        this.f29038k = new AbstractC9212a() { // from class: com.google.android.gms.tagmanager.g.1
            @Override // com.google.android.gms.tagmanager.C9209g.AbstractC9212a
            /* renamed from: a */
            public C3433a.C3434a mo8915a() {
                try {
                    return C3433a.m27869b(C9209g.this.f29034g);
                } catch (C4516c e) {
                    C9065aw.m9298b("GooglePlayServicesNotAvailableException getting Advertising Id Info", e);
                    return null;
                } catch (C4517d e2) {
                    C9065aw.m9298b("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
                    return null;
                } catch (IOException e3) {
                    C9065aw.m9298b("IOException getting Ad Id Info", e3);
                    return null;
                } catch (IllegalStateException e4) {
                    C9065aw.m9298b("IllegalStateException getting Advertising Id Info", e4);
                    return null;
                } catch (Exception e5) {
                    C9065aw.m9298b("Unknown exception. Could not get the Advertising Id Info.", e5);
                    return null;
                }
            }
        };
        this.f29035h = abstractC4682e;
        if (context != null) {
            this.f29034g = context.getApplicationContext();
        } else {
            this.f29034g = context;
        }
        if (abstractC9212a != null) {
            this.f29038k = abstractC9212a;
        }
        this.f29032e = this.f29035h.mo16434a();
        this.f29036i = new Thread(new Runnable() { // from class: com.google.android.gms.tagmanager.g.2
            @Override // java.lang.Runnable
            public void run() {
                C9209g.this.m8916g();
            }
        });
    }

    /* renamed from: a */
    public static C9209g m8924a(Context context) {
        if (f29027m == null) {
            synchronized (f29026l) {
                if (f29027m == null) {
                    f29027m = new C9209g(context);
                    f29027m.m8920c();
                }
            }
        }
        return f29027m;
    }

    /* renamed from: d */
    private void m8919d() {
        synchronized (this) {
            try {
                m8918e();
                wait(500L);
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: e */
    private void m8918e() {
        if (this.f29035h.mo16434a() - this.f29032e > this.f29029b) {
            synchronized (this.f29037j) {
                this.f29037j.notify();
            }
            this.f29032e = this.f29035h.mo16434a();
        }
    }

    /* renamed from: f */
    private void m8917f() {
        if (this.f29035h.mo16434a() - this.f29033f > Util.MILLSECONDS_OF_HOUR) {
            this.f29031d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m8916g() {
        Process.setThreadPriority(10);
        while (!this.f29030c) {
            C3433a.C3434a mo8915a = this.f29038k.mo8915a();
            if (mo8915a != null) {
                this.f29031d = mo8915a;
                this.f29033f = this.f29035h.mo16434a();
                C9065aw.m9297c("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.f29037j) {
                    this.f29037j.wait(this.f29028a);
                }
            } catch (InterruptedException e) {
                C9065aw.m9297c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    /* renamed from: a */
    public String m8925a() {
        if (this.f29031d == null) {
            m8919d();
        } else {
            m8918e();
        }
        m8917f();
        if (this.f29031d == null) {
            return null;
        }
        return this.f29031d.m27865a();
    }

    /* renamed from: b */
    public boolean m8922b() {
        if (this.f29031d == null) {
            m8919d();
        } else {
            m8918e();
        }
        m8917f();
        if (this.f29031d == null) {
            return true;
        }
        return this.f29031d.m27864b();
    }

    /* renamed from: c */
    public void m8920c() {
        this.f29036i.start();
    }
}
