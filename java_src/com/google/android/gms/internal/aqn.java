package com.google.android.gms.internal;

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
/* loaded from: classes2.dex */
public class aqn implements apm {

    /* renamed from: a */
    private final AbstractC6755a f22863a;

    /* renamed from: b */
    private final SSLSocketFactory f22864b;

    /* renamed from: com.google.android.gms.internal.aqn$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6755a {
        /* renamed from: a */
        String m16208a(String str);
    }

    public aqn() {
        this(null);
    }

    public aqn(AbstractC6755a abstractC6755a) {
        this(abstractC6755a, null);
    }

    public aqn(AbstractC6755a abstractC6755a, SSLSocketFactory sSLSocketFactory) {
        this.f22863a = abstractC6755a;
        this.f22864b = sSLSocketFactory;
    }

    /* renamed from: a */
    private HttpURLConnection m16210a(URL url, abd<?> abdVar) {
        HttpURLConnection m16211a = m16211a(url);
        int m18492r = abdVar.m18492r();
        m16211a.setConnectTimeout(m18492r);
        m16211a.setReadTimeout(m18492r);
        m16211a.setUseCaches(false);
        m16211a.setDoInput(true);
        if (UriUtil.HTTPS_SCHEME.equals(url.getProtocol()) && this.f22864b != null) {
            ((HttpsURLConnection) m16211a).setSSLSocketFactory(this.f22864b);
        }
        return m16211a;
    }

    /* renamed from: a */
    private static HttpEntity m16213a(HttpURLConnection httpURLConnection) {
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
    static void m16212a(HttpURLConnection httpURLConnection, abd<?> abdVar) {
        switch (abdVar.m18519a()) {
            case -1:
                byte[] m18498k = abdVar.m18498k();
                if (m18498k == null) {
                    return;
                }
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.addRequestProperty("Content-Type", abdVar.m18499j());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(m18498k);
                dataOutputStream.close();
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m16209b(httpURLConnection, abdVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod(C11048l.f35589a);
                m16209b(httpURLConnection, abdVar);
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
                m16209b(httpURLConnection, abdVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: b */
    private static void m16209b(HttpURLConnection httpURLConnection, abd<?> abdVar) {
        byte[] mo18239o = abdVar.mo18239o();
        if (mo18239o != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", abdVar.m18495n());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(mo18239o);
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    protected HttpURLConnection m16211a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.gms.internal.apm
    /* renamed from: a */
    public HttpResponse mo16214a(abd<?> abdVar, Map<String, String> map) {
        String str;
        String m18506c = abdVar.m18506c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(abdVar.mo18240g());
        hashMap.putAll(map);
        if (this.f22863a != null) {
            str = this.f22863a.m16208a(m18506c);
            if (str == null) {
                String valueOf = String.valueOf(m18506c);
                throw new IOException(valueOf.length() != 0 ? "URL blocked by rewriter: ".concat(valueOf) : new String("URL blocked by rewriter: "));
            }
        } else {
            str = m18506c;
        }
        HttpURLConnection m16210a = m16210a(new URL(str), abdVar);
        for (String str2 : hashMap.keySet()) {
            m16210a.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        m16212a(m16210a, abdVar);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (m16210a.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, m16210a.getResponseCode(), m16210a.getResponseMessage()));
        basicHttpResponse.setEntity(m16213a(m16210a));
        for (Map.Entry<String, List<String>> entry : m16210a.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return basicHttpResponse;
    }
}
