package org.p286a.p287a.p306i.p310d;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.AbstractC11138b;
@AbstractC11008b
/* renamed from: org.a.a.i.d.ag */
/* loaded from: classes2.dex */
public class C11244ag implements AbstractC11138b, CookieSpecFactory {

    /* renamed from: a */
    private final String[] f36175a;

    /* renamed from: b */
    private final boolean f36176b;

    public C11244ag() {
        this(null, false);
    }

    public C11244ag(String[] strArr, boolean z) {
        this.f36175a = strArr;
        this.f36176b = z;
    }

    @Override // org.p286a.p287a.p304g.AbstractC11138b
    /* renamed from: a */
    public CookieSpec mo1538a(HttpContext httpContext) {
        return new C11245ah(this.f36175a, this.f36176b);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams != null) {
            Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
            return new C11245ah(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, httpParams.getBooleanParameter("http.protocol.single-cookie-header", false));
        }
        return new C11245ah();
    }
}
