package org.p286a.p287a.p306i.p310d;

import java.util.Locale;
import org.apache.http.cookie.ClientCookie;
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
/* renamed from: org.a.a.i.d.ae */
/* loaded from: classes2.dex */
public class C11242ae implements CookieAttributeHandler {
    /* renamed from: a */
    public boolean m1564a(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        String lowerCase = cookieOrigin.getHost().toLowerCase(Locale.ENGLISH);
        String domain = cookie.getDomain();
        return m1564a(lowerCase, domain) && lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1;
    }

    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        }
        if (str.trim().length() == 0) {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (!str.startsWith(".")) {
            lowerCase = C0494h.f686G + lowerCase;
        }
        setCookie.setDomain(lowerCase);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        String lowerCase = cookieOrigin.getHost().toLowerCase(Locale.ENGLISH);
        if (cookie.getDomain() == null) {
            throw new C11137a("Invalid cookie state: domain not specified");
        }
        String lowerCase2 = cookie.getDomain().toLowerCase(Locale.ENGLISH);
        if (!(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute("domain")) {
            if (cookie.getDomain().equals(lowerCase)) {
                return;
            }
            throw new C11137a("Illegal domain attribute: \"" + cookie.getDomain() + "\".Domain of origin: \"" + lowerCase + "\"");
        } else if (!lowerCase2.startsWith(".")) {
            throw new C11137a("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2109: domain must start with a dot");
        } else {
            int indexOf = lowerCase2.indexOf(46, 1);
            if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                throw new C11137a("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
            }
            if (!m1564a(lowerCase, lowerCase2)) {
                throw new C11137a("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
            }
            if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) == -1) {
                return;
            }
            throw new C11137a("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
        }
    }
}
