package org.p286a.p287a.p306i.p308b;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p299f.AbstractC11133h;
@AbstractC11008b
/* renamed from: org.a.a.i.b.o */
/* loaded from: classes2.dex */
public class C11193o implements UserTokenHandler {

    /* renamed from: a */
    public static final C11193o f36006a = new C11193o();

    /* renamed from: a */
    private static Principal m1751a(C11015d c11015d) {
        Credentials m2301d;
        AuthScheme m2302c = c11015d.m2302c();
        if (m2302c == null || !m2302c.isComplete() || !m2302c.isConnectionBased() || (m2301d = c11015d.m2301d()) == null) {
            return null;
        }
        return m2301d.getUserPrincipal();
    }

    public Object getUserToken(HttpContext httpContext) {
        SSLSession mo1631c;
        C11060a m2176a = C11060a.m2176a(httpContext);
        Principal principal = null;
        C11015d m2164k = m2176a.m2164k();
        if (m2164k != null && (principal = m1751a(m2164k)) == null) {
            principal = m1751a(m2176a.m2163l());
        }
        if (principal == null) {
            AbstractC11133h p = m2176a.p();
            if (p.isOpen() && (p instanceof AbstractC11133h) && (mo1631c = p.mo1631c()) != null) {
                return mo1631c.getLocalPrincipal();
            }
        }
        return principal;
    }
}
