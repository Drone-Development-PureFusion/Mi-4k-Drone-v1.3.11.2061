package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
@aaa
/* renamed from: com.google.android.gms.internal.zm */
/* loaded from: classes.dex */
public abstract class AbstractC8109zm extends abq {

    /* renamed from: a */
    protected final C8113zn.AbstractC8114a f26475a;

    /* renamed from: b */
    protected final Context f26476b;

    /* renamed from: c */
    protected final Object f26477c = new Object();

    /* renamed from: d */
    protected final Object f26478d = new Object();

    /* renamed from: e */
    protected final abi.C6129a f26479e;

    /* renamed from: f */
    protected AdResponseParcel f26480f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.internal.zm$a */
    /* loaded from: classes2.dex */
    public static final class C8112a extends Exception {

        /* renamed from: a */
        private final int f26484a;

        public C8112a(String str, int i) {
            super(str);
            this.f26484a = i;
        }

        /* renamed from: a */
        public int m12802a() {
            return this.f26484a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8109zm(Context context, abi.C6129a c6129a, C8113zn.AbstractC8114a abstractC8114a) {
        super(true);
        this.f26476b = context;
        this.f26479e = c6129a;
        this.f26480f = c6129a.f20921b;
        this.f26475a = abstractC8114a;
    }

    /* renamed from: a */
    protected abstract abi mo12791a(int i);

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        synchronized (this.f26477c) {
            abr.a("AdRendererBackgroundTask started.");
            int i = this.f26479e.f20924e;
            try {
                mo12790a(SystemClock.elapsedRealtime());
            } catch (C8112a e) {
                int m12802a = e.m12802a();
                if (m12802a == 3 || m12802a == -1) {
                    abr.c(e.getMessage());
                } else {
                    abr.d(e.getMessage());
                }
                if (this.f26480f == null) {
                    this.f26480f = new AdResponseParcel(m12802a);
                } else {
                    this.f26480f = new AdResponseParcel(m12802a, this.f26480f.f14575k);
                }
                abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.zm.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC8109zm.this.mo12779b();
                    }
                });
                i = m12802a;
            }
            final abi mo12791a = mo12791a(i);
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.zm.2
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AbstractC8109zm.this.f26477c) {
                        AbstractC8109zm.this.m12803a(mo12791a);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    protected abstract void mo12790a(long j);

    /* renamed from: a */
    protected void m12803a(abi abiVar) {
        this.f26475a.mo12799b(abiVar);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
    }
}
