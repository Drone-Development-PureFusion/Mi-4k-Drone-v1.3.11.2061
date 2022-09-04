package org.p286a.p287a.p306i.p314h;

import com.facebook.common.util.UriUtil;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;
import org.p286a.p287a.AbstractC11082d;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p298e.C11094f;
import org.p286a.p287a.p306i.C11209c;
import org.p286a.p287a.p306i.C11236d;
import org.p286a.p287a.p317l.C11327a;
import org.p286a.p287a.p318m.AbstractC11334b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.h.a */
/* loaded from: classes.dex */
public class C11314a implements AbstractC11334b<HttpHost, HttpClientConnection> {

    /* renamed from: a */
    private final SocketFactory f36355a;

    /* renamed from: b */
    private final SSLSocketFactory f36356b;

    /* renamed from: c */
    private final int f36357c;

    /* renamed from: d */
    private final C11094f f36358d;

    /* renamed from: e */
    private final AbstractC11082d<? extends HttpClientConnection> f36359e;

    public C11314a() {
        this(null, null, 0, C11094f.f35754a, C11087a.f35734a);
    }

    public C11314a(int i, C11094f c11094f, C11087a c11087a) {
        this(null, null, i, c11094f, c11087a);
    }

    public C11314a(SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, int i, C11094f c11094f, C11087a c11087a) {
        this.f36355a = socketFactory;
        this.f36356b = sSLSocketFactory;
        this.f36357c = i;
        this.f36358d = c11094f == null ? C11094f.f35754a : c11094f;
        this.f36359e = new C11236d(c11087a == null ? C11087a.f35734a : c11087a);
    }

    @Deprecated
    public C11314a(SSLSocketFactory sSLSocketFactory, HttpParams httpParams) {
        C11354a.m1321a(httpParams, "HTTP params");
        this.f36355a = null;
        this.f36356b = sSLSocketFactory;
        this.f36357c = httpParams.getIntParameter("http.connection.timeout", 0);
        this.f36358d = C11327a.m1428a(httpParams);
        this.f36359e = new C11236d(C11327a.m1426c(httpParams));
    }

    public C11314a(C11094f c11094f, C11087a c11087a) {
        this(null, null, 0, c11094f, c11087a);
    }

    @Deprecated
    public C11314a(HttpParams httpParams) {
        this((SSLSocketFactory) null, httpParams);
    }

    @Deprecated
    /* renamed from: a */
    protected HttpClientConnection m1474a(Socket socket, HttpParams httpParams) {
        C11209c c11209c = new C11209c(httpParams.getIntParameter("http.socket.buffer-size", 8192));
        c11209c.mo1537a(socket);
        return c11209c;
    }

    @Override // org.p286a.p287a.p318m.AbstractC11334b
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public HttpClientConnection mo1407a(HttpHost httpHost) {
        Socket socket;
        String schemeName = httpHost.getSchemeName();
        Socket socket2 = null;
        if (UriUtil.HTTP_SCHEME.equalsIgnoreCase(schemeName)) {
            socket2 = this.f36355a != null ? this.f36355a.createSocket() : new Socket();
        }
        if (UriUtil.HTTPS_SCHEME.equalsIgnoreCase(schemeName)) {
            socket = (this.f36356b != null ? this.f36356b : SSLSocketFactory.getDefault()).createSocket();
        } else {
            socket = socket2;
        }
        if (socket == null) {
            throw new IOException(schemeName + " scheme is not supported");
        }
        String hostName = httpHost.getHostName();
        int port = httpHost.getPort();
        if (port == -1) {
            if (httpHost.getSchemeName().equalsIgnoreCase(UriUtil.HTTP_SCHEME)) {
                port = 80;
            } else if (httpHost.getSchemeName().equalsIgnoreCase(UriUtil.HTTPS_SCHEME)) {
                port = 443;
            }
        }
        socket.setSoTimeout(this.f36358d.m2039a());
        socket.connect(new InetSocketAddress(hostName, port), this.f36357c);
        socket.setTcpNoDelay(this.f36358d.m2034e());
        int m2036c = this.f36358d.m2036c();
        if (m2036c >= 0) {
            socket.setSoLinger(m2036c > 0, m2036c);
        }
        socket.setKeepAlive(this.f36358d.m2035d());
        return this.f36359e.mo1534a(socket);
    }
}
