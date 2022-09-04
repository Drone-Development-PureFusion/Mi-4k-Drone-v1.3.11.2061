package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import org.apache.http.HttpHost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p298e.AbstractC11089b;
import org.p286a.p287a.p298e.C11094f;
import org.p286a.p287a.p299f.AbstractC11106b;
import org.p286a.p287a.p299f.AbstractC11133h;
import org.p286a.p287a.p299f.AbstractC11134i;
import org.p286a.p287a.p299f.C11135j;
import org.p286a.p287a.p299f.p301b.AbstractC11107a;
import org.p286a.p287a.p299f.p301b.AbstractC11108b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.c.l */
/* loaded from: classes2.dex */
class C11222l {

    /* renamed from: a */
    static final String f36129a = "http.socket-factory-registry";

    /* renamed from: b */
    private static final String f36130b = "HttpClient";

    /* renamed from: c */
    private final AbstractC11089b<AbstractC11107a> f36131c;

    /* renamed from: d */
    private final AbstractC11134i f36132d;

    /* renamed from: e */
    private final AbstractC11106b f36133e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11222l(AbstractC11089b<AbstractC11107a> abstractC11089b, AbstractC11134i abstractC11134i, AbstractC11106b abstractC11106b) {
        C11354a.m1321a(abstractC11089b, "Socket factory registry");
        this.f36131c = abstractC11089b;
        this.f36132d = abstractC11134i == null ? C11221k.f36128a : abstractC11134i;
        this.f36133e = abstractC11106b == null ? C11232s.f36160a : abstractC11106b;
    }

    /* renamed from: a */
    private static String m1629a(IOException iOException, HttpHost httpHost, InetAddress... inetAddressArr) {
        return "Connect to " + (httpHost != null ? httpHost.toHostString() : "remote host") + ((inetAddressArr == null || inetAddressArr.length <= 0) ? "" : " " + Arrays.asList(inetAddressArr)) + ((iOException == null || iOException.getMessage() == null) ? " timed out" : " failed: " + iOException.getMessage());
    }

    /* renamed from: a */
    private AbstractC11089b<AbstractC11107a> m1626a(HttpContext httpContext) {
        AbstractC11089b<AbstractC11107a> abstractC11089b = (AbstractC11089b) httpContext.getAttribute(f36129a);
        return abstractC11089b == null ? this.f36131c : abstractC11089b;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1628a(AbstractC11133h abstractC11133h, HttpHost httpHost, InetSocketAddress inetSocketAddress, int i, C11094f c11094f, HttpContext httpContext) {
        AbstractC11107a mo2043a = m1626a(httpContext).mo2043a(httpHost.getSchemeName());
        if (mo2043a == null) {
            throw new C11135j(httpHost.getSchemeName() + " protocol is not supported");
        }
        InetAddress[] mo1584a = this.f36133e.mo1584a(httpHost.getHostName());
        int mo1630a = this.f36132d.mo1630a(httpHost);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= mo1584a.length) {
                return;
            }
            InetAddress inetAddress = mo1584a[i3];
            boolean z = i3 == mo1584a.length + (-1);
            Socket mo1987a = mo2043a.mo1987a(httpContext);
            mo1987a.setSoTimeout(c11094f.m2039a());
            mo1987a.setReuseAddress(c11094f.m2037b());
            mo1987a.setTcpNoDelay(c11094f.m2034e());
            mo1987a.setKeepAlive(c11094f.m2035d());
            int m2036c = c11094f.m2036c();
            if (m2036c >= 0) {
                mo1987a.setSoLinger(m2036c > 0, m2036c);
            }
            abstractC11133h.mo1644a(mo1987a);
            InetSocketAddress inetSocketAddress2 = new InetSocketAddress(inetAddress, mo1630a);
            if (Log.isLoggable(f36130b, 3)) {
                Log.d(f36130b, "Connecting to " + inetSocketAddress2);
            }
            try {
                abstractC11133h.mo1644a(mo2043a.mo1992a(i, mo1987a, httpHost, inetSocketAddress2, inetSocketAddress, httpContext));
                if (!Log.isLoggable(f36130b, 3)) {
                    return;
                }
                Log.d(f36130b, "Connection established " + abstractC11133h);
                return;
            } catch (ConnectException e) {
                if (z) {
                    if (!"Connection timed out".equals(e.getMessage())) {
                        throw new HttpHostConnectException(httpHost, e);
                    }
                    ConnectTimeoutException connectTimeoutException = new ConnectTimeoutException(m1629a(e, httpHost, mo1584a));
                    connectTimeoutException.initCause(e);
                    throw connectTimeoutException;
                }
                if (!Log.isLoggable(f36130b, 3)) {
                    Log.d(f36130b, "Connect to " + inetSocketAddress2 + " timed out. Connection will be retried using another IP address");
                }
                i2 = i3 + 1;
            } catch (SocketTimeoutException e2) {
                if (z) {
                    new ConnectTimeoutException(m1629a(e2, httpHost, mo1584a)).initCause(e2);
                }
                if (!Log.isLoggable(f36130b, 3)) {
                }
                i2 = i3 + 1;
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: a */
    public void m1627a(AbstractC11133h abstractC11133h, HttpHost httpHost, HttpContext httpContext) {
        AbstractC11107a mo2043a = m1626a(C11060a.m2176a(httpContext)).mo2043a(httpHost.getSchemeName());
        if (mo2043a == null) {
            throw new C11135j(httpHost.getSchemeName() + " protocol is not supported");
        }
        if (!(mo2043a instanceof AbstractC11108b)) {
            throw new C11135j(httpHost.getSchemeName() + " protocol does not support connection upgrade");
        }
        abstractC11133h.mo1644a(((AbstractC11108b) mo2043a).mo1990a(abstractC11133h.mo1632b(), httpHost.getHostName(), this.f36132d.mo1630a(httpHost), httpContext));
    }
}
