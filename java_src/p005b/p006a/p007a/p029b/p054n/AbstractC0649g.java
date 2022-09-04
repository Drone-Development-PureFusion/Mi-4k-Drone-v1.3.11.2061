package p005b.p006a.p007a.p029b.p054n;

import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.AbstractC0404b;
import p005b.p006a.p007a.p029b.p058r.C0711j;
/* renamed from: b.a.a.b.n.g */
/* loaded from: classes.dex */
public abstract class AbstractC0649g<E> extends AbstractC0404b<E> {

    /* renamed from: a */
    protected C0646d<E> f1164a;

    /* renamed from: b */
    AbstractC0645c<E> f1165b;

    /* renamed from: c */
    C0711j f1166c = new C0711j(1800000);

    /* renamed from: d */
    int f1167d = Integer.MAX_VALUE;

    /* renamed from: e */
    AbstractC0648f<E> f1168e;

    /* renamed from: a */
    public C0711j m38612a() {
        return this.f1166c;
    }

    /* renamed from: a */
    public void m38611a(int i) {
        this.f1167d = i;
    }

    /* renamed from: a */
    public void m38610a(AbstractC0645c<E> abstractC0645c) {
        this.f1165b = abstractC0645c;
    }

    /* renamed from: a */
    public void mo38609a(AbstractC0648f<E> abstractC0648f) {
        this.f1168e = abstractC0648f;
    }

    /* renamed from: a */
    public void m38608a(C0711j c0711j) {
        this.f1166c = c0711j;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a */
    protected void mo38607a(E e) {
        if (!b_()) {
            return;
        }
        String mo38613a = this.f1168e.mo38613a(e);
        long mo38604c = mo38604c((AbstractC0649g<E>) e);
        AbstractC0401a<E> a = this.f1164a.a(mo38613a, mo38604c);
        if (mo38605b(e)) {
            this.f1164a.d(mo38613a);
        }
        this.f1164a.a(mo38604c);
        a.mo38478d((AbstractC0401a<E>) e);
    }

    /* renamed from: b */
    public int m38606b() {
        return this.f1167d;
    }

    /* renamed from: b */
    protected abstract boolean mo38605b(E e);

    /* renamed from: c */
    protected abstract long mo38604c(E e);

    /* renamed from: d */
    public AbstractC0648f<E> m38603d() {
        return this.f1168e;
    }

    /* renamed from: e */
    public C0646d<E> m38602e() {
        return this.f1164a;
    }

    /* renamed from: f */
    public String m38601f() {
        if (this.f1168e != null) {
            return this.f1168e.mo38614a();
        }
        return null;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        int i = 0;
        if (this.f1168e == null) {
            c("Missing discriminator. Aborting");
            i = 1;
        }
        if (!this.f1168e.b_()) {
            c("Discriminator has not started successfully. Aborting");
            i++;
        }
        if (this.f1165b == null) {
            c("AppenderFactory has not been set. Aborting");
            i++;
        } else {
            this.f1164a = new C0646d<>(this.f1199s, this.f1165b);
            this.f1164a.a(this.f1167d);
            this.f1164a.b(this.f1166c.m38423b());
        }
        if (i == 0) {
            super.mo38474j();
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        for (AbstractC0401a<E> abstractC0401a : this.f1164a.c()) {
            abstractC0401a.k();
        }
    }
}
