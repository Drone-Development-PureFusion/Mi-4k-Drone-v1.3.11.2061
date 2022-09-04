package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4510u;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.aif;
import com.google.android.gms.internal.aiv;
import com.google.android.gms.p239g.AbstractC5281b;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import com.google.android.gms.p239g.C5290i;
import com.google.firebase.appindexing.AbstractC9675b;
import com.google.firebase.appindexing.AbstractC9680g;
import com.google.firebase.appindexing.C9677d;
import java.util.concurrent.Executor;
/* renamed from: com.google.firebase.appindexing.internal.c */
/* loaded from: classes2.dex */
public final class C9687c extends AbstractC9675b {

    /* renamed from: c */
    private ExecutorC9694c f30315c;

    /* renamed from: com.google.firebase.appindexing.internal.c$a */
    /* loaded from: classes2.dex */
    private static class C9691a extends AbstractC4510u<C4467a.AbstractC4468a.C4470b> {
        public C9691a(Context context) {
            super(context, C9685b.f30312a, null, Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.appindexing.internal.c$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9692b extends aiv<C9685b, Status> {

        /* renamed from: a */
        private C5286g<Status> f30321a;

        private AbstractC9692b() {
        }

        /* renamed from: a */
        protected aif m7434a() {
            return new aif.AbstractBinderC6380a() { // from class: com.google.firebase.appindexing.internal.c.b.1
                @Override // com.google.android.gms.internal.aif
                /* renamed from: a */
                public void mo7430a(Status status) {
                    AbstractC9692b.this.f30321a.m20830a((C5286g) status);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.aiv
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public final void mo7416a(C9685b c9685b, C5286g<Status> c5286g) {
            this.f30321a = c5286g;
            mo7431a((AbstractC9703f) c9685b.G());
        }

        /* renamed from: a */
        protected abstract void mo7431a(AbstractC9703f abstractC9703f);
    }

    /* renamed from: com.google.firebase.appindexing.internal.c$c */
    /* loaded from: classes2.dex */
    static class ExecutorC9694c implements AbstractC5281b<Void>, Executor {

        /* renamed from: a */
        public static int f30323a = 10;

        /* renamed from: b */
        public static long f30324b = 250;

        /* renamed from: c */
        public static double f30325c = 1.5d;

        /* renamed from: d */
        public static double f30326d = 0.25d;
        @NonNull

        /* renamed from: e */
        private final AbstractC4510u<?> f30327e;
        @NonNull

        /* renamed from: f */
        private final Handler f30328f;
        @Nullable

        /* renamed from: g */
        private AbstractC5285f<Void> f30329g = null;

        public ExecutorC9694c(@NonNull AbstractC4510u<?> abstractC4510u) {
            this.f30327e = abstractC4510u;
            this.f30328f = new Handler(abstractC4510u.m23928h());
        }

        /* renamed from: a */
        static long m7429a(int i) {
            return (long) (f30324b * Math.pow(f30325c, i) * ((((Math.random() * 2.0d) - 1.0d) * f30326d) + 1.0d));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m7427a(@NonNull final AbstractC9692b abstractC9692b, @NonNull final C5286g<Void> c5286g, final int i) {
            this.f30327e.m23934b(abstractC9692b).mo20796a(this, new AbstractC5281b<Status>() { // from class: com.google.firebase.appindexing.internal.c.c.1
                @Override // com.google.android.gms.p239g.AbstractC5281b
                /* renamed from: a */
                public void mo7422a(@NonNull AbstractC5285f<Status> abstractC5285f) {
                    if (i < ExecutorC9694c.f30323a && ExecutorC9694c.m7423c(abstractC5285f)) {
                        Runnable runnable = new Runnable() { // from class: com.google.firebase.appindexing.internal.c.c.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ExecutorC9694c.this.m7427a(abstractC9692b, c5286g, i + 1);
                            }
                        };
                        long m7429a = ExecutorC9694c.m7429a(i);
                        if (ExecutorC9694c.this.f30328f.postDelayed(runnable, m7429a)) {
                            C9706g.m7406a(new StringBuilder(47).append("Task will be retried in ").append(m7429a).append(" ms").toString());
                            return;
                        }
                        C9706g.m7406a("Failed to schedule retry -- failing immediately!");
                    }
                    if (!abstractC5285f.mo7012b()) {
                        c5286g.m20831a(abstractC5285f.mo6993d());
                        return;
                    }
                    Status mo6998c = abstractC5285f.mo6998c();
                    if (mo6998c.m24018f()) {
                        c5286g.m20830a((C5286g) null);
                    } else {
                        c5286g.m20831a((Exception) C9710k.m7396a(mo6998c, "Indexing error, please try again."));
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static boolean m7423c(@NonNull AbstractC5285f<Status> abstractC5285f) {
            if (abstractC5285f.mo7012b()) {
                return C9698d.m7421a(abstractC5285f.mo6998c().m24015i());
            }
            return false;
        }

        /* renamed from: a */
        public AbstractC5285f<Void> m7428a(@NonNull final AbstractC9692b abstractC9692b) {
            AbstractC5285f<Void> abstractC5285f;
            final C5286g<Void> c5286g = new C5286g<>();
            AbstractC5285f<Void> m20832a = c5286g.m20832a();
            synchronized (this) {
                abstractC5285f = this.f30329g;
                this.f30329g = m20832a;
            }
            m20832a.mo20796a(this, this);
            if (abstractC5285f == null) {
                m7427a(abstractC9692b, c5286g, 0);
            } else {
                abstractC5285f.mo20796a(this, new AbstractC5281b<Void>() { // from class: com.google.firebase.appindexing.internal.c.c.2
                    @Override // com.google.android.gms.p239g.AbstractC5281b
                    /* renamed from: a */
                    public void mo7422a(@NonNull AbstractC5285f<Void> abstractC5285f2) {
                        ExecutorC9694c.this.m7427a(abstractC9692b, c5286g, 0);
                    }
                });
            }
            return m20832a;
        }

        @Override // com.google.android.gms.p239g.AbstractC5281b
        /* renamed from: a */
        public synchronized void mo7422a(@NonNull AbstractC5285f<Void> abstractC5285f) {
            if (abstractC5285f == this.f30329g) {
                this.f30329g = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f30328f.post(runnable);
        }
    }

    public C9687c(@NonNull Context context) {
        this(context, new C9691a(context));
    }

    C9687c(@NonNull Context context, @NonNull AbstractC4510u<C4467a.AbstractC4468a.C4470b> abstractC4510u) {
        this.f30315c = new ExecutorC9694c(abstractC4510u);
    }

    @Override // com.google.firebase.appindexing.AbstractC9675b
    /* renamed from: a */
    public AbstractC5285f<Void> mo7437a(AbstractC9680g... abstractC9680gArr) {
        if (abstractC9680gArr == null) {
            return C5290i.m20826a((Exception) new NullPointerException("Indexables cannot be null."));
        }
        final Thing[] thingArr = new Thing[abstractC9680gArr.length];
        try {
            System.arraycopy(abstractC9680gArr, 0, thingArr, 0, abstractC9680gArr.length);
            return this.f30315c.m7428a(new AbstractC9692b() { // from class: com.google.firebase.appindexing.internal.c.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.firebase.appindexing.internal.C9687c.AbstractC9692b
                /* renamed from: a */
                protected void mo7431a(AbstractC9703f abstractC9703f) {
                    abstractC9703f.mo7409a(a(), thingArr);
                }
            });
        } catch (ArrayStoreException e) {
            return C5290i.m20826a((Exception) new C9677d("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    @Override // com.google.firebase.appindexing.AbstractC9675b
    /* renamed from: a */
    public AbstractC5285f<Void> mo7436a(final String... strArr) {
        return this.f30315c.m7428a(new AbstractC9692b() { // from class: com.google.firebase.appindexing.internal.c.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.firebase.appindexing.internal.C9687c.AbstractC9692b
            /* renamed from: a */
            protected void mo7431a(AbstractC9703f abstractC9703f) {
                abstractC9703f.mo7408a(a(), strArr);
            }
        });
    }

    @Override // com.google.firebase.appindexing.AbstractC9675b
    /* renamed from: b */
    public AbstractC5285f<Void> mo7435b() {
        return this.f30315c.m7428a(new AbstractC9692b() { // from class: com.google.firebase.appindexing.internal.c.3
            @Override // com.google.firebase.appindexing.internal.C9687c.AbstractC9692b
            /* renamed from: a */
            protected void mo7431a(AbstractC9703f abstractC9703f) {
                abstractC9703f.mo7410a(a());
            }
        });
    }
}
