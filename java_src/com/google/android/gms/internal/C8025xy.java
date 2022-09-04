package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.mediation.AbstractC3794c;
import com.google.android.gms.ads.mediation.AbstractC3807d;
import com.google.android.gms.ads.mediation.AbstractC3808e;
import com.google.android.gms.ads.mediation.AbstractC3809f;
import com.google.android.gms.ads.mediation.AbstractC3810g;
import com.google.android.gms.ads.mediation.AbstractC3811h;
import com.google.android.gms.ads.mediation.AbstractC3812i;
import com.google.android.gms.common.internal.C4588d;
@aaa
/* renamed from: com.google.android.gms.internal.xy */
/* loaded from: classes.dex */
public final class C8025xy implements AbstractC3807d, AbstractC3809f, AbstractC3811h {

    /* renamed from: a */
    private final AbstractC8011xs f26326a;

    /* renamed from: b */
    private AbstractC3812i f26327b;

    public C8025xy(AbstractC8011xs abstractC8011xs) {
        this.f26326a = abstractC8011xs;
    }

    /* renamed from: a */
    public AbstractC3812i m13036a() {
        return this.f26327b;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3807d
    /* renamed from: a */
    public void mo13035a(AbstractC3794c abstractC3794c) {
        C4588d.m23620b("onAdLoaded must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLoaded.");
        try {
            this.f26326a.mo13043e();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3807d
    /* renamed from: a */
    public void mo13034a(AbstractC3794c abstractC3794c, int i) {
        C4588d.m23620b("onAdFailedToLoad must be called on the main UI thread.");
        C3784b.m26846a(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try {
            this.f26326a.mo13048a(i);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3809f
    /* renamed from: a */
    public void mo13033a(AbstractC3808e abstractC3808e) {
        C4588d.m23620b("onAdLoaded must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLoaded.");
        try {
            this.f26326a.mo13043e();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3809f
    /* renamed from: a */
    public void mo13032a(AbstractC3808e abstractC3808e, int i) {
        C4588d.m23620b("onAdFailedToLoad must be called on the main UI thread.");
        C3784b.m26846a(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try {
            this.f26326a.mo13048a(i);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3811h
    /* renamed from: a */
    public void mo13031a(AbstractC3810g abstractC3810g) {
        C4588d.m23620b("onAdOpened must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdOpened.");
        try {
            this.f26326a.mo13044d();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3811h
    /* renamed from: a */
    public void mo13030a(AbstractC3810g abstractC3810g, int i) {
        C4588d.m23620b("onAdFailedToLoad must be called on the main UI thread.");
        C3784b.m26846a(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try {
            this.f26326a.mo13048a(i);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdFailedToLoad.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3811h
    /* renamed from: a */
    public void mo13029a(AbstractC3810g abstractC3810g, AbstractC3812i abstractC3812i) {
        C4588d.m23620b("onAdLoaded must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLoaded.");
        this.f26327b = abstractC3812i;
        try {
            this.f26326a.mo13043e();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLoaded.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3807d
    /* renamed from: b */
    public void mo13028b(AbstractC3794c abstractC3794c) {
        C4588d.m23620b("onAdOpened must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdOpened.");
        try {
            this.f26326a.mo13044d();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3809f
    /* renamed from: b */
    public void mo13027b(AbstractC3808e abstractC3808e) {
        C4588d.m23620b("onAdOpened must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdOpened.");
        try {
            this.f26326a.mo13044d();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdOpened.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3811h
    /* renamed from: b */
    public void mo13026b(AbstractC3810g abstractC3810g) {
        C4588d.m23620b("onAdClosed must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdClosed.");
        try {
            this.f26326a.mo13046b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3807d
    /* renamed from: c */
    public void mo13025c(AbstractC3794c abstractC3794c) {
        C4588d.m23620b("onAdClosed must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdClosed.");
        try {
            this.f26326a.mo13046b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3809f
    /* renamed from: c */
    public void mo13024c(AbstractC3808e abstractC3808e) {
        C4588d.m23620b("onAdClosed must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdClosed.");
        try {
            this.f26326a.mo13046b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClosed.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3811h
    /* renamed from: c */
    public void mo13023c(AbstractC3810g abstractC3810g) {
        C4588d.m23620b("onAdLeftApplication must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLeftApplication.");
        try {
            this.f26326a.mo13045c();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3807d
    /* renamed from: d */
    public void mo13022d(AbstractC3794c abstractC3794c) {
        C4588d.m23620b("onAdLeftApplication must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLeftApplication.");
        try {
            this.f26326a.mo13045c();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3809f
    /* renamed from: d */
    public void mo13021d(AbstractC3808e abstractC3808e) {
        C4588d.m23620b("onAdLeftApplication must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdLeftApplication.");
        try {
            this.f26326a.mo13045c();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdLeftApplication.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3811h
    /* renamed from: d */
    public void mo13020d(AbstractC3810g abstractC3810g) {
        C4588d.m23620b("onAdClicked must be called on the main UI thread.");
        AbstractC3812i m13036a = m13036a();
        if (m13036a == null) {
            C3784b.m26840d("Could not call onAdClicked since NativeAdMapper is null.");
        } else if (!m13036a.m26789b()) {
            C3784b.m26846a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
        } else {
            C3784b.m26846a("Adapter called onAdClicked.");
            try {
                this.f26326a.mo13049a();
            } catch (RemoteException e) {
                C3784b.m26839d("Could not call onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3807d
    /* renamed from: e */
    public void mo13019e(AbstractC3794c abstractC3794c) {
        C4588d.m23620b("onAdClicked must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdClicked.");
        try {
            this.f26326a.mo13049a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClicked.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3809f
    /* renamed from: e */
    public void mo13018e(AbstractC3808e abstractC3808e) {
        C4588d.m23620b("onAdClicked must be called on the main UI thread.");
        C3784b.m26846a("Adapter called onAdClicked.");
        try {
            this.f26326a.mo13049a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not call onAdClicked.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3811h
    /* renamed from: e */
    public void mo13017e(AbstractC3810g abstractC3810g) {
        C4588d.m23620b("onAdImpression must be called on the main UI thread.");
        AbstractC3812i m13036a = m13036a();
        if (m13036a == null) {
            C3784b.m26840d("Could not call onAdImpression since NativeAdMapper is null. ");
        } else if (!m13036a.m26793a()) {
            C3784b.m26846a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
        } else {
            C3784b.m26846a("Adapter called onAdImpression.");
            try {
                this.f26326a.mo13042f();
            } catch (RemoteException e) {
                C3784b.m26839d("Could not call onAdImpression.", e);
            }
        }
    }
}
