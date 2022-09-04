package p005b.p006a.p007a.p029b.p055o;

import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0676a;
import p005b.p006a.p007a.p029b.p056p.C0677b;
import p005b.p006a.p007a.p029b.p056p.C0688m;
/* renamed from: b.a.a.b.o.g */
/* loaded from: classes.dex */
public class C0663g implements AbstractC0661e {

    /* renamed from: a */
    protected AbstractC0427f f1201a;

    /* renamed from: b */
    final Object f1202b;

    /* renamed from: c */
    private int f1203c = 0;

    public C0663g(AbstractC0427f abstractC0427f, Object obj) {
        this.f1201a = abstractC0427f;
        this.f1202b = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo38552a() {
        return this.f1202b;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38551a(AbstractC0427f abstractC0427f) {
        if (this.f1201a == null) {
            this.f1201a = abstractC0427f;
        } else if (this.f1201a == abstractC0427f) {
        } else {
            throw new IllegalStateException("Context has been already set");
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38550a(AbstractC0682g abstractC0682g) {
        if (this.f1201a != null) {
            AbstractC0686k mo39315n = this.f1201a.mo39315n();
            if (mo39315n == null) {
                return;
            }
            mo39315n.mo38506a(abstractC0682g);
            return;
        }
        int i = this.f1203c;
        this.f1203c = i + 1;
        if (i != 0) {
            return;
        }
        System.out.println("LOGBACK: No context given for " + this);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38549a(String str, Throwable th) {
        mo38550a(new C0676a(str, mo38552a(), th));
    }

    /* renamed from: b */
    public AbstractC0686k m38548b() {
        if (this.f1201a == null) {
            return null;
        }
        return this.f1201a.mo39315n();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: b */
    public void mo38547b(String str, Throwable th) {
        mo38550a(new C0677b(str, mo38552a(), th));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38546c(String str) {
        mo38550a(new C0676a(str, mo38552a()));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38545c(String str, Throwable th) {
        mo38550a(new C0688m(str, mo38552a(), th));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c_ */
    public AbstractC0427f mo38544c_() {
        return this.f1201a;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: d */
    public void mo38543d(String str) {
        mo38550a(new C0677b(str, mo38552a()));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: e */
    public void mo38542e(String str) {
        mo38550a(new C0688m(str, mo38552a()));
    }
}
