package org.p286a.p287a.p306i.p310d;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.C11137a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.d.ab */
/* loaded from: classes2.dex */
public class C11239ab extends AbstractC11237a {
    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        if (str.trim().length() == 0) {
            throw new MalformedCookieException("Blank value for version attribute");
        }
        try {
            setCookie.setVersion(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            throw new MalformedCookieException("Invalid version: " + e.getMessage());
        }
    }

    @Override // org.p286a.p287a.p306i.p310d.AbstractC11237a
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        if (cookie.getVersion() < 0) {
            throw new C11137a("Cookie version may not be negative");
        }
    }
}
