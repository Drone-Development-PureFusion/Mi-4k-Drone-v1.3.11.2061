package org.p286a.p287a.p306i.p310d;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.C11137a;
import org.p286a.p287a.p320o.C11354a;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11008b
/* renamed from: org.a.a.i.d.f */
/* loaded from: classes2.dex */
public class C11251f implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        if (host.equals(domain)) {
            return true;
        }
        if (!domain.startsWith(".")) {
            domain = C0494h.f686G + domain;
        }
        return host.endsWith(domain) || host.equals(domain.substring(1));
    }

    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        }
        if (str.trim().length() == 0) {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
        setCookie.setDomain(str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            throw new C11137a("Cookie domain may not be null");
        }
        if (!host.contains(".")) {
            if (host.equals(domain)) {
                return;
            }
            throw new C11137a("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
        } else if (host.endsWith(domain)) {
        } else {
            if (domain.startsWith(".")) {
                domain = domain.substring(1, domain.length());
            }
            if (host.equals(domain)) {
                return;
            }
            throw new C11137a("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
        }
    }
}
