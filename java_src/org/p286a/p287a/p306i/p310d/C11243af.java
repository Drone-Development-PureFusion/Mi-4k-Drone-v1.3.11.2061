package org.p286a.p287a.p306i.p310d;

import com.xiaomi.mipush.sdk.Constants;
import java.util.StringTokenizer;
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
/* renamed from: org.a.a.i.d.af */
/* loaded from: classes2.dex */
public class C11243af implements CookieAttributeHandler {
    /* renamed from: a */
    private static boolean m1563a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static int[] m1562a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] < 0) {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
                i++;
            } catch (NumberFormatException e) {
                throw new MalformedCookieException("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        return !(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute("port") || (cookie.getPorts() != null && m1563a(cookieOrigin.getPort(), cookie.getPorts()));
    }

    public void parse(SetCookie setCookie, String str) {
        C11354a.m1321a(setCookie, "Cookie");
        if (setCookie instanceof SetCookie2) {
            SetCookie2 setCookie2 = (SetCookie2) setCookie;
            if (str == null || str.trim().length() <= 0) {
                return;
            }
            setCookie2.setPorts(m1562a(str));
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        int port = cookieOrigin.getPort();
        if (!(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute("port") || m1563a(port, cookie.getPorts())) {
            return;
        }
        throw new C11137a("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
    }
}
