package p005b.p006a.p007a.p029b.p042h.p044b;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: b.a.a.b.h.b.b */
/* loaded from: classes.dex */
public class C0515b extends SocketFactory {

    /* renamed from: a */
    private final C0526m f794a;

    /* renamed from: b */
    private final SSLSocketFactory f795b;

    public C0515b(C0526m c0526m, SSLSocketFactory sSLSocketFactory) {
        this.f794a = c0526m;
        this.f795b = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        SSLSocket sSLSocket = (SSLSocket) this.f795b.createSocket(str, i);
        this.f794a.m38983a(new C0522i(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        SSLSocket sSLSocket = (SSLSocket) this.f795b.createSocket(str, i, inetAddress, i2);
        this.f794a.m38983a(new C0522i(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        SSLSocket sSLSocket = (SSLSocket) this.f795b.createSocket(inetAddress, i);
        this.f794a.m38983a(new C0522i(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        SSLSocket sSLSocket = (SSLSocket) this.f795b.createSocket(inetAddress, i, inetAddress2, i2);
        this.f794a.m38983a(new C0522i(sSLSocket));
        return sSLSocket;
    }
}
