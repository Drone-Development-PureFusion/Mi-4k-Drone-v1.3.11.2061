package org.p286a.p287a.p306i.p308b;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p289b.AbstractC11014c;
import org.p286a.p287a.p289b.C11012a;
import org.p286a.p287a.p290c.AbstractC11019a;
import org.p286a.p287a.p290c.AbstractC11024b;
import org.p286a.p287a.p290c.p291a.C11020a;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p298e.AbstractC11089b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.b.b */
/* loaded from: classes2.dex */
abstract class AbstractC11180b implements AbstractC11024b {

    /* renamed from: a */
    private static final String f35985a = "HttpClient";

    /* renamed from: b */
    private static final List<String> f35986b = Collections.unmodifiableList(Arrays.asList(C11020a.f35520d, C11020a.f35521e, C11020a.f35519c, C11020a.f35518b, C11020a.f35517a));

    /* renamed from: c */
    private final int f35987c;

    /* renamed from: d */
    private final String f35988d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC11180b(int i, String str) {
        this.f35987c = i;
        this.f35988d = str;
    }

    /* renamed from: a */
    abstract Collection<String> mo1785a(C11022c c11022c);

    @Override // org.p286a.p287a.p290c.AbstractC11024b
    /* renamed from: a */
    public Queue<C11012a> mo1786a(Map<String, Header> map, HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        C11354a.m1321a(map, "Map of auth challenges");
        C11354a.m1321a(httpHost, C11086e.f35733z);
        C11354a.m1321a(httpResponse, "HTTP response");
        C11354a.m1321a(httpContext, "HTTP context");
        C11060a m2176a = C11060a.m2176a(httpContext);
        LinkedList linkedList = new LinkedList();
        AbstractC11089b<AbstractC11014c> m2167h = m2176a.m2167h();
        if (m2167h == null) {
            if (Log.isLoggable(f35985a, 3)) {
                Log.d(f35985a, "Auth scheme registry not set in the context");
            }
            return linkedList;
        }
        CredentialsProvider m2166i = m2176a.m2166i();
        if (m2166i == null) {
            if (Log.isLoggable(f35985a, 3)) {
                Log.d(f35985a, "Credentials provider not set in the context");
            }
            return linkedList;
        }
        Collection<String> mo1785a = mo1785a(m2176a.m2161n());
        if (mo1785a == null) {
            mo1785a = f35986b;
        }
        if (Log.isLoggable(f35985a, 3)) {
            Log.d(f35985a, "Authentication schemes in the order of preference: " + mo1785a);
        }
        for (String str : mo1785a) {
            Header header = map.get(str.toLowerCase(Locale.ENGLISH));
            if (header != null) {
                AbstractC11014c mo2043a = m2167h.mo2043a(str);
                if (mo2043a != null) {
                    AuthScheme mo1811a = mo2043a.mo1811a(httpContext);
                    mo1811a.processChallenge(header);
                    Credentials credentials = m2166i.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort(), mo1811a.getRealm(), mo1811a.getSchemeName()));
                    if (credentials != null) {
                        linkedList.add(new C11012a(mo1811a, credentials));
                    }
                } else if (Log.isLoggable(f35985a, 5)) {
                    Log.w(f35985a, "Authentication scheme " + str + " not supported");
                }
            } else if (Log.isLoggable(f35985a, 3)) {
                Log.d(f35985a, "Challenge for " + str + " authentication scheme not available");
            }
        }
        return linkedList;
    }

    @Override // org.p286a.p287a.p290c.AbstractC11024b
    /* renamed from: a */
    public void mo1783a(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        C11354a.m1321a(httpHost, C11086e.f35733z);
        C11354a.m1321a(authScheme, "Auth scheme");
        C11354a.m1321a(httpContext, "HTTP context");
        C11060a m2176a = C11060a.m2176a(httpContext);
        if (m1782a(authScheme)) {
            AbstractC11019a m2165j = m2176a.m2165j();
            if (m2165j == null) {
                m2165j = new C11181c();
                m2176a.m2180a(m2165j);
            }
            if (Log.isLoggable(f35985a, 3)) {
                Log.d(f35985a, "Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
            }
            m2165j.mo1777a(httpHost, authScheme);
        }
    }

    @Override // org.p286a.p287a.p290c.AbstractC11024b
    /* renamed from: a */
    public boolean mo1784a(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        C11354a.m1321a(httpResponse, "HTTP response");
        return httpResponse.getStatusLine().getStatusCode() == this.f35987c;
    }

    /* renamed from: a */
    protected boolean m1782a(AuthScheme authScheme) {
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        String schemeName = authScheme.getSchemeName();
        return schemeName.equalsIgnoreCase(C11020a.f35517a) || schemeName.equalsIgnoreCase(C11020a.f35518b);
    }

    @Override // org.p286a.p287a.p290c.AbstractC11024b
    /* renamed from: b */
    public Map<String, Header> mo1781b(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        CharArrayBuffer charArrayBuffer;
        int i;
        C11354a.m1321a(httpResponse, "HTTP response");
        FormattedHeader[] headers = httpResponse.getHeaders(this.f35988d);
        HashMap hashMap = new HashMap(headers.length);
        for (FormattedHeader formattedHeader : headers) {
            if (formattedHeader instanceof FormattedHeader) {
                charArrayBuffer = formattedHeader.getBuffer();
                i = formattedHeader.getValuePos();
            } else {
                String value = formattedHeader.getValue();
                if (value == null) {
                    throw new MalformedChallengeException("Header value is null");
                }
                CharArrayBuffer charArrayBuffer2 = new CharArrayBuffer(value.length());
                charArrayBuffer2.append(value);
                charArrayBuffer = charArrayBuffer2;
                i = 0;
            }
            while (i < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i2))) {
                i2++;
            }
            hashMap.put(charArrayBuffer.substring(i, i2).toLowerCase(Locale.ENGLISH), formattedHeader);
        }
        return hashMap;
    }

    @Override // org.p286a.p287a.p290c.AbstractC11024b
    /* renamed from: b */
    public void mo1780b(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        C11354a.m1321a(httpHost, C11086e.f35733z);
        C11354a.m1321a(httpContext, "HTTP context");
        AbstractC11019a m2165j = C11060a.m2176a(httpContext).m2165j();
        if (m2165j != null) {
            if (Log.isLoggable(f35985a, 3)) {
                Log.d(f35985a, "Clearing cached auth scheme for " + httpHost);
            }
            m2165j.mo1776b(httpHost);
        }
    }
}
