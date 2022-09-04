package p005b.p006a.p007a.p029b.p055o;

import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0676a;
import p005b.p006a.p007a.p029b.p056p.C0677b;
import p005b.p006a.p007a.p029b.p056p.C0688m;
/* renamed from: b.a.a.b.o.f */
/* loaded from: classes.dex */
public class C0662f implements AbstractC0661e {

    /* renamed from: a */
    private int f1198a;

    /* renamed from: s */
    protected AbstractC0427f f1199s;

    /* renamed from: t */
    final Object f1200t;

    public C0662f() {
        this.f1198a = 0;
        this.f1200t = this;
    }

    public C0662f(AbstractC0661e abstractC0661e) {
        this.f1198a = 0;
        this.f1200t = abstractC0661e;
    }

    /* renamed from: B */
    public AbstractC0686k m38554B() {
        if (this.f1199s == null) {
            return null;
        }
        return this.f1199s.mo39315n();
    }

    /* renamed from: C */
    protected Object m38553C() {
        return this.f1200t;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38551a(AbstractC0427f abstractC0427f) {
        if (this.f1199s == null) {
            this.f1199s = abstractC0427f;
        } else if (this.f1199s == abstractC0427f) {
        } else {
            throw new IllegalStateException("Context has been already set");
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38550a(AbstractC0682g abstractC0682g) {
        if (this.f1199s != null) {
            AbstractC0686k mo39315n = this.f1199s.mo39315n();
            if (mo39315n == null) {
                return;
            }
            mo39315n.mo38506a(abstractC0682g);
            return;
        }
        int i = this.f1198a;
        this.f1198a = i + 1;
        if (i != 0) {
            return;
        }
        System.out.println("LOGBACK: No context given for " + this);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38549a(String str, Throwable th) {
        mo38550a(new C0676a(str, m38553C(), th));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: b */
    public void mo38547b(String str, Throwable th) {
        mo38550a(new C0677b(str, m38553C(), th));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38546c(String str) {
        mo38550a(new C0676a(str, m38553C()));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38545c(String str, Throwable th) {
        mo38550a(new C0688m(str, m38553C(), th));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c_ */
    public AbstractC0427f mo38544c_() {
        return this.f1199s;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: d */
    public void mo38543d(String str) {
        mo38550a(new C0677b(str, m38553C()));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: e */
    public void mo38542e(String str) {
        mo38550a(new C0688m(str, m38553C()));
    }
}
