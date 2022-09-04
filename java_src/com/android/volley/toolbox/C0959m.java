package com.android.volley.toolbox;

import com.android.volley.C0912j;
import com.android.volley.C0914l;
import com.android.volley.C0924p;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.android.volley.toolbox.m */
/* loaded from: classes.dex */
public class C0959m extends AbstractC0961o<JSONArray> {
    public C0959m(int i, String str, C0924p.AbstractC0926b<JSONArray> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        super(i, str, null, abstractC0926b, abstractC0925a);
    }

    public C0959m(int i, String str, String str2, C0924p.AbstractC0926b<JSONArray> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        super(i, str, str2, abstractC0926b, abstractC0925a);
    }

    public C0959m(int i, String str, JSONArray jSONArray, C0924p.AbstractC0926b<JSONArray> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        super(i, str, jSONArray == null ? null : jSONArray.toString(), abstractC0926b, abstractC0925a);
    }

    public C0959m(int i, String str, JSONObject jSONObject, C0924p.AbstractC0926b<JSONArray> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), abstractC0926b, abstractC0925a);
    }

    public C0959m(String str, C0924p.AbstractC0926b<JSONArray> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        super(0, str, null, abstractC0926b, abstractC0925a);
    }

    public C0959m(String str, JSONArray jSONArray, C0924p.AbstractC0926b<JSONArray> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        this(jSONArray == null ? 0 : 1, str, jSONArray, abstractC0926b, abstractC0925a);
    }

    public C0959m(String str, JSONObject jSONObject, C0924p.AbstractC0926b<JSONArray> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, abstractC0926b, abstractC0925a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.AbstractC0961o, com.android.volley.AbstractC0916n
    /* renamed from: a */
    public C0924p<JSONArray> mo34917a(C0912j c0912j) {
        try {
            return C0924p.m37382a(new JSONArray(new String(c0912j.f2015b, C0945h.m37328a(c0912j.f2016c, "utf-8"))), C0945h.m37331a(c0912j));
        } catch (UnsupportedEncodingException e) {
            return C0924p.m37383a(new C0914l(e));
        } catch (JSONException e2) {
            return C0924p.m37383a(new C0914l(e2));
        }
    }
}
