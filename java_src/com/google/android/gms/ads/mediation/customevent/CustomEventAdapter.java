package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.mediation.AbstractC3790a;
import com.google.android.gms.ads.mediation.AbstractC3794c;
import com.google.android.gms.ads.mediation.AbstractC3807d;
import com.google.android.gms.ads.mediation.AbstractC3808e;
import com.google.android.gms.ads.mediation.AbstractC3809f;
import com.google.android.gms.ads.mediation.AbstractC3810g;
import com.google.android.gms.ads.mediation.AbstractC3811h;
import com.google.android.gms.ads.mediation.AbstractC3812i;
import com.google.android.gms.ads.mediation.AbstractC3815l;
import com.google.android.gms.ads.p226b.p227a.AbstractC3439a;
import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements AbstractC3794c, AbstractC3808e, AbstractC3810g {

    /* renamed from: a */
    AbstractC3799b f14795a;

    /* renamed from: b */
    AbstractC3802e f14796b;

    /* renamed from: c */
    AbstractC3805h f14797c;

    /* renamed from: d */
    private View f14798d;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    /* loaded from: classes2.dex */
    static final class C3795a implements AbstractC3800c {

        /* renamed from: a */
        private final CustomEventAdapter f14799a;

        /* renamed from: b */
        private final AbstractC3807d f14800b;

        public C3795a(CustomEventAdapter customEventAdapter, AbstractC3807d abstractC3807d) {
            this.f14799a = customEventAdapter;
            this.f14800b = abstractC3807d;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: a */
        public void mo26801a() {
            C3784b.m26846a("Custom event adapter called onAdClicked.");
            this.f14800b.mo13019e(this.f14799a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: a */
        public void mo26800a(int i) {
            C3784b.m26846a("Custom event adapter called onAdFailedToLoad.");
            this.f14800b.mo13034a(this.f14799a, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3800c
        /* renamed from: a */
        public void mo26807a(View view) {
            C3784b.m26846a("Custom event adapter called onAdLoaded.");
            this.f14799a.m26815a(view);
            this.f14800b.mo13035a(this.f14799a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: b */
        public void mo26799b() {
            C3784b.m26846a("Custom event adapter called onAdOpened.");
            this.f14800b.mo13028b(this.f14799a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: c */
        public void mo26798c() {
            C3784b.m26846a("Custom event adapter called onAdClosed.");
            this.f14800b.mo13025c(this.f14799a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: d */
        public void mo26797d() {
            C3784b.m26846a("Custom event adapter called onAdLeftApplication.");
            this.f14800b.mo13022d(this.f14799a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    /* loaded from: classes2.dex */
    public class C3796b implements AbstractC3803f {

        /* renamed from: b */
        private final CustomEventAdapter f14802b;

        /* renamed from: c */
        private final AbstractC3809f f14803c;

        public C3796b(CustomEventAdapter customEventAdapter, AbstractC3809f abstractC3809f) {
            this.f14802b = customEventAdapter;
            this.f14803c = abstractC3809f;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: a */
        public void mo26801a() {
            C3784b.m26846a("Custom event adapter called onAdClicked.");
            this.f14803c.mo13018e(this.f14802b);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: a */
        public void mo26800a(int i) {
            C3784b.m26846a("Custom event adapter called onFailedToReceiveAd.");
            this.f14803c.mo13032a(this.f14802b, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: b */
        public void mo26799b() {
            C3784b.m26846a("Custom event adapter called onAdOpened.");
            this.f14803c.mo13027b(this.f14802b);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: c */
        public void mo26798c() {
            C3784b.m26846a("Custom event adapter called onAdClosed.");
            this.f14803c.mo13024c(this.f14802b);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: d */
        public void mo26797d() {
            C3784b.m26846a("Custom event adapter called onAdLeftApplication.");
            this.f14803c.mo13021d(this.f14802b);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3803f
        /* renamed from: e */
        public void mo26802e() {
            C3784b.m26846a("Custom event adapter called onReceivedAd.");
            this.f14803c.mo13033a(CustomEventAdapter.this);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    /* loaded from: classes2.dex */
    static class C3797c implements AbstractC3806i {

        /* renamed from: a */
        private final CustomEventAdapter f14804a;

        /* renamed from: b */
        private final AbstractC3811h f14805b;

        public C3797c(CustomEventAdapter customEventAdapter, AbstractC3811h abstractC3811h) {
            this.f14804a = customEventAdapter;
            this.f14805b = abstractC3811h;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: a */
        public void mo26801a() {
            C3784b.m26846a("Custom event adapter called onAdClicked.");
            this.f14805b.mo13020d(this.f14804a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: a */
        public void mo26800a(int i) {
            C3784b.m26846a("Custom event adapter called onAdFailedToLoad.");
            this.f14805b.mo13030a(this.f14804a, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3806i
        /* renamed from: a */
        public void mo26795a(AbstractC3812i abstractC3812i) {
            C3784b.m26846a("Custom event adapter called onAdLoaded.");
            this.f14805b.mo13029a(this.f14804a, abstractC3812i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: b */
        public void mo26799b() {
            C3784b.m26846a("Custom event adapter called onAdOpened.");
            this.f14805b.mo13031a(this.f14804a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: c */
        public void mo26798c() {
            C3784b.m26846a("Custom event adapter called onAdClosed.");
            this.f14805b.mo13026b(this.f14804a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3804g
        /* renamed from: d */
        public void mo26797d() {
            C3784b.m26846a("Custom event adapter called onAdLeftApplication.");
            this.f14805b.mo13023c(this.f14804a);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.AbstractC3806i
        /* renamed from: e */
        public void mo26794e() {
            C3784b.m26846a("Custom event adapter called onAdImpression.");
            this.f14805b.mo13017e(this.f14804a);
        }
    }

    /* renamed from: a */
    private static <T> T m26812a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(valueOf).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26815a(View view) {
        this.f14798d = view;
    }

    /* renamed from: a */
    C3796b m26813a(AbstractC3809f abstractC3809f) {
        return new C3796b(this, abstractC3809f);
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3794c
    public View getBannerView() {
        return this.f14798d;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onDestroy() {
        if (this.f14795a != null) {
            this.f14795a.a();
        }
        if (this.f14796b != null) {
            this.f14796b.a();
        }
        if (this.f14797c != null) {
            this.f14797c.a();
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onPause() {
        if (this.f14795a != null) {
            this.f14795a.b();
        }
        if (this.f14796b != null) {
            this.f14796b.b();
        }
        if (this.f14797c != null) {
            this.f14797c.b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onResume() {
        if (this.f14795a != null) {
            this.f14795a.c();
        }
        if (this.f14796b != null) {
            this.f14796b.c();
        }
        if (this.f14797c != null) {
            this.f14797c.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3794c
    public void requestBannerAd(Context context, AbstractC3807d abstractC3807d, Bundle bundle, C3446d c3446d, AbstractC3790a abstractC3790a, Bundle bundle2) {
        this.f14795a = (AbstractC3799b) m26812a(bundle.getString("class_name"));
        if (this.f14795a == null) {
            abstractC3807d.mo13034a(this, 0);
        } else {
            this.f14795a.m26808a(context, new C3795a(this, abstractC3807d), bundle.getString(AbstractC3439a.f13723a), c3446d, abstractC3790a, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3808e
    public void requestInterstitialAd(Context context, AbstractC3809f abstractC3809f, Bundle bundle, AbstractC3790a abstractC3790a, Bundle bundle2) {
        this.f14796b = (AbstractC3802e) m26812a(bundle.getString("class_name"));
        if (this.f14796b == null) {
            abstractC3809f.mo13032a(this, 0);
        } else {
            this.f14796b.m26804a(context, m26813a(abstractC3809f), bundle.getString(AbstractC3439a.f13723a), abstractC3790a, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3810g
    public void requestNativeAd(Context context, AbstractC3811h abstractC3811h, Bundle bundle, AbstractC3815l abstractC3815l, Bundle bundle2) {
        this.f14797c = (AbstractC3805h) m26812a(bundle.getString("class_name"));
        if (this.f14797c == null) {
            abstractC3811h.mo13030a(this, 0);
        } else {
            this.f14797c.m26796a(context, new C3797c(this, abstractC3811h), bundle.getString(AbstractC3439a.f13723a), abstractC3815l, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3808e
    public void showInterstitial() {
        this.f14796b.m26803d();
    }
}
