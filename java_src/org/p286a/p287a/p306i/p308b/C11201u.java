package org.p286a.p287a.p306i.p308b;

import java.util.concurrent.FutureTask;
import org.apache.http.client.methods.HttpUriRequest;
/* renamed from: org.a.a.i.b.u */
/* loaded from: classes2.dex */
public class C11201u<V> extends FutureTask<V> {

    /* renamed from: a */
    private final HttpUriRequest f36065a;

    /* renamed from: b */
    private final CallableC11202v<V> f36066b;

    public C11201u(HttpUriRequest httpUriRequest, CallableC11202v<V> callableC11202v) {
        super(callableC11202v);
        this.f36065a = httpUriRequest;
        this.f36066b = callableC11202v;
    }

    /* renamed from: a */
    public long m1675a() {
        return this.f36066b.m1670a();
    }

    /* renamed from: b */
    public long m1674b() {
        return this.f36066b.m1669b();
    }

    /* renamed from: c */
    public long m1673c() {
        if (isDone()) {
            return this.f36066b.m1668c();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f36066b.m1667d();
        if (z) {
            this.f36065a.abort();
        }
        return super.cancel(z);
    }

    /* renamed from: d */
    public long m1672d() {
        if (isDone()) {
            return m1673c() - m1674b();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    /* renamed from: e */
    public long m1671e() {
        if (isDone()) {
            return m1673c() - m1675a();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public String toString() {
        return this.f36065a.getRequestLine().getUri();
    }
}
