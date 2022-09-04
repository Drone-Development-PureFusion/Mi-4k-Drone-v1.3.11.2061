package org.p286a.p287a.p306i.p310d;

import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.C11137a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.d.s */
/* loaded from: classes2.dex */
public class C11267s extends C11251f {
    /* renamed from: a */
    private static boolean m1546a(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
    }

    @Override // org.p286a.p287a.p306i.p310d.C11251f
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        return host.endsWith(domain);
    }

    @Override // org.p286a.p287a.p306i.p310d.C11251f
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        super.validate(cookie, cookieOrigin);
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (host.contains(".")) {
            int countTokens = new StringTokenizer(domain, ".").countTokens();
            if (m1546a(domain)) {
                if (countTokens >= 2) {
                    return;
                }
                throw new C11137a("Domain attribute \"" + domain + "\" violates the Netscape cookie specification for special domains");
            } else if (countTokens >= 3) {
            } else {
                throw new C11137a("Domain attribute \"" + domain + "\" violates the Netscape cookie specification");
            }
        }
    }
}
