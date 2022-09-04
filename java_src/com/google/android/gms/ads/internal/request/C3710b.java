package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.C3708a;
import com.google.android.gms.ads.internal.request.C3714c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.C7667ro;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7990xh;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abu;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.acs;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.request.b */
/* loaded from: classes.dex */
public class C3710b extends abq implements C3714c.AbstractC3716a {

    /* renamed from: a */
    abx f14607a;

    /* renamed from: b */
    AdResponseParcel f14608b;

    /* renamed from: c */
    C7990xh f14609c;

    /* renamed from: d */
    private final C3708a.AbstractC3709a f14610d;

    /* renamed from: e */
    private final AdRequestInfoParcel.C3706a f14611e;

    /* renamed from: f */
    private final Object f14612f = new Object();

    /* renamed from: g */
    private final Context f14613g;

    /* renamed from: h */
    private final C7667ro f14614h;

    /* renamed from: i */
    private AdRequestInfoParcel f14615i;

    /* renamed from: j */
    private Runnable f14616j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @aaa
    /* renamed from: com.google.android.gms.ads.internal.request.b$a */
    /* loaded from: classes.dex */
    public static final class C3713a extends Exception {

        /* renamed from: a */
        private final int f14620a;

        public C3713a(String str, int i) {
            super(str);
            this.f14620a = i;
        }

        /* renamed from: a */
        public int m27024a() {
            return this.f14620a;
        }
    }

    public C3710b(Context context, AdRequestInfoParcel.C3706a c3706a, C7667ro c7667ro, C3708a.AbstractC3709a abstractC3709a) {
        this.f14610d = abstractC3709a;
        this.f14613g = context;
        this.f14611e = c3706a;
        this.f14614h = c7667ro;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m27032a(int i, String str) {
        if (i == 3 || i == -1) {
            abr.c(str);
        } else {
            abr.d(str);
        }
        if (this.f14608b == null) {
            this.f14608b = new AdResponseParcel(i);
        } else {
            this.f14608b = new AdResponseParcel(i, this.f14608b.f14575k);
        }
        this.f14610d.mo27033a(new abi.C6129a(this.f14615i != null ? this.f14615i : new AdRequestInfoParcel(this.f14611e, null, -1L), this.f14608b, this.f14609c, null, i, -1L, this.f14608b.f14578n, null));
    }

    /* renamed from: a */
    protected AdSizeParcel m27031a(AdRequestInfoParcel adRequestInfoParcel) {
        AdSizeParcel[] adSizeParcelArr;
        AdSizeParcel[] adSizeParcelArr2;
        if (this.f14608b.f14550A) {
            for (AdSizeParcel adSizeParcel : adRequestInfoParcel.f14488d.f13870h) {
                if (adSizeParcel.f13872j) {
                    return new AdSizeParcel(adSizeParcel, adRequestInfoParcel.f14488d.f13870h);
                }
            }
        }
        if (this.f14608b.f14577m == null) {
            throw new C3713a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f14608b.f14577m.split("x");
        if (split.length != 2) {
            String valueOf = String.valueOf(this.f14608b.f14577m);
            throw new C3713a(valueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(valueOf) : new String("Invalid ad size format from the ad response: "), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (AdSizeParcel adSizeParcel2 : adRequestInfoParcel.f14488d.f13870h) {
                float f = this.f14613g.getResources().getDisplayMetrics().density;
                int i = adSizeParcel2.f13868f == -1 ? (int) (adSizeParcel2.f13869g / f) : adSizeParcel2.f13868f;
                int i2 = adSizeParcel2.f13865c == -2 ? (int) (adSizeParcel2.f13866d / f) : adSizeParcel2.f13865c;
                if (parseInt == i && parseInt2 == i2 && !adSizeParcel2.f13872j) {
                    return new AdSizeParcel(adSizeParcel2, adRequestInfoParcel.f14488d.f13870h);
                }
            }
            String valueOf2 = String.valueOf(this.f14608b.f14577m);
            throw new C3713a(valueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(valueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
        } catch (NumberFormatException e) {
            String valueOf3 = String.valueOf(this.f14608b.f14577m);
            throw new C3713a(valueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(valueOf3) : new String("Invalid ad size number from the ad response: "), 0);
        }
    }

    /* renamed from: a */
    abx m27028a(VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> acrVar) {
        return C3714c.m27023a(this.f14613g, versionInfoParcel, acrVar, this);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        abr.a("AdLoaderBackgroundTask started.");
        this.f14616j = new Runnable() { // from class: com.google.android.gms.ads.internal.request.b.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3710b.this.f14612f) {
                    if (C3710b.this.f14607a == null) {
                        return;
                    }
                    C3710b.this.mo12779b();
                    C3710b.this.m27032a(2, "Timed out waiting for ad response.");
                }
            }
        };
        abv.f21039a.postDelayed(this.f14616j, C7788uf.f25766aX.m13486c().longValue());
        final acs acsVar = new acs();
        long mo16432b = C3779u.m26884k().mo16432b();
        abu.m18391a(new Runnable() { // from class: com.google.android.gms.ads.internal.request.b.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3710b.this.f14612f) {
                    C3710b.this.f14607a = C3710b.this.m27028a(C3710b.this.f14611e.f14533j, acsVar);
                    if (C3710b.this.f14607a == null) {
                        C3710b.this.m27032a(0, "Could not start the ad request service.");
                        abv.f21039a.removeCallbacks(C3710b.this.f14616j);
                    }
                }
            }
        });
        this.f14615i = new AdRequestInfoParcel(this.f14611e, this.f14614h.m13793a().mo14123a(this.f14613g), mo16432b);
        acsVar.mo13120a(this.f14615i);
    }

    @Override // com.google.android.gms.ads.internal.request.C3714c.AbstractC3716a
    /* renamed from: a */
    public void mo27018a(@NonNull AdResponseParcel adResponseParcel) {
        JSONObject jSONObject;
        abr.a("Received ad response.");
        this.f14608b = adResponseParcel;
        long mo16432b = C3779u.m26884k().mo16432b();
        synchronized (this.f14612f) {
            this.f14607a = null;
        }
        C3779u.m26886i().m18448b(this.f14613g, this.f14608b.f14557H);
        try {
            if (this.f14608b.f14569e != -2 && this.f14608b.f14569e != -3) {
                throw new C3713a(new StringBuilder(66).append("There was a problem getting an ad response. ErrorCode: ").append(this.f14608b.f14569e).toString(), this.f14608b.f14569e);
            }
            m27026c();
            AdSizeParcel m27031a = this.f14615i.f14488d.f13870h != null ? m27031a(this.f14615i) : null;
            C3779u.m26886i().m18447b(this.f14608b.f14586v);
            if (!TextUtils.isEmpty(this.f14608b.f14582r)) {
                try {
                    jSONObject = new JSONObject(this.f14608b.f14582r);
                } catch (Exception e) {
                    abr.b("Error parsing the JSON for Active View.", e);
                }
                this.f14610d.mo27033a(new abi.C6129a(this.f14615i, this.f14608b, this.f14609c, m27031a, -2, mo16432b, this.f14608b.f14578n, jSONObject));
                abv.f21039a.removeCallbacks(this.f14616j);
            }
            jSONObject = null;
            this.f14610d.mo27033a(new abi.C6129a(this.f14615i, this.f14608b, this.f14609c, m27031a, -2, mo16432b, this.f14608b.f14578n, jSONObject));
            abv.f21039a.removeCallbacks(this.f14616j);
        } catch (C3713a e2) {
            m27032a(e2.m27024a(), e2.getMessage());
            abv.f21039a.removeCallbacks(this.f14616j);
        }
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
        synchronized (this.f14612f) {
            if (this.f14607a != null) {
                this.f14607a.mo12794d();
            }
        }
    }

    /* renamed from: c */
    protected void m27026c() {
        if (this.f14608b.f14569e == -3) {
            return;
        }
        if (TextUtils.isEmpty(this.f14608b.f14567c)) {
            throw new C3713a("No fill from ad server.", 3);
        }
        C3779u.m26886i().m18457a(this.f14613g, this.f14608b.f14585u);
        if (this.f14608b.f14572h) {
            try {
                this.f14609c = new C7990xh(this.f14608b.f14567c);
                C3779u.m26886i().m18445c(this.f14609c.f26238g);
            } catch (JSONException e) {
                abr.b("Could not parse mediation config.", e);
                String valueOf = String.valueOf(this.f14608b.f14567c);
                throw new C3713a(valueOf.length() != 0 ? "Could not parse mediation config: ".concat(valueOf) : new String("Could not parse mediation config: "), 0);
            }
        } else {
            C3779u.m26886i().m18445c(this.f14608b.f14560K);
        }
        if (TextUtils.isEmpty(this.f14608b.f14558I) || !C7788uf.f25880cu.m13486c().booleanValue()) {
            return;
        }
        abr.a("Received cookie from server. Setting webview cookie in CookieManager.");
        CookieManager mo18282b = C3779u.m26888g().mo18282b(this.f14613g);
        if (mo18282b == null) {
            return;
        }
        mo18282b.setCookie("googleads.g.doubleclick.net", this.f14608b.f14558I);
    }
}
