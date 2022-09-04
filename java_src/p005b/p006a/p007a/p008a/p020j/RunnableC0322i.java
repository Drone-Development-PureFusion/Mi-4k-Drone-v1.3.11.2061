package p005b.p006a.p007a.p008a.p020j;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
/* renamed from: b.a.a.a.j.i */
/* loaded from: classes.dex */
public class RunnableC0322i implements Runnable {

    /* renamed from: a */
    Socket f307a;

    /* renamed from: b */
    C0286f f308b;

    /* renamed from: c */
    ObjectInputStream f309c;

    /* renamed from: d */
    SocketAddress f310d;

    /* renamed from: e */
    C0283e f311e;

    /* renamed from: f */
    boolean f312f = false;

    /* renamed from: g */
    C0320g f313g;

    public RunnableC0322i(C0320g c0320g, Socket socket, C0286f c0286f) {
        this.f313g = c0320g;
        this.f307a = socket;
        this.f310d = socket.getRemoteSocketAddress();
        this.f308b = c0286f;
        this.f311e = c0286f.m39759a(RunnableC0322i.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39656a() {
        if (this.f312f) {
            return;
        }
        this.f312f = true;
        try {
        } catch (IOException e) {
            this.f311e.mo75e("Could not close connection.", (Throwable) e);
        } finally {
            this.f309c = null;
        }
        if (this.f309c == null) {
            return;
        }
        this.f309c.close();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f309c = new ObjectInputStream(new BufferedInputStream(this.f307a.getInputStream()));
        } catch (Exception e) {
            this.f311e.mo96c("Could not open ObjectInputStream to " + this.f307a, (Throwable) e);
            this.f312f = true;
        }
        while (!this.f312f) {
            try {
                AbstractC0366d abstractC0366d = (AbstractC0366d) this.f309c.readObject();
                C0283e mo126e = this.f308b.mo126e(abstractC0366d.mo39534f());
                if (mo126e.m39783b(abstractC0366d.mo39538b())) {
                    mo126e.m39791a(abstractC0366d);
                }
            } catch (EOFException e2) {
                this.f311e.mo62i("Caught java.io.EOFException closing connection.");
            } catch (SocketException e3) {
                this.f311e.mo62i("Caught java.net.SocketException closing connection.");
            } catch (IOException e4) {
                this.f311e.mo62i("Caught java.io.IOException: " + e4);
                this.f311e.mo62i("Closing connection.");
            } catch (Exception e5) {
                this.f311e.mo96c("Unexpected exception. Closing connection.", (Throwable) e5);
            }
        }
        this.f313g.m39670a(this);
        m39656a();
    }

    public String toString() {
        return getClass().getName() + this.f310d.toString();
    }
}
