package org.p286a.p287a.p320o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: org.a.a.o.e */
/* loaded from: classes2.dex */
public final class C11358e {
    /* renamed from: a */
    public static void m1298a(StringBuilder sb, SocketAddress socketAddress) {
        C11354a.m1321a(sb, "Buffer");
        C11354a.m1321a(socketAddress, "Socket address");
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        InetAddress address = inetSocketAddress.getAddress();
        String str = address;
        if (address != null) {
            str = address.getHostAddress();
        }
        sb.append((Object) str).append(C0494h.f680A).append(inetSocketAddress.getPort());
    }
}
