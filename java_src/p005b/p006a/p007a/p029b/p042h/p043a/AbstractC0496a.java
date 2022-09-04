package p005b.p006a.p007a.p029b.p042h.p043a;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;
import p005b.p006a.p007a.p029b.AbstractC0404b;
import p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b;
import p005b.p006a.p007a.p029b.p055o.AbstractC0671o;
/* renamed from: b.a.a.b.h.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0496a<E> extends AbstractC0404b<E> {

    /* renamed from: a */
    public static final int f741a = 50;

    /* renamed from: b */
    public static final int f742b = 100;

    /* renamed from: c */
    private int f743c = AbstractRunnableC0513b.f775a;

    /* renamed from: d */
    private int f744d = 50;

    /* renamed from: e */
    private int f745e = 100;

    /* renamed from: i */
    private String f746i;

    /* renamed from: j */
    private AbstractRunnableC0509k<AbstractC0503e> f747j;

    /* renamed from: a */
    protected AbstractC0508j<AbstractC0503e> m39096a(ServerSocket serverSocket) {
        return new C0504f(serverSocket);
    }

    /* renamed from: a */
    protected AbstractRunnableC0509k<AbstractC0503e> m39098a(AbstractC0508j<AbstractC0503e> abstractC0508j, Executor executor) {
        return new C0505g(abstractC0508j, executor, m39088o());
    }

    /* renamed from: a */
    protected abstract AbstractC0671o<E> mo39100a();

    /* renamed from: a */
    public void m39099a(int i) {
        this.f743c = i;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a */
    protected void mo38607a(E e) {
        if (e == null) {
            return;
        }
        mo39094b((AbstractC0496a<E>) e);
        final Serializable mo38530a = mo39100a().mo38530a(e);
        this.f747j.mo39072a(new AbstractC0499c<AbstractC0503e>() { // from class: b.a.a.b.h.a.a.1
            @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0499c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo39056a(AbstractC0503e abstractC0503e) {
                abstractC0503e.mo39076a(mo38530a);
            }
        });
    }

    /* renamed from: a */
    public void m39097a(String str) {
        this.f746i = str;
    }

    /* renamed from: b */
    public void m39095b(int i) {
        this.f744d = i;
    }

    /* renamed from: b */
    protected abstract void mo39094b(E e);

    /* renamed from: c */
    public void m39093c(int i) {
        this.f745e = i;
    }

    /* renamed from: d */
    protected ServerSocketFactory mo39074d() {
        return ServerSocketFactory.getDefault();
    }

    /* renamed from: e */
    protected InetAddress m39092e() {
        if (m39089n() == null) {
            return null;
        }
        return InetAddress.getByName(m39089n());
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (b_()) {
            return;
        }
        try {
            this.f747j = m39098a(m39096a(mo39074d().createServerSocket(m39091l(), m39090m(), m39092e())), c_().mo39311s());
            this.f747j.a(c_());
            c_().mo39311s().execute(this.f747j);
            super.mo38474j();
        } catch (Exception e) {
            a("server startup error: " + e, e);
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        if (!b_()) {
            return;
        }
        try {
            this.f747j.mo39071b();
            super.mo38473k();
        } catch (IOException e) {
            a("server shutdown error: " + e, e);
        }
    }

    /* renamed from: l */
    public int m39091l() {
        return this.f743c;
    }

    /* renamed from: m */
    public int m39090m() {
        return this.f744d;
    }

    /* renamed from: n */
    public String m39089n() {
        return this.f746i;
    }

    /* renamed from: o */
    public int m39088o() {
        return this.f745e;
    }
}
