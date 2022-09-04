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
/* renamed from: b.a.a.b.h.a.l */
/* loaded from: classes.dex */
public abstract class AbstractC0510l<E> extends AbstractC0404b<E> {

    /* renamed from: a */
    public static final int f765a = 50;

    /* renamed from: b */
    public static final int f766b = 100;

    /* renamed from: c */
    private int f767c = AbstractRunnableC0513b.f775a;

    /* renamed from: d */
    private int f768d = 50;

    /* renamed from: e */
    private int f769e = 100;

    /* renamed from: i */
    private String f770i;

    /* renamed from: j */
    private AbstractRunnableC0509k<AbstractC0503e> f771j;

    /* renamed from: a */
    protected AbstractC0508j<AbstractC0503e> m39065a(ServerSocket serverSocket) {
        return new C0504f(serverSocket);
    }

    /* renamed from: a */
    protected AbstractRunnableC0509k<AbstractC0503e> m39068a(AbstractC0508j<AbstractC0503e> abstractC0508j, Executor executor) {
        return new C0505g(abstractC0508j, executor, m39057m());
    }

    /* renamed from: a */
    protected abstract AbstractC0671o<E> m39070a();

    /* renamed from: a */
    public void m39069a(int i) {
        this.f767c = i;
    }

    /* renamed from: a */
    public void m39067a(Integer num) {
        this.f768d = num.intValue();
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a */
    protected void mo38607a(E e) {
        if (e == null) {
            return;
        }
        m39062b((AbstractC0510l<E>) e);
        final Serializable mo38530a = m39070a().mo38530a(e);
        this.f771j.mo39072a(new AbstractC0499c<AbstractC0503e>() { // from class: b.a.a.b.h.a.l.1
            @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0499c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo39056a(AbstractC0503e abstractC0503e) {
                abstractC0503e.mo39076a(mo38530a);
            }
        });
    }

    /* renamed from: a */
    public void m39066a(String str) {
        this.f770i = str;
    }

    /* renamed from: b */
    protected ServerSocketFactory m39064b() {
        return ServerSocketFactory.getDefault();
    }

    /* renamed from: b */
    public void m39063b(int i) {
        this.f769e = i;
    }

    /* renamed from: b */
    protected abstract void m39062b(E e);

    /* renamed from: d */
    protected InetAddress m39061d() {
        if (m39058l() == null) {
            return null;
        }
        return InetAddress.getByName(m39058l());
    }

    /* renamed from: e */
    public int m39060e() {
        return this.f767c;
    }

    /* renamed from: f */
    public Integer m39059f() {
        return Integer.valueOf(this.f768d);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (b_()) {
            return;
        }
        try {
            this.f771j = m39068a(m39065a(m39064b().createServerSocket(m39060e(), m39059f().intValue(), m39061d())), c_().mo39311s());
            this.f771j.a(c_());
            c_().mo39311s().execute(this.f771j);
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
            this.f771j.mo39071b();
            super.mo38473k();
        } catch (IOException e) {
            a("server shutdown error: " + e, e);
        }
    }

    /* renamed from: l */
    public String m39058l() {
        return this.f770i;
    }

    /* renamed from: m */
    public int m39057m() {
        return this.f769e;
    }
}
