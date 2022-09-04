package com.google.android.gms.internal;

import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
/* loaded from: classes2.dex */
public class ank implements apm {

    /* renamed from: a */
    protected final HttpClient f22481a;

    /* renamed from: com.google.android.gms.internal.ank$a */
    /* loaded from: classes2.dex */
    public static final class C6637a extends HttpEntityEnclosingRequestBase {
        public C6637a() {
        }

        public C6637a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public ank(HttpClient httpClient) {
        this.f22481a = httpClient;
    }

    /* renamed from: a */
    private static void m16625a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, abd<?> abdVar) {
        byte[] mo18239o = abdVar.mo18239o();
        if (mo18239o != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(mo18239o));
        }
    }

    /* renamed from: a */
    private static void m16623a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    /* renamed from: b */
    static HttpUriRequest m16622b(abd<?> abdVar, Map<String, String> map) {
        switch (abdVar.m18519a()) {
            case -1:
                byte[] m18498k = abdVar.m18498k();
                if (m18498k == null) {
                    return new HttpGet(abdVar.m18506c());
                }
                HttpPost httpPost = new HttpPost(abdVar.m18506c());
                httpPost.addHeader("Content-Type", abdVar.m18499j());
                httpPost.setEntity(new ByteArrayEntity(m18498k));
                return httpPost;
            case 0:
                return new HttpGet(abdVar.m18506c());
            case 1:
                HttpPost httpPost2 = new HttpPost(abdVar.m18506c());
                httpPost2.addHeader("Content-Type", abdVar.m18495n());
                m16625a((HttpEntityEnclosingRequestBase) httpPost2, abdVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(abdVar.m18506c());
                httpPut.addHeader("Content-Type", abdVar.m18495n());
                m16625a((HttpEntityEnclosingRequestBase) httpPut, abdVar);
                return httpPut;
            case 3:
                return new HttpDelete(abdVar.m18506c());
            case 4:
                return new HttpHead(abdVar.m18506c());
            case 5:
                return new HttpOptions(abdVar.m18506c());
            case 6:
                return new HttpTrace(abdVar.m18506c());
            case 7:
                C6637a c6637a = new C6637a(abdVar.m18506c());
                c6637a.addHeader("Content-Type", abdVar.m18495n());
                m16625a(c6637a, abdVar);
                return c6637a;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    @Override // com.google.android.gms.internal.apm
    /* renamed from: a */
    public HttpResponse mo16214a(abd<?> abdVar, Map<String, String> map) {
        HttpUriRequest m16622b = m16622b(abdVar, map);
        m16623a(m16622b, map);
        m16623a(m16622b, abdVar.mo18240g());
        m16624a(m16622b);
        HttpParams params = m16622b.getParams();
        int m18492r = abdVar.m18492r();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, m18492r);
        return this.f22481a.execute(m16622b);
    }

    /* renamed from: a */
    protected void m16624a(HttpUriRequest httpUriRequest) {
    }
}
