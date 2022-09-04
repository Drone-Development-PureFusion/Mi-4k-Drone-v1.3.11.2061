package p005b.p006a.p007a.p029b.p042h;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g;
import p005b.p006a.p007a.p029b.p058r.AbstractC0710i;
import p005b.p006a.p007a.p029b.p058r.C0717p;
/* renamed from: b.a.a.b.h.c */
/* loaded from: classes.dex */
public class C0529c implements AbstractCallableC0536g {

    /* renamed from: a */
    private final InetAddress f830a;

    /* renamed from: b */
    private final int f831b;

    /* renamed from: c */
    private final AbstractC0710i f832c;

    /* renamed from: d */
    private AbstractCallableC0536g.AbstractC0537a f833d;

    /* renamed from: e */
    private SocketFactory f834e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.a.b.h.c$a */
    /* loaded from: classes.dex */
    public static class C0531a implements AbstractCallableC0536g.AbstractC0537a {
        private C0531a() {
        }

        @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g.AbstractC0537a
        /* renamed from: a */
        public void mo38896a(AbstractCallableC0536g abstractCallableC0536g, Exception exc) {
            System.out.println(exc);
        }
    }

    public C0529c(InetAddress inetAddress, int i, long j, long j2) {
        this(inetAddress, i, new C0717p(j, j2));
    }

    public C0529c(InetAddress inetAddress, int i, AbstractC0710i abstractC0710i) {
        this.f830a = inetAddress;
        this.f831b = i;
        this.f832c = abstractC0710i;
    }

    /* renamed from: b */
    private Socket m38957b() {
        try {
            return this.f834e.createSocket(this.f830a, this.f831b);
        } catch (IOException e) {
            this.f833d.mo38896a(this, e);
            return null;
        }
    }

    /* renamed from: c */
    private void m38956c() {
        if (this.f833d == null) {
            this.f833d = new C0531a();
        }
        if (this.f834e == null) {
            this.f834e = SocketFactory.getDefault();
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Socket call() {
        m38956c();
        Socket m38957b = m38957b();
        while (m38957b == null && !Thread.currentThread().isInterrupted()) {
            Thread.sleep(this.f832c.mo38403a());
            m38957b = m38957b();
        }
        return m38957b;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g
    /* renamed from: a */
    public void mo38901a(AbstractCallableC0536g.AbstractC0537a abstractC0537a) {
        this.f833d = abstractC0537a;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g
    /* renamed from: a */
    public void mo38900a(SocketFactory socketFactory) {
        this.f834e = socketFactory;
    }
}
