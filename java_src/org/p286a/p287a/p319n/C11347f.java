package org.p286a.p287a.p319n;

import java.util.List;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestInterceptorList;
import org.apache.http.protocol.HttpResponseInterceptorList;
import org.p286a.p287a.p288a.AbstractC11010d;
@AbstractC11010d
/* renamed from: org.a.a.n.f */
/* loaded from: classes.dex */
public final class C11347f implements HttpProcessor {

    /* renamed from: a */
    private final HttpRequestInterceptor[] f36433a;

    /* renamed from: b */
    private final HttpResponseInterceptor[] f36434b;

    public C11347f(List<HttpRequestInterceptor> list, List<HttpResponseInterceptor> list2) {
        if (list != null) {
            this.f36433a = (HttpRequestInterceptor[]) list.toArray(new HttpRequestInterceptor[list.size()]);
        } else {
            this.f36433a = new HttpRequestInterceptor[0];
        }
        if (list2 != null) {
            this.f36434b = (HttpResponseInterceptor[]) list2.toArray(new HttpResponseInterceptor[list2.size()]);
        } else {
            this.f36434b = new HttpResponseInterceptor[0];
        }
    }

    @Deprecated
    public C11347f(HttpRequestInterceptorList httpRequestInterceptorList, HttpResponseInterceptorList httpResponseInterceptorList) {
        if (httpRequestInterceptorList != null) {
            int requestInterceptorCount = httpRequestInterceptorList.getRequestInterceptorCount();
            this.f36433a = new HttpRequestInterceptor[requestInterceptorCount];
            for (int i = 0; i < requestInterceptorCount; i++) {
                this.f36433a[i] = httpRequestInterceptorList.getRequestInterceptor(i);
            }
        } else {
            this.f36433a = new HttpRequestInterceptor[0];
        }
        if (httpResponseInterceptorList == null) {
            this.f36434b = new HttpResponseInterceptor[0];
            return;
        }
        int responseInterceptorCount = httpResponseInterceptorList.getResponseInterceptorCount();
        this.f36434b = new HttpResponseInterceptor[responseInterceptorCount];
        for (int i2 = 0; i2 < responseInterceptorCount; i2++) {
            this.f36434b[i2] = httpResponseInterceptorList.getResponseInterceptor(i2);
        }
    }

    public C11347f(HttpRequestInterceptor... httpRequestInterceptorArr) {
        this(httpRequestInterceptorArr, (HttpResponseInterceptor[]) null);
    }

    public C11347f(HttpRequestInterceptor[] httpRequestInterceptorArr, HttpResponseInterceptor[] httpResponseInterceptorArr) {
        if (httpRequestInterceptorArr != null) {
            int length = httpRequestInterceptorArr.length;
            this.f36433a = new HttpRequestInterceptor[length];
            System.arraycopy(httpRequestInterceptorArr, 0, this.f36433a, 0, length);
        } else {
            this.f36433a = new HttpRequestInterceptor[0];
        }
        if (httpResponseInterceptorArr == null) {
            this.f36434b = new HttpResponseInterceptor[0];
            return;
        }
        int length2 = httpResponseInterceptorArr.length;
        this.f36434b = new HttpResponseInterceptor[length2];
        System.arraycopy(httpResponseInterceptorArr, 0, this.f36434b, 0, length2);
    }

    public C11347f(HttpResponseInterceptor... httpResponseInterceptorArr) {
        this((HttpRequestInterceptor[]) null, httpResponseInterceptorArr);
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        for (HttpRequestInterceptor httpRequestInterceptor : this.f36433a) {
            httpRequestInterceptor.process(httpRequest, httpContext);
        }
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        for (HttpResponseInterceptor httpResponseInterceptor : this.f36434b) {
            httpResponseInterceptor.process(httpResponse, httpContext);
        }
    }
}
