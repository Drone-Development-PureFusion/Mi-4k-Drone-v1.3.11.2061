package org.p286a.p287a.p306i.p310d;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.AbstractC11138b;
@AbstractC11008b
/* renamed from: org.a.a.i.d.u */
/* loaded from: classes2.dex */
public class C11269u implements AbstractC11138b, CookieSpecFactory {

    /* renamed from: a */
    private final String[] f36208a;

    public C11269u() {
        this(null);
    }

    public C11269u(String[] strArr) {
        this.f36208a = strArr;
    }

    @Override // org.p286a.p287a.p304g.AbstractC11138b
    /* renamed from: a */
    public CookieSpec mo1538a(HttpContext httpContext) {
        return new C11270v(this.f36208a);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams != null) {
            Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
            return new C11270v(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null);
        }
        return new C11270v();
    }
}
