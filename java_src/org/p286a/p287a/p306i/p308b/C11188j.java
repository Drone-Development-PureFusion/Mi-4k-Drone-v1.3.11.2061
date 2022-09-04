package org.p286a.p287a.p306i.p308b;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.p286a.p287a.p290c.AbstractC11057d;
/* renamed from: org.a.a.i.b.j */
/* loaded from: classes2.dex */
public class C11188j implements AbstractC11057d {
    @Override // org.p286a.p287a.p290c.AbstractC11057d
    /* renamed from: a */
    public boolean mo1763a(Throwable th) {
        return (th instanceof SocketTimeoutException) || (th instanceof ConnectException);
    }

    @Override // org.p286a.p287a.p290c.AbstractC11057d
    /* renamed from: a */
    public boolean mo1762a(HttpResponse httpResponse) {
        return httpResponse.getStatusLine().getStatusCode() == 503;
    }
}
