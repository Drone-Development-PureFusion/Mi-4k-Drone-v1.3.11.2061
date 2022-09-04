package org.p286a.p287a.p306i.p310d;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.i.d.ac */
/* loaded from: classes2.dex */
public class C11240ac implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void parse(SetCookie setCookie, String str) {
        if (setCookie instanceof SetCookie2) {
            ((SetCookie2) setCookie).setCommentURL(str);
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
    }
}
