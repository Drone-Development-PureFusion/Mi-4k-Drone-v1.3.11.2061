package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p315j.AbstractC11322c;
@AbstractC11009c
/* renamed from: org.a.a.i.c.o */
/* loaded from: classes2.dex */
class C11225o extends C11218h {

    /* renamed from: a */
    private static final String f36138a = "HttpClient";

    /* renamed from: b */
    private static final String f36139b = "Headers";

    /* renamed from: c */
    private final C11235u f36140c;

    public C11225o(String str, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, C11090c c11090c, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, AbstractC11322c<HttpRequest> abstractC11322c, AbstractC11321b<HttpResponse> abstractC11321b) {
        super(str, i, i2, charsetDecoder, charsetEncoder, c11090c, contentLengthStrategy, contentLengthStrategy2, abstractC11322c, abstractC11321b);
        this.f36140c = new C11235u(str);
    }

    @Override // org.p286a.p287a.p306i.C11209c
    /* renamed from: a */
    protected void mo1624a(HttpRequest httpRequest) {
        if (httpRequest == null || !Log.isLoggable(f36139b, 3)) {
            return;
        }
        Log.d(f36139b, a() + " >> " + httpRequest.getRequestLine().toString());
        Header[] allHeaders = httpRequest.getAllHeaders();
        int length = allHeaders.length;
        for (int i = 0; i < length; i++) {
            Log.d(f36139b, a() + " >> " + allHeaders[i].toString());
        }
    }

    @Override // org.p286a.p287a.p306i.C11209c
    /* renamed from: a */
    protected void mo1623a(HttpResponse httpResponse) {
        if (httpResponse == null || !Log.isLoggable(f36139b, 3)) {
            return;
        }
        Log.d(f36139b, a() + " << " + httpResponse.getStatusLine().toString());
        Header[] allHeaders = httpResponse.getAllHeaders();
        int length = allHeaders.length;
        for (int i = 0; i < length; i++) {
            Log.d(f36139b, a() + " << " + allHeaders[i].toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p306i.C11149a
    /* renamed from: b */
    public InputStream mo1622b(Socket socket) {
        InputStream b = super.b(socket);
        return this.f36140c.m1580a() ? new C11224n(b, this.f36140c) : b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p306i.C11149a
    /* renamed from: c */
    public OutputStream mo1621c(Socket socket) {
        OutputStream c = super.c(socket);
        return this.f36140c.m1580a() ? new C11226p(c, this.f36140c) : c;
    }

    @Override // org.p286a.p287a.p306i.C11149a
    public void close() {
        if (Log.isLoggable(f36138a, 3)) {
            Log.d(f36138a, a() + ": Close connection");
        }
        super.close();
    }

    @Override // org.p286a.p287a.p306i.p309c.C11218h, org.p286a.p287a.p306i.C11149a
    public void shutdown() {
        if (Log.isLoggable(f36138a, 3)) {
            Log.d(f36138a, a() + ": Shutdown connection");
        }
        super.shutdown();
    }
}
