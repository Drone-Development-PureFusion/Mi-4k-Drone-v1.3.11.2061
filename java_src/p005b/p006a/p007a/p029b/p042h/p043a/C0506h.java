package p005b.p006a.p007a.p029b.p042h.p043a;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p058r.C0706e;
/* renamed from: b.a.a.b.h.a.h */
/* loaded from: classes.dex */
class C0506h extends C0662f implements AbstractC0503e {

    /* renamed from: a */
    private final String f759a;

    /* renamed from: b */
    private final Socket f760b;

    /* renamed from: c */
    private final OutputStream f761c;

    /* renamed from: d */
    private BlockingQueue<Serializable> f762d;

    C0506h(String str, OutputStream outputStream) {
        this.f759a = "client " + str + ": ";
        this.f760b = null;
        this.f761c = outputStream;
    }

    public C0506h(String str, Socket socket) {
        this.f759a = "client " + str + ": ";
        this.f760b = socket;
        this.f761c = null;
    }

    /* renamed from: a */
    private ObjectOutputStream m39077a() {
        return this.f760b == null ? new ObjectOutputStream(this.f761c) : new ObjectOutputStream(this.f760b.getOutputStream());
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0503e
    /* renamed from: a */
    public void mo39075a(BlockingQueue<Serializable> blockingQueue) {
        this.f762d = blockingQueue;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0503e
    /* renamed from: a */
    public boolean mo39076a(Serializable serializable) {
        if (this.f762d == null) {
            throw new IllegalStateException("client has no event queue");
        }
        return this.f762d.offer(serializable);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0498b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f760b == null) {
            return;
        }
        C0706e.m38433a(this.f760b);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ObjectOutputStream objectOutputStream3;
        int i;
        d(this.f759a + "connected");
        try {
            try {
                objectOutputStream3 = m39077a();
                int i2 = 0;
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        try {
                            objectOutputStream3.writeObject(this.f762d.take());
                            objectOutputStream3.flush();
                            int i3 = i2 + 1;
                            if (i3 >= 70) {
                                try {
                                    objectOutputStream3.reset();
                                    i3 = 0;
                                } catch (InterruptedException e) {
                                    i = 0;
                                    Thread.currentThread().interrupt();
                                    i2 = i;
                                }
                            }
                            i2 = i3;
                        } catch (InterruptedException e2) {
                            i = i2;
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        c(this.f759a + e);
                        if (objectOutputStream3 != null) {
                            C0706e.m38435a(objectOutputStream3);
                        }
                        close();
                        d(this.f759a + "connection closed");
                        return;
                    } catch (SocketException e4) {
                        e = e4;
                        objectOutputStream2 = objectOutputStream3;
                        try {
                            d(this.f759a + e);
                            if (objectOutputStream2 != null) {
                                C0706e.m38435a(objectOutputStream2);
                            }
                            close();
                            d(this.f759a + "connection closed");
                            return;
                        } catch (Throwable th) {
                            th = th;
                            objectOutputStream = objectOutputStream2;
                            if (objectOutputStream != null) {
                                C0706e.m38435a(objectOutputStream);
                            }
                            close();
                            d(this.f759a + "connection closed");
                            throw th;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        c(this.f759a + e);
                        if (objectOutputStream3 != null) {
                            C0706e.m38435a(objectOutputStream3);
                        }
                        close();
                        d(this.f759a + "connection closed");
                        return;
                    }
                }
                if (objectOutputStream3 != null) {
                    C0706e.m38435a(objectOutputStream3);
                }
                close();
                d(this.f759a + "connection closed");
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                }
                close();
                d(this.f759a + "connection closed");
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            objectOutputStream3 = null;
        } catch (RuntimeException e7) {
            e = e7;
            objectOutputStream3 = null;
        } catch (SocketException e8) {
            e = e8;
            objectOutputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            if (objectOutputStream != null) {
            }
            close();
            d(this.f759a + "connection closed");
            throw th;
        }
    }
}
