package com.fimi.soul.biz.p189q;

import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.biz.q.b */
/* loaded from: classes.dex */
public class C2029b {

    /* renamed from: a */
    private static C2083a f5709a;

    /* renamed from: com.fimi.soul.biz.q.b$a */
    /* loaded from: classes.dex */
    private static class C2031a {

        /* renamed from: a */
        private static final C2029b f5711a = new C2029b();

        private C2031a() {
        }
    }

    /* renamed from: a */
    public static C2029b m33183a(C2083a c2083a) {
        f5709a = c2083a;
        return C2031a.f5711a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m33181b(int i) {
        if (!C2027a.m33210a().m33208a(i)) {
            m33185a(i);
            m33180c();
        }
    }

    /* renamed from: c */
    private void m33180c() {
        try {
            Thread.sleep(300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m33186a() {
        C2027a.m33210a().m33189k().clear();
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.q.b.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < 5; i++) {
                    C2029b.this.m33181b(0);
                    C2029b.this.m33181b(1);
                    C2029b.this.m33181b(3);
                    C2029b.this.m33181b(10);
                    C2029b.this.m33181b(6);
                    C2029b.this.m33181b(9);
                }
                if (C2029b.f5709a != null) {
                    C2029b.f5709a.mo32909a(C2104d.EnumC2105a.ENDQUESTNOTIFY);
                }
            }
        });
    }

    /* renamed from: a */
    public void m33185a(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 6;
        c2196c.f6913c = 194;
        C2197d c2197d = c2196c.f6914d;
        if (1 == i) {
            c2197d.m32744b((byte) 1);
        } else {
            c2197d.m32744b((byte) 0);
        }
        c2197d.m32744b((byte) i);
        c2197d.m32746a((short) 1);
        c2197d.m32744b((byte) 0);
        c2197d.m32744b((byte) 17);
        if (f5709a != null) {
            f5709a.mo32906ab().mo32587a(c2196c);
        }
    }
}
