package org.p286a.p287a.p306i.p314h;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p298e.C11094f;
import org.p286a.p287a.p318m.AbstractC11329a;
import org.p286a.p287a.p318m.AbstractC11334b;
@AbstractC11010d
/* renamed from: org.a.a.i.h.b */
/* loaded from: classes.dex */
public class C11315b extends AbstractC11329a<HttpHost, HttpClientConnection, C11316c> {

    /* renamed from: a */
    private static final AtomicLong f36360a = new AtomicLong();

    public C11315b() {
        super(new C11314a(C11094f.f35754a, C11087a.f35734a), 2, 20);
    }

    public C11315b(C11094f c11094f, C11087a c11087a) {
        super(new C11314a(c11094f, c11087a), 2, 20);
    }

    public C11315b(AbstractC11334b<HttpHost, HttpClientConnection> abstractC11334b) {
        super(abstractC11334b, 2, 20);
    }

    @Deprecated
    public C11315b(HttpParams httpParams) {
        super(new C11314a(httpParams), 2, 20);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p318m.AbstractC11329a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public C11316c mo1422a(HttpHost httpHost, HttpClientConnection httpClientConnection) {
        return new C11316c(Long.toString(f36360a.getAndIncrement()), httpHost, httpClientConnection);
    }
}
