package org.p286a.p287a.p299f.p300a;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;
@Deprecated
/* renamed from: org.a.a.f.a.g */
/* loaded from: classes.dex */
class C11104g implements AbstractC11103f {

    /* renamed from: a */
    private final SocketFactory f35768a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11104g(SocketFactory socketFactory) {
        this.f35768a = socketFactory;
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11103f
    /* renamed from: a */
    public Socket mo2021a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        String hostName = inetSocketAddress.getHostName();
        int port = inetSocketAddress.getPort();
        InetAddress inetAddress = null;
        int i = 0;
        if (inetSocketAddress2 != null) {
            inetAddress = inetSocketAddress2.getAddress();
            i = inetSocketAddress2.getPort();
        }
        return this.f35768a.connectSocket(socket, hostName, port, inetAddress, i, httpParams);
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11103f
    /* renamed from: a */
    public Socket mo2020a(HttpParams httpParams) {
        return this.f35768a.createSocket();
    }

    /* renamed from: a */
    public SocketFactory m2023a() {
        return this.f35768a;
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11103f
    /* renamed from: a */
    public boolean mo2022a(Socket socket) {
        return this.f35768a.isSecure(socket);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj instanceof C11104g ? this.f35768a.equals(((C11104g) obj).f35768a) : this.f35768a.equals(obj);
    }

    public int hashCode() {
        return this.f35768a.hashCode();
    }
}
