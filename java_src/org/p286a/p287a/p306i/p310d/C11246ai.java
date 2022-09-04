package org.p286a.p287a.p306i.p310d;

import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.C11137a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.d.ai */
/* loaded from: classes2.dex */
public class C11246ai implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void parse(SetCookie setCookie, String str) {
        int i;
        C11354a.m1321a(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            i = -1;
        }
        if (i < 0) {
            throw new MalformedCookieException("Invalid cookie version.");
        }
        setCookie.setVersion(i);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        if (!(cookie instanceof SetCookie2) || !(cookie instanceof ClientCookie) || ((ClientCookie) cookie).containsAttribute("version")) {
            return;
        }
        throw new C11137a("Violates RFC 2965. Version attribute is required.");
    }
}
