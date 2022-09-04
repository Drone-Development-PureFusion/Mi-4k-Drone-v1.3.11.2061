package p005b.p006a.p007a.p008a.p026n;

import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.p356d.AbstractC11759f;
import org.p356d.C11756e;
import org.p356d.p358b.C11737f;
import org.p356d.p360d.AbstractC11754c;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p028p.C0398f;
/* renamed from: b.a.a.a.n.l */
/* loaded from: classes.dex */
public class C0374l implements AbstractC0366d {

    /* renamed from: n */
    private static final Map<String, String> f375n = new HashMap();

    /* renamed from: a */
    transient String f376a;

    /* renamed from: b */
    transient String f377b;

    /* renamed from: c */
    private String f378c;

    /* renamed from: d */
    private String f379d;

    /* renamed from: e */
    private C0286f f380e;

    /* renamed from: f */
    private C0372j f381f;

    /* renamed from: g */
    private transient C0281d f382g;

    /* renamed from: h */
    private String f383h;

    /* renamed from: i */
    private transient Object[] f384i;

    /* renamed from: j */
    private C0379q f385j;

    /* renamed from: k */
    private StackTraceElement[] f386k;

    /* renamed from: l */
    private AbstractC11759f f387l;

    /* renamed from: m */
    private Map<String, String> f388m;

    /* renamed from: o */
    private long f389o;

    public C0374l() {
    }

    public C0374l(String str, C0283e c0283e, C0281d c0281d, String str2, Throwable th, Object[] objArr) {
        this.f376a = str;
        this.f379d = c0283e.mo88d();
        this.f380e = c0283e.m39774n();
        this.f381f = this.f380e.m39750d();
        this.f382g = c0281d;
        this.f383h = str2;
        this.f384i = objArr;
        th = th == null ? m39543b(objArr) : th;
        if (th != null) {
            this.f385j = new C0379q(th);
            if (c0283e.m39774n().m39748e()) {
                this.f385j.m39506i();
            }
        }
        this.f389o = System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m39550a(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException(getClass() + " does not support serialization. Use LoggerEventVO instance instead. See also LoggerEventVO.build method.");
    }

    /* renamed from: b */
    private Throwable m39543b(Object[] objArr) {
        Throwable m39570a = C0365c.m39570a(objArr);
        if (C0365c.m39571a(m39570a)) {
            this.f384i = C0365c.m39569b(objArr);
        }
        return m39570a;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: a */
    public String mo39540a() {
        if (this.f378c == null) {
            this.f378c = Thread.currentThread().getName();
        }
        return this.f378c;
    }

    /* renamed from: a */
    public void m39554a(long j) {
        this.f389o = j;
    }

    /* renamed from: a */
    public void m39553a(C0281d c0281d) {
        if (this.f382g != null) {
            throw new IllegalStateException("The level has been already set for this event.");
        }
        this.f382g = c0281d;
    }

    /* renamed from: a */
    public void m39552a(C0372j c0372j) {
        this.f381f = c0372j;
    }

    /* renamed from: a */
    public void m39551a(C0379q c0379q) {
        if (this.f385j != null) {
            throw new IllegalStateException("ThrowableProxy has been already set.");
        }
        this.f385j = c0379q;
    }

    /* renamed from: a */
    public void m39549a(String str) {
        this.f379d = str;
    }

    /* renamed from: a */
    public void m39548a(Map<String, String> map) {
        if (this.f388m != null) {
            throw new IllegalStateException("The MDCPropertyMap has been already set for this event.");
        }
        this.f388m = map;
    }

    /* renamed from: a */
    public void m39547a(AbstractC11759f abstractC11759f) {
        if (this.f387l != null) {
            throw new IllegalStateException("The marker has been already set for this event.");
        }
        this.f387l = abstractC11759f;
    }

    /* renamed from: a */
    public void m39546a(Object[] objArr) {
        if (this.f384i != null) {
            throw new IllegalStateException("argArray has been already set");
        }
        this.f384i = objArr;
    }

    /* renamed from: a */
    public void m39545a(StackTraceElement[] stackTraceElementArr) {
        this.f386k = stackTraceElementArr;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: b */
    public C0281d mo39538b() {
        return this.f382g;
    }

    /* renamed from: b */
    public void m39544b(String str) {
        if (this.f378c != null) {
            throw new IllegalStateException("threadName has been already set");
        }
        this.f378c = str;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: c */
    public String mo39537c() {
        return this.f383h;
    }

    /* renamed from: c */
    public void m39542c(String str) {
        if (this.f383h != null) {
            throw new IllegalStateException("The message for this event has been set already.");
        }
        this.f383h = str;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: d */
    public Object[] mo39536d() {
        return this.f384i;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: e */
    public String mo39535e() {
        if (this.f377b != null) {
            return this.f377b;
        }
        if (this.f384i != null) {
            this.f377b = C11737f.m154a(this.f383h, this.f384i).m160a();
        } else {
            this.f377b = this.f383h;
        }
        return this.f377b;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: f */
    public String mo39534f() {
        return this.f379d;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: g */
    public C0372j mo39533g() {
        return this.f381f;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: h */
    public AbstractC0367e mo39532h() {
        return this.f385j;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: i */
    public StackTraceElement[] mo39531i() {
        if (this.f386k == null) {
            this.f386k = C0363a.m39575a(new Throwable(), this.f376a, this.f380e.m39743l(), this.f380e.m39742m());
        }
        return this.f386k;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: j */
    public boolean mo39530j() {
        return this.f386k != null;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: k */
    public AbstractC11759f mo39529k() {
        return this.f387l;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: l */
    public Map<String, String> mo39528l() {
        if (this.f388m == null) {
            AbstractC11754c m13c = C11756e.m13c();
            if (m13c instanceof C0398f) {
                this.f388m = ((C0398f) m13c).m39426b();
            } else {
                this.f388m = m13c.mo23d();
            }
        }
        if (this.f388m == null) {
            this.f388m = f375n;
        }
        return this.f388m;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: m */
    public Map<String, String> mo39527m() {
        return mo39528l();
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: n */
    public long mo39526n() {
        return this.f389o;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d, p005b.p006a.p007a.p029b.p055o.AbstractC0665i
    /* renamed from: o */
    public void mo38531o() {
        mo39535e();
        mo39540a();
        mo39528l();
    }

    /* renamed from: p */
    public long m39541p() {
        return this.f381f.m39557c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.f382g).append("] ");
        sb.append(mo39535e());
        return sb.toString();
    }
}
