package org.p286a.p287a.p299f.p300a;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpParams;
@Deprecated
/* renamed from: org.a.a.f.a.d */
/* loaded from: classes.dex */
class C11101d extends C11104g implements AbstractC11100c {

    /* renamed from: a */
    private final LayeredSocketFactory f35766a;

    C11101d(LayeredSocketFactory layeredSocketFactory) {
        super(layeredSocketFactory);
        this.f35766a = layeredSocketFactory;
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11100c
    /* renamed from: a */
    public Socket mo2024a(Socket socket, String str, int i, HttpParams httpParams) {
        return this.f35766a.createSocket(socket, str, i, true);
    }
}
