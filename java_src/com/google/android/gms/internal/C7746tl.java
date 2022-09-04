package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.C7957wx;
import com.google.android.gms.internal.acr;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.tl */
/* loaded from: classes.dex */
public class C7746tl extends AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf {

    /* renamed from: d */
    private C7957wx.C7970c f25625d;

    /* renamed from: e */
    private boolean f25626e;

    public C7746tl(Context context, AdSizeParcel adSizeParcel, abi abiVar, VersionInfoParcel versionInfoParcel, AbstractC7753tm abstractC7753tm, C7957wx c7957wx) {
        super(context, adSizeParcel, abiVar, versionInfoParcel, abstractC7753tm);
        this.f25625d = c7957wx.m13150a();
        try {
            final JSONObject a = a(abstractC7753tm.mo13579c().mo13581a());
            this.f25625d.a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.tl.1
                @Override // com.google.android.gms.internal.acr.AbstractC6193c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo12764a(AbstractC7980wy abstractC7980wy) {
                    C7746tl.this.a(a);
                }
            }, new acr.AbstractC6191a() { // from class: com.google.android.gms.internal.tl.2
                @Override // com.google.android.gms.internal.acr.AbstractC6191a
                /* renamed from: a */
                public void mo12763a() {
                }
            });
        } catch (RuntimeException e) {
            abr.b("Failure while processing active view data.", e);
        } catch (JSONException e2) {
        }
        this.f25625d.a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.tl.3
            @Override // com.google.android.gms.internal.acr.AbstractC6193c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo12764a(AbstractC7980wy abstractC7980wy) {
                C7746tl.this.f25626e = true;
                C7746tl.this.a(abstractC7980wy);
                C7746tl.this.a();
                C7746tl.this.a(3);
            }
        }, new acr.AbstractC6191a() { // from class: com.google.android.gms.internal.tl.4
            @Override // com.google.android.gms.internal.acr.AbstractC6191a
            /* renamed from: a */
            public void mo12763a() {
                C7746tl.this.mo13587c();
            }
        });
        String valueOf = String.valueOf(this.f25581b.m13604d());
        abr.a(valueOf.length() != 0 ? "Tracking ad unit: ".concat(valueOf) : new String("Tracking ad unit: "));
    }

    @Override // com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf
    /* renamed from: b */
    protected void mo13588b(final JSONObject jSONObject) {
        this.f25625d.a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.tl.5
            @Override // com.google.android.gms.internal.acr.AbstractC6193c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo12764a(AbstractC7980wy abstractC7980wy) {
                abstractC7980wy.mo13111a("AFMA_updateActiveView", jSONObject);
            }
        }, new acr.C6192b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf
    /* renamed from: c */
    public void mo13587c() {
        synchronized (this.f25580a) {
            super.mo13587c();
            this.f25625d.a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.tl.6
                @Override // com.google.android.gms.internal.acr.AbstractC6193c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo12764a(AbstractC7980wy abstractC7980wy) {
                    C7746tl.this.b(abstractC7980wy);
                }
            }, new acr.C6192b());
            this.f25625d.m13133v_();
        }
    }

    @Override // com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf
    /* renamed from: j */
    protected boolean mo13586j() {
        return this.f25626e;
    }
}
