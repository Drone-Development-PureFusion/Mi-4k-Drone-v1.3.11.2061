package org.p286a.p287a.p306i.p310d;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p291a.C11021b;
import org.p286a.p287a.p290c.p296f.C11071b;
import org.p286a.p287a.p306i.p310d.C11258m;
import org.p286a.p287a.p316k.C11323a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.n */
/* loaded from: classes2.dex */
public class C11260n extends AbstractC11264p {

    /* renamed from: a */
    private static final String[] f36203a = {C11071b.f35628a, C11071b.f35629b, C11071b.f35630c, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    /* renamed from: b */
    private final String[] f36204b;

    public C11260n() {
        this(null, C11258m.EnumC11259a.SECURITYLEVEL_DEFAULT);
    }

    public C11260n(String[] strArr) {
        this(strArr, C11258m.EnumC11259a.SECURITYLEVEL_DEFAULT);
    }

    public C11260n(String[] strArr, C11258m.EnumC11259a enumC11259a) {
        if (strArr != null) {
            this.f36204b = (String[]) strArr.clone();
        } else {
            this.f36204b = f36203a;
        }
        switch (enumC11259a) {
            case SECURITYLEVEL_DEFAULT:
                a("path", new C11254i());
                break;
            case SECURITYLEVEL_IE_MEDIUM:
                a("path", new C11254i() { // from class: org.a.a.i.d.n.1
                    @Override // org.p286a.p287a.p306i.p310d.C11254i
                    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
                    }
                });
                break;
            default:
                throw new RuntimeException("Unknown security level");
        }
        a("domain", new C11251f());
        a("max-age", new C11253h());
        a("secure", new C11255j());
        a("comment", new C11250e());
        a("expires", new C11252g(this.f36204b));
        a("version", new C11263o());
    }

    /* renamed from: c */
    private static boolean m1550c(String str) {
        return str != null && str.startsWith("\"") && str.endsWith("\"");
    }

    public List<Header> formatCookies(List<Cookie> list) {
        C11354a.m1320a(list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append("Cookie");
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            Cookie cookie = list.get(i);
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            String name = cookie.getName();
            String value = cookie.getValue();
            if (cookie.getVersion() <= 0 || m1550c(value)) {
                charArrayBuffer.append(name);
                charArrayBuffer.append("=");
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            } else {
                C11323a.f36367b.formatHeaderElement(charArrayBuffer, new BasicHeaderElement(name, value), false);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
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
        HeaderElement[] headerElementArr;
        C11354a.m1321a(header, "Header");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase("Set-Cookie")) {
            throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
        }
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
        if (z || !z2) {
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
            headerElementArr = new HeaderElement[]{c11268t.m1545a(charArrayBuffer, parserCursor)};
        } else {
            headerElementArr = elements;
        }
        return a(headerElementArr, cookieOrigin);
    }

    public String toString() {
        return C11021b.f35522a;
    }
}
