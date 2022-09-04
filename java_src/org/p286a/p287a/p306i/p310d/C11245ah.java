package org.p286a.p287a.p306i.p310d;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.ah */
/* loaded from: classes2.dex */
public class C11245ah extends C11238aa {
    public C11245ah() {
        this(null, false);
    }

    public C11245ah(String[] strArr, boolean z) {
        super(strArr, z);
        a("domain", new C11242ae());
        a("port", new C11243af());
        a("commenturl", new C11240ac());
        a("discard", new C11241ad());
        a("version", new C11246ai());
    }

    /* renamed from: b */
    private List<Cookie> m1560b(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        ArrayList arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            C11248c c11248c = new C11248c(name, value);
            c11248c.setPath(a(cookieOrigin));
            c11248c.setDomain(b(cookieOrigin));
            c11248c.setPorts(new int[]{cookieOrigin.getPort()});
            NameValuePair[] parameters = headerElement.getParameters();
            HashMap hashMap = new HashMap(parameters.length);
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                hashMap.put(nameValuePair.getName().toLowerCase(Locale.ENGLISH), nameValuePair);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                NameValuePair nameValuePair2 = (NameValuePair) entry.getValue();
                String lowerCase = nameValuePair2.getName().toLowerCase(Locale.ENGLISH);
                c11248c.a(lowerCase, nameValuePair2.getValue());
                CookieAttributeHandler a = a(lowerCase);
                if (a != null) {
                    a.parse(c11248c, nameValuePair2.getValue());
                }
            }
            arrayList.add(c11248c);
        }
        return arrayList;
    }

    /* renamed from: c */
    private static CookieOrigin m1559c(CookieOrigin cookieOrigin) {
        boolean z = false;
        String host = cookieOrigin.getHost();
        int i = 0;
        while (true) {
            if (i >= host.length()) {
                z = true;
                break;
            }
            char charAt = host.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        return z ? new CookieOrigin(host + ".local", cookieOrigin.getPort(), cookieOrigin.getPath(), cookieOrigin.isSecure()) : cookieOrigin;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p306i.p310d.AbstractC11264p
    /* renamed from: a */
    public List<Cookie> mo1548a(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        return m1560b(headerElementArr, m1559c(cookieOrigin));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p306i.p310d.C11238aa
    /* renamed from: a */
    public void mo1561a(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        String attribute;
        int[] ports;
        super.mo1561a(charArrayBuffer, cookie, i);
        if (!(cookie instanceof ClientCookie) || (attribute = ((ClientCookie) cookie).getAttribute("port")) == null) {
            return;
        }
        charArrayBuffer.append("; $Port");
        charArrayBuffer.append("=\"");
        if (attribute.trim().length() > 0 && (ports = cookie.getPorts()) != null) {
            int length = ports.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 > 0) {
                    charArrayBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                charArrayBuffer.append(Integer.toString(ports[i2]));
            }
        }
        charArrayBuffer.append("\"");
    }

    @Override // org.p286a.p287a.p306i.p310d.C11238aa
    public int getVersion() {
        return 1;
    }

    @Override // org.p286a.p287a.p306i.p310d.C11238aa
    public Header getVersionHeader() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
        charArrayBuffer.append("Cookie2");
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.p286a.p287a.p306i.p310d.AbstractC11264p
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        return super.match(cookie, m1559c(cookieOrigin));
    }

    @Override // org.p286a.p287a.p306i.p310d.C11238aa
    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        C11354a.m1321a(header, "Header");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase("Set-Cookie2")) {
            throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
        }
        return m1560b(header.getElements(), m1559c(cookieOrigin));
    }

    @Override // org.p286a.p287a.p306i.p310d.C11238aa
    public String toString() {
        return "rfc2965";
    }

    @Override // org.p286a.p287a.p306i.p310d.C11238aa, org.p286a.p287a.p306i.p310d.AbstractC11264p
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        super.validate(cookie, m1559c(cookieOrigin));
    }
}
