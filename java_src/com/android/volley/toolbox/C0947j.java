package com.android.volley.toolbox;

import com.android.volley.AbstractC0916n;
import com.facebook.common.util.UriUtil;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.p286a.p287a.p290c.p293c.C11044h;
import org.p286a.p287a.p290c.p293c.C11045i;
import org.p286a.p287a.p290c.p293c.C11048l;
import org.p286a.p287a.p290c.p293c.C11053o;
/* renamed from: com.android.volley.toolbox.j */
/* loaded from: classes.dex */
public class C0947j implements AbstractC0946i {

    /* renamed from: a */
    private static final String f2115a = "Content-Type";

    /* renamed from: b */
    private final AbstractC0948a f2116b;

    /* renamed from: c */
    private final SSLSocketFactory f2117c;

    /* renamed from: com.android.volley.toolbox.j$a */
    /* loaded from: classes.dex */
    public interface AbstractC0948a {
        /* renamed from: a */
        String m37320a(String str);
    }

    public C0947j() {
        this(null);
    }

    public C0947j(AbstractC0948a abstractC0948a) {
        this(abstractC0948a, null);
    }

    public C0947j(AbstractC0948a abstractC0948a, SSLSocketFactory sSLSocketFactory) {
        this.f2116b = abstractC0948a;
        this.f2117c = sSLSocketFactory;
    }

    /* renamed from: a */
    private HttpURLConnection m37322a(URL url, AbstractC0916n<?> abstractC0916n) {
        HttpURLConnection m37323a = m37323a(url);
        int m37398y = abstractC0916n.m37398y();
        m37323a.setConnectTimeout(m37398y);
        m37323a.setReadTimeout(m37398y);
        m37323a.setUseCaches(false);
        m37323a.setDoInput(true);
        if (UriUtil.HTTPS_SCHEME.equals(url.getProtocol()) && this.f2117c != null) {
            ((HttpsURLConnection) m37323a).setSSLSocketFactory(this.f2117c);
        }
        return m37323a;
    }

    /* renamed from: a */
    private static HttpEntity m37325a(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            errorStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(errorStream);
        basicHttpEntity.setContentLength(httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    /* renamed from: a */
    static void m37324a(HttpURLConnection httpURLConnection, AbstractC0916n<?> abstractC0916n) {
        switch (abstractC0916n.m37430a()) {
            case -1:
                byte[] mo37284r = abstractC0916n.mo37284r();
                if (mo37284r == null) {
                    return;
                }
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.addRequestProperty("Content-Type", abstractC0916n.mo37285q());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(mo37284r);
                dataOutputStream.close();
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m37321b(httpURLConnection, abstractC0916n);
                return;
            case 2:
                httpURLConnection.setRequestMethod(C11048l.f35589a);
                m37321b(httpURLConnection, abstractC0916n);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod(C11044h.f35585a);
                return;
            case 5:
                httpURLConnection.setRequestMethod(C11045i.f35586a);
                return;
            case 6:
                httpURLConnection.setRequestMethod(C11053o.f35598a);
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m37321b(httpURLConnection, abstractC0916n);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: a */
    private static boolean m37327a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* renamed from: b */
    private static void m37321b(HttpURLConnection httpURLConnection, AbstractC0916n<?> abstractC0916n) {
        byte[] mo37282v = abstractC0916n.mo37282v();
        if (mo37282v != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", abstractC0916n.mo37283u());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(mo37282v);
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    protected HttpURLConnection m37323a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.android.volley.toolbox.AbstractC0946i
    /* renamed from: a */
    public HttpResponse mo37326a(AbstractC0916n<?> abstractC0916n, Map<String, String> map) {
        String str;
        String m37409g = abstractC0916n.m37409g();
        HashMap hashMap = new HashMap();
        hashMap.putAll(abstractC0916n.m37403n());
        hashMap.putAll(map);
        if (this.f2116b != null) {
            str = this.f2116b.m37320a(m37409g);
            if (str == null) {
                throw new IOException("URL blocked by rewriter: " + m37409g);
            }
        } else {
            str = m37409g;
        }
        HttpURLConnection m37322a = m37322a(new URL(str), abstractC0916n);
        for (String str2 : hashMap.keySet()) {
            m37322a.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        m37324a(m37322a, abstractC0916n);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (m37322a.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicStatusLine basicStatusLine = new BasicStatusLine(protocolVersion, m37322a.getResponseCode(), m37322a.getResponseMessage());
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
        if (m37327a(abstractC0916n.m37430a(), basicStatusLine.getStatusCode())) {
            basicHttpResponse.setEntity(m37325a(m37322a));
        }
        for (Map.Entry<String, List<String>> entry : m37322a.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return basicHttpResponse;
    }
}
