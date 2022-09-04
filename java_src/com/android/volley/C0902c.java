package com.android.volley;

import android.os.Process;
import com.android.volley.AbstractC0900b;
import java.util.concurrent.BlockingQueue;
/* renamed from: com.android.volley.c */
/* loaded from: classes.dex */
public class C0902c extends Thread {

    /* renamed from: a */
    private static final boolean f1986a = C0968v.f2167b;

    /* renamed from: b */
    private final BlockingQueue<AbstractC0916n<?>> f1987b;

    /* renamed from: c */
    private final BlockingQueue<AbstractC0916n<?>> f1988c;

    /* renamed from: d */
    private final AbstractC0900b f1989d;

    /* renamed from: e */
    private final AbstractC0927q f1990e;

    /* renamed from: f */
    private volatile boolean f1991f = false;

    public C0902c(BlockingQueue<AbstractC0916n<?>> blockingQueue, BlockingQueue<AbstractC0916n<?>> blockingQueue2, AbstractC0900b abstractC0900b, AbstractC0927q abstractC0927q) {
        this.f1987b = blockingQueue;
        this.f1988c = blockingQueue2;
        this.f1989d = abstractC0900b;
        this.f1990e = abstractC0927q;
    }

    /* renamed from: a */
    public void m37441a() {
        this.f1991f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f1986a) {
            C0968v.m37262a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f1989d.mo37281a();
        while (true) {
            try {
                final AbstractC0916n<?> take = this.f1987b.take();
                try {
                    take.m37421a("cache-queue-take");
                    if (take.mo37356m()) {
                        take.m37415b("cache-discard-canceled");
                    } else {
                        AbstractC0900b.C0901a mo37280a = this.f1989d.mo37280a(take.m37406j());
                        if (mo37280a == null) {
                            take.m37421a("cache-miss");
                            this.f1988c.put(take);
                        } else if (mo37280a.m37443a()) {
                            take.m37421a("cache-hit-expired");
                            take.m37427a(mo37280a);
                            this.f1988c.put(take);
                        } else {
                            take.m37421a("cache-hit");
                            C0924p<?> mo34917a = take.mo34917a(new C0912j(mo37280a.f1979a, mo37280a.f1985g));
                            take.m37421a("cache-hit-parsed");
                            if (!mo37280a.m37442b()) {
                                this.f1990e.mo37381a(take, mo34917a);
                            } else {
                                take.m37421a("cache-hit-refresh-needed");
                                take.m37427a(mo37280a);
                                mo34917a.f2070d = true;
                                this.f1990e.mo37380a(take, mo34917a, new Runnable() { // from class: com.android.volley.c.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            C0902c.this.f1988c.put(take);
                                        } catch (InterruptedException e) {
                                        }
                                    }
                                });
                            }
                        }
                    }
                } catch (Exception e) {
                    C0968v.m37261a(e, "Unhandled exception %s", e.toString());
                }
            } catch (InterruptedException e2) {
                if (this.f1991f) {
                    return;
                }
            }
        }
    }
}
