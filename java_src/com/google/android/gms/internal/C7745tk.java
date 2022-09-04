package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.tk */
/* loaded from: classes.dex */
public class C7745tk extends AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf {

    /* renamed from: d */
    private final AbstractC7980wy f25624d;

    public C7745tk(Context context, AdSizeParcel adSizeParcel, abi abiVar, VersionInfoParcel versionInfoParcel, AbstractC7753tm abstractC7753tm, AbstractC7980wy abstractC7980wy) {
        super(context, adSizeParcel, abiVar, versionInfoParcel, abstractC7753tm);
        this.f25624d = abstractC7980wy;
        a(this.f25624d);
        a();
        a(3);
        String valueOf = String.valueOf(this.f25581b.m13604d());
        abr.a(valueOf.length() != 0 ? "Tracking ad unit: ".concat(valueOf) : new String("Tracking ad unit: "));
    }

    @Override // com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf
    /* renamed from: b */
    protected void mo13588b(JSONObject jSONObject) {
        this.f25624d.mo13111a("AFMA_updateActiveView", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf
    /* renamed from: c */
    public void mo13587c() {
        synchronized (this.f25580a) {
            super.mo13587c();
            b(this.f25624d);
        }
    }

    @Override // com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf
    /* renamed from: d */
    public void mo13590d() {
        mo13587c();
    }

    @Override // com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf
    /* renamed from: j */
    protected boolean mo13586j() {
        return true;
    }
}
