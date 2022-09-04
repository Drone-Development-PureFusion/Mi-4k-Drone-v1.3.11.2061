package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.p001v4.content.AsyncTaskLoader;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.internal.ait;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class zzb extends AsyncTaskLoader<Void> implements ait {

    /* renamed from: a */
    private Semaphore f15579a = new Semaphore(0);

    /* renamed from: b */
    private Set<AbstractC4489g> f15580b;

    public zzb(Context context, Set<AbstractC4489g> set) {
        super(context);
        this.f15580b = set;
    }

    @Override // android.support.p001v4.content.AsyncTaskLoader
    /* renamed from: a */
    public Void mo40008loadInBackground() {
        int i = 0;
        Iterator<AbstractC4489g> it2 = this.f15580b.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                try {
                    this.f15579a.tryAcquire(i2, 5L, TimeUnit.SECONDS);
                    return null;
                } catch (InterruptedException e) {
                    Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            i = it2.next().mo17375a((ait) this) ? i2 + 1 : i2;
        }
    }

    @Override // com.google.android.gms.internal.ait
    /* renamed from: b */
    public void mo17193b() {
        this.f15579a.release();
    }

    @Override // android.support.p001v4.content.Loader
    protected void onStartLoading() {
        this.f15579a.drainPermits();
        forceLoad();
    }
}
