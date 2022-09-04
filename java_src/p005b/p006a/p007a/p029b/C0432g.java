package p005b.p006a.p007a.p029b;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.C0670n;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p058r.C0714m;
/* renamed from: b.a.a.b.g */
/* loaded from: classes.dex */
public class C0432g implements AbstractC0427f, AbstractC0669m {

    /* renamed from: b */
    private String f540b;

    /* renamed from: g */
    private volatile ExecutorService f545g;

    /* renamed from: h */
    private C0599l f546h;

    /* renamed from: i */
    private boolean f547i;

    /* renamed from: a */
    private long f539a = System.currentTimeMillis();

    /* renamed from: f */
    private AbstractC0686k f544f = new C0418d();

    /* renamed from: c */
    Map<String, String> f541c = new HashMap();

    /* renamed from: d */
    Map<String, Object> f542d = new HashMap();

    /* renamed from: e */
    C0670n f543e = new C0670n();

    /* renamed from: a */
    private synchronized void m39323a() {
        if (this.f545g != null) {
            C0714m.m38411a(this.f545g);
            this.f545g = null;
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f, p005b.p006a.p007a.p029b.p055o.AbstractC0672p
    /* renamed from: a */
    public String mo38529a(String str) {
        return C0494h.f695P.equals(str) ? mo39314p() : this.f541c.get(str);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: a */
    public void mo39322a(AbstractC0669m abstractC0669m) {
        m39310t().m38753a(abstractC0669m);
    }

    /* renamed from: a */
    public void m39321a(AbstractC0686k abstractC0686k) {
        if (abstractC0686k == null) {
            throw new IllegalArgumentException("null StatusManager not allowed");
        }
        this.f544f = abstractC0686k;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: a */
    public void mo39320a(String str, Object obj) {
        this.f542d.put(str, obj);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: a */
    public void mo39319a(String str, String str2) {
        this.f541c.put(str, str2);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: b */
    public void mo39318b(String str) {
        if (str == null || !str.equals(this.f540b)) {
            if (this.f540b != null && !"default".equals(this.f540b)) {
                throw new IllegalStateException("Context has been already given a name");
            }
            this.f540b = str;
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f547i;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: f */
    public Object mo39316f(String str) {
        return this.f542d.get(str);
    }

    /* renamed from: f */
    public void mo39317f() {
        m39310t().m38754a();
        this.f541c.clear();
        this.f542d.clear();
    }

    /* renamed from: j */
    public void mo38474j() {
        this.f547i = true;
    }

    /* renamed from: k */
    public void mo38473k() {
        m39323a();
        this.f547i = false;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: n */
    public AbstractC0686k mo39315n() {
        return this.f544f;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f, p005b.p006a.p007a.p029b.p055o.AbstractC0672p
    /* renamed from: o */
    public Map<String, String> mo38528o() {
        return new HashMap(this.f541c);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: p */
    public String mo39314p() {
        return this.f540b;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: q */
    public long mo39313q() {
        return this.f539a;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: r */
    public Object mo39312r() {
        return this.f543e;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: s */
    public ExecutorService mo39311s() {
        if (this.f545g == null) {
            synchronized (this) {
                if (this.f545g == null) {
                    this.f545g = C0714m.m38412a();
                }
            }
        }
        return this.f545g;
    }

    /* renamed from: t */
    synchronized C0599l m39310t() {
        if (this.f546h == null) {
            this.f546h = new C0599l();
        }
        return this.f546h;
    }

    public String toString() {
        return this.f540b;
    }
}
