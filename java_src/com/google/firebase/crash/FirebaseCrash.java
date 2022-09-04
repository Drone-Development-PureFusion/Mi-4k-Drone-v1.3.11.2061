package com.google.firebase.crash;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.C9751b;
import com.google.firebase.crash.internal.AbstractC9813d;
import com.google.firebase.crash.internal.C9810a;
import com.google.firebase.crash.internal.C9811b;
import com.google.firebase.crash.internal.C9822g;
import com.google.firebase.crash.internal.C9825h;
import com.google.firebase.crash.internal.FirebaseCrashOptions;
import com.google.firebase.crash.internal.config.flag.Flags;
import com.google.firebase.iid.C9909b;
/* loaded from: classes2.dex */
public class FirebaseCrash {

    /* renamed from: a */
    private static final String f30625a = FirebaseCrash.class.getSimpleName();

    /* renamed from: e */
    private static volatile FirebaseCrash f30626e;

    /* renamed from: b */
    private boolean f30627b;

    /* renamed from: c */
    private AbstractC9813d f30628c;

    /* renamed from: d */
    private C9810a f30629d;

    FirebaseCrash(C9751b c9751b, boolean z) {
        this.f30627b = z;
        Context m7224a = c9751b.m7224a();
        if (m7224a == null) {
            Log.w(f30625a, "Application context is missing, disabling api");
            this.f30627b = false;
        }
        if (!this.f30627b) {
            Log.i(f30625a, "Crash reporting is disabled");
            return;
        }
        try {
            FirebaseCrashOptions firebaseCrashOptions = new FirebaseCrashOptions(c9751b.m7208c().m6637b(), c9751b.m7208c().m6640a());
            C9822g.m6884a().m6883a(m7224a);
            this.f30628c = C9822g.m6884a().m6882b();
            this.f30628c.mo6896a(BinderC4173f.m25293a(m7224a), firebaseCrashOptions);
            this.f30629d = new C9810a(m7224a);
            m6907f();
            String str = f30625a;
            String valueOf = String.valueOf(C9822g.m6884a().toString());
            Log.i(str, valueOf.length() != 0 ? "FirebaseCrash reporting initialized ".concat(valueOf) : new String("FirebaseCrash reporting initialized "));
        } catch (Exception e) {
            Log.e(f30625a, "Failed to initialize crash reporting", e);
            this.f30627b = false;
        }
    }

    /* renamed from: a */
    public static FirebaseCrash m6919a() {
        if (f30626e == null) {
            synchronized (FirebaseCrash.class) {
                if (f30626e == null) {
                    f30626e = getInstance(C9751b.m7205d());
                }
            }
        }
        return f30626e;
    }

    /* renamed from: a */
    public static void m6918a(int i, String str, String str2) {
        try {
            m6919a().m6914b(i, str, str2);
        } catch (C9811b e) {
            Log.v(f30625a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m6917a(String str) {
        try {
            m6919a().m6913b(str);
        } catch (C9811b e) {
            Log.v(f30625a, e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m6916a(Throwable th) {
        try {
            m6919a().m6912b(th);
        } catch (C9811b e) {
            Log.v(f30625a, e.getMessage());
        }
    }

    /* renamed from: b */
    public static boolean m6915b() {
        return f30626e != null;
    }

    /* renamed from: c */
    private AbstractC9813d m6911c() {
        return this.f30628c;
    }

    /* renamed from: d */
    private boolean m6909d() {
        return this.f30627b;
    }

    /* renamed from: e */
    private static boolean m6908e() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    /* renamed from: f */
    private void m6907f() {
        if (!m6908e()) {
            throw new RuntimeException("FirebaseCrash reporting may only be initialized on the main thread (preferably in your app's Application.onCreate)");
        }
        Thread.setDefaultUncaughtExceptionHandler(new C9825h(Thread.getDefaultUncaughtExceptionHandler(), this));
    }

    /* renamed from: g */
    private String m6906g() {
        return C9909b.m6576a().m6575b();
    }

    @Keep
    public static FirebaseCrash getInstance(C9751b c9751b) {
        Flags.initialize(c9751b.m7224a());
        FirebaseCrash firebaseCrash = new FirebaseCrash(c9751b, Flags.aVh.m16824c().booleanValue());
        synchronized (FirebaseCrash.class) {
            if (f30626e == null) {
                f30626e = firebaseCrash;
            }
        }
        return firebaseCrash;
    }

    /* renamed from: b */
    public void m6914b(int i, String str, String str2) {
        if (str2 != null) {
            if (str == null) {
                str = "";
            }
            Log.println(i, str, str2);
            m6913b(str2);
        }
    }

    /* renamed from: b */
    public void m6913b(String str) {
        if (!m6909d()) {
            throw new C9811b("Firebase Crash Reporting is disabled.");
        }
        AbstractC9813d m6911c = m6911c();
        if (m6911c == null || str == null) {
            return;
        }
        try {
            m6911c.mo6895a(str);
        } catch (RemoteException e) {
            Log.e(f30625a, "log remoting failed", e);
        }
    }

    /* renamed from: b */
    public void m6912b(Throwable th) {
        if (!m6909d()) {
            throw new C9811b("Firebase Crash Reporting is disabled.");
        }
        AbstractC9813d m6911c = m6911c();
        if (m6911c == null || th == null) {
            return;
        }
        this.f30629d.m6902a(false, System.currentTimeMillis());
        try {
            m6911c.mo6893b(m6906g());
            m6911c.mo6897a(BinderC4173f.m25293a(th));
        } catch (RemoteException e) {
            Log.e(f30625a, "report remoting failed", e);
        }
    }

    /* renamed from: c */
    public void m6910c(Throwable th) {
        if (!m6909d()) {
            throw new C9811b("Firebase Crash Reporting is disabled.");
        }
        AbstractC9813d m6911c = m6911c();
        if (m6911c == null || th == null) {
            return;
        }
        try {
            this.f30629d.m6902a(true, System.currentTimeMillis());
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            m6911c.mo6893b(m6906g());
            m6911c.mo6894b(BinderC4173f.m25293a(th));
        } catch (RemoteException e2) {
            Log.e(f30625a, "report remoting failed", e2);
        }
    }
}
