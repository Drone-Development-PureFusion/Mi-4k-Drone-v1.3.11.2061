package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.internal.C7756tp;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
@aaa
/* renamed from: com.google.android.gms.ads.internal.cache.a */
/* loaded from: classes.dex */
public class C3488a {

    /* renamed from: a */
    private final Runnable f13835a = new Runnable() { // from class: com.google.android.gms.ads.internal.cache.a.1
        @Override // java.lang.Runnable
        public void run() {
            C3488a.this.m27654c();
        }
    };

    /* renamed from: b */
    private final Object f13836b = new Object();
    @Nullable

    /* renamed from: c */
    private C3494c f13837c;
    @Nullable

    /* renamed from: d */
    private Context f13838d;
    @Nullable

    /* renamed from: e */
    private AbstractC3497f f13839e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m27656b() {
        synchronized (this.f13836b) {
            if (this.f13838d == null || this.f13837c != null) {
                return;
            }
            this.f13837c = m27658a(new AbstractC4600p.AbstractC4602b() { // from class: com.google.android.gms.ads.internal.cache.a.3
                @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
                /* renamed from: a */
                public void mo10593a(int i) {
                    synchronized (C3488a.this.f13836b) {
                        C3488a.this.f13837c = null;
                        C3488a.this.f13839e = null;
                        C3488a.this.f13836b.notifyAll();
                        C3779u.m26874u().m18233b();
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
                /* renamed from: a */
                public void mo10591a(@Nullable Bundle bundle) {
                    synchronized (C3488a.this.f13836b) {
                        try {
                            C3488a.this.f13839e = C3488a.this.f13837c.m27647f_();
                        } catch (DeadObjectException e) {
                            abr.b("Unable to obtain a cache service instance.", e);
                            C3488a.this.m27654c();
                        }
                        C3488a.this.f13836b.notifyAll();
                    }
                }
            }, new AbstractC4600p.AbstractC4603c() { // from class: com.google.android.gms.ads.internal.cache.a.4
                @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4603c
                /* renamed from: a */
                public void mo10590a(@NonNull ConnectionResult connectionResult) {
                    synchronized (C3488a.this.f13836b) {
                        C3488a.this.f13837c = null;
                        C3488a.this.f13839e = null;
                        C3488a.this.f13836b.notifyAll();
                        C3779u.m26874u().m18233b();
                    }
                }
            });
            this.f13837c.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m27654c() {
        synchronized (this.f13836b) {
            if (this.f13837c == null) {
                return;
            }
            if (this.f13837c.t() || this.f13837c.u()) {
                this.f13837c.f();
            }
            this.f13837c = null;
            this.f13839e = null;
            Binder.flushPendingCommands();
            C3779u.m26874u().m18233b();
        }
    }

    /* renamed from: a */
    public CacheEntryParcel m27662a(CacheOffering cacheOffering) {
        CacheEntryParcel cacheEntryParcel;
        synchronized (this.f13836b) {
            if (this.f13839e == null) {
                cacheEntryParcel = new CacheEntryParcel();
            } else {
                try {
                    cacheEntryParcel = this.f13839e.mo27642a(cacheOffering);
                } catch (RemoteException e) {
                    abr.b("Unable to call into cache service.", e);
                    cacheEntryParcel = new CacheEntryParcel();
                }
            }
        }
        return cacheEntryParcel;
    }

    /* renamed from: a */
    protected C3494c m27658a(AbstractC4600p.AbstractC4602b abstractC4602b, AbstractC4600p.AbstractC4603c abstractC4603c) {
        return new C3494c(this.f13838d, C3779u.m26874u().m18235a(), abstractC4602b, abstractC4603c);
    }

    /* renamed from: a */
    public void m27664a() {
        if (C7788uf.f25885cz.m13486c().booleanValue()) {
            synchronized (this.f13836b) {
                m27656b();
                C3779u.m26890e();
                abv.f21039a.removeCallbacks(this.f13835a);
                C3779u.m26890e();
                abv.f21039a.postDelayed(this.f13835a, C7788uf.f25849cA.m13486c().longValue());
            }
        }
    }

    /* renamed from: a */
    public void m27663a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f13836b) {
            if (this.f13838d != null) {
                return;
            }
            this.f13838d = context.getApplicationContext();
            if (C7788uf.f25884cy.m13486c().booleanValue()) {
                m27656b();
            } else if (C7788uf.f25883cx.m13486c().booleanValue()) {
                m27657a(new C7756tp.AbstractC7759b() { // from class: com.google.android.gms.ads.internal.cache.a.2
                    @Override // com.google.android.gms.internal.C7756tp.AbstractC7759b
                    /* renamed from: a */
                    public void mo13545a(boolean z) {
                        if (z) {
                            C3488a.this.m27656b();
                        } else {
                            C3488a.this.m27654c();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    protected void m27657a(C7756tp.AbstractC7759b abstractC7759b) {
        C3779u.m26887h().m13557a(abstractC7759b);
    }
}
