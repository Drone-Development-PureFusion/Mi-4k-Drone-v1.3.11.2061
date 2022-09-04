package org.p286a.p287a.p306i.p310d;

import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.d.o */
/* loaded from: classes2.dex */
public class C11263o extends AbstractC11237a {
    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        int i = 0;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
        }
        setCookie.setVersion(i);
    }
}
