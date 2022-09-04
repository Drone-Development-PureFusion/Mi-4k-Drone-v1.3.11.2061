package org.p286a.p287a.p306i.p310d;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.AbstractC11138b;
@AbstractC11008b
/* renamed from: org.a.a.i.d.z */
/* loaded from: classes2.dex */
public class C11274z implements AbstractC11138b, CookieSpecFactory {

    /* renamed from: a */
    private final String[] f36216a;

    /* renamed from: b */
    private final boolean f36217b;

    public C11274z() {
        this(null, false);
    }

    public C11274z(String[] strArr, boolean z) {
        this.f36216a = strArr;
        this.f36217b = z;
    }

    @Override // org.p286a.p287a.p304g.AbstractC11138b
    /* renamed from: a */
    public CookieSpec mo1538a(HttpContext httpContext) {
        return new C11238aa(this.f36216a, this.f36217b);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams != null) {
            Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
            return new C11238aa(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, httpParams.getBooleanParameter("http.protocol.single-cookie-header", false));
        }
        return new C11238aa();
    }
}
