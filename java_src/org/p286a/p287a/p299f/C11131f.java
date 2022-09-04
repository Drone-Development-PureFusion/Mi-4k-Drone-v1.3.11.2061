package org.p286a.p287a.p299f;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.p286a.p287a.p320o.C11354a;
@Deprecated
/* renamed from: org.a.a.f.f */
/* loaded from: classes.dex */
public class C11131f extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;

    /* renamed from: a */
    private final HttpHost f35817a;

    public C11131f(HttpHost httpHost, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        C11354a.m1321a(httpHost, "HTTP host");
        this.f35817a = httpHost;
    }

    /* renamed from: a */
    public HttpHost m1958a() {
        return this.f35817a;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.f35817a.getHostName() + ":" + getPort();
    }
}
