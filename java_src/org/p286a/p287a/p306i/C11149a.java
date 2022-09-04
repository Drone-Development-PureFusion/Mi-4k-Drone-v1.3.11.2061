package org.p286a.p287a.p306i;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.Header;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.HttpConnectionMetricsImpl;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p305h.C11140b;
import org.p286a.p287a.p306i.p311e.C11277b;
import org.p286a.p287a.p306i.p311e.C11278c;
import org.p286a.p287a.p306i.p313g.C11297c;
import org.p286a.p287a.p306i.p313g.C11298d;
import org.p286a.p287a.p306i.p313g.C11299e;
import org.p286a.p287a.p306i.p313g.C11300f;
import org.p286a.p287a.p306i.p313g.C11309o;
import org.p286a.p287a.p306i.p313g.C11310p;
import org.p286a.p287a.p306i.p313g.C11311q;
import org.p286a.p287a.p306i.p313g.C11312r;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
import org.p286a.p287a.p320o.C11358e;
@AbstractC11009c
/* renamed from: org.a.a.i.a */
/* loaded from: classes2.dex */
public class C11149a implements HttpConnection, HttpInetConnection {

    /* renamed from: a */
    private final C11311q f35853a;

    /* renamed from: b */
    private final C11312r f35854b;

    /* renamed from: c */
    private final HttpConnectionMetricsImpl f35855c;

    /* renamed from: d */
    private final ContentLengthStrategy f35856d;

    /* renamed from: e */
    private final ContentLengthStrategy f35857e;

    /* renamed from: f */
    private volatile boolean f35858f;

    /* renamed from: g */
    private volatile Socket f35859g;

    /* JADX INFO: Access modifiers changed from: protected */
    public C11149a(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, C11090c c11090c, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2) {
        C11354a.m1324a(i, "Buffer size");
        HttpTransportMetricsImpl httpTransportMetricsImpl = new HttpTransportMetricsImpl();
        HttpTransportMetricsImpl httpTransportMetricsImpl2 = new HttpTransportMetricsImpl();
        this.f35853a = new C11311q(httpTransportMetricsImpl, i, -1, c11090c != null ? c11090c : C11090c.f35747a, charsetDecoder);
        this.f35854b = new C11312r(httpTransportMetricsImpl2, i, i2, charsetEncoder);
        this.f35855c = new HttpConnectionMetricsImpl(httpTransportMetricsImpl, httpTransportMetricsImpl2);
        this.f35856d = contentLengthStrategy == null ? C11277b.f36222a : contentLengthStrategy;
        this.f35857e = contentLengthStrategy2 == null ? C11278c.f36224a : contentLengthStrategy2;
    }

    /* renamed from: b */
    private int m1929b(int i) {
        int soTimeout = this.f35859g.getSoTimeout();
        try {
            this.f35859g.setSoTimeout(i);
            return this.f35853a.m1486e();
        } finally {
            this.f35859g.setSoTimeout(soTimeout);
        }
    }

    /* renamed from: a */
    protected InputStream m1932a(long j, SessionInputBuffer sessionInputBuffer) {
        return j == -2 ? new C11297c(sessionInputBuffer) : j == -1 ? new C11309o(sessionInputBuffer) : new C11299e(sessionInputBuffer, j);
    }

    /* renamed from: a */
    protected OutputStream m1931a(long j, SessionOutputBuffer sessionOutputBuffer) {
        return j == -2 ? new C11298d(2048, sessionOutputBuffer) : j == -1 ? new C11310p(sessionOutputBuffer) : new C11300f(sessionOutputBuffer, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public OutputStream m1930a(HttpMessage httpMessage) {
        return m1931a(this.f35857e.determineLength(httpMessage), this.f35854b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1537a(Socket socket) {
        C11354a.m1321a(socket, "Socket");
        this.f35859g = socket;
        this.f35858f = true;
        this.f35853a.m1492a((InputStream) null);
        this.f35854b.m1481a((OutputStream) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m1933a(int i) {
        if (this.f35853a.m1485f()) {
            return true;
        }
        m1929b(i);
        return this.f35853a.m1485f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public InputStream mo1622b(Socket socket) {
        return socket.getInputStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Socket mo1632b() {
        return this.f35859g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public HttpEntity m1928b(HttpMessage httpMessage) {
        C11140b c11140b = new C11140b();
        long determineLength = this.f35856d.determineLength(httpMessage);
        InputStream m1932a = m1932a(determineLength, this.f35853a);
        if (determineLength == -2) {
            c11140b.a(true);
            c11140b.m1949a(-1L);
            c11140b.m1948a(m1932a);
        } else if (determineLength == -1) {
            c11140b.a(false);
            c11140b.m1949a(-1L);
            c11140b.m1948a(m1932a);
        } else {
            c11140b.a(false);
            c11140b.m1949a(determineLength);
            c11140b.m1948a(m1932a);
        }
        Header firstHeader = httpMessage.getFirstHeader("Content-Type");
        if (firstHeader != null) {
            c11140b.a(firstHeader);
        }
        Header firstHeader2 = httpMessage.getFirstHeader("Content-Encoding");
        if (firstHeader2 != null) {
            c11140b.b(firstHeader2);
        }
        return c11140b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public OutputStream mo1621c(Socket socket) {
        return socket.getOutputStream();
    }

    public void close() {
        if (!this.f35858f) {
            return;
        }
        this.f35858f = false;
        Socket socket = this.f35859g;
        try {
            this.f35853a.m1484g();
            this.f35854b.flush();
            try {
                try {
                    socket.shutdownOutput();
                } catch (IOException e) {
                }
                try {
                    socket.shutdownInput();
                } catch (IOException e2) {
                }
            } catch (UnsupportedOperationException e3) {
            }
        } finally {
            socket.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m1927d() {
        C11355b.m1312a(this.f35858f, "Connection is not open");
        if (!this.f35853a.m1493a()) {
            this.f35853a.m1492a(mo1622b(this.f35859g));
        }
        if (!this.f35854b.m1482a()) {
            this.f35854b.m1481a(mo1621c(this.f35859g));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public SessionInputBuffer m1926e() {
        return this.f35853a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public SessionOutputBuffer m1925f() {
        return this.f35854b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m1924g() {
        this.f35854b.flush();
    }

    public InetAddress getLocalAddress() {
        if (this.f35859g != null) {
            return this.f35859g.getLocalAddress();
        }
        return null;
    }

    public int getLocalPort() {
        if (this.f35859g != null) {
            return this.f35859g.getLocalPort();
        }
        return -1;
    }

    public HttpConnectionMetrics getMetrics() {
        return this.f35855c;
    }

    public InetAddress getRemoteAddress() {
        if (this.f35859g != null) {
            return this.f35859g.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        if (this.f35859g != null) {
            return this.f35859g.getPort();
        }
        return -1;
    }

    public int getSocketTimeout() {
        if (this.f35859g != null) {
            try {
                return this.f35859g.getSoTimeout();
            } catch (SocketException e) {
                return -1;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m1923h() {
        this.f35855c.incrementRequestCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void m1922i() {
        this.f35855c.incrementResponseCount();
    }

    public boolean isOpen() {
        return this.f35858f;
    }

    public boolean isStale() {
        if (!isOpen()) {
            return true;
        }
        try {
            return m1929b(1) < 0;
        } catch (SocketTimeoutException e) {
            return false;
        } catch (IOException e2) {
            return true;
        }
    }

    public void setSocketTimeout(int i) {
        if (this.f35859g != null) {
            try {
                this.f35859g.setSoTimeout(i);
            } catch (SocketException e) {
            }
        }
    }

    public void shutdown() {
        this.f35858f = false;
        Socket socket = this.f35859g;
        if (socket != null) {
            socket.close();
        }
    }

    public String toString() {
        if (this.f35859g != null) {
            StringBuilder sb = new StringBuilder();
            SocketAddress remoteSocketAddress = this.f35859g.getRemoteSocketAddress();
            SocketAddress localSocketAddress = this.f35859g.getLocalSocketAddress();
            if (remoteSocketAddress != null && localSocketAddress != null) {
                C11358e.m1298a(sb, localSocketAddress);
                sb.append("<->");
                C11358e.m1298a(sb, remoteSocketAddress);
            }
            return sb.toString();
        }
        return "[Not bound]";
    }
}
