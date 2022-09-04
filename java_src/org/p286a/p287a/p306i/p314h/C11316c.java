package org.p286a.p287a.p306i.p314h;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p318m.AbstractC11337e;
@AbstractC11010d
/* renamed from: org.a.a.i.h.c */
/* loaded from: classes2.dex */
public class C11316c extends AbstractC11337e<HttpHost, HttpClientConnection> {
    public C11316c(String str, HttpHost httpHost, HttpClientConnection httpClientConnection) {
        super(str, httpHost, httpClientConnection);
    }

    @Override // org.p286a.p287a.p318m.AbstractC11337e
    /* renamed from: e */
    public boolean mo1393e() {
        return !i().isOpen();
    }

    @Override // org.p286a.p287a.p318m.AbstractC11337e
    /* renamed from: f */
    public void mo1392f() {
        try {
            i().close();
        } catch (IOException e) {
        }
    }
}
