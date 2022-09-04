package p005b.p006a.p007a.p008a.p027o;

import java.net.URL;
import java.util.List;
import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p016g.C0292a;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p036g.p040d.C0469c;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p036g.p041e.C0486a;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
import p005b.p006a.p007a.p029b.p056p.C0687l;
/* renamed from: b.a.a.a.o.h */
/* loaded from: classes.dex */
public class C0390h extends AbstractC0392i {

    /* renamed from: a */
    public static final long f447a = 60000;

    /* renamed from: j */
    private static final int f448j = 65535;

    /* renamed from: k */
    private static final long f449k = 100;

    /* renamed from: l */
    private static final long f450l = 800;

    /* renamed from: c */
    URL f452c;

    /* renamed from: d */
    protected volatile long f453d;

    /* renamed from: e */
    C0469c f454e;

    /* renamed from: b */
    long f451b = 60000;

    /* renamed from: g */
    private long f455g = 0;

    /* renamed from: h */
    private volatile long f456h = 15;

    /* renamed from: i */
    private volatile long f457i = System.currentTimeMillis();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.a.o.h$a */
    /* loaded from: classes.dex */
    public class RunnableC0391a implements Runnable {
        RunnableC0391a() {
        }

        /* renamed from: a */
        private void m39445a(C0286f c0286f) {
            C0292a c0292a = new C0292a();
            c0292a.a(C0390h.this.f1199s);
            C0687l c0687l = new C0687l(C0390h.this.f1199s);
            List<C0463d> e = c0292a.e();
            URL m39153a = C0486a.m39153a(C0390h.this.f1199s);
            c0286f.mo39317f();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                c0292a.a(C0390h.this.f452c);
                if (!c0687l.m38497a(currentTimeMillis)) {
                    return;
                }
                m39444a(c0286f, e, m39153a);
            } catch (C0481m e2) {
                m39444a(c0286f, e, m39153a);
            }
        }

        /* renamed from: a */
        private void m39444a(C0286f c0286f, List<C0463d> list, URL url) {
            C0292a c0292a = new C0292a();
            c0292a.a(C0390h.this.f1199s);
            if (list == null) {
                C0390h.this.e("No previous configuration to fall back on.");
                return;
            }
            C0390h.this.e("Falling back to previously registered safe configuration.");
            try {
                c0286f.mo39317f();
                C0292a.a(C0390h.this.f1199s, url);
                c0292a.a(list);
                C0390h.this.d("Re-registering previous fallback configuration once more as a fallback configuration point");
                c0292a.d();
            } catch (C0481m e) {
                C0390h.this.a("Unexpected exception thrown by a configuration considered safe.", e);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0390h.this.f452c == null) {
                C0390h.this.d("Due to missing top level configuration file, skipping reconfiguration");
                return;
            }
            C0286f c0286f = (C0286f) C0390h.this.f1199s;
            C0390h.this.d("Will reset and reconfigure context named [" + C0390h.this.f1199s.mo39314p() + "]");
            if (!C0390h.this.f452c.toString().endsWith("xml")) {
                return;
            }
            m39445a(c0286f);
        }
    }

    /* renamed from: d */
    private void m39450d(long j) {
        long j2 = j - this.f457i;
        this.f457i = j;
        if (j2 < f449k && this.f456h < 65535) {
            this.f456h = (this.f456h << 1) | 1;
        } else if (j2 <= f450l) {
        } else {
            this.f456h >>>= 2;
        }
    }

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i
    /* renamed from: a */
    public EnumC0668l mo39443a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object[] objArr, Throwable th) {
        if (!b_()) {
            return EnumC0668l.NEUTRAL;
        }
        long j = this.f455g;
        this.f455g = 1 + j;
        if ((j & this.f456h) != this.f456h) {
            return EnumC0668l.NEUTRAL;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f454e) {
            m39450d(currentTimeMillis);
            if (m39455b(currentTimeMillis)) {
                m39456b();
                m39459a();
            }
        }
        return EnumC0668l.NEUTRAL;
    }

    /* renamed from: a */
    void m39459a() {
        d("Detected change in [" + this.f454e.m39233c() + "]");
        this.f1199s.mo39311s().submit(new RunnableC0391a());
    }

    /* renamed from: a */
    void m39458a(long j) {
        this.f453d = this.f451b + j;
    }

    /* renamed from: b */
    void m39456b() {
        this.f453d = Long.MAX_VALUE;
    }

    /* renamed from: b */
    protected boolean m39455b(long j) {
        if (j >= this.f453d) {
            m39458a(j);
            return this.f454e.m39231d();
        }
        return false;
    }

    /* renamed from: c */
    public void m39453c(long j) {
        this.f451b = j;
    }

    /* renamed from: d */
    public long m39451d() {
        return this.f451b;
    }

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f454e = C0486a.m39145c(this.f1199s);
        if (this.f454e == null) {
            e("Empty ConfigurationWatchList in context");
            return;
        }
        this.f452c = this.f454e.m39235b();
        if (this.f452c == null) {
            e("Due to missing top level configuration file, automatic reconfiguration is impossible.");
            return;
        }
        d("Will scan for changes in [" + this.f454e.m39233c() + "] every " + (this.f451b / 1000) + " seconds. ");
        synchronized (this.f454e) {
            m39458a(System.currentTimeMillis());
        }
        super.mo38474j();
    }

    public String toString() {
        return "ReconfigureOnChangeFilter{invocationCounter=" + this.f455g + C0494h.f735w;
    }
}
