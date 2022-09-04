package org.p286a.p287a.p306i.p308b;

import java.util.concurrent.atomic.AtomicLong;
/* renamed from: org.a.a.i.b.q */
/* loaded from: classes2.dex */
public final class C11196q {

    /* renamed from: a */
    private final AtomicLong f36010a = new AtomicLong();

    /* renamed from: b */
    private final AtomicLong f36011b = new AtomicLong();

    /* renamed from: c */
    private final C11197a f36012c = new C11197a();

    /* renamed from: d */
    private final C11197a f36013d = new C11197a();

    /* renamed from: e */
    private final C11197a f36014e = new C11197a();

    /* renamed from: f */
    private final C11197a f36015f = new C11197a();

    /* renamed from: org.a.a.i.b.q$a */
    /* loaded from: classes2.dex */
    static class C11197a {

        /* renamed from: a */
        private final AtomicLong f36016a = new AtomicLong(0);

        /* renamed from: b */
        private final AtomicLong f36017b = new AtomicLong(0);

        C11197a() {
        }

        /* renamed from: a */
        public long m1733a() {
            return this.f36016a.get();
        }

        /* renamed from: a */
        public void m1732a(long j) {
            this.f36016a.incrementAndGet();
            this.f36017b.addAndGet(System.currentTimeMillis() - j);
        }

        /* renamed from: b */
        public long m1731b() {
            long j = this.f36016a.get();
            if (j > 0) {
                return this.f36017b.get() / j;
            }
            return 0L;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[count=").append(m1733a()).append(", averageDuration=").append(m1731b()).append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AtomicLong m1749a() {
        return this.f36010a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AtomicLong m1748b() {
        return this.f36011b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C11197a m1747c() {
        return this.f36012c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C11197a m1746d() {
        return this.f36013d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C11197a m1745e() {
        return this.f36014e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C11197a m1744f() {
        return this.f36015f;
    }

    /* renamed from: g */
    public long m1743g() {
        return this.f36010a.get();
    }

    /* renamed from: h */
    public long m1742h() {
        return this.f36011b.get();
    }

    /* renamed from: i */
    public long m1741i() {
        return this.f36012c.m1733a();
    }

    /* renamed from: j */
    public long m1740j() {
        return this.f36012c.m1731b();
    }

    /* renamed from: k */
    public long m1739k() {
        return this.f36013d.m1733a();
    }

    /* renamed from: l */
    public long m1738l() {
        return this.f36013d.m1731b();
    }

    /* renamed from: m */
    public long m1737m() {
        return this.f36014e.m1733a();
    }

    /* renamed from: n */
    public long m1736n() {
        return this.f36014e.m1731b();
    }

    /* renamed from: o */
    public long m1735o() {
        return this.f36015f.m1733a();
    }

    /* renamed from: p */
    public long m1734p() {
        return this.f36015f.m1731b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[activeConnections=").append(this.f36010a).append(", scheduledConnections=").append(this.f36011b).append(", successfulConnections=").append(this.f36012c).append(", failedConnections=").append(this.f36013d).append(", requests=").append(this.f36014e).append(", tasks=").append(this.f36015f).append("]");
        return sb.toString();
    }
}
