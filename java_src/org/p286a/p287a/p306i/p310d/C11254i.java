package org.p286a.p287a.p306i.p310d;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.C11137a;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11359f;
@AbstractC11008b
/* renamed from: org.a.a.i.d.i */
/* loaded from: classes2.dex */
public class C11254i implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        String path = cookieOrigin.getPath();
        String path2 = cookie.getPath();
        if (path2 == null) {
            path2 = "/";
        }
        if (path2.length() > 1 && path2.endsWith("/")) {
            path2 = path2.substring(0, path2.length() - 1);
        }
        boolean startsWith = path.startsWith(path2);
        return (!startsWith || path.length() == path2.length() || path2.endsWith("/")) ? startsWith : path.charAt(path2.length()) == '/';
    }

    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (C11359f.m1296b(str)) {
            str = "/";
        }
        setCookie.setPath(str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        if (!match(cookie, cookieOrigin)) {
            throw new C11137a("Illegal path attribute \"" + cookie.getPath() + "\". Path of origin: \"" + cookieOrigin.getPath() + "\"");
        }
    }
}
