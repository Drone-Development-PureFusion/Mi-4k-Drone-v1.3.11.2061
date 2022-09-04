package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.internal.ux */
/* loaded from: classes2.dex */
public class C7820ux implements aeg {

    /* renamed from: a */
    private final Executor f25957a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ux$a */
    /* loaded from: classes2.dex */
    public class RunnableC7822a implements Runnable {

        /* renamed from: b */
        private final abd f25961b;

        /* renamed from: c */
        private final adf f25962c;

        /* renamed from: d */
        private final Runnable f25963d;

        public RunnableC7822a(abd abdVar, adf adfVar, Runnable runnable) {
            this.f25961b = abdVar;
            this.f25962c = adfVar;
            this.f25963d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25961b.m18502f()) {
                this.f25961b.m18505c("canceled-at-delivery");
                return;
            }
            if (this.f25962c.m18048a()) {
                this.f25961b.mo18236a((abd) this.f25962c.f21265a);
            } else {
                this.f25961b.m18508b(this.f25962c.f21267c);
            }
            if (this.f25962c.f21268d) {
                this.f25961b.m18507b("intermediate-response");
            } else {
                this.f25961b.m18505c("done");
            }
            if (this.f25963d == null) {
                return;
            }
            this.f25963d.run();
        }
    }

    public C7820ux(final Handler handler) {
        this.f25957a = new Executor() { // from class: com.google.android.gms.internal.ux.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.google.android.gms.internal.aeg
    /* renamed from: a */
    public void mo13396a(abd<?> abdVar, adf<?> adfVar) {
        mo13395a(abdVar, adfVar, null);
    }

    @Override // com.google.android.gms.internal.aeg
    /* renamed from: a */
    public void mo13395a(abd<?> abdVar, adf<?> adfVar, Runnable runnable) {
        abdVar.m18490t();
        abdVar.m18507b("post-response");
        this.f25957a.execute(new RunnableC7822a(abdVar, adfVar, runnable));
    }

    @Override // com.google.android.gms.internal.aeg
    /* renamed from: a */
    public void mo13394a(abd<?> abdVar, aii aiiVar) {
        abdVar.m18507b("post-error");
        this.f25957a.execute(new RunnableC7822a(abdVar, adf.m18047a(aiiVar), null));
    }
}
