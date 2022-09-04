package org.p328c.p329a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11596a;
import org.p328c.p350f.AbstractC11668f;
import org.p328c.p350f.p351a.AbstractC11648h;
import org.p328c.p350f.p351a.AbstractC11649i;
/* renamed from: org.c.a.a */
/* loaded from: classes2.dex */
public class C11440a extends C11596a {

    /* renamed from: a */
    private final boolean f36551a;

    /* renamed from: b */
    private final boolean f36552b;

    public C11440a(boolean z, boolean z2) {
        this.f36551a = z;
        this.f36552b = z2;
    }

    /* renamed from: a */
    public static C11596a m1069a() {
        return new C11440a(true, false);
    }

    /* renamed from: a */
    private static AbstractC11637l m1068a(AbstractC11637l abstractC11637l) {
        if (abstractC11637l instanceof AbstractC11668f) {
            ((AbstractC11668f) abstractC11637l).m340a(new AbstractC11649i() { // from class: org.c.a.a.1

                /* renamed from: a */
                private final ExecutorService f36553a = Executors.newCachedThreadPool();

                @Override // org.p328c.p350f.p351a.AbstractC11649i
                /* renamed from: a */
                public void mo320a() {
                    try {
                        this.f36553a.shutdown();
                        this.f36553a.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace(System.err);
                    }
                }

                @Override // org.p328c.p350f.p351a.AbstractC11649i
                /* renamed from: a */
                public void mo319a(Runnable runnable) {
                    this.f36553a.submit(runnable);
                }
            });
        }
        return abstractC11637l;
    }

    /* renamed from: b */
    public static C11596a m1067b() {
        return new C11440a(false, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p347e.C11596a
    /* renamed from: a */
    public AbstractC11637l mo586a(AbstractC11648h abstractC11648h, Class<?> cls) {
        AbstractC11637l mo586a = super.mo586a(abstractC11648h, cls);
        return this.f36552b ? m1068a(mo586a) : mo586a;
    }

    @Override // org.p328c.p347e.C11596a
    /* renamed from: a */
    public AbstractC11637l mo585a(AbstractC11648h abstractC11648h, Class<?>[] clsArr) {
        AbstractC11637l mo585a = super.mo585a(abstractC11648h, clsArr);
        return this.f36551a ? m1068a(mo585a) : mo585a;
    }
}
