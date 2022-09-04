package org.p286a.p287a.p299f.p301b;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.f.b.c */
/* loaded from: classes2.dex */
public class C11109c implements AbstractC11107a {

    /* renamed from: a */
    public static final C11109c f35770a = new C11109c();

    /* renamed from: a */
    public static C11109c m2018a() {
        return f35770a;
    }

    @Override // org.p286a.p287a.p299f.p301b.AbstractC11107a
    /* renamed from: a */
    public Socket mo1992a(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) {
        if (socket == null) {
            socket = mo1987a(httpContext);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            return socket;
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException e2) {
            }
            throw e;
        }
    }

    @Override // org.p286a.p287a.p299f.p301b.AbstractC11107a
    /* renamed from: a */
    public Socket mo1987a(HttpContext httpContext) {
        return new Socket();
    }
}
