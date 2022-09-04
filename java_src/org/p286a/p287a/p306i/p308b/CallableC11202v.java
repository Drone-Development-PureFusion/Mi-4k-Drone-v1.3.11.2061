package org.p286a.p287a.p306i.p308b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p297d.AbstractC11085c;
/* renamed from: org.a.a.i.b.v */
/* loaded from: classes2.dex */
class CallableC11202v<V> implements Callable<V> {

    /* renamed from: a */
    private final HttpUriRequest f36067a;

    /* renamed from: b */
    private final HttpClient f36068b;

    /* renamed from: c */
    private final AtomicBoolean f36069c = new AtomicBoolean(false);

    /* renamed from: d */
    private final long f36070d = System.currentTimeMillis();

    /* renamed from: e */
    private long f36071e = -1;

    /* renamed from: f */
    private long f36072f = -1;

    /* renamed from: g */
    private final HttpContext f36073g;

    /* renamed from: h */
    private final ResponseHandler<V> f36074h;

    /* renamed from: i */
    private final AbstractC11085c<V> f36075i;

    /* renamed from: j */
    private final C11196q f36076j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC11202v(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<V> responseHandler, AbstractC11085c<V> abstractC11085c, C11196q c11196q) {
        this.f36068b = httpClient;
        this.f36074h = responseHandler;
        this.f36067a = httpUriRequest;
        this.f36073g = httpContext;
        this.f36075i = abstractC11085c;
        this.f36076j = c11196q;
    }

    /* renamed from: a */
    public long m1670a() {
        return this.f36070d;
    }

    /* renamed from: b */
    public long m1669b() {
        return this.f36071e;
    }

    /* renamed from: c */
    public long m1668c() {
        return this.f36072f;
    }

    @Override // java.util.concurrent.Callable
    public V call() {
        if (!this.f36069c.get()) {
            try {
                this.f36076j.m1749a().incrementAndGet();
                this.f36071e = System.currentTimeMillis();
                try {
                    this.f36076j.m1748b().decrementAndGet();
                    V v = (V) this.f36068b.execute(this.f36067a, this.f36074h, this.f36073g);
                    this.f36072f = System.currentTimeMillis();
                    this.f36076j.m1747c().m1732a(this.f36071e);
                    if (this.f36075i != null) {
                        this.f36075i.m2069a((AbstractC11085c<V>) v);
                    }
                    return v;
                } catch (Exception e) {
                    this.f36076j.m1746d().m1732a(this.f36071e);
                    this.f36072f = System.currentTimeMillis();
                    if (this.f36075i != null) {
                        this.f36075i.m2070a(e);
                    }
                    throw e;
                }
            } finally {
                this.f36076j.m1745e().m1732a(this.f36071e);
                this.f36076j.m1744f().m1732a(this.f36071e);
                this.f36076j.m1749a().decrementAndGet();
            }
        }
        throw new IllegalStateException("call has been cancelled for request " + this.f36067a.getURI());
    }

    /* renamed from: d */
    public void m1667d() {
        this.f36069c.set(true);
        if (this.f36075i != null) {
            this.f36075i.m2071a();
        }
    }
}
