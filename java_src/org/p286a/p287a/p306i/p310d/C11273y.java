package org.p286a.p287a.p306i.p310d;

import java.util.Locale;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.C11137a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.d.y */
/* loaded from: classes2.dex */
public class C11273y implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        return host.equals(domain) || (domain.startsWith(".") && host.endsWith(domain));
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
        if (domain.equals(host)) {
            return;
        }
        if (domain.indexOf(46) == -1) {
            throw new C11137a("Domain attribute \"" + domain + "\" does not match the host \"" + host + "\"");
        }
        if (!domain.startsWith(".")) {
            throw new C11137a("Domain attribute \"" + domain + "\" violates RFC 2109: domain must start with a dot");
        }
        int indexOf = domain.indexOf(46, 1);
        if (indexOf < 0 || indexOf == domain.length() - 1) {
            throw new C11137a("Domain attribute \"" + domain + "\" violates RFC 2109: domain must contain an embedded dot");
        }
        String lowerCase = host.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.endsWith(domain)) {
            throw new C11137a("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + lowerCase + "\"");
        }
        if (lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1) {
            return;
        }
        throw new C11137a("Domain attribute \"" + domain + "\" violates RFC 2109: host minus domain may not contain any dots");
    }
}
