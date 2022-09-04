package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.AbstractC3448b;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.internal.up */
/* loaded from: classes.dex */
public class C7803up implements AbstractC3448b {

    /* renamed from: a */
    private final AbstractC7804uq f25943a;

    public C7803up(AbstractC7804uq abstractC7804uq) {
        this.f25943a = abstractC7804uq;
    }

    @Override // com.google.android.gms.ads.doubleclick.AbstractC3448b
    /* renamed from: a */
    public String mo13428a() {
        try {
            return this.f25943a.mo13422a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not delegate getBaseURL to CustomRenderedAd", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.AbstractC3448b
    /* renamed from: a */
    public void mo13427a(View view) {
        try {
            this.f25943a.mo13421a(view != null ? BinderC4173f.m25293a(view) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not delegate onAdRendered to CustomRenderedAd", e);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.AbstractC3448b
    /* renamed from: b */
    public String mo13426b() {
        try {
            return this.f25943a.mo13420b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not delegate getContent to CustomRenderedAd", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.AbstractC3448b
    /* renamed from: c */
    public void mo13425c() {
        try {
            this.f25943a.mo13419c();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not delegate recordClick to CustomRenderedAd", e);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.AbstractC3448b
    /* renamed from: d */
    public void mo13424d() {
        try {
            this.f25943a.mo13418d();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not delegate recordImpression to CustomRenderedAd", e);
        }
    }
}
