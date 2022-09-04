package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.acz;
import java.util.concurrent.atomic.AtomicBoolean;
@aaa
/* renamed from: com.google.android.gms.internal.zj */
/* loaded from: classes.dex */
public abstract class AbstractC8104zj implements abx<Void>, acz.AbstractC6197a {

    /* renamed from: a */
    protected final C8113zn.AbstractC8114a f26453a;

    /* renamed from: b */
    protected final Context f26454b;

    /* renamed from: c */
    protected final acy f26455c;

    /* renamed from: d */
    protected final abi.C6129a f26456d;

    /* renamed from: e */
    protected AdResponseParcel f26457e;

    /* renamed from: g */
    private Runnable f26459g;

    /* renamed from: f */
    protected final Object f26458f = new Object();

    /* renamed from: h */
    private AtomicBoolean f26460h = new AtomicBoolean(true);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8104zj(Context context, abi.C6129a c6129a, acy acyVar, C8113zn.AbstractC8114a abstractC8114a) {
        this.f26454b = context;
        this.f26456d = c6129a;
        this.f26457e = this.f26456d.f20921b;
        this.f26455c = acyVar;
        this.f26453a = abstractC8114a;
    }

    /* renamed from: b */
    private abi m12821b(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.f26456d.f20920a;
        return new abi(adRequestInfoParcel.f14487c, this.f26455c, this.f26457e.f14568d, i, this.f26457e.f14570f, this.f26457e.f14574j, this.f26457e.f14576l, this.f26457e.f14575k, adRequestInfoParcel.f14493i, this.f26457e.f14572h, null, null, null, null, null, this.f26457e.f14573i, this.f26456d.f20923d, this.f26457e.f14571g, this.f26456d.f20925f, this.f26457e.f14578n, this.f26457e.f14579o, this.f26456d.f20927h, null, this.f26457e.f14552C, this.f26457e.f14553D, this.f26457e.f14554E, this.f26457e.f14555F, this.f26457e.f14556G, null, this.f26457e.f14559J, this.f26457e.f14563N);
    }

    @Override // com.google.android.gms.internal.abx
    /* renamed from: a */
    public final Void mo12820e() {
        C4588d.m23620b("Webview render task needs to be called on UI thread.");
        this.f26459g = new Runnable() { // from class: com.google.android.gms.internal.zj.1
            @Override // java.lang.Runnable
            public void run() {
                if (!AbstractC8104zj.this.f26460h.get()) {
                    return;
                }
                abr.b("Timed out waiting for WebView to finish loading.");
                AbstractC8104zj.this.mo12794d();
            }
        };
        abv.f21039a.postDelayed(this.f26459g, C7788uf.f25767aY.m13486c().longValue());
        mo12798b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12795a(int i) {
        if (i != -2) {
            this.f26457e = new AdResponseParcel(i, this.f26457e.f14575k);
        }
        this.f26455c.mo18092e();
        this.f26453a.mo12799b(m12821b(i));
    }

    @Override // com.google.android.gms.internal.acz.AbstractC6197a
    /* renamed from: a */
    public void mo12714a(acy acyVar, boolean z) {
        int i = 0;
        abr.a("WebView finished loading.");
        if (!this.f26460h.getAndSet(false)) {
            return;
        }
        if (z) {
            i = mo12804c();
        }
        mo12795a(i);
        abv.f21039a.removeCallbacks(this.f26459g);
    }

    /* renamed from: b */
    protected abstract void mo12798b();

    /* renamed from: c */
    protected int mo12804c() {
        return -2;
    }

    @Override // com.google.android.gms.internal.abx
    /* renamed from: d */
    public void mo12794d() {
        if (!this.f26460h.getAndSet(false)) {
            return;
        }
        this.f26455c.stopLoading();
        C3779u.m26888g().m18304a(this.f26455c);
        mo12795a(-1);
        abv.f21039a.removeCallbacks(this.f26459g);
    }
}
