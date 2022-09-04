package org.p286a.p287a.p306i.p309c;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p299f.AbstractC11134i;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.c.i */
/* loaded from: classes2.dex */
public class C11219i extends C11220j {

    /* renamed from: a */
    private final HttpHost f36126a;

    public C11219i(HttpHost httpHost) {
        this(httpHost, null);
    }

    public C11219i(HttpHost httpHost, AbstractC11134i abstractC11134i) {
        super(abstractC11134i);
        this.f36126a = (HttpHost) C11354a.m1321a(httpHost, "Proxy host");
    }

    @Override // org.p286a.p287a.p306i.p309c.C11220j
    /* renamed from: a */
    protected HttpHost mo1581a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f36126a;
    }
}
