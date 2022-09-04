package org.p286a.p287a.p306i.p307a;

import android.util.Base64;
import java.nio.charset.Charset;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;
import org.p286a.p287a.C11011b;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p289b.EnumC11016e;
import org.p286a.p287a.p319n.C11342a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.a.c */
/* loaded from: classes.dex */
public class C11152c extends AbstractC11169k {

    /* renamed from: a */
    private boolean f35862a;

    public C11152c() {
        this(C11011b.f35499f);
    }

    public C11152c(Charset charset) {
        super(charset);
        this.f35862a = false;
    }

    @Deprecated
    public C11152c(EnumC11016e enumC11016e) {
        super(enumC11016e);
    }

    @Deprecated
    /* renamed from: a */
    public static Header m1919a(Credentials credentials, String str, boolean z) {
        C11354a.m1321a(credentials, "Credentials");
        C11354a.m1321a(str, "charset");
        StringBuilder sb = new StringBuilder();
        sb.append(credentials.getUserPrincipal().getName());
        sb.append(":");
        sb.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] encode = Base64.encode(EncodingUtils.getBytes(sb.toString(), str), 2);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (z) {
            charArrayBuffer.append(C11086e.f35692N);
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(encode, 0, encode.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.p286a.p287a.p306i.p307a.AbstractC11150a, org.p286a.p287a.p289b.AbstractC11017f
    /* renamed from: a */
    public Header mo1915a(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(credentials, "Credentials");
        C11354a.m1321a(httpRequest, "HTTP request");
        StringBuilder sb = new StringBuilder();
        sb.append(credentials.getUserPrincipal().getName());
        sb.append(":");
        sb.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] encode = Base64.encode(EncodingUtils.getBytes(sb.toString(), a(httpRequest)), 2);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (a()) {
            charArrayBuffer.append(C11086e.f35692N);
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(encode, 0, encode.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return mo1915a(credentials, httpRequest, new C11342a());
    }

    public String getSchemeName() {
        return "basic";
    }

    public boolean isComplete() {
        return this.f35862a;
    }

    public boolean isConnectionBased() {
        return false;
    }

    @Override // org.p286a.p287a.p306i.p307a.AbstractC11150a
    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.f35862a = true;
    }
}
