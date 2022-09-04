package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C4201a;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.AbstractC4434j;
import com.google.android.gms.cast.internal.AbstractC4437k;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.firebase.p253b.C9755a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.cast.internal.e */
/* loaded from: classes2.dex */
public class C4423e extends AbstractC4638w<AbstractC4434j> {

    /* renamed from: e */
    private ApplicationMetadata f16615e;

    /* renamed from: f */
    private final CastDevice f16616f;

    /* renamed from: g */
    private final C4201a.C4215d f16617g;

    /* renamed from: i */
    private final long f16619i;

    /* renamed from: j */
    private BinderC4425b f16620j;

    /* renamed from: k */
    private String f16621k;

    /* renamed from: l */
    private boolean f16622l;

    /* renamed from: m */
    private boolean f16623m;

    /* renamed from: n */
    private boolean f16624n;

    /* renamed from: o */
    private boolean f16625o;

    /* renamed from: p */
    private double f16626p;

    /* renamed from: q */
    private int f16627q;

    /* renamed from: r */
    private int f16628r;

    /* renamed from: t */
    private String f16630t;

    /* renamed from: u */
    private String f16631u;

    /* renamed from: v */
    private Bundle f16632v;

    /* renamed from: x */
    private AbstractC4434j f16634x;

    /* renamed from: y */
    private ahl.AbstractC6344b<C4201a.AbstractC4203a> f16635y;

    /* renamed from: z */
    private ahl.AbstractC6344b<Status> f16636z;

    /* renamed from: a */
    private static final C4440m f16614a = new C4440m("CastClientImpl");

    /* renamed from: A */
    private static final Object f16612A = new Object();

    /* renamed from: B */
    private static final Object f16613B = new Object();

    /* renamed from: h */
    private final Map<String, C4201a.AbstractC4216e> f16618h = new HashMap();

    /* renamed from: s */
    private final AtomicLong f16629s = new AtomicLong(0);

    /* renamed from: w */
    private final Map<Long, ahl.AbstractC6344b<Status>> f16633w = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.cast.internal.e$a */
    /* loaded from: classes2.dex */
    public static final class C4424a implements C4201a.AbstractC4203a {

        /* renamed from: a */
        private final Status f16637a;

        /* renamed from: b */
        private final ApplicationMetadata f16638b;

        /* renamed from: c */
        private final String f16639c;

        /* renamed from: d */
        private final String f16640d;

        /* renamed from: e */
        private final boolean f16641e;

        public C4424a(Status status) {
            this(status, null, null, null, false);
        }

        public C4424a(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            this.f16637a = status;
            this.f16638b = applicationMetadata;
            this.f16639c = str;
            this.f16640d = str2;
            this.f16641e = z;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f16637a;
        }

        @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
        /* renamed from: b */
        public ApplicationMetadata mo24217b() {
            return this.f16638b;
        }

        @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
        /* renamed from: c */
        public String mo24216c() {
            return this.f16639c;
        }

        @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
        /* renamed from: d */
        public String mo24215d() {
            return this.f16640d;
        }

        @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
        /* renamed from: e */
        public boolean mo24214e() {
            return this.f16641e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.cast.internal.e$b */
    /* loaded from: classes2.dex */
    public static class BinderC4425b extends AbstractC4437k.AbstractBinderC4438a {

        /* renamed from: a */
        private final AtomicReference<C4423e> f16642a;

        /* renamed from: b */
        private final Handler f16643b;

        public BinderC4425b(C4423e c4423e) {
            this.f16642a = new AtomicReference<>(c4423e);
            this.f16643b = new Handler(c4423e.C());
        }

        /* renamed from: a */
        private void m24211a(C4423e c4423e, long j, int i) {
            ahl.AbstractC6344b abstractC6344b;
            synchronized (c4423e.f16633w) {
                abstractC6344b = (ahl.AbstractC6344b) c4423e.f16633w.remove(Long.valueOf(j));
            }
            if (abstractC6344b != null) {
                abstractC6344b.mo7413a(new Status(i));
            }
        }

        /* renamed from: a */
        private boolean m24212a(C4423e c4423e, int i) {
            synchronized (C4423e.f16613B) {
                if (c4423e.f16636z != null) {
                    c4423e.f16636z.mo7413a(new Status(i));
                    c4423e.f16636z = null;
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        public C4423e m24213a() {
            C4423e andSet = this.f16642a.getAndSet(null);
            if (andSet == null) {
                return null;
            }
            andSet.m24261K();
            return andSet;
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24179a(int i) {
            C4423e m24213a = m24213a();
            if (m24213a == null) {
                return;
            }
            C4423e.f16614a.m24160b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i == 0) {
                return;
            }
            m24213a.b(2);
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24178a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            c4423e.f16615e = applicationMetadata;
            c4423e.f16630t = applicationMetadata.m25257b();
            c4423e.f16631u = str2;
            c4423e.f16621k = str;
            synchronized (C4423e.f16612A) {
                if (c4423e.f16635y != null) {
                    c4423e.f16635y.mo7413a(new C4424a(new Status(0), applicationMetadata, str, str2, z));
                    c4423e.f16635y = null;
                }
            }
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24177a(final ApplicationStatus applicationStatus) {
            final C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            C4423e.f16614a.m24160b("onApplicationStatusChanged", new Object[0]);
            this.f16643b.post(new Runnable() { // from class: com.google.android.gms.cast.internal.e.b.3
                @Override // java.lang.Runnable
                public void run() {
                    c4423e.m24257a(applicationStatus);
                }
            });
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24176a(final DeviceStatus deviceStatus) {
            final C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            C4423e.f16614a.m24160b("onDeviceStatusChanged", new Object[0]);
            this.f16643b.post(new Runnable() { // from class: com.google.android.gms.cast.internal.e.b.2
                @Override // java.lang.Runnable
                public void run() {
                    c4423e.m24256a(deviceStatus);
                }
            });
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24175a(String str, double d, boolean z) {
            C4423e.f16614a.m24160b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24174a(String str, long j) {
            C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            m24211a(c4423e, j, 0);
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24173a(String str, long j, int i) {
            C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            m24211a(c4423e, j, i);
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24172a(final String str, final String str2) {
            final C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            C4423e.f16614a.m24160b("Receive (type=text, ns=%s) %s", str, str2);
            this.f16643b.post(new Runnable() { // from class: com.google.android.gms.cast.internal.e.b.4
                @Override // java.lang.Runnable
                public void run() {
                    C4201a.AbstractC4216e abstractC4216e;
                    synchronized (c4423e.f16618h) {
                        abstractC4216e = (C4201a.AbstractC4216e) c4423e.f16618h.get(str);
                    }
                    if (abstractC4216e != null) {
                        abstractC4216e.mo17637a(c4423e.f16616f, str, str2);
                    } else {
                        C4423e.f16614a.m24160b("Discarded message for unknown namespace '%s'", str);
                    }
                }
            });
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: a */
        public void mo24171a(String str, byte[] bArr) {
            if (this.f16642a.get() == null) {
                return;
            }
            C4423e.f16614a.m24160b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: b */
        public void mo24170b(int i) {
            C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            synchronized (C4423e.f16612A) {
                if (c4423e.f16635y != null) {
                    c4423e.f16635y.mo7413a(new C4424a(new Status(i)));
                    c4423e.f16635y = null;
                }
            }
        }

        /* renamed from: b */
        public boolean m24210b() {
            return this.f16642a.get() == null;
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: c */
        public void mo24169c(int i) {
            C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            m24212a(c4423e, i);
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: d */
        public void mo24168d(int i) {
            C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            m24212a(c4423e, i);
        }

        @Override // com.google.android.gms.cast.internal.AbstractC4437k
        /* renamed from: e */
        public void mo24167e(final int i) {
            final C4423e c4423e = this.f16642a.get();
            if (c4423e == null) {
                return;
            }
            c4423e.f16630t = null;
            c4423e.f16631u = null;
            m24212a(c4423e, i);
            if (c4423e.f16617g == null) {
                return;
            }
            this.f16643b.post(new Runnable() { // from class: com.google.android.gms.cast.internal.e.b.1
                @Override // java.lang.Runnable
                public void run() {
                    c4423e.f16617g.mo24822a(i);
                }
            });
        }
    }

    public C4423e(Context context, Looper looper, C4626s c4626s, CastDevice castDevice, long j, C4201a.C4215d c4215d, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 10, c4626s, abstractC4491b, abstractC4492c);
        this.f16616f = castDevice;
        this.f16617g = c4215d;
        this.f16619i = j;
        m24261K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m24261K() {
        this.f16625o = false;
        this.f16627q = -1;
        this.f16628r = -1;
        this.f16615e = null;
        this.f16621k = null;
        this.f16626p = C9755a.f30449c;
        this.f16622l = false;
    }

    /* renamed from: L */
    private void m24260L() {
        f16614a.m24160b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f16618h) {
            this.f16618h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m24257a(ApplicationStatus applicationStatus) {
        boolean z;
        String m24279b = applicationStatus.m24279b();
        if (!C4430f.m24206a(m24279b, this.f16621k)) {
            this.f16621k = m24279b;
            z = true;
        } else {
            z = false;
        }
        f16614a.m24160b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f16623m));
        if (this.f16617g != null && (z || this.f16623m)) {
            this.f16617g.mo24823a();
        }
        this.f16623m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m24256a(DeviceStatus deviceStatus) {
        boolean z;
        boolean z2;
        boolean z3;
        ApplicationMetadata m24273f = deviceStatus.m24273f();
        if (!C4430f.m24206a(m24273f, this.f16615e)) {
            this.f16615e = m24273f;
            this.f16617g.mo24821a(this.f16615e);
        }
        double m24277b = deviceStatus.m24277b();
        if (Double.isNaN(m24277b) || Math.abs(m24277b - this.f16626p) <= 1.0E-7d) {
            z = false;
        } else {
            this.f16626p = m24277b;
            z = true;
        }
        boolean m24276c = deviceStatus.m24276c();
        if (m24276c != this.f16622l) {
            this.f16622l = m24276c;
            z = true;
        }
        f16614a.m24160b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f16624n));
        if (this.f16617g != null && (z || this.f16624n)) {
            this.f16617g.mo17693b();
        }
        int m24275d = deviceStatus.m24275d();
        if (m24275d != this.f16627q) {
            this.f16627q = m24275d;
            z2 = true;
        } else {
            z2 = false;
        }
        f16614a.m24160b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.f16624n));
        if (this.f16617g != null && (z2 || this.f16624n)) {
            this.f16617g.mo24820b(this.f16627q);
        }
        int m24274e = deviceStatus.m24274e();
        if (m24274e != this.f16628r) {
            this.f16628r = m24274e;
            z3 = true;
        } else {
            z3 = false;
        }
        f16614a.m24160b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.f16624n));
        if (this.f16617g != null && (z3 || this.f16624n)) {
            this.f16617g.mo24819c(this.f16628r);
        }
        this.f16624n = false;
    }

    /* renamed from: b */
    private void m24237b(ahl.AbstractC6344b<C4201a.AbstractC4203a> abstractC6344b) {
        synchronized (f16612A) {
            if (this.f16635y != null) {
                this.f16635y.mo7413a(new C4424a(new Status(2002)));
            }
            this.f16635y = abstractC6344b;
        }
    }

    /* renamed from: c */
    private void m24234c(ahl.AbstractC6344b<Status> abstractC6344b) {
        synchronized (f16613B) {
            if (this.f16636z != null) {
                abstractC6344b.mo7413a(new Status(2001));
            } else {
                this.f16636z = abstractC6344b;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC4434j mo7440b(IBinder iBinder) {
        return AbstractC4434j.AbstractBinderC4435a.m24195a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* renamed from: a */
    public void m24259a(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException(new StringBuilder(41).append("Volume cannot be ").append(d).toString());
        }
        m24229h().mo24193a(d, this.f16626p, this.f16622l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public void mo7981a(int i, IBinder iBinder, Bundle bundle, int i2) {
        f16614a.m24160b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 1001) {
            this.f16625o = true;
            this.f16623m = true;
            this.f16624n = true;
        } else {
            this.f16625o = false;
        }
        if (i == 1001) {
            this.f16632v = new Bundle();
            this.f16632v.putBoolean(C4201a.f16029i, true);
            i = 0;
        }
        super.a(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public void mo20196a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        m24260L();
    }

    /* renamed from: a */
    public void m24249a(ahl.AbstractC6344b<Status> abstractC6344b) {
        m24234c(abstractC6344b);
        m24229h().mo24183b();
    }

    /* renamed from: a */
    public void m24248a(String str) {
        C4201a.AbstractC4216e remove;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.f16618h) {
            remove = this.f16618h.remove(str);
        }
        if (remove == null) {
            return;
        }
        try {
            m24229h().mo24180c(str);
        } catch (IllegalStateException e) {
            f16614a.m24163a(e, "Error unregistering namespace (%s): %s", str, e.getMessage());
        }
    }

    /* renamed from: a */
    public void m24247a(String str, LaunchOptions launchOptions, ahl.AbstractC6344b<C4201a.AbstractC4203a> abstractC6344b) {
        m24237b(abstractC6344b);
        m24229h().mo24191a(str, launchOptions);
    }

    /* renamed from: a */
    public void m24246a(String str, C4201a.AbstractC4216e abstractC4216e) {
        C4430f.m24205a(str);
        m24248a(str);
        if (abstractC4216e != null) {
            synchronized (this.f16618h) {
                this.f16618h.put(str, abstractC4216e);
            }
            m24229h().mo24182b(str);
        }
    }

    /* renamed from: a */
    public void m24245a(String str, ahl.AbstractC6344b<Status> abstractC6344b) {
        m24234c(abstractC6344b);
        m24229h().mo24192a(str);
    }

    /* renamed from: a */
    public void m24244a(String str, String str2, JoinOptions joinOptions, ahl.AbstractC6344b<C4201a.AbstractC4203a> abstractC6344b) {
        m24237b(abstractC6344b);
        if (joinOptions == null) {
            joinOptions = new JoinOptions();
        }
        m24229h().mo24187a(str, str2, joinOptions);
    }

    /* renamed from: a */
    public void m24243a(String str, String str2, ahl.AbstractC6344b<Status> abstractC6344b) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() > 65536) {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        C4430f.m24205a(str);
        m24221p();
        long incrementAndGet = this.f16629s.incrementAndGet();
        try {
            this.f16633w.put(Long.valueOf(incrementAndGet), abstractC6344b);
            m24229h().mo24189a(str, str2, incrementAndGet);
        } catch (Throwable th) {
            this.f16633w.remove(Long.valueOf(incrementAndGet));
            throw th;
        }
    }

    /* renamed from: a */
    public void m24242a(String str, boolean z, ahl.AbstractC6344b<C4201a.AbstractC4203a> abstractC6344b) {
        LaunchOptions launchOptions = new LaunchOptions();
        launchOptions.m25157a(z);
        m24247a(str, launchOptions, abstractC6344b);
    }

    /* renamed from: a */
    public void m24241a(boolean z) {
        m24229h().mo24184a(z, this.f16626p, this.f16622l);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle bundle = new Bundle();
        f16614a.m24160b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f16630t, this.f16631u);
        this.f16616f.m25248a(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f16619i);
        this.f16620j = new BinderC4425b(this);
        bundle.putParcelable("listener", new BinderWrapper(this.f16620j.asBinder()));
        if (this.f16630t != null) {
            bundle.putString("last_application_id", this.f16630t);
            if (this.f16631u != null) {
                bundle.putString("last_session_id", this.f16631u);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        f16614a.m24160b("disconnect(); ServiceListener=%s, isConnected=%b", this.f16620j, Boolean.valueOf(t()));
        BinderC4425b binderC4425b = this.f16620j;
        this.f16620j = null;
        if (binderC4425b == null || binderC4425b.m24213a() == null) {
            f16614a.m24160b("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m24260L();
        try {
            try {
                m24229h().mo24194a();
            } finally {
                super.f();
            }
        } catch (RemoteException | IllegalStateException e) {
            f16614a.m24163a(e, "Error while disconnecting the controller interface: %s", e.getMessage());
            super.f();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.internal.C4641x.AbstractC4642a
    /* renamed from: g */
    public Bundle mo17342g() {
        if (this.f16632v != null) {
            Bundle bundle = this.f16632v;
            this.f16632v = null;
            return bundle;
        }
        return super.g();
    }

    /* renamed from: h */
    AbstractC4434j m24229h() {
        return 0 == 0 ? (AbstractC4434j) super.G() : this.f16634x;
    }

    /* renamed from: i */
    public void m24228i() {
        m24229h().mo24181c();
    }

    /* renamed from: j */
    public double m24227j() {
        m24221p();
        return this.f16626p;
    }

    /* renamed from: k */
    public boolean m24226k() {
        m24221p();
        return this.f16622l;
    }

    /* renamed from: l */
    public int m24225l() {
        m24221p();
        return this.f16627q;
    }

    /* renamed from: m */
    public int m24224m() {
        m24221p();
        return this.f16628r;
    }

    /* renamed from: n */
    public ApplicationMetadata m24223n() {
        m24221p();
        return this.f16615e;
    }

    /* renamed from: o */
    public String m24222o() {
        m24221p();
        return this.f16621k;
    }

    /* renamed from: p */
    void m24221p() {
        if (!this.f16625o || this.f16620j == null || this.f16620j.m24210b()) {
            throw new IllegalStateException("Not connected to a device");
        }
    }
}
