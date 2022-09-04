package com.google.android.gms.analytics.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.google.android.gms.common.internal.C4588d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.p286a.p287a.C11086e;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.analytics.internal.i */
/* loaded from: classes2.dex */
public class C3895i extends AbstractC3920t {

    /* renamed from: c */
    private static final byte[] f15094c = "\n".getBytes();

    /* renamed from: a */
    private final String f15095a = m26271a("GoogleAnalytics", C3921u.f15153a, Build.VERSION.RELEASE, C3909p.m26193a(Locale.getDefault()), Build.MODEL, Build.ID);

    /* renamed from: b */
    private final C3905m f15096b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.analytics.internal.i$a */
    /* loaded from: classes2.dex */
    public class C3896a {

        /* renamed from: b */
        private int f15098b;

        /* renamed from: c */
        private ByteArrayOutputStream f15099c = new ByteArrayOutputStream();

        public C3896a() {
        }

        /* renamed from: a */
        public int m26254a() {
            return this.f15098b;
        }

        /* renamed from: a */
        public boolean m26253a(C3887c c3887c) {
            C4588d.m23627a(c3887c);
            if (this.f15098b + 1 > C3895i.this.q().m26371m()) {
                return false;
            }
            String m26273a = C3895i.this.m26273a(c3887c, false);
            if (m26273a == null) {
                C3895i.this.p().m26290a(c3887c, "Error formatting hit");
                return true;
            }
            byte[] bytes = m26273a.getBytes();
            int length = bytes.length;
            if (length > C3895i.this.q().m26379e()) {
                C3895i.this.p().m26290a(c3887c, "Hit size exceeds the maximum size limit");
                return true;
            }
            if (this.f15099c.size() > 0) {
                length++;
            }
            if (length + this.f15099c.size() > C3895i.this.q().m26377g()) {
                return false;
            }
            try {
                if (this.f15099c.size() > 0) {
                    this.f15099c.write(C3895i.f15094c);
                }
                this.f15099c.write(bytes);
                this.f15098b++;
                return true;
            } catch (IOException e) {
                C3895i.this.e("Failed to write payload when batching hits", e);
                return true;
            }
        }

        /* renamed from: b */
        public byte[] m26252b() {
            return this.f15099c.toByteArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3895i(C3922v c3922v) {
        super(c3922v);
        this.f15096b = new C3905m(c3922v.m26110d());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m26267a(URL url, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream = null;
        C4588d.m23627a(url);
        C4588d.m23627a(bArr);
        b("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (B()) {
            a("Post payload\n", new String(bArr));
        }
        try {
            m26272a(o().getPackageName());
            httpURLConnection = m26268a(url);
            try {
                try {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                    httpURLConnection.connect();
                    outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    m26269a(httpURLConnection);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        t().m26157i();
                    }
                    b("POST status", Integer.valueOf(responseCode));
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e("Error closing http post connection output stream", e);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m26258c();
                    return responseCode;
                } catch (IOException e2) {
                    e = e2;
                    d("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            e("Error closing http post connection output stream", e3);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m26258c();
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e4) {
                        e("Error closing http post connection output stream", e4);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                m26258c();
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            m26258c();
            throw th;
        }
    }

    /* renamed from: a */
    private static String m26271a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", str, str2, str3, str4, str5, str6);
    }

    /* renamed from: a */
    private URL m26274a(C3887c c3887c, String str) {
        String sb;
        if (c3887c.m26306f()) {
            String valueOf = String.valueOf(q().m26369o());
            String valueOf2 = String.valueOf(q().m26367q());
            sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length() + String.valueOf(str).length()).append(valueOf).append(valueOf2).append(C0363a.f360a).append(str).toString();
        } else {
            String valueOf3 = String.valueOf(q().m26368p());
            String valueOf4 = String.valueOf(q().m26367q());
            sb = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(valueOf4).length() + String.valueOf(str).length()).append(valueOf3).append(valueOf4).append(C0363a.f360a).append(str).toString();
        }
        try {
            return new URL(sb);
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m26270a(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* renamed from: a */
    private void m26269a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream == null) {
                return;
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e("Error closing http connection input stream", e);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e("Error closing http connection input stream", e2);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    private boolean m26275a(C3887c c3887c) {
        C4588d.m23627a(c3887c);
        String m26273a = m26273a(c3887c, !c3887c.m26306f());
        if (m26273a == null) {
            p().m26290a(c3887c, "Error formatting hit for upload");
            return true;
        } else if (m26273a.length() <= q().m26380d()) {
            URL m26274a = m26274a(c3887c, m26273a);
            if (m26274a != null) {
                return m26261b(m26274a) == 200;
            }
            u("Failed to build collect GET endpoint url");
            return false;
        } else {
            String m26273a2 = m26273a(c3887c, false);
            if (m26273a2 == null) {
                p().m26290a(c3887c, "Error formatting hit for POST upload");
                return true;
            }
            byte[] bytes = m26273a2.getBytes();
            if (bytes.length > q().m26378f()) {
                p().m26290a(c3887c, "Hit payload exceeds size limit");
                return true;
            }
            URL m26262b = m26262b(c3887c);
            if (m26262b != null) {
                return m26267a(m26262b, bytes) == 200;
            }
            u("Failed to build collect POST endpoint url");
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m26264a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    private int m26261b(URL url) {
        C4588d.m23627a(url);
        b("GET request", url);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = m26268a(url);
                httpURLConnection.connect();
                m26269a(httpURLConnection);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    t().m26157i();
                }
                b("GET status", Integer.valueOf(responseCode));
                if (httpURLConnection == null) {
                    return responseCode;
                }
                httpURLConnection.disconnect();
                return responseCode;
            } catch (IOException e) {
                d("Network GET connection error", e);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m26260b(URL url, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream = null;
        C4588d.m23627a(url);
        C4588d.m23627a(bArr);
        try {
            m26272a(o().getPackageName());
            byte[] m26264a = m26264a(bArr);
            a("POST compressed size, ratio %, url", Integer.valueOf(m26264a.length), Long.valueOf((100 * m26264a.length) / bArr.length), url);
            if (m26264a.length > bArr.length) {
                c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(m26264a.length), Integer.valueOf(bArr.length));
            }
            if (B()) {
                String valueOf = String.valueOf(new String(bArr));
                a("Post payload", valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n"));
            }
            httpURLConnection = m26268a(url);
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
                httpURLConnection.setFixedLengthStreamingMode(m26264a.length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(m26264a);
                    outputStream2.close();
                    m26269a(httpURLConnection);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        t().m26157i();
                    }
                    b("POST status", Integer.valueOf(responseCode));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m26258c();
                    return responseCode;
                } catch (IOException e) {
                    e = e;
                    outputStream = outputStream2;
                    httpURLConnection2 = httpURLConnection;
                    try {
                        d("Network compressed POST connection error", e);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e2) {
                                e("Error closing http compressed post connection output stream", e2);
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        m26258c();
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                e("Error closing http compressed post connection output stream", e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m26258c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    m26258c();
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                httpURLConnection2 = httpURLConnection;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection2 = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    /* renamed from: b */
    private URL m26262b(C3887c c3887c) {
        String concat;
        if (c3887c.m26306f()) {
            String valueOf = String.valueOf(q().m26369o());
            String valueOf2 = String.valueOf(q().m26367q());
            concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            String valueOf3 = String.valueOf(q().m26368p());
            String valueOf4 = String.valueOf(q().m26367q());
            concat = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: c */
    private String m26257c(C3887c c3887c) {
        return String.valueOf(c3887c.m26309c());
    }

    /* renamed from: e */
    private URL m26255e() {
        String valueOf = String.valueOf(q().m26369o());
        String valueOf2 = String.valueOf(q().m26366r());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: a */
    String m26273a(C3887c c3887c, boolean z) {
        C4588d.m23627a(c3887c);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : c3887c.m26311b().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    m26270a(sb, key, entry.getValue());
                }
            }
            m26270a(sb, "ht", String.valueOf(c3887c.m26308d()));
            m26270a(sb, "qt", String.valueOf(n().mo16434a() - c3887c.m26308d()));
            if (q().m26383a()) {
                m26270a(sb, "_gmsv", C3921u.f15153a);
            }
            if (z) {
                long m26305g = c3887c.m26305g();
                m26270a(sb, "z", m26305g != 0 ? String.valueOf(m26305g) : m26257c(c3887c));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e("Failed to encode name or value", e);
            return null;
        }
    }

    /* renamed from: a */
    HttpURLConnection m26268a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(q().m26387D());
        httpURLConnection.setReadTimeout(q().m26386E());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty(C11086e.f35703Y, this.f15095a);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* renamed from: a */
    public List<Long> m26266a(List<C3887c> list) {
        boolean z;
        boolean z2 = true;
        m();
        D();
        C4588d.m23627a(list);
        if (q().m26363u().isEmpty() || !this.f15096b.m26221a(q().m26370n() * 1000)) {
            z2 = false;
            z = false;
        } else {
            z = q().m26365s() != EnumC3866ac.NONE;
            if (q().m26364t() != EnumC3870ae.GZIP) {
                z2 = false;
            }
        }
        return z ? m26265a(list, z2) : m26259b(list);
    }

    /* renamed from: a */
    List<Long> m26265a(List<C3887c> list, boolean z) {
        C4588d.m23619b(!list.isEmpty());
        a("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
        C3896a c3896a = new C3896a();
        ArrayList arrayList = new ArrayList();
        for (C3887c c3887c : list) {
            if (!c3896a.m26253a(c3887c)) {
                break;
            }
            arrayList.add(Long.valueOf(c3887c.m26309c()));
        }
        if (c3896a.m26254a() == 0) {
            return arrayList;
        }
        URL m26255e = m26255e();
        if (m26255e == null) {
            u("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int m26260b = z ? m26260b(m26255e, c3896a.m26252b()) : m26267a(m26255e, c3896a.m26252b());
        if (200 == m26260b) {
            a("Batched upload completed. Hits batched", Integer.valueOf(c3896a.m26254a()));
            return arrayList;
        }
        a("Network error uploading hits. status code", Integer.valueOf(m26260b));
        if (q().m26363u().contains(Integer.valueOf(m26260b))) {
            t("Server instructed the client to stop batching");
            this.f15096b.m26222a();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        a("Network initialized. User agent", this.f15095a);
    }

    /* renamed from: a */
    protected void m26272a(String str) {
    }

    /* renamed from: b */
    List<Long> m26259b(List<C3887c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C3887c c3887c : list) {
            if (!m26275a(c3887c)) {
                break;
            }
            arrayList.add(Long.valueOf(c3887c.m26309c()));
            if (arrayList.size() >= q().m26372l()) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean m26263b() {
        NetworkInfo networkInfo;
        m();
        D();
        try {
            networkInfo = ((ConnectivityManager) o().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            q("No network connectivity");
            return false;
        }
        return true;
    }

    /* renamed from: c */
    protected void m26258c() {
    }
}
