package org.p286a.p287a.p306i.p309c;

import com.facebook.common.util.UriUtil;
import org.apache.http.HttpHost;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p299f.AbstractC11134i;
import org.p286a.p287a.p299f.C11135j;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.c.k */
/* loaded from: classes2.dex */
public class C11221k implements AbstractC11134i {

    /* renamed from: a */
    public static final C11221k f36128a = new C11221k();

    @Override // org.p286a.p287a.p299f.AbstractC11134i
    /* renamed from: a */
    public int mo1630a(HttpHost httpHost) {
        C11354a.m1321a(httpHost, "HTTP host");
        int port = httpHost.getPort();
        if (port > 0) {
            return port;
        }
        String schemeName = httpHost.getSchemeName();
        if (schemeName.equalsIgnoreCase(UriUtil.HTTP_SCHEME)) {
            return 80;
        }
        if (!schemeName.equalsIgnoreCase(UriUtil.HTTPS_SCHEME)) {
            throw new C11135j(schemeName + " protocol is not supported");
        }
        return 443;
    }
}
