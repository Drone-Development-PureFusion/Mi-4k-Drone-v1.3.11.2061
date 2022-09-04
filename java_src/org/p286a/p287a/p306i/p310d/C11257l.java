package org.p286a.p287a.p306i.p310d;

import java.util.List;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p291a.C11021b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.l */
/* loaded from: classes2.dex */
public class C11257l implements CookieSpec {

    /* renamed from: a */
    private final String[] f36193a;

    /* renamed from: b */
    private final boolean f36194b;

    /* renamed from: c */
    private C11245ah f36195c;

    /* renamed from: d */
    private C11238aa f36196d;

    /* renamed from: e */
    private C11260n f36197e;

    public C11257l() {
        this(null, false);
    }

    public C11257l(String[] strArr, boolean z) {
        this.f36193a = strArr == null ? null : (String[]) strArr.clone();
        this.f36194b = z;
    }

    /* renamed from: a */
    private C11245ah m1553a() {
        if (this.f36195c == null) {
            this.f36195c = new C11245ah(this.f36193a, this.f36194b);
        }
        return this.f36195c;
    }

    /* renamed from: b */
    private C11238aa m1552b() {
        if (this.f36196d == null) {
            this.f36196d = new C11238aa(this.f36193a, this.f36194b);
        }
        return this.f36196d;
    }

    /* renamed from: c */
    private C11260n m1551c() {
        if (this.f36197e == null) {
            this.f36197e = new C11260n(this.f36193a);
        }
        return this.f36197e;
    }

    public List<Header> formatCookies(List<Cookie> list) {
        C11354a.m1321a(list, "List of cookies");
        int i = Integer.MAX_VALUE;
        boolean z = true;
        for (Cookie cookie : list) {
            if (!(cookie instanceof SetCookie2)) {
                z = false;
            }
            i = cookie.getVersion() < i ? cookie.getVersion() : i;
        }
        return i > 0 ? z ? m1553a().formatCookies(list) : m1552b().formatCookies(list) : m1551c().formatCookies(list);
    }

    public int getVersion() {
        return m1553a().getVersion();
    }

    public Header getVersionHeader() {
        return m1553a().getVersionHeader();
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        return cookie.getVersion() > 0 ? cookie instanceof SetCookie2 ? m1553a().match(cookie, cookieOrigin) : m1552b().match(cookie, cookieOrigin) : m1551c().match(cookie, cookieOrigin);
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        CharArrayBuffer charArrayBuffer;
        ParserCursor parserCursor;
        C11354a.m1321a(header, "Header");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        HeaderElement[] elements = header.getElements();
        boolean z = false;
        boolean z2 = false;
        for (HeaderElement headerElement : elements) {
            if (headerElement.getParameterByName("version") != null) {
                z2 = true;
            }
            if (headerElement.getParameterByName("expires") != null) {
                z = true;
            }
        }
        if (!z && z2) {
            return "Set-Cookie2".equals(header.getName()) ? m1553a().mo1548a(elements, cookieOrigin) : m1552b().a(elements, cookieOrigin);
        }
        C11268t c11268t = C11268t.f36207a;
        if (header instanceof FormattedHeader) {
            charArrayBuffer = ((FormattedHeader) header).getBuffer();
            parserCursor = new ParserCursor(((FormattedHeader) header).getValuePos(), charArrayBuffer.length());
        } else {
            String value = header.getValue();
            if (value == null) {
                throw new MalformedCookieException("Header value is null");
            }
            charArrayBuffer = new CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            parserCursor = new ParserCursor(0, charArrayBuffer.length());
        }
        return m1551c().a(new HeaderElement[]{c11268t.m1545a(charArrayBuffer, parserCursor)}, cookieOrigin);
    }

    public String toString() {
        return C11021b.f35525d;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        if (cookie.getVersion() <= 0) {
            m1551c().validate(cookie, cookieOrigin);
        } else if (cookie instanceof SetCookie2) {
            m1553a().validate(cookie, cookieOrigin);
        } else {
            m1552b().validate(cookie, cookieOrigin);
        }
    }
}
