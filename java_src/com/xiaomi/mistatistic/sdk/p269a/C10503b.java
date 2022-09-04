package com.xiaomi.mistatistic.sdk.p269a;

import android.os.SystemClock;
import com.xiaomi.mistatistic.sdk.controller.C10529j;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: com.xiaomi.mistatistic.sdk.a.b */
/* loaded from: classes2.dex */
public class C10503b extends HttpsURLConnection {

    /* renamed from: d */
    private HttpsURLConnection f32629d;

    /* renamed from: b */
    private int f32627b = -1;

    /* renamed from: c */
    private boolean f32628c = false;

    /* renamed from: a */
    private long f32626a = SystemClock.elapsedRealtime();

    public C10503b(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection.getURL());
        this.f32629d = httpsURLConnection;
    }

    /* renamed from: a */
    public void m4888a() {
        m4885b();
    }

    /* renamed from: a */
    public void m4887a(long j) {
        this.f32626a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4886a(Exception exc) {
        if (!this.f32628c) {
            this.f32628c = true;
            C10529j.m4837a().m4834a(new HttpEvent(getURL().toString(), exc.getClass().getSimpleName()));
        }
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f32629d.addRequestProperty(str, str2);
    }

    /* renamed from: b */
    public void m4885b() {
        if (!this.f32628c) {
            this.f32628c = true;
            C10529j.m4837a().m4834a(this.f32627b == -1 ? new HttpEvent(getURL().toString(), SystemClock.elapsedRealtime() - this.f32626a) : new HttpEvent(getURL().toString(), SystemClock.elapsedRealtime() - this.f32626a, 0L, this.f32627b));
        }
    }

    @Override // java.net.URLConnection
    public void connect() {
        try {
            this.f32629d.connect();
        } catch (IOException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f32629d.disconnect();
        m4885b();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f32629d.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f32629d.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f32629d.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f32629d.getContent();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        try {
            return this.f32629d.getContent(clsArr);
        } catch (IOException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f32629d.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f32629d.getContentLength();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f32629d.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f32629d.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f32629d.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f32629d.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f32629d.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f32629d.getErrorStream();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f32629d.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.f32629d.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f32629d.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.f32629d.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.f32629d.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.f32629d.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public Map getHeaderFields() {
        return this.f32629d.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f32629d.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f32629d.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        try {
            return new C10504c(this, this.f32629d.getInputStream());
        } catch (IOException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f32629d.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f32629d.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f32629d.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f32629d.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        try {
            return new C10505d(this, this.f32629d.getOutputStream());
        } catch (IOException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        try {
            return this.f32629d.getPeerPrincipal();
        } catch (SSLPeerUnverifiedException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        try {
            return this.f32629d.getPermission();
        } catch (IOException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f32629d.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f32629d.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map getRequestProperties() {
        return this.f32629d.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f32629d.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        try {
            this.f32627b = this.f32629d.getResponseCode();
            return this.f32627b;
        } catch (IOException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        try {
            return this.f32629d.getResponseMessage();
        } catch (IOException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f32629d.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        try {
            return this.f32629d.getServerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f32629d.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f32629d.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.f32629d.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.f32629d.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.f32629d.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.f32629d.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.f32629d.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.f32629d.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.f32629d.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        try {
            this.f32629d.getClass().getMethod("setFixedLengthStreamingMode", Long.TYPE).invoke(this.f32629d, Long.valueOf(j));
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f32629d.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.f32629d.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.f32629d.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.f32629d.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        try {
            this.f32629d.setRequestMethod(str);
        } catch (ProtocolException e) {
            m4886a(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f32629d.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f32629d.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.f32629d.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f32629d.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f32629d.usingProxy();
    }
}
