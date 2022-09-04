package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.request.AbstractC3729k;
import com.google.android.gms.ads.internal.request.AbstractC3732l;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.C4692o;
import com.google.android.gms.internal.C7957wx;
import com.google.android.gms.internal.aao;
import com.google.android.gms.internal.acr;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import org.p286a.p287a.C11086e;
@aaa
/* loaded from: classes.dex */
public final class aae extends AbstractC3729k.AbstractBinderC3730a {

    /* renamed from: a */
    private static final Object f20667a = new Object();

    /* renamed from: b */
    private static aae f20668b;

    /* renamed from: c */
    private final Context f20669c;

    /* renamed from: d */
    private final aad f20670d;

    /* renamed from: e */
    private final C7775ty f20671e;

    /* renamed from: f */
    private final C7957wx f20672f;

    aae(Context context, C7775ty c7775ty, aad aadVar) {
        this.f20669c = context;
        this.f20670d = aadVar;
        this.f20671e = c7775ty;
        this.f20672f = new C7957wx(context.getApplicationContext() != null ? context.getApplicationContext() : context, VersionInfoParcel.m26868a(), c7775ty.m13496a(), new aca<AbstractC7944wu>() { // from class: com.google.android.gms.internal.aae.4
            @Override // com.google.android.gms.internal.aca
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo12761a(AbstractC7944wu abstractC7944wu) {
                abstractC7944wu.a("/log", C7860vs.f25993i);
            }
        }, new C7957wx.C7969b());
    }

    /* renamed from: a */
    private static Location m18685a(aco<Location> acoVar) {
        try {
            return acoVar.get(C7788uf.f25821bZ.m13486c().longValue(), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            abr.d("Exception caught while getting location", e);
            return null;
        }
    }

    /* renamed from: a */
    private static AdResponseParcel m18689a(final Context context, final C7957wx c7957wx, C7775ty c7775ty, final aad aadVar, final AdRequestInfoParcel adRequestInfoParcel) {
        Bundle bundle;
        aco acoVar;
        String string;
        abr.a("Starting ad request from service using: AFMA_getAd");
        C7788uf.m13470a(context);
        aco<Bundle> mo12859a = aadVar.f20665i.mo12859a();
        final C7801un c7801un = new C7801un(C7788uf.f25729N.m13486c().booleanValue(), "load_ad", adRequestInfoParcel.f14488d.f13864b);
        if (adRequestInfoParcel.f14485a > 10 && adRequestInfoParcel.f14470B != -1) {
            c7801un.m13436a(c7801un.m13438a(adRequestInfoParcel.f14470B), "cts");
        }
        C7799ul m13439a = c7801un.m13439a();
        final Bundle bundle2 = (adRequestInfoParcel.f14485a < 4 || adRequestInfoParcel.f14499o == null) ? null : adRequestInfoParcel.f14499o;
        if (!C7788uf.f25738W.m13486c().booleanValue() || aadVar.f20657a == null) {
            bundle = bundle2;
            acoVar = null;
        } else {
            if (bundle2 == null && C7788uf.f25739X.m13486c().booleanValue()) {
                abr.m18409e("contentInfo is not present, but we'll still launch the app index task");
                bundle2 = new Bundle();
            }
            if (bundle2 != null) {
                bundle = bundle2;
                acoVar = abu.m18389a(new Callable<Void>() { // from class: com.google.android.gms.internal.aae.1
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a */
                    public Void call() {
                        aad.this.f20657a.m18620a(context, adRequestInfoParcel.f14491g.packageName, bundle2);
                        return null;
                    }
                });
            } else {
                bundle = bundle2;
                acoVar = null;
            }
        }
        acm acmVar = new acm(null);
        Bundle bundle3 = adRequestInfoParcel.f14487c.f13847c;
        acm mo13108a = (!adRequestInfoParcel.f14477I || (bundle3 != null && bundle3.getString("_ad") != null)) ? acmVar : aadVar.f20662f.mo13108a(adRequestInfoParcel.f14490f);
        aak m18601a = C3779u.m26881n().m18601a(context);
        if (m18601a.f20762m == -1) {
            abr.a("Device is offline.");
            return new AdResponseParcel(2);
        }
        String uuid = adRequestInfoParcel.f14485a >= 7 ? adRequestInfoParcel.f14507w : UUID.randomUUID().toString();
        final aag aagVar = new aag(uuid, adRequestInfoParcel.f14490f.packageName);
        if (adRequestInfoParcel.f14487c.f13847c != null && (string = adRequestInfoParcel.f14487c.f13847c.getString("_ad")) != null) {
            return aaf.m18678a(context, adRequestInfoParcel, string);
        }
        List<String> mo13495a = aadVar.f20660d.mo13495a(adRequestInfoParcel);
        String mo18487a = aadVar.f20666j.mo18487a(adRequestInfoParcel);
        aao.C6117a mo18595a = aadVar.f20664h.mo18595a(context);
        if (acoVar != null) {
            try {
                abr.m18409e("Waiting for app index fetching task.");
                acoVar.get(C7788uf.f25740Y.m13486c().longValue(), TimeUnit.MILLISECONDS);
                abr.m18409e("App index fetching task completed.");
            } catch (InterruptedException e) {
                e = e;
                abr.d("Failed to fetch app index signal", e);
            } catch (ExecutionException e2) {
                e = e2;
                abr.d("Failed to fetch app index signal", e);
            } catch (TimeoutException e3) {
                abr.a("Timed out waiting for app index fetching task");
            }
        }
        String mo18488a = aadVar.f20659c.mo18488a(adRequestInfoParcel.f14491g.packageName);
        m18683b(mo12859a);
        JSONObject m18677a = aaf.m18677a(context, new aab().m18699a(adRequestInfoParcel).m18698a(m18601a).m18697a(mo18595a).m18701a(m18685a(mo13108a)).m18700a(m18683b(mo12859a)).m18696a(mo18487a).m18695a(mo13495a).m18693b(bundle).m18692b(mo18488a).m18694a(aadVar.f20658b.mo27641a(context)));
        if (m18677a == null) {
            return new AdResponseParcel(0);
        }
        if (adRequestInfoParcel.f14485a < 7) {
            try {
                m18677a.put("request_id", uuid);
            } catch (JSONException e4) {
            }
        }
        try {
            m18677a.put("prefetch_mode", "url");
        } catch (JSONException e5) {
            abr.d("Failed putting prefetch parameters to ad request.", e5);
        }
        final String jSONObject = m18677a.toString();
        c7801un.m13436a(m13439a, "arc");
        final C7799ul m13439a2 = c7801un.m13439a();
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.aae.2
            @Override // java.lang.Runnable
            public void run() {
                C7957wx.C7970c m13150a = C7957wx.this.m13150a();
                aagVar.m18662a(m13150a);
                c7801un.m13436a(m13439a2, "rwc");
                final C7799ul m13439a3 = c7801un.m13439a();
                m13150a.a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.aae.2.1
                    @Override // com.google.android.gms.internal.acr.AbstractC6193c
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo12764a(AbstractC7980wy abstractC7980wy) {
                        c7801un.m13436a(m13439a3, "jsf");
                        c7801un.m13432b();
                        abstractC7980wy.mo13113a("/invalidRequest", aagVar.f20695b);
                        abstractC7980wy.mo13113a("/loadAdURL", aagVar.f20696c);
                        abstractC7980wy.mo13113a("/loadAd", aagVar.f20697d);
                        try {
                            abstractC7980wy.mo13112a("AFMA_getAd", jSONObject);
                        } catch (Exception e6) {
                            abr.b("Error requesting an ad url", e6);
                        }
                    }
                }, new acr.AbstractC6191a() { // from class: com.google.android.gms.internal.aae.2.2
                    @Override // com.google.android.gms.internal.acr.AbstractC6191a
                    /* renamed from: a */
                    public void mo12763a() {
                    }
                });
            }
        });
        try {
            aaj aajVar = aagVar.m18661b().get(10L, TimeUnit.SECONDS);
            if (aajVar == null) {
                return new AdResponseParcel(0);
            }
            if (aajVar.m18619a() != -2) {
                return new AdResponseParcel(aajVar.m18619a());
            }
            if (c7801un.m13429e() != null) {
                c7801un.m13436a(c7801un.m13429e(), "rur");
            }
            AdResponseParcel adResponseParcel = null;
            if (!TextUtils.isEmpty(aajVar.m18609h())) {
                adResponseParcel = aaf.m18678a(context, adRequestInfoParcel, aajVar.m18609h());
            }
            if (adResponseParcel == null && !TextUtils.isEmpty(aajVar.m18613d())) {
                adResponseParcel = m18687a(adRequestInfoParcel, context, adRequestInfoParcel.f14495k.f14733b, aajVar.m18613d(), mo18488a, aajVar, c7801un, aadVar);
            }
            if (adResponseParcel == null) {
                adResponseParcel = new AdResponseParcel(0);
            }
            c7801un.m13436a(m13439a, "tts");
            adResponseParcel.f14589y = c7801un.m13431c();
            return adResponseParcel;
        } catch (Exception e6) {
            return new AdResponseParcel(0);
        } finally {
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.aae.3
                @Override // java.lang.Runnable
                public void run() {
                    aad.this.f20661e.mo18598a(context, aagVar, adRequestInfoParcel.f14495k);
                }
            });
        }
    }

    /* renamed from: a */
    public static AdResponseParcel m18687a(AdRequestInfoParcel adRequestInfoParcel, Context context, String str, String str2, String str3, aaj aajVar, C7801un c7801un, aad aadVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        C7799ul m13439a = c7801un != null ? c7801un.m13439a() : null;
        try {
            aah aahVar = new aah(adRequestInfoParcel);
            String valueOf = String.valueOf(str2);
            abr.a(valueOf.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str2);
            long mo16432b = C3779u.m26884k().mo16432b();
            int i = 0;
            URL url2 = url;
            while (true) {
                if (aadVar != null) {
                    aadVar.f20663g.mo18597a();
                }
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                C3779u.m26890e().m18367a(context, str, false, httpURLConnection);
                if (!TextUtils.isEmpty(str3) && aajVar.m18611f()) {
                    httpURLConnection.addRequestProperty("x-afma-drt-cookie", str3);
                }
                String str4 = adRequestInfoParcel.f14478J;
                if (!TextUtils.isEmpty(str4)) {
                    abr.a("Sending webview cookie in ad request header.");
                    httpURLConnection.addRequestProperty("Cookie", str4);
                }
                if (aajVar != null && !TextUtils.isEmpty(aajVar.m18615c())) {
                    httpURLConnection.setDoOutput(true);
                    byte[] bytes = aajVar.m18615c().getBytes();
                    httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = null;
                    }
                    try {
                        bufferedOutputStream.write(bytes);
                        C4692o.m23124a(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C4692o.m23124a(bufferedOutputStream);
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (responseCode >= 200 && responseCode < 300) {
                    String url3 = url2.toString();
                    try {
                        inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = null;
                    }
                    try {
                        String m18350a = C3779u.m26890e().m18350a(inputStreamReader);
                        C4692o.m23124a(inputStreamReader);
                        m18684a(url3, headerFields, m18350a, responseCode);
                        aahVar.m18651a(url3, headerFields, m18350a);
                        if (c7801un != null) {
                            c7801un.m13436a(m13439a, "ufe");
                        }
                        AdResponseParcel m18652a = aahVar.m18652a(mo16432b);
                        httpURLConnection.disconnect();
                        if (aadVar != null) {
                            aadVar.f20663g.mo18596b();
                        }
                        return m18652a;
                    } catch (Throwable th4) {
                        th = th4;
                        C4692o.m23124a(inputStreamReader);
                        throw th;
                    }
                }
                m18684a(url2.toString(), headerFields, null, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField(C11086e.f35686H);
                if (TextUtils.isEmpty(headerField)) {
                    abr.d("No location header to follow redirect.");
                    AdResponseParcel adResponseParcel = new AdResponseParcel(0);
                    httpURLConnection.disconnect();
                    if (aadVar != null) {
                        aadVar.f20663g.mo18596b();
                    }
                    return adResponseParcel;
                }
                URL url4 = new URL(headerField);
                int i2 = i + 1;
                if (i2 > 5) {
                    abr.d("Too many redirects.");
                    AdResponseParcel adResponseParcel2 = new AdResponseParcel(0);
                    httpURLConnection.disconnect();
                    if (aadVar != null) {
                        aadVar.f20663g.mo18596b();
                    }
                    return adResponseParcel2;
                }
                aahVar.m18650a(headerFields);
                httpURLConnection.disconnect();
                if (aadVar != null) {
                    aadVar.f20663g.mo18596b();
                }
                i = i2;
                url2 = url4;
            }
            abr.d(new StringBuilder(46).append("Received error HTTP response code: ").append(responseCode).toString());
            AdResponseParcel adResponseParcel3 = new AdResponseParcel(0);
            httpURLConnection.disconnect();
            if (aadVar != null) {
                aadVar.f20663g.mo18596b();
            }
            return adResponseParcel3;
        } catch (IOException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            abr.d(valueOf2.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf2) : new String("Error while connecting to ad server: "));
            return new AdResponseParcel(2);
        }
    }

    /* renamed from: a */
    public static aae m18690a(Context context, C7775ty c7775ty, aad aadVar) {
        aae aaeVar;
        synchronized (f20667a) {
            if (f20668b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                f20668b = new aae(context, c7775ty, aadVar);
            }
            aaeVar = f20668b;
        }
        return aaeVar;
    }

    /* renamed from: a */
    private static void m18684a(String str, Map<String, List<String>> map, String str2, int i) {
        if (abr.a(2)) {
            abr.m18409e(new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:").toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    abr.m18409e(new StringBuilder(String.valueOf(str3).length() + 5).append("    ").append(str3).append(":").toString());
                    for (String str4 : map.get(str3)) {
                        String valueOf = String.valueOf(str4);
                        abr.m18409e(valueOf.length() != 0 ? "      ".concat(valueOf) : new String("      "));
                    }
                }
            }
            abr.m18409e("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    abr.m18409e(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                abr.m18409e("    null");
            }
            abr.m18409e(new StringBuilder(34).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    /* renamed from: b */
    private static Bundle m18683b(aco<Bundle> acoVar) {
        Bundle bundle = new Bundle();
        try {
            return acoVar.get(C7788uf.f25876cq.m13486c().longValue(), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            abr.d("Exception caught while getting parental controls.", e);
            return bundle;
        }
    }

    @Override // com.google.android.gms.ads.internal.request.AbstractC3729k
    /* renamed from: a */
    public AdResponseParcel mo18688a(AdRequestInfoParcel adRequestInfoParcel) {
        return m18689a(this.f20669c, this.f20672f, this.f20671e, this.f20670d, adRequestInfoParcel);
    }

    @Override // com.google.android.gms.ads.internal.request.AbstractC3729k
    /* renamed from: a */
    public void mo18686a(final AdRequestInfoParcel adRequestInfoParcel, final AbstractC3732l abstractC3732l) {
        C3779u.m26886i().m18460a(this.f20669c, adRequestInfoParcel.f14495k);
        abu.m18391a(new Runnable() { // from class: com.google.android.gms.internal.aae.5
            @Override // java.lang.Runnable
            public void run() {
                AdResponseParcel adResponseParcel;
                try {
                    adResponseParcel = aae.this.mo18688a(adRequestInfoParcel);
                } catch (Exception e) {
                    C3779u.m26886i().m18451a(e, "AdRequestServiceImpl.loadAdAsync");
                    abr.d("Could not fetch ad response due to an Exception.", e);
                    adResponseParcel = null;
                }
                if (adResponseParcel == null) {
                    adResponseParcel = new AdResponseParcel(0);
                }
                try {
                    abstractC3732l.mo26994a(adResponseParcel);
                } catch (RemoteException e2) {
                    abr.d("Fail to forward ad response.", e2);
                }
            }
        });
    }
}
