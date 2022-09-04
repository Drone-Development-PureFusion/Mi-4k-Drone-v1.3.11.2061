package com.baidu.tts.client.model;

import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.tools.JsonTool;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class LibEngineParams {

    /* renamed from: a */
    private String f2638a;

    /* renamed from: b */
    private String f2639b;

    /* renamed from: c */
    private String[] f2640c;

    /* renamed from: d */
    private String[] f2641d;

    /* renamed from: e */
    private String[] f2642e;

    public LibEngineParams(String str) {
        this.f2638a = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2639b = jSONObject.optString(EnumC1175g.VERSION.m36317b());
            this.f2640c = JsonTool.getStringarray(jSONObject.optJSONArray(EnumC1175g.DOMAIN.m36317b()));
            this.f2641d = JsonTool.getStringarray(jSONObject.optJSONArray(EnumC1175g.LANGUAGE.m36317b()));
            this.f2642e = JsonTool.getStringarray(jSONObject.optJSONArray(EnumC1175g.QUALITY.m36317b()));
        } catch (Exception e) {
        }
    }

    public String[] getDomain() {
        return this.f2640c;
    }

    public JSONObject getJsonResult() {
        try {
            return new JSONObject(this.f2638a);
        } catch (JSONException e) {
            return null;
        }
    }

    public String[] getLanguage() {
        return this.f2641d;
    }

    public String[] getQuality() {
        return this.f2642e;
    }

    public String getResult() {
        return this.f2638a;
    }

    public String getVersion() {
        return this.f2639b;
    }

    public void setDomain(String[] strArr) {
        this.f2640c = strArr;
    }

    public void setLanguage(String[] strArr) {
        this.f2641d = strArr;
    }

    public void setQuality(String[] strArr) {
        this.f2642e = strArr;
    }

    public void setVersion(String str) {
        this.f2639b = str;
    }
}
