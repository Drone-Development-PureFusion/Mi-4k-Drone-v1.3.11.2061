package com.google.android.gms.internal;

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
/* loaded from: classes2.dex */
public class aoo {

    /* renamed from: m */
    private static Object f22612m = new Object();

    /* renamed from: n */
    private static aoo f22613n;

    /* renamed from: a */
    private volatile long f22614a;

    /* renamed from: b */
    private volatile long f22615b;

    /* renamed from: c */
    private volatile boolean f22616c;

    /* renamed from: d */
    private volatile boolean f22617d;

    /* renamed from: e */
    private volatile C3433a.C3434a f22618e;

    /* renamed from: f */
    private volatile long f22619f;

    /* renamed from: g */
    private volatile long f22620g;

    /* renamed from: h */
    private final Context f22621h;

    /* renamed from: i */
    private final AbstractC4682e f22622i;

    /* renamed from: j */
    private final Thread f22623j;

    /* renamed from: k */
    private final Object f22624k;

    /* renamed from: l */
    private AbstractC6696a f22625l;

    /* renamed from: com.google.android.gms.internal.aoo$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6696a {
        /* renamed from: a */
        C3433a.C3434a mo16469a();
    }

    private aoo(Context context) {
        this(context, null, C4685h.m23138d());
    }

    public aoo(Context context, AbstractC6696a abstractC6696a, AbstractC4682e abstractC4682e) {
        this.f22614a = 900000L;
        this.f22615b = NotificationOptions.f16268b;
        this.f22616c = true;
        this.f22617d = false;
        this.f22624k = new Object();
        this.f22625l = new AbstractC6696a() { // from class: com.google.android.gms.internal.aoo.1
            @Override // com.google.android.gms.internal.aoo.AbstractC6696a
            /* renamed from: a */
            public C3433a.C3434a mo16469a() {
                try {
                    return C3433a.m27869b(aoo.this.f22621h);
                } catch (C4516c e) {
                    aoo.this.f22616c = false;
                    aph.m16393b("GooglePlayServicesNotAvailableException getting Advertising Id Info", e);
                    return null;
                } catch (C4517d e2) {
                    aph.m16393b("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
                    return null;
                } catch (IOException e3) {
                    aph.m16393b("IOException getting Ad Id Info", e3);
                    return null;
                } catch (IllegalStateException e4) {
                    aph.m16393b("IllegalStateException getting Advertising Id Info", e4);
                    return null;
                } catch (Exception e5) {
                    aph.m16393b("Unknown exception. Could not get the Advertising Id Info.", e5);
                    return null;
                }
            }
        };
        this.f22622i = abstractC4682e;
        if (context != null) {
            this.f22621h = context.getApplicationContext();
        } else {
            this.f22621h = context;
        }
        if (abstractC6696a != null) {
            this.f22625l = abstractC6696a;
        }
        this.f22619f = this.f22622i.mo16434a();
        this.f22623j = new Thread(new Runnable() { // from class: com.google.android.gms.internal.aoo.2
            @Override // java.lang.Runnable
            public void run() {
                aoo.this.m16470g();
            }
        });
    }

    /* renamed from: a */
    public static aoo m16479a(Context context) {
        if (f22613n == null) {
            synchronized (f22612m) {
                if (f22613n == null) {
                    f22613n = new aoo(context);
                    f22613n.m16474c();
                }
            }
        }
        return f22613n;
    }

    /* renamed from: d */
    private void m16473d() {
        synchronized (this) {
            try {
                m16472e();
                wait(500L);
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: e */
    private void m16472e() {
        if (this.f22622i.mo16434a() - this.f22619f > this.f22615b) {
            synchronized (this.f22624k) {
                this.f22624k.notify();
            }
            this.f22619f = this.f22622i.mo16434a();
        }
    }

    /* renamed from: f */
    private void m16471f() {
        if (this.f22622i.mo16434a() - this.f22620g > Util.MILLSECONDS_OF_HOUR) {
            this.f22618e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m16470g() {
        Process.setThreadPriority(10);
        while (!this.f22617d) {
            C3433a.C3434a c3434a = null;
            if (this.f22616c) {
                c3434a = this.f22625l.mo16469a();
            }
            if (c3434a != null) {
                this.f22618e = c3434a;
                this.f22620g = this.f22622i.mo16434a();
                aph.m16392c("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.f22624k) {
                    this.f22624k.wait(this.f22614a);
                }
            } catch (InterruptedException e) {
                aph.m16392c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    /* renamed from: a */
    public String m16480a() {
        if (this.f22618e == null) {
            m16473d();
        } else {
            m16472e();
        }
        m16471f();
        if (this.f22618e == null) {
            return null;
        }
        return this.f22618e.m27865a();
    }

    /* renamed from: b */
    public boolean m16476b() {
        if (this.f22618e == null) {
            m16473d();
        } else {
            m16472e();
        }
        m16471f();
        if (this.f22618e == null) {
            return true;
        }
        return this.f22618e.m27864b();
    }

    /* renamed from: c */
    public void m16474c() {
        this.f22623j.start();
    }
}
