package org.p286a.p287a.p306i.p307a;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HeaderElement;
import org.apache.http.HttpRequest;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.C11011b;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p289b.EnumC11016e;
import org.p286a.p287a.p316k.C11324b;
@AbstractC11009c
/* renamed from: org.a.a.i.a.k */
/* loaded from: classes.dex */
public abstract class AbstractC11169k extends AbstractC11150a {

    /* renamed from: a */
    private final Map<String, String> f35959a;

    /* renamed from: b */
    private final Charset f35960b;

    public AbstractC11169k() {
        this(C11011b.f35499f);
    }

    public AbstractC11169k(Charset charset) {
        this.f35959a = new HashMap();
        this.f35960b = charset == null ? C11011b.f35499f : charset;
    }

    @Deprecated
    public AbstractC11169k(EnumC11016e enumC11016e) {
        super(enumC11016e);
        this.f35959a = new HashMap();
        this.f35960b = C11011b.f35499f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m1810a(HttpRequest httpRequest) {
        String str = (String) httpRequest.getParams().getParameter("http.auth.credential-charset");
        return str == null ? m1808g().name() : str;
    }

    @Override // org.p286a.p287a.p306i.p307a.AbstractC11150a
    /* renamed from: a */
    protected void mo1809a(CharArrayBuffer charArrayBuffer, int i, int i2) {
        HeaderElement[] parseElements = C11324b.f36371b.parseElements(charArrayBuffer, new ParserCursor(i, charArrayBuffer.length()));
        if (parseElements.length == 0) {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
        this.f35959a.clear();
        for (HeaderElement headerElement : parseElements) {
            this.f35959a.put(headerElement.getName().toLowerCase(Locale.ENGLISH), headerElement.getValue());
        }
    }

    /* renamed from: g */
    public Charset m1808g() {
        return this.f35960b;
    }

    public String getParameter(String str) {
        if (str == null) {
            return null;
        }
        return this.f35959a.get(str.toLowerCase(Locale.ENGLISH));
    }

    public String getRealm() {
        return getParameter("realm");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public Map<String, String> m1807h() {
        return this.f35959a;
    }
}
