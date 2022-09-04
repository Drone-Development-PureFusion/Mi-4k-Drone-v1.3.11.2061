package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AbstractC3541an;
import com.google.android.gms.ads.internal.reward.client.AbstractC3749b;
import com.google.android.gms.ads.internal.reward.client.C3759f;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.internal.AbstractC7817uw;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.AbstractC8066yq;
import com.google.android.gms.internal.AbstractC8085yz;
import com.google.android.gms.internal.C7851vj;
import com.google.android.gms.internal.C8065yp;
import com.google.android.gms.internal.C8100zf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.p251a.C9654a;
import com.tencent.tauth.AuthActivity;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.ab */
/* loaded from: classes.dex */
public class C3503ab {

    /* renamed from: a */
    private AbstractC3541an f13892a;

    /* renamed from: b */
    private final Object f13893b = new Object();

    /* renamed from: c */
    private final C3583v f13894c;

    /* renamed from: d */
    private final C3582u f13895d;

    /* renamed from: e */
    private final C3566j f13896e;

    /* renamed from: f */
    private final C7851vj f13897f;

    /* renamed from: g */
    private final C3759f f13898g;

    /* renamed from: h */
    private final C8100zf f13899h;

    /* renamed from: i */
    private final C8065yp f13900i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.internal.client.ab$a */
    /* loaded from: classes2.dex */
    public abstract class AbstractC3513a<T> {
        AbstractC3513a() {
        }

        @Nullable
        /* renamed from: b */
        protected abstract T mo27590b();

        @Nullable
        /* renamed from: b */
        protected abstract T mo27589b(AbstractC3541an abstractC3541an);

        @Nullable
        /* renamed from: c */
        protected final T m27588c() {
            AbstractC3541an m27618b = C3503ab.this.m27618b();
            if (m27618b == null) {
                C3784b.m26840d("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return mo27589b(m27618b);
            } catch (RemoteException e) {
                C3784b.m26839d("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        @Nullable
        /* renamed from: d */
        protected final T m27587d() {
            try {
                return mo27590b();
            } catch (RemoteException e) {
                C3784b.m26839d("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public C3503ab(C3583v c3583v, C3582u c3582u, C3566j c3566j, C7851vj c7851vj, C3759f c3759f, C8100zf c8100zf, C8065yp c8065yp) {
        this.f13894c = c3583v;
        this.f13895d = c3582u;
        this.f13896e = c3566j;
        this.f13897f = c7851vj;
        this.f13898g = c3759f;
        this.f13899h = c8100zf;
        this.f13900i = c8065yp;
    }

    @Nullable
    /* renamed from: a */
    private static AbstractC3541an m27631a() {
        AbstractC3541an asInterface;
        try {
            Object newInstance = C3503ab.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (!(newInstance instanceof IBinder)) {
                C3784b.m26840d("ClientApi class is not an instance of IBinder");
                asInterface = null;
            } else {
                asInterface = AbstractC3541an.AbstractBinderC3542a.asInterface((IBinder) newInstance);
            }
            return asInterface;
        } catch (Exception e) {
            C3784b.m26839d("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m27623a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AuthActivity.ACTION_KEY, "no_ads_fallback");
        bundle.putString("flow", str);
        C3514ac.m27586a().m26864a(context, (String) null, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    private static boolean m27629a(Activity activity, String str) {
        Intent intent = activity.getIntent();
        if (!intent.hasExtra(str)) {
            C3784b.m26844b("useClientJar flag not found in activity intent extras.");
            return false;
        }
        return intent.getBooleanExtra(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* renamed from: b */
    public AbstractC3541an m27618b() {
        AbstractC3541an abstractC3541an;
        synchronized (this.f13893b) {
            if (this.f13892a == null) {
                this.f13892a = m27631a();
            }
            abstractC3541an = this.f13892a;
        }
        return abstractC3541an;
    }

    /* renamed from: a */
    public AbstractC3526ai m27622a(final Context context, final String str, final AbstractC8005xq abstractC8005xq) {
        return (AbstractC3526ai) m27621a(context, false, (AbstractC3513a<Object>) new AbstractC3513a<AbstractC3526ai>() { // from class: com.google.android.gms.ads.internal.client.ab.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3526ai mo27590b() {
                AbstractC3526ai m27423a = C3503ab.this.f13895d.m27423a(context, str, abstractC8005xq);
                if (m27423a != null) {
                    return m27423a;
                }
                C3503ab.this.m27623a(context, "native_ad");
                return new BinderC3567k();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3526ai mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createAdLoaderBuilder(BinderC4173f.m25293a(context), str, abstractC8005xq, C4612q.f17087a);
            }
        });
    }

    /* renamed from: a */
    public AbstractC3532ak m27626a(final Context context, final AdSizeParcel adSizeParcel, final String str) {
        return (AbstractC3532ak) m27621a(context, false, (AbstractC3513a<Object>) new AbstractC3513a<AbstractC3532ak>() { // from class: com.google.android.gms.ads.internal.client.ab.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3532ak mo27590b() {
                AbstractC3532ak m27421a = C3503ab.this.f13894c.m27421a(context, adSizeParcel, str, null, 3);
                if (m27421a != null) {
                    return m27421a;
                }
                C3503ab.this.m27623a(context, C9654a.C9655a.f30199o);
                return new BinderC3571l();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3532ak mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createSearchAdManager(BinderC4173f.m25293a(context), adSizeParcel, str, C4612q.f17087a);
            }
        });
    }

    /* renamed from: a */
    public AbstractC3532ak m27625a(final Context context, final AdSizeParcel adSizeParcel, final String str, final AbstractC8005xq abstractC8005xq) {
        return (AbstractC3532ak) m27621a(context, false, (AbstractC3513a<Object>) new AbstractC3513a<AbstractC3532ak>() { // from class: com.google.android.gms.ads.internal.client.ab.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3532ak mo27590b() {
                AbstractC3532ak m27421a = C3503ab.this.f13894c.m27421a(context, adSizeParcel, str, abstractC8005xq, 1);
                if (m27421a != null) {
                    return m27421a;
                }
                C3503ab.this.m27623a(context, "banner");
                return new BinderC3571l();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3532ak mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createBannerAdManager(BinderC4173f.m25293a(context), adSizeParcel, str, abstractC8005xq, C4612q.f17087a);
            }
        });
    }

    /* renamed from: a */
    public AbstractC3547ap m27628a(final Context context) {
        return (AbstractC3547ap) m27621a(context, false, (AbstractC3513a<Object>) new AbstractC3513a<AbstractC3547ap>() { // from class: com.google.android.gms.ads.internal.client.ab.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3547ap mo27590b() {
                AbstractC3547ap m27438a = C3503ab.this.f13896e.m27438a(context);
                if (m27438a != null) {
                    return m27438a;
                }
                C3503ab.this.m27623a(context, "mobile_ads_settings");
                return new BinderC3573m();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3547ap mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.getMobileAdsSettingsManagerWithClientJarVersion(BinderC4173f.m25293a(context), C4612q.f17087a);
            }
        });
    }

    /* renamed from: a */
    public AbstractC3749b m27624a(final Context context, final AbstractC8005xq abstractC8005xq) {
        return (AbstractC3749b) m27621a(context, false, (AbstractC3513a<Object>) new AbstractC3513a<AbstractC3749b>() { // from class: com.google.android.gms.ads.internal.client.ab.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3749b mo27590b() {
                AbstractC3749b m26968a = C3503ab.this.f13898g.m26968a(context, abstractC8005xq);
                if (m26968a != null) {
                    return m26968a;
                }
                C3503ab.this.m27623a(context, "rewarded_video");
                return new BinderC3575o();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3749b mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createRewardedVideoAd(BinderC4173f.m25293a(context), abstractC8005xq, C4612q.f17087a);
            }
        });
    }

    /* renamed from: a */
    public AbstractC7817uw m27627a(final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2) {
        return (AbstractC7817uw) m27621a(context, false, (AbstractC3513a<Object>) new AbstractC3513a<AbstractC7817uw>() { // from class: com.google.android.gms.ads.internal.client.ab.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC7817uw mo27590b() {
                AbstractC7817uw m13327a = C3503ab.this.f13897f.m13327a(context, frameLayout, frameLayout2);
                if (m13327a != null) {
                    return m13327a;
                }
                C3503ab.this.m27623a(context, "native_ad_view_delegate");
                return new BinderC3574n();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC7817uw mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createNativeAdViewDelegate(BinderC4173f.m25293a(frameLayout), BinderC4173f.m25293a(frameLayout2));
            }
        });
    }

    @Nullable
    /* renamed from: a */
    public AbstractC8085yz m27630a(final Activity activity) {
        return (AbstractC8085yz) m27621a(activity, m27629a(activity, "com.google.android.gms.ads.internal.purchase.useClientJar"), new AbstractC3513a<AbstractC8085yz>() { // from class: com.google.android.gms.ads.internal.client.ab.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC8085yz mo27590b() {
                AbstractC8085yz m12835a = C3503ab.this.f13899h.m12835a(activity);
                if (m12835a != null) {
                    return m12835a;
                }
                C3503ab.this.m27623a((Context) activity, "iap");
                return null;
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC8085yz mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createInAppPurchaseManager(BinderC4173f.m25293a(activity));
            }
        });
    }

    @VisibleForTesting
    /* renamed from: a */
    <T> T m27621a(Context context, boolean z, AbstractC3513a<T> abstractC3513a) {
        if (!z && !C3514ac.m27586a().m26853b(context)) {
            C3784b.m26846a("Google Play Services is not available");
            z = true;
        }
        if (z) {
            T m27588c = abstractC3513a.m27588c();
            return m27588c == null ? abstractC3513a.m27587d() : m27588c;
        }
        T m27587d = abstractC3513a.m27587d();
        return m27587d == null ? abstractC3513a.m27588c() : m27587d;
    }

    /* renamed from: b */
    public AbstractC3532ak m27616b(final Context context, final AdSizeParcel adSizeParcel, final String str, final AbstractC8005xq abstractC8005xq) {
        return (AbstractC3532ak) m27621a(context, false, (AbstractC3513a<Object>) new AbstractC3513a<AbstractC3532ak>() { // from class: com.google.android.gms.ads.internal.client.ab.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3532ak mo27590b() {
                AbstractC3532ak m27421a = C3503ab.this.f13894c.m27421a(context, adSizeParcel, str, abstractC8005xq, 2);
                if (m27421a != null) {
                    return m27421a;
                }
                C3503ab.this.m27623a(context, "interstitial");
                return new BinderC3571l();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC3532ak mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createInterstitialAdManager(BinderC4173f.m25293a(context), adSizeParcel, str, abstractC8005xq, C4612q.f17087a);
            }
        });
    }

    @Nullable
    /* renamed from: b */
    public AbstractC8066yq m27617b(final Activity activity) {
        return (AbstractC8066yq) m27621a(activity, m27629a(activity, "com.google.android.gms.ads.internal.overlay.useClientJar"), new AbstractC3513a<AbstractC8066yq>() { // from class: com.google.android.gms.ads.internal.client.ab.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC8066yq mo27590b() {
                AbstractC8066yq m12877a = C3503ab.this.f13900i.m12877a(activity);
                if (m12877a != null) {
                    return m12877a;
                }
                C3503ab.this.m27623a((Context) activity, "ad_overlay");
                return null;
            }

            @Override // com.google.android.gms.ads.internal.client.C3503ab.AbstractC3513a
            /* renamed from: a */
            public AbstractC8066yq mo27589b(AbstractC3541an abstractC3541an) {
                return abstractC3541an.createAdOverlay(BinderC4173f.m25293a(activity));
            }
        });
    }
}
