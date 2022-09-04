package p005b.p006a.p007a.p029b.p054n;

import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p034e.C0424b;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p055o.AbstractC0652a;
import p005b.p006a.p007a.p029b.p055o.C0663g;
/* renamed from: b.a.a.b.n.d */
/* loaded from: classes.dex */
public class C0646d<E> extends AbstractC0652a<AbstractC0401a<E>> {

    /* renamed from: a */
    int f1159a = 0;

    /* renamed from: b */
    final AbstractC0427f f1160b;

    /* renamed from: c */
    final AbstractC0645c<E> f1161c;

    /* renamed from: d */
    final C0663g f1162d;

    public C0646d(AbstractC0427f abstractC0427f, AbstractC0645c<E> abstractC0645c) {
        this.f1160b = abstractC0427f;
        this.f1161c = abstractC0645c;
        this.f1162d = new C0663g(abstractC0427f, this);
    }

    /* renamed from: e */
    private C0424b<E> m38615e(String str) {
        if (this.f1159a < 4) {
            this.f1159a++;
            this.f1162d.mo38546c("Building NOPAppender for discriminating value [" + str + "]");
        }
        C0424b<E> c0424b = new C0424b<>();
        c0424b.a(this.f1160b);
        c0424b.j();
        return c0424b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a
    /* renamed from: a */
    public AbstractC0401a<E> mo38535b(String str) {
        AbstractC0401a<E> abstractC0401a = null;
        try {
            abstractC0401a = this.f1161c.mo38619a(this.f1160b, str);
        } catch (C0481m e) {
            this.f1162d.mo38546c("Error while building appender with discriminating value [" + str + "]");
        }
        return abstractC0401a == null ? m38615e(str) : abstractC0401a;
    }

    /* renamed from: a */
    protected void m38618a(AbstractC0401a<E> abstractC0401a) {
        abstractC0401a.k();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a
    /* renamed from: a */
    protected /* synthetic */ boolean mo38540a(Object obj) {
        return m38616b((AbstractC0401a) ((AbstractC0401a) obj));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a
    /* renamed from: b */
    protected /* synthetic */ void mo38536b(Object obj) {
        m38618a((AbstractC0401a) ((AbstractC0401a) obj));
    }

    /* renamed from: b */
    protected boolean m38616b(AbstractC0401a<E> abstractC0401a) {
        return !abstractC0401a.b_();
    }
}
