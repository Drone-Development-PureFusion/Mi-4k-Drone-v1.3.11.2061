package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.C3708a;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.ads.p225a.C3433a;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4517d;
import com.google.android.gms.internal.AbstractC7877vt;
import com.google.android.gms.internal.AbstractC7944wu;
import com.google.android.gms.internal.AbstractC7980wy;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7878vu;
import com.google.android.gms.internal.C7889vz;
import com.google.android.gms.internal.C7957wx;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aab;
import com.google.android.gms.internal.aaf;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.aca;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.acy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.request.n */
/* loaded from: classes.dex */
public class C3736n extends abq {

    /* renamed from: h */
    private final C3708a.AbstractC3709a f14647h;

    /* renamed from: i */
    private final AdRequestInfoParcel.C3706a f14648i;

    /* renamed from: j */
    private final Object f14649j = new Object();

    /* renamed from: k */
    private final Context f14650k;

    /* renamed from: l */
    private C7957wx.C7970c f14651l;

    /* renamed from: a */
    static final long f14640a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private static final Object f14642c = new Object();

    /* renamed from: b */
    static boolean f14641b = false;

    /* renamed from: d */
    private static C7957wx f14643d = null;

    /* renamed from: e */
    private static C7878vu f14644e = null;

    /* renamed from: f */
    private static C7889vz f14645f = null;

    /* renamed from: g */
    private static AbstractC7877vt f14646g = null;

    /* renamed from: com.google.android.gms.ads.internal.request.n$a */
    /* loaded from: classes2.dex */
    public static class C3742a implements aca<AbstractC7944wu> {
        @Override // com.google.android.gms.internal.aca
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo12761a(AbstractC7944wu abstractC7944wu) {
            C3736n.m26984b(abstractC7944wu);
        }
    }

    /* renamed from: com.google.android.gms.ads.internal.request.n$b */
    /* loaded from: classes2.dex */
    public static class C3743b implements aca<AbstractC7944wu> {
        @Override // com.google.android.gms.internal.aca
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo12761a(AbstractC7944wu abstractC7944wu) {
            C3736n.m26986a(abstractC7944wu);
        }
    }

    /* renamed from: com.google.android.gms.ads.internal.request.n$c */
    /* loaded from: classes2.dex */
    public static class C3744c implements AbstractC7877vt {
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            String str = map.get("request_id");
            String valueOf = String.valueOf(map.get("errors"));
            abr.d(valueOf.length() != 0 ? "Invalid request: ".concat(valueOf) : new String("Invalid request: "));
            C3736n.f14645f.m13290b(str);
        }
    }

    public C3736n(Context context, AdRequestInfoParcel.C3706a c3706a, C3708a.AbstractC3709a abstractC3709a) {
        super(true);
        this.f14647h = abstractC3709a;
        this.f14650k = context;
        this.f14648i = c3706a;
        synchronized (f14642c) {
            if (!f14641b) {
                f14645f = new C7889vz();
                f14644e = new C7878vu(context.getApplicationContext(), c3706a.f14533j);
                f14646g = new C3744c();
                f14643d = new C7957wx(this.f14650k.getApplicationContext(), this.f14648i.f14533j, C7788uf.f25795b.m13486c(), new C3743b(), new C3742a());
                f14641b = true;
            }
        }
    }

    /* renamed from: a */
    private AdResponseParcel m26990a(AdRequestInfoParcel adRequestInfoParcel) {
        final String m18329c = C3779u.m26890e().m18329c();
        final JSONObject m26989a = m26989a(adRequestInfoParcel, m18329c);
        if (m26989a == null) {
            return new AdResponseParcel(0);
        }
        long mo16432b = C3779u.m26884k().mo16432b();
        Future<JSONObject> m13292a = f14645f.m13292a(m18329c);
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.request.n.2
            @Override // java.lang.Runnable
            public void run() {
                C3736n.this.f14651l = C3736n.f14643d.m13150a();
                C3736n.this.f14651l.a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.ads.internal.request.n.2.1
                    @Override // com.google.android.gms.internal.acr.AbstractC6193c
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo12764a(AbstractC7980wy abstractC7980wy) {
                        try {
                            abstractC7980wy.mo13111a("AFMA_getAdapterLessMediationAd", m26989a);
                        } catch (Exception e) {
                            abr.b("Error requesting an ad url", e);
                            C3736n.f14645f.m13290b(m18329c);
                        }
                    }
                }, new acr.AbstractC6191a() { // from class: com.google.android.gms.ads.internal.request.n.2.2
                    @Override // com.google.android.gms.internal.acr.AbstractC6191a
                    /* renamed from: a */
                    public void mo12763a() {
                        C3736n.f14645f.m13290b(m18329c);
                    }
                });
            }
        });
        try {
            JSONObject jSONObject = m13292a.get(f14640a - (C3779u.m26884k().mo16432b() - mo16432b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new AdResponseParcel(-1);
            }
            AdResponseParcel m18678a = aaf.m18678a(this.f14650k, adRequestInfoParcel, jSONObject.toString());
            return (m18678a.f14569e == -3 || !TextUtils.isEmpty(m18678a.f14567c)) ? m18678a : new AdResponseParcel(3);
        } catch (InterruptedException e) {
            return new AdResponseParcel(-1);
        } catch (CancellationException e2) {
            return new AdResponseParcel(-1);
        } catch (ExecutionException e3) {
            return new AdResponseParcel(0);
        } catch (TimeoutException e4) {
            return new AdResponseParcel(2);
        }
    }

    /* renamed from: a */
    private JSONObject m26989a(AdRequestInfoParcel adRequestInfoParcel, String str) {
        JSONObject m18677a;
        C3433a.C3434a c3434a;
        Bundle bundle = adRequestInfoParcel.f14487c.f13847c.getBundle("sdk_less_server_data");
        if (bundle == null || (m18677a = aaf.m18677a(this.f14650k, new aab().m18699a(adRequestInfoParcel).m18698a(C3779u.m26881n().m18601a(this.f14650k)))) == null) {
            return null;
        }
        try {
            c3434a = C3433a.m27869b(this.f14650k);
        } catch (C4516c | C4517d | IOException | IllegalStateException e) {
            abr.d("Cannot get advertising id info", e);
            c3434a = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", m18677a);
        hashMap.put(UriUtil.DATA_SCHEME, bundle);
        if (c3434a != null) {
            hashMap.put("adid", c3434a.m27865a());
            hashMap.put("lat", Integer.valueOf(c3434a.m27864b() ? 1 : 0));
        }
        try {
            return C3779u.m26890e().m18343a(hashMap);
        } catch (JSONException e2) {
            return null;
        }
    }

    /* renamed from: a */
    protected static void m26986a(AbstractC7944wu abstractC7944wu) {
        abstractC7944wu.a("/loadAd", f14645f);
        abstractC7944wu.a("/fetchHttpRequest", f14644e);
        abstractC7944wu.a("/invalidRequest", f14646g);
    }

    /* renamed from: b */
    protected static void m26984b(AbstractC7944wu abstractC7944wu) {
        abstractC7944wu.b("/loadAd", f14645f);
        abstractC7944wu.b("/fetchHttpRequest", f14644e);
        abstractC7944wu.b("/invalidRequest", f14646g);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        abr.a("SdkLessAdLoaderBackgroundTask started.");
        AdRequestInfoParcel adRequestInfoParcel = new AdRequestInfoParcel(this.f14648i, null, -1L);
        AdResponseParcel m26990a = m26990a(adRequestInfoParcel);
        final abi.C6129a c6129a = new abi.C6129a(adRequestInfoParcel, m26990a, null, null, m26990a.f14569e, C3779u.m26884k().mo16432b(), m26990a.f14578n, null);
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.request.n.1
            @Override // java.lang.Runnable
            public void run() {
                C3736n.this.f14647h.mo27033a(c6129a);
                if (C3736n.this.f14651l != null) {
                    C3736n.this.f14651l.m13133v_();
                    C3736n.this.f14651l = null;
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
        synchronized (this.f14649j) {
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.request.n.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C3736n.this.f14651l != null) {
                        C3736n.this.f14651l.m13133v_();
                        C3736n.this.f14651l = null;
                    }
                }
            });
        }
    }
}
