package com.xiaomi.channel.commonutils.stats;

import java.util.LinkedList;
/* renamed from: com.xiaomi.channel.commonutils.stats.a */
/* loaded from: classes2.dex */
public class C10428a {

    /* renamed from: a */
    private LinkedList<C10429a> f32380a = new LinkedList<>();

    /* renamed from: com.xiaomi.channel.commonutils.stats.a$a */
    /* loaded from: classes2.dex */
    public static class C10429a {

        /* renamed from: d */
        private static final C10428a f32381d = new C10428a();

        /* renamed from: a */
        public int f32382a;

        /* renamed from: b */
        public String f32383b;

        /* renamed from: c */
        public Object f32384c;

        C10429a(int i, Object obj) {
            this.f32382a = i;
            this.f32384c = obj;
        }
    }

    /* renamed from: a */
    public static C10428a m5193a() {
        return C10429a.f32381d;
    }

    /* renamed from: d */
    private void m5189d() {
        if (this.f32380a.size() > 100) {
            this.f32380a.removeFirst();
        }
    }

    /* renamed from: a */
    public synchronized void m5192a(Object obj) {
        this.f32380a.add(new C10429a(0, obj));
        m5189d();
    }

    /* renamed from: b */
    public synchronized int m5191b() {
        return this.f32380a.size();
    }

    /* renamed from: c */
    public synchronized LinkedList<C10429a> m5190c() {
        LinkedList<C10429a> linkedList;
        linkedList = this.f32380a;
        this.f32380a = new LinkedList<>();
        return linkedList;
    }
}
