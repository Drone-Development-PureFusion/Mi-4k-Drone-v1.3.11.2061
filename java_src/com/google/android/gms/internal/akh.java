package com.google.android.gms.internal;

import android.os.SystemClock;
import com.google.android.gms.internal.AbstractC7674ru;
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
/* loaded from: classes2.dex */
public class akh implements AbstractC7888vy {

    /* renamed from: a */
    protected static final boolean f22123a = ajg.f22012b;

    /* renamed from: d */
    private static int f22124d = 3000;

    /* renamed from: e */
    private static int f22125e = 4096;

    /* renamed from: b */
    protected final apm f22126b;

    /* renamed from: c */
    protected final ali f22127c;

    public akh(apm apmVar) {
        this(apmVar, new ali(f22125e));
    }

    public akh(apm apmVar, ali aliVar) {
        this.f22126b = apmVar;
        this.f22127c = aliVar;
    }

    /* renamed from: a */
    protected static Map<String, String> m17036a(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    /* renamed from: a */
    private void m17040a(long j, abd<?> abdVar, byte[] bArr, StatusLine statusLine) {
        if (f22123a || j > f22124d) {
            Object[] objArr = new Object[5];
            objArr[0] = abdVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(abdVar.m18491s().mo13505b());
            ajg.m17131b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    private static void m17039a(String str, abd<?> abdVar, aii aiiVar) {
        afg m18491s = abdVar.m18491s();
        int m18492r = abdVar.m18492r();
        try {
            m18491s.mo13506a(aiiVar);
            abdVar.m18507b(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(m18492r)));
        } catch (aii e) {
            abdVar.m18507b(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m18492r)));
            throw e;
        }
    }

    /* renamed from: a */
    private void m17038a(Map<String, String> map, AbstractC7674ru.C7675a c7675a) {
        if (c7675a == null) {
            return;
        }
        if (c7675a.f25471b != null) {
            map.put(C11086e.f35682D, c7675a.f25471b);
        }
        if (c7675a.f25473d <= 0) {
            return;
        }
        map.put(C11086e.f35681C, DateUtils.formatDate(new Date(c7675a.f25473d)));
    }

    /* renamed from: a */
    private byte[] m17037a(HttpEntity httpEntity) {
        C6768b c6768b = new C6768b(this.f22127c, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new agh();
            }
            byte[] m16953a = this.f22127c.m16953a(1024);
            while (true) {
                int read = content.read(m16953a);
                if (read == -1) {
                    break;
                }
                c6768b.write(m16953a, 0, read);
            }
            byte[] byteArray = c6768b.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                ajg.m17133a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f22127c.m16952a(m16953a);
            c6768b.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                ajg.m17133a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f22127c.m16952a((byte[]) null);
            c6768b.close();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7888vy
    /* renamed from: a */
    public C8092zb mo13293a(abd<?> abdVar) {
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> emptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap hashMap = new HashMap();
                    m17038a(hashMap, abdVar.m18503e());
                    HttpResponse mo16214a = this.f22126b.mo16214a(abdVar, hashMap);
                    try {
                        StatusLine statusLine = mo16214a.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        emptyMap = m17036a(mo16214a.getAllHeaders());
                        if (statusCode == 304) {
                            AbstractC7674ru.C7675a m18503e = abdVar.m18503e();
                            if (m18503e == null) {
                                return new C8092zb(304, null, emptyMap, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            m18503e.f25476g.putAll(emptyMap);
                            return new C8092zb(304, m18503e.f25470a, m18503e.f25476g, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                        }
                        byte[] m17037a = mo16214a.getEntity() != null ? m17037a(mo16214a.getEntity()) : new byte[0];
                        try {
                            m17040a(SystemClock.elapsedRealtime() - elapsedRealtime, abdVar, m17037a, statusLine);
                            if (statusCode >= 200 && statusCode <= 299) {
                                return new C8092zb(statusCode, m17037a, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            throw new IOException();
                        } catch (IOException e) {
                            e = e;
                            bArr = m17037a;
                            httpResponse = mo16214a;
                            if (httpResponse == null) {
                                throw new aac(e);
                            }
                            int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                            ajg.m17130c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), abdVar.m18506c());
                            if (bArr == null) {
                                throw new C8028ya((C8092zb) null);
                            }
                            C8092zb c8092zb = new C8092zb(statusCode2, bArr, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                            if (statusCode2 != 401 && statusCode2 != 403) {
                                throw new agh(c8092zb);
                            }
                            m17039a("auth", abdVar, new C6103a(c8092zb));
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bArr = null;
                        httpResponse = mo16214a;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                }
            } catch (MalformedURLException e4) {
                String valueOf = String.valueOf(abdVar.m18506c());
                throw new RuntimeException(valueOf.length() != 0 ? "Bad URL ".concat(valueOf) : new String("Bad URL "), e4);
            } catch (SocketTimeoutException e5) {
                m17039a("socket", abdVar, new ahi());
            } catch (ConnectTimeoutException e6) {
                m17039a("connection", abdVar, new ahi());
            }
        }
    }
}
