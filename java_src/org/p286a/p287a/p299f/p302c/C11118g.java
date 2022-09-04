package org.p286a.p287a.p299f.p302c;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p299f.p301b.AbstractC11108b;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11359f;
@AbstractC11010d
/* renamed from: org.a.a.f.c.g */
/* loaded from: classes2.dex */
public class C11118g implements AbstractC11108b {

    /* renamed from: a */
    public static final String f35782a = "TLS";

    /* renamed from: b */
    public static final String f35783b = "SSL";

    /* renamed from: c */
    public static final String f35784c = "SSLv2";

    /* renamed from: d */
    public static final X509HostnameVerifier f35785d = new C11112b();

    /* renamed from: e */
    public static final X509HostnameVerifier f35786e = new C11113c();

    /* renamed from: f */
    public static final X509HostnameVerifier f35787f = new C11124k();

    /* renamed from: g */
    private static final String f35788g = "HttpClient";

    /* renamed from: h */
    private final SSLSocketFactory f35789h;

    /* renamed from: i */
    private final X509HostnameVerifier f35790i;

    /* renamed from: j */
    private final String[] f35791j;

    /* renamed from: k */
    private final String[] f35792k;

    public C11118g(SSLContext sSLContext) {
        this(sSLContext, f35786e);
    }

    public C11118g(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) C11354a.m1321a(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public C11118g(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) C11354a.m1321a(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, x509HostnameVerifier);
    }

    public C11118g(SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public C11118g(SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this.f35789h = (SSLSocketFactory) C11354a.m1321a(sSLSocketFactory, "SSL socket factory");
        this.f35791j = strArr;
        this.f35792k = strArr2;
        this.f35790i = x509HostnameVerifier == null ? f35786e : x509HostnameVerifier;
    }

    /* renamed from: a */
    public static C11118g m1993a() {
        return new C11118g((SSLSocketFactory) SSLSocketFactory.getDefault(), f35786e);
    }

    /* renamed from: a */
    private void m1988a(SSLSocket sSLSocket, String str) {
        try {
            if (Log.isLoggable(f35788g, 3)) {
                try {
                    SSLSession session = sSLSocket.getSession();
                    Log.d(f35788g, "Secure session established");
                    Log.d(f35788g, " negotiated protocol: " + session.getProtocol());
                    Log.d(f35788g, " negotiated cipher suite: " + session.getCipherSuite());
                    X509Certificate x509Certificate = (X509Certificate) session.getPeerCertificates()[0];
                    Log.d(f35788g, " peer principal: " + x509Certificate.getSubjectX500Principal().toString());
                    Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                    if (subjectAlternativeNames != null) {
                        ArrayList arrayList = new ArrayList();
                        for (List<?> list : subjectAlternativeNames) {
                            if (!list.isEmpty()) {
                                arrayList.add((String) list.get(1));
                            }
                        }
                        Log.d(f35788g, " peer alternative names: " + arrayList);
                    }
                    Log.d(f35788g, " issuer principal: " + x509Certificate.getIssuerX500Principal().toString());
                    Collection<List<?>> issuerAlternativeNames = x509Certificate.getIssuerAlternativeNames();
                    if (issuerAlternativeNames != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (List<?> list2 : issuerAlternativeNames) {
                            if (!list2.isEmpty()) {
                                arrayList2.add((String) list2.get(1));
                            }
                        }
                        Log.d(f35788g, " issuer alternative names: " + arrayList2);
                    }
                } catch (Exception e) {
                }
            }
            this.f35790i.verify(str, sSLSocket);
        } catch (IOException e2) {
            try {
                sSLSocket.close();
            } catch (Exception e3) {
            }
            throw e2;
        }
    }

    /* renamed from: a */
    private static String[] m1991a(String str) {
        if (C11359f.m1296b(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    /* renamed from: b */
    public static C11118g m1986b() {
        return new C11118g((SSLSocketFactory) SSLSocketFactory.getDefault(), m1991a(System.getProperty("https.protocols")), m1991a(System.getProperty("https.cipherSuites")), f35786e);
    }

    @Override // org.p286a.p287a.p299f.p301b.AbstractC11107a
    /* renamed from: a */
    public Socket mo1992a(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) {
        C11354a.m1321a(httpHost, "HTTP host");
        C11354a.m1321a(inetSocketAddress, "Remote address");
        Socket mo1987a = socket != null ? socket : mo1987a(httpContext);
        if (inetSocketAddress2 != null) {
            mo1987a.bind(inetSocketAddress2);
        }
        if (i > 0) {
            try {
                if (mo1987a.getSoTimeout() == 0) {
                    mo1987a.setSoTimeout(i);
                }
            } catch (IOException e) {
                try {
                    mo1987a.close();
                } catch (IOException e2) {
                }
                throw e;
            }
        }
        if (Log.isLoggable(f35788g, 3)) {
            Log.d(f35788g, "Connecting socket to " + inetSocketAddress + " with timeout " + i);
        }
        mo1987a.connect(inetSocketAddress, i);
        if (mo1987a instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) mo1987a;
            if (Log.isLoggable(f35788g, 3)) {
                Log.d(f35788g, "Starting handshake");
            }
            sSLSocket.startHandshake();
            m1988a(sSLSocket, httpHost.getHostName());
            return mo1987a;
        }
        return mo1990a(mo1987a, httpHost.getHostName(), inetSocketAddress.getPort(), httpContext);
    }

    @Override // org.p286a.p287a.p299f.p301b.AbstractC11108b
    @TargetApi(17)
    /* renamed from: a */
    public Socket mo1990a(Socket socket, String str, int i, HttpContext httpContext) {
        SSLSocket sSLSocket = (SSLSocket) this.f35789h.createSocket(socket, str, i, true);
        if (this.f35791j != null) {
            sSLSocket.setEnabledProtocols(this.f35791j);
        } else {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            ArrayList arrayList = new ArrayList(enabledProtocols.length);
            for (String str2 : enabledProtocols) {
                if (!str2.startsWith("SSL")) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
        if (this.f35792k != null) {
            sSLSocket.setEnabledCipherSuites(this.f35792k);
        }
        if (Log.isLoggable(f35788g, 3)) {
            Log.d(f35788g, "Enabled protocols: " + Arrays.asList(sSLSocket.getEnabledProtocols()));
            Log.d(f35788g, "Enabled cipher suites:" + Arrays.asList(sSLSocket.getEnabledCipherSuites()));
        }
        m1989a(sSLSocket);
        if (Build.VERSION.SDK_INT >= 17) {
            if (Log.isLoggable(f35788g, 3)) {
                Log.d(f35788g, "Enabling SNI for " + str);
            }
            try {
                sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str);
            } catch (Exception e) {
                if (Log.isLoggable(f35788g, 3)) {
                    Log.d(f35788g, "SNI configuration failed", e);
                }
            }
        }
        if (Log.isLoggable(f35788g, 3)) {
            Log.d(f35788g, "Starting handshake");
        }
        sSLSocket.startHandshake();
        m1988a(sSLSocket, str);
        return sSLSocket;
    }

    @Override // org.p286a.p287a.p299f.p301b.AbstractC11107a
    /* renamed from: a */
    public Socket mo1987a(HttpContext httpContext) {
        return SocketFactory.getDefault().createSocket();
    }

    /* renamed from: a */
    protected void m1989a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    X509HostnameVerifier m1985c() {
        return this.f35790i;
    }
}
