package p005b.p006a.p007a.p029b.p042h.p044b;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
/* renamed from: b.a.a.b.h.b.a */
/* loaded from: classes.dex */
public class C0514a extends ServerSocketFactory {

    /* renamed from: a */
    private final C0526m f792a;

    /* renamed from: b */
    private final SSLServerSocketFactory f793b;

    public C0514a(C0526m c0526m, SSLServerSocketFactory sSLServerSocketFactory) {
        this.f792a = c0526m;
        this.f793b = sSLServerSocketFactory;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.f793b.createServerSocket(i);
        this.f792a.m38983a(new C0521h(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.f793b.createServerSocket(i, i2);
        this.f792a.m38983a(new C0521h(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.f793b.createServerSocket(i, i2, inetAddress);
        this.f792a.m38983a(new C0521h(sSLServerSocket));
        return sSLServerSocket;
    }
}
