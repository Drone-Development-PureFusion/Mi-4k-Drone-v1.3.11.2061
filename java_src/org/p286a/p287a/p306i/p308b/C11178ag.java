package org.p286a.p287a.p306i.p308b;

import com.facebook.common.util.UriUtil;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p290c.p291a.C11020a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11010d
/* renamed from: org.a.a.i.b.ag */
/* loaded from: classes2.dex */
public class C11178ag implements CredentialsProvider {

    /* renamed from: a */
    private static final Map<String, String> f35982a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C11183e f35983b = new C11183e();

    static {
        f35982a.put(C11020a.f35517a.toUpperCase(Locale.ENGLISH), C11020a.f35517a);
        f35982a.put(C11020a.f35518b.toUpperCase(Locale.ENGLISH), C11020a.f35518b);
        f35982a.put(C11020a.f35519c.toUpperCase(Locale.ENGLISH), C11020a.f35519c);
        f35982a.put(C11020a.f35520d.toUpperCase(Locale.ENGLISH), "SPNEGO");
        f35982a.put(C11020a.f35521e.toUpperCase(Locale.ENGLISH), C11020a.f35521e);
    }

    /* renamed from: a */
    private static String m1788a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = f35982a.get(str);
        return str2 == null ? str : str2;
    }

    /* renamed from: a */
    private static PasswordAuthentication m1787a(AuthScope authScope, Authenticator.RequestorType requestorType) {
        String host = authScope.getHost();
        int port = authScope.getPort();
        return Authenticator.requestPasswordAuthentication(host, null, port, port == 443 ? UriUtil.HTTPS_SCHEME : UriUtil.HTTP_SCHEME, null, m1788a(authScope.getScheme()), null, requestorType);
    }

    public void clear() {
        this.f35983b.clear();
    }

    public Credentials getCredentials(AuthScope authScope) {
        C11354a.m1321a(authScope, "Auth scope");
        Credentials credentials = this.f35983b.getCredentials(authScope);
        if (credentials != null) {
            return credentials;
        }
        if (authScope.getHost() != null) {
            PasswordAuthentication m1787a = m1787a(authScope, Authenticator.RequestorType.SERVER);
            PasswordAuthentication m1787a2 = m1787a == null ? m1787a(authScope, Authenticator.RequestorType.PROXY) : m1787a;
            if (m1787a2 != null) {
                String property = System.getProperty("http.auth.ntlm.domain");
                return property != null ? new NTCredentials(m1787a2.getUserName(), new String(m1787a2.getPassword()), (String) null, property) : C11020a.f35519c.equalsIgnoreCase(authScope.getScheme()) ? new NTCredentials(m1787a2.getUserName(), new String(m1787a2.getPassword()), (String) null, (String) null) : new UsernamePasswordCredentials(m1787a2.getUserName(), new String(m1787a2.getPassword()));
            }
        }
        return null;
    }

    public void setCredentials(AuthScope authScope, Credentials credentials) {
        this.f35983b.setCredentials(authScope, credentials);
    }
}
