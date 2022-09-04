package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.support.p001v4.util.ArrayMap;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.internal.C7640qw;
import com.google.android.gms.internal.amv;
import com.google.android.gms.internal.amw;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C8643ab;
import com.google.android.gms.measurement.internal.C8646ac;
import com.google.android.gms.measurement.internal.C8727q;
import com.google.firebase.p251a.C9654a;
import com.google.firebase.p253b.C9755a;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.p286a.p287a.C11086e;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.google.android.gms.measurement.internal.aj */
/* loaded from: classes2.dex */
public class C8668aj {

    /* renamed from: a */
    private static volatile C8668aj f27753a;

    /* renamed from: A */
    private List<Long> f27754A;

    /* renamed from: B */
    private int f27755B;

    /* renamed from: C */
    private int f27756C;

    /* renamed from: b */
    private final Context f27757b;

    /* renamed from: c */
    private final C8726p f27758c;

    /* renamed from: d */
    private final C8654af f27759d;

    /* renamed from: e */
    private final C8643ab f27760e;

    /* renamed from: f */
    private final C8663ai f27761f;

    /* renamed from: g */
    private final C8710g f27762g;

    /* renamed from: h */
    private final C8662ah f27763h;

    /* renamed from: i */
    private final AppMeasurement f27764i;

    /* renamed from: j */
    private final C9654a f27765j;

    /* renamed from: k */
    private final C8723m f27766k;

    /* renamed from: l */
    private final C8727q f27767l;

    /* renamed from: m */
    private final C8646ac f27768m;

    /* renamed from: n */
    private final AbstractC4682e f27769n;

    /* renamed from: o */
    private final C8693e f27770o;

    /* renamed from: p */
    private final C8733s f27771p;

    /* renamed from: q */
    private final C8685d f27772q;

    /* renamed from: r */
    private final C8743z f27773r;

    /* renamed from: s */
    private final C8651ad f27774s;

    /* renamed from: t */
    private final C8719j f27775t;

    /* renamed from: u */
    private final C8725o f27776u;

    /* renamed from: v */
    private final boolean f27777v;

    /* renamed from: w */
    private boolean f27778w;

    /* renamed from: x */
    private Boolean f27779x;

    /* renamed from: y */
    private FileLock f27780y;

    /* renamed from: z */
    private FileChannel f27781z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.measurement.internal.aj$a */
    /* loaded from: classes2.dex */
    public class C8672a implements C8727q.AbstractC8729b {

        /* renamed from: a */
        amw.C6593e f27785a;

        /* renamed from: b */
        List<Long> f27786b;

        /* renamed from: c */
        List<amw.C6590b> f27787c;

        /* renamed from: d */
        long f27788d;

        private C8672a() {
        }

        /* renamed from: a */
        private long m10675a(amw.C6590b c6590b) {
            return ((c6590b.f22360c.longValue() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.C8727q.AbstractC8729b
        /* renamed from: a */
        public void mo10366a(amw.C6593e c6593e) {
            C4588d.m23627a(c6593e);
            this.f27785a = c6593e;
        }

        /* renamed from: a */
        boolean m10676a() {
            return this.f27787c == null || this.f27787c.isEmpty();
        }

        @Override // com.google.android.gms.measurement.internal.C8727q.AbstractC8729b
        /* renamed from: a */
        public boolean mo10367a(long j, amw.C6590b c6590b) {
            C4588d.m23627a(c6590b);
            if (this.f27787c == null) {
                this.f27787c = new ArrayList();
            }
            if (this.f27786b == null) {
                this.f27786b = new ArrayList();
            }
            if (this.f27787c.size() <= 0 || m10675a(this.f27787c.get(0)) == m10675a(c6590b)) {
                long g = this.f27788d + c6590b.g();
                if (g >= C8668aj.this.m10701d().m10462W()) {
                    return false;
                }
                this.f27788d = g;
                this.f27787c.add(c6590b);
                this.f27786b.add(Long.valueOf(j));
                return this.f27787c.size() < C8668aj.this.m10701d().m10461X();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8668aj(C8684c c8684c) {
        C4588d.m23627a(c8684c);
        this.f27757b = c8684c.f27817a;
        this.f27769n = c8684c.m10650m(this);
        this.f27758c = c8684c.m10662a(this);
        C8654af m10661b = c8684c.m10661b(this);
        m10661b.d();
        this.f27759d = m10661b;
        C8643ab m10660c = c8684c.m10660c(this);
        m10660c.d();
        this.f27760e = m10660c;
        m10698f().m10845C().m10830a("App measurement is starting up, version", Long.valueOf(m10701d().m10472M()));
        m10698f().m10845C().m10831a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        m10698f().m10844D().m10831a("Debug-level message logging enabled");
        m10698f().m10844D().m10830a("AppMeasurement singleton hash", Integer.valueOf(System.identityHashCode(this)));
        this.f27766k = c8684c.m10653j(this);
        C8733s m10648o = c8684c.m10648o(this);
        m10648o.d();
        this.f27771p = m10648o;
        C8743z m10647p = c8684c.m10647p(this);
        m10647p.d();
        this.f27773r = m10647p;
        String m10311f = m10647p.m10311f();
        if (m10689o().m10495m(m10311f)) {
            m10698f().m10845C().m10831a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop firebase.analytics.debug-mode .none.");
        } else {
            C8643ab.C8645a m10845C = m10698f().m10845C();
            String valueOf = String.valueOf(m10311f);
            m10845C.m10831a(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop firebase.analytics.debug-mode ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop firebase.analytics.debug-mode "));
        }
        C8727q m10652k = c8684c.m10652k(this);
        m10652k.d();
        this.f27767l = m10652k;
        C8725o m10644s = c8684c.m10644s(this);
        m10644s.d();
        this.f27776u = m10644s;
        C8646ac m10651l = c8684c.m10651l(this);
        m10651l.d();
        this.f27768m = m10651l;
        C8693e m10649n = c8684c.m10649n(this);
        m10649n.d();
        this.f27770o = m10649n;
        C8685d m10654i = c8684c.m10654i(this);
        m10654i.d();
        this.f27772q = m10654i;
        C8719j m10645r = c8684c.m10645r(this);
        m10645r.d();
        this.f27775t = m10645r;
        this.f27774s = c8684c.m10646q(this);
        this.f27764i = c8684c.m10655h(this);
        this.f27765j = c8684c.m10656g(this);
        C8710g m10658e = c8684c.m10658e(this);
        m10658e.d();
        this.f27762g = m10658e;
        C8662ah m10657f = c8684c.m10657f(this);
        m10657f.d();
        this.f27763h = m10657f;
        C8663ai m10659d = c8684c.m10659d(this);
        m10659d.d();
        this.f27761f = m10659d;
        if (this.f27755B != this.f27756C) {
            m10698f().m10834f().m10829a("Not all components initialized", Integer.valueOf(this.f27755B), Integer.valueOf(this.f27756C));
        }
        this.f27777v = true;
        if (!this.f27758c.m10471N() && !m10745D()) {
            if (!(this.f27757b.getApplicationContext() instanceof Application)) {
                m10698f().m10832z().m10831a("Application context is not an Application");
            } else if (Build.VERSION.SDK_INT >= 14) {
                m10692l().m10621f();
            } else {
                m10698f().m10844D().m10831a("Not tracking deep linking pre-ICS");
            }
        }
        this.f27761f.m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.aj.1
            @Override // java.lang.Runnable
            public void run() {
                C8668aj.this.m10704c();
            }
        });
    }

    @WorkerThread
    /* renamed from: M */
    private boolean m10736M() {
        m10678z();
        return this.f27754A != null;
    }

    /* renamed from: N */
    private boolean m10735N() {
        m10678z();
        m10732a();
        return m10688p().m10419I() || !TextUtils.isEmpty(m10688p().m10425C());
    }

    @WorkerThread
    /* renamed from: O */
    private void m10734O() {
        m10678z();
        m10732a();
        if (!m10737L()) {
            return;
        }
        if (!m10710b() || !m10735N()) {
            m10681w().m10817b();
            m10680x().m10557f();
            return;
        }
        long m10733P = m10733P();
        if (m10733P == 0) {
            m10681w().m10817b();
            m10680x().m10557f();
        } else if (!m10687q().m10821f()) {
            m10681w().m10819a();
            m10680x().m10557f();
        } else {
            long m10788a = m10699e().f27691e.m10788a();
            long m10454aa = m10701d().m10454aa();
            if (!m10689o().m10549a(m10788a, m10454aa)) {
                m10733P = Math.max(m10733P, m10788a + m10454aa);
            }
            m10681w().m10817b();
            long mo16434a = m10733P - m10685s().mo16434a();
            if (mo16434a <= 0) {
                mo16434a = m10701d().m10451ad();
            }
            m10698f().m10843E().m10830a("Upload scheduled in approximately ms", Long.valueOf(mo16434a));
            m10680x().m10559a(mo16434a);
        }
    }

    /* renamed from: P */
    private long m10733P() {
        long mo16434a = m10685s().mo16434a();
        long m10448ag = m10701d().m10448ag();
        boolean z = m10688p().m10418J() || m10688p().m10424D();
        long m10452ac = z ? m10701d().m10452ac() : m10701d().m10453ab();
        long m10788a = m10699e().f27689c.m10788a();
        long m10788a2 = m10699e().f27690d.m10788a();
        long max = Math.max(m10688p().m10421G(), m10688p().m10420H());
        if (max == 0) {
            return 0L;
        }
        long abs = mo16434a - Math.abs(max - mo16434a);
        long abs2 = mo16434a - Math.abs(m10788a2 - mo16434a);
        long max2 = Math.max(mo16434a - Math.abs(m10788a - mo16434a), abs2);
        long j = abs + m10448ag;
        if (z && max2 > 0) {
            j = Math.min(abs, max2) + m10452ac;
        }
        if (!m10689o().m10549a(max2, m10452ac)) {
            j = max2 + m10452ac;
        }
        if (abs2 == 0 || abs2 < abs) {
            return j;
        }
        for (int i = 0; i < m10701d().m10446ai(); i++) {
            j += (1 << i) * m10701d().m10447ah();
            if (j > abs2) {
                return j;
            }
        }
        return 0L;
    }

    /* renamed from: a */
    public static C8668aj m10727a(Context context) {
        C4588d.m23627a(context);
        C4588d.m23627a(context.getApplicationContext());
        if (f27753a == null) {
            synchronized (C8668aj.class) {
                if (f27753a == null) {
                    f27753a = new C8684c(context).m10663a();
                }
            }
        }
        return f27753a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public void m10730a(int i, Throwable th, byte[] bArr) {
        boolean z = false;
        m10678z();
        m10732a();
        if (bArr == null) {
            bArr = new byte[0];
        }
        List<Long> list = this.f27754A;
        this.f27754A = null;
        if ((i != 200 && i != 204) || th != null) {
            m10698f().m10843E().m10829a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            m10699e().f27690d.m10787a(m10685s().mo16434a());
            if (i == 503 || i == 429) {
                z = true;
            }
            if (z) {
                m10699e().f27691e.m10787a(m10685s().mo16434a());
            }
            m10734O();
            return;
        }
        m10699e().f27689c.m10787a(m10685s().mo16434a());
        m10699e().f27690d.m10787a(0L);
        m10734O();
        m10698f().m10843E().m10829a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
        m10688p().m10375f();
        try {
            for (Long l : list) {
                m10688p().m10413a(l.longValue());
            }
            m10688p().m10373g();
            m10688p().m10368z();
            if (!m10687q().m10821f() || !m10735N()) {
                m10734O();
            } else {
                m10740I();
            }
        } catch (Throwable th2) {
            m10688p().m10368z();
            throw th2;
        }
    }

    /* renamed from: a */
    private void m10720a(C8682al c8682al) {
        if (c8682al == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: a */
    private void m10712a(List<Long> list) {
        C4588d.m23619b(!list.isEmpty());
        if (this.f27754A != null) {
            m10698f().m10834f().m10831a("Set uploading progress before finishing the previous upload");
        } else {
            this.f27754A = new ArrayList(list);
        }
    }

    /* renamed from: a */
    private boolean m10718a(C8734t c8734t) {
        if (c8734t.f27941f == null) {
            return false;
        }
        Iterator<String> it2 = c8734t.f27941f.iterator();
        while (it2.hasNext()) {
            if ("_r".equals(it2.next())) {
                return true;
            }
        }
        return m10694j().m10767c(c8734t.f27936a, c8734t.f27937b) && m10688p().m10412a(m10743F(), c8734t.f27936a, false, false, false, false, false).f27925e < ((long) m10701d().m10440c(c8734t.f27936a));
    }

    /* renamed from: a */
    private boolean m10715a(String str, long j) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        m10688p().m10375f();
        try {
            C8672a c8672a = new C8672a();
            m10688p().m10395a(str, j, c8672a);
            if (c8672a.m10676a()) {
                m10688p().m10373g();
                m10688p().m10368z();
                return false;
            }
            boolean z5 = false;
            amw.C6593e c6593e = c8672a.f27785a;
            c6593e.f22378b = new amw.C6590b[c8672a.f27787c.size()];
            int i3 = 0;
            int i4 = 0;
            while (i4 < c8672a.f27787c.size()) {
                if (m10694j().m10769b(c8672a.f27785a.f22391o, c8672a.f27787c.get(i4).f22359b)) {
                    m10698f().m10832z().m10830a("Dropping blacklisted raw event", c8672a.f27787c.get(i4).f22359b);
                    m10689o().m10550a(11, "_ev", c8672a.f27787c.get(i4).f22359b, 0);
                    i = i3;
                    z2 = z5;
                } else {
                    if (m10694j().m10767c(c8672a.f27785a.f22391o, c8672a.f27787c.get(i4).f22359b)) {
                        boolean z6 = false;
                        boolean z7 = false;
                        if (c8672a.f27787c.get(i4).f22358a == null) {
                            c8672a.f27787c.get(i4).f22358a = new amw.C6591c[0];
                        }
                        amw.C6591c[] c6591cArr = c8672a.f27787c.get(i4).f22358a;
                        int length = c6591cArr.length;
                        int i5 = 0;
                        while (i5 < length) {
                            amw.C6591c c6591c = c6591cArr[i5];
                            if ("_c".equals(c6591c.f22364a)) {
                                c6591c.f22366c = 1L;
                                z6 = true;
                                z4 = z7;
                            } else if ("_r".equals(c6591c.f22364a)) {
                                c6591c.f22366c = 1L;
                                z4 = true;
                            } else {
                                z4 = z7;
                            }
                            i5++;
                            z7 = z4;
                        }
                        if (!z6) {
                            m10698f().m10843E().m10830a("Marking event as conversion", c8672a.f27787c.get(i4).f22359b);
                            amw.C6591c[] c6591cArr2 = (amw.C6591c[]) Arrays.copyOf(c8672a.f27787c.get(i4).f22358a, c8672a.f27787c.get(i4).f22358a.length + 1);
                            amw.C6591c c6591c2 = new amw.C6591c();
                            c6591c2.f22364a = "_c";
                            c6591c2.f22366c = 1L;
                            c6591cArr2[c6591cArr2.length - 1] = c6591c2;
                            c8672a.f27787c.get(i4).f22358a = c6591cArr2;
                        }
                        if (!z7) {
                            m10698f().m10843E().m10830a("Marking event as real-time", c8672a.f27787c.get(i4).f22359b);
                            amw.C6591c[] c6591cArr3 = (amw.C6591c[]) Arrays.copyOf(c8672a.f27787c.get(i4).f22358a, c8672a.f27787c.get(i4).f22358a.length + 1);
                            amw.C6591c c6591c3 = new amw.C6591c();
                            c6591c3.f22364a = "_r";
                            c6591c3.f22366c = 1L;
                            c6591cArr3[c6591cArr3.length - 1] = c6591c3;
                            c8672a.f27787c.get(i4).f22358a = c6591cArr3;
                        }
                        boolean m10537a = C8723m.m10537a(c8672a.f27787c.get(i4).f22359b);
                        if (m10688p().m10412a(m10743F(), c8672a.f27785a.f22391o, false, false, false, false, true).f27925e > m10701d().m10440c(c8672a.f27785a.f22391o)) {
                            amw.C6590b c6590b = c8672a.f27787c.get(i4);
                            int i6 = 0;
                            while (true) {
                                if (i6 >= c6590b.f22358a.length) {
                                    break;
                                } else if ("_r".equals(c6590b.f22358a[i6].f22364a)) {
                                    amw.C6591c[] c6591cArr4 = new amw.C6591c[c6590b.f22358a.length - 1];
                                    if (i6 > 0) {
                                        System.arraycopy(c6590b.f22358a, 0, c6591cArr4, 0, i6);
                                    }
                                    if (i6 < c6591cArr4.length) {
                                        System.arraycopy(c6590b.f22358a, i6 + 1, c6591cArr4, i6, c6591cArr4.length - i6);
                                    }
                                    c6590b.f22358a = c6591cArr4;
                                } else {
                                    i6++;
                                }
                            }
                        } else {
                            z5 = true;
                        }
                        if (m10537a && m10688p().m10412a(m10743F(), c8672a.f27785a.f22391o, false, false, true, false, false).f27923c > m10701d().m10443b(c8672a.f27785a.f22391o)) {
                            m10698f().m10832z().m10831a("Too many conversions. Not logging as conversion.");
                            amw.C6590b c6590b2 = c8672a.f27787c.get(i4);
                            boolean z8 = false;
                            amw.C6591c c6591c4 = null;
                            amw.C6591c[] c6591cArr5 = c6590b2.f22358a;
                            int length2 = c6591cArr5.length;
                            int i7 = 0;
                            while (i7 < length2) {
                                amw.C6591c c6591c5 = c6591cArr5[i7];
                                if ("_c".equals(c6591c5.f22364a)) {
                                    z3 = z8;
                                } else if ("_err".equals(c6591c5.f22364a)) {
                                    amw.C6591c c6591c6 = c6591c4;
                                    z3 = true;
                                    c6591c5 = c6591c6;
                                } else {
                                    c6591c5 = c6591c4;
                                    z3 = z8;
                                }
                                i7++;
                                z8 = z3;
                                c6591c4 = c6591c5;
                            }
                            if (z8 && c6591c4 != null) {
                                amw.C6591c[] c6591cArr6 = new amw.C6591c[c6590b2.f22358a.length - 1];
                                int i8 = 0;
                                amw.C6591c[] c6591cArr7 = c6590b2.f22358a;
                                int length3 = c6591cArr7.length;
                                int i9 = 0;
                                while (i9 < length3) {
                                    amw.C6591c c6591c7 = c6591cArr7[i9];
                                    if (c6591c7 != c6591c4) {
                                        i2 = i8 + 1;
                                        c6591cArr6[i8] = c6591c7;
                                    } else {
                                        i2 = i8;
                                    }
                                    i9++;
                                    i8 = i2;
                                }
                                c6590b2.f22358a = c6591cArr6;
                                z = z5;
                            } else if (c6591c4 != null) {
                                c6591c4.f22364a = "_err";
                                c6591c4.f22366c = 10L;
                                z = z5;
                            } else {
                                m10698f().m10834f().m10831a("Did not find conversion parameter. Error not tracked");
                            }
                            c6593e.f22378b[i3] = c8672a.f27787c.get(i4);
                            i = i3 + 1;
                            z2 = z;
                        }
                    }
                    z = z5;
                    c6593e.f22378b[i3] = c8672a.f27787c.get(i4);
                    i = i3 + 1;
                    z2 = z;
                }
                i4++;
                i3 = i;
                z5 = z2;
            }
            if (i3 < c8672a.f27787c.size()) {
                c6593e.f22378b = (amw.C6590b[]) Arrays.copyOf(c6593e.f22378b, i3);
            }
            c6593e.f22371A = m10714a(c8672a.f27785a.f22391o, c8672a.f27785a.f22379c, c6593e.f22378b);
            c6593e.f22381e = c6593e.f22378b[0].f22360c;
            c6593e.f22382f = c6593e.f22378b[0].f22360c;
            for (int i10 = 1; i10 < c6593e.f22378b.length; i10++) {
                amw.C6590b c6590b3 = c6593e.f22378b[i10];
                if (c6590b3.f22360c.longValue() < c6593e.f22381e.longValue()) {
                    c6593e.f22381e = c6590b3.f22360c;
                }
                if (c6590b3.f22360c.longValue() > c6593e.f22382f.longValue()) {
                    c6593e.f22382f = c6590b3.f22360c;
                }
            }
            String str2 = c8672a.f27785a.f22391o;
            C8641a m10384b = m10688p().m10384b(str2);
            if (m10384b == null) {
                m10698f().m10834f().m10831a("Bundling raw events w/o app info");
            } else {
                long m10872h = m10384b.m10872h();
                c6593e.f22384h = m10872h != 0 ? Long.valueOf(m10872h) : null;
                long m10874g = m10384b.m10874g();
                if (m10874g != 0) {
                    m10872h = m10874g;
                }
                c6593e.f22383g = m10872h != 0 ? Long.valueOf(m10872h) : null;
                m10384b.m10855r();
                c6593e.f22399w = Integer.valueOf((int) m10384b.m10858o());
                m10384b.m10892a(c6593e.f22381e.longValue());
                m10384b.m10888b(c6593e.f22382f.longValue());
                m10688p().m10407a(m10384b);
            }
            c6593e.f22400x = m10698f().m10842F();
            m10688p().m10408a(c6593e, z5);
            m10688p().m10387a(c8672a.f27786b);
            m10688p().m10370i(str2);
            m10688p().m10373g();
            m10688p().m10368z();
            return true;
        } catch (Throwable th) {
            m10688p().m10368z();
            throw th;
        }
    }

    /* renamed from: a */
    private amw.C6589a[] m10714a(String str, amw.C6595g[] c6595gArr, amw.C6590b[] c6590bArr) {
        C4588d.m23625a(str);
        return m10679y().m10485a(str, c6590bArr, c6595gArr);
    }

    /* renamed from: b */
    private void m10705b(AbstractC8683b abstractC8683b) {
        if (abstractC8683b == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC8683b.m10667a()) {
            return;
        }
        throw new IllegalStateException("Component not initialized");
    }

    @WorkerThread
    /* renamed from: c */
    private void m10703c(AppMetadata appMetadata) {
        boolean z = true;
        m10678z();
        m10732a();
        C4588d.m23627a(appMetadata);
        C4588d.m23625a(appMetadata.f27594b);
        C8641a m10384b = m10688p().m10384b(appMetadata.f27594b);
        String m10799b = m10699e().m10799b(appMetadata.f27594b);
        boolean z2 = false;
        if (m10384b == null) {
            C8641a c8641a = new C8641a(this, appMetadata.f27594b);
            c8641a.m10891a(m10699e().m10794f());
            c8641a.m10884c(m10799b);
            m10384b = c8641a;
            z2 = true;
        } else if (!m10799b.equals(m10384b.m10880e())) {
            m10384b.m10884c(m10799b);
            m10384b.m10891a(m10699e().m10794f());
            z2 = true;
        }
        if (!TextUtils.isEmpty(appMetadata.f27595c) && !appMetadata.f27595c.equals(m10384b.m10883d())) {
            m10384b.m10887b(appMetadata.f27595c);
            z2 = true;
        }
        if (!TextUtils.isEmpty(appMetadata.f27604l) && !appMetadata.f27604l.equals(m10384b.m10877f())) {
            m10384b.m10881d(appMetadata.f27604l);
            z2 = true;
        }
        if (appMetadata.f27598f != 0 && appMetadata.f27598f != m10384b.m10864l()) {
            m10384b.m10882d(appMetadata.f27598f);
            z2 = true;
        }
        if (!TextUtils.isEmpty(appMetadata.f27596d) && !appMetadata.f27596d.equals(m10384b.m10870i())) {
            m10384b.m10878e(appMetadata.f27596d);
            z2 = true;
        }
        if (appMetadata.f27603k != m10384b.m10868j()) {
            m10384b.m10885c(appMetadata.f27603k);
            z2 = true;
        }
        if (!TextUtils.isEmpty(appMetadata.f27597e) && !appMetadata.f27597e.equals(m10384b.m10866k())) {
            m10384b.m10875f(appMetadata.f27597e);
            z2 = true;
        }
        if (appMetadata.f27599g != m10384b.m10862m()) {
            m10384b.m10879e(appMetadata.f27599g);
            z2 = true;
        }
        if (appMetadata.f27601i != m10384b.m10860n()) {
            m10384b.m10890a(appMetadata.f27601i);
        } else {
            z = z2;
        }
        if (z) {
            m10688p().m10407a(m10384b);
        }
    }

    /* renamed from: A */
    FileChannel m10748A() {
        return this.f27781z;
    }

    @WorkerThread
    /* renamed from: B */
    void m10747B() {
        m10678z();
        m10732a();
        if (!m10737L() || !m10746C()) {
            return;
        }
        m10731a(m10713a(m10748A()), m10682v().m10319A());
    }

    @WorkerThread
    /* renamed from: C */
    boolean m10746C() {
        m10678z();
        try {
            this.f27781z = new RandomAccessFile(new File(m10686r().getFilesDir(), this.f27767l.m10426B()), "rw").getChannel();
            this.f27780y = this.f27781z.tryLock();
        } catch (FileNotFoundException e) {
            m10698f().m10834f().m10830a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            m10698f().m10834f().m10830a("Failed to access storage lock file", e2);
        }
        if (this.f27780y != null) {
            m10698f().m10843E().m10831a("Storage concurrent access okay");
            return true;
        }
        m10698f().m10834f().m10831a("Storage concurrent data access panic");
        return false;
    }

    /* renamed from: D */
    public boolean m10745D() {
        return false;
    }

    @WorkerThread
    /* renamed from: E */
    public boolean m10744E() {
        boolean z = false;
        m10678z();
        m10732a();
        if (m10701d().m10469P()) {
            return false;
        }
        Boolean m10468Q = m10701d().m10468Q();
        if (m10468Q != null) {
            z = m10468Q.booleanValue();
        } else if (!m10701d().m10467R()) {
            z = true;
        }
        return m10699e().m10795c(z);
    }

    /* renamed from: F */
    long m10743F() {
        return ((((m10685s().mo16434a() + m10699e().m10792z()) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m10742G() {
        if (m10701d().m10471N()) {
            throw new IllegalStateException("Unexpected call on package side");
        }
    }

    /* renamed from: H */
    void m10741H() {
        if (!m10701d().m10471N()) {
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    @WorkerThread
    /* renamed from: I */
    public void m10740I() {
        C8641a m10384b;
        String str;
        List<Pair<amw.C6593e, Long>> list;
        ArrayMap arrayMap = null;
        m10678z();
        m10732a();
        if (!m10701d().m10471N()) {
            Boolean m10808B = m10699e().m10808B();
            if (m10808B == null) {
                m10698f().m10832z().m10831a("Upload data called on the client side before use of service was decided");
                return;
            } else if (m10808B.booleanValue()) {
                m10698f().m10834f().m10831a("Upload called in the client side when service should be used");
                return;
            }
        }
        if (m10736M()) {
            m10698f().m10832z().m10831a("Uploading requested multiple times");
        } else if (!m10687q().m10821f()) {
            m10698f().m10832z().m10831a("Network not connected, ignoring upload request");
            m10734O();
        } else {
            long mo16434a = m10685s().mo16434a();
            m10728a(mo16434a - m10701d().m10459Z());
            long m10788a = m10699e().f27689c.m10788a();
            if (m10788a != 0) {
                m10698f().m10844D().m10830a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(mo16434a - m10788a)));
            }
            String m10425C = m10688p().m10425C();
            if (TextUtils.isEmpty(m10425C)) {
                String m10386b = m10688p().m10386b(mo16434a - m10701d().m10459Z());
                if (TextUtils.isEmpty(m10386b) || (m10384b = m10688p().m10384b(m10386b)) == null) {
                    return;
                }
                String m10455a = m10701d().m10455a(m10384b.m10883d(), m10384b.m10886c());
                try {
                    URL url = new URL(m10455a);
                    m10698f().m10843E().m10830a("Fetching remote configuration", m10384b.m10889b());
                    amv.C6587b m10775a = m10694j().m10775a(m10384b.m10889b());
                    String m10770b = m10694j().m10770b(m10384b.m10889b());
                    if (m10775a != null && !TextUtils.isEmpty(m10770b)) {
                        arrayMap = new ArrayMap();
                        arrayMap.put(C11086e.f35681C, m10770b);
                    }
                    m10687q().m10825a(m10386b, url, arrayMap, new C8646ac.AbstractC8648a() { // from class: com.google.android.gms.measurement.internal.aj.3
                        @Override // com.google.android.gms.measurement.internal.C8646ac.AbstractC8648a
                        /* renamed from: a */
                        public void mo10677a(String str2, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                            C8668aj.this.m10716a(str2, i, th, bArr, map);
                        }
                    });
                    return;
                } catch (MalformedURLException e) {
                    m10698f().m10834f().m10830a("Failed to parse config URL. Not fetching", m10455a);
                    return;
                }
            }
            List<Pair<amw.C6593e, Long>> m10400a = m10688p().m10400a(m10425C, m10701d().m10431h(m10425C), m10701d().m10430i(m10425C));
            if (m10400a.isEmpty()) {
                return;
            }
            Iterator<Pair<amw.C6593e, Long>> it2 = m10400a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = null;
                    break;
                }
                amw.C6593e c6593e = (amw.C6593e) it2.next().first;
                if (!TextUtils.isEmpty(c6593e.f22395s)) {
                    str = c6593e.f22395s;
                    break;
                }
            }
            if (str != null) {
                for (int i = 0; i < m10400a.size(); i++) {
                    amw.C6593e c6593e2 = (amw.C6593e) m10400a.get(i).first;
                    if (!TextUtils.isEmpty(c6593e2.f22395s) && !c6593e2.f22395s.equals(str)) {
                        list = m10400a.subList(0, i);
                        break;
                    }
                }
            }
            list = m10400a;
            amw.C6592d c6592d = new amw.C6592d();
            c6592d.f22369a = new amw.C6593e[list.size()];
            ArrayList arrayList = new ArrayList(list.size());
            for (int i2 = 0; i2 < c6592d.f22369a.length; i2++) {
                c6592d.f22369a[i2] = (amw.C6593e) list.get(i2).first;
                arrayList.add((Long) list.get(i2).second);
                c6592d.f22369a[i2].f22394r = Long.valueOf(m10701d().m10472M());
                c6592d.f22369a[i2].f22380d = Long.valueOf(mo16434a);
                c6592d.f22369a[i2].f22402z = Boolean.valueOf(m10701d().m10471N());
            }
            String m10515b = m10698f().m10841a(2) ? C8723m.m10515b(c6592d) : null;
            byte[] m10539a = m10689o().m10539a(c6592d);
            String m10460Y = m10701d().m10460Y();
            try {
                URL url2 = new URL(m10460Y);
                m10712a(arrayList);
                m10699e().f27690d.m10787a(mo16434a);
                String str2 = C0363a.f360a;
                if (c6592d.f22369a.length > 0) {
                    str2 = c6592d.f22369a[0].f22391o;
                }
                m10698f().m10843E().m10828a("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(m10539a.length), m10515b);
                m10687q().m10824a(m10425C, url2, m10539a, null, new C8646ac.AbstractC8648a() { // from class: com.google.android.gms.measurement.internal.aj.2
                    @Override // com.google.android.gms.measurement.internal.C8646ac.AbstractC8648a
                    /* renamed from: a */
                    public void mo10677a(String str3, int i3, Throwable th, byte[] bArr, Map<String, List<String>> map) {
                        C8668aj.this.m10730a(i3, th, bArr);
                    }
                });
            } catch (MalformedURLException e2) {
                m10698f().m10834f().m10830a("Failed to parse upload URL. Not uploading", m10460Y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m10739J() {
        this.f27756C++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: K */
    public void m10738K() {
        m10678z();
        m10732a();
        if (!this.f27778w) {
            m10698f().m10845C().m10831a("This instance being marked as an uploader");
            m10747B();
        }
        this.f27778w = true;
    }

    @WorkerThread
    /* renamed from: L */
    boolean m10737L() {
        m10678z();
        m10732a();
        return this.f27778w || m10745D();
    }

    @WorkerThread
    /* renamed from: a */
    int m10713a(FileChannel fileChannel) {
        int i = 0;
        m10678z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            m10698f().m10834f().m10831a("Bad chanel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i = allocate.getInt();
                } else if (read != -1) {
                    m10698f().m10832z().m10830a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
            } catch (IOException e) {
                m10698f().m10834f().m10830a("Failed to read from channel", e);
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10732a() {
        if (!this.f27777v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10726a(AppMetadata appMetadata) {
        m10678z();
        m10732a();
        C4588d.m23625a(appMetadata.f27594b);
        m10703c(appMetadata);
    }

    @WorkerThread
    /* renamed from: a */
    void m10725a(AppMetadata appMetadata, long j) {
        C8641a m10384b = m10688p().m10384b(appMetadata.f27594b);
        if (m10384b != null && m10384b.m10883d() != null && !m10384b.m10883d().equals(appMetadata.f27595c)) {
            m10698f().m10832z().m10831a("New GMP App Id passed in. Removing cached database data.");
            m10688p().m10372g(m10384b.m10889b());
            m10384b = null;
        }
        if (m10384b == null || m10384b.m10870i() == null || m10384b.m10870i().equals(appMetadata.f27596d)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_pv", m10384b.m10870i());
        m10724a(new EventParcel("_au", new EventParams(bundle), "auto", j), appMetadata);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public void m10724a(EventParcel eventParcel, AppMetadata appMetadata) {
        long j;
        C8722l c8722l;
        C8735u m10345a;
        long nanoTime = System.nanoTime();
        m10678z();
        m10732a();
        String str = appMetadata.f27594b;
        C4588d.m23625a(str);
        if (TextUtils.isEmpty(appMetadata.f27595c)) {
            return;
        }
        if (!appMetadata.f27601i) {
            m10703c(appMetadata);
        } else if (m10694j().m10769b(str, eventParcel.f27610b)) {
            m10698f().m10832z().m10830a("Dropping blacklisted event", eventParcel.f27610b);
            m10689o().m10550a(11, "_ev", eventParcel.f27610b, 0);
        } else {
            if (m10698f().m10841a(2)) {
                m10698f().m10843E().m10830a("Logging event", eventParcel);
            }
            m10688p().m10375f();
            try {
                Bundle m10896b = eventParcel.f27611c.m10896b();
                m10703c(appMetadata);
                if ("_iap".equals(eventParcel.f27610b) || C9654a.C9655a.f30191g.equals(eventParcel.f27610b)) {
                    String string = m10896b.getString(C9654a.C9656b.f30221f);
                    if (C9654a.C9655a.f30191g.equals(eventParcel.f27610b)) {
                        double d = m10896b.getDouble("value") * 1000000.0d;
                        if (d == C9755a.f30449c) {
                            d = m10896b.getLong("value") * 1000000.0d;
                        }
                        if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
                            m10698f().m10832z().m10830a("Data lost. Currency value is too big", Double.valueOf(d));
                            m10688p().m10373g();
                            return;
                        }
                        j = Math.round(d);
                    } else {
                        j = m10896b.getLong("value");
                    }
                    if (!TextUtils.isEmpty(string)) {
                        String upperCase = string.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String valueOf = String.valueOf("_ltv_");
                            String valueOf2 = String.valueOf(upperCase);
                            String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            C8722l m10380c = m10688p().m10380c(str, concat);
                            if (m10380c == null || !(m10380c.f27913d instanceof Long)) {
                                m10688p().m10401a(str, m10701d().m10436e(str) - 1);
                                c8722l = new C8722l(str, concat, m10685s().mo16434a(), Long.valueOf(j));
                            } else {
                                c8722l = new C8722l(str, concat, m10685s().mo16434a(), Long.valueOf(j + ((Long) m10380c.f27913d).longValue()));
                            }
                            if (!m10688p().m10406a(c8722l)) {
                                m10698f().m10834f().m10829a("Too many unique user properties are set. Ignoring user property.", c8722l.f27911b, c8722l.f27913d);
                                m10689o().m10550a(9, (String) null, (String) null, 0);
                            }
                        }
                    }
                }
                boolean m10537a = C8723m.m10537a(eventParcel.f27610b);
                boolean equals = "_err".equals(eventParcel.f27610b);
                C8727q.C8728a m10412a = m10688p().m10412a(m10743F(), str, true, m10537a, false, equals, false);
                long m10482C = m10412a.f27922b - m10701d().m10482C();
                if (m10482C > 0) {
                    if (m10482C % 1000 == 1) {
                        m10698f().m10834f().m10830a("Data loss. Too many events logged. count", Long.valueOf(m10412a.f27922b));
                    }
                    m10689o().m10550a(16, "_ev", eventParcel.f27610b, 0);
                    m10688p().m10373g();
                    return;
                }
                if (m10537a) {
                    long m10481D = m10412a.f27921a - m10701d().m10481D();
                    if (m10481D > 0) {
                        if (m10481D % 1000 == 1) {
                            m10698f().m10834f().m10830a("Data loss. Too many public events logged. count", Long.valueOf(m10412a.f27921a));
                        }
                        m10689o().m10550a(16, "_ev", eventParcel.f27610b, 0);
                        m10688p().m10373g();
                        return;
                    }
                }
                if (equals) {
                    long m10457a = m10412a.f27924d - m10701d().m10457a(appMetadata.f27594b);
                    if (m10457a > 0) {
                        if (m10457a == 1) {
                            m10698f().m10834f().m10830a("Too many error events logged. count", Long.valueOf(m10412a.f27924d));
                        }
                        m10688p().m10373g();
                        return;
                    }
                }
                m10689o().m10543a(m10896b, "_o", eventParcel.f27612d);
                if (m10689o().m10495m(str)) {
                    m10689o().m10543a(m10896b, "_dbg", (Object) 1L);
                    m10689o().m10543a(m10896b, "_r", (Object) 1L);
                }
                long m10381c = m10688p().m10381c(str);
                if (m10381c > 0) {
                    m10698f().m10832z().m10830a("Data lost. Too many events stored on disk, deleted", Long.valueOf(m10381c));
                }
                C8734t c8734t = new C8734t(this, eventParcel.f27612d, str, eventParcel.f27610b, eventParcel.f27613e, 0L, m10896b);
                C8735u m10393a = m10688p().m10393a(str, c8734t.f27937b);
                if (m10393a != null) {
                    c8734t = c8734t.m10348a(this, m10393a.f27946e);
                    m10345a = m10393a.m10345a(c8734t.f27939d);
                } else if (m10688p().m10369j(str) >= m10701d().m10483B()) {
                    m10698f().m10834f().m10829a("Too many event names used, ignoring event. name, supported count", c8734t.f27937b, Integer.valueOf(m10701d().m10483B()));
                    m10689o().m10550a(8, (String) null, (String) null, 0);
                    return;
                } else {
                    m10345a = new C8735u(str, c8734t.f27937b, 0L, 0L, c8734t.f27939d);
                }
                m10688p().m10403a(m10345a);
                m10717a(c8734t, appMetadata);
                m10688p().m10373g();
                if (m10698f().m10841a(2)) {
                    m10698f().m10843E().m10830a("Event recorded", c8734t);
                }
                m10688p().m10368z();
                m10734O();
                m10698f().m10843E().m10830a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
            } finally {
                m10688p().m10368z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public void m10723a(EventParcel eventParcel, String str) {
        C8641a m10384b = m10688p().m10384b(str);
        if (m10384b == null || TextUtils.isEmpty(m10384b.m10870i())) {
            m10698f().m10844D().m10830a("No app data available; dropping event", str);
            return;
        }
        try {
            String str2 = m10686r().getPackageManager().getPackageInfo(str, 0).versionName;
            if (m10384b.m10870i() != null && !m10384b.m10870i().equals(str2)) {
                m10698f().m10832z().m10830a("App version does not match; dropping event", str);
                return;
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (!"_ui".equals(eventParcel.f27610b)) {
                m10698f().m10832z().m10830a("Could not find package", str);
            }
        }
        m10724a(eventParcel, new AppMetadata(str, m10384b.m10883d(), m10384b.m10870i(), m10384b.m10868j(), m10384b.m10866k(), m10384b.m10864l(), m10384b.m10862m(), null, m10384b.m10860n(), false, m10384b.m10877f()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public void m10722a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        int i = 0;
        m10678z();
        m10732a();
        if (TextUtils.isEmpty(appMetadata.f27595c)) {
            return;
        }
        if (!appMetadata.f27601i) {
            m10703c(appMetadata);
            return;
        }
        int m10503e = m10689o().m10503e(userAttributeParcel.f27615b);
        if (m10503e != 0) {
            String m10535a = m10689o().m10535a(userAttributeParcel.f27615b, m10701d().m10439d(), true);
            if (userAttributeParcel.f27615b != null) {
                i = userAttributeParcel.f27615b.length();
            }
            m10689o().m10550a(m10503e, "_ev", m10535a, i);
            return;
        }
        int m10509c = m10689o().m10509c(userAttributeParcel.f27615b, userAttributeParcel.m10894a());
        if (m10509c != 0) {
            String m10535a2 = m10689o().m10535a(userAttributeParcel.f27615b, m10701d().m10439d(), true);
            Object m10894a = userAttributeParcel.m10894a();
            if (m10894a != null && ((m10894a instanceof String) || (m10894a instanceof CharSequence))) {
                i = String.valueOf(m10894a).length();
            }
            m10689o().m10550a(m10509c, "_ev", m10535a2, i);
            return;
        }
        Object m10505d = m10689o().m10505d(userAttributeParcel.f27615b, userAttributeParcel.m10894a());
        if (m10505d == null) {
            return;
        }
        C8722l c8722l = new C8722l(appMetadata.f27594b, userAttributeParcel.f27615b, userAttributeParcel.f27616c, m10505d);
        m10698f().m10844D().m10829a("Setting user property", c8722l.f27911b, m10505d);
        m10688p().m10375f();
        try {
            m10703c(appMetadata);
            boolean m10406a = m10688p().m10406a(c8722l);
            m10688p().m10373g();
            if (m10406a) {
                m10698f().m10844D().m10829a("User property set", c8722l.f27911b, c8722l.f27913d);
            } else {
                m10698f().m10834f().m10829a("Too many unique user properties are set. Ignoring user property.", c8722l.f27911b, c8722l.f27913d);
                m10689o().m10550a(9, (String) null, (String) null, 0);
            }
        } finally {
            m10688p().m10368z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10719a(AbstractC8683b abstractC8683b) {
        this.f27755B++;
    }

    /* renamed from: a */
    void m10717a(C8734t c8734t, AppMetadata appMetadata) {
        m10678z();
        m10732a();
        C4588d.m23627a(c8734t);
        C4588d.m23627a(appMetadata);
        C4588d.m23625a(c8734t.f27936a);
        C4588d.m23619b(c8734t.f27936a.equals(appMetadata.f27594b));
        amw.C6593e c6593e = new amw.C6593e();
        c6593e.f22377a = 1;
        c6593e.f22385i = SystemMediaRouteProvider.PACKAGE_NAME;
        c6593e.f22391o = appMetadata.f27594b;
        c6593e.f22390n = appMetadata.f27597e;
        c6593e.f22392p = appMetadata.f27596d;
        c6593e.f22373C = Integer.valueOf((int) appMetadata.f27603k);
        c6593e.f22393q = Long.valueOf(appMetadata.f27598f);
        c6593e.f22401y = appMetadata.f27595c;
        c6593e.f22398v = appMetadata.f27599g == 0 ? null : Long.valueOf(appMetadata.f27599g);
        Pair<String, Boolean> m10802a = m10699e().m10802a(appMetadata.f27594b);
        if (m10802a != null && !TextUtils.isEmpty((CharSequence) m10802a.first)) {
            c6593e.f22395s = (String) m10802a.first;
            c6593e.f22396t = (Boolean) m10802a.second;
        } else if (!m10683u().m10352a(this.f27757b)) {
            String string = Settings.Secure.getString(this.f27757b.getContentResolver(), "android_id");
            if (string == null) {
                m10698f().m10832z().m10831a("null secure ID");
                string = "null";
            } else if (string.isEmpty()) {
                m10698f().m10832z().m10831a("empty secure ID");
            }
            c6593e.f22376F = string;
        }
        c6593e.f22387k = m10683u().m10351f();
        c6593e.f22386j = m10683u().m10350g();
        c6593e.f22389m = Integer.valueOf((int) m10683u().m10349z());
        c6593e.f22388l = m10683u().m10353A();
        c6593e.f22394r = null;
        c6593e.f22380d = null;
        c6593e.f22381e = null;
        c6593e.f22382f = null;
        C8641a m10384b = m10688p().m10384b(appMetadata.f27594b);
        if (m10384b == null) {
            m10384b = new C8641a(this, appMetadata.f27594b);
            m10384b.m10891a(m10699e().m10794f());
            m10384b.m10881d(appMetadata.f27604l);
            m10384b.m10887b(appMetadata.f27595c);
            m10384b.m10884c(m10699e().m10799b(appMetadata.f27594b));
            m10384b.m10876f(0L);
            m10384b.m10892a(0L);
            m10384b.m10888b(0L);
            m10384b.m10878e(appMetadata.f27596d);
            m10384b.m10885c(appMetadata.f27603k);
            m10384b.m10875f(appMetadata.f27597e);
            m10384b.m10882d(appMetadata.f27598f);
            m10384b.m10879e(appMetadata.f27599g);
            m10384b.m10890a(appMetadata.f27601i);
            m10688p().m10407a(m10384b);
        }
        c6593e.f22397u = m10384b.m10886c();
        c6593e.f22372B = m10384b.m10877f();
        List<C8722l> m10402a = m10688p().m10402a(appMetadata.f27594b);
        c6593e.f22379c = new amw.C6595g[m10402a.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= m10402a.size()) {
                try {
                    m10688p().m10404a(c8734t, m10688p().m10409a(c6593e), m10718a(c8734t));
                    return;
                } catch (IOException e) {
                    m10698f().m10834f().m10830a("Data loss. Failed to insert raw event metadata", e);
                    return;
                }
            }
            amw.C6595g c6595g = new amw.C6595g();
            c6593e.f22379c[i2] = c6595g;
            c6595g.f22407b = m10402a.get(i2).f27911b;
            c6595g.f22406a = Long.valueOf(m10402a.get(i2).f27912c);
            m10689o().m10538a(c6595g, m10402a.get(i2).f27913d);
            i = i2 + 1;
        }
    }

    @WorkerThread
    /* renamed from: a */
    void m10716a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        boolean z = false;
        m10678z();
        m10732a();
        C4588d.m23625a(str);
        if (bArr == null) {
            bArr = new byte[0];
        }
        m10688p().m10375f();
        try {
            C8641a m10384b = m10688p().m10384b(str);
            boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
            if (m10384b == null) {
                m10698f().m10832z().m10830a("App does not exist in onConfigFetched", str);
            } else if (z2 || i == 404) {
                List<String> list = map != null ? map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i == 404 || i == 304) {
                    if (m10694j().m10775a(str) == null && !m10694j().m10771a(str, null, null)) {
                        return;
                    }
                } else if (!m10694j().m10771a(str, bArr, str2)) {
                    return;
                }
                m10384b.m10873g(m10685s().mo16434a());
                m10688p().m10407a(m10384b);
                if (i == 404) {
                    m10698f().m10832z().m10831a("Config not found. Using empty config");
                } else {
                    m10698f().m10843E().m10829a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (!m10687q().m10821f() || !m10735N()) {
                    m10734O();
                } else {
                    m10740I();
                }
            } else {
                m10384b.m10871h(m10685s().mo16434a());
                m10688p().m10407a(m10384b);
                m10698f().m10843E().m10829a("Fetching config failed. code, error", Integer.valueOf(i), th);
                m10694j().m10768c(str);
                m10699e().f27690d.m10787a(m10685s().mo16434a());
                if (i == 503 || i == 429) {
                    z = true;
                }
                if (z) {
                    m10699e().f27691e.m10787a(m10685s().mo16434a());
                }
                m10734O();
            }
            m10688p().m10373g();
        } finally {
            m10688p().m10368z();
        }
    }

    /* renamed from: a */
    public void m10711a(boolean z) {
        m10734O();
    }

    @WorkerThread
    /* renamed from: a */
    boolean m10731a(int i, int i2) {
        m10678z();
        if (i > i2) {
            m10698f().m10834f().m10829a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            return false;
        }
        if (i < i2) {
            if (!m10729a(i2, m10748A())) {
                m10698f().m10834f().m10829a("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                return false;
            }
            m10698f().m10843E().m10829a("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
        }
        return true;
    }

    @WorkerThread
    /* renamed from: a */
    boolean m10729a(int i, FileChannel fileChannel) {
        m10678z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            m10698f().m10834f().m10831a("Bad chanel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() == 4) {
                return true;
            }
            m10698f().m10834f().m10830a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            return true;
        } catch (IOException e) {
            m10698f().m10834f().m10830a("Failed to write to channel", e);
            return false;
        }
    }

    /* renamed from: a */
    boolean m10728a(long j) {
        return m10715a((String) null, j);
    }

    @WorkerThread
    /* renamed from: b */
    public void m10709b(AppMetadata appMetadata) {
        m10678z();
        m10732a();
        C4588d.m23627a(appMetadata);
        C4588d.m23625a(appMetadata.f27594b);
        if (TextUtils.isEmpty(appMetadata.f27595c)) {
            return;
        }
        if (!appMetadata.f27601i) {
            m10703c(appMetadata);
            return;
        }
        long mo16434a = m10685s().mo16434a();
        m10688p().m10375f();
        try {
            m10725a(appMetadata, mo16434a);
            m10703c(appMetadata);
            if (m10688p().m10393a(appMetadata.f27594b, "_f") == null) {
                m10722a(new UserAttributeParcel("_fot", mo16434a, Long.valueOf((1 + (mo16434a / Util.MILLSECONDS_OF_HOUR)) * Util.MILLSECONDS_OF_HOUR), "auto"), appMetadata);
                m10708b(appMetadata, mo16434a);
                m10702c(appMetadata, mo16434a);
            } else if (appMetadata.f27602j) {
                m10700d(appMetadata, mo16434a);
            }
            m10688p().m10373g();
        } finally {
            m10688p().m10368z();
        }
    }

    @WorkerThread
    /* renamed from: b */
    void m10708b(AppMetadata appMetadata, long j) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        m10678z();
        m10732a();
        Bundle bundle = new Bundle();
        bundle.putLong("_c", 1L);
        bundle.putLong("_r", 1L);
        bundle.putLong("_uwa", 0L);
        bundle.putLong("_pfo", 0L);
        bundle.putLong("_sys", 0L);
        bundle.putLong("_sysu", 0L);
        PackageManager packageManager = m10686r().getPackageManager();
        if (packageManager == null) {
            m10698f().m10834f().m10831a("PackageManager is null, first open report might be inaccurate");
        } else {
            try {
                packageInfo = packageManager.getPackageInfo(appMetadata.f27594b, 0);
            } catch (PackageManager.NameNotFoundException e) {
                m10698f().m10834f().m10830a("Package info is null, first open report might be inaccurate", e);
                packageInfo = null;
            }
            if (packageInfo != null && packageInfo.firstInstallTime != 0 && packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                bundle.putLong("_uwa", 1L);
            }
            try {
                applicationInfo = packageManager.getApplicationInfo(appMetadata.f27594b, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                m10698f().m10834f().m10830a("Application info is null, first open report might be inaccurate", e2);
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                if ((applicationInfo.flags & 1) != 0) {
                    bundle.putLong("_sys", 1L);
                }
                if ((applicationInfo.flags & 128) != 0) {
                    bundle.putLong("_sysu", 1L);
                }
            }
        }
        long m10371h = m10688p().m10371h(appMetadata.f27594b);
        if (m10371h != 0) {
            bundle.putLong("_pfo", m10371h);
        }
        m10724a(new EventParcel("_f", new EventParams(bundle), "auto", j), appMetadata);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public void m10706b(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        m10678z();
        m10732a();
        if (TextUtils.isEmpty(appMetadata.f27595c)) {
            return;
        }
        if (!appMetadata.f27601i) {
            m10703c(appMetadata);
            return;
        }
        m10698f().m10844D().m10830a("Removing user property", userAttributeParcel.f27615b);
        m10688p().m10375f();
        try {
            m10703c(appMetadata);
            m10688p().m10382b(appMetadata.f27594b, userAttributeParcel.f27615b);
            m10688p().m10373g();
            m10698f().m10844D().m10830a("User property removed", userAttributeParcel.f27615b);
        } finally {
            m10688p().m10368z();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public boolean m10710b() {
        boolean z = true;
        m10732a();
        m10678z();
        if (this.f27779x == null) {
            if (m10701d().m10471N()) {
                this.f27779x = true;
                return true;
            }
            if (!m10689o().m10497k("android.permission.INTERNET") || !m10689o().m10497k("android.permission.ACCESS_NETWORK_STATE") || !C8659ag.m10778a(m10686r(), false) || !C8706f.m10587a(m10686r(), false)) {
                z = false;
            }
            this.f27779x = Boolean.valueOf(z);
            if (this.f27779x.booleanValue()) {
                this.f27779x = Boolean.valueOf(m10689o().m10500h(m10682v().m10310g()));
            }
        }
        return this.f27779x.booleanValue();
    }

    @WorkerThread
    /* renamed from: b */
    public byte[] m10707b(@NonNull EventParcel eventParcel, @Size(min = 1) String str) {
        long j;
        m10732a();
        m10678z();
        m10741H();
        C4588d.m23627a(eventParcel);
        C4588d.m23625a(str);
        amw.C6592d c6592d = new amw.C6592d();
        m10688p().m10375f();
        try {
            C8641a m10384b = m10688p().m10384b(str);
            if (m10384b == null) {
                m10698f().m10844D().m10830a("Log and bundle not available. package_name", str);
                return new byte[0];
            } else if (!m10384b.m10860n()) {
                m10698f().m10844D().m10830a("Log and bundle disabled. package_name", str);
                return new byte[0];
            } else {
                amw.C6593e c6593e = new amw.C6593e();
                c6592d.f22369a = new amw.C6593e[]{c6593e};
                c6593e.f22377a = 1;
                c6593e.f22385i = SystemMediaRouteProvider.PACKAGE_NAME;
                c6593e.f22391o = m10384b.m10889b();
                c6593e.f22390n = m10384b.m10866k();
                c6593e.f22392p = m10384b.m10870i();
                c6593e.f22373C = Integer.valueOf((int) m10384b.m10868j());
                c6593e.f22393q = Long.valueOf(m10384b.m10864l());
                c6593e.f22401y = m10384b.m10883d();
                c6593e.f22398v = Long.valueOf(m10384b.m10862m());
                Pair<String, Boolean> m10802a = m10699e().m10802a(m10384b.m10889b());
                if (m10802a != null && !TextUtils.isEmpty((CharSequence) m10802a.first)) {
                    c6593e.f22395s = (String) m10802a.first;
                    c6593e.f22396t = (Boolean) m10802a.second;
                }
                c6593e.f22387k = m10683u().m10351f();
                c6593e.f22386j = m10683u().m10350g();
                c6593e.f22389m = Integer.valueOf((int) m10683u().m10349z());
                c6593e.f22388l = m10683u().m10353A();
                c6593e.f22397u = m10384b.m10886c();
                c6593e.f22372B = m10384b.m10877f();
                List<C8722l> m10402a = m10688p().m10402a(m10384b.m10889b());
                c6593e.f22379c = new amw.C6595g[m10402a.size()];
                for (int i = 0; i < m10402a.size(); i++) {
                    amw.C6595g c6595g = new amw.C6595g();
                    c6593e.f22379c[i] = c6595g;
                    c6595g.f22407b = m10402a.get(i).f27911b;
                    c6595g.f22406a = Long.valueOf(m10402a.get(i).f27912c);
                    m10689o().m10538a(c6595g, m10402a.get(i).f27913d);
                }
                Bundle m10896b = eventParcel.f27611c.m10896b();
                if ("_iap".equals(eventParcel.f27610b)) {
                    m10896b.putLong("_c", 1L);
                    m10698f().m10844D().m10831a("Marking in-app purchase as real-time");
                    m10896b.putLong("_r", 1L);
                }
                m10896b.putString("_o", eventParcel.f27612d);
                if (m10689o().m10495m(c6593e.f22391o)) {
                    m10689o().m10543a(m10896b, "_dbg", (Object) 1L);
                    m10689o().m10543a(m10896b, "_r", (Object) 1L);
                }
                C8735u m10393a = m10688p().m10393a(str, eventParcel.f27610b);
                if (m10393a == null) {
                    m10688p().m10403a(new C8735u(str, eventParcel.f27610b, 1L, 0L, eventParcel.f27613e));
                    j = 0;
                } else {
                    j = m10393a.f27946e;
                    m10688p().m10403a(m10393a.m10345a(eventParcel.f27613e).m10346a());
                }
                C8734t c8734t = new C8734t(this, eventParcel.f27612d, str, eventParcel.f27610b, eventParcel.f27613e, j, m10896b);
                amw.C6590b c6590b = new amw.C6590b();
                c6593e.f22378b = new amw.C6590b[]{c6590b};
                c6590b.f22360c = Long.valueOf(c8734t.f27939d);
                c6590b.f22359b = c8734t.f27937b;
                c6590b.f22361d = Long.valueOf(c8734t.f27940e);
                c6590b.f22358a = new amw.C6591c[c8734t.f27941f.m10899a()];
                Iterator<String> it2 = c8734t.f27941f.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    String next = it2.next();
                    amw.C6591c c6591c = new amw.C6591c();
                    c6590b.f22358a[i2] = c6591c;
                    c6591c.f22364a = next;
                    m10689o().m10540a(c6591c, c8734t.f27941f.m10897a(next));
                    i2++;
                }
                c6593e.f22371A = m10714a(m10384b.m10889b(), c6593e.f22379c, c6593e.f22378b);
                c6593e.f22381e = c6590b.f22360c;
                c6593e.f22382f = c6590b.f22360c;
                long m10872h = m10384b.m10872h();
                c6593e.f22384h = m10872h != 0 ? Long.valueOf(m10872h) : null;
                long m10874g = m10384b.m10874g();
                if (m10874g != 0) {
                    m10872h = m10874g;
                }
                c6593e.f22383g = m10872h != 0 ? Long.valueOf(m10872h) : null;
                m10384b.m10855r();
                c6593e.f22399w = Integer.valueOf((int) m10384b.m10858o());
                c6593e.f22394r = Long.valueOf(m10701d().m10472M());
                c6593e.f22380d = Long.valueOf(m10685s().mo16434a());
                c6593e.f22402z = Boolean.TRUE;
                m10384b.m10892a(c6593e.f22381e.longValue());
                m10384b.m10888b(c6593e.f22382f.longValue());
                m10688p().m10407a(m10384b);
                m10688p().m10373g();
                try {
                    byte[] bArr = new byte[c6592d.g()];
                    C7640qw m13959a = C7640qw.m13959a(bArr);
                    c6592d.mo13818a(m13959a);
                    m13959a.m13957b();
                    return m10689o().m10517a(bArr);
                } catch (IOException e) {
                    m10698f().m10834f().m10830a("Data loss. Failed to bundle and serialize", e);
                    return null;
                }
            }
        } finally {
            m10688p().m10368z();
        }
    }

    @WorkerThread
    /* renamed from: c */
    protected void m10704c() {
        m10678z();
        if (m10745D() && (!this.f27761f.a() || this.f27761f.b())) {
            m10698f().m10834f().m10831a("Scheduler shutting down before Scion.start() called");
            return;
        }
        m10688p().m10423E();
        if (m10699e().f27689c.m10788a() == 0) {
            m10699e().f27689c.m10787a(m10685s().mo16434a());
        }
        if (m10710b()) {
            if (!m10701d().m10471N() && !TextUtils.isEmpty(m10682v().m10310g())) {
                String m10809A = m10699e().m10809A();
                if (m10809A == null) {
                    m10699e().m10796c(m10682v().m10310g());
                } else if (!m10809A.equals(m10682v().m10310g())) {
                    m10698f().m10845C().m10831a("Rechecking which service to use due to a GMP App Id change");
                    m10699e().m10807C();
                    this.f27770o.m10615C();
                    this.f27770o.m10617A();
                    m10699e().m10796c(m10682v().m10310g());
                }
            }
            if (!m10701d().m10471N() && !m10745D() && !TextUtils.isEmpty(m10682v().m10310g())) {
                m10692l().m10620g();
            }
        } else if (m10744E()) {
            if (!m10689o().m10497k("android.permission.INTERNET")) {
                m10698f().m10834f().m10831a("App is missing INTERNET permission");
            }
            if (!m10689o().m10497k("android.permission.ACCESS_NETWORK_STATE")) {
                m10698f().m10834f().m10831a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!m10701d().m10471N()) {
                if (!C8659ag.m10778a(m10686r(), false)) {
                    m10698f().m10834f().m10831a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C8706f.m10587a(m10686r(), false)) {
                    m10698f().m10834f().m10831a("AppMeasurementService not registered/enabled");
                }
            }
            if (!m10745D()) {
                m10698f().m10834f().m10831a("Uploading is not possible. App measurement disabled");
            }
        }
        m10734O();
    }

    @WorkerThread
    /* renamed from: c */
    void m10702c(AppMetadata appMetadata, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("_et", 1L);
        m10724a(new EventParcel("_e", new EventParams(bundle), "auto", j), appMetadata);
    }

    /* renamed from: d */
    public C8726p m10701d() {
        return this.f27758c;
    }

    @WorkerThread
    /* renamed from: d */
    void m10700d(AppMetadata appMetadata, long j) {
        m10724a(new EventParcel("_cd", new EventParams(new Bundle()), "auto", j), appMetadata);
    }

    /* renamed from: e */
    public C8654af m10699e() {
        m10720a((C8682al) this.f27759d);
        return this.f27759d;
    }

    /* renamed from: f */
    public C8643ab m10698f() {
        m10705b(this.f27760e);
        return this.f27760e;
    }

    /* renamed from: g */
    public C8643ab m10697g() {
        if (this.f27760e == null || !this.f27760e.a()) {
            return null;
        }
        return this.f27760e;
    }

    /* renamed from: h */
    public C8663ai m10696h() {
        m10705b(this.f27761f);
        return this.f27761f;
    }

    /* renamed from: i */
    public C8710g m10695i() {
        m10705b(this.f27762g);
        return this.f27762g;
    }

    /* renamed from: j */
    public C8662ah m10694j() {
        m10705b(this.f27763h);
        return this.f27763h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C8663ai m10693k() {
        return this.f27761f;
    }

    /* renamed from: l */
    public C8685d m10692l() {
        m10705b(this.f27772q);
        return this.f27772q;
    }

    /* renamed from: m */
    public AppMeasurement m10691m() {
        return this.f27764i;
    }

    /* renamed from: n */
    public C9654a m10690n() {
        return this.f27765j;
    }

    /* renamed from: o */
    public C8723m m10689o() {
        m10720a(this.f27766k);
        return this.f27766k;
    }

    /* renamed from: p */
    public C8727q m10688p() {
        m10705b(this.f27767l);
        return this.f27767l;
    }

    /* renamed from: q */
    public C8646ac m10687q() {
        m10705b(this.f27768m);
        return this.f27768m;
    }

    /* renamed from: r */
    public Context m10686r() {
        return this.f27757b;
    }

    /* renamed from: s */
    public AbstractC4682e m10685s() {
        return this.f27769n;
    }

    /* renamed from: t */
    public C8693e m10684t() {
        m10705b(this.f27770o);
        return this.f27770o;
    }

    /* renamed from: u */
    public C8733s m10683u() {
        m10705b(this.f27771p);
        return this.f27771p;
    }

    /* renamed from: v */
    public C8743z m10682v() {
        m10705b(this.f27773r);
        return this.f27773r;
    }

    /* renamed from: w */
    public C8651ad m10681w() {
        if (this.f27774s == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        }
        return this.f27774s;
    }

    /* renamed from: x */
    public C8719j m10680x() {
        m10705b(this.f27775t);
        return this.f27775t;
    }

    /* renamed from: y */
    public C8725o m10679y() {
        m10705b(this.f27776u);
        return this.f27776u;
    }

    @WorkerThread
    /* renamed from: z */
    public void m10678z() {
        m10696h().mo10307j();
    }
}
