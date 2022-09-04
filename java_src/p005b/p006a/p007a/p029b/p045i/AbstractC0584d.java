package p005b.p006a.p007a.p029b.p045i;

import java.util.List;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
/* renamed from: b.a.a.b.i.d */
/* loaded from: classes.dex */
public abstract class AbstractC0584d<E> extends AbstractC0586f<E> implements AbstractC0661e, AbstractC0669m {

    /* renamed from: a */
    private List<String> f1002a;

    /* renamed from: g */
    C0662f f1003g = new C0662f(this);

    /* renamed from: h */
    protected boolean f1004h = false;

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38551a(AbstractC0427f abstractC0427f) {
        this.f1003g.mo38551a(abstractC0427f);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38550a(AbstractC0682g abstractC0682g) {
        this.f1003g.mo38550a(abstractC0682g);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38549a(String str, Throwable th) {
        this.f1003g.mo38549a(str, th);
    }

    /* renamed from: a */
    public void m38811a(List<String> list) {
        this.f1002a = list;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: b */
    public void mo38547b(String str, Throwable th) {
        this.f1003g.mo38547b(str, th);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f1004h;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38546c(String str) {
        this.f1003g.mo38546c(str);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38545c(String str, Throwable th) {
        this.f1003g.mo38545c(str, th);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c_ */
    public AbstractC0427f mo38544c_() {
        return this.f1003g.mo38544c_();
    }

    /* renamed from: d */
    public String m38810d() {
        if (this.f1002a == null || this.f1002a.size() == 0) {
            return null;
        }
        return this.f1002a.get(0);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: d */
    public void mo38543d(String str) {
        this.f1003g.mo38543d(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public List<String> m38809e() {
        return this.f1002a;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: e */
    public void mo38542e(String str) {
        this.f1003g.mo38542e(str);
    }

    /* renamed from: j */
    public void mo38474j() {
        this.f1004h = true;
    }

    /* renamed from: k */
    public void mo38473k() {
        this.f1004h = false;
    }
}
