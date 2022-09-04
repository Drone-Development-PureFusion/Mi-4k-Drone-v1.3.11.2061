package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.Window;
import com.google.ads.mediation.AbstractC3396a;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.AbstractC3771c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7887vx;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.C7896wd;
import com.google.android.gms.internal.C7989xg;
import com.google.android.gms.internal.C7990xh;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aaf;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.tencent.tauth.AuthActivity;
import java.util.Collections;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.l */
/* loaded from: classes.dex */
public class BinderC3628l extends AbstractBinderC3482c implements AbstractC7887vx, C7896wd.AbstractC7897a {

    /* renamed from: n */
    private boolean f14219n;

    /* renamed from: o */
    private float f14220o;

    /* renamed from: m */
    private int f14218m = -1;

    /* renamed from: l */
    protected transient boolean f14217l = false;

    @aaa
    /* renamed from: com.google.android.gms.ads.internal.l$a */
    /* loaded from: classes.dex */
    private class C3629a extends abq {

        /* renamed from: b */
        private final int f14222b;

        public C3629a(int i) {
            this.f14222b = i;
        }

        @Override // com.google.android.gms.internal.abq
        /* renamed from: a */
        public void mo12782a() {
            InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(BinderC3628l.this.f13800f.f14754G, BinderC3628l.this.m27306H(), BinderC3628l.this.f14219n, BinderC3628l.this.f14220o, BinderC3628l.this.f13800f.f14754G ? this.f14222b : -1);
            int mo18079q = BinderC3628l.this.f13800f.f14771j.f20895b.mo18079q();
            final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(BinderC3628l.this, BinderC3628l.this, BinderC3628l.this, BinderC3628l.this.f13800f.f14771j.f20895b, mo18079q == -1 ? BinderC3628l.this.f13800f.f14771j.f20900g : mo18079q, BinderC3628l.this.f13800f.f14766e, BinderC3628l.this.f13800f.f14771j.f20887C, interstitialAdParameterParcel);
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.l.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C3779u.m26892c().m27215a(BinderC3628l.this.f13800f.f14764c, adOverlayInfoParcel);
                }
            });
        }

        @Override // com.google.android.gms.internal.abq
        /* renamed from: b */
        public void mo12779b() {
        }
    }

    public BinderC3628l(Context context, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, C3588d c3588d) {
        super(context, adSizeParcel, str, abstractC8005xq, versionInfoParcel, c3588d);
    }

    /* renamed from: a */
    private void m27304a(Bundle bundle) {
        C3779u.m26890e().m18333b(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, "gmob-apps", bundle, false);
    }

    /* renamed from: b */
    static abi.C6129a m27299b(abi.C6129a c6129a) {
        try {
            String jSONObject = aaf.m18674a(c6129a.f20921b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC3396a.AD_UNIT_ID_PARAMETER, c6129a.f20920a.f14489e);
            C7989xg c7989xg = new C7989xg(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            AdResponseParcel adResponseParcel = c6129a.f20921b;
            C7990xh c7990xh = new C7990xh(Collections.singletonList(c7989xg), -1L, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), adResponseParcel.f14559J, adResponseParcel.f14560K, "", -1L, 0, 1, null, 0, -1, -1L, false);
            return new abi.C6129a(c6129a.f20920a, new AdResponseParcel(c6129a.f20920a, adResponseParcel.f14566b, adResponseParcel.f14567c, Collections.emptyList(), Collections.emptyList(), adResponseParcel.f14571g, true, adResponseParcel.f14573i, Collections.emptyList(), adResponseParcel.f14575k, adResponseParcel.f14576l, adResponseParcel.f14577m, adResponseParcel.f14578n, adResponseParcel.f14579o, adResponseParcel.f14580p, adResponseParcel.f14581q, null, adResponseParcel.f14583s, adResponseParcel.f14584t, adResponseParcel.f14585u, adResponseParcel.f14586v, adResponseParcel.f14587w, adResponseParcel.f14590z, adResponseParcel.f14550A, adResponseParcel.f14551B, null, Collections.emptyList(), Collections.emptyList(), adResponseParcel.f14555F, adResponseParcel.f14556G, adResponseParcel.f14557H, adResponseParcel.f14558I, adResponseParcel.f14559J, adResponseParcel.f14560K, adResponseParcel.f14561L, null, adResponseParcel.f14563N), c7990xh, c6129a.f20923d, c6129a.f20924e, c6129a.f20925f, c6129a.f20926g, null);
        } catch (JSONException e) {
            abr.b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return c6129a;
        }
    }

    /* renamed from: H */
    protected boolean m27306H() {
        Window window;
        if (!(this.f13800f.f14764c instanceof Activity) || (window = ((Activity) this.f13800f.f14764c).getWindow()) == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
    }

    /* renamed from: I */
    public void m27305I() {
        C3779u.m26869z().m18223b(Integer.valueOf(this.f14218m));
        if (this.f13800f.m26828e()) {
            this.f13800f.m26832b();
            this.f13800f.f14771j = null;
            this.f13800f.f14754G = false;
            this.f14217l = false;
        }
    }

    @Override // com.google.android.gms.internal.C7896wd.AbstractC7897a
    /* renamed from: J */
    public void mo13275J() {
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20918y != null) {
            C3779u.m26890e().m18368a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j.f20918y);
        }
        t();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3482c
    /* renamed from: a */
    protected acy mo27301a(abi.C6129a c6129a, @Nullable C3589e c3589e, @Nullable AbstractC3771c abstractC3771c) {
        acy m18142a = C3779u.m26889f().m18142a(this.f13800f.f14764c, this.f13800f.f14770i, false, false, this.f13800f.f14765d, this.f13800f.f14766e, this.f13795a, this, this.f13803i);
        m18142a.mo18084l().m18178a(this, null, this, this, C7788uf.f25771ac.m13486c().booleanValue(), this, this, c3589e, null, abstractC3771c);
        a(m18142a);
        m18142a.mo18101b(c6129a.f20920a.f14507w);
        C7896wd.m13278a(m18142a, this);
        return m18142a;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3482c, com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public void mo18575a(abi.C6129a c6129a, C7801un c7801un) {
        boolean z = true;
        if (!C7788uf.f25790av.m13486c().booleanValue()) {
            super.mo18575a(c6129a, c7801un);
        } else if (c6129a.f20924e != -2) {
            super.mo18575a(c6129a, c7801un);
        } else {
            Bundle bundle = c6129a.f20920a.f14487c.f13857m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            boolean z2 = bundle == null || !bundle.containsKey("gw");
            if (c6129a.f20921b.f14572h) {
                z = false;
            }
            if (z2 && z) {
                this.f13800f.f14772k = m27299b(c6129a);
            }
            super.mo18575a(this.f13800f.f14772k, c7801un);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7887vx
    /* renamed from: a */
    public void mo13295a(boolean z, float f) {
        this.f14219n = z;
        this.f14220o = f;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b
    /* renamed from: a */
    protected boolean mo18578a(AdRequestParcel adRequestParcel, abi abiVar, boolean z) {
        if (this.f13800f.m26828e() && abiVar.f20895b != null) {
            C3779u.m26888g().m18304a(abiVar.f20895b);
        }
        return this.f13799e.m27042d();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public boolean mo27303a(AdRequestParcel adRequestParcel, C7801un c7801un) {
        if (this.f13800f.f14771j != null) {
            abr.d("An interstitial is already loading. Aborting.");
            return false;
        }
        return super.a(adRequestParcel, c7801un);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3482c, com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public boolean mo18574a(@Nullable abi abiVar, abi abiVar2) {
        if (!super.mo18574a(abiVar, abiVar2)) {
            return false;
        }
        if (!this.f13800f.m26828e() && this.f13800f.f14751D != null && abiVar2.f20903j != null) {
            this.f13802h.m13600a(this.f13800f.f14770i, abiVar2, this.f13800f.f14751D);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.C7896wd.AbstractC7897a
    /* renamed from: b */
    public void mo13274b(RewardItemParcel rewardItemParcel) {
        if (this.f13800f.f14771j != null) {
            if (this.f13800f.f14771j.f20919z != null) {
                C3779u.m26890e().m18368a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j.f20919z);
            }
            if (this.f13800f.f14771j.f20917x != null) {
                rewardItemParcel = this.f13800f.f14771j.f20917x;
            }
        }
        a(rewardItemParcel);
    }

    @Override // com.google.android.gms.internal.AbstractC7887vx
    /* renamed from: b */
    public void mo13294b(boolean z) {
        this.f13800f.f14754G = z;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: f */
    public void mo13174f() {
        C4588d.m23620b("showInterstitial must be called on the main UI thread.");
        if (this.f13800f.f14771j == null) {
            abr.d("The interstitial has not loaded.");
            return;
        }
        if (C7788uf.f25754aL.m13486c().booleanValue()) {
            String packageName = this.f13800f.f14764c.getApplicationContext() != null ? this.f13800f.f14764c.getApplicationContext().getPackageName() : this.f13800f.f14764c.getPackageName();
            if (!this.f14217l) {
                abr.d("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString(AuthActivity.ACTION_KEY, "show_interstitial_before_load_finish");
                m27304a(bundle);
            }
            if (!C3779u.m26890e().m18315g(this.f13800f.f14764c)) {
                abr.d("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString(AuthActivity.ACTION_KEY, "show_interstitial_app_not_in_foreground");
                m27304a(bundle2);
            }
        }
        if (this.f13800f.m26827f()) {
            return;
        }
        if (this.f13800f.f14771j.f20907n && this.f13800f.f14771j.f20909p != null) {
            try {
                this.f13800f.f14771j.f20909p.mo12966b();
            } catch (RemoteException e) {
                abr.d("Could not show interstitial.", e);
                m27305I();
            }
        } else if (this.f13800f.f14771j.f20895b == null) {
            abr.d("The interstitial failed to load.");
        } else if (this.f13800f.f14771j.f20895b.mo18080p()) {
            abr.d("The interstitial is already showing.");
        } else {
            this.f13800f.f14771j.f20895b.mo18106a(true);
            if (this.f13800f.f14771j.f20903j != null) {
                this.f13802h.m13601a(this.f13800f.f14770i, this.f13800f.f14771j);
            }
            Bitmap m18313h = this.f13800f.f14754G ? C3779u.m26890e().m18313h(this.f13800f.f14764c) : null;
            this.f14218m = C3779u.m26869z().m18225a(m18313h);
            if (C7788uf.f25796bA.m13486c().booleanValue() && m18313h != null) {
                Future future = (Future) new C3629a(this.f14218m).mo12820e();
                return;
            }
            InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.f13800f.f14754G, m27306H(), false, 0.0f, -1);
            int mo18079q = this.f13800f.f14771j.f20895b.mo18079q();
            if (mo18079q == -1) {
                mo18079q = this.f13800f.f14771j.f20900g;
            }
            C3779u.m26892c().m27215a(this.f13800f.f14764c, new AdOverlayInfoParcel(this, this, this, this.f13800f.f14771j.f20895b, mo18079q, this.f13800f.f14766e, this.f13800f.f14771j.f20887C, interstitialAdParameterParcel));
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.overlay.AbstractC3659g
    /* renamed from: j_ */
    public void mo12931j_() {
        acz mo18084l;
        B();
        super.j_();
        if (this.f13800f.f14771j == null || this.f13800f.f14771j.f20895b == null || (mo18084l = this.f13800f.f14771j.f20895b.mo18084l()) == null) {
            return;
        }
        mo18084l.m18154h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: p */
    public void mo27298p() {
        m27305I();
        super.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: s */
    public void mo27297s() {
        super.s();
        this.f14217l = true;
    }
}
