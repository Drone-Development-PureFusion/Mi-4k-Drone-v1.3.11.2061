package org.p286a.p287a.p306i.p308b;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p297d.AbstractC11085c;
@AbstractC11010d
/* renamed from: org.a.a.i.b.r */
/* loaded from: classes2.dex */
public class C11198r implements Closeable {

    /* renamed from: a */
    private final HttpClient f36018a;

    /* renamed from: b */
    private final ExecutorService f36019b;

    /* renamed from: c */
    private final C11196q f36020c = new C11196q();

    /* renamed from: d */
    private final AtomicBoolean f36021d = new AtomicBoolean(false);

    public C11198r(HttpClient httpClient, ExecutorService executorService) {
        this.f36018a = httpClient;
        this.f36019b = executorService;
    }

    /* renamed from: a */
    public C11196q m1730a() {
        return this.f36020c;
    }

    /* renamed from: a */
    public <T> C11201u<T> m1729a(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler) {
        return m1728a(httpUriRequest, httpContext, responseHandler, null);
    }

    /* renamed from: a */
    public <T> C11201u<T> m1728a(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler, AbstractC11085c<T> abstractC11085c) {
        if (this.f36021d.get()) {
            throw new IllegalStateException("Close has been called on this httpclient instance.");
        }
        this.f36020c.m1748b().incrementAndGet();
        C11201u<T> c11201u = new C11201u<>(httpUriRequest, new CallableC11202v(this.f36018a, httpUriRequest, httpContext, responseHandler, abstractC11085c, this.f36020c));
        this.f36019b.execute(c11201u);
        return c11201u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36021d.set(true);
        this.f36019b.shutdownNow();
        if (this.f36018a instanceof Closeable) {
            this.f36018a.close();
        }
    }
}
