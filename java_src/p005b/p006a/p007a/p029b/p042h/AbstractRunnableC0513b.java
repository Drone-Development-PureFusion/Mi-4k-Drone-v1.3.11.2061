package p005b.p006a.p007a.p029b.p042h;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import p005b.p006a.p007a.p029b.AbstractC0404b;
import p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g;
import p005b.p006a.p007a.p029b.p055o.AbstractC0671o;
import p005b.p006a.p007a.p029b.p058r.C0706e;
import p005b.p006a.p007a.p029b.p058r.C0711j;
/* renamed from: b.a.a.b.h.b */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0513b<E> extends AbstractC0404b<E> implements AbstractCallableC0536g.AbstractC0537a, Runnable {

    /* renamed from: a */
    public static final int f775a = 4560;

    /* renamed from: b */
    public static final int f776b = 30000;

    /* renamed from: c */
    public static final int f777c = 128;

    /* renamed from: d */
    private static final int f778d = 5000;

    /* renamed from: e */
    private static final int f779e = 100;

    /* renamed from: i */
    private String f780i;

    /* renamed from: j */
    private int f781j;

    /* renamed from: k */
    private InetAddress f782k;

    /* renamed from: l */
    private C0711j f783l;

    /* renamed from: m */
    private int f784m;

    /* renamed from: n */
    private int f785n;

    /* renamed from: o */
    private C0711j f786o;

    /* renamed from: p */
    private BlockingQueue<E> f787p;

    /* renamed from: q */
    private String f788q;

    /* renamed from: r */
    private Future<?> f789r;

    /* renamed from: u */
    private Future<Socket> f790u;

    /* renamed from: v */
    private volatile Socket f791v;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractRunnableC0513b() {
        this.f781j = f775a;
        this.f783l = new C0711j(NotificationOptions.f16268b);
        this.f784m = 128;
        this.f785n = 5000;
        this.f786o = new C0711j(100L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractRunnableC0513b(String str, int i) {
        this.f781j = f775a;
        this.f783l = new C0711j(NotificationOptions.f16268b);
        this.f784m = 128;
        this.f785n = 5000;
        this.f786o = new C0711j(100L);
        this.f780i = str;
        this.f781j = i;
    }

    /* renamed from: a */
    private AbstractCallableC0536g m39046a(InetAddress inetAddress, int i, int i2, long j) {
        AbstractCallableC0536g m39045a = m39045a(inetAddress, i, i2, j);
        m39045a.mo38901a(this);
        m39045a.mo38900a(mo38905b());
        return m39045a;
    }

    @Deprecated
    /* renamed from: a */
    protected static InetAddress m39047a(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    private Future<Socket> m39049a(AbstractCallableC0536g abstractCallableC0536g) {
        try {
            return c_().mo39311s().submit(abstractCallableC0536g);
        } catch (RejectedExecutionException e) {
            return null;
        }
    }

    /* renamed from: p */
    private Socket m39032p() {
        try {
            Socket socket = this.f790u.get();
            this.f790u = null;
            return socket;
        } catch (ExecutionException e) {
            return null;
        }
    }

    /* renamed from: q */
    private void m39031q() {
        try {
            try {
                this.f791v.setSoTimeout(this.f785n);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(this.f791v.getOutputStream());
                this.f791v.setSoTimeout(0);
                d(this.f788q + "connection established");
                int i = 0;
                while (true) {
                    E take = this.f787p.take();
                    mo39042b((AbstractRunnableC0513b<E>) take);
                    objectOutputStream.writeObject(mo39051a().mo38530a(take));
                    objectOutputStream.flush();
                    i++;
                    if (i >= 70) {
                        objectOutputStream.reset();
                        i = 0;
                    }
                }
            } catch (IOException e) {
                d(this.f788q + "connection failed: " + e);
                C0706e.m38433a(this.f791v);
                this.f791v = null;
                d(this.f788q + "connection closed");
            }
        } catch (Throwable th) {
            C0706e.m38433a(this.f791v);
            this.f791v = null;
            d(this.f788q + "connection closed");
            throw th;
        }
    }

    /* renamed from: a */
    protected AbstractCallableC0536g m39045a(InetAddress inetAddress, int i, long j, long j2) {
        return new C0529c(inetAddress, i, j, j2);
    }

    /* renamed from: a */
    protected abstract AbstractC0671o<E> mo39051a();

    /* renamed from: a */
    BlockingQueue<E> m39050a(int i) {
        return i <= 0 ? new SynchronousQueue<>() : new ArrayBlockingQueue<>(i);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractCallableC0536g.AbstractC0537a
    /* renamed from: a */
    public void mo38896a(AbstractCallableC0536g abstractCallableC0536g, Exception exc) {
        if (exc instanceof InterruptedException) {
            d("connector interrupted");
        } else if (exc instanceof ConnectException) {
            d(this.f788q + "connection refused");
        } else {
            d(this.f788q + exc);
        }
    }

    /* renamed from: a */
    public void m39048a(C0711j c0711j) {
        this.f783l = c0711j;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a */
    protected void mo38607a(E e) {
        if (e == null || !b_()) {
            return;
        }
        try {
            if (this.f787p.offer(e, this.f786o.m38423b(), TimeUnit.MILLISECONDS)) {
                return;
            }
            d("Dropping event due to timeout limit of [" + this.f786o + "] milliseconds being exceeded");
        } catch (InterruptedException e2) {
            a("Interrupted while appending event to SocketAppender", e2);
        }
    }

    /* renamed from: b */
    protected SocketFactory mo38905b() {
        return SocketFactory.getDefault();
    }

    /* renamed from: b */
    public void m39044b(int i) {
        this.f781j = i;
    }

    /* renamed from: b */
    public void m39043b(C0711j c0711j) {
        this.f786o = c0711j;
    }

    /* renamed from: b */
    protected abstract void mo39042b(E e);

    /* renamed from: b */
    public void m39041b(String str) {
        this.f780i = str;
    }

    /* renamed from: c */
    public void m39040c(int i) {
        this.f784m = i;
    }

    /* renamed from: d */
    protected void m39039d() {
    }

    /* renamed from: d */
    void m39038d(int i) {
        this.f785n = i;
    }

    /* renamed from: e */
    public String m39037e() {
        return this.f780i;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (b_()) {
            return;
        }
        int i = 0;
        if (this.f781j <= 0) {
            i = 1;
            c("No port was configured for appender" + this.f485g + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
        }
        if (this.f780i == null) {
            i++;
            c("No remote host was configured for appender" + this.f485g + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
        }
        if (this.f784m < 0) {
            i++;
            c("Queue size must be non-negative");
        }
        if (i == 0) {
            try {
                this.f782k = InetAddress.getByName(this.f780i);
            } catch (UnknownHostException e) {
                c("unknown host: " + this.f780i);
                i++;
            }
        }
        if (i != 0) {
            return;
        }
        this.f787p = m39050a(this.f784m);
        this.f788q = "remote peer " + this.f780i + ":" + this.f781j + ": ";
        this.f789r = c_().mo39311s().submit(this);
        super.mo38474j();
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        if (!b_()) {
            return;
        }
        C0706e.m38433a(this.f791v);
        this.f789r.cancel(true);
        if (this.f790u != null) {
            this.f790u.cancel(true);
        }
        super.mo38473k();
    }

    /* renamed from: l */
    public int m39036l() {
        return this.f781j;
    }

    /* renamed from: m */
    public C0711j m39035m() {
        return this.f783l;
    }

    /* renamed from: n */
    public int m39034n() {
        return this.f784m;
    }

    /* renamed from: o */
    public C0711j m39033o() {
        return this.f786o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m39039d();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                this.f790u = m39049a(m39046a(this.f782k, this.f781j, 0, this.f783l.m38423b()));
                if (this.f790u != null) {
                    this.f791v = m39032p();
                    if (this.f791v == null) {
                        break;
                    }
                    m39031q();
                } else {
                    break;
                }
            } catch (InterruptedException e) {
            }
        }
        d("shutting down");
    }
}
