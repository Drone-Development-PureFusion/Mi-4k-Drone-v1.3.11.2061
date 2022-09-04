package org.p286a.p287a.p319n;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11010d
/* renamed from: org.a.a.n.a */
/* loaded from: classes2.dex */
public class C11342a implements HttpContext {

    /* renamed from: a */
    private final HttpContext f36421a;

    /* renamed from: b */
    private final Map<String, Object> f36422b;

    public C11342a() {
        this(null);
    }

    public C11342a(HttpContext httpContext) {
        this.f36422b = new ConcurrentHashMap();
        this.f36421a = httpContext;
    }

    /* renamed from: a */
    public void m1360a() {
        this.f36422b.clear();
    }

    public Object getAttribute(String str) {
        C11354a.m1321a(str, "Id");
        Object obj = this.f36422b.get(str);
        return (obj != null || this.f36421a == null) ? obj : this.f36421a.getAttribute(str);
    }

    public Object removeAttribute(String str) {
        C11354a.m1321a(str, "Id");
        return this.f36422b.remove(str);
    }

    public void setAttribute(String str, Object obj) {
        C11354a.m1321a(str, "Id");
        if (obj != null) {
            this.f36422b.put(str, obj);
        } else {
            this.f36422b.remove(str);
        }
    }

    public String toString() {
        return this.f36422b.toString();
    }
}
