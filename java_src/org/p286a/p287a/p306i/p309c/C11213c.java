package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p299f.AbstractC11133h;
import org.p286a.p287a.p318m.AbstractC11337e;
@AbstractC11010d
/* renamed from: org.a.a.i.c.c */
/* loaded from: classes2.dex */
class C11213c extends AbstractC11337e<HttpRoute, AbstractC11133h> {

    /* renamed from: a */
    private static final String f36114a = "HttpClient";

    /* renamed from: b */
    private volatile boolean f36115b;

    public C11213c(String str, HttpRoute httpRoute, AbstractC11133h abstractC11133h, long j, TimeUnit timeUnit) {
        super(str, httpRoute, abstractC11133h, j, timeUnit);
    }

    /* renamed from: a */
    public void m1648a() {
        this.f36115b = true;
    }

    @Override // org.p286a.p287a.p318m.AbstractC11337e
    /* renamed from: a */
    public boolean mo1396a(long j) {
        boolean mo1396a = super.mo1396a(j);
        if (mo1396a && Log.isLoggable(f36114a, 3)) {
            Log.d(f36114a, "Connection " + this + " expired @ " + new Date(n()));
        }
        return mo1396a;
    }

    /* renamed from: b */
    public boolean m1647b() {
        return this.f36115b;
    }

    /* renamed from: c */
    public void m1646c() {
        i().close();
    }

    /* renamed from: d */
    public void m1645d() {
        i().shutdown();
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
            m1646c();
        } catch (IOException e) {
            if (!Log.isLoggable(f36114a, 3)) {
                return;
            }
            Log.d(f36114a, "I/O error closing connection", e);
        }
    }
}
