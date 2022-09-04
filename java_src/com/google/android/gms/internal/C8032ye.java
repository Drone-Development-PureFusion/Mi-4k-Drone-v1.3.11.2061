package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.C3392a;
import com.google.ads.mediation.AbstractC3415e;
import com.google.ads.mediation.AbstractC3416f;
import com.google.ads.mediation.AbstractC3417g;
import com.google.ads.mediation.AbstractC3418h;
import com.google.ads.mediation.AbstractC3419i;
import com.google.ads.mediation.AbstractC3422j;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.ads.internal.util.client.C3784b;
@aaa
/* renamed from: com.google.android.gms.internal.ye */
/* loaded from: classes.dex */
public final class C8032ye<NETWORK_EXTRAS extends AbstractC3422j, SERVER_PARAMETERS extends AbstractC3419i> implements AbstractC3416f, AbstractC3418h {

    /* renamed from: a */
    private final AbstractC8011xs f26341a;

    public C8032ye(AbstractC8011xs abstractC8011xs) {
        this.f26341a = abstractC8011xs;
    }

    @Override // com.google.ads.mediation.AbstractC3416f
    /* renamed from: a */
    public void mo12955a(AbstractC3415e<?, ?> abstractC3415e) {
        C3784b.m26846a("Adapter called onReceivedAd.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onReceivedAd must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13043e();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdLoaded.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13043e();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3416f
    /* renamed from: a */
    public void mo12954a(AbstractC3415e<?, ?> abstractC3415e, final C3392a.EnumC3393a enumC3393a) {
        String valueOf = String.valueOf(enumC3393a);
        C3784b.m26846a(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onFailedToReceiveAd must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13048a(C8044yf.m12942a(enumC3393a));
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdFailedToLoad.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13048a(C8044yf.m12942a(enumC3393a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3418h
    /* renamed from: a */
    public void mo12953a(AbstractC3417g<?, ?> abstractC3417g) {
        C3784b.m26846a("Adapter called onReceivedAd.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onReceivedAd must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13043e();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdLoaded.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13043e();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3418h
    /* renamed from: a */
    public void mo12952a(AbstractC3417g<?, ?> abstractC3417g, final C3392a.EnumC3393a enumC3393a) {
        String valueOf = String.valueOf(enumC3393a);
        C3784b.m26846a(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onFailedToReceiveAd must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13048a(C8044yf.m12942a(enumC3393a));
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdFailedToLoad.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13048a(C8044yf.m12942a(enumC3393a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3416f
    /* renamed from: b */
    public void mo12950b(AbstractC3415e<?, ?> abstractC3415e) {
        C3784b.m26846a("Adapter called onPresentScreen.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onPresentScreen must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13044d();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdOpened.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13044d();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3418h
    /* renamed from: b */
    public void mo12949b(AbstractC3417g<?, ?> abstractC3417g) {
        C3784b.m26846a("Adapter called onPresentScreen.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onPresentScreen must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13044d();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdOpened.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13044d();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3416f
    /* renamed from: c */
    public void mo12948c(AbstractC3415e<?, ?> abstractC3415e) {
        C3784b.m26846a("Adapter called onDismissScreen.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onDismissScreen must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13046b();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdClosed.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13046b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3418h
    /* renamed from: c */
    public void mo12947c(AbstractC3417g<?, ?> abstractC3417g) {
        C3784b.m26846a("Adapter called onDismissScreen.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onDismissScreen must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13046b();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdClosed.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13046b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3416f
    /* renamed from: d */
    public void mo12946d(AbstractC3415e<?, ?> abstractC3415e) {
        C3784b.m26846a("Adapter called onLeaveApplication.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onLeaveApplication must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13045c();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdLeftApplication.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13045c();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3418h
    /* renamed from: d */
    public void mo12945d(AbstractC3417g<?, ?> abstractC3417g) {
        C3784b.m26846a("Adapter called onLeaveApplication.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onLeaveApplication must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13045c();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdLeftApplication.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13045c();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.ads.mediation.AbstractC3416f
    /* renamed from: e */
    public void mo12944e(AbstractC3415e<?, ?> abstractC3415e) {
        C3784b.m26846a("Adapter called onClick.");
        if (!C3514ac.m27586a().m26854b()) {
            C3784b.m26840d("onClick must be called on the main UI thread.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.ye.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C8032ye.this.f26341a.mo13049a();
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not call onAdClicked.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f26341a.mo13049a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClicked.", e);
        }
    }
}
