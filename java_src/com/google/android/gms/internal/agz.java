package com.google.android.gms.internal;

import android.os.Process;
import android.util.Log;
import com.google.android.gms.clearcut.AbstractC4462c;
import com.google.android.gms.clearcut.C4456b;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.ahc;
import com.google.android.gms.internal.ahl;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class agz implements AbstractC4462c {

    /* renamed from: b */
    private static ScheduledExecutorService f21685b;

    /* renamed from: e */
    private final AbstractC4682e f21688e;

    /* renamed from: f */
    private final AbstractC6324a f21689f;

    /* renamed from: g */
    private final Object f21690g;

    /* renamed from: h */
    private long f21691h;

    /* renamed from: i */
    private final long f21692i;

    /* renamed from: j */
    private ScheduledFuture<?> f21693j;

    /* renamed from: k */
    private AbstractC4489g f21694k;

    /* renamed from: l */
    private final Runnable f21695l;

    /* renamed from: a */
    private static final Object f21684a = new Object();

    /* renamed from: c */
    private static final C6329e f21686c = new C6329e();

    /* renamed from: d */
    private static final long f21687d = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);

    /* renamed from: com.google.android.gms.internal.agz$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6324a {
    }

    /* renamed from: com.google.android.gms.internal.agz$b */
    /* loaded from: classes2.dex */
    public static class C6325b implements AbstractC6324a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.agz$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6326c<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, aha> {
        public AbstractC6326c(AbstractC4489g abstractC4489g) {
            super(C4456b.f16713c, abstractC4489g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.agz$d */
    /* loaded from: classes2.dex */
    public static final class C6327d extends AbstractC6326c<Status> {

        /* renamed from: a */
        private final LogEventParcelable f21704a;

        C6327d(LogEventParcelable logEventParcelable, AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
            this.f21704a = logEventParcelable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(aha ahaVar) {
            ahc.AbstractBinderC6331a abstractBinderC6331a = new ahc.AbstractBinderC6331a() { // from class: com.google.android.gms.internal.agz.d.1
                @Override // com.google.android.gms.internal.ahc
                /* renamed from: a */
                public void mo17507a(Status status) {
                    C6327d.this.b((C6327d) status);
                }
            };
            try {
                agz.m17529b(this.f21704a);
                ahaVar.m17518a(abstractBinderC6331a, this.f21704a);
            } catch (RuntimeException e) {
                Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                c(new Status(10, "MessageProducer"));
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6327d)) {
                return false;
            }
            return this.f21704a.equals(((C6327d) obj).f21704a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f21704a);
            return new StringBuilder(String.valueOf(valueOf).length() + 12).append("MethodImpl(").append(valueOf).append(")").toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.agz$e */
    /* loaded from: classes2.dex */
    public static final class C6329e {

        /* renamed from: a */
        private int f21706a;

        private C6329e() {
            this.f21706a = 0;
        }

        /* renamed from: a */
        public synchronized void m17521a() {
            this.f21706a++;
        }

        /* renamed from: b */
        public synchronized void m17520b() {
            if (this.f21706a == 0) {
                throw new RuntimeException("too many decrements");
            }
            this.f21706a--;
            if (this.f21706a == 0) {
                notifyAll();
            }
        }
    }

    public agz() {
        this(new C4685h(), f21687d, new C6325b());
    }

    public agz(AbstractC4682e abstractC4682e, long j, AbstractC6324a abstractC6324a) {
        this.f21690g = new Object();
        this.f21691h = 0L;
        this.f21693j = null;
        this.f21694k = null;
        this.f21695l = new Runnable() { // from class: com.google.android.gms.internal.agz.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (agz.this.f21690g) {
                    if (agz.m17527b(agz.this) <= agz.this.f21688e.mo16432b() && agz.this.f21694k != null) {
                        Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
                        agz.this.f21694k.mo17356g();
                        agz.this.f21694k = null;
                    }
                }
            }
        };
        this.f21688e = abstractC4682e;
        this.f21692i = j;
        this.f21689f = abstractC6324a;
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m17533a(final AbstractC4489g abstractC4489g, final AbstractC6326c<Status> abstractC6326c) {
        m17530b().execute(new Runnable() { // from class: com.google.android.gms.internal.agz.3
            @Override // java.lang.Runnable
            public void run() {
                abstractC4489g.mo17255a((AbstractC4489g) abstractC6326c);
            }
        });
        return abstractC6326c;
    }

    /* renamed from: b */
    static /* synthetic */ long m17527b(agz agzVar) {
        return 0L;
    }

    /* renamed from: b */
    private C6327d m17528b(AbstractC4489g abstractC4489g, LogEventParcelable logEventParcelable) {
        f21686c.m17521a();
        C6327d c6327d = new C6327d(logEventParcelable, abstractC4489g);
        c6327d.a(new AbstractC4494i.AbstractC4495a() { // from class: com.google.android.gms.internal.agz.4
            @Override // com.google.android.gms.common.api.AbstractC4494i.AbstractC4495a
            /* renamed from: a */
            public void mo17524a(Status status) {
                agz.f21686c.m17520b();
            }
        });
        return c6327d;
    }

    /* renamed from: b */
    private ScheduledExecutorService m17530b() {
        synchronized (f21684a) {
            if (f21685b == null) {
                f21685b = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.agz.2
                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(final Runnable runnable) {
                        return new Thread(new Runnable() { // from class: com.google.android.gms.internal.agz.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Process.setThreadPriority(10);
                                runnable.run();
                            }
                        }, "ClearcutLoggerApiImpl");
                    }
                });
            }
        }
        return f21685b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m17529b(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.f16707j != null && logEventParcelable.f16706i.f25427k.length == 0) {
            logEventParcelable.f16706i.f25427k = logEventParcelable.f16707j.m24055a();
        }
        if (logEventParcelable.f16708k != null && logEventParcelable.f16706i.f25434r.length == 0) {
            logEventParcelable.f16706i.f25434r = logEventParcelable.f16708k.m24055a();
        }
        logEventParcelable.f16700c = AbstractC7649rd.m13857a(logEventParcelable.f16706i);
    }

    @Override // com.google.android.gms.clearcut.AbstractC4462c
    /* renamed from: a */
    public AbstractC4494i<Status> mo17534a(AbstractC4489g abstractC4489g, LogEventParcelable logEventParcelable) {
        return m17533a(abstractC4489g, m17528b(abstractC4489g, logEventParcelable));
    }
}
