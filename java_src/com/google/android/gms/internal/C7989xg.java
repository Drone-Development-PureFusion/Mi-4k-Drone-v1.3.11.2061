package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.C3779u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.xg */
/* loaded from: classes.dex */
public final class C7989xg {

    /* renamed from: a */
    public final String f26216a;

    /* renamed from: b */
    public final String f26217b;

    /* renamed from: c */
    public final List<String> f26218c;

    /* renamed from: d */
    public final String f26219d;

    /* renamed from: e */
    public final String f26220e;

    /* renamed from: f */
    public final List<String> f26221f;

    /* renamed from: g */
    public final List<String> f26222g;

    /* renamed from: h */
    public final List<String> f26223h;

    /* renamed from: i */
    public final String f26224i;

    /* renamed from: j */
    public final List<String> f26225j;

    /* renamed from: k */
    public final List<String> f26226k;
    @Nullable

    /* renamed from: l */
    public final String f26227l;
    @Nullable

    /* renamed from: m */
    public final String f26228m;

    /* renamed from: n */
    public final String f26229n;
    @Nullable

    /* renamed from: o */
    public final List<String> f26230o;

    /* renamed from: p */
    public final String f26231p;

    public C7989xg(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, String str5, String str6, List<String> list4, List<String> list5, String str7, String str8, String str9, List<String> list6, String str10, List<String> list7) {
        this.f26216a = str;
        this.f26217b = str2;
        this.f26218c = list;
        this.f26219d = str3;
        this.f26220e = str4;
        this.f26221f = list2;
        this.f26222g = list3;
        this.f26224i = str5;
        this.f26225j = list4;
        this.f26226k = list5;
        this.f26227l = str7;
        this.f26228m = str8;
        this.f26229n = str9;
        this.f26230o = list6;
        this.f26231p = str10;
        this.f26223h = list7;
    }

    public C7989xg(JSONObject jSONObject) {
        String str = null;
        this.f26217b = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f26218c = Collections.unmodifiableList(arrayList);
        this.f26219d = jSONObject.optString("allocation_id", null);
        this.f26221f = C3779u.m26871x().m13070a(jSONObject, "clickurl");
        this.f26222g = C3779u.m26871x().m13070a(jSONObject, "imp_urls");
        this.f26223h = C3779u.m26871x().m13070a(jSONObject, "fill_urls");
        this.f26225j = C3779u.m26871x().m13070a(jSONObject, "video_start_urls");
        this.f26226k = C3779u.m26871x().m13070a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.f26216a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(UriUtil.DATA_SCHEME);
        this.f26224i = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f26220e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f26227l = jSONObject.optString("html_template", null);
        this.f26228m = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f26229n = optJSONObject3 != null ? optJSONObject3.toString() : null;
        this.f26230o = C3779u.m26871x().m13070a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f26231p = optJSONObject4 != null ? optJSONObject4.toString() : str;
    }
}
