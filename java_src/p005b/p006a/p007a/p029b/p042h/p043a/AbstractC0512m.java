package p005b.p006a.p007a.p029b.p042h.p043a;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0498b;
import p005b.p006a.p007a.p029b.p058r.C0706e;
/* renamed from: b.a.a.b.h.a.m */
/* loaded from: classes.dex */
public abstract class AbstractC0512m<T extends AbstractRunnableC0498b> implements AbstractC0508j<T> {

    /* renamed from: a */
    private final ServerSocket f774a;

    public AbstractC0512m(ServerSocket serverSocket) {
        this.f774a = serverSocket;
    }

    /* renamed from: a */
    private String m39053a(SocketAddress socketAddress) {
        String obj = socketAddress.toString();
        int indexOf = obj.indexOf("/");
        return indexOf >= 0 ? obj.substring(indexOf + 1) : obj;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0508j
    /* renamed from: a */
    public T mo39054a() {
        Socket accept = this.f774a.accept();
        return mo39052b(m39053a(accept.getRemoteSocketAddress()), accept);
    }

    /* renamed from: b */
    protected abstract T mo39052b(String str, Socket socket);

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0508j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0706e.m38434a(this.f774a);
    }

    public String toString() {
        return m39053a(this.f774a.getLocalSocketAddress());
    }
}
