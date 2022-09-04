package org.p286a.p287a.p306i.p308b;

import com.google.firebase.p253b.C9755a;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.conn.routing.HttpRoute;
import org.p286a.p287a.p290c.AbstractC11034c;
import org.p286a.p287a.p318m.AbstractC11336d;
import org.p286a.p287a.p320o.C11354a;
/* renamed from: org.a.a.i.b.a */
/* loaded from: classes2.dex */
public class C11171a implements AbstractC11034c {

    /* renamed from: a */
    private final AbstractC11336d<HttpRoute> f35961a;

    /* renamed from: b */
    private final AbstractC11185g f35962b;

    /* renamed from: c */
    private final Map<HttpRoute, Long> f35963c;

    /* renamed from: d */
    private final Map<HttpRoute, Long> f35964d;

    /* renamed from: e */
    private long f35965e;

    /* renamed from: f */
    private double f35966f;

    /* renamed from: g */
    private int f35967g;

    public C11171a(AbstractC11336d<HttpRoute> abstractC11336d) {
        this(abstractC11336d, new C11177af());
    }

    C11171a(AbstractC11336d<HttpRoute> abstractC11336d, AbstractC11185g abstractC11185g) {
        this.f35965e = 5000L;
        this.f35966f = 0.5d;
        this.f35967g = 2;
        this.f35962b = abstractC11185g;
        this.f35961a = abstractC11336d;
        this.f35963c = new HashMap();
        this.f35964d = new HashMap();
    }

    /* renamed from: a */
    private Long m1801a(Map<HttpRoute, Long> map, HttpRoute httpRoute) {
        Long l = map.get(httpRoute);
        if (l == null) {
            return 0L;
        }
        return l;
    }

    /* renamed from: b */
    private int m1799b(int i) {
        if (i <= 1) {
            return 1;
        }
        return (int) Math.floor(this.f35966f * i);
    }

    /* renamed from: a */
    public void m1804a(double d) {
        C11354a.m1319a(d > C9755a.f30449c && d < 1.0d, "Backoff factor must be 0.0 < f < 1.0");
        this.f35966f = d;
    }

    /* renamed from: a */
    public void m1803a(int i) {
        C11354a.m1324a(i, "Per host connection cap");
        this.f35967g = i;
    }

    /* renamed from: a */
    public void m1802a(long j) {
        C11354a.m1323a(this.f35965e, "Cool down");
        this.f35965e = j;
    }

    @Override // org.p286a.p287a.p290c.AbstractC11034c
    /* renamed from: a */
    public void mo1800a(HttpRoute httpRoute) {
        synchronized (this.f35961a) {
            int mo1400b = this.f35961a.mo1400b((AbstractC11336d<HttpRoute>) httpRoute);
            Long m1801a = m1801a(this.f35964d, httpRoute);
            long mo1771a = this.f35962b.mo1771a();
            if (mo1771a - m1801a.longValue() < this.f35965e) {
                return;
            }
            this.f35961a.mo1402a(httpRoute, m1799b(mo1400b));
            this.f35964d.put(httpRoute, Long.valueOf(mo1771a));
        }
    }

    @Override // org.p286a.p287a.p290c.AbstractC11034c
    /* renamed from: b */
    public void mo1798b(HttpRoute httpRoute) {
        synchronized (this.f35961a) {
            int mo1400b = this.f35961a.mo1400b((AbstractC11336d<HttpRoute>) httpRoute);
            int i = mo1400b >= this.f35967g ? this.f35967g : mo1400b + 1;
            Long m1801a = m1801a(this.f35963c, httpRoute);
            Long m1801a2 = m1801a(this.f35964d, httpRoute);
            long mo1771a = this.f35962b.mo1771a();
            if (mo1771a - m1801a.longValue() < this.f35965e || mo1771a - m1801a2.longValue() < this.f35965e) {
                return;
            }
            this.f35961a.mo1402a(httpRoute, i);
            this.f35963c.put(httpRoute, Long.valueOf(mo1771a));
        }
    }
}
