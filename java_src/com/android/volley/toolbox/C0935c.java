package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AbstractC0900b;
import com.android.volley.AbstractC0909g;
import com.android.volley.AbstractC0916n;
import com.android.volley.AbstractC0928r;
import com.android.volley.C0899a;
import com.android.volley.C0911i;
import com.android.volley.C0912j;
import com.android.volley.C0913k;
import com.android.volley.C0915m;
import com.android.volley.C0929s;
import com.android.volley.C0930t;
import com.android.volley.C0967u;
import com.android.volley.C0968v;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;
import org.p286a.p287a.C11086e;
/* renamed from: com.android.volley.toolbox.c */
/* loaded from: classes.dex */
public class C0935c implements AbstractC0909g {

    /* renamed from: a */
    protected static final boolean f2084a = C0968v.f2167b;

    /* renamed from: d */
    private static int f2085d = 3000;

    /* renamed from: e */
    private static int f2086e = 4096;

    /* renamed from: b */
    protected final AbstractC0946i f2087b;

    /* renamed from: c */
    protected final C0936d f2088c;

    public C0935c(AbstractC0946i abstractC0946i) {
        this(abstractC0946i, new C0936d(f2086e));
    }

    public C0935c(AbstractC0946i abstractC0946i, C0936d c0936d) {
        this.f2087b = abstractC0946i;
        this.f2088c = c0936d;
    }

    /* renamed from: a */
    protected static Map<String, String> m37361a(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    /* renamed from: a */
    private void m37367a(long j, AbstractC0916n<?> abstractC0916n, byte[] bArr, StatusLine statusLine) {
        if (f2084a || j > f2085d) {
            Object[] objArr = new Object[5];
            objArr[0] = abstractC0916n;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(abstractC0916n.m37397z().mo37376b());
            C0968v.m37260b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    private static void m37365a(String str, AbstractC0916n<?> abstractC0916n, C0967u c0967u) {
        AbstractC0928r m37397z = abstractC0916n.m37397z();
        int m37398y = abstractC0916n.m37398y();
        try {
            m37397z.mo37377a(c0967u);
            abstractC0916n.m37421a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(m37398y)));
        } catch (C0967u e) {
            abstractC0916n.m37421a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m37398y)));
            throw e;
        }
    }

    /* renamed from: a */
    private void m37363a(Map<String, String> map, AbstractC0900b.C0901a c0901a) {
        if (c0901a == null) {
            return;
        }
        if (c0901a.f1980b != null) {
            map.put(C11086e.f35682D, c0901a.f1980b);
        }
        if (c0901a.f1982d <= 0) {
            return;
        }
        map.put(C11086e.f35681C, DateUtils.formatDate(new Date(c0901a.f1982d)));
    }

    /* renamed from: a */
    private byte[] m37362a(HttpEntity httpEntity) {
        C0963q c0963q = new C0963q(this.f2088c, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new C0929s();
            }
            byte[] m37359a = this.f2088c.m37359a(1024);
            while (true) {
                int read = content.read(m37359a);
                if (read == -1) {
                    break;
                }
                c0963q.write(m37359a, 0, read);
            }
            byte[] byteArray = c0963q.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                C0968v.m37262a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f2088c.m37358a(m37359a);
            c0963q.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                C0968v.m37262a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f2088c.m37358a((byte[]) null);
            c0963q.close();
            throw th;
        }
    }

    @Override // com.android.volley.AbstractC0909g
    /* renamed from: a */
    public C0912j mo37366a(AbstractC0916n<?> abstractC0916n) {
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> emptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap hashMap = new HashMap();
                    m37363a(hashMap, abstractC0916n.m37405k());
                    HttpResponse mo37326a = this.f2087b.mo37326a(abstractC0916n, hashMap);
                    try {
                        StatusLine statusLine = mo37326a.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        emptyMap = m37361a(mo37326a.getAllHeaders());
                        if (statusCode == 304) {
                            AbstractC0900b.C0901a m37405k = abstractC0916n.m37405k();
                            if (m37405k == null) {
                                return new C0912j(304, null, emptyMap, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            m37405k.f1985g.putAll(emptyMap);
                            return new C0912j(304, m37405k.f1979a, m37405k.f1985g, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                        }
                        if (statusCode == 301 || statusCode == 302) {
                            abstractC0916n.m37413c(emptyMap.get(C11086e.f35686H));
                        }
                        byte[] m37362a = mo37326a.getEntity() != null ? m37362a(mo37326a.getEntity()) : new byte[0];
                        try {
                            m37367a(SystemClock.elapsedRealtime() - elapsedRealtime, abstractC0916n, m37362a, statusLine);
                            if (statusCode >= 200 && statusCode <= 299) {
                                return new C0912j(statusCode, m37362a, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            throw new IOException();
                        } catch (IOException e) {
                            e = e;
                            bArr = m37362a;
                            httpResponse = mo37326a;
                            if (httpResponse == null) {
                                throw new C0913k(e);
                            }
                            int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                            if (statusCode2 == 301 || statusCode2 == 302) {
                                C0968v.m37258c("Request at %s has been redirected to %s", abstractC0916n.m37408h(), abstractC0916n.m37409g());
                            } else {
                                C0968v.m37258c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), abstractC0916n.m37409g());
                            }
                            if (bArr == null) {
                                throw new C0911i(e);
                            }
                            C0912j c0912j = new C0912j(statusCode2, bArr, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                            if (statusCode2 == 401 || statusCode2 == 403) {
                                m37365a("auth", abstractC0916n, new C0899a(c0912j));
                            } else if (statusCode2 != 301 && statusCode2 != 302) {
                                throw new C0929s(c0912j);
                            } else {
                                m37365a("redirect", abstractC0916n, new C0915m(c0912j));
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bArr = null;
                        httpResponse = mo37326a;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                }
            } catch (MalformedURLException e4) {
                throw new RuntimeException("Bad URL " + abstractC0916n.m37409g(), e4);
            } catch (SocketTimeoutException e5) {
                m37365a("socket", abstractC0916n, new C0930t());
            } catch (ConnectTimeoutException e6) {
                m37365a("connection", abstractC0916n, new C0930t());
            }
        }
    }

    /* renamed from: a */
    protected void m37364a(String str, String str2, long j) {
        C0968v.m37262a("HTTP ERROR(%s) %d ms to fetch %s", str, Long.valueOf(SystemClock.elapsedRealtime() - j), str2);
    }
}
