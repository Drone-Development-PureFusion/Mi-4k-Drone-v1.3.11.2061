package com.google.android.gms.internal;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: com.google.android.gms.internal.ls */
/* loaded from: classes2.dex */
public class C7365ls {

    /* renamed from: a */
    private static final AtomicInteger f24559a = new AtomicInteger(0);

    /* renamed from: b */
    private static final Charset f24560b = Charset.forName("UTF-8");

    /* renamed from: l */
    private static ThreadFactory f24561l = Executors.defaultThreadFactory();

    /* renamed from: m */
    private static AbstractC7364lr f24562m = new AbstractC7364lr() { // from class: com.google.android.gms.internal.ls.1
        @Override // com.google.android.gms.internal.AbstractC7364lr
        /* renamed from: a */
        public void mo14672a(Thread thread, String str) {
            thread.setName(str);
        }
    };

    /* renamed from: f */
    private final URI f24566f;

    /* renamed from: i */
    private final C7372lv f24569i;

    /* renamed from: c */
    private volatile EnumC7369a f24563c = EnumC7369a.NONE;

    /* renamed from: d */
    private volatile Socket f24564d = null;

    /* renamed from: e */
    private AbstractC7370lt f24565e = null;

    /* renamed from: j */
    private final int f24570j = f24559a.incrementAndGet();

    /* renamed from: k */
    private final Thread f24571k = m14691a().newThread(new Runnable() { // from class: com.google.android.gms.internal.ls.2
        @Override // java.lang.Runnable
        public void run() {
            C7365ls.this.m14673l();
        }
    });

    /* renamed from: g */
    private final C7374lx f24567g = new C7374lx(this);

    /* renamed from: h */
    private final C7375ly f24568h = new C7375ly(this, "TubeSock", this.f24570j);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ls$a */
    /* loaded from: classes2.dex */
    public enum EnumC7369a {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public C7365ls(URI uri, String str, Map<String, String> map) {
        this.f24566f = uri;
        this.f24569i = new C7372lv(uri, str, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadFactory m14691a() {
        return f24561l;
    }

    /* renamed from: a */
    private synchronized void m14690a(byte b, byte[] bArr) {
        if (this.f24563c != EnumC7369a.CONNECTED) {
            this.f24565e.mo14671a(new C7371lu("error while sending data: not connected"));
        } else {
            try {
                this.f24568h.m14651a(b, true, bArr);
            } catch (IOException e) {
                this.f24565e.mo14671a(new C7371lu("Failed to send frame", e));
                m14680e();
            }
        }
    }

    /* renamed from: a */
    public static void m14685a(ThreadFactory threadFactory, AbstractC7364lr abstractC7364lr) {
        f24561l = threadFactory;
        f24562m = abstractC7364lr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC7364lr m14683b() {
        return f24562m;
    }

    /* renamed from: i */
    private synchronized void m14676i() {
        if (this.f24563c != EnumC7369a.DISCONNECTED) {
            this.f24567g.m14653b();
            this.f24568h.m14652a();
            if (this.f24564d != null) {
                try {
                    this.f24564d.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f24563c = EnumC7369a.DISCONNECTED;
            this.f24565e.mo14668d();
        }
    }

    /* renamed from: j */
    private void m14675j() {
        try {
            this.f24563c = EnumC7369a.DISCONNECTING;
            this.f24568h.m14652a();
            this.f24568h.m14651a((byte) 8, true, new byte[0]);
        } catch (IOException e) {
            this.f24565e.mo14671a(new C7371lu("Failed to send close frame", e));
        }
    }

    /* renamed from: k */
    private Socket m14674k() {
        String scheme = this.f24566f.getScheme();
        String host = this.f24566f.getHost();
        int port = this.f24566f.getPort();
        if (scheme != null && scheme.equals("ws")) {
            try {
                return new Socket(host, port == -1 ? 80 : port);
            } catch (UnknownHostException e) {
                String valueOf = String.valueOf(host);
                throw new C7371lu(valueOf.length() != 0 ? "unknown host: ".concat(valueOf) : new String("unknown host: "), e);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(this.f24566f);
                throw new C7371lu(new StringBuilder(String.valueOf(valueOf2).length() + 31).append("error while creating socket to ").append(valueOf2).toString(), e2);
            }
        } else if (scheme == null || !scheme.equals("wss")) {
            String valueOf3 = String.valueOf(scheme);
            throw new C7371lu(valueOf3.length() != 0 ? "unsupported protocol: ".concat(valueOf3) : new String("unsupported protocol: "));
        } else {
            if (port == -1) {
                port = 443;
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                String valueOf4 = String.valueOf(this.f24566f);
                throw new C7371lu(new StringBuilder(String.valueOf(valueOf4).length() + 39).append("Error while verifying secure socket to ").append(valueOf4).toString());
            } catch (UnknownHostException e3) {
                String valueOf5 = String.valueOf(host);
                throw new C7371lu(valueOf5.length() != 0 ? "unknown host: ".concat(valueOf5) : new String("unknown host: "), e3);
            } catch (IOException e4) {
                String valueOf6 = String.valueOf(this.f24566f);
                throw new C7371lu(new StringBuilder(String.valueOf(valueOf6).length() + 38).append("error while creating secure socket to ").append(valueOf6).toString(), e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m14673l() {
        boolean z;
        try {
            Socket m14674k = m14674k();
            synchronized (this) {
                this.f24564d = m14674k;
                if (this.f24563c == EnumC7369a.DISCONNECTED) {
                    try {
                        this.f24564d.close();
                        this.f24564d = null;
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                DataInputStream dataInputStream = new DataInputStream(m14674k.getInputStream());
                OutputStream outputStream = m14674k.getOutputStream();
                outputStream.write(this.f24569i.m14667a());
                byte[] bArr = new byte[1000];
                ArrayList arrayList = new ArrayList();
                int i = 0;
                boolean z2 = false;
                while (!z2) {
                    int read = dataInputStream.read();
                    if (read == -1) {
                        throw new C7371lu("Connection closed before handshake was complete");
                    }
                    bArr[i] = (byte) read;
                    i++;
                    if (bArr[i - 1] == 10 && bArr[i - 2] == 13) {
                        String str = new String(bArr, f24560b);
                        if (str.trim().equals("")) {
                            z = true;
                        } else {
                            arrayList.add(str.trim());
                            z = z2;
                        }
                        z2 = z;
                        bArr = new byte[1000];
                        i = 0;
                    } else if (i == 1000) {
                        String valueOf = String.valueOf(new String(bArr, f24560b));
                        throw new C7371lu(valueOf.length() != 0 ? "Unexpected long line in handshake: ".concat(valueOf) : new String("Unexpected long line in handshake: "));
                    }
                }
                this.f24569i.m14665a((String) arrayList.get(0));
                arrayList.remove(0);
                HashMap<String, String> hashMap = new HashMap<>();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String[] split = ((String) it2.next()).split(": ", 2);
                    hashMap.put(split[0], split[1]);
                }
                this.f24569i.m14664a(hashMap);
                this.f24568h.m14648a(outputStream);
                this.f24567g.m14658a(dataInputStream);
                this.f24563c = EnumC7369a.CONNECTED;
                this.f24568h.m14647b().start();
                this.f24565e.mo14669c();
                this.f24567g.m14660a();
            }
        } catch (IOException e2) {
            AbstractC7370lt abstractC7370lt = this.f24565e;
            String valueOf2 = String.valueOf(e2.getMessage());
            abstractC7370lt.mo14671a(new C7371lu(valueOf2.length() != 0 ? "error while connecting: ".concat(valueOf2) : new String("error while connecting: "), e2));
        } catch (C7371lu e3) {
            this.f24565e.mo14671a(e3);
        } finally {
            m14680e();
        }
    }

    /* renamed from: a */
    public void m14688a(AbstractC7370lt abstractC7370lt) {
        this.f24565e = abstractC7370lt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14687a(C7371lu c7371lu) {
        this.f24565e.mo14671a(c7371lu);
        if (this.f24563c == EnumC7369a.CONNECTED) {
            m14680e();
        }
        m14676i();
    }

    /* renamed from: a */
    public synchronized void m14686a(String str) {
        m14690a((byte) 1, str.getBytes(f24560b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m14684a(byte[] bArr) {
        m14690a((byte) 10, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC7370lt m14682c() {
        return this.f24565e;
    }

    /* renamed from: d */
    public synchronized void m14681d() {
        if (this.f24563c != EnumC7369a.NONE) {
            this.f24565e.mo14671a(new C7371lu("connect() already called"));
            m14680e();
        } else {
            AbstractC7364lr m14683b = m14683b();
            Thread m14677h = m14677h();
            String valueOf = String.valueOf("TubeSockReader-");
            m14683b.mo14672a(m14677h, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f24570j).toString());
            this.f24563c = EnumC7369a.CONNECTING;
            m14677h().start();
        }
    }

    /* renamed from: e */
    public synchronized void m14680e() {
        switch (this.f24563c) {
            case NONE:
                this.f24563c = EnumC7369a.DISCONNECTED;
                break;
            case CONNECTING:
                m14676i();
                break;
            case CONNECTED:
                m14675j();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m14679f() {
        m14676i();
    }

    /* renamed from: g */
    public void m14678g() {
        if (this.f24568h.m14647b().getState() != Thread.State.NEW) {
            this.f24568h.m14647b().join();
        }
        m14677h().join();
    }

    /* renamed from: h */
    Thread m14677h() {
        return this.f24571k;
    }
}
