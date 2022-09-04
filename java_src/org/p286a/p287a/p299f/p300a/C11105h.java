package org.p286a.p287a.p299f.p300a;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
@Deprecated
/* renamed from: org.a.a.f.a.h */
/* loaded from: classes.dex */
class C11105h implements SocketFactory {

    /* renamed from: a */
    private final AbstractC11103f f35769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11105h(AbstractC11103f abstractC11103f) {
        this.f35769a = abstractC11103f;
    }

    /* renamed from: a */
    public AbstractC11103f m2019a() {
        return this.f35769a;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        }
        return this.f35769a.mo2021a(socket, new InetSocketAddress(InetAddress.getByName(str), i), inetSocketAddress, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return this.f35769a.mo2020a(new BasicHttpParams());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj instanceof C11105h ? this.f35769a.equals(((C11105h) obj).f35769a) : this.f35769a.equals(obj);
    }

    public int hashCode() {
        return this.f35769a.hashCode();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public boolean isSecure(Socket socket) {
        return this.f35769a.mo2022a(socket);
    }
}
