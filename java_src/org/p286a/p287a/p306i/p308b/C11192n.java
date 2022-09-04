package org.p286a.p287a.p306i.p308b;

import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.AbstractC11069f;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.b.n */
/* loaded from: classes2.dex */
public class C11192n implements AbstractC11069f {

    /* renamed from: a */
    private final int f36004a;

    /* renamed from: b */
    private final long f36005b;

    public C11192n() {
        this(1, 1000);
    }

    public C11192n(int i, int i2) {
        C11354a.m1324a(i, "Max retries");
        C11354a.m1324a(i2, "Retry interval");
        this.f36004a = i;
        this.f36005b = i2;
    }

    @Override // org.p286a.p287a.p290c.AbstractC11069f
    /* renamed from: a */
    public long mo1753a() {
        return this.f36005b;
    }

    @Override // org.p286a.p287a.p290c.AbstractC11069f
    /* renamed from: a */
    public boolean mo1752a(HttpResponse httpResponse, int i, HttpContext httpContext) {
        return i <= this.f36004a && httpResponse.getStatusLine().getStatusCode() == 503;
    }
}
