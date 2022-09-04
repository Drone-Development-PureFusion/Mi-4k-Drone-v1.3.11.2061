package org.p286a.p287a.p298e;

import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.e.f */
/* loaded from: classes2.dex */
public class C11094f implements Cloneable {

    /* renamed from: a */
    public static final C11094f f35754a = new C11095a().m2031a();

    /* renamed from: b */
    private final int f35755b;

    /* renamed from: c */
    private final boolean f35756c;

    /* renamed from: d */
    private final int f35757d;

    /* renamed from: e */
    private final boolean f35758e;

    /* renamed from: f */
    private final boolean f35759f;

    /* renamed from: org.a.a.e.f$a */
    /* loaded from: classes2.dex */
    public static class C11095a {

        /* renamed from: a */
        private int f35760a;

        /* renamed from: b */
        private boolean f35761b;

        /* renamed from: d */
        private boolean f35763d;

        /* renamed from: c */
        private int f35762c = -1;

        /* renamed from: e */
        private boolean f35764e = true;

        C11095a() {
        }

        /* renamed from: a */
        public C11095a m2030a(int i) {
            this.f35760a = i;
            return this;
        }

        /* renamed from: a */
        public C11095a m2029a(boolean z) {
            this.f35761b = z;
            return this;
        }

        /* renamed from: a */
        public C11094f m2031a() {
            return new C11094f(this.f35760a, this.f35761b, this.f35762c, this.f35763d, this.f35764e);
        }

        /* renamed from: b */
        public C11095a m2028b(int i) {
            this.f35762c = i;
            return this;
        }

        /* renamed from: b */
        public C11095a m2027b(boolean z) {
            this.f35763d = z;
            return this;
        }

        /* renamed from: c */
        public C11095a m2026c(boolean z) {
            this.f35764e = z;
            return this;
        }
    }

    C11094f(int i, boolean z, int i2, boolean z2, boolean z3) {
        this.f35755b = i;
        this.f35756c = z;
        this.f35757d = i2;
        this.f35758e = z2;
        this.f35759f = z3;
    }

    /* renamed from: a */
    public static C11095a m2038a(C11094f c11094f) {
        C11354a.m1321a(c11094f, "Socket config");
        return new C11095a().m2030a(c11094f.m2039a()).m2029a(c11094f.m2037b()).m2028b(c11094f.m2036c()).m2027b(c11094f.m2035d()).m2026c(c11094f.m2034e());
    }

    /* renamed from: g */
    public static C11095a m2032g() {
        return new C11095a();
    }

    /* renamed from: a */
    public int m2039a() {
        return this.f35755b;
    }

    /* renamed from: b */
    public boolean m2037b() {
        return this.f35756c;
    }

    /* renamed from: c */
    public int m2036c() {
        return this.f35757d;
    }

    /* renamed from: d */
    public boolean m2035d() {
        return this.f35758e;
    }

    /* renamed from: e */
    public boolean m2034e() {
        return this.f35759f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public C11094f clone() {
        return (C11094f) super.clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[soTimeout=").append(this.f35755b).append(", soReuseAddress=").append(this.f35756c).append(", soLinger=").append(this.f35757d).append(", soKeepAlive=").append(this.f35758e).append(", tcpNoDelay=").append(this.f35759f).append("]");
        return sb.toString();
    }
}
