package p005b.p006a.p007a.p008a.p020j;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g;
import p005b.p006a.p007a.p029b.p042h.C0529c;
import p005b.p006a.p007a.p029b.p058r.C0706e;
/* renamed from: b.a.a.a.j.j */
/* loaded from: classes.dex */
public class RunnableC0323j extends AbstractC0315b implements AbstractCallableC0536g.AbstractC0537a, Runnable {

    /* renamed from: a */
    private static final int f314a = 5000;

    /* renamed from: b */
    private String f315b;

    /* renamed from: c */
    private InetAddress f316c;

    /* renamed from: d */
    private int f317d;

    /* renamed from: e */
    private int f318e;

    /* renamed from: f */
    private int f319f = 5000;

    /* renamed from: g */
    private String f320g;

    /* renamed from: h */
    private volatile Socket f321h;

    /* renamed from: i */
    private Future<Socket> f322i;

    /* renamed from: a */
    private Future<Socket> m39652a(AbstractCallableC0536g abstractCallableC0536g) {
        try {
            return c_().mo39311s().submit(abstractCallableC0536g);
        } catch (RejectedExecutionException e) {
            return null;
        }
    }

    /* renamed from: a */
    private void m39653a(C0286f c0286f) {
        try {
            try {
                try {
                    try {
                        this.f321h.setSoTimeout(this.f319f);
                        ObjectInputStream objectInputStream = new ObjectInputStream(this.f321h.getInputStream());
                        this.f321h.setSoTimeout(0);
                        d(this.f320g + "connection established");
                        while (true) {
                            AbstractC0366d abstractC0366d = (AbstractC0366d) objectInputStream.readObject();
                            C0283e mo126e = c0286f.mo126e(abstractC0366d.mo39534f());
                            if (mo126e.m39783b(abstractC0366d.mo39538b())) {
                                mo126e.m39791a(abstractC0366d);
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        d(this.f320g + "unknown event class: " + e);
                        C0706e.m38433a(this.f321h);
                        this.f321h = null;
                        d(this.f320g + "connection closed");
                    }
                } catch (IOException e2) {
                    d(this.f320g + "connection failed: " + e2);
                    C0706e.m38433a(this.f321h);
                    this.f321h = null;
                    d(this.f320g + "connection closed");
                }
            } catch (EOFException e3) {
                d(this.f320g + "end-of-stream detected");
                C0706e.m38433a(this.f321h);
                this.f321h = null;
                d(this.f320g + "connection closed");
            }
        } catch (Throwable th) {
            C0706e.m38433a(this.f321h);
            this.f321h = null;
            d(this.f320g + "connection closed");
            throw th;
        }
    }

    /* renamed from: b */
    private AbstractCallableC0536g m39647b(InetAddress inetAddress, int i, int i2, int i3) {
        AbstractCallableC0536g m39650a = m39650a(inetAddress, i, i2, i3);
        m39650a.mo38901a(this);
        m39650a.mo38900a(mo39644e());
        return m39650a;
    }

    /* renamed from: f */
    private Socket m39643f() {
        try {
            Socket socket = this.f322i.get();
            this.f322i = null;
            return socket;
        } catch (ExecutionException e) {
            return null;
        }
    }

    /* renamed from: a */
    protected AbstractCallableC0536g m39650a(InetAddress inetAddress, int i, int i2, int i3) {
        return new C0529c(inetAddress, i, i2, i3);
    }

    /* renamed from: a */
    public void m39654a(int i) {
        this.f317d = i;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g.AbstractC0537a
    /* renamed from: a */
    public void mo38896a(AbstractCallableC0536g abstractCallableC0536g, Exception exc) {
        if (exc instanceof InterruptedException) {
            d("connector interrupted");
        } else if (exc instanceof ConnectException) {
            d(this.f320g + "connection refused");
        } else {
            d(this.f320g + exc);
        }
    }

    /* renamed from: a */
    public void m39651a(String str) {
        this.f315b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p008a.p020j.AbstractC0315b
    /* renamed from: a */
    public boolean mo39655a() {
        int i;
        if (this.f317d == 0) {
            c("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
            i = 1;
        } else {
            i = 0;
        }
        if (this.f315b == null) {
            i++;
            c("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
        }
        if (this.f318e == 0) {
            this.f318e = 30000;
        }
        if (i == 0) {
            try {
                this.f316c = InetAddress.getByName(this.f315b);
            } catch (UnknownHostException e) {
                c("unknown host: " + this.f315b);
                i++;
            }
        }
        if (i == 0) {
            this.f320g = "receiver " + this.f315b + ":" + this.f317d + ": ";
        }
        return i == 0;
    }

    @Override // p005b.p006a.p007a.p008a.p020j.AbstractC0315b
    /* renamed from: b */
    protected void mo39649b() {
        if (this.f321h != null) {
            C0706e.m38433a(this.f321h);
        }
    }

    /* renamed from: b */
    public void m39648b(int i) {
        this.f318e = i;
    }

    /* renamed from: c */
    public void m39646c(int i) {
        this.f319f = i;
    }

    @Override // p005b.p006a.p007a.p008a.p020j.AbstractC0315b
    /* renamed from: d */
    protected Runnable mo39645d() {
        return this;
    }

    /* renamed from: e */
    protected SocketFactory mo39644e() {
        return SocketFactory.getDefault();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0286f c0286f = (C0286f) c_();
            while (!Thread.currentThread().isInterrupted()) {
                this.f322i = m39652a(m39647b(this.f316c, this.f317d, 0, this.f318e));
                if (this.f322i != null) {
                    this.f321h = m39643f();
                    if (this.f321h == null) {
                        break;
                    }
                    m39653a(c0286f);
                } else {
                    break;
                }
            }
        } catch (InterruptedException e) {
        }
        d("shutting down");
    }
}
