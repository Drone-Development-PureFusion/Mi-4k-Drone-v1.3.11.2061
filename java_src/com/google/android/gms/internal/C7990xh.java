package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.xh */
/* loaded from: classes.dex */
public final class C7990xh {

    /* renamed from: a */
    public final List<C7989xg> f26232a;

    /* renamed from: b */
    public final long f26233b;

    /* renamed from: c */
    public final List<String> f26234c;

    /* renamed from: d */
    public final List<String> f26235d;

    /* renamed from: e */
    public final List<String> f26236e;

    /* renamed from: f */
    public final List<String> f26237f;

    /* renamed from: g */
    public final boolean f26238g;

    /* renamed from: h */
    public final String f26239h;

    /* renamed from: i */
    public final long f26240i;

    /* renamed from: j */
    public final String f26241j;

    /* renamed from: k */
    public final int f26242k;

    /* renamed from: l */
    public final int f26243l;

    /* renamed from: m */
    public final long f26244m;

    /* renamed from: n */
    public final boolean f26245n;

    /* renamed from: o */
    public int f26246o;

    /* renamed from: p */
    public int f26247p;

    public C7990xh(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (abr.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            abr.m18409e(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            C7989xg c7989xg = new C7989xg(jSONArray.getJSONObject(i2));
            arrayList.add(c7989xg);
            if (i < 0 && m13107a(c7989xg)) {
                i = i2;
            }
        }
        this.f26246o = i;
        this.f26247p = jSONArray.length();
        this.f26232a = Collections.unmodifiableList(arrayList);
        this.f26239h = jSONObject.getString("qdata");
        this.f26243l = jSONObject.optInt("fs_model_type", -1);
        this.f26244m = jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.f26233b = -1L;
            this.f26234c = null;
            this.f26235d = null;
            this.f26236e = null;
            this.f26237f = null;
            this.f26240i = -1L;
            this.f26241j = null;
            this.f26242k = 0;
            this.f26245n = false;
            this.f26238g = false;
            return;
        }
        this.f26233b = optJSONObject.optLong("ad_network_timeout_millis", -1L);
        this.f26234c = C3779u.m26871x().m13070a(optJSONObject, "click_urls");
        this.f26235d = C3779u.m26871x().m13070a(optJSONObject, "imp_urls");
        this.f26236e = C3779u.m26871x().m13070a(optJSONObject, "nofill_urls");
        this.f26237f = C3779u.m26871x().m13070a(optJSONObject, "remote_ping_urls");
        this.f26238g = optJSONObject.optBoolean("render_in_browser", false);
        long optLong = optJSONObject.optLong("refresh", -1L);
        this.f26240i = optLong > 0 ? optLong * 1000 : -1L;
        RewardItemParcel m26948a = RewardItemParcel.m26948a(optJSONObject.optJSONArray("rewards"));
        if (m26948a == null) {
            this.f26241j = null;
            this.f26242k = 0;
        } else {
            this.f26241j = m26948a.f14674b;
            this.f26242k = m26948a.f14675c;
        }
        this.f26245n = optJSONObject.optBoolean("use_displayed_impression", false);
    }

    public C7990xh(List<C7989xg> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f26232a = list;
        this.f26233b = j;
        this.f26234c = list2;
        this.f26235d = list3;
        this.f26236e = list4;
        this.f26237f = list5;
        this.f26238g = z;
        this.f26239h = str;
        this.f26240i = j2;
        this.f26246o = i;
        this.f26247p = i2;
        this.f26241j = str2;
        this.f26242k = i3;
        this.f26243l = i4;
        this.f26244m = j3;
        this.f26245n = z2;
    }

    /* renamed from: a */
    private boolean m13107a(C7989xg c7989xg) {
        for (String str : c7989xg.f26218c) {
            if (str.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
