package p282m.framework.p283a;

import com.baidu.tts.loopj.RequestParams;
import com.facebook.common.util.UriUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.p286a.p287a.p290c.p296f.C11081j;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: m.framework.a.g */
/* loaded from: classes2.dex */
public class C10947g {

    /* renamed from: a */
    public static int f35325a;

    /* renamed from: b */
    public static int f35326b;

    /* renamed from: a */
    private String m2566a(ArrayList<C10944d<String>> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<C10944d<String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C10944d<String> next = it2.next();
            String encode = URLEncoder.encode(next.f35320a, "utf-8");
            String encode2 = next.f35321b != null ? URLEncoder.encode(next.f35321b, "utf-8") : "";
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(encode).append(SignatureVisitor.INSTANCEOF).append(encode2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private HttpClient m2576a() {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        C10949i c10949i = new C10949i(keyStore);
        c10949i.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(UriUtil.HTTP_SCHEME, PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(UriUtil.HTTPS_SCHEME, c10949i, 443));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    /* renamed from: a */
    private HttpPost m2574a(String str, ArrayList<C10944d<String>> arrayList) {
        HttpPost httpPost = new HttpPost(str);
        if (arrayList != null) {
            C10951j c10951j = new C10951j();
            c10951j.m2563a(m2566a(arrayList));
            InputStreamEntity c = c10951j.c();
            c.setContentType(C11081j.f35660a);
            httpPost.setEntity(c);
        }
        return httpPost;
    }

    /* renamed from: a */
    private HttpPost m2570a(String str, ArrayList<C10944d<String>> arrayList, C10944d<String> c10944d) {
        HttpPost httpPost = new HttpPost(str);
        String uuid = UUID.randomUUID().toString();
        C10945e c10945e = new C10945e();
        C10951j c10951j = new C10951j();
        if (arrayList != null) {
            Iterator<C10944d<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C10944d<String> next = it2.next();
                c10951j.m2563a("--").m2563a(uuid).m2563a("\r\n");
                c10951j.m2563a("content-disposition: form-data; name=\"").m2563a(next.f35320a).m2563a("\"\r\n\r\n");
                c10951j.m2563a(next.f35321b).m2563a("\r\n");
            }
        }
        httpPost.setHeader("Content-Type", "multipart/form-data; boundary=" + uuid);
        c10951j.m2563a("--").m2563a(uuid).m2563a("\r\n");
        c10951j.m2563a("Content-Disposition: form-data; name=\"").m2563a(c10944d.f35320a).m2563a("\"; filename=\"").m2563a(new File(c10944d.f35321b).getName()).m2563a("\"\r\n");
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(c10944d.f35321b);
        if (contentTypeFor == null || contentTypeFor.length() <= 0) {
            if (c10944d.f35321b.toLowerCase().endsWith("jpg") || c10944d.f35321b.toLowerCase().endsWith("jepg")) {
                contentTypeFor = "image/jpeg";
            } else if (c10944d.f35321b.toLowerCase().endsWith("png")) {
                contentTypeFor = "image/png";
            } else if (c10944d.f35321b.toLowerCase().endsWith("gif")) {
                contentTypeFor = "image/gif";
            } else {
                FileInputStream fileInputStream = new FileInputStream(c10944d.f35321b);
                contentTypeFor = URLConnection.guessContentTypeFromStream(fileInputStream);
                fileInputStream.close();
                if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                    contentTypeFor = RequestParams.APPLICATION_OCTET_STREAM;
                }
            }
        }
        c10951j.m2563a("Content-Type: ").m2563a(contentTypeFor).m2563a("\r\n\r\n");
        c10945e.m2579a(c10951j);
        C10942b c10942b = new C10942b();
        c10942b.m2581a(c10944d.f35321b);
        c10945e.m2579a(c10942b);
        C10951j c10951j2 = new C10951j();
        c10951j2.m2563a("\r\n--").m2563a(uuid).m2563a("--\r\n");
        c10945e.m2579a(c10951j2);
        httpPost.setEntity(c10945e.c());
        return httpPost;
    }

    /* renamed from: a */
    public String m2573a(String str, ArrayList<C10944d<String>> arrayList, ArrayList<C10944d<String>> arrayList2) {
        if (arrayList != null) {
            String m2566a = m2566a(arrayList);
            if (m2566a.length() > 0) {
                str = String.valueOf(str) + C0363a.f360a + m2566a;
            }
        }
        HttpGet httpGet = new HttpGet(str);
        if (arrayList2 != null) {
            Iterator<C10944d<String>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C10944d<String> next = it2.next();
                httpGet.setHeader(next.f35320a, next.f35321b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f35325a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f35326b);
        httpGet.setParams(basicHttpParams);
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            m2576a.getConnectionManager().shutdown();
            return entityUtils;
        }
        String entityUtils2 = EntityUtils.toString(execute.getEntity(), "utf-8");
        m2576a.getConnectionManager().shutdown();
        throw new Throwable(entityUtils2);
    }

    /* renamed from: a */
    public String m2569a(String str, ArrayList<C10944d<String>> arrayList, C10944d<String> c10944d, ArrayList<C10944d<String>> arrayList2) {
        HttpPost m2574a = (c10944d == null || c10944d.f35321b == null || !new File(c10944d.f35321b).exists()) ? m2574a(str, arrayList) : m2570a(str, arrayList, c10944d);
        if (arrayList2 != null) {
            Iterator<C10944d<String>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C10944d<String> next = it2.next();
                m2574a.setHeader(next.f35320a, next.f35321b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f35325a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f35326b);
        m2574a.setParams(basicHttpParams);
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(m2574a);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            m2576a.getConnectionManager().shutdown();
            return entityUtils;
        }
        String entityUtils2 = EntityUtils.toString(execute.getEntity(), "utf-8");
        m2576a.getConnectionManager().shutdown();
        throw new Throwable(entityUtils2);
    }

    /* renamed from: a */
    public void m2575a(String str, File file) {
        HttpGet httpGet = new HttpGet(str);
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() != 200) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            m2576a.getConnectionManager().shutdown();
            throw new Throwable(entityUtils);
        }
        InputStream content = execute.getEntity().getContent();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        for (int read = content.read(bArr); read > 0; read = content.read(bArr)) {
            fileOutputStream.write(bArr, 0, read);
        }
        fileOutputStream.flush();
        content.close();
        fileOutputStream.close();
        m2576a.getConnectionManager().shutdown();
    }

    /* renamed from: a */
    public void m2572a(String str, ArrayList<C10944d<String>> arrayList, ArrayList<C10944d<String>> arrayList2, AbstractC10948h abstractC10948h) {
        if (arrayList != null) {
            String m2566a = m2566a(arrayList);
            if (m2566a.length() > 0) {
                str = String.valueOf(str) + C0363a.f360a + m2566a;
            }
        }
        HttpGet httpGet = new HttpGet(str);
        if (arrayList2 != null) {
            Iterator<C10944d<String>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C10944d<String> next = it2.next();
                httpGet.setHeader(next.f35320a, next.f35321b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f35325a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f35326b);
        httpGet.setParams(basicHttpParams);
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() != 200) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            m2576a.getConnectionManager().shutdown();
            throw new Throwable(entityUtils);
        }
        InputStream content = execute.getEntity().getContent();
        if (abstractC10948h != null) {
            abstractC10948h.mo2442a(content);
        }
        content.close();
        m2576a.getConnectionManager().shutdown();
    }

    /* renamed from: a */
    public void m2571a(String str, ArrayList<C10944d<String>> arrayList, AbstractC10943c abstractC10943c, AbstractC10948h abstractC10948h) {
        HttpPost httpPost = new HttpPost(str);
        if (arrayList != null) {
            Iterator<C10944d<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C10944d<String> next = it2.next();
                httpPost.setHeader(next.f35320a, next.f35321b);
            }
        }
        httpPost.setEntity(abstractC10943c.m2580c());
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(httpPost);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            if (abstractC10948h != null) {
                abstractC10948h.mo2442a(content);
            }
            content.close();
            m2576a.getConnectionManager().shutdown();
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        m2576a.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    /* renamed from: a */
    public void m2568a(String str, ArrayList<C10944d<String>> arrayList, C10944d<String> c10944d, ArrayList<C10944d<String>> arrayList2, AbstractC10948h abstractC10948h) {
        HttpPost m2574a = (c10944d == null || c10944d.f35321b == null || !new File(c10944d.f35321b).exists()) ? m2574a(str, arrayList) : m2570a(str, arrayList, c10944d);
        if (arrayList2 != null) {
            Iterator<C10944d<String>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C10944d<String> next = it2.next();
                m2574a.setHeader(next.f35320a, next.f35321b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f35325a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f35326b);
        m2574a.setParams(basicHttpParams);
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(m2574a);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode != 200 && statusCode != 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            m2576a.getConnectionManager().shutdown();
            throw new Throwable(entityUtils);
        }
        InputStream content = execute.getEntity().getContent();
        if (abstractC10948h != null) {
            abstractC10948h.mo2442a(content);
        }
        content.close();
        m2576a.getConnectionManager().shutdown();
    }

    /* renamed from: a */
    public void m2567a(String str, AbstractC10948h abstractC10948h) {
        HttpGet httpGet = new HttpGet(str);
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() != 200) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            m2576a.getConnectionManager().shutdown();
            throw new Throwable(entityUtils);
        }
        InputStream content = execute.getEntity().getContent();
        if (abstractC10948h != null) {
            abstractC10948h.mo2442a(content);
        }
        content.close();
        m2576a.getConnectionManager().shutdown();
    }

    /* renamed from: b */
    public String m2565b(String str, ArrayList<C10944d<String>> arrayList, C10944d<String> c10944d, ArrayList<C10944d<String>> arrayList2) {
        if (arrayList != null) {
            String m2566a = m2566a(arrayList);
            if (m2566a.length() > 0) {
                str = String.valueOf(str) + C0363a.f360a + m2566a;
            }
        }
        HttpPut httpPut = new HttpPut(str);
        if (arrayList2 != null) {
            Iterator<C10944d<String>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C10944d<String> next = it2.next();
                httpPut.setHeader(next.f35320a, next.f35321b);
            }
        }
        C10942b c10942b = new C10942b();
        c10942b.m2581a(c10944d.f35321b);
        InputStreamEntity c = c10942b.c();
        c.setContentEncoding(RequestParams.APPLICATION_OCTET_STREAM);
        httpPut.setEntity(c);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f35325a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f35326b);
        httpPut.setParams(basicHttpParams);
        HttpClient m2576a = str.startsWith("https://") ? m2576a() : new DefaultHttpClient();
        HttpResponse execute = m2576a.execute(httpPut);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            m2576a.getConnectionManager().shutdown();
            return entityUtils;
        }
        String entityUtils2 = EntityUtils.toString(execute.getEntity(), "utf-8");
        m2576a.getConnectionManager().shutdown();
        throw new Throwable(entityUtils2);
    }
}
