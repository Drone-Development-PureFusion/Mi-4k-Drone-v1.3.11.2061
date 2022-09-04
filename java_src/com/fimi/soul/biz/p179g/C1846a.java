package com.fimi.soul.biz.p179g;

import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.fimi.soul.biz.g.a */
/* loaded from: classes.dex */
public class C1846a {

    /* renamed from: a */
    public static final int f5022a = 1;

    /* renamed from: b */
    public static final int f5023b = 2;

    /* renamed from: c */
    private volatile AtomicInteger f5024c;

    /* renamed from: com.fimi.soul.biz.g.a$a */
    /* loaded from: classes.dex */
    public static class C1848a {

        /* renamed from: a */
        public static final C1846a f5025a = new C1846a();
    }

    private C1846a() {
        this.f5024c = new AtomicInteger(1);
    }

    /* renamed from: a */
    public static C1846a m33917a() {
        return C1848a.f5025a;
    }

    /* renamed from: a */
    public void m33916a(int i) {
        if (this.f5024c != null) {
            this.f5024c.set(i);
        }
    }

    /* renamed from: b */
    public int m33915b() {
        if (this.f5024c == null) {
            return 0;
        }
        return this.f5024c.get();
    }

    /* renamed from: c */
    public boolean m33914c() {
        return this.f5024c.get() == 2;
    }
}
