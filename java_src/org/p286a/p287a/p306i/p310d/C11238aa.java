package org.p286a.p287a.p306i.p310d;

import com.tencent.p263mm.sdk.contact.RContact;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePathComparator;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p296f.C11071b;
import org.p286a.p287a.p304g.C11137a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.aa */
/* loaded from: classes2.dex */
public class C11238aa extends AbstractC11264p {

    /* renamed from: a */
    private static final CookiePathComparator f36171a = new CookiePathComparator();

    /* renamed from: b */
    private static final String[] f36172b = {C11071b.f35628a, C11071b.f35629b, C11071b.f35630c};

    /* renamed from: c */
    private final String[] f36173c;

    /* renamed from: d */
    private final boolean f36174d;

    public C11238aa() {
        this(null, false);
    }

    public C11238aa(String[] strArr, boolean z) {
        if (strArr != null) {
            this.f36173c = (String[]) strArr.clone();
        } else {
            this.f36173c = f36172b;
        }
        this.f36174d = z;
        a("version", new C11239ab());
        a("path", new C11254i());
        a("domain", new C11273y());
        a("max-age", new C11253h());
        a("secure", new C11255j());
        a("comment", new C11250e());
        a("expires", new C11252g(this.f36173c));
    }

    /* renamed from: a */
    private List<Header> m1567a(List<Cookie> list) {
        int i;
        int i2 = Integer.MAX_VALUE;
        Iterator<Cookie> it2 = list.iterator();
        while (true) {
            i = i2;
            if (!it2.hasNext()) {
                break;
            }
            Cookie next = it2.next();
            i2 = next.getVersion() < i ? next.getVersion() : i;
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 40);
        charArrayBuffer.append("Cookie");
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(i));
        for (Cookie cookie : list) {
            charArrayBuffer.append("; ");
            mo1561a(charArrayBuffer, cookie, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    /* renamed from: b */
    private List<Header> m1565b(List<Cookie> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Cookie cookie : list) {
            int version = cookie.getVersion();
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
            charArrayBuffer.append("Cookie: ");
            charArrayBuffer.append("$Version=");
            charArrayBuffer.append(Integer.toString(version));
            charArrayBuffer.append("; ");
            mo1561a(charArrayBuffer, cookie, version);
            arrayList.add(new BufferedHeader(charArrayBuffer));
        }
        return arrayList;
    }

    /* renamed from: a */
    protected void m1566a(CharArrayBuffer charArrayBuffer, String str, String str2, int i) {
        charArrayBuffer.append(str);
        charArrayBuffer.append("=");
        if (str2 != null) {
            if (i <= 0) {
                charArrayBuffer.append(str2);
                return;
            }
            charArrayBuffer.append('\"');
            charArrayBuffer.append(str2);
            charArrayBuffer.append('\"');
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1561a(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        m1566a(charArrayBuffer, cookie.getName(), cookie.getValue(), i);
        if (cookie.getPath() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute("path")) {
            charArrayBuffer.append("; ");
            m1566a(charArrayBuffer, "$Path", cookie.getPath(), i);
        }
        if (cookie.getDomain() == null || !(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute("domain")) {
            return;
        }
        charArrayBuffer.append("; ");
        m1566a(charArrayBuffer, "$Domain", cookie.getDomain(), i);
    }

    public List<Header> formatCookies(List<Cookie> list) {
        C11354a.m1320a(list, "List of cookies");
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, f36171a);
            list = arrayList;
        }
        return this.f36174d ? m1567a(list) : m1565b(list);
    }

    public int getVersion() {
        return 1;
    }

    public Header getVersionHeader() {
        return null;
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        C11354a.m1321a(header, "Header");
        C11354a.m1321a(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase("Set-Cookie")) {
            throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
        }
        return a(header.getElements(), cookieOrigin);
    }

    public String toString() {
        return "rfc2109";
    }

    @Override // org.p286a.p287a.p306i.p310d.AbstractC11264p
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        C11354a.m1321a(cookie, "Cookie");
        String name = cookie.getName();
        if (name.indexOf(32) != -1) {
            throw new C11137a("Cookie name may not contain blanks");
        }
        if (name.startsWith(RContact.FAVOUR_CONTACT_SHOW_HEAD_CHAR)) {
            throw new C11137a("Cookie name may not start with $");
        }
        super.validate(cookie, cookieOrigin);
    }
}
