package org.p286a.p287a.p306i.p310d;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.p */
/* loaded from: classes2.dex */
public abstract class AbstractC11264p extends AbstractC11247b {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static String m1549a(CookieOrigin cookieOrigin) {
        String path = cookieOrigin.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            if (lastIndexOf == 0) {
                lastIndexOf = 1;
            }
            return path.substring(0, lastIndexOf);
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static String m1547b(CookieOrigin cookieOrigin) {
        return cookieOrigin.getHost();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public List<Cookie> mo1548a(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        ArrayList arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            C11249d c11249d = new C11249d(name, value);
            c11249d.setPath(m1549a(cookieOrigin));
            c11249d.setDomain(m1547b(cookieOrigin));
            NameValuePair[] parameters = headerElement.getParameters();
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                String lowerCase = nameValuePair.getName().toLowerCase(Locale.ENGLISH);
                c11249d.m1554a(lowerCase, nameValuePair.getValue());
                CookieAttributeHandler a = a(lowerCase);
                if (a != null) {
                    a.parse(c11249d, nameValuePair.getValue());
                }
            }
            arrayList.add(c11249d);
        }
        return arrayList;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler cookieAttributeHandler : a()) {
            if (!cookieAttributeHandler.match(cookie, cookieOrigin)) {
                return false;
            }
        }
        return true;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler cookieAttributeHandler : a()) {
            cookieAttributeHandler.validate(cookie, cookieOrigin);
        }
    }
}
