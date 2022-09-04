package org.p286a.p287a.p298e;

import org.p286a.p287a.p320o.C11354a;
/* renamed from: org.a.a.e.c */
/* loaded from: classes2.dex */
public class C11090c implements Cloneable {

    /* renamed from: a */
    public static final C11090c f35747a = new C11091a().m2046a();

    /* renamed from: b */
    private final int f35748b;

    /* renamed from: c */
    private final int f35749c;

    /* renamed from: org.a.a.e.c$a */
    /* loaded from: classes2.dex */
    public static class C11091a {

        /* renamed from: a */
        private int f35750a = -1;

        /* renamed from: b */
        private int f35751b = -1;

        C11091a() {
        }

        /* renamed from: a */
        public C11091a m2045a(int i) {
            this.f35750a = i;
            return this;
        }

        /* renamed from: a */
        public C11090c m2046a() {
            return new C11090c(this.f35750a, this.f35751b);
        }

        /* renamed from: b */
        public C11091a m2044b(int i) {
            this.f35751b = i;
            return this;
        }
    }

    C11090c(int i, int i2) {
        this.f35748b = i;
        this.f35749c = i2;
    }

    /* renamed from: a */
    public static C11091a m2050a(C11090c c11090c) {
        C11354a.m1321a(c11090c, "Message constraints");
        return new C11091a().m2044b(c11090c.m2049b()).m2045a(c11090c.m2052a());
    }

    /* renamed from: a */
    public static C11090c m2051a(int i) {
        return new C11090c(C11354a.m1317b(i, "Max line length"), -1);
    }

    /* renamed from: d */
    public static C11091a m2047d() {
        return new C11091a();
    }

    /* renamed from: a */
    public int m2052a() {
        return this.f35748b;
    }

    /* renamed from: b */
    public int m2049b() {
        return this.f35749c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public C11090c clone() {
        return (C11090c) super.clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[maxLineLength=").append(this.f35748b).append(", maxHeaderCount=").append(this.f35749c).append("]");
        return sb.toString();
    }
}
