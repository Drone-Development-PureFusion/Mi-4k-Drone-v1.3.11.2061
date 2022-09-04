package com.xiaomi.mistatistic.sdk.p269a;

import android.os.SystemClock;
import com.xiaomi.mistatistic.sdk.controller.C10529j;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;
/* renamed from: com.xiaomi.mistatistic.sdk.a.a */
/* loaded from: classes2.dex */
public class C10502a extends HttpURLConnection {

    /* renamed from: d */
    private C10505d f32623d;

    /* renamed from: e */
    private C10504c f32624e;

    /* renamed from: f */
    private HttpURLConnection f32625f;

    /* renamed from: b */
    private int f32621b = -1;

    /* renamed from: c */
    private boolean f32622c = false;

    /* renamed from: a */
    private long f32620a = SystemClock.elapsedRealtime();

    public C10502a(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.f32625f = httpURLConnection;
    }

    /* renamed from: c */
    private int m4889c() {
        int i = 0;
        int m4884a = this.f32624e != null ? this.f32624e.m4884a() : 0;
        if (this.f32623d != null) {
            i = this.f32623d.m4882a();
        }
        return m4884a + 1100 + i + getURL().toString().getBytes().length;
    }

    /* renamed from: a */
    public void m4893a() {
        m4890b();
    }

    /* renamed from: a */
    public void m4892a(long j) {
        this.f32620a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4891a(Exception exc) {
        if (!this.f32622c) {
            this.f32622c = true;
            C10529j.m4837a().m4834a(new HttpEvent(getURL().toString(), exc.getClass().getSimpleName()));
        }
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f32625f.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    void m4890b() {
        if (!this.f32622c) {
            this.f32622c = true;
            C10529j.m4837a().m4834a(this.f32621b == -1 ? new HttpEvent(getURL().toString(), SystemClock.elapsedRealtime() - this.f32620a) : new HttpEvent(getURL().toString(), SystemClock.elapsedRealtime() - this.f32620a, m4889c(), this.f32621b));
        }
    }

    @Override // java.net.URLConnection
    public void connect() {
        try {
            this.f32625f.connect();
        } catch (IOException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f32625f.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f32625f.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f32625f.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        try {
            return this.f32625f.getContent();
        } catch (IOException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        try {
            return this.f32625f.getContent(clsArr);
        } catch (IOException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f32625f.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f32625f.getContentLength();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f32625f.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f32625f.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f32625f.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f32625f.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f32625f.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f32625f.getErrorStream();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f32625f.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f32625f.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f32625f.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f32625f.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f32625f.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f32625f.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f32625f.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f32625f.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        try {
            this.f32624e = new C10504c(this, this.f32625f.getInputStream());
            return this.f32624e;
        } catch (IOException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f32625f.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f32625f.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        try {
            this.f32623d = new C10505d(this, this.f32625f.getOutputStream());
            return this.f32623d;
        } catch (IOException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        try {
            return this.f32625f.getPermission();
        } catch (ProtocolException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f32625f.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f32625f.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f32625f.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f32625f.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        try {
            this.f32621b = this.f32625f.getResponseCode();
            return this.f32621b;
        } catch (ProtocolException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        try {
            return this.f32625f.getResponseMessage();
        } catch (ProtocolException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f32625f.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f32625f.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f32625f.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.f32625f.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f32625f.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f32625f.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f32625f.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f32625f.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.f32625f.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        try {
            this.f32625f.getClass().getDeclaredMethod("setFixedLengthStreamingMode", Long.TYPE).invoke(this.f32625f, Long.valueOf(j));
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f32625f.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.f32625f.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f32625f.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        try {
            this.f32625f.setRequestMethod(str);
        } catch (ProtocolException e) {
            m4891a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f32625f.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f32625f.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f32625f.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f32625f.usingProxy();
    }
}
