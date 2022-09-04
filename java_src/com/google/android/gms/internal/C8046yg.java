package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.overlay.AbstractC3659g;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.AbstractC3790a;
import com.google.android.gms.ads.mediation.AbstractC3808e;
import com.google.android.gms.ads.mediation.AbstractC3809f;
import com.google.android.gms.internal.C7811ut;
@aaa
/* renamed from: com.google.android.gms.internal.yg */
/* loaded from: classes.dex */
public class C8046yg implements AbstractC3808e {

    /* renamed from: a */
    private Activity f26357a;

    /* renamed from: b */
    private C7811ut f26358b;

    /* renamed from: c */
    private AbstractC3809f f26359c;

    /* renamed from: d */
    private Uri f26360d;

    /* renamed from: a */
    public static boolean m12939a(Context context) {
        return C7811ut.m13414a(context);
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onDestroy() {
        C3784b.m26846a("Destroying AdMobCustomTabsAdapter adapter.");
        try {
            this.f26358b.m13415a(this.f26357a);
        } catch (Exception e) {
            C3784b.m26843b("Exception while unbinding from CustomTabsService.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onPause() {
        C3784b.m26846a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onResume() {
        C3784b.m26846a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3808e
    public void requestInterstitialAd(Context context, AbstractC3809f abstractC3809f, Bundle bundle, AbstractC3790a abstractC3790a, Bundle bundle2) {
        this.f26359c = abstractC3809f;
        if (this.f26359c == null) {
            C3784b.m26840d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            C3784b.m26840d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f26359c.mo13032a(this, 0);
        } else if (!m12939a(context)) {
            C3784b.m26840d("Default browser does not support custom tabs. Bailing out.");
            this.f26359c.mo13032a(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                C3784b.m26840d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f26359c.mo13032a(this, 0);
                return;
            }
            this.f26357a = (Activity) context;
            this.f26360d = Uri.parse(string);
            this.f26358b = new C7811ut();
            this.f26358b.m13411a(new C7811ut.AbstractC7812a() { // from class: com.google.android.gms.internal.yg.1
                @Override // com.google.android.gms.internal.C7811ut.AbstractC7812a
                /* renamed from: a */
                public void mo12935a() {
                    C3784b.m26846a("Hinting CustomTabsService for the load of the new url.");
                }

                @Override // com.google.android.gms.internal.C7811ut.AbstractC7812a
                /* renamed from: b */
                public void mo12934b() {
                    C3784b.m26846a("Disconnecting from CustomTabs service.");
                }
            });
            this.f26358b.m13409b(this.f26357a);
            this.f26359c.mo13033a(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3808e
    public void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.f26358b.m13410b()).build();
        build.intent.setData(this.f26360d);
        final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new AdLauncherIntentInfoParcel(build.intent), null, new AbstractC3659g() { // from class: com.google.android.gms.internal.yg.2
            @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
            /* renamed from: g */
            public void mo12933g() {
                C3784b.m26846a("AdMobCustomTabsAdapter overlay is resumed.");
            }

            @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
            /* renamed from: i_ */
            public void mo12932i_() {
                C3784b.m26846a("AdMobCustomTabsAdapter overlay is closed.");
                C8046yg.this.f26359c.mo13024c(C8046yg.this);
                C8046yg.this.f26358b.m13415a(C8046yg.this.f26357a);
            }

            @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
            /* renamed from: j_ */
            public void mo12931j_() {
                C3784b.m26846a("Opening AdMobCustomTabsAdapter overlay.");
                C8046yg.this.f26359c.mo13027b(C8046yg.this);
            }

            @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
            /* renamed from: k_ */
            public void mo12930k_() {
                C3784b.m26846a("AdMobCustomTabsAdapter overlay is paused.");
            }
        }, null, new VersionInfoParcel(0, 0, false));
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.yg.3
            @Override // java.lang.Runnable
            public void run() {
                C3779u.m26892c().m27215a(C8046yg.this.f26357a, adOverlayInfoParcel);
            }
        });
        C3779u.m26886i().m18445c(false);
    }
}
