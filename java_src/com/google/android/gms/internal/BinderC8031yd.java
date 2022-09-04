package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractC3414d;
import com.google.ads.mediation.AbstractC3415e;
import com.google.ads.mediation.AbstractC3417g;
import com.google.ads.mediation.AbstractC3419i;
import com.google.ads.mediation.AbstractC3422j;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC8008xr;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.yd */
/* loaded from: classes.dex */
public final class BinderC8031yd<NETWORK_EXTRAS extends AbstractC3422j, SERVER_PARAMETERS extends AbstractC3419i> extends AbstractC8008xr.AbstractBinderC8009a {

    /* renamed from: a */
    private final AbstractC3414d<NETWORK_EXTRAS, SERVER_PARAMETERS> f26339a;

    /* renamed from: b */
    private final NETWORK_EXTRAS f26340b;

    public BinderC8031yd(AbstractC3414d<NETWORK_EXTRAS, SERVER_PARAMETERS> abstractC3414d, NETWORK_EXTRAS network_extras) {
        this.f26339a = abstractC3414d;
        this.f26340b = network_extras;
    }

    /* renamed from: a */
    private SERVER_PARAMETERS m12967a(String str, int i, String str2) {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> mo27896c = this.f26339a.mo27896c();
            if (mo27896c == null) {
                return null;
            }
            SERVER_PARAMETERS newInstance = mo27896c.newInstance();
            newInstance.m27890a(hashMap);
            return newInstance;
        } catch (Throwable th) {
            C3784b.m26839d("Could not get MediationServerParameters.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public AbstractC4170e mo12977a() {
        if (!(this.f26339a instanceof AbstractC3415e)) {
            String valueOf = String.valueOf(this.f26339a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return BinderC4173f.m25293a(((AbstractC3415e) this.f26339a).mo27894d());
        } catch (Throwable th) {
            C3784b.m26839d("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12976a(AdRequestParcel adRequestParcel, String str) {
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12975a(AdRequestParcel adRequestParcel, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12974a(AbstractC4170e abstractC4170e) {
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12973a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC3763a abstractC3763a, String str2) {
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12972a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs) {
        mo12971a(abstractC4170e, adRequestParcel, str, (String) null, abstractC8011xs);
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12971a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs) {
        if (!(this.f26339a instanceof AbstractC3417g)) {
            String valueOf = String.valueOf(this.f26339a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Requesting interstitial ad from adapter.");
        try {
            ((AbstractC3417g) this.f26339a).mo27893a(new C8032ye(abstractC8011xs), (Activity) BinderC4173f.m25294a(abstractC4170e), m12967a(str, adRequestParcel.f13851g, str2), C8044yf.m12941a(adRequestParcel), this.f26340b);
        } catch (Throwable th) {
            C3784b.m26839d("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12970a(AbstractC4170e abstractC4170e, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12969a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, AbstractC8011xs abstractC8011xs) {
        mo12968a(abstractC4170e, adSizeParcel, adRequestParcel, str, null, abstractC8011xs);
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: a */
    public void mo12968a(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, AbstractC8011xs abstractC8011xs) {
        if (!(this.f26339a instanceof AbstractC3415e)) {
            String valueOf = String.valueOf(this.f26339a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Requesting banner ad from adapter.");
        try {
            ((AbstractC3415e) this.f26339a).mo27895a(new C8032ye(abstractC8011xs), (Activity) BinderC4173f.m25294a(abstractC4170e), m12967a(str, adRequestParcel.f13851g, str2), C8044yf.m12940a(adSizeParcel), C8044yf.m12941a(adRequestParcel), this.f26340b);
        } catch (Throwable th) {
            C3784b.m26839d("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: b */
    public void mo12966b() {
        if (!(this.f26339a instanceof AbstractC3417g)) {
            String valueOf = String.valueOf(this.f26339a.getClass().getCanonicalName());
            C3784b.m26840d(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C3784b.m26846a("Showing interstitial from adapter.");
        try {
            ((AbstractC3417g) this.f26339a).mo27892e();
        } catch (Throwable th) {
            C3784b.m26839d("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: c */
    public void mo12965c() {
        try {
            this.f26339a.mo27898a();
        } catch (Throwable th) {
            C3784b.m26839d("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: d */
    public void mo12964d() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: e */
    public void mo12963e() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: f */
    public void mo12962f() {
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: g */
    public boolean mo12961g() {
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: h */
    public AbstractC8017xu mo12960h() {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: i */
    public AbstractC8020xv mo12959i() {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: j */
    public Bundle mo12958j() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: k */
    public Bundle mo12957k() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.AbstractC8008xr
    /* renamed from: l */
    public Bundle mo12956l() {
        return new Bundle();
    }
}
