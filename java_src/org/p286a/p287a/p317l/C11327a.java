package org.p286a.p287a.p317l;

import java.nio.charset.Charset;
import org.apache.http.params.HttpParams;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p298e.C11094f;
@Deprecated
/* renamed from: org.a.a.l.a */
/* loaded from: classes.dex */
public final class C11327a {
    private C11327a() {
    }

    /* renamed from: a */
    public static C11094f m1428a(HttpParams httpParams) {
        return C11094f.m2032g().m2030a(httpParams.getIntParameter("http.socket.timeout", 0)).m2028b(httpParams.getIntParameter("http.socket.linger", -1)).m2026c(httpParams.getBooleanParameter("http.tcp.nodelay", true)).m2031a();
    }

    /* renamed from: b */
    public static C11090c m1427b(HttpParams httpParams) {
        return C11090c.m2047d().m2044b(httpParams.getIntParameter("http.connection.max-header-count", -1)).m2045a(httpParams.getIntParameter("http.connection.max-line-length", -1)).m2046a();
    }

    /* renamed from: c */
    public static C11087a m1426c(HttpParams httpParams) {
        C11090c m1427b = m1427b(httpParams);
        String str = (String) httpParams.getParameter("http.protocol.element-charset");
        return C11087a.m2060h().m2057a(str != null ? Charset.forName(str) : null).m2055a(m1427b).m2059a();
    }
}
