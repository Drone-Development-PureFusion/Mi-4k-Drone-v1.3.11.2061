package com.android.volley.toolbox;

import com.android.volley.AbstractC0916n;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
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
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
/* renamed from: com.android.volley.toolbox.g */
/* loaded from: classes.dex */
public class C0943g implements AbstractC0946i {

    /* renamed from: b */
    private static final String f2112b = "Content-Type";

    /* renamed from: a */
    protected final HttpClient f2113a;

    /* renamed from: com.android.volley.toolbox.g$a */
    /* loaded from: classes.dex */
    public static final class C0944a extends HttpEntityEnclosingRequestBase {

        /* renamed from: a */
        public static final String f2114a = "PATCH";

        public C0944a() {
        }

        public C0944a(String str) {
            setURI(URI.create(str));
        }

        public C0944a(URI uri) {
            setURI(uri);
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public C0943g(HttpClient httpClient) {
        this.f2113a = httpClient;
    }

    /* renamed from: a */
    private static List<NameValuePair> m37336a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, map.get(str)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m37335a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, AbstractC0916n<?> abstractC0916n) {
        byte[] mo37282v = abstractC0916n.mo37282v();
        if (mo37282v != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(mo37282v));
        }
    }

    /* renamed from: a */
    private static void m37333a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    /* renamed from: b */
    static HttpUriRequest m37332b(AbstractC0916n<?> abstractC0916n, Map<String, String> map) {
        switch (abstractC0916n.m37430a()) {
            case -1:
                byte[] mo37284r = abstractC0916n.mo37284r();
                if (mo37284r == null) {
                    return new HttpGet(abstractC0916n.m37409g());
                }
                HttpPost httpPost = new HttpPost(abstractC0916n.m37409g());
                httpPost.addHeader("Content-Type", abstractC0916n.mo37285q());
                httpPost.setEntity(new ByteArrayEntity(mo37284r));
                return httpPost;
            case 0:
                return new HttpGet(abstractC0916n.m37409g());
            case 1:
                HttpPost httpPost2 = new HttpPost(abstractC0916n.m37409g());
                httpPost2.addHeader("Content-Type", abstractC0916n.mo37283u());
                m37335a((HttpEntityEnclosingRequestBase) httpPost2, abstractC0916n);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(abstractC0916n.m37409g());
                httpPut.addHeader("Content-Type", abstractC0916n.mo37283u());
                m37335a((HttpEntityEnclosingRequestBase) httpPut, abstractC0916n);
                return httpPut;
            case 3:
                return new HttpDelete(abstractC0916n.m37409g());
            case 4:
                return new HttpHead(abstractC0916n.m37409g());
            case 5:
                return new HttpOptions(abstractC0916n.m37409g());
            case 6:
                return new HttpTrace(abstractC0916n.m37409g());
            case 7:
                C0944a c0944a = new C0944a(abstractC0916n.m37409g());
                c0944a.addHeader("Content-Type", abstractC0916n.mo37283u());
                m37335a(c0944a, abstractC0916n);
                return c0944a;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    @Override // com.android.volley.toolbox.AbstractC0946i
    /* renamed from: a */
    public HttpResponse mo37326a(AbstractC0916n<?> abstractC0916n, Map<String, String> map) {
        HttpUriRequest m37332b = m37332b(abstractC0916n, map);
        m37333a(m37332b, map);
        m37333a(m37332b, abstractC0916n.m37403n());
        m37334a(m37332b);
        HttpParams params = m37332b.getParams();
        int m37398y = abstractC0916n.m37398y();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, m37398y);
        return this.f2113a.execute(m37332b);
    }

    /* renamed from: a */
    protected void m37334a(HttpUriRequest httpUriRequest) {
    }
}
