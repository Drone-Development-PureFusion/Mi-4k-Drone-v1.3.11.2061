package org.p286a.p287a.p306i.p310d;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.b */
/* loaded from: classes2.dex */
public abstract class AbstractC11247b implements CookieSpec {

    /* renamed from: a */
    private final Map<String, CookieAttributeHandler> f36177a = new HashMap(10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<CookieAttributeHandler> m1558a() {
        return this.f36177a.values();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public CookieAttributeHandler m1557a(String str) {
        return this.f36177a.get(str);
    }

    /* renamed from: a */
    public void m1556a(String str, CookieAttributeHandler cookieAttributeHandler) {
        C11354a.m1321a(str, "Attribute name");
        C11354a.m1321a(cookieAttributeHandler, "Attribute handler");
        this.f36177a.put(str, cookieAttributeHandler);
    }

    /* renamed from: b */
    protected CookieAttributeHandler m1555b(String str) {
        CookieAttributeHandler m1557a = m1557a(str);
        if (m1557a == null) {
            throw new IllegalStateException("Handler not registered for " + str + " attribute.");
        }
        return m1557a;
    }
}
