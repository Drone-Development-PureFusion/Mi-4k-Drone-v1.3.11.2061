package org.p286a.p287a.p306i.p310d;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p304g.AbstractC11138b;
@AbstractC11008b
/* renamed from: org.a.a.i.d.m */
/* loaded from: classes2.dex */
public class C11258m implements AbstractC11138b, CookieSpecFactory {

    /* renamed from: a */
    private final String[] f36198a;

    /* renamed from: b */
    private final EnumC11259a f36199b;

    /* renamed from: org.a.a.i.d.m$a */
    /* loaded from: classes2.dex */
    public enum EnumC11259a {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    public C11258m() {
        this(null, EnumC11259a.SECURITYLEVEL_DEFAULT);
    }

    public C11258m(String[] strArr) {
        this(null, EnumC11259a.SECURITYLEVEL_DEFAULT);
    }

    public C11258m(String[] strArr, EnumC11259a enumC11259a) {
        this.f36198a = strArr;
        this.f36199b = enumC11259a;
    }

    @Override // org.p286a.p287a.p304g.AbstractC11138b
    /* renamed from: a */
    public CookieSpec mo1538a(HttpContext httpContext) {
        return new C11260n(this.f36198a);
    }

    public CookieSpec newInstance(HttpParams httpParams) {
        if (httpParams != null) {
            Collection collection = (Collection) httpParams.getParameter("http.protocol.cookie-datepatterns");
            return new C11260n(collection != null ? (String[]) collection.toArray(new String[collection.size()]) : null, this.f36199b);
        }
        return new C11260n(null, this.f36199b);
    }
}
