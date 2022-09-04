package org.p286a.p287a.p306i.p307a;

import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p289b.AbstractC11017f;
import org.p286a.p287a.p289b.EnumC11016e;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC11150a implements AbstractC11017f {

    /* renamed from: a */
    private EnumC11016e f35860a;

    public AbstractC11150a() {
    }

    @Deprecated
    public AbstractC11150a(EnumC11016e enumC11016e) {
        this.f35860a = enumC11016e;
    }

    @Override // org.p286a.p287a.p289b.AbstractC11017f
    /* renamed from: a */
    public Header mo1915a(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authenticate(credentials, httpRequest);
    }

    /* renamed from: a */
    protected abstract void mo1809a(CharArrayBuffer charArrayBuffer, int i, int i2);

    /* renamed from: a */
    public boolean m1921a() {
        return this.f35860a != null && this.f35860a == EnumC11016e.PROXY;
    }

    /* renamed from: b */
    public EnumC11016e m1920b() {
        return this.f35860a;
    }

    public void processChallenge(Header header) {
        CharArrayBuffer charArrayBuffer;
        int i;
        C11354a.m1321a(header, "Header");
        String name = header.getName();
        if (name.equalsIgnoreCase(C11086e.f35708ac)) {
            this.f35860a = EnumC11016e.TARGET;
        } else if (!name.equalsIgnoreCase(C11086e.f35691M)) {
            throw new MalformedChallengeException("Unexpected header name: " + name);
        } else {
            this.f35860a = EnumC11016e.PROXY;
        }
        if (header instanceof FormattedHeader) {
            charArrayBuffer = ((FormattedHeader) header).getBuffer();
            i = ((FormattedHeader) header).getValuePos();
        } else {
            String value = header.getValue();
            if (value == null) {
                throw new MalformedChallengeException("Header value is null");
            }
            charArrayBuffer = new CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            i = 0;
        }
        while (i < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i2))) {
            i2++;
        }
        String substring = charArrayBuffer.substring(i, i2);
        if (!substring.equalsIgnoreCase(getSchemeName())) {
            throw new MalformedChallengeException("Invalid scheme identifier: " + substring);
        }
        mo1809a(charArrayBuffer, i2, charArrayBuffer.length());
    }

    public String toString() {
        String schemeName = getSchemeName();
        return schemeName != null ? schemeName.toUpperCase(Locale.ENGLISH) : super.toString();
    }
}
