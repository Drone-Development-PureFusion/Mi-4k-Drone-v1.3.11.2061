package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.C3779u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public class abk {

    /* renamed from: a */
    private final long f20942a;

    /* renamed from: d */
    private String f20945d;

    /* renamed from: e */
    private String f20946e;

    /* renamed from: b */
    private final List<String> f20943b = new ArrayList();

    /* renamed from: c */
    private final Map<String, C6132b> f20944c = new HashMap();

    /* renamed from: f */
    private boolean f20947f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.abk$a */
    /* loaded from: classes2.dex */
    public class C6131a {

        /* renamed from: b */
        private final List<String> f20949b;

        /* renamed from: c */
        private final Bundle f20950c;

        public C6131a(List<String> list, Bundle bundle) {
            this.f20949b = list;
            this.f20950c = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.abk$b */
    /* loaded from: classes2.dex */
    public class C6132b {

        /* renamed from: a */
        final List<C6131a> f20951a = new ArrayList();

        C6132b() {
        }

        /* renamed from: a */
        public void m18465a(C6131a c6131a) {
            this.f20951a.add(c6131a);
        }
    }

    public abk(String str, long j) {
        this.f20946e = str;
        this.f20942a = j;
        m18470a(str);
    }

    /* renamed from: a */
    private void m18470a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("status", -1) != 1) {
                this.f20947f = false;
                abr.d("App settings could not be fetched successfully.");
                return;
            }
            this.f20947f = true;
            this.f20945d = jSONObject.optString("app_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                m18469a(optJSONArray.getJSONObject(i));
            }
        } catch (JSONException e) {
            abr.d("Exception occurred while processing app setting json", e);
            C3779u.m26886i().m18451a(e, "AppSettings.parseAppSettingsJson");
        }
    }

    /* renamed from: a */
    private void m18469a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject jSONObject2;
        JSONArray optJSONArray2;
        String optString = jSONObject.optString(FimiMediaMeta.IJKM_KEY_FORMAT);
        String optString2 = jSONObject.optString("ad_unit_id");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return;
        }
        if ("interstitial".equalsIgnoreCase(optString)) {
            this.f20943b.add(optString2);
        } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject.optJSONObject("mediation_config")) != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
            for (int i = 0; i < optJSONArray.length() && (optJSONArray2 = (jSONObject2 = optJSONArray.getJSONObject(i)).optJSONArray("adapters")) != null; i++) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList.add(optJSONArray2.getString(i2));
                }
                JSONObject optJSONObject2 = jSONObject2.optJSONObject(UriUtil.DATA_SCHEME);
                if (optJSONObject2 == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, optJSONObject2.getString(next));
                }
                C6131a c6131a = new C6131a(arrayList, bundle);
                C6132b c6132b = this.f20944c.containsKey(optString2) ? this.f20944c.get(optString2) : new C6132b();
                c6132b.m18465a(c6131a);
                this.f20944c.put(optString2, c6132b);
            }
        }
    }

    /* renamed from: a */
    public long m18471a() {
        return this.f20942a;
    }

    /* renamed from: b */
    public boolean m18468b() {
        return this.f20947f;
    }

    /* renamed from: c */
    public String m18467c() {
        return this.f20946e;
    }

    /* renamed from: d */
    public String m18466d() {
        return this.f20945d;
    }
}
