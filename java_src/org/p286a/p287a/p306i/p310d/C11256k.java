package org.p286a.p287a.p306i.p310d;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.AbstractC11138b;
@AbstractC11008b
/* renamed from: org.a.a.i.d.k */
/* loaded from: classes2.dex */
public class C11256k implements AbstractC11138b, CookieSpecFactory {

    /* renamed from: a */
    private final String[] f36191a;

    /* renamed from: b */
    private final boolean f36192b;

    public C11256k() {
        this(null, false);
    }

    public C11256k(String[] strArr, boolean z) {
        this.f36191a = strArr;
        this.f36192b = z;
    }

    @Override // org.p286a.p287a.p304g.AbstractC11138b
    /* renamed from: a */
    public CookieSpec mo1538a(HttpContext httpContext) {
        return new C11257l(this.f36191a, this.f36192b);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams != null) {
            Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
            return new C11257l(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, httpParams.getBooleanParameter("http.protocol.single-cookie-header", false));
        }
        return new C11257l();
    }
}
