package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: com.android.volley.e */
/* loaded from: classes.dex */
public class C0905e implements AbstractC0927q {

    /* renamed from: a */
    private final Executor f2001a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.android.volley.e$a */
    /* loaded from: classes.dex */
    public class RunnableC0907a implements Runnable {

        /* renamed from: b */
        private final AbstractC0916n f2005b;

        /* renamed from: c */
        private final C0924p f2006c;

        /* renamed from: d */
        private final Runnable f2007d;

        public RunnableC0907a(AbstractC0916n abstractC0916n, C0924p c0924p, Runnable runnable) {
            this.f2005b = abstractC0916n;
            this.f2006c = c0924p;
            this.f2007d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2005b.mo37356m()) {
                this.f2005b.m37415b("canceled-at-delivery");
                return;
            }
            if (this.f2006c.m37384a()) {
                this.f2005b.mo34916b((AbstractC0916n) this.f2006c.f2067a);
            } else {
                this.f2005b.m37416b(this.f2006c.f2069c);
            }
            if (this.f2006c.f2070d) {
                this.f2005b.m37421a("intermediate-response");
            } else {
                this.f2005b.m37415b("done");
            }
            if (this.f2007d == null) {
                return;
            }
            this.f2007d.run();
        }
    }

    public C0905e(final Handler handler) {
        this.f2001a = new Executor() { // from class: com.android.volley.e.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public C0905e(Executor executor) {
        this.f2001a = executor;
    }

    @Override // com.android.volley.AbstractC0927q
    /* renamed from: a */
    public void mo37381a(AbstractC0916n<?> abstractC0916n, C0924p<?> c0924p) {
        mo37380a(abstractC0916n, c0924p, null);
    }

    @Override // com.android.volley.AbstractC0927q
    /* renamed from: a */
    public void mo37380a(AbstractC0916n<?> abstractC0916n, C0924p<?> c0924p, Runnable runnable) {
        abstractC0916n.m37432A();
        abstractC0916n.m37421a("post-response");
        this.f2001a.execute(new RunnableC0907a(abstractC0916n, c0924p, runnable));
    }

    @Override // com.android.volley.AbstractC0927q
    /* renamed from: a */
    public void mo37379a(AbstractC0916n<?> abstractC0916n, C0967u c0967u) {
        abstractC0916n.m37421a("post-error");
        this.f2001a.execute(new RunnableC0907a(abstractC0916n, C0924p.m37383a(c0967u), null));
    }
}
