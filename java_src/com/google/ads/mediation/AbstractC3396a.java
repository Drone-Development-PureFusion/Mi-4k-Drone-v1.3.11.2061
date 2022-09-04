package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractC3432a;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C3436b;
import com.google.android.gms.ads.C3443c;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.C3455f;
import com.google.android.gms.ads.formats.AbstractC3462c;
import com.google.android.gms.ads.formats.AbstractC3464d;
import com.google.android.gms.ads.formats.C3458b;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.internal.client.AbstractC3501a;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.mediation.AbstractC3790a;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.ads.mediation.AbstractC3794c;
import com.google.android.gms.ads.mediation.AbstractC3807d;
import com.google.android.gms.ads.mediation.AbstractC3809f;
import com.google.android.gms.ads.mediation.AbstractC3810g;
import com.google.android.gms.ads.mediation.AbstractC3811h;
import com.google.android.gms.ads.mediation.AbstractC3813j;
import com.google.android.gms.ads.mediation.AbstractC3814k;
import com.google.android.gms.ads.mediation.AbstractC3815l;
import com.google.android.gms.ads.p226b.AbstractC3438a;
import com.google.android.gms.ads.p226b.AbstractC3442c;
import com.google.android.gms.ads.p226b.p227a.AbstractC3439a;
import com.google.android.gms.ads.p226b.p227a.AbstractC3440b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.adn;
import java.util.Date;
import java.util.Set;
@aaa
/* renamed from: com.google.ads.mediation.a */
/* loaded from: classes.dex */
public abstract class AbstractC3396a implements AbstractC3439a, AbstractC3794c, AbstractC3810g, adn {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    protected AdView zzfz;
    protected C3455f zzga;
    private C3436b zzgb;
    private Context zzgc;
    private C3455f zzgd;
    private AbstractC3440b zzge;
    final AbstractC3442c zzgf = new AbstractC3442c() { // from class: com.google.ads.mediation.a.1
        @Override // com.google.android.gms.ads.p226b.AbstractC3442c
        /* renamed from: a */
        public void mo27848a() {
            AbstractC3396a.this.zzge.mo26943b(AbstractC3396a.this);
        }

        @Override // com.google.android.gms.ads.p226b.AbstractC3442c
        /* renamed from: a */
        public void mo27847a(int i) {
            AbstractC3396a.this.zzge.mo26942b(AbstractC3396a.this, i);
        }

        @Override // com.google.android.gms.ads.p226b.AbstractC3442c
        /* renamed from: a */
        public void mo27846a(AbstractC3438a abstractC3438a) {
            AbstractC3396a.this.zzge.mo26944a(AbstractC3396a.this, abstractC3438a);
        }

        @Override // com.google.android.gms.ads.p226b.AbstractC3442c
        /* renamed from: b */
        public void mo27845b() {
            AbstractC3396a.this.zzge.mo26941c(AbstractC3396a.this);
        }

        @Override // com.google.android.gms.ads.p226b.AbstractC3442c
        /* renamed from: c */
        public void mo27844c() {
            AbstractC3396a.this.zzge.mo26940d(AbstractC3396a.this);
        }

        @Override // com.google.android.gms.ads.p226b.AbstractC3442c
        /* renamed from: d */
        public void mo27843d() {
            AbstractC3396a.this.zzge.mo26939e(AbstractC3396a.this);
            AbstractC3396a.this.zzgd = null;
        }

        @Override // com.google.android.gms.ads.p226b.AbstractC3442c
        /* renamed from: e */
        public void mo27842e() {
            AbstractC3396a.this.zzge.mo26937g(AbstractC3396a.this);
        }
    };

    /* renamed from: com.google.ads.mediation.a$a */
    /* loaded from: classes2.dex */
    static class C3398a extends AbstractC3813j {

        /* renamed from: d */
        private final AbstractC3462c f13652d;

        public C3398a(AbstractC3462c abstractC3462c) {
            this.f13652d = abstractC3462c;
            a(abstractC3462c.mo13377b().toString());
            a(abstractC3462c.mo13376c());
            b(abstractC3462c.mo13375d().toString());
            a(abstractC3462c.mo13374e());
            c(abstractC3462c.mo13373f().toString());
            if (abstractC3462c.mo13372g() != null) {
                a(abstractC3462c.mo13372g().doubleValue());
            }
            if (abstractC3462c.mo13371h() != null) {
                d(abstractC3462c.mo13371h().toString());
            }
            if (abstractC3462c.mo13370i() != null) {
                e(abstractC3462c.mo13370i().toString());
            }
            a(true);
            b(true);
            a(abstractC3462c.mo13369j());
        }

        @Override // com.google.android.gms.ads.mediation.AbstractC3812i
        /* renamed from: a */
        public void mo26791a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f13652d);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.a$b */
    /* loaded from: classes2.dex */
    static class C3399b extends AbstractC3814k {

        /* renamed from: d */
        private final AbstractC3464d f13653d;

        public C3399b(AbstractC3464d abstractC3464d) {
            this.f13653d = abstractC3464d;
            a(abstractC3464d.mo13353b().toString());
            a(abstractC3464d.mo13352c());
            b(abstractC3464d.mo13351d().toString());
            if (abstractC3464d.mo13350e() != null) {
                a(abstractC3464d.mo13350e());
            }
            c(abstractC3464d.mo13349f().toString());
            d(abstractC3464d.mo13348g().toString());
            a(true);
            b(true);
        }

        @Override // com.google.android.gms.ads.mediation.AbstractC3812i
        /* renamed from: a */
        public void mo26791a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f13653d);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.a$c */
    /* loaded from: classes2.dex */
    static final class C3400c extends AbstractC3432a implements AbstractC3501a {

        /* renamed from: a */
        final AbstractC3396a f13654a;

        /* renamed from: b */
        final AbstractC3807d f13655b;

        public C3400c(AbstractC3396a abstractC3396a, AbstractC3807d abstractC3807d) {
            this.f13654a = abstractC3396a;
            this.f13655b = abstractC3807d;
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: a */
        public void mo27472a() {
            this.f13655b.mo13035a(this.f13654a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: a */
        public void mo27471a(int i) {
            this.f13655b.mo13034a(this.f13654a, i);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: b */
        public void mo27580b() {
            this.f13655b.mo13028b(this.f13654a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: c */
        public void mo27579c() {
            this.f13655b.mo13025c(this.f13654a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: d */
        public void mo27578d() {
            this.f13655b.mo13022d(this.f13654a);
        }

        @Override // com.google.android.gms.ads.internal.client.AbstractC3501a
        /* renamed from: e */
        public void mo27632e() {
            this.f13655b.mo13019e(this.f13654a);
        }
    }

    /* renamed from: com.google.ads.mediation.a$d */
    /* loaded from: classes2.dex */
    static final class C3401d extends AbstractC3432a implements AbstractC3501a {

        /* renamed from: a */
        final AbstractC3396a f13656a;

        /* renamed from: b */
        final AbstractC3809f f13657b;

        public C3401d(AbstractC3396a abstractC3396a, AbstractC3809f abstractC3809f) {
            this.f13656a = abstractC3396a;
            this.f13657b = abstractC3809f;
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: a */
        public void mo27472a() {
            this.f13657b.mo13033a(this.f13656a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: a */
        public void mo27471a(int i) {
            this.f13657b.mo13032a(this.f13656a, i);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: b */
        public void mo27580b() {
            this.f13657b.mo13027b(this.f13656a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: c */
        public void mo27579c() {
            this.f13657b.mo13024c(this.f13656a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: d */
        public void mo27578d() {
            this.f13657b.mo13021d(this.f13656a);
        }

        @Override // com.google.android.gms.ads.internal.client.AbstractC3501a
        /* renamed from: e */
        public void mo27632e() {
            this.f13657b.mo13018e(this.f13656a);
        }
    }

    /* renamed from: com.google.ads.mediation.a$e */
    /* loaded from: classes2.dex */
    static final class C3402e extends AbstractC3432a implements AbstractC3462c.AbstractC3463a, AbstractC3464d.AbstractC3465a, AbstractC3501a {

        /* renamed from: a */
        final AbstractC3396a f13658a;

        /* renamed from: b */
        final AbstractC3811h f13659b;

        public C3402e(AbstractC3396a abstractC3396a, AbstractC3811h abstractC3811h) {
            this.f13658a = abstractC3396a;
            this.f13659b = abstractC3811h;
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: a */
        public void mo27472a() {
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: a */
        public void mo27471a(int i) {
            this.f13659b.mo13030a(this.f13658a, i);
        }

        @Override // com.google.android.gms.ads.formats.AbstractC3462c.AbstractC3463a
        /* renamed from: a */
        public void mo27717a(AbstractC3462c abstractC3462c) {
            this.f13659b.mo13029a(this.f13658a, new C3398a(abstractC3462c));
        }

        @Override // com.google.android.gms.ads.formats.AbstractC3464d.AbstractC3465a
        /* renamed from: a */
        public void mo27716a(AbstractC3464d abstractC3464d) {
            this.f13659b.mo13029a(this.f13658a, new C3399b(abstractC3464d));
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: b */
        public void mo27580b() {
            this.f13659b.mo13031a(this.f13658a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: c */
        public void mo27579c() {
            this.f13659b.mo13026b(this.f13658a);
        }

        @Override // com.google.android.gms.ads.AbstractC3432a
        /* renamed from: d */
        public void mo27578d() {
            this.f13659b.mo13023c(this.f13658a);
        }

        @Override // com.google.android.gms.ads.internal.client.AbstractC3501a
        /* renamed from: e */
        public void mo27632e() {
            this.f13659b.mo13020d(this.f13658a);
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3794c
    public View getBannerView() {
        return this.zzfz;
    }

    @Override // com.google.android.gms.internal.adn
    public Bundle getInterstitialAdapterInfo() {
        return new AbstractC3792b.C3793a().m26816a(1).m26817a();
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3439a
    public void initialize(Context context, AbstractC3790a abstractC3790a, String str, AbstractC3440b abstractC3440b, Bundle bundle, Bundle bundle2) {
        this.zzgc = context.getApplicationContext();
        this.zzge = abstractC3440b;
        this.zzge.mo26946a(this);
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3439a
    public boolean isInitialized() {
        return this.zzge != null;
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3439a
    public void loadAd(AbstractC3790a abstractC3790a, Bundle bundle, Bundle bundle2) {
        if (this.zzgc == null || this.zzge == null) {
            C3784b.m26844b("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzgd = new C3455f(this.zzgc);
        this.zzgd.m27746a(true);
        this.zzgd.m27747a(getAdUnitId(bundle));
        this.zzgd.m27751a(this.zzgf);
        this.zzgd.m27750a(zza(this.zzgc, abstractC3790a, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onDestroy() {
        if (this.zzfz != null) {
            this.zzfz.mo27875d();
            this.zzfz = null;
        }
        if (this.zzga != null) {
            this.zzga = null;
        }
        if (this.zzgb != null) {
            this.zzgb = null;
        }
        if (this.zzgd != null) {
            this.zzgd = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onPause() {
        if (this.zzfz != null) {
            this.zzfz.mo27876c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3792b
    public void onResume() {
        if (this.zzfz != null) {
            this.zzfz.mo27877b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3794c
    public void requestBannerAd(Context context, AbstractC3807d abstractC3807d, Bundle bundle, C3446d c3446d, AbstractC3790a abstractC3790a, Bundle bundle2) {
        this.zzfz = new AdView(context);
        this.zzfz.setAdSize(new C3446d(c3446d.m27815b(), c3446d.m27817a()));
        this.zzfz.setAdUnitId(getAdUnitId(bundle));
        this.zzfz.setAdListener(new C3400c(this, abstractC3807d));
        this.zzfz.mo27879a(zza(context, abstractC3790a, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3808e
    public void requestInterstitialAd(Context context, AbstractC3809f abstractC3809f, Bundle bundle, AbstractC3790a abstractC3790a, Bundle bundle2) {
        this.zzga = new C3455f(context);
        this.zzga.m27747a(getAdUnitId(bundle));
        this.zzga.m27752a(new C3401d(this, abstractC3809f));
        this.zzga.m27750a(zza(context, abstractC3790a, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3810g
    public void requestNativeAd(Context context, AbstractC3811h abstractC3811h, Bundle bundle, AbstractC3815l abstractC3815l, Bundle bundle2) {
        C3402e c3402e = new C3402e(this, abstractC3811h);
        C3436b.C3437a m27854a = zza(context, bundle.getString(AD_UNIT_ID_PARAMETER)).m27854a((AbstractC3432a) c3402e);
        C3458b mo12980h = abstractC3815l.mo12980h();
        if (mo12980h != null) {
            m27854a.m27852a(mo12980h);
        }
        if (abstractC3815l.mo12979i()) {
            m27854a.m27851a((AbstractC3462c.AbstractC3463a) c3402e);
        }
        if (abstractC3815l.mo12978j()) {
            m27854a.m27850a((AbstractC3464d.AbstractC3465a) c3402e);
        }
        this.zzgb = m27854a.m27855a();
        this.zzgb.m27859a(zza(context, abstractC3815l, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3808e
    public void showInterstitial() {
        this.zzga.m27740g();
    }

    @Override // com.google.android.gms.ads.p226b.p227a.AbstractC3439a
    public void showVideo() {
        this.zzgd.m27740g();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    C3436b.C3437a zza(Context context, String str) {
        return new C3436b.C3437a(context, str);
    }

    C3443c zza(Context context, AbstractC3790a abstractC3790a, Bundle bundle, Bundle bundle2) {
        C3443c.C3445a c3445a = new C3443c.C3445a();
        Date mo12987a = abstractC3790a.mo12987a();
        if (mo12987a != null) {
            c3445a.m27824a(mo12987a);
        }
        int mo12986b = abstractC3790a.mo12986b();
        if (mo12986b != 0) {
            c3445a.m27830a(mo12986b);
        }
        Set<String> mo12985c = abstractC3790a.mo12985c();
        if (mo12985c != null) {
            for (String str : mo12985c) {
                c3445a.m27825a(str);
            }
        }
        Location mo12984d = abstractC3790a.mo12984d();
        if (mo12984d != null) {
            c3445a.m27829a(mo12984d);
        }
        if (abstractC3790a.mo12982f()) {
            c3445a.m27821b(C3514ac.m27586a().m26866a(context));
        }
        if (abstractC3790a.mo12983e() != -1) {
            c3445a.m27823a(abstractC3790a.mo12983e() == 1);
        }
        c3445a.m27820b(abstractC3790a.mo12981g());
        c3445a.m27826a(AdMobAdapter.class, zza(bundle, bundle2));
        return c3445a.m27831a();
    }
}
