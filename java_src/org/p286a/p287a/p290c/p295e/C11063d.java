package org.p286a.p287a.p290c.p295e;

import android.util.Log;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p289b.EnumC11013b;
import org.p286a.p287a.p290c.AbstractC11019a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.c.e.d */
/* loaded from: classes2.dex */
public class C11063d implements HttpRequestInterceptor {

    /* renamed from: a */
    private static final String f35622a = "HttpClient";

    /* renamed from: a */
    private void m2160a(HttpHost httpHost, AuthScheme authScheme, C11015d c11015d, CredentialsProvider credentialsProvider) {
        String schemeName = authScheme.getSchemeName();
        if (Log.isLoggable(f35622a, 3)) {
            Log.d(f35622a, "Re-using cached '" + schemeName + "' auth scheme for " + httpHost);
        }
        Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort(), AuthScope.ANY_REALM, schemeName));
        if (credentials == null) {
            if (!Log.isLoggable(f35622a, 3)) {
                return;
            }
            Log.d(f35622a, "No credentials for preemptive authentication");
            return;
        }
        if ("BASIC".equalsIgnoreCase(authScheme.getSchemeName())) {
            c11015d.m2308a(EnumC11013b.CHALLENGED);
        } else {
            c11015d.m2308a(EnumC11013b.SUCCESS);
        }
        c11015d.m2306a(authScheme, credentials);
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        AuthScheme mo1778a;
        AuthScheme mo1778a2;
        C11354a.m1321a(httpRequest, "HTTP request");
        C11354a.m1321a(httpContext, "HTTP context");
        C11060a m2176a = C11060a.m2176a(httpContext);
        AbstractC11019a m2165j = m2176a.m2165j();
        if (m2165j == null) {
            if (!Log.isLoggable(f35622a, 3)) {
                return;
            }
            Log.d(f35622a, "Auth cache not set in the context");
            return;
        }
        CredentialsProvider m2166i = m2176a.m2166i();
        if (m2166i == null) {
            if (!Log.isLoggable(f35622a, 3)) {
                return;
            }
            Log.d(f35622a, "Credentials provider not set in the context");
            return;
        }
        RouteInfo m2175b = m2176a.m2175b();
        if (m2175b == null) {
            if (!Log.isLoggable(f35622a, 3)) {
                return;
            }
            Log.d(f35622a, "Route info not set in the context");
            return;
        }
        HttpHost t = m2176a.t();
        if (t == null) {
            if (!Log.isLoggable(f35622a, 3)) {
                return;
            }
            Log.d(f35622a, "Target host not set in the context");
            return;
        }
        HttpHost httpHost = t.getPort() < 0 ? new HttpHost(t.getHostName(), m2175b.getTargetHost().getPort(), t.getSchemeName()) : t;
        C11015d m2164k = m2176a.m2164k();
        if (m2164k != null && m2164k.m2303b() == EnumC11013b.UNCHALLENGED && (mo1778a2 = m2165j.mo1778a(httpHost)) != null) {
            m2160a(httpHost, mo1778a2, m2164k, m2166i);
        }
        HttpHost proxyHost = m2175b.getProxyHost();
        C11015d m2163l = m2176a.m2163l();
        if (proxyHost == null || m2163l == null || m2163l.m2303b() != EnumC11013b.UNCHALLENGED || (mo1778a = m2165j.mo1778a(proxyHost)) == null) {
            return;
        }
        m2160a(proxyHost, mo1778a, m2163l, m2166i);
    }
}
