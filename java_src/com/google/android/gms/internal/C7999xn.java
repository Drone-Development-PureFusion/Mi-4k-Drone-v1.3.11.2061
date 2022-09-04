package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@aaa
/* renamed from: com.google.android.gms.internal.xn */
/* loaded from: classes.dex */
public class C7999xn implements AbstractC7988xf {

    /* renamed from: a */
    private final AdRequestInfoParcel f26278a;

    /* renamed from: b */
    private final AbstractC8005xq f26279b;

    /* renamed from: c */
    private final Context f26280c;

    /* renamed from: d */
    private final C7990xh f26281d;

    /* renamed from: e */
    private final boolean f26282e;

    /* renamed from: f */
    private final long f26283f;

    /* renamed from: g */
    private final long f26284g;

    /* renamed from: h */
    private final int f26285h;

    /* renamed from: l */
    private final boolean f26289l;

    /* renamed from: i */
    private final Object f26286i = new Object();

    /* renamed from: j */
    private boolean f26287j = false;

    /* renamed from: k */
    private final Map<aco<C7996xl>, C7993xk> f26288k = new HashMap();

    /* renamed from: m */
    private List<C7996xl> f26290m = new ArrayList();

    public C7999xn(Context context, AdRequestInfoParcel adRequestInfoParcel, AbstractC8005xq abstractC8005xq, C7990xh c7990xh, boolean z, boolean z2, long j, long j2, int i) {
        this.f26280c = context;
        this.f26278a = adRequestInfoParcel;
        this.f26279b = abstractC8005xq;
        this.f26281d = c7990xh;
        this.f26282e = z;
        this.f26289l = z2;
        this.f26283f = j;
        this.f26284g = j2;
        this.f26285h = i;
    }

    /* renamed from: a */
    private void m13069a(final aco<C7996xl> acoVar) {
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.xn.2
            @Override // java.lang.Runnable
            public void run() {
                for (aco acoVar2 : C7999xn.this.f26288k.keySet()) {
                    if (acoVar2 != acoVar) {
                        ((C7993xk) C7999xn.this.f26288k.get(acoVar2)).m13098a();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private C7996xl m13066b(List<aco<C7996xl>> list) {
        synchronized (this.f26286i) {
            if (this.f26287j) {
                return new C7996xl(-1);
            }
            for (aco<C7996xl> acoVar : list) {
                try {
                    C7996xl c7996xl = acoVar.get();
                    this.f26290m.add(c7996xl);
                    if (c7996xl != null && c7996xl.f26271a == 0) {
                        m13069a(acoVar);
                        return c7996xl;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    abr.d("Exception while processing an adapter; continuing with other adapters", e);
                }
            }
            m13069a((aco<C7996xl>) null);
            return new C7996xl(1);
        }
    }

    /* renamed from: c */
    private C7996xl m13064c(List<aco<C7996xl>> list) {
        C7996xl c7996xl;
        C7996xl c7996xl2;
        aco<C7996xl> acoVar;
        int i;
        AbstractC8014xt abstractC8014xt;
        synchronized (this.f26286i) {
            if (this.f26287j) {
                return new C7996xl(-1);
            }
            int i2 = -1;
            aco<C7996xl> acoVar2 = null;
            C7996xl c7996xl3 = null;
            long j = this.f26281d.f26244m != -1 ? this.f26281d.f26244m : 10000L;
            Iterator<aco<C7996xl>> it2 = list.iterator();
            while (true) {
                long j2 = j;
                if (!it2.hasNext()) {
                    break;
                }
                aco<C7996xl> next = it2.next();
                long mo16434a = C3779u.m26884k().mo16434a();
                if (j2 == 0) {
                    try {
                        try {
                        } finally {
                            Math.max(j2 - (C3779u.m26884k().mo16434a() - mo16434a), 0L);
                        }
                    } catch (RemoteException | InterruptedException | ExecutionException | TimeoutException e) {
                        abr.d("Exception while processing an adapter; continuing with other adapters", e);
                    }
                    if (next.isDone()) {
                        c7996xl = next.get();
                        this.f26290m.add(c7996xl);
                        if (c7996xl != null || c7996xl.f26271a != 0 || (abstractC8014xt = c7996xl.f26276f) == null || abstractC8014xt.mo13040a() <= i2) {
                            c7996xl2 = c7996xl3;
                            acoVar = acoVar2;
                            i = i2;
                        } else {
                            i = abstractC8014xt.mo13040a();
                            C7996xl c7996xl4 = c7996xl;
                            acoVar = next;
                            c7996xl2 = c7996xl4;
                        }
                        acoVar2 = acoVar;
                        C7996xl c7996xl5 = c7996xl2;
                        j = Math.max(j2 - (C3779u.m26884k().mo16434a() - mo16434a), 0L);
                        i2 = i;
                        c7996xl3 = c7996xl5;
                    }
                }
                c7996xl = next.get(j2, TimeUnit.MILLISECONDS);
                this.f26290m.add(c7996xl);
                if (c7996xl != null) {
                }
                c7996xl2 = c7996xl3;
                acoVar = acoVar2;
                i = i2;
                acoVar2 = acoVar;
                C7996xl c7996xl52 = c7996xl2;
                j = Math.max(j2 - (C3779u.m26884k().mo16434a() - mo16434a), 0L);
                i2 = i;
                c7996xl3 = c7996xl52;
            }
            m13069a(acoVar2);
            return c7996xl3 == null ? new C7996xl(1) : c7996xl3;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7988xf
    /* renamed from: a */
    public C7996xl mo13059a(List<C7989xg> list) {
        abr.a("Starting mediation.");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        for (C7989xg c7989xg : list) {
            String valueOf = String.valueOf(c7989xg.f26217b);
            abr.c(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            for (String str : c7989xg.f26218c) {
                final C7993xk c7993xk = new C7993xk(this.f26280c, str, this.f26279b, this.f26281d, c7989xg, this.f26278a.f14487c, this.f26278a.f14488d, this.f26278a.f14495k, this.f26282e, this.f26289l, this.f26278a.f14510z, this.f26278a.f14498n);
                aco<C7996xl> m18388a = abu.m18388a(newCachedThreadPool, new Callable<C7996xl>() { // from class: com.google.android.gms.internal.xn.1
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a */
                    public C7996xl call() {
                        synchronized (C7999xn.this.f26286i) {
                            if (C7999xn.this.f26287j) {
                                return null;
                            }
                            return c7993xk.m13097a(C7999xn.this.f26283f, C7999xn.this.f26284g);
                        }
                    }
                });
                this.f26288k.put(m18388a, c7993xk);
                arrayList.add(m18388a);
            }
        }
        switch (this.f26285h) {
            case 2:
                return m13064c(arrayList);
            default:
                return m13066b(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7988xf
    /* renamed from: a */
    public void mo13060a() {
        synchronized (this.f26286i) {
            this.f26287j = true;
            for (C7993xk c7993xk : this.f26288k.values()) {
                c7993xk.m13098a();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7988xf
    /* renamed from: b */
    public List<C7996xl> mo13058b() {
        return this.f26290m;
    }
}
