package org.p286a.p287a.p299f.p300a;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
@Deprecated
/* renamed from: org.a.a.f.a.b */
/* loaded from: classes.dex */
class C11099b extends C11105h implements LayeredSocketFactory {

    /* renamed from: a */
    private final AbstractC11098a f35765a;

    C11099b(AbstractC11098a abstractC11098a) {
        super(abstractC11098a);
        this.f35765a = abstractC11098a;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f35765a.m2025a(socket, str, i, z);
    }
}
