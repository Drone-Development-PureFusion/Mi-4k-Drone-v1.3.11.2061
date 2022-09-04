package org.p286a.p287a.p306i.p307a;

import java.nio.charset.Charset;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p289b.AbstractC11014c;
@AbstractC11008b
/* renamed from: org.a.a.i.a.d */
/* loaded from: classes2.dex */
public class C11153d implements AbstractC11014c, AuthSchemeFactory {

    /* renamed from: a */
    private final Charset f35863a;

    public C11153d() {
        this(null);
    }

    public C11153d(Charset charset) {
        this.f35863a = charset;
    }

    @Override // org.p286a.p287a.p289b.AbstractC11014c
    /* renamed from: a */
    public AuthScheme mo1811a(HttpContext httpContext) {
        return new C11154e(this.f35863a);
    }

    public AuthScheme newInstance(HttpParams httpParams) {
        return new C11154e();
    }
}
