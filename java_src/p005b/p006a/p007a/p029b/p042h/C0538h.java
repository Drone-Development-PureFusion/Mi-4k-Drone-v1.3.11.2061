package p005b.p006a.p007a.p029b.p042h;

import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;
import p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g;
/* renamed from: b.a.a.b.h.h */
/* loaded from: classes.dex */
public class C0538h implements AbstractCallableC0536g {

    /* renamed from: a */
    private final Lock f865a;

    /* renamed from: b */
    private final Condition f866b;

    /* renamed from: c */
    private final InetAddress f867c;

    /* renamed from: d */
    private final int f868d;

    /* renamed from: e */
    private AbstractCallableC0536g.AbstractC0537a f869e;

    /* renamed from: f */
    private SocketFactory f870f;

    /* renamed from: g */
    private AbstractC0541b f871g;

    /* renamed from: h */
    private Socket f872h;

    /* renamed from: b.a.a.b.h.h$a */
    /* loaded from: classes.dex */
    private static class C0540a implements AbstractCallableC0536g.AbstractC0537a {
        private C0540a() {
        }

        @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g.AbstractC0537a
        /* renamed from: a */
        public void mo38896a(AbstractCallableC0536g abstractCallableC0536g, Exception exc) {
            System.out.println(exc);
        }
    }

    /* renamed from: b.a.a.b.h.h$b */
    /* loaded from: classes.dex */
    public interface AbstractC0541b {
        /* renamed from: a */
        int mo38895a();
    }

    /* renamed from: b.a.a.b.h.h$c */
    /* loaded from: classes.dex */
    private static class C0542c implements AbstractC0541b {

        /* renamed from: a */
        private final int f873a;

        /* renamed from: b */
        private int f874b;

        public C0542c(int i, int i2) {
            this.f874b = i;
            this.f873a = i2;
        }

        @Override // p005b.p006a.p007a.p029b.p042h.C0538h.AbstractC0541b
        /* renamed from: a */
        public int mo38895a() {
            int i = this.f874b;
            this.f874b = this.f873a;
            return i;
        }
    }

    public C0538h(InetAddress inetAddress, int i, int i2, int i3) {
        this(inetAddress, i, new C0542c(i2, i3));
    }

    public C0538h(InetAddress inetAddress, int i, AbstractC0541b abstractC0541b) {
        this.f865a = new ReentrantLock();
        this.f866b = this.f865a.newCondition();
        this.f867c = inetAddress;
        this.f868d = i;
        this.f871g = abstractC0541b;
    }

    /* renamed from: d */
    private void m38897d() {
        this.f865a.lock();
        try {
            this.f866b.signalAll();
        } finally {
            this.f865a.unlock();
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Socket call() {
        return null;
    }

    /* renamed from: a */
    public Socket m38902a(long j) {
        this.f865a.lock();
        boolean z = false;
        while (this.f872h == null && !z) {
            try {
                z = !this.f866b.await(j, TimeUnit.MILLISECONDS);
            } finally {
                this.f865a.unlock();
            }
        }
        return this.f872h;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g
    /* renamed from: a */
    public void mo38901a(AbstractCallableC0536g.AbstractC0537a abstractC0537a) {
        this.f869e = abstractC0537a;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g
    /* renamed from: a */
    public void mo38900a(SocketFactory socketFactory) {
        this.f870f = socketFactory;
    }

    /* renamed from: b */
    public void m38899b() {
        if (this.f872h != null) {
            throw new IllegalStateException("connector cannot be reused");
        }
        if (this.f869e == null) {
            this.f869e = new C0540a();
        }
        if (this.f870f == null) {
            this.f870f = SocketFactory.getDefault();
        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(this.f871g.mo38895a());
                try {
                    this.f872h = this.f870f.createSocket(this.f867c, this.f868d);
                    m38897d();
                    return;
                } catch (Exception e) {
                    this.f869e.mo38896a(this, e);
                }
            } catch (InterruptedException e2) {
                this.f869e.mo38896a(this, e2);
                return;
            }
        }
    }

    /* renamed from: c */
    public Socket m38898c() {
        return m38902a(Long.MAX_VALUE);
    }
}
