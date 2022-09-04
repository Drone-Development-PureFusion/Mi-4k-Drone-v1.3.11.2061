package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AbstractC3526ai;
import com.google.android.gms.ads.internal.client.AbstractC3532ak;
import com.google.android.gms.ads.internal.client.AbstractC3541an;
import com.google.android.gms.ads.internal.client.AbstractC3547ap;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.View$OnClickListenerC3616l;
import com.google.android.gms.ads.internal.overlay.BinderC3649d;
import com.google.android.gms.ads.internal.purchase.ServiceConnectionC3688e;
import com.google.android.gms.ads.internal.reward.client.AbstractC3749b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.AbstractC7817uw;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.AbstractC8066yq;
import com.google.android.gms.internal.AbstractC8085yz;
import com.google.android.gms.internal.BinderC7942ws;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aat;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@Keep
@aaa
@DynamiteApi
/* loaded from: classes.dex */
public class ClientApi extends AbstractC3541an.AbstractBinderC3542a {
    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC3526ai createAdLoaderBuilder(AbstractC4170e abstractC4170e, String str, AbstractC8005xq abstractC8005xq, int i) {
        return new BinderC3627k((Context) BinderC4173f.m25294a(abstractC4170e), str, abstractC8005xq, new VersionInfoParcel(C4612q.f17087a, i, true), C3588d.m27405a());
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC8066yq createAdOverlay(AbstractC4170e abstractC4170e) {
        return new BinderC3649d((Activity) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC3532ak createBannerAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i) {
        return new ViewTreeObserver$OnGlobalLayoutListenerC3590f((Context) BinderC4173f.m25294a(abstractC4170e), adSizeParcel, str, abstractC8005xq, new VersionInfoParcel(C4612q.f17087a, i, true), C3588d.m27405a());
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC8085yz createInAppPurchaseManager(AbstractC4170e abstractC4170e) {
        return new ServiceConnectionC3688e((Activity) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC3532ak createInterstitialAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i) {
        Context context = (Context) BinderC4173f.m25294a(abstractC4170e);
        C7788uf.m13470a(context);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(C4612q.f17087a, i, true);
        boolean equals = "reward_mb".equals(adSizeParcel.f13864b);
        return (!equals && C7788uf.f25790av.m13486c().booleanValue()) || (equals && C7788uf.f25791aw.m13486c().booleanValue()) ? new BinderC7942ws(context, str, abstractC8005xq, versionInfoParcel, C3588d.m27405a()) : new BinderC3628l(context, adSizeParcel, str, abstractC8005xq, versionInfoParcel, C3588d.m27405a());
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC7817uw createNativeAdViewDelegate(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
        return new View$OnClickListenerC3616l((FrameLayout) BinderC4173f.m25294a(abstractC4170e), (FrameLayout) BinderC4173f.m25294a(abstractC4170e2));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC3749b createRewardedVideoAd(AbstractC4170e abstractC4170e, AbstractC8005xq abstractC8005xq, int i) {
        return new aat((Context) BinderC4173f.m25294a(abstractC4170e), C3588d.m27405a(), abstractC8005xq, new VersionInfoParcel(C4612q.f17087a, i, true));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC3532ak createSearchAdManager(AbstractC4170e abstractC4170e, AdSizeParcel adSizeParcel, String str, int i) {
        return new BinderC3773t((Context) BinderC4173f.m25294a(abstractC4170e), adSizeParcel, str, new VersionInfoParcel(C4612q.f17087a, i, true));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    @Nullable
    public AbstractC3547ap getMobileAdsSettingsManager(AbstractC4170e abstractC4170e) {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3541an
    public AbstractC3547ap getMobileAdsSettingsManagerWithClientJarVersion(AbstractC4170e abstractC4170e, int i) {
        return BinderC3638o.m27269a((Context) BinderC4173f.m25294a(abstractC4170e), new VersionInfoParcel(C4612q.f17087a, i, true));
    }
}
