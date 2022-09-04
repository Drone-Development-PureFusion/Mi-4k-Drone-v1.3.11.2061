package com.google.android.gms.ads.p225a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.ServiceConnectionC4540h;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.stats.C4669b;
import com.google.android.gms.internal.AbstractC7729te;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.ads.a.a */
/* loaded from: classes2.dex */
public class C3433a {

    /* renamed from: a */
    ServiceConnectionC4540h f13705a;

    /* renamed from: b */
    AbstractC7729te f13706b;

    /* renamed from: c */
    boolean f13707c;

    /* renamed from: d */
    Object f13708d;

    /* renamed from: e */
    C3435b f13709e;

    /* renamed from: f */
    final long f13710f;

    /* renamed from: g */
    private final Context f13711g;

    /* renamed from: com.google.android.gms.ads.a.a$a */
    /* loaded from: classes2.dex */
    public static final class C3434a {

        /* renamed from: a */
        private final String f13712a;

        /* renamed from: b */
        private final boolean f13713b;

        public C3434a(String str, boolean z) {
            this.f13712a = str;
            this.f13713b = z;
        }

        /* renamed from: a */
        public String m27865a() {
            return this.f13712a;
        }

        /* renamed from: b */
        public boolean m27864b() {
            return this.f13713b;
        }

        public String toString() {
            String str = this.f13712a;
            return new StringBuilder(String.valueOf(str).length() + 7).append("{").append(str).append("}").append(this.f13713b).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.ads.a.a$b */
    /* loaded from: classes2.dex */
    public static class C3435b extends Thread {

        /* renamed from: a */
        CountDownLatch f13714a = new CountDownLatch(1);

        /* renamed from: b */
        boolean f13715b = false;

        /* renamed from: c */
        private WeakReference<C3433a> f13716c;

        /* renamed from: d */
        private long f13717d;

        public C3435b(C3433a c3433a, long j) {
            this.f13716c = new WeakReference<>(c3433a);
            this.f13717d = j;
            start();
        }

        /* renamed from: c */
        private void m27861c() {
            C3433a c3433a = this.f13716c.get();
            if (c3433a != null) {
                c3433a.m27867c();
                this.f13715b = true;
            }
        }

        /* renamed from: a */
        public void m27863a() {
            this.f13714a.countDown();
        }

        /* renamed from: b */
        public boolean m27862b() {
            return this.f13715b;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f13714a.await(this.f13717d, TimeUnit.MILLISECONDS)) {
                    return;
                }
                m27861c();
            } catch (InterruptedException e) {
                m27861c();
            }
        }
    }

    public C3433a(Context context) {
        this(context, NotificationOptions.f16268b);
    }

    public C3433a(Context context, long j) {
        this.f13708d = new Object();
        C4588d.m23627a(context);
        this.f13711g = context;
        this.f13707c = false;
        this.f13710f = j;
    }

    /* renamed from: a */
    static ServiceConnectionC4540h m27873a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            switch (C4648j.m23370b().mo23375a(context)) {
                case 0:
                case 2:
                    ServiceConnectionC4540h serviceConnectionC4540h = new ServiceConnectionC4540h();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C4669b.m23204a().m23201a(context, intent, serviceConnectionC4540h, 1)) {
                            throw new IOException("Connection failure");
                        }
                        return serviceConnectionC4540h;
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                case 1:
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new C4516c(9);
        }
    }

    /* renamed from: a */
    static AbstractC7729te m27872a(Context context, ServiceConnectionC4540h serviceConnectionC4540h) {
        try {
            return AbstractC7729te.AbstractBinderC7730a.m13637a(serviceConnectionC4540h.m23800a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: b */
    public static C3434a m27869b(Context context) {
        C3433a c3433a = new C3433a(context, -1L);
        try {
            c3433a.m27871a(false);
            return c3433a.m27870b();
        } finally {
            c3433a.m27867c();
        }
    }

    /* renamed from: b */
    public static void m27868b(boolean z) {
    }

    /* renamed from: d */
    private void m27866d() {
        synchronized (this.f13708d) {
            if (this.f13709e != null) {
                this.f13709e.m27863a();
                try {
                    this.f13709e.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f13710f > 0) {
                this.f13709e = new C3435b(this, this.f13710f);
            }
        }
    }

    /* renamed from: a */
    public void m27874a() {
        m27871a(true);
    }

    /* renamed from: a */
    protected void m27871a(boolean z) {
        C4588d.m23616c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f13707c) {
                m27867c();
            }
            this.f13705a = m27873a(this.f13711g);
            this.f13706b = m27872a(this.f13711g, this.f13705a);
            this.f13707c = true;
            if (z) {
                m27866d();
            }
        }
    }

    /* renamed from: b */
    public C3434a m27870b() {
        C3434a c3434a;
        C4588d.m23616c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f13707c) {
                synchronized (this.f13708d) {
                    if (this.f13709e == null || !this.f13709e.m27862b()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m27871a(false);
                    if (!this.f13707c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            C4588d.m23627a(this.f13705a);
            C4588d.m23627a(this.f13706b);
            try {
                c3434a = new C3434a(this.f13706b.mo13636a(), this.f13706b.mo13633a(true));
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            }
        }
        m27866d();
        return c3434a;
    }

    /* renamed from: c */
    public void m27867c() {
        C4588d.m23616c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f13711g == null || this.f13705a == null) {
                return;
            }
            try {
                if (this.f13707c) {
                    C4669b.m23204a().m23200a(this.f13711g, this.f13705a);
                }
            } catch (IllegalArgumentException e) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", e);
            }
            this.f13707c = false;
            this.f13706b = null;
            this.f13705a = null;
        }
    }

    protected void finalize() {
        m27867c();
        super.finalize();
    }
}
