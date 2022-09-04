package org.p286a.p287a.p306i;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.i.k */
/* loaded from: classes2.dex */
public class C11319k implements ConnectionReuseStrategy {

    /* renamed from: a */
    public static final C11319k f36365a = new C11319k();

    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        return false;
    }
}
