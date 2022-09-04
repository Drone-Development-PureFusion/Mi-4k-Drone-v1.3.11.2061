package org.p286a.p287a.p306i.p310d;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p296f.C11071b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.d.g */
/* loaded from: classes2.dex */
public class C11252g extends AbstractC11237a {

    /* renamed from: a */
    private final String[] f36190a;

    public C11252g(String[] strArr) {
        C11354a.m1321a(strArr, "Array of date patterns");
        this.f36190a = strArr;
    }

    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (str == null) {
            throw new MalformedCookieException("Missing value for expires attribute");
        }
        Date m2153a = C11071b.m2153a(str, this.f36190a);
        if (m2153a == null) {
            throw new MalformedCookieException("Unable to parse expires attribute: " + str);
        }
        setCookie.setExpiryDate(m2153a);
    }
}
