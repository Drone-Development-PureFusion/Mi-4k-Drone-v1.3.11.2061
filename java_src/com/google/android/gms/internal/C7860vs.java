package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.formats.AbstractC3601g;
import com.google.android.gms.ads.internal.overlay.AbstractC3667m;
import com.google.android.gms.ads.internal.overlay.BinderC3649d;
import com.google.android.gms.tagmanager.C9196e;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
import p005b.p006a.p007a.p029b.p052m.p053a.C0620k;
@aaa
/* renamed from: com.google.android.gms.internal.vs */
/* loaded from: classes.dex */
public final class C7860vs {

    /* renamed from: a */
    public static final AbstractC7877vt f25985a = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.1
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
        }
    };

    /* renamed from: b */
    public static final AbstractC7877vt f25986b = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.16
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            String str = map.get("urls");
            if (TextUtils.isEmpty(str)) {
                abr.d("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            HashMap hashMap = new HashMap();
            PackageManager packageManager = acyVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
            }
            acyVar.mo18107a("openableURLs", hashMap);
        }
    };

    /* renamed from: c */
    public static final AbstractC7877vt f25987c = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.2
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            PackageManager packageManager = acyVar.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject(map.get(UriUtil.DATA_SCHEME)).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id");
                            String optString2 = jSONObject2.optString("u");
                            String optString3 = jSONObject2.optString(C0620k.f1083a);
                            String optString4 = jSONObject2.optString(C0548a.f931b);
                            String optString5 = jSONObject2.optString("p");
                            String optString6 = jSONObject2.optString("c");
                            jSONObject2.optString("f");
                            jSONObject2.optString("e");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                            try {
                                jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                            } catch (JSONException e) {
                                abr.b("Error constructing openable urls response.", e);
                            }
                        } catch (JSONException e2) {
                            abr.b("Error parsing the intent data.", e2);
                        }
                    }
                    acyVar.b("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    acyVar.b("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                acyVar.b("openableIntents", new JSONObject());
            }
        }
    };

    /* renamed from: d */
    public static final AbstractC7877vt f25988d = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.3
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            Uri uri;
            C7667ro mo18082n;
            String str = map.get("u");
            if (str == null) {
                abr.d("URL missing from click GMSG.");
                return;
            }
            Uri parse = Uri.parse(str);
            try {
                mo18082n = acyVar.mo18082n();
            } catch (C7668rp e) {
                String valueOf = String.valueOf(str);
                abr.d(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
            }
            if (mo18082n != null && mo18082n.m13781c(parse)) {
                uri = mo18082n.m13790a(parse, acyVar.getContext(), acyVar.mo18105b());
                Future future = (Future) new acg(acyVar.getContext(), acyVar.mo18081o().f14733b, uri.toString()).mo12820e();
            }
            uri = parse;
            Future future2 = (Future) new acg(acyVar.getContext(), acyVar.mo18081o().f14733b, uri.toString()).mo12820e();
        }
    };

    /* renamed from: e */
    public static final AbstractC7877vt f25989e = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.4
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            BinderC3649d mo18087i = acyVar.mo18087i();
            if (mo18087i != null) {
                mo18087i.m27233a();
                return;
            }
            BinderC3649d mo18086j = acyVar.mo18086j();
            if (mo18086j != null) {
                mo18086j.m27233a();
            } else {
                abr.d("A GMSG tried to close something that wasn't an overlay.");
            }
        }
    };

    /* renamed from: f */
    public static final AbstractC7877vt f25990f = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.5
        /* renamed from: a */
        private void m13314a(acy acyVar) {
            AbstractC3667m abstractC3667m;
            abr.c("Received support message, responding.");
            boolean z = false;
            C3588d mo18088h = acyVar.mo18088h();
            if (mo18088h != null && (abstractC3667m = mo18088h.f14061c) != null) {
                z = abstractC3667m.mo27161a(acyVar.getContext());
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C9196e.f29004b, "checkSupport");
                jSONObject.put("supports", z);
                acyVar.b("appStreaming", jSONObject);
            } catch (Throwable th) {
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            if ("checkSupport".equals(map.get(AuthActivity.ACTION_KEY))) {
                m13314a(acyVar);
                return;
            }
            BinderC3649d mo18087i = acyVar.mo18087i();
            if (mo18087i == null) {
                return;
            }
            mo18087i.m27229a(acyVar, map);
        }
    };

    /* renamed from: g */
    public static final AbstractC7877vt f25991g = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.6
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            acyVar.mo18100b("1".equals(map.get("custom_close")));
        }
    };

    /* renamed from: h */
    public static final AbstractC7877vt f25992h = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.7
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            String str = map.get("u");
            if (str == null) {
                abr.d("URL missing from httpTrack GMSG.");
            } else {
                Future future = (Future) new acg(acyVar.getContext(), acyVar.mo18081o().f14733b, str).mo12820e();
            }
        }
    };

    /* renamed from: i */
    public static final AbstractC7877vt f25993i = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.8
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            String valueOf = String.valueOf(map.get("string"));
            abr.c(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
        }
    };

    /* renamed from: j */
    public static final AbstractC7877vt f25994j = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.9
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            AbstractC3601g mo18135G = acyVar.mo18135G();
            if (mo18135G != null) {
                mo18135G.mo27344a();
            }
        }
    };

    /* renamed from: k */
    public static final AbstractC7877vt f25995k = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.10
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            String str = map.get("tx");
            String str2 = map.get("ty");
            String str3 = map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                C7667ro mo18082n = acyVar.mo18082n();
                if (mo18082n == null) {
                    return;
                }
                mo18082n.m13793a().mo14124a(parseInt, parseInt2, parseInt3);
            } catch (NumberFormatException e) {
                abr.d("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: l */
    public static final AbstractC7877vt f25996l = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.11
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            if (!C7788uf.f25760aR.m13486c().booleanValue()) {
                return;
            }
            acyVar.mo18096c(!Boolean.parseBoolean(map.get("disabled")));
        }
    };

    /* renamed from: m */
    public static final AbstractC7877vt f25997m = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.12
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            String str = map.get(AuthActivity.ACTION_KEY);
            if ("pause".equals(str)) {
                acyVar.C();
            } else if (!"resume".equals(str)) {
            } else {
                acyVar.D();
            }
        }
    };

    /* renamed from: n */
    public static final AbstractC7877vt f25998n = new C7898we();

    /* renamed from: o */
    public static final AbstractC7877vt f25999o = new C7899wf();

    /* renamed from: p */
    public static final AbstractC7877vt f26000p = new C7907wj();

    /* renamed from: q */
    public static final AbstractC7877vt f26001q = new C7859vr();

    /* renamed from: r */
    public static final C7894wc f26002r = new C7894wc();

    /* renamed from: s */
    public static final AbstractC7877vt f26003s = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.13
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                acyVar.mo18084l().m18153i();
            } else if (map.keySet().contains("stop")) {
                acyVar.mo18084l().m18152j();
            } else if (!map.keySet().contains("cancel")) {
            } else {
                acyVar.mo18084l().m18151k();
            }
        }
    };

    /* renamed from: t */
    public static final AbstractC7877vt f26004t = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.14
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                acyVar.mo18093d(true);
            }
            if (map.keySet().contains("stop")) {
                acyVar.mo18093d(false);
            }
        }
    };

    /* renamed from: u */
    public static final AbstractC7877vt f26005u = new AbstractC7877vt() { // from class: com.google.android.gms.internal.vs.15
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            acyVar.mo18107a("locationReady", C3779u.m26890e().m18356a((View) acyVar, (WindowManager) acyVar.getContext().getSystemService("window")));
            abr.d("GET LOCATION COMPILED");
        }
    };
}
