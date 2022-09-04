package org.p286a.p287a.p306i.p312f;

import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.params.HttpParams;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11009c
/* renamed from: org.a.a.i.f.d */
/* loaded from: classes.dex */
class C11283d implements AbstractC11038b {

    /* renamed from: a */
    private final HttpResponse f36243a;

    /* renamed from: b */
    private final C11282c f36244b;

    public C11283d(HttpResponse httpResponse, C11282c c11282c) {
        this.f36243a = httpResponse;
        this.f36244b = c11282c;
        C11290k.m1513a(httpResponse, c11282c);
    }

    public void addHeader(String str, String str2) {
        this.f36243a.addHeader(str, str2);
    }

    public void addHeader(Header header) {
        this.f36243a.addHeader(header);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f36244b != null) {
            this.f36244b.abortConnection();
        }
    }

    public boolean containsHeader(String str) {
        return this.f36243a.containsHeader(str);
    }

    public Header[] getAllHeaders() {
        return this.f36243a.getAllHeaders();
    }

    public HttpEntity getEntity() {
        return this.f36243a.getEntity();
    }

    public Header getFirstHeader(String str) {
        return this.f36243a.getFirstHeader(str);
    }

    public Header[] getHeaders(String str) {
        return this.f36243a.getHeaders(str);
    }

    public Header getLastHeader(String str) {
        return this.f36243a.getLastHeader(str);
    }

    public Locale getLocale() {
        return this.f36243a.getLocale();
    }

    @Deprecated
    public HttpParams getParams() {
        return this.f36243a.getParams();
    }

    public ProtocolVersion getProtocolVersion() {
        return this.f36243a.getProtocolVersion();
    }

    public StatusLine getStatusLine() {
        return this.f36243a.getStatusLine();
    }

    public HeaderIterator headerIterator() {
        return this.f36243a.headerIterator();
    }

    public HeaderIterator headerIterator(String str) {
        return this.f36243a.headerIterator(str);
    }

    public void removeHeader(Header header) {
        this.f36243a.removeHeader(header);
    }

    public void removeHeaders(String str) {
        this.f36243a.removeHeaders(str);
    }

    public void setEntity(HttpEntity httpEntity) {
        this.f36243a.setEntity(httpEntity);
    }

    public void setHeader(String str, String str2) {
        this.f36243a.setHeader(str, str2);
    }

    public void setHeader(Header header) {
        this.f36243a.setHeader(header);
    }

    public void setHeaders(Header[] headerArr) {
        this.f36243a.setHeaders(headerArr);
    }

    public void setLocale(Locale locale) {
        this.f36243a.setLocale(locale);
    }

    @Deprecated
    public void setParams(HttpParams httpParams) {
        this.f36243a.setParams(httpParams);
    }

    public void setReasonPhrase(String str) {
        this.f36243a.setReasonPhrase(str);
    }

    public void setStatusCode(int i) {
        this.f36243a.setStatusCode(i);
    }

    public void setStatusLine(ProtocolVersion protocolVersion, int i) {
        this.f36243a.setStatusLine(protocolVersion, i);
    }

    public void setStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        this.f36243a.setStatusLine(protocolVersion, i, str);
    }

    public void setStatusLine(StatusLine statusLine) {
        this.f36243a.setStatusLine(statusLine);
    }

    public String toString() {
        return "HttpResponseProxy{" + this.f36243a + C0494h.f735w;
    }
}
