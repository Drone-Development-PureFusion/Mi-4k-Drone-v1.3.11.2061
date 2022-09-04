package org.p286a.p287a.p306i.p310d;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p290c.p296f.C11077f;
import org.p356d.AbstractC11759f;
/* renamed from: org.a.a.i.d.w */
/* loaded from: classes2.dex */
public class C11271w implements CookieAttributeHandler {

    /* renamed from: a */
    private final CookieAttributeHandler f36211a;

    /* renamed from: b */
    private Set<String> f36212b;

    /* renamed from: c */
    private Set<String> f36213c;

    public C11271w(CookieAttributeHandler cookieAttributeHandler) {
        this.f36211a = cookieAttributeHandler;
    }

    /* renamed from: a */
    private boolean m1542a(Cookie cookie) {
        int indexOf;
        String domain = cookie.getDomain();
        if (domain.startsWith(".")) {
            domain = domain.substring(1);
        }
        String m2143a = C11077f.m2143a(domain);
        if ((this.f36212b == null || !this.f36212b.contains(m2143a)) && this.f36213c != null) {
            while (!this.f36213c.contains(m2143a)) {
                if (m2143a.startsWith("*.")) {
                    m2143a = m2143a.substring(2);
                }
                if (m2143a.indexOf(46) != -1) {
                    m2143a = AbstractC11759f.f37104a + m2143a.substring(indexOf);
                    if (m2143a.length() <= 0) {
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m1543a(Collection<String> collection) {
        this.f36213c = new HashSet(collection);
    }

    /* renamed from: b */
    public void m1541b(Collection<String> collection) {
        this.f36212b = new HashSet(collection);
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (m1542a(cookie)) {
            return false;
        }
        return this.f36211a.match(cookie, cookieOrigin);
    }

    public void parse(SetCookie setCookie, String str) {
        this.f36211a.parse(setCookie, str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        this.f36211a.validate(cookie, cookieOrigin);
    }
}
