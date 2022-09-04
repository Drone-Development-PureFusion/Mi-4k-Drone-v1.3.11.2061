package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.p001v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.AbstractC3601g;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.ads.internal.formats.BinderC3598d;
import com.google.android.gms.ads.internal.formats.BinderC3599e;
import com.google.android.gms.ads.internal.formats.BinderC3600f;
import com.google.android.gms.ads.internal.formats.C3602h;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC7839vf;
import com.google.android.gms.internal.AbstractC7842vg;
import com.google.android.gms.internal.AbstractC7845vh;
import com.google.android.gms.internal.AbstractC7848vi;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.AbstractC8017xu;
import com.google.android.gms.internal.AbstractC8020xv;
import com.google.android.gms.internal.AbstractC8082yy;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.ads.internal.q */
/* loaded from: classes.dex */
public class BinderC3698q extends AbstractBinderC3478b {

    /* renamed from: l */
    private acy f14450l;

    public BinderC3698q(Context context, C3588d c3588d, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, str, abstractC8005xq, versionInfoParcel, c3588d);
    }

    /* renamed from: a */
    private static BinderC3598d m27055a(AbstractC8017xu abstractC8017xu) {
        return new BinderC3598d(abstractC8017xu.mo13016a(), abstractC8017xu.mo13014b(), abstractC8017xu.mo13012c(), abstractC8017xu.mo13010d() != null ? abstractC8017xu.mo13010d() : null, abstractC8017xu.mo13009e(), abstractC8017xu.mo13008f(), abstractC8017xu.mo13007g(), abstractC8017xu.mo13006h(), null, abstractC8017xu.mo13002l(), abstractC8017xu.mo13001m(), null);
    }

    /* renamed from: a */
    private static BinderC3599e m27054a(AbstractC8020xv abstractC8020xv) {
        return new BinderC3599e(abstractC8020xv.mo13000a(), abstractC8020xv.mo12998b(), abstractC8020xv.mo12996c(), abstractC8020xv.mo12994d() != null ? abstractC8020xv.mo12994d() : null, abstractC8020xv.mo12993e(), abstractC8020xv.mo12992f(), null, abstractC8020xv.mo12988j());
    }

    /* renamed from: a */
    private void m27063a(final BinderC3598d binderC3598d) {
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.q.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (BinderC3698q.this.f13800f.f14780s == null) {
                        return;
                    }
                    BinderC3698q.this.f13800f.f14780s.mo13325a(binderC3598d);
                } catch (RemoteException e) {
                    abr.d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
                }
            }
        });
    }

    /* renamed from: a */
    private void m27062a(final BinderC3599e binderC3599e) {
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.q.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (BinderC3698q.this.f13800f.f14781t == null) {
                        return;
                    }
                    BinderC3698q.this.f13800f.f14781t.mo13323a(binderC3599e);
                } catch (RemoteException e) {
                    abr.d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
                }
            }
        });
    }

    /* renamed from: a */
    private void m27059a(final abi abiVar, final String str) {
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.q.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BinderC3698q.this.f13800f.f14783v.get(str).mo13320a((BinderC3600f) abiVar.f20889E);
                } catch (RemoteException e) {
                    abr.d("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
                }
            }
        });
    }

    /* renamed from: E */
    public void m27069E() {
        if (this.f13800f.f14771j == null || this.f14450l == null) {
            abr.d("Request to enable ActiveView before adState is available.");
        } else {
            C3779u.m26886i().m18431p().m13599a(this.f13800f.f14770i, this.f13800f.f14771j, this.f14450l.mo18105b(), this.f14450l);
        }
    }

    /* renamed from: F */
    public SimpleArrayMap<String, AbstractC7848vi> m27068F() {
        C4588d.m23620b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f13800f.f14783v;
    }

    /* renamed from: G */
    public void m27067G() {
        if (this.f14450l != null) {
            this.f14450l.destroy();
            this.f14450l = null;
        }
    }

    /* renamed from: H */
    public void m27066H() {
        if (this.f14450l == null || this.f14450l.mo18070z() == null || this.f13800f.f14784w == null || this.f13800f.f14784w.f14079f == null) {
            return;
        }
        this.f14450l.mo18070z().m18056b(this.f13800f.f14784w.f14079f.f13890b);
    }

    /* renamed from: a */
    public void m27065a(SimpleArrayMap<String, AbstractC7848vi> simpleArrayMap) {
        C4588d.m23620b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.f13800f.f14783v = simpleArrayMap;
    }

    /* renamed from: a */
    public void m27064a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        C4588d.m23620b("setNativeAdOptions must be called on the main UI thread.");
        this.f13800f.f14784w = nativeAdOptionsParcel;
    }

    /* renamed from: a */
    public void m27061a(AbstractC3601g abstractC3601g) {
        if (this.f14450l != null) {
            this.f14450l.mo18116a(abstractC3601g);
        }
    }

    /* renamed from: a */
    public void m27060a(AbstractC3603i abstractC3603i) {
        if (this.f13800f.f14771j.f20903j != null) {
            C3779u.m26886i().m18431p().m13598a(this.f13800f.f14770i, this.f13800f.f14771j, abstractC3603i);
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public void mo18575a(final abi.C6129a c6129a, C7801un c7801un) {
        if (c6129a.f20923d != null) {
            this.f13800f.f14770i = c6129a.f20923d;
        }
        if (c6129a.f20924e != -2) {
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.q.1
                @Override // java.lang.Runnable
                public void run() {
                    BinderC3698q.this.b(new abi(c6129a, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.f13800f.f14752E = 0;
        this.f13800f.f14769h = C3779u.m26891d().m12801a(this.f13800f.f14764c, this, c6129a, this.f13800f.f14765d, null, this.f13807j, this, c7801un);
        String valueOf = String.valueOf(this.f13800f.f14769h.getClass().getName());
        abr.a(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
    }

    /* renamed from: a */
    public void m27058a(acy acyVar) {
        this.f14450l = acyVar;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13184a(AbstractC7807ur abstractC7807ur) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public void m27057a(AbstractC7839vf abstractC7839vf) {
        C4588d.m23620b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.f13800f.f14780s = abstractC7839vf;
    }

    /* renamed from: a */
    public void m27056a(AbstractC7842vg abstractC7842vg) {
        C4588d.m23620b("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.f13800f.f14781t = abstractC7842vg;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13183a(AbstractC8082yy abstractC8082yy) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public void m27053a(@Nullable List<String> list) {
        C4588d.m23620b("setNativeTemplates must be called on the main UI thread.");
        this.f13800f.f14748A = list;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b
    /* renamed from: a */
    protected boolean mo18578a(AdRequestParcel adRequestParcel, abi abiVar, boolean z) {
        return this.f13799e.m27042d();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    protected boolean mo18574a(abi abiVar, abi abiVar2) {
        m27053a((List<String>) null);
        if (!this.f13800f.m26828e()) {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (abiVar2.f20907n) {
            try {
                AbstractC8017xu mo12960h = abiVar2.f20909p != null ? abiVar2.f20909p.mo12960h() : null;
                AbstractC8020xv mo12959i = abiVar2.f20909p != null ? abiVar2.f20909p.mo12959i() : null;
                if (mo12960h != null && this.f13800f.f14780s != null) {
                    BinderC3598d m27055a = m27055a(mo12960h);
                    m27055a.mo27381a(new C3602h(this.f13800f.f14764c, this, this.f13800f.f14765d, mo12960h, m27055a));
                    m27063a(m27055a);
                } else if (mo12959i == null || this.f13800f.f14781t == null) {
                    abr.d("No matching mapper/listener for retrieved native ad template.");
                    a(0);
                    return false;
                } else {
                    BinderC3599e m27054a = m27054a(mo12959i);
                    m27054a.mo27381a(new C3602h(this.f13800f.f14764c, this, this.f13800f.f14765d, mo12959i, m27054a));
                    m27062a(m27054a);
                }
            } catch (RemoteException e) {
                abr.d("Failed to get native ad mapper", e);
            }
        } else {
            AbstractC3603i.AbstractC3604a abstractC3604a = abiVar2.f20889E;
            if ((abstractC3604a instanceof BinderC3599e) && this.f13800f.f14781t != null) {
                m27062a((BinderC3599e) abiVar2.f20889E);
            } else if ((abstractC3604a instanceof BinderC3598d) && this.f13800f.f14780s != null) {
                m27063a((BinderC3598d) abiVar2.f20889E);
            } else if (!(abstractC3604a instanceof BinderC3600f) || this.f13800f.f14783v == null || this.f13800f.f14783v.get(((BinderC3600f) abstractC3604a).mo13338l()) == null) {
                abr.d("No matching listener for retrieved native ad template.");
                a(0);
                return false;
            } else {
                m27059a(abiVar2, ((BinderC3600f) abstractC3604a).mo13338l());
            }
        }
        return super.mo18574a(abiVar, abiVar2);
    }

    /* renamed from: b */
    public void m27052b(SimpleArrayMap<String, AbstractC7845vh> simpleArrayMap) {
        C4588d.m23620b("setOnCustomClickListener must be called on the main UI thread.");
        this.f13800f.f14782u = simpleArrayMap;
    }

    @Nullable
    /* renamed from: c */
    public AbstractC7845vh m27051c(String str) {
        C4588d.m23620b("getOnCustomClickListener must be called on the main UI thread.");
        return this.f13800f.f14782u.get(str);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: d */
    public void mo13175d() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: f */
    public void mo13174f() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h_ */
    public void mo13172h_() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }
}
