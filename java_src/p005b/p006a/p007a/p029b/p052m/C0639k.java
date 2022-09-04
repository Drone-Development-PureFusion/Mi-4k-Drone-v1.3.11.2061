package p005b.p006a.p007a.p029b.p052m;

import java.io.File;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0606a;
import p005b.p006a.p007a.p029b.p052m.p053a.C0607b;
import p005b.p006a.p007a.p029b.p052m.p053a.C0610e;
import p005b.p006a.p007a.p029b.p052m.p053a.C0614h;
import p005b.p006a.p007a.p029b.p052m.p053a.C0618i;
import p005b.p006a.p007a.p029b.p052m.p053a.C0623n;
import p005b.p006a.p007a.p029b.p052m.p053a.EnumC0608c;
/* renamed from: b.a.a.b.m.k */
/* loaded from: classes.dex */
public class C0639k<E> extends AbstractC0633e implements AbstractC0640l<E> {

    /* renamed from: a */
    static final String f1144a = "The FileNamePattern option must be set before using TimeBasedRollingPolicy. ";

    /* renamed from: b */
    static final int f1145b = 0;

    /* renamed from: c */
    C0618i f1146c;

    /* renamed from: d */
    Future<?> f1147d;

    /* renamed from: e */
    AbstractC0637i<E> f1148e;

    /* renamed from: g */
    private C0610e f1150g;

    /* renamed from: n */
    private AbstractC0606a f1153n;

    /* renamed from: h */
    private C0623n f1151h = new C0623n();

    /* renamed from: m */
    private int f1152m = 0;

    /* renamed from: f */
    boolean f1149f = false;

    /* renamed from: b */
    private String m38628b(String str) {
        return C0614h.m38715a(C0614h.m38711b(str));
    }

    /* renamed from: o */
    private void m38624o() {
        if (this.f1147d != null) {
            try {
                this.f1147d.get(30L, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                a("Timeout while waiting for compression job to finish", e);
            } catch (Exception e2) {
                a("Unexpected exception while waiting for compression job to finish", e2);
            }
        }
    }

    /* renamed from: a */
    public AbstractC0637i<E> m38635a() {
        return this.f1148e;
    }

    /* renamed from: a */
    Future m38632a(String str, String str2) {
        String n = n();
        String str3 = n + System.nanoTime() + ".tmp";
        this.f1151h.m38690a(n, str3);
        return m38631a(str3, str, str2);
    }

    /* renamed from: a */
    Future m38631a(String str, String str2, String str3) {
        return new C0607b(this.f1150g).m38736a(str, str2, str3);
    }

    /* renamed from: a */
    public void m38634a(int i) {
        this.f1152m = i;
    }

    /* renamed from: a */
    public void m38633a(AbstractC0637i<E> abstractC0637i) {
        this.f1148e = abstractC0637i;
    }

    /* renamed from: a */
    public void m38630a(boolean z) {
        this.f1149f = z;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0640l
    /* renamed from: a */
    public boolean mo38623a(File file, E e) {
        return this.f1148e.a(file, (File) e);
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0632d
    /* renamed from: b */
    public void mo38629b() {
        String mo38639e = this.f1148e.mo38639e();
        String m38715a = C0614h.m38715a(mo38639e);
        if (this.f1122i == EnumC0608c.NONE) {
            if (n() != null) {
                this.f1151h.m38690a(n(), mo38639e);
            }
        } else if (n() == null) {
            this.f1147d = m38631a(mo38639e, mo38639e, m38715a);
        } else {
            this.f1147d = m38632a(mo38639e, m38715a);
        }
        if (this.f1153n != null) {
            this.f1153n.mo38719a(new Date(this.f1148e.mo38637g()));
        }
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0632d
    /* renamed from: d */
    public String mo38627d() {
        String n = n();
        return n != null ? n : this.f1148e.mo38641b();
    }

    /* renamed from: e */
    public int m38626e() {
        return this.f1152m;
    }

    /* renamed from: f */
    public boolean m38625f() {
        return this.f1149f;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0633e, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f1151h.a(this.f1199s);
        if (this.f1124k == null) {
            e(f1144a);
            e(C0494h.f689J);
            throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.f1123j = new C0618i(this.f1124k, this.f1199s);
        h();
        this.f1150g = new C0610e(this.f1122i);
        this.f1150g.a(this.f1199s);
        this.f1146c = new C0618i(C0610e.m38733a(this.f1124k, this.f1122i), this.f1199s);
        d("Will use the pattern " + this.f1146c + " for the active file");
        if (this.f1122i == EnumC0608c.ZIP) {
            this.f1125l = new C0618i(m38628b(this.f1124k), this.f1199s);
        }
        if (this.f1148e == null) {
            this.f1148e = new C0605a();
        }
        this.f1148e.a(this.f1199s);
        this.f1148e.mo38643a(this);
        this.f1148e.j();
        if (this.f1152m != 0) {
            this.f1153n = this.f1148e.mo38638f();
            this.f1153n.mo38724a(this.f1152m);
            if (this.f1149f) {
                d("Cleaning on start up");
                this.f1153n.mo38719a(new Date(this.f1148e.mo38637g()));
            }
        }
        super.mo38474j();
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0633e, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        if (!b_()) {
            return;
        }
        m38624o();
        super.mo38473k();
    }

    public String toString() {
        return "c.q.l.core.rolling.TimeBasedRollingPolicy";
    }
}
