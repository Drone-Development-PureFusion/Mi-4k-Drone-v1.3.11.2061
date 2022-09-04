package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.WorkerThread;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.measurement.internal.ac */
/* loaded from: classes2.dex */
public class C8646ac extends AbstractC8683b {

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: com.google.android.gms.measurement.internal.ac$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8648a {
        /* renamed from: a */
        void mo10677a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map);
    }

    @WorkerThread
    /* renamed from: com.google.android.gms.measurement.internal.ac$b */
    /* loaded from: classes2.dex */
    private static class RunnableC8649b implements Runnable {

        /* renamed from: a */
        private final AbstractC8648a f27664a;

        /* renamed from: b */
        private final int f27665b;

        /* renamed from: c */
        private final Throwable f27666c;

        /* renamed from: d */
        private final byte[] f27667d;

        /* renamed from: e */
        private final String f27668e;

        /* renamed from: f */
        private final Map<String, List<String>> f27669f;

        private RunnableC8649b(String str, AbstractC8648a abstractC8648a, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
            C4588d.m23627a(abstractC8648a);
            this.f27664a = abstractC8648a;
            this.f27665b = i;
            this.f27666c = th;
            this.f27667d = bArr;
            this.f27668e = str;
            this.f27669f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27664a.mo10677a(this.f27668e, this.f27665b, this.f27666c, this.f27667d, this.f27669f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: com.google.android.gms.measurement.internal.ac$c */
    /* loaded from: classes2.dex */
    public class RunnableC8650c implements Runnable {

        /* renamed from: b */
        private final URL f27671b;

        /* renamed from: c */
        private final byte[] f27672c;

        /* renamed from: d */
        private final AbstractC8648a f27673d;

        /* renamed from: e */
        private final String f27674e;

        /* renamed from: f */
        private final Map<String, String> f27675f;

        public RunnableC8650c(String str, URL url, byte[] bArr, Map<String, String> map, AbstractC8648a abstractC8648a) {
            C4588d.m23625a(str);
            C4588d.m23627a(url);
            C4588d.m23627a(abstractC8648a);
            this.f27671b = url;
            this.f27672c = bArr;
            this.f27673d = abstractC8648a;
            this.f27674e = str;
            this.f27675f = map;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Throwable th;
            Map<String, List<String>> map;
            HttpURLConnection httpURLConnection;
            OutputStream outputStream;
            Map<String, List<String>> map2;
            int i;
            HttpURLConnection httpURLConnection2;
            C8646ac.this.mo10308i();
            int i2 = 0;
            try {
                C8646ac.this.m10826a(this.f27674e);
                httpURLConnection = C8646ac.this.m10822a(this.f27671b);
                try {
                    if (this.f27675f != null) {
                        for (Map.Entry<String, String> entry : this.f27675f.entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    if (this.f27672c != null) {
                        byte[] m10517a = C8646ac.this.mo10298s().m10517a(this.f27672c);
                        C8646ac.this.mo10294w().m10843E().m10830a("Uploading data. size", Integer.valueOf(m10517a.length));
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
                        httpURLConnection.setFixedLengthStreamingMode(m10517a.length);
                        httpURLConnection.connect();
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(m10517a);
                            outputStream.close();
                        } catch (IOException e) {
                            e = e;
                            map2 = null;
                            i = 0;
                            httpURLConnection2 = httpURLConnection;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e2) {
                                    C8646ac.this.mo10294w().m10834f().m10830a("Error closing HTTP compressed POST connection output stream", e2);
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            C8646ac.this.m10820g();
                            C8646ac.this.mo10295v().m10762a(new RunnableC8649b(this.f27674e, this.f27673d, i, e, null, map2));
                        } catch (Throwable th2) {
                            th = th2;
                            map = null;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    C8646ac.this.mo10294w().m10834f().m10830a("Error closing HTTP compressed POST connection output stream", e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C8646ac.this.m10820g();
                            C8646ac.this.mo10295v().m10762a(new RunnableC8649b(this.f27674e, this.f27673d, i2, null, null, map));
                            throw th;
                        }
                    }
                    i2 = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                } catch (IOException e4) {
                    e = e4;
                    map2 = null;
                    i = i2;
                    outputStream = null;
                    httpURLConnection2 = httpURLConnection;
                } catch (Throwable th3) {
                    th = th3;
                    map = null;
                    outputStream = null;
                }
            } catch (IOException e5) {
                e = e5;
                map2 = null;
                i = 0;
                outputStream = null;
                httpURLConnection2 = null;
            } catch (Throwable th4) {
                th = th4;
                map = null;
                httpURLConnection = null;
                outputStream = null;
            }
            try {
                byte[] m10823a = C8646ac.this.m10823a(httpURLConnection);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                C8646ac.this.m10820g();
                C8646ac.this.mo10295v().m10762a(new RunnableC8649b(this.f27674e, this.f27673d, i2, null, m10823a, map));
            } catch (IOException e6) {
                e = e6;
                map2 = map;
                i = i2;
                outputStream = null;
                httpURLConnection2 = httpURLConnection;
                if (outputStream != null) {
                }
                if (httpURLConnection2 != null) {
                }
                C8646ac.this.m10820g();
                C8646ac.this.mo10295v().m10762a(new RunnableC8649b(this.f27674e, this.f27673d, i, e, null, map2));
            } catch (Throwable th5) {
                th = th5;
                outputStream = null;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                C8646ac.this.m10820g();
                C8646ac.this.mo10295v().m10762a(new RunnableC8649b(this.f27674e, this.f27673d, i2, null, null, map));
                throw th;
            }
        }
    }

    public C8646ac(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public byte[] m10823a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @WorkerThread
    /* renamed from: a */
    protected HttpURLConnection m10822a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout((int) mo10292y().m10477H());
        httpURLConnection.setReadTimeout((int) mo10292y().m10476I());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* renamed from: a */
    protected void m10826a(String str) {
    }

    @WorkerThread
    /* renamed from: a */
    public void m10825a(String str, URL url, Map<String, String> map, AbstractC8648a abstractC8648a) {
        mo10307j();
        c();
        C4588d.m23627a(url);
        C4588d.m23627a(abstractC8648a);
        mo10295v().m10757b(new RunnableC8650c(str, url, null, map, abstractC8648a));
    }

    @WorkerThread
    /* renamed from: a */
    public void m10824a(String str, URL url, byte[] bArr, Map<String, String> map, AbstractC8648a abstractC8648a) {
        mo10307j();
        c();
        C4588d.m23627a(url);
        C4588d.m23627a(bArr);
        C4588d.m23627a(abstractC8648a);
        mo10295v().m10757b(new RunnableC8650c(str, url, bArr, map, abstractC8648a));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }

    /* renamed from: f */
    public boolean m10821f() {
        NetworkInfo networkInfo;
        c();
        try {
            networkInfo = ((ConnectivityManager) mo10300q().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* renamed from: g */
    protected void m10820g() {
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10309h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo10308i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo10307j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8725o mo10306k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C8685d mo10305l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8743z mo10304m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C8733s mo10303n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C8693e mo10302o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC4682e mo10301p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: q */
    public /* bridge */ /* synthetic */ Context mo10300q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8727q mo10299r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8723m mo10298s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8662ah mo10297t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: u */
    public /* bridge */ /* synthetic */ C8710g mo10296u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8663ai mo10295v() {
        return super.v();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8643ab mo10294w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: x */
    public /* bridge */ /* synthetic */ C8654af mo10293x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: y */
    public /* bridge */ /* synthetic */ C8726p mo10292y() {
        return super.y();
    }
}
