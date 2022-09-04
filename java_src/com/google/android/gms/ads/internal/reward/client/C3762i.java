package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C3443c;
import com.google.android.gms.ads.internal.client.C3586y;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.p226b.AbstractC3441b;
import com.google.android.gms.ads.p226b.AbstractC3442c;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.reward.client.i */
/* loaded from: classes.dex */
public class C3762i implements AbstractC3441b {

    /* renamed from: a */
    private final AbstractC3749b f14669a;

    /* renamed from: b */
    private final Context f14670b;

    /* renamed from: c */
    private final Object f14671c = new Object();

    /* renamed from: d */
    private AbstractC3442c f14672d;

    public C3762i(Context context, AbstractC3749b abstractC3749b) {
        this.f14669a = abstractC3749b;
        this.f14670b = context;
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: a */
    public void mo26963a() {
        synchronized (this.f14671c) {
            if (this.f14669a == null) {
                return;
            }
            try {
                this.f14669a.mo18592a();
            } catch (RemoteException e) {
                C3784b.m26839d("Could not forward show to RewardedVideoAd", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: a */
    public void mo26962a(Context context) {
        synchronized (this.f14671c) {
            if (this.f14669a == null) {
                return;
            }
            try {
                this.f14669a.mo18589a(BinderC4173f.m25293a(context));
            } catch (RemoteException e) {
                C3784b.m26839d("Could not forward pause to RewardedVideoAd", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: a */
    public void mo26961a(AbstractC3442c abstractC3442c) {
        synchronized (this.f14671c) {
            this.f14672d = abstractC3442c;
            if (this.f14669a != null) {
                try {
                    this.f14669a.mo18590a(new BinderC3760g(abstractC3442c));
                } catch (RemoteException e) {
                    C3784b.m26839d("Could not forward setRewardedVideoAdListener to RewardedVideoAd", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: a */
    public void mo26960a(String str) {
        C3784b.m26840d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: a */
    public void mo26959a(String str, C3443c c3443c) {
        synchronized (this.f14671c) {
            if (this.f14669a == null) {
                return;
            }
            try {
                this.f14669a.mo18591a(C3586y.m27414a().m27412a(this.f14670b, c3443c.m27832f(), str));
            } catch (RemoteException e) {
                C3784b.m26839d("Could not forward loadAd to RewardedVideoAd", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: b */
    public void mo26957b(Context context) {
        synchronized (this.f14671c) {
            if (this.f14669a == null) {
                return;
            }
            try {
                this.f14669a.mo18586b(BinderC4173f.m25293a(context));
            } catch (RemoteException e) {
                C3784b.m26839d("Could not forward resume to RewardedVideoAd", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: b */
    public boolean mo26958b() {
        boolean z = false;
        synchronized (this.f14671c) {
            if (this.f14669a != null) {
                try {
                    z = this.f14669a.mo18587b();
                } catch (RemoteException e) {
                    C3784b.m26839d("Could not forward isLoaded to RewardedVideoAd", e);
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: c */
    public void mo26956c() {
        mo26962a((Context) null);
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: c */
    public void mo26955c(Context context) {
        synchronized (this.f14671c) {
            if (this.f14669a == null) {
                return;
            }
            try {
                this.f14669a.mo18584c(BinderC4173f.m25293a(context));
            } catch (RemoteException e) {
                C3784b.m26839d("Could not forward destroy to RewardedVideoAd", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: d */
    public void mo26954d() {
        mo26957b(null);
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: e */
    public void mo26953e() {
        mo26955c(null);
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: f */
    public AbstractC3442c mo26952f() {
        AbstractC3442c abstractC3442c;
        synchronized (this.f14671c) {
            abstractC3442c = this.f14672d;
        }
        return abstractC3442c;
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3441b
    /* renamed from: g */
    public String mo26951g() {
        C3784b.m26840d("RewardedVideoAd.getUserId() is deprecated. Please do not call this method.");
        return null;
    }
}
