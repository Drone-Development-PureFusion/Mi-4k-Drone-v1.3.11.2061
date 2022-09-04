package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.p226b.AbstractC3438a;
import com.google.android.gms.ads.p226b.p227a.AbstractC3439a;
import com.google.android.gms.ads.p226b.p227a.AbstractC3440b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.reward.mediation.client.b */
/* loaded from: classes.dex */
public class C3766b implements AbstractC3440b {

    /* renamed from: a */
    private final AbstractC3763a f14677a;

    public C3766b(AbstractC3763a abstractC3763a) {
        this.f14677a = abstractC3763a;
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: a */
    public void mo26946a(AbstractC3439a abstractC3439a) {
        C4588d.m23620b("onInitializationSucceeded must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onInitializationSucceeded.");
        try {
            this.f14677a.mo18544a(BinderC4173f.m25293a(abstractC3439a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onInitializationSucceeded.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: a */
    public void mo26945a(AbstractC3439a abstractC3439a, int i) {
        C4588d.m23620b("onInitializationFailed must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onInitializationFailed.");
        try {
            this.f14677a.mo18543a(BinderC4173f.m25293a(abstractC3439a), i);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onInitializationFailed.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: a */
    public void mo26944a(AbstractC3439a abstractC3439a, AbstractC3438a abstractC3438a) {
        C4588d.m23620b("onRewarded must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onRewarded.");
        try {
            if (abstractC3438a != null) {
                this.f14677a.mo18542a(BinderC4173f.m25293a(abstractC3439a), new RewardItemParcel(abstractC3438a));
            } else {
                this.f14677a.mo18542a(BinderC4173f.m25293a(abstractC3439a), new RewardItemParcel(abstractC3439a.getClass().getName(), 1));
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onRewarded.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: b */
    public void mo26943b(AbstractC3439a abstractC3439a) {
        C4588d.m23620b("onAdLoaded must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLoaded.");
        try {
            this.f14677a.mo18539b(BinderC4173f.m25293a(abstractC3439a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: b */
    public void mo26942b(AbstractC3439a abstractC3439a, int i) {
        C4588d.m23620b("onAdFailedToLoad must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdFailedToLoad.");
        try {
            this.f14677a.mo18538b(BinderC4173f.m25293a(abstractC3439a), i);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: c */
    public void mo26941c(AbstractC3439a abstractC3439a) {
        C4588d.m23620b("onAdOpened must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdOpened.");
        try {
            this.f14677a.mo18537c(BinderC4173f.m25293a(abstractC3439a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: d */
    public void mo26940d(AbstractC3439a abstractC3439a) {
        C4588d.m23620b("onVideoStarted must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onVideoStarted.");
        try {
            this.f14677a.mo18536d(BinderC4173f.m25293a(abstractC3439a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onVideoStarted.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: e */
    public void mo26939e(AbstractC3439a abstractC3439a) {
        C4588d.m23620b("onAdClosed must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdClosed.");
        try {
            this.f14677a.mo18535e(BinderC4173f.m25293a(abstractC3439a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: f */
    public void mo26938f(AbstractC3439a abstractC3439a) {
        C4588d.m23620b("onAdClicked must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdClicked.");
        try {
            this.f14677a.mo18534f(BinderC4173f.m25293a(abstractC3439a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClicked.", e);
        }
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3440b
    /* renamed from: g */
    public void mo26937g(AbstractC3439a abstractC3439a) {
        C4588d.m23620b("onAdLeftApplication must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLeftApplication.");
        try {
            this.f14677a.mo18533g(BinderC4173f.m25293a(abstractC3439a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLeftApplication.", e);
        }
    }
}
