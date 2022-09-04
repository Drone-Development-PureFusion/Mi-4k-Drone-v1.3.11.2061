package org.p286a.p287a.p306i.p310d;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.d.h */
/* loaded from: classes2.dex */
public class C11253h extends AbstractC11237a {
    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0) {
                throw new MalformedCookieException("Negative max-age attribute: " + str);
            }
            setCookie.setExpiryDate(new Date(System.currentTimeMillis() + (parseInt * 1000)));
        } catch (NumberFormatException e) {
            throw new MalformedCookieException("Invalid max-age attribute: " + str);
        }
    }
}
