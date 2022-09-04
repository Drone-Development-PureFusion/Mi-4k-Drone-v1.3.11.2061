package org.p286a.p287a.p319n;

import java.util.LinkedList;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpProcessor;
/* renamed from: org.a.a.n.d */
/* loaded from: classes2.dex */
public class C11345d {

    /* renamed from: a */
    private C11343b<HttpRequestInterceptor> f36431a;

    /* renamed from: b */
    private C11343b<HttpResponseInterceptor> f36432b;

    C11345d() {
    }

    /* renamed from: a */
    public static C11345d m1341a() {
        return new C11345d();
    }

    /* renamed from: c */
    private C11343b<HttpRequestInterceptor> m1331c() {
        if (this.f36431a == null) {
            this.f36431a = new C11343b<>();
        }
        return this.f36431a;
    }

    /* renamed from: d */
    private C11343b<HttpResponseInterceptor> m1326d() {
        if (this.f36432b == null) {
            this.f36432b = new C11343b<>();
        }
        return this.f36432b;
    }

    /* renamed from: a */
    public C11345d m1340a(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            m1331c().m1358a((C11343b<HttpRequestInterceptor>) httpRequestInterceptor);
        }
        return this;
    }

    /* renamed from: a */
    public C11345d m1339a(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            m1326d().m1358a((C11343b<HttpResponseInterceptor>) httpResponseInterceptor);
        }
        return this;
    }

    /* renamed from: a */
    public C11345d m1338a(HttpRequestInterceptor... httpRequestInterceptorArr) {
        if (httpRequestInterceptorArr != null) {
            m1331c().m1356a(httpRequestInterceptorArr);
        }
        return this;
    }

    /* renamed from: a */
    public C11345d m1337a(HttpResponseInterceptor... httpResponseInterceptorArr) {
        if (httpResponseInterceptorArr != null) {
            m1326d().m1356a(httpResponseInterceptorArr);
        }
        return this;
    }

    /* renamed from: b */
    public C11345d m1335b(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            m1331c().m1355b((C11343b<HttpRequestInterceptor>) httpRequestInterceptor);
        }
        return this;
    }

    /* renamed from: b */
    public C11345d m1334b(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            m1326d().m1355b((C11343b<HttpResponseInterceptor>) httpResponseInterceptor);
        }
        return this;
    }

    /* renamed from: b */
    public C11345d m1333b(HttpRequestInterceptor... httpRequestInterceptorArr) {
        if (httpRequestInterceptorArr != null) {
            m1331c().m1353b(httpRequestInterceptorArr);
        }
        return this;
    }

    /* renamed from: b */
    public C11345d m1332b(HttpResponseInterceptor... httpResponseInterceptorArr) {
        if (httpResponseInterceptorArr != null) {
            m1326d().m1353b(httpResponseInterceptorArr);
        }
        return this;
    }

    /* renamed from: b */
    public HttpProcessor m1336b() {
        LinkedList<HttpResponseInterceptor> linkedList = null;
        LinkedList<HttpRequestInterceptor> m1359a = this.f36431a != null ? this.f36431a.m1359a() : null;
        if (this.f36432b != null) {
            linkedList = this.f36432b.m1359a();
        }
        return new C11347f(m1359a, linkedList);
    }

    /* renamed from: c */
    public C11345d m1330c(HttpRequestInterceptor httpRequestInterceptor) {
        return m1335b(httpRequestInterceptor);
    }

    /* renamed from: c */
    public C11345d m1329c(HttpResponseInterceptor httpResponseInterceptor) {
        return m1334b(httpResponseInterceptor);
    }

    /* renamed from: c */
    public C11345d m1328c(HttpRequestInterceptor... httpRequestInterceptorArr) {
        return m1333b(httpRequestInterceptorArr);
    }

    /* renamed from: c */
    public C11345d m1327c(HttpResponseInterceptor... httpResponseInterceptorArr) {
        return m1332b(httpResponseInterceptorArr);
    }
}
