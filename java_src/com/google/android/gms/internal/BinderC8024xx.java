package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C3789j;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a;
import com.google.android.gms.ads.internal.reward.mediation.client.C3766b;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.ads.mediation.AbstractC3794c;
import com.google.android.gms.ads.mediation.AbstractC3808e;
import com.google.android.gms.ads.mediation.AbstractC3810g;
import com.google.android.gms.ads.mediation.AbstractC3812i;
import com.google.android.gms.ads.mediation.AbstractC3813j;
import com.google.android.gms.ads.mediation.AbstractC3814k;
import com.google.android.gms.ads.mediation.AbstractC3817n;
import com.google.android.gms.ads.p226b.p227a.AbstractC3439a;
import com.google.android.gms.internal.AbstractC8008xr;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.xx */
/* loaded from: classes.dex */
public final class BinderC8024xx extends AbstractC8008xr.AbstractBinderC8009a {

    /* renamed from: a */
    private final AbstractC3792b f26324a;

    /* renamed from: b */
    private C8025xy f26325b;

    public BinderC8024xx(AbstractC3792b abstractC3792b) {
        this.f26324a = abstractC3792b;
    }

    /* renamed from: a */
    private Bundle m13037a(String str, int i, String str2) {
        String valueOf = String.valueOf(str);
        C3784b.m26840d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f26324a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            C3784b.m26839d("Could not get Server Parameters Bundle.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public AbstractC4170e mo12977a() {
        if (!(this.f26324a instanceof AbstractC3794c)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return BinderC4173f.m25293a(((AbstractC3794c) this.f26324a).getBannerView());
        } catch (Throwable th) {
            C3784b.m26839d("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12976a(AdRequestParcel adRequestParcel, String str) {
        mo12975a(adRequestParcel, str, (String) null);
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12975a(AdRequestParcel adRequestParcel, String str, String str2) {
        if (!(this.f26324a instanceof AbstractC3439a)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Requesting rewarded video ad from adapter.");
        try {
            AbstractC3439a abstractC3439a = (AbstractC3439a) this.f26324a;
            abstractC3439a.loadAd(new C8023xw(adRequestParcel.f13846b == -1 ? null : new Date(adRequestParcel.f13846b), adRequestParcel.f13848d, adRequestParcel.f13849e != null ? new HashSet(adRequestParcel.f13849e) : null, adRequestParcel.f13855k, adRequestParcel.f13850f, adRequestParcel.f13851g, adRequestParcel.f13862r), m13037a(str, adRequestParcel.f13851g, str2), adRequestParcel.f13857m != null ? adRequestParcel.f13857m.getBundle(abstractC3439a.getClass().getName()) : null);
        } catch (Throwable th) {
            C3784b.m26839d("Could not load rewarded video ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12974a(AbstractC4170e abstractC4170e) {
        try {
            ((AbstractC3817n) this.f26324a).m26753a((Context) BinderC4173f.m25294a(abstractC4170e));
        } catch (Throwable th) {
            C3784b.m26845a("Could not inform adapter of changed context", th);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12973a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC3763a abstractC3763a, String str2) {
        if (!(this.f26324a instanceof AbstractC3439a)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Initialize rewarded video adapter.");
        try {
            AbstractC3439a abstractC3439a = (AbstractC3439a) this.f26324a;
            abstractC3439a.initialize((Context) BinderC4173f.m25294a(abstractC4170e), new C8023xw(adRequestParcel.f13846b == -1 ? null : new Date(adRequestParcel.f13846b), adRequestParcel.f13848d, adRequestParcel.f13849e != null ? new HashSet(adRequestParcel.f13849e) : null, adRequestParcel.f13855k, adRequestParcel.f13850f, adRequestParcel.f13851g, adRequestParcel.f13862r), str, new C3766b(abstractC3763a), m13037a(str2, adRequestParcel.f13851g, (String) null), adRequestParcel.f13857m != null ? adRequestParcel.f13857m.getBundle(abstractC3439a.getClass().getName()) : null);
        } catch (Throwable th) {
            C3784b.m26839d("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12972a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs) {
        mo12971a(abstractC4170e, adRequestParcel, str, (String) null, abstractC8011xs);
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12971a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs) {
        if (!(this.f26324a instanceof AbstractC3808e)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Requesting interstitial ad from adapter.");
        try {
            AbstractC3808e abstractC3808e = (AbstractC3808e) this.f26324a;
            abstractC3808e.requestInterstitialAd((Context) BinderC4173f.m25294a(abstractC4170e), new C8025xy(abstractC8011xs), m13037a(str, adRequestParcel.f13851g, str2), new C8023xw(adRequestParcel.f13846b == -1 ? null : new Date(adRequestParcel.f13846b), adRequestParcel.f13848d, adRequestParcel.f13849e != null ? new HashSet(adRequestParcel.f13849e) : null, adRequestParcel.f13855k, adRequestParcel.f13850f, adRequestParcel.f13851g, adRequestParcel.f13862r), adRequestParcel.f13857m != null ? adRequestParcel.f13857m.getBundle(abstractC3808e.getClass().getName()) : null);
        } catch (Throwable th) {
            C3784b.m26839d("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12970a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        if (!(this.f26324a instanceof AbstractC3810g)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationNativeAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            AbstractC3810g abstractC3810g = (AbstractC3810g) this.f26324a;
            C8030yc c8030yc = new C8030yc(adRequestParcel.f13846b == -1 ? null : new Date(adRequestParcel.f13846b), adRequestParcel.f13848d, adRequestParcel.f13849e != null ? new HashSet(adRequestParcel.f13849e) : null, adRequestParcel.f13855k, adRequestParcel.f13850f, adRequestParcel.f13851g, nativeAdOptionsParcel, list, adRequestParcel.f13862r);
            Bundle bundle = adRequestParcel.f13857m != null ? adRequestParcel.f13857m.getBundle(abstractC3810g.getClass().getName()) : null;
            this.f26325b = new C8025xy(abstractC8011xs);
            abstractC3810g.requestNativeAd((Context) BinderC4173f.m25294a(abstractC4170e), this.f26325b, m13037a(str, adRequestParcel.f13851g, str2), c8030yc, bundle);
        } catch (Throwable th) {
            C3784b.m26839d("Could not request native ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12969a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs) {
        mo12968a(abstractC4170e, adSizeParcel, adRequestParcel, str, null, abstractC8011xs);
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12968a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs) {
        if (!(this.f26324a instanceof AbstractC3794c)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Requesting banner ad from adapter.");
        try {
            AbstractC3794c abstractC3794c = (AbstractC3794c) this.f26324a;
            abstractC3794c.requestBannerAd((Context) BinderC4173f.m25294a(abstractC4170e), new C8025xy(abstractC8011xs), m13037a(str, adRequestParcel.f13851g, str2), C3789j.m26819a(adSizeParcel.f13868f, adSizeParcel.f13865c, adSizeParcel.f13864b), new C8023xw(adRequestParcel.f13846b == -1 ? null : new Date(adRequestParcel.f13846b), adRequestParcel.f13848d, adRequestParcel.f13849e != null ? new HashSet(adRequestParcel.f13849e) : null, adRequestParcel.f13855k, adRequestParcel.f13850f, adRequestParcel.f13851g, adRequestParcel.f13862r), adRequestParcel.f13857m != null ? adRequestParcel.f13857m.getBundle(abstractC3794c.getClass().getName()) : null);
        } catch (Throwable th) {
            C3784b.m26839d("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: b */
    public void mo12966b() {
        if (!(this.f26324a instanceof AbstractC3808e)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Showing interstitial from adapter.");
        try {
            ((AbstractC3808e) this.f26324a).showInterstitial();
        } catch (Throwable th) {
            C3784b.m26839d("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: c */
    public void mo12965c() {
        try {
            this.f26324a.onDestroy();
        } catch (Throwable th) {
            C3784b.m26839d("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: d */
    public void mo12964d() {
        try {
            this.f26324a.onPause();
        } catch (Throwable th) {
            C3784b.m26839d("Could not pause adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: e */
    public void mo12963e() {
        try {
            this.f26324a.onResume();
        } catch (Throwable th) {
            C3784b.m26839d("Could not resume adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: f */
    public void mo12962f() {
        if (!(this.f26324a instanceof AbstractC3439a)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Show rewarded video ad from adapter.");
        try {
            ((AbstractC3439a) this.f26324a).showVideo();
        } catch (Throwable th) {
            C3784b.m26839d("Could not show rewarded video ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: g */
    public boolean mo12961g() {
        if (!(this.f26324a instanceof AbstractC3439a)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Check if adapter is initialized.");
        try {
            return ((AbstractC3439a) this.f26324a).isInitialized();
        } catch (Throwable th) {
            C3784b.m26839d("Could not check if adapter is initialized.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: h */
    public AbstractC8017xu mo12960h() {
        AbstractC3812i m13036a = this.f26325b.m13036a();
        if (m13036a instanceof AbstractC3813j) {
            return new BinderC8026xz((AbstractC3813j) m13036a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: i */
    public AbstractC8020xv mo12959i() {
        AbstractC3812i m13036a = this.f26325b.m13036a();
        if (m13036a instanceof AbstractC3814k) {
            return new BinderC8029yb((AbstractC3814k) m13036a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: j */
    public Bundle mo12958j() {
        if (!(this.f26324a instanceof adm)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a v2 MediationBannerAdapter: "));
            return new Bundle();
        }
        return ((adm) this.f26324a).m18033a();
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: k */
    public Bundle mo12957k() {
        if (!(this.f26324a instanceof adn)) {
            String valueOf = String.valueOf(this.f26324a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a v2 MediationInterstitialAdapter: "));
            return new Bundle();
        }
        return ((adn) this.f26324a).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: l */
    public Bundle mo12956l() {
        return new Bundle();
    }
}
