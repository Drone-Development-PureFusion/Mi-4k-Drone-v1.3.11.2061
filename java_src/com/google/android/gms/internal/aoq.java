package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.internal.C6841di;
import com.google.android.gms.tagmanager.AbstractC9042aj;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class aoq {

    /* renamed from: a */
    private final String f22628a;

    /* renamed from: b */
    private final String f22629b;

    /* renamed from: c */
    private final String f22630c;

    /* renamed from: d */
    private final apq f22631d;

    /* renamed from: e */
    private final C6841di f22632e;

    /* renamed from: f */
    private final ExecutorService f22633f;

    /* renamed from: g */
    private final ScheduledExecutorService f22634g;

    /* renamed from: h */
    private final AbstractC9042aj f22635h;

    /* renamed from: i */
    private final AbstractC4682e f22636i;

    /* renamed from: j */
    private final aos f22637j;

    /* renamed from: k */
    private C6716app f22638k;

    /* renamed from: l */
    private volatile int f22639l = 1;

    /* renamed from: m */
    private List<aow> f22640m = new ArrayList();

    /* renamed from: n */
    private ScheduledFuture<?> f22641n = null;

    /* renamed from: o */
    private boolean f22642o = false;

    /* renamed from: com.google.android.gms.internal.aoq$a */
    /* loaded from: classes2.dex */
    private class RunnableC6700a implements Runnable {
        private RunnableC6700a() {
        }

        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
            aoq.this.f22639l = 3;
            String str = aoq.this.f22628a;
            aph.m16394b(new StringBuilder(String.valueOf(str).length() + 26).append("Container ").append(str).append(" loading failed.").toString());
            if (aoq.this.f22640m != null) {
                for (aow aowVar : aoq.this.f22640m) {
                    if (aowVar.m16426h()) {
                        try {
                            aoq.this.f22635h.mo8895a("app", aowVar.m16430d(), aowVar.m16429e(), aowVar.mo16434a());
                            String valueOf = String.valueOf(aowVar.m16430d());
                            aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Logged event ").append(valueOf).append(" to Firebase (marked as passthrough).").toString());
                        } catch (RemoteException e) {
                            String valueOf2 = String.valueOf(e.getMessage());
                            aph.m16396a(valueOf2.length() != 0 ? "Error logging event with measurement proxy:".concat(valueOf2) : new String("Error logging event with measurement proxy:"));
                        }
                    } else {
                        String valueOf3 = String.valueOf(aowVar.m16430d());
                        aph.m16391d(new StringBuilder(String.valueOf(valueOf3).length() + 45).append("Discarded event ").append(valueOf3).append(" (marked as non-passthrough).").toString());
                    }
                }
                aoq.this.f22640m = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.aoq$b */
    /* loaded from: classes2.dex */
    private class RunnableC6701b implements C6841di.AbstractC6842a, Runnable {
        private RunnableC6701b() {
        }

        @Override // com.google.android.gms.internal.C6841di.AbstractC6842a
        /* renamed from: a */
        public void mo16135a(C6850dm c6850dm) {
            if (c6850dm.mo7645a() == Status.f16786a) {
                aoq.this.f22633f.execute(new RunnableC6704e(c6850dm));
            } else {
                aoq.this.f22633f.execute(new RunnableC6700a());
            }
        }

        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
            C4588d.m23623a(aoq.this.f22639l == 1);
            ArrayList arrayList = new ArrayList();
            aoq.this.f22642o = false;
            if (apn.m16354a().m16353a(aoq.this.f22628a)) {
                arrayList.add(0);
            } else {
                aoq.this.f22642o = aoq.this.f22637j.m16440d();
                if (!aoq.this.f22642o) {
                    arrayList.add(0);
                    arrayList.add(1);
                } else {
                    arrayList.add(1);
                    arrayList.add(0);
                }
                arrayList.add(2);
            }
            aoq.this.f22632e.m16138a(aoq.this.f22628a, aoq.this.f22630c, aoq.this.f22629b, arrayList, this, aoq.this.f22637j);
        }
    }

    /* renamed from: com.google.android.gms.internal.aoq$c */
    /* loaded from: classes2.dex */
    private class RunnableC6702c implements Runnable {

        /* renamed from: b */
        private final aow f22648b;

        public RunnableC6702c(aow aowVar) {
            this.f22648b = aowVar;
        }

        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
            if (aoq.this.f22639l == 2) {
                String valueOf = String.valueOf(this.f22648b.m16430d());
                aph.m16391d(valueOf.length() != 0 ? "Evaluating tags for event ".concat(valueOf) : new String("Evaluating tags for event "));
                aoq.this.f22638k.m16346a(this.f22648b);
            } else if (aoq.this.f22639l == 1) {
                aoq.this.f22640m.add(this.f22648b);
                String valueOf2 = String.valueOf(this.f22648b.m16430d());
                aph.m16391d(new StringBuilder(String.valueOf(valueOf2).length() + 30).append("Added event ").append(valueOf2).append(" to pending queue.").toString());
            } else if (aoq.this.f22639l != 3) {
            } else {
                String valueOf3 = String.valueOf(this.f22648b.m16430d());
                aph.m16391d(new StringBuilder(String.valueOf(valueOf3).length() + 61).append("Failed to evaluate tags for event ").append(valueOf3).append(" (container failed to load)").toString());
                if (!this.f22648b.m16426h()) {
                    String valueOf4 = String.valueOf(this.f22648b.m16430d());
                    aph.m16391d(valueOf4.length() != 0 ? "Discarded non-passthrough event ".concat(valueOf4) : new String("Discarded non-passthrough event "));
                    return;
                }
                try {
                    aoq.this.f22635h.mo8895a("app", this.f22648b.m16430d(), this.f22648b.m16429e(), this.f22648b.mo16434a());
                    String valueOf5 = String.valueOf(this.f22648b.m16430d());
                    aph.m16391d(new StringBuilder(String.valueOf(valueOf5).length() + 38).append("Logged passthrough event ").append(valueOf5).append(" to Firebase.").toString());
                } catch (RemoteException e) {
                    String valueOf6 = String.valueOf(e.getMessage());
                    aph.m16396a(valueOf6.length() != 0 ? "Error logging event with measurement proxy:".concat(valueOf6) : new String("Error logging event with measurement proxy:"));
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.aoq$d */
    /* loaded from: classes2.dex */
    private class RunnableC6703d implements C6841di.AbstractC6842a, Runnable {
        private RunnableC6703d() {
        }

        @Override // com.google.android.gms.internal.C6841di.AbstractC6842a
        /* renamed from: a */
        public void mo16135a(C6850dm c6850dm) {
            if (c6850dm.mo7645a() != Status.f16786a) {
                aoq.this.m16465a(aoq.this.f22637j.m16442b());
                return;
            }
            String str = aoq.this.f22628a;
            aph.m16391d(new StringBuilder(String.valueOf(str).length() + 47).append("Refreshed container ").append(str).append(". Reinitializing runtime...").toString());
            aoq.this.f22633f.execute(new RunnableC6704e(c6850dm));
        }

        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
            C4588d.m23623a(aoq.this.f22639l == 2);
            if (apn.m16354a().m16353a(aoq.this.f22628a)) {
                return;
            }
            String str = aoq.this.f22628a;
            aph.m16391d(new StringBuilder(String.valueOf(str).length() + 24).append("Refreshing container ").append(str).append("...").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            aoq.this.f22632e.m16138a(aoq.this.f22628a, aoq.this.f22630c, aoq.this.f22629b, arrayList, this, aoq.this.f22637j);
        }
    }

    /* renamed from: com.google.android.gms.internal.aoq$e */
    /* loaded from: classes2.dex */
    private class RunnableC6704e implements Runnable {

        /* renamed from: b */
        private final C6850dm f22651b;

        RunnableC6704e(C6850dm c6850dm) {
            this.f22651b = c6850dm;
        }

        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
            C6865dv m16119c = this.f22651b.m16125b().m16119c();
            C6873dy m16124c = this.f22651b.m16124c();
            boolean z = aoq.this.f22638k == null;
            aoq.this.f22638k = aoq.this.f22631d.m16319a(m16119c, m16124c);
            aoq.this.f22639l = 2;
            String str = aoq.this.f22628a;
            aph.m16391d(new StringBuilder(String.valueOf(str).length() + 48).append("Container ").append(str).append(" loaded during runtime initialization.").toString());
            if (aoq.this.f22640m != null) {
                for (aow aowVar : aoq.this.f22640m) {
                    String valueOf = String.valueOf(aowVar.m16430d());
                    aph.m16391d(valueOf.length() != 0 ? "Evaluating tags for pending event ".concat(valueOf) : new String("Evaluating tags for pending event "));
                    aoq.this.f22638k.m16346a(aowVar);
                }
                aoq.this.f22640m = null;
            }
            aoq.this.f22638k.m16347a();
            String valueOf2 = String.valueOf(aoq.this.f22628a);
            aph.m16391d(valueOf2.length() != 0 ? "Runtime initialized successfully for container ".concat(valueOf2) : new String("Runtime initialized successfully for container "));
            long m16118d = this.f22651b.m16125b().m16118d() + aoq.this.f22637j.m16444a();
            if (!z || !aoq.this.f22642o || this.f22651b.m16123d() != 1 || m16118d >= aoq.this.f22636i.mo16434a()) {
                aoq.this.m16465a(Math.max(900000L, m16118d - aoq.this.f22636i.mo16434a()));
            } else {
                aoq.this.m16465a(aoq.this.f22637j.m16441c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aoq(String str, @Nullable String str2, @Nullable String str3, apq apqVar, C6841di c6841di, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, AbstractC9042aj abstractC9042aj, AbstractC4682e abstractC4682e, aos aosVar) {
        this.f22628a = (String) C4588d.m23627a(str);
        this.f22631d = (apq) C4588d.m23627a(apqVar);
        this.f22632e = (C6841di) C4588d.m23627a(c6841di);
        this.f22633f = (ExecutorService) C4588d.m23627a(executorService);
        this.f22634g = (ScheduledExecutorService) C4588d.m23627a(scheduledExecutorService);
        this.f22635h = (AbstractC9042aj) C4588d.m23627a(abstractC9042aj);
        this.f22636i = (AbstractC4682e) C4588d.m23627a(abstractC4682e);
        this.f22637j = (aos) C4588d.m23627a(aosVar);
        this.f22629b = str3;
        this.f22630c = str2;
        this.f22640m.add(new aow("gtm.load", new Bundle(), "gtm", new Date(), false, this.f22635h));
        String str4 = this.f22628a;
        aph.m16391d(new StringBuilder(String.valueOf(str4).length() + 35).append("Container ").append(str4).append("is scheduled for loading.").toString());
        this.f22633f.execute(new RunnableC6701b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16465a(long j) {
        if (this.f22641n != null) {
            this.f22641n.cancel(false);
        }
        String str = this.f22628a;
        aph.m16391d(new StringBuilder(String.valueOf(str).length() + 45).append("Refresh container ").append(str).append(" in ").append(j).append("ms.").toString());
        this.f22641n = this.f22634g.schedule(new Runnable() { // from class: com.google.android.gms.internal.aoq.2
            @Override // java.lang.Runnable
            public void run() {
                aoq.this.f22633f.execute(new RunnableC6703d());
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void m16466a() {
        this.f22633f.execute(new Runnable() { // from class: com.google.android.gms.internal.aoq.1
            @Override // java.lang.Runnable
            @WorkerThread
            public void run() {
                if (aoq.this.f22639l == 2) {
                    aoq.this.f22638k.m16347a();
                }
            }
        });
    }

    /* renamed from: a */
    public void m16458a(aow aowVar) {
        this.f22633f.execute(new RunnableC6702c(aowVar));
    }
}
