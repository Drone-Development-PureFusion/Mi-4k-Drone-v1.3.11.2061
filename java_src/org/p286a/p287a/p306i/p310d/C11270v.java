package org.p286a.p287a.p306i.p310d;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p291a.C11021b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.v */
/* loaded from: classes2.dex */
public class C11270v extends AbstractC11264p {

    /* renamed from: a */
    protected static final String f36209a = "EEE, dd-MMM-yy HH:mm:ss z";

    /* renamed from: b */
    private final String[] f36210b;

    public C11270v() {
        this(null);
    }

    public C11270v(String[] strArr) {
        if (strArr != null) {
            this.f36210b = (String[]) strArr.clone();
        } else {
            this.f36210b = new String[]{f36209a};
        }
        a("path", new C11254i());
        a("domain", new C11267s());
        a("max-age", new C11253h());
        a("secure", new C11255j());
        a("comment", new C11250e());
        a("expires", new C11252g(this.f36210b));
    }

    public List<Header> formatCookies(List<Cookie> list) {
        C11354a.m1320a(list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append("Cookie");
        charArrayBuffer.append(": ");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new BufferedHeader(charArrayBuffer));
                return arrayList;
            }
            Cookie cookie = list.get(i2);
            if (i2 > 0) {
                charArrayBuffer.append("; ");
            }
            charArrayBuffer.append(cookie.getName());
            String value = cookie.getValue();
            if (value != null) {
                charArrayBuffer.append("=");
                charArrayBuffer.append(value);
            }
            i = i2 + 1;
        }
    }

    public int getVersion() {
        return 0;
    }

    public Header getVersionHeader() {
        return null;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        CharArrayBuffer charArrayBuffer;
        ParserCursor parserCursor;
        C11354a.m1321a(header, "Header");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase("Set-Cookie")) {
            throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
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
        return a(new HeaderElement[]{c11268t.m1545a(charArrayBuffer, parserCursor)}, cookieOrigin);
    }

    public String toString() {
        return C11021b.f35523b;
    }
}
