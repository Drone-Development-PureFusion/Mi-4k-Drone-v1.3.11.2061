package org.p286a.p287a.p290c.p293c;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.HeaderGroup;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p292b.C11033h;
import org.p286a.p287a.p290c.p296f.C11079h;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.c.c.p */
/* loaded from: classes2.dex */
public class C11054p {

    /* renamed from: a */
    private String f35599a;

    /* renamed from: b */
    private ProtocolVersion f35600b;

    /* renamed from: c */
    private URI f35601c;

    /* renamed from: d */
    private HeaderGroup f35602d;

    /* renamed from: e */
    private HttpEntity f35603e;

    /* renamed from: f */
    private LinkedList<NameValuePair> f35604f;

    /* renamed from: g */
    private C11022c f35605g;

    /* renamed from: org.a.a.c.c.p$a */
    /* loaded from: classes2.dex */
    static class C11055a extends AbstractC11041e {

        /* renamed from: a */
        private final String f35606a;

        C11055a(String str) {
            this.f35606a = str;
        }

        @Override // org.p286a.p287a.p290c.p293c.AbstractC11049m
        public String getMethod() {
            return this.f35606a;
        }
    }

    /* renamed from: org.a.a.c.c.p$b */
    /* loaded from: classes2.dex */
    static class C11056b extends AbstractC11049m {

        /* renamed from: a */
        private final String f35607a;

        C11056b(String str) {
            this.f35607a = str;
        }

        @Override // org.p286a.p287a.p290c.p293c.AbstractC11049m
        public String getMethod() {
            return this.f35607a;
        }
    }

    C11054p() {
        this(null);
    }

    C11054p(String str) {
        this.f35599a = str;
    }

    /* renamed from: a */
    public static C11054p m2219a() {
        return new C11054p("GET");
    }

    /* renamed from: a */
    public static C11054p m2218a(String str) {
        C11354a.m1315b(str, "HTTP method");
        return new C11054p(str);
    }

    /* renamed from: a */
    public static C11054p m2212a(HttpRequest httpRequest) {
        C11354a.m1321a(httpRequest, "HTTP request");
        return new C11054p().m2204b(httpRequest);
    }

    /* renamed from: b */
    public static C11054p m2208b() {
        return new C11054p(C11044h.f35585a);
    }

    /* renamed from: b */
    private C11054p m2204b(HttpRequest httpRequest) {
        if (httpRequest != null) {
            this.f35599a = httpRequest.getRequestLine().getMethod();
            this.f35600b = httpRequest.getRequestLine().getProtocolVersion();
            if (httpRequest instanceof HttpUriRequest) {
                this.f35601c = ((HttpUriRequest) httpRequest).getURI();
            } else {
                this.f35601c = URI.create(httpRequest.getRequestLine().getUri());
            }
            if (this.f35602d == null) {
                this.f35602d = new HeaderGroup();
            }
            this.f35602d.clear();
            this.f35602d.setHeaders(httpRequest.getAllHeaders());
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                this.f35603e = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            } else {
                this.f35603e = null;
            }
            if (httpRequest instanceof AbstractC11039c) {
                this.f35605g = ((AbstractC11039c) httpRequest).mo2229A_();
            } else {
                this.f35605g = null;
            }
            this.f35604f = null;
        }
        return this;
    }

    /* renamed from: c */
    public static C11054p m2203c() {
        return new C11054p("POST");
    }

    /* renamed from: d */
    public static C11054p m2199d() {
        return new C11054p(C11048l.f35589a);
    }

    /* renamed from: e */
    public static C11054p m2197e() {
        return new C11054p("DELETE");
    }

    /* renamed from: f */
    public static C11054p m2195f() {
        return new C11054p(C11053o.f35598a);
    }

    /* renamed from: g */
    public static C11054p m2193g() {
        return new C11054p(C11045i.f35586a);
    }

    /* renamed from: a */
    public C11054p m2217a(String str, String str2) {
        if (this.f35602d == null) {
            this.f35602d = new HeaderGroup();
        }
        this.f35602d.addHeader(new BasicHeader(str, str2));
        return this;
    }

    /* renamed from: a */
    public C11054p m2216a(URI uri) {
        this.f35601c = uri;
        return this;
    }

    /* renamed from: a */
    public C11054p m2215a(C11022c c11022c) {
        this.f35605g = c11022c;
        return this;
    }

    /* renamed from: a */
    public C11054p m2214a(Header header) {
        if (this.f35602d == null) {
            this.f35602d = new HeaderGroup();
        }
        this.f35602d.addHeader(header);
        return this;
    }

    /* renamed from: a */
    public C11054p m2213a(HttpEntity httpEntity) {
        this.f35603e = httpEntity;
        return this;
    }

    /* renamed from: a */
    public C11054p m2211a(NameValuePair nameValuePair) {
        C11354a.m1321a(nameValuePair, "Name value pair");
        if (this.f35604f == null) {
            this.f35604f = new LinkedList<>();
        }
        this.f35604f.add(nameValuePair);
        return this;
    }

    /* renamed from: a */
    public C11054p m2210a(ProtocolVersion protocolVersion) {
        this.f35600b = protocolVersion;
        return this;
    }

    /* renamed from: a */
    public C11054p m2209a(NameValuePair... nameValuePairArr) {
        for (NameValuePair nameValuePair : nameValuePairArr) {
            m2211a(nameValuePair);
        }
        return this;
    }

    /* renamed from: b */
    public C11054p m2207b(String str) {
        this.f35601c = str != null ? URI.create(str) : null;
        return this;
    }

    /* renamed from: b */
    public C11054p m2206b(String str, String str2) {
        if (this.f35602d == null) {
            this.f35602d = new HeaderGroup();
        }
        this.f35602d.updateHeader(new BasicHeader(str, str2));
        return this;
    }

    /* renamed from: b */
    public C11054p m2205b(Header header) {
        if (this.f35602d == null) {
            this.f35602d = new HeaderGroup();
        }
        this.f35602d.removeHeader(header);
        return this;
    }

    /* renamed from: c */
    public C11054p m2201c(String str, String str2) {
        return m2211a((NameValuePair) new BasicNameValuePair(str, str2));
    }

    /* renamed from: c */
    public C11054p m2200c(Header header) {
        if (this.f35602d == null) {
            this.f35602d = new HeaderGroup();
        }
        this.f35602d.updateHeader(header);
        return this;
    }

    /* renamed from: c */
    public Header m2202c(String str) {
        if (this.f35602d != null) {
            return this.f35602d.getFirstHeader(str);
        }
        return null;
    }

    /* renamed from: d */
    public Header m2198d(String str) {
        if (this.f35602d != null) {
            return this.f35602d.getLastHeader(str);
        }
        return null;
    }

    /* renamed from: e */
    public Header[] m2196e(String str) {
        if (this.f35602d != null) {
            return this.f35602d.getHeaders(str);
        }
        return null;
    }

    /* renamed from: f */
    public C11054p m2194f(String str) {
        if (str != null && this.f35602d != null) {
            HeaderIterator it2 = this.f35602d.iterator();
            while (it2.hasNext()) {
                if (str.equalsIgnoreCase(it2.nextHeader().getName())) {
                    it2.remove();
                }
            }
        }
        return this;
    }

    /* renamed from: h */
    public String m2192h() {
        return this.f35599a;
    }

    /* renamed from: i */
    public ProtocolVersion m2191i() {
        return this.f35600b;
    }

    /* renamed from: j */
    public URI m2190j() {
        return this.f35601c;
    }

    /* renamed from: k */
    public HttpEntity m2189k() {
        return this.f35603e;
    }

    /* renamed from: l */
    public List<NameValuePair> m2188l() {
        return this.f35604f != null ? new ArrayList(this.f35604f) : new ArrayList();
    }

    /* renamed from: m */
    public C11022c m2187m() {
        return this.f35605g;
    }

    /* renamed from: n */
    public HttpUriRequest m2186n() {
        URI uri;
        AbstractC11049m abstractC11049m;
        URI create = this.f35601c != null ? this.f35601c : URI.create("/");
        HttpEntity httpEntity = this.f35603e;
        if (this.f35604f == null || this.f35604f.isEmpty()) {
            uri = create;
        } else if (httpEntity != null || (!"POST".equalsIgnoreCase(this.f35599a) && !C11048l.f35589a.equalsIgnoreCase(this.f35599a))) {
            try {
                uri = new C11079h(create).m2127b(this.f35604f).m2138a();
            } catch (URISyntaxException e) {
                uri = create;
            }
        } else {
            httpEntity = new C11033h(this.f35604f, Charset.forName("ISO-8859-1"));
            uri = create;
        }
        if (httpEntity == null) {
            abstractC11049m = new C11056b(this.f35599a);
        } else {
            C11055a c11055a = new C11055a(this.f35599a);
            c11055a.setEntity(httpEntity);
            abstractC11049m = c11055a;
        }
        abstractC11049m.m2226a(this.f35600b);
        abstractC11049m.m2228a(uri);
        if (this.f35602d != null) {
            abstractC11049m.setHeaders(this.f35602d.getAllHeaders());
        }
        abstractC11049m.m2227a(this.f35605g);
        return abstractC11049m;
    }
}
