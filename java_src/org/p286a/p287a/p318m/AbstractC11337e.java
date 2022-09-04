package org.p286a.p287a.p318m;

import java.util.concurrent.TimeUnit;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11007a;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11010d
/* renamed from: org.a.a.m.e */
/* loaded from: classes2.dex */
public abstract class AbstractC11337e<T, C> {

    /* renamed from: a */
    private final String f36399a;

    /* renamed from: b */
    private final T f36400b;

    /* renamed from: c */
    private final C f36401c;

    /* renamed from: d */
    private final long f36402d;

    /* renamed from: e */
    private final long f36403e;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: f */
    private long f36404f;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: g */
    private long f36405g;

    /* renamed from: h */
    private volatile Object f36406h;

    public AbstractC11337e(String str, T t, C c) {
        this(str, t, c, 0L, TimeUnit.MILLISECONDS);
    }

    public AbstractC11337e(String str, T t, C c, long j, TimeUnit timeUnit) {
        C11354a.m1321a(t, "Route");
        C11354a.m1321a(c, C11086e.f35717j);
        C11354a.m1321a(timeUnit, "Time unit");
        this.f36399a = str;
        this.f36400b = t;
        this.f36401c = c;
        this.f36402d = System.currentTimeMillis();
        if (j > 0) {
            this.f36403e = this.f36402d + timeUnit.toMillis(j);
        } else {
            this.f36403e = Long.MAX_VALUE;
        }
        this.f36405g = this.f36403e;
    }

    /* renamed from: a */
    public synchronized void m1395a(long j, TimeUnit timeUnit) {
        C11354a.m1321a(timeUnit, "Time unit");
        this.f36404f = System.currentTimeMillis();
        this.f36405g = Math.min(j > 0 ? this.f36404f + timeUnit.toMillis(j) : Long.MAX_VALUE, this.f36403e);
    }

    /* renamed from: a */
    public void m1394a(Object obj) {
        this.f36406h = obj;
    }

    /* renamed from: a */
    public synchronized boolean mo1396a(long j) {
        return j >= this.f36405g;
    }

    /* renamed from: e */
    public abstract boolean mo1393e();

    /* renamed from: f */
    public abstract void mo1392f();

    /* renamed from: g */
    public String m1391g() {
        return this.f36399a;
    }

    /* renamed from: h */
    public T m1390h() {
        return this.f36400b;
    }

    /* renamed from: i */
    public C m1389i() {
        return this.f36401c;
    }

    /* renamed from: j */
    public long m1388j() {
        return this.f36402d;
    }

    /* renamed from: k */
    public long m1387k() {
        return this.f36403e;
    }

    /* renamed from: l */
    public Object m1386l() {
        return this.f36406h;
    }

    /* renamed from: m */
    public synchronized long m1385m() {
        return this.f36404f;
    }

    /* renamed from: n */
    public synchronized long m1384n() {
        return this.f36405g;
    }

    public String toString() {
        return "[id:" + this.f36399a + "][route:" + this.f36400b + "][state:" + this.f36406h + "]";
    }
}
