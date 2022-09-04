package org.p286a.p287a.p306i.p307a;

import android.util.Log;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p289b.AbstractC11017f;
import org.p286a.p287a.p289b.C11012a;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p289b.EnumC11013b;
import org.p286a.p287a.p290c.AbstractC11024b;
import org.p286a.p287a.p320o.C11355b;
/* renamed from: org.a.a.i.a.f */
/* loaded from: classes2.dex */
public class C11155f {

    /* renamed from: a */
    private static final String f35875a = "HttpClient";

    /* renamed from: a */
    private Header m1906a(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authScheme instanceof AbstractC11017f ? ((AbstractC11017f) authScheme).mo1915a(credentials, httpRequest, httpContext) : authScheme.authenticate(credentials, httpRequest);
    }

    /* renamed from: a */
    private void m1907a(AuthScheme authScheme) {
        C11355b.m1313a(authScheme, "Auth scheme");
    }

    /* renamed from: a */
    public void m1908a(HttpRequest httpRequest, C11015d c11015d, HttpContext httpContext) {
        AuthScheme m2302c = c11015d.m2302c();
        Credentials m2301d = c11015d.m2301d();
        switch (c11015d.m2303b()) {
            case CHALLENGED:
                Queue<C11012a> m2300e = c11015d.m2300e();
                if (m2300e == null) {
                    m1907a(m2302c);
                    break;
                } else {
                    while (!m2300e.isEmpty()) {
                        C11012a remove = m2300e.remove();
                        AuthScheme m2312a = remove.m2312a();
                        Credentials m2311b = remove.m2311b();
                        c11015d.m2306a(m2312a, m2311b);
                        if (Log.isLoggable(f35875a, 3)) {
                            Log.d(f35875a, "Generating response to an authentication challenge using " + m2312a.getSchemeName() + " scheme");
                        }
                        try {
                            httpRequest.addHeader(m1906a(m2312a, m2311b, httpRequest, httpContext));
                            return;
                        } catch (AuthenticationException e) {
                            if (Log.isLoggable(f35875a, 5)) {
                                Log.w(f35875a, m2312a + " authentication error: " + e.getMessage());
                            }
                        }
                    }
                    return;
                }
            case SUCCESS:
                m1907a(m2302c);
                if (m2302c.isConnectionBased()) {
                    return;
                }
                break;
            case FAILURE:
                return;
        }
        if (m2302c != null) {
            try {
                httpRequest.addHeader(m1906a(m2302c, m2301d, httpRequest, httpContext));
            } catch (AuthenticationException e2) {
                if (!Log.isLoggable(f35875a, 6)) {
                    return;
                }
                Log.e(f35875a, m2302c + " authentication error: " + e2.getMessage());
            }
        }
    }

    /* renamed from: a */
    public boolean m1909a(HttpHost httpHost, HttpResponse httpResponse, AbstractC11024b abstractC11024b, C11015d c11015d, HttpContext httpContext) {
        if (abstractC11024b.mo1784a(httpHost, httpResponse, httpContext)) {
            if (Log.isLoggable(f35875a, 3)) {
                Log.d(f35875a, "Authentication required");
            }
            if (c11015d.m2303b() == EnumC11013b.SUCCESS) {
                abstractC11024b.mo1780b(httpHost, c11015d.m2302c(), httpContext);
            }
            return true;
        }
        switch (c11015d.m2303b()) {
            case CHALLENGED:
            case HANDSHAKE:
                if (Log.isLoggable(f35875a, 3)) {
                    Log.d(f35875a, "Authentication succeeded");
                }
                c11015d.m2308a(EnumC11013b.SUCCESS);
                abstractC11024b.mo1783a(httpHost, c11015d.m2302c(), httpContext);
                break;
            case SUCCESS:
                break;
            default:
                c11015d.m2308a(EnumC11013b.UNCHALLENGED);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: MalformedChallengeException -> 0x0093, TryCatch #0 {MalformedChallengeException -> 0x0093, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0027, B:8:0x0031, B:10:0x003a, B:14:0x0043, B:15:0x0053, B:16:0x0056, B:18:0x005c, B:20:0x0062, B:22:0x006b, B:23:0x0083, B:29:0x008f, B:31:0x00c0, B:33:0x00c9, B:34:0x00d0, B:37:0x00e1, B:39:0x00f3, B:41:0x00fc, B:42:0x0103, B:44:0x010c, B:46:0x0115, B:47:0x011c, B:49:0x012e, B:51:0x0136), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1 A[Catch: MalformedChallengeException -> 0x0093, TryCatch #0 {MalformedChallengeException -> 0x0093, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0027, B:8:0x0031, B:10:0x003a, B:14:0x0043, B:15:0x0053, B:16:0x0056, B:18:0x005c, B:20:0x0062, B:22:0x006b, B:23:0x0083, B:29:0x008f, B:31:0x00c0, B:33:0x00c9, B:34:0x00d0, B:37:0x00e1, B:39:0x00f3, B:41:0x00fc, B:42:0x0103, B:44:0x010c, B:46:0x0115, B:47:0x011c, B:49:0x012e, B:51:0x0136), top: B:2:0x0002 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1905b(HttpHost httpHost, HttpResponse httpResponse, AbstractC11024b abstractC11024b, C11015d c11015d, HttpContext httpContext) {
        Queue<C11012a> mo1786a;
        try {
            if (Log.isLoggable(f35875a, 3)) {
                Log.d(f35875a, httpHost.toHostString() + " requested authentication");
            }
            Map<String, Header> mo1781b = abstractC11024b.mo1781b(httpHost, httpResponse, httpContext);
            if (mo1781b.isEmpty()) {
                if (Log.isLoggable(f35875a, 3)) {
                    Log.d(f35875a, "Response contains no authentication challenges");
                }
                return false;
            }
            AuthScheme m2302c = c11015d.m2302c();
            switch (c11015d.m2303b()) {
                case CHALLENGED:
                case HANDSHAKE:
                    if (m2302c == null) {
                        if (Log.isLoggable(f35875a, 3)) {
                            Log.d(f35875a, "Auth scheme is null");
                        }
                        abstractC11024b.mo1780b(httpHost, (AuthScheme) null, httpContext);
                        c11015d.m2310a();
                        c11015d.m2308a(EnumC11013b.FAILURE);
                        return false;
                    }
                    if (m2302c != null) {
                        Header header = mo1781b.get(m2302c.getSchemeName().toLowerCase(Locale.ENGLISH));
                        if (header != null) {
                            if (Log.isLoggable(f35875a, 3)) {
                                Log.d(f35875a, "Authorization challenge processed");
                            }
                            m2302c.processChallenge(header);
                            if (!m2302c.isComplete()) {
                                c11015d.m2308a(EnumC11013b.HANDSHAKE);
                                return true;
                            }
                            if (Log.isLoggable(f35875a, 3)) {
                                Log.d(f35875a, "Authentication failed");
                            }
                            abstractC11024b.mo1780b(httpHost, c11015d.m2302c(), httpContext);
                            c11015d.m2310a();
                            c11015d.m2308a(EnumC11013b.FAILURE);
                            return false;
                        }
                        c11015d.m2310a();
                    }
                    mo1786a = abstractC11024b.mo1786a(mo1781b, httpHost, httpResponse, httpContext);
                    if (mo1786a != null || mo1786a.isEmpty()) {
                        return false;
                    }
                    if (Log.isLoggable(f35875a, 3)) {
                        Log.d(f35875a, "Selected authentication options: " + mo1786a);
                    }
                    c11015d.m2308a(EnumC11013b.CHALLENGED);
                    c11015d.m2309a(mo1786a);
                    return true;
                case SUCCESS:
                    c11015d.m2310a();
                    mo1786a = abstractC11024b.mo1786a(mo1781b, httpHost, httpResponse, httpContext);
                    if (mo1786a != null) {
                        break;
                    }
                    return false;
                case FAILURE:
                    return false;
                case UNCHALLENGED:
                    if (m2302c != null) {
                    }
                    mo1786a = abstractC11024b.mo1786a(mo1781b, httpHost, httpResponse, httpContext);
                    if (mo1786a != null) {
                    }
                    return false;
                default:
                    mo1786a = abstractC11024b.mo1786a(mo1781b, httpHost, httpResponse, httpContext);
                    if (mo1786a != null) {
                    }
                    return false;
            }
        } catch (MalformedChallengeException e) {
            if (Log.isLoggable(f35875a, 5)) {
                Log.w(f35875a, "Malformed challenge: " + e.getMessage());
            }
            c11015d.m2310a();
            return false;
        }
    }
}
