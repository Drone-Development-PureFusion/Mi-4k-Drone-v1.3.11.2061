package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractC3396a;
import com.google.android.gms.ads.internal.AbstractBinderC3478b;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.abi;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public class aau extends AbstractBinderC3478b implements aay {

    /* renamed from: l */
    private static final BinderC8004xp f20812l = new BinderC8004xp();

    /* renamed from: m */
    private final Map<String, abc> f20813m = new HashMap();

    /* renamed from: n */
    private boolean f20814n;

    public aau(Context context, C3588d c3588d, AdSizeParcel adSizeParcel, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, null, abstractC8005xq, versionInfoParcel, c3588d);
    }

    /* renamed from: b */
    private abi.C6129a m18573b(abi.C6129a c6129a) {
        abr.m18409e("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = aaf.m18674a(c6129a.f20921b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC3396a.AD_UNIT_ID_PARAMETER, c6129a.f20920a.f14489e);
            return new abi.C6129a(c6129a.f20920a, c6129a.f20921b, new C7990xh(Arrays.asList(new C7989xg(jSONObject, null, Arrays.asList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList())), -1L, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false), c6129a.f20923d, c6129a.f20924e, c6129a.f20925f, c6129a.f20926g, c6129a.f20927h);
        } catch (JSONException e) {
            abr.b("Unable to generate ad state for non-mediated rewarded video.", e);
            return m18572c(c6129a);
        }
    }

    /* renamed from: c */
    private abi.C6129a m18572c(abi.C6129a c6129a) {
        return new abi.C6129a(c6129a.f20920a, c6129a.f20921b, null, c6129a.f20923d, 0, c6129a.f20925f, c6129a.f20926g, c6129a.f20927h);
    }

    /* renamed from: E */
    public void m18581E() {
        C4588d.m23620b("showAd must be called on the main UI thread.");
        if (!m18580F()) {
            abr.d("The reward video has not loaded.");
            return;
        }
        this.f20814n = true;
        abc m18571c = m18571c(this.f13800f.f14771j.f20910q);
        if (m18571c == null || m18571c.m18521a() == null) {
            return;
        }
        try {
            m18571c.m18521a().mo12962f();
        } catch (RemoteException e) {
            abr.d("Could not call showVideo.", e);
        }
    }

    /* renamed from: F */
    public boolean m18580F() {
        C4588d.m23620b("isLoaded must be called on the main UI thread.");
        return this.f13800f.f14768g == null && this.f13800f.f14769h == null && this.f13800f.f14771j != null && !this.f20814n;
    }

    @Override // com.google.android.gms.internal.aay
    /* renamed from: G */
    public void mo18550G() {
        a(this.f13800f.f14771j, false);
        r();
    }

    @Override // com.google.android.gms.internal.aay
    /* renamed from: H */
    public void mo18549H() {
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20908o != null) {
            C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j, this.f13800f.f14763b, false, this.f13800f.f14771j.f20908o.f26225j);
        }
        t();
    }

    @Override // com.google.android.gms.internal.aay
    /* renamed from: I */
    public void mo18548I() {
        p();
    }

    @Override // com.google.android.gms.internal.aay
    /* renamed from: J */
    public void mo18547J() {
        e();
    }

    @Override // com.google.android.gms.internal.aay
    /* renamed from: K */
    public void mo18546K() {
        q();
    }

    /* renamed from: a */
    public void m18579a(@NonNull Context context) {
        for (abc abcVar : this.f20813m.values()) {
            try {
                abcVar.m18521a().mo12974a(BinderC4173f.m25293a(context));
            } catch (RemoteException e) {
                abr.b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: a */
    public void m18577a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        C4588d.m23620b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedVideoAdRequestParcel.f14662c)) {
            abr.d("Invalid ad unit id. Aborting.");
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.aau.1
                @Override // java.lang.Runnable
                public void run() {
                    aau.this.a(1);
                }
            });
            return;
        }
        this.f20814n = false;
        this.f13800f.f14763b = rewardedVideoAdRequestParcel.f14662c;
        super.a(rewardedVideoAdRequestParcel.f14661b);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public void mo18575a(final abi.C6129a c6129a, C7801un c7801un) {
        if (c6129a.f20924e != -2) {
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.aau.2
                @Override // java.lang.Runnable
                public void run() {
                    aau.this.b(new abi(c6129a, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.f13800f.f14772k = c6129a;
        if (c6129a.f20922c == null) {
            this.f13800f.f14772k = m18573b(c6129a);
        }
        this.f13800f.f14752E = 0;
        this.f13800f.f14769h = C3779u.m26891d().m12800a(this.f13800f.f14764c, this.f13800f.f14772k, this);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b
    /* renamed from: a */
    protected boolean mo18578a(AdRequestParcel adRequestParcel, abi abiVar, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public boolean mo18574a(abi abiVar, abi abiVar2) {
        return true;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: b */
    public void mo13179b() {
        C4588d.m23620b("destroy must be called on the main UI thread.");
        for (String str : this.f20813m.keySet()) {
            try {
                abc abcVar = this.f20813m.get(str);
                if (abcVar != null && abcVar.m18521a() != null) {
                    abcVar.m18521a().mo12965c();
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(str);
                abr.d(valueOf.length() != 0 ? "Fail to destroy adapter: ".concat(valueOf) : new String("Fail to destroy adapter: "));
            }
        }
    }

    @Override // com.google.android.gms.internal.aay
    /* renamed from: b */
    public void mo18545b(@Nullable RewardItemParcel rewardItemParcel) {
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20908o != null) {
            C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j, this.f13800f.f14763b, false, this.f13800f.f14771j.f20908o.f26226k);
        }
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20911r != null && !TextUtils.isEmpty(this.f13800f.f14771j.f20911r.f26241j)) {
            rewardItemParcel = new RewardItemParcel(this.f13800f.f14771j.f20911r.f26241j, this.f13800f.f14771j.f20911r.f26242k);
        }
        a(rewardItemParcel);
    }

    @Nullable
    /* renamed from: c */
    public abc m18571c(String str) {
        Exception exc;
        abc abcVar;
        abc abcVar2 = this.f20813m.get(str);
        if (abcVar2 == null) {
            try {
                abcVar = new abc(("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? f20812l : this.f13807j).mo13053a(str), this);
            } catch (Exception e) {
                exc = e;
                abcVar = abcVar2;
            }
            try {
                this.f20813m.put(str, abcVar);
                return abcVar;
            } catch (Exception e2) {
                exc = e2;
                String valueOf = String.valueOf(str);
                abr.d(valueOf.length() != 0 ? "Fail to instantiate adapter ".concat(valueOf) : new String("Fail to instantiate adapter "), exc);
                return abcVar;
            }
        }
        return abcVar2;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: d */
    public void mo13175d() {
        C4588d.m23620b("pause must be called on the main UI thread.");
        for (String str : this.f20813m.keySet()) {
            try {
                abc abcVar = this.f20813m.get(str);
                if (abcVar != null && abcVar.m18521a() != null) {
                    abcVar.m18521a().mo12964d();
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(str);
                abr.d(valueOf.length() != 0 ? "Fail to pause adapter: ".concat(valueOf) : new String("Fail to pause adapter: "));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h_ */
    public void mo13172h_() {
        C4588d.m23620b("resume must be called on the main UI thread.");
        for (String str : this.f20813m.keySet()) {
            try {
                abc abcVar = this.f20813m.get(str);
                if (abcVar != null && abcVar.m18521a() != null) {
                    abcVar.m18521a().mo12963e();
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(str);
                abr.d(valueOf.length() != 0 ? "Fail to resume adapter: ".concat(valueOf) : new String("Fail to resume adapter: "));
            }
        }
    }
}
