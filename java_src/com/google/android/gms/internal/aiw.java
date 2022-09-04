package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.AbstractC4504o;
import com.google.android.gms.common.api.AbstractC4505p;
import com.google.android.gms.common.api.AbstractC4506q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class aiw<R extends AbstractC4502m> extends AbstractC4506q<R> implements AbstractC4503n<R> {

    /* renamed from: g */
    private final WeakReference<AbstractC4489g> f21960g;

    /* renamed from: h */
    private final HandlerC6388a f21961h;

    /* renamed from: a */
    private AbstractC4505p<? super R, ? extends AbstractC4502m> f21954a = null;

    /* renamed from: b */
    private aiw<? extends AbstractC4502m> f21955b = null;

    /* renamed from: c */
    private volatile AbstractC4504o<? super R> f21956c = null;

    /* renamed from: d */
    private AbstractC4494i<R> f21957d = null;

    /* renamed from: e */
    private final Object f21958e = new Object();

    /* renamed from: f */
    private Status f21959f = null;

    /* renamed from: i */
    private boolean f21962i = false;

    /* renamed from: com.google.android.gms.internal.aiw$a */
    /* loaded from: classes2.dex */
    private final class HandlerC6388a extends Handler {
        public HandlerC6388a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    AbstractC4494i<?> abstractC4494i = (AbstractC4494i) message.obj;
                    synchronized (aiw.this.f21958e) {
                        if (abstractC4494i == null) {
                            aiw.this.f21955b.m17190a(new Status(13, "Transform returned null"));
                        } else if (abstractC4494i instanceof ais) {
                            aiw.this.f21955b.m17190a(((ais) abstractC4494i).m17195b());
                        } else {
                            aiw.this.f21955b.m17189a(abstractC4494i);
                        }
                    }
                    return;
                case 1:
                    RuntimeException runtimeException = (RuntimeException) message.obj;
                    String valueOf = String.valueOf(runtimeException.getMessage());
                    Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
                    throw runtimeException;
                default:
                    Log.e("TransformedResultImpl", new StringBuilder(70).append("TransformationResultHandler received unknown message type: ").append(message.what).toString());
                    return;
            }
        }
    }

    public aiw(WeakReference<AbstractC4489g> weakReference) {
        C4588d.m23626a(weakReference, "GoogleApiClient reference must not be null");
        this.f21960g = weakReference;
        AbstractC4489g abstractC4489g = this.f21960g.get();
        this.f21961h = new HandlerC6388a(abstractC4489g != null ? abstractC4489g.mo17251c() : Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17190a(Status status) {
        synchronized (this.f21958e) {
            this.f21959f = status;
            m17182b(this.f21959f);
        }
    }

    /* renamed from: b */
    private void m17183b() {
        if (this.f21954a == null && this.f21956c == null) {
            return;
        }
        AbstractC4489g abstractC4489g = this.f21960g.get();
        if (!this.f21962i && this.f21954a != null && abstractC4489g != null) {
            abstractC4489g.mo17254a((aiw) this);
            this.f21962i = true;
        }
        if (this.f21959f != null) {
            m17182b(this.f21959f);
        } else if (this.f21957d == null) {
        } else {
            this.f21957d.mo13673a(this);
        }
    }

    /* renamed from: b */
    private void m17182b(Status status) {
        synchronized (this.f21958e) {
            if (this.f21954a != null) {
                Status m23945a = this.f21954a.m23945a(status);
                C4588d.m23626a(m23945a, "onFailure must not return null");
                this.f21955b.m17190a(m23945a);
            } else if (m17179c()) {
                this.f21956c.mo23947a(status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m17181b(AbstractC4502m abstractC4502m) {
        if (abstractC4502m instanceof AbstractC4500k) {
            try {
                ((AbstractC4500k) abstractC4502m).mo7804b();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(abstractC4502m);
                Log.w("TransformedResultImpl", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    /* renamed from: c */
    private boolean m17179c() {
        return (this.f21956c == null || this.f21960g.get() == null) ? false : true;
    }

    @Override // com.google.android.gms.common.api.AbstractC4506q
    @NonNull
    /* renamed from: a */
    public <S extends AbstractC4502m> AbstractC4506q<S> mo17187a(@NonNull AbstractC4505p<? super R, ? extends S> abstractC4505p) {
        aiw<? extends AbstractC4502m> aiwVar;
        boolean z = true;
        synchronized (this.f21958e) {
            C4588d.m23622a(this.f21954a == null, "Cannot call then() twice.");
            if (this.f21956c != null) {
                z = false;
            }
            C4588d.m23622a(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f21954a = abstractC4505p;
            aiwVar = new aiw<>(this.f21960g);
            this.f21955b = aiwVar;
            m17183b();
        }
        return aiwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m17191a() {
        this.f21956c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m17189a(AbstractC4494i<?> abstractC4494i) {
        synchronized (this.f21958e) {
            this.f21957d = abstractC4494i;
            m17183b();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4503n
    /* renamed from: a */
    public void mo7161a(final R r) {
        synchronized (this.f21958e) {
            if (!r.mo7645a().m24018f()) {
                m17190a(r.mo7645a());
                m17181b(r);
            } else if (this.f21954a != null) {
                air.m17198a().submit(new Runnable() { // from class: com.google.android.gms.internal.aiw.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    @WorkerThread
                    public void run() {
                        try {
                            try {
                                ahn.f21749i.set(true);
                                aiw.this.f21961h.sendMessage(aiw.this.f21961h.obtainMessage(0, aiw.this.f21954a.m23944a((AbstractC4505p) r)));
                                ahn.f21749i.set(false);
                                aiw.this.m17181b(r);
                                AbstractC4489g abstractC4489g = (AbstractC4489g) aiw.this.f21960g.get();
                                if (abstractC4489g == null) {
                                    return;
                                }
                                abstractC4489g.mo17252b(aiw.this);
                            } catch (RuntimeException e) {
                                aiw.this.f21961h.sendMessage(aiw.this.f21961h.obtainMessage(1, e));
                                ahn.f21749i.set(false);
                                aiw.this.m17181b(r);
                                AbstractC4489g abstractC4489g2 = (AbstractC4489g) aiw.this.f21960g.get();
                                if (abstractC4489g2 == null) {
                                    return;
                                }
                                abstractC4489g2.mo17252b(aiw.this);
                            }
                        } catch (Throwable th) {
                            ahn.f21749i.set(false);
                            aiw.this.m17181b(r);
                            AbstractC4489g abstractC4489g3 = (AbstractC4489g) aiw.this.f21960g.get();
                            if (abstractC4489g3 != null) {
                                abstractC4489g3.mo17252b(aiw.this);
                            }
                            throw th;
                        }
                    }
                });
            } else if (m17179c()) {
                this.f21956c.mo23946b(r);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4506q
    /* renamed from: a */
    public void mo17188a(@NonNull AbstractC4504o<? super R> abstractC4504o) {
        boolean z = true;
        synchronized (this.f21958e) {
            C4588d.m23622a(this.f21956c == null, "Cannot call andFinally() twice.");
            if (this.f21954a != null) {
                z = false;
            }
            C4588d.m23622a(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f21956c = abstractC4504o;
            m17183b();
        }
    }
}
