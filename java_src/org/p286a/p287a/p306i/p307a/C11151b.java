package org.p286a.p287a.p306i.p307a;

import java.nio.charset.Charset;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p289b.AbstractC11014c;
@AbstractC11008b
/* renamed from: org.a.a.i.a.b */
/* loaded from: classes2.dex */
public class C11151b implements AbstractC11014c, AuthSchemeFactory {

    /* renamed from: a */
    private final Charset f35861a;

    public C11151b() {
        this(null);
    }

    public C11151b(Charset charset) {
        this.f35861a = charset;
    }

    @Override // org.p286a.p287a.p289b.AbstractC11014c
    /* renamed from: a */
    public AuthScheme mo1811a(HttpContext httpContext) {
        return new C11152c(this.f35861a);
    }

    public AuthScheme newInstance(HttpParams httpParams) {
        return new C11152c();
    }
}
