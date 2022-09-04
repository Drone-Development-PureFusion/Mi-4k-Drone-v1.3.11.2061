package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.BinderC3698q;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@aaa
/* renamed from: com.google.android.gms.internal.zs */
/* loaded from: classes.dex */
public class C8121zs extends abq {

    /* renamed from: a */
    private final C8113zn.AbstractC8114a f26502a;

    /* renamed from: b */
    private final AdResponseParcel f26503b;

    /* renamed from: c */
    private final abi.C6129a f26504c;

    /* renamed from: d */
    private final CallableC8128zu f26505d;

    /* renamed from: e */
    private final Object f26506e;

    /* renamed from: f */
    private Future<abi> f26507f;

    public C8121zs(Context context, BinderC3698q binderC3698q, abi.C6129a c6129a, C7667ro c7667ro, C8113zn.AbstractC8114a abstractC8114a, C7801un c7801un) {
        this(c6129a, abstractC8114a, new CallableC8128zu(context, binderC3698q, new acc(context), c7667ro, c6129a, c7801un));
    }

    C8121zs(abi.C6129a c6129a, C8113zn.AbstractC8114a abstractC8114a, CallableC8128zu callableC8128zu) {
        this.f26506e = new Object();
        this.f26504c = c6129a;
        this.f26503b = c6129a.f20921b;
        this.f26502a = abstractC8114a;
        this.f26505d = callableC8128zu;
    }

    /* renamed from: a */
    private abi m12781a(int i) {
        return new abi(this.f26504c.f20920a.f14487c, null, null, i, null, null, this.f26503b.f14576l, this.f26503b.f14575k, this.f26504c.f20920a.f14493i, false, null, null, null, null, null, this.f26503b.f14573i, this.f26504c.f20923d, this.f26503b.f14571g, this.f26504c.f20925f, this.f26503b.f14578n, this.f26503b.f14579o, this.f26504c.f20927h, null, null, null, null, this.f26504c.f20921b.f14555F, this.f26504c.f20921b.f14556G, null, null, this.f26503b.f14563N);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        int i;
        final abi abiVar;
        try {
            synchronized (this.f26506e) {
                this.f26507f = abu.m18389a(this.f26505d);
            }
            abiVar = this.f26507f.get(60000L, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (InterruptedException e) {
            abiVar = null;
            i = 0;
        } catch (CancellationException e2) {
            abiVar = null;
            i = 0;
        } catch (ExecutionException e3) {
            abiVar = null;
            i = 0;
        } catch (TimeoutException e4) {
            abr.d("Timed out waiting for native ad.");
            this.f26507f.cancel(true);
            i = 2;
            abiVar = null;
        }
        if (abiVar == null) {
            abiVar = m12781a(i);
        }
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.zs.1
            @Override // java.lang.Runnable
            public void run() {
                C8121zs.this.f26502a.mo12799b(abiVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
        synchronized (this.f26506e) {
            if (this.f26507f != null) {
                this.f26507f.cancel(true);
            }
        }
    }
}
