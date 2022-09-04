package org.p286a.p287a.p299f.p300a;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;
@Deprecated
/* renamed from: org.a.a.f.a.e */
/* loaded from: classes.dex */
class C11102e implements AbstractC11100c {

    /* renamed from: a */
    private final AbstractC11098a f35767a;

    C11102e(AbstractC11098a abstractC11098a) {
        this.f35767a = abstractC11098a;
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11100c
    /* renamed from: a */
    public Socket mo2024a(Socket socket, String str, int i, HttpParams httpParams) {
        return this.f35767a.m2025a(socket, str, i, true);
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11103f
    /* renamed from: a */
    public Socket mo2021a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        return this.f35767a.a(socket, inetSocketAddress, inetSocketAddress2, httpParams);
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11103f
    /* renamed from: a */
    public Socket mo2020a(HttpParams httpParams) {
        return this.f35767a.a(httpParams);
    }

    @Override // org.p286a.p287a.p299f.p300a.AbstractC11103f
    /* renamed from: a */
    public boolean mo2022a(Socket socket) {
        return this.f35767a.a(socket);
    }
}
