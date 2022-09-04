package p005b.p006a.p007a.p008a.p020j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.net.ServerSocketFactory;
import org.p356d.AbstractC11747c;
import org.p356d.C11751d;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p016g.C0292a;
/* renamed from: b.a.a.a.j.g */
/* loaded from: classes.dex */
public class C0320g extends Thread {

    /* renamed from: b */
    private final int f299b;

    /* renamed from: c */
    private final C0286f f300c;

    /* renamed from: e */
    private ServerSocket f302e;

    /* renamed from: g */
    private CountDownLatch f304g;

    /* renamed from: a */
    AbstractC11747c f298a = C11751d.m50a(C0320g.class);

    /* renamed from: d */
    private boolean f301d = false;

    /* renamed from: f */
    private List<RunnableC0322i> f303f = new ArrayList();

    public C0320g(C0286f c0286f, int i) {
        this.f300c = c0286f;
        this.f299b = i;
    }

    /* renamed from: a */
    public static void m39671a(C0286f c0286f, String str) {
        C0292a c0292a = new C0292a();
        c0286f.mo39317f();
        c0292a.a(c0286f);
        c0292a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m39669a(Class<? extends C0320g> cls, String[] strArr) {
        int i;
        if (strArr.length == 2) {
            i = m39664b(strArr[0]);
        } else {
            m39668a("Wrong number of arguments.");
            i = -1;
        }
        String str = strArr[1];
        C0286f c0286f = (C0286f) C11751d.m40c();
        m39671a(c0286f, str);
        new C0320g(c0286f, i).start();
    }

    /* renamed from: a */
    static void m39668a(String str) {
        System.err.println(str);
        System.err.println("Usage: java " + C0320g.class.getName() + " port configFile");
        System.exit(1);
    }

    /* renamed from: b */
    static int m39664b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            m39668a("Could not interpret port number [" + str + "].");
            return -1;
        }
    }

    /* renamed from: b */
    public static void m39663b(String[] strArr) {
        m39669a(C0320g.class, strArr);
    }

    /* renamed from: a */
    protected String m39667a(Socket socket) {
        return String.format("Logback SocketNode (client: %s)", socket.getRemoteSocketAddress());
    }

    /* renamed from: a */
    protected ServerSocketFactory mo39672a() {
        return ServerSocketFactory.getDefault();
    }

    /* renamed from: a */
    public void m39670a(RunnableC0322i runnableC0322i) {
        this.f298a.mo108b("Removing {}", runnableC0322i);
        synchronized (this.f303f) {
            this.f303f.remove(runnableC0322i);
        }
    }

    /* renamed from: a */
    void m39666a(CountDownLatch countDownLatch) {
        this.f304g = countDownLatch;
    }

    /* renamed from: b */
    protected String m39665b() {
        return String.format("Logback %s (port %d)", getClass().getSimpleName(), Integer.valueOf(this.f299b));
    }

    /* renamed from: c */
    void m39662c() {
        if (this.f304g == null || this.f304g.getCount() == 0) {
            return;
        }
        this.f304g.countDown();
    }

    /* renamed from: d */
    public CountDownLatch m39661d() {
        return this.f304g;
    }

    /* renamed from: e */
    public boolean m39660e() {
        return this.f301d;
    }

    /* renamed from: f */
    public void m39659f() {
        this.f301d = true;
        if (this.f302e != null) {
            try {
                this.f302e.close();
            } catch (IOException e) {
                this.f298a.mo96c("Failed to close serverSocket", (Throwable) e);
            } finally {
                this.f302e = null;
            }
        }
        this.f298a.mo62i("closing this server");
        synchronized (this.f303f) {
            for (RunnableC0322i runnableC0322i : this.f303f) {
                runnableC0322i.m39656a();
            }
        }
        if (this.f303f.size() != 0) {
            this.f298a.mo60j("Was expecting a 0-sized socketNodeList after server shutdown");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            Thread.currentThread().setName(m39665b());
            this.f298a.mo62i("Listening on port " + this.f299b);
            this.f302e = mo39672a().createServerSocket(this.f299b);
            while (!this.f301d) {
                this.f298a.mo62i("Waiting to accept a new client.");
                m39662c();
                Socket accept = this.f302e.accept();
                this.f298a.mo62i("Connected to client at " + accept.getInetAddress());
                this.f298a.mo62i("Starting new socket node.");
                RunnableC0322i runnableC0322i = new RunnableC0322i(this, accept, this.f300c);
                synchronized (this.f303f) {
                    this.f303f.add(runnableC0322i);
                }
                new Thread(runnableC0322i, m39667a(accept)).start();
            }
        } catch (Exception e) {
            if (this.f301d) {
                this.f298a.mo62i("Exception in run method for a closed server. This is normal.");
            } else {
                this.f298a.mo96c("Unexpected failure in run method", (Throwable) e);
            }
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
