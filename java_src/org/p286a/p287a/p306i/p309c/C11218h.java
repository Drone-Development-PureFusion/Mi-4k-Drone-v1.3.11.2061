package org.p286a.p287a.p306i.p309c;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p299f.AbstractC11133h;
import org.p286a.p287a.p306i.C11209c;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p315j.AbstractC11322c;
@AbstractC11009c
/* renamed from: org.a.a.i.c.h */
/* loaded from: classes2.dex */
public class C11218h extends C11209c implements AbstractC11133h, HttpContext {

    /* renamed from: a */
    private final String f36123a;

    /* renamed from: b */
    private final Map<String, Object> f36124b;

    /* renamed from: c */
    private volatile boolean f36125c;

    public C11218h(String str, int i) {
        this(str, i, i, null, null, null, null, null, null, null);
    }

    public C11218h(String str, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, C11090c c11090c, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, AbstractC11322c<HttpRequest> abstractC11322c, AbstractC11321b<HttpResponse> abstractC11321b) {
        super(i, i2, charsetDecoder, charsetEncoder, c11090c, contentLengthStrategy, contentLengthStrategy2, abstractC11322c, abstractC11321b);
        this.f36123a = str;
        this.f36124b = new ConcurrentHashMap();
    }

    @Override // org.p286a.p287a.p299f.AbstractC11133h
    /* renamed from: a */
    public String mo1633a() {
        return this.f36123a;
    }

    @Override // org.p286a.p287a.p306i.C11209c, org.p286a.p287a.p306i.C11149a
    /* renamed from: a */
    public void mo1537a(Socket socket) {
        if (this.f36125c) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        } else {
            super.mo1537a(socket);
        }
    }

    @Override // org.p286a.p287a.p306i.C11149a, org.p286a.p287a.p299f.AbstractC11133h
    /* renamed from: b */
    public Socket mo1632b() {
        return super.b();
    }

    @Override // org.p286a.p287a.p299f.AbstractC11133h
    /* renamed from: c */
    public SSLSession mo1631c() {
        Socket b = super.b();
        if (b instanceof SSLSocket) {
            return ((SSLSocket) b).getSession();
        }
        return null;
    }

    public Object getAttribute(String str) {
        return this.f36124b.get(str);
    }

    public Object removeAttribute(String str) {
        return this.f36124b.remove(str);
    }

    public void setAttribute(String str, Object obj) {
        this.f36124b.put(str, obj);
    }

    @Override // org.p286a.p287a.p306i.C11149a
    public void shutdown() {
        this.f36125c = true;
        super.shutdown();
    }
}
