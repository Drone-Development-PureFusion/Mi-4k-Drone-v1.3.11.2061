package com.baidu.tts.client.model;

import com.baidu.tts.p102f.EnumC1175g;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ModelInfo {

    /* renamed from: a */
    private String f2653a;

    /* renamed from: b */
    private String f2654b;

    /* renamed from: c */
    private String f2655c;

    /* renamed from: d */
    private String f2656d;

    /* renamed from: e */
    private String f2657e;

    /* renamed from: f */
    private String f2658f;

    /* renamed from: g */
    private String f2659g;

    /* renamed from: h */
    private String f2660h;

    /* renamed from: i */
    private String f2661i;

    /* renamed from: j */
    private String f2662j;

    /* renamed from: k */
    private String f2663k;

    public String getDomain() {
        return this.f2660h;
    }

    public String getGender() {
        return this.f2658f;
    }

    public String getLanguage() {
        return this.f2657e;
    }

    public String getName() {
        return this.f2654b;
    }

    public String getQuality() {
        return this.f2661i;
    }

    public String getServerId() {
        return this.f2653a;
    }

    public String getSpeaker() {
        return this.f2659g;
    }

    public String getSpeechDataId() {
        return this.f2663k;
    }

    public String getTextDataId() {
        return this.f2662j;
    }

    public String getVersionMax() {
        return this.f2656d;
    }

    public String getVersionMin() {
        return this.f2655c;
    }

    public void parseJson(JSONObject jSONObject) {
        this.f2653a = jSONObject.optString(EnumC1175g.ID.m36317b());
        this.f2654b = jSONObject.optString(EnumC1175g.NAME.m36317b());
        this.f2655c = jSONObject.optString(EnumC1175g.VERSION_MIN.m36317b());
        this.f2656d = jSONObject.optString(EnumC1175g.VERSION_MAX.m36317b());
        this.f2657e = jSONObject.optString(EnumC1175g.LANGUAGE.m36317b());
        this.f2658f = jSONObject.optString(EnumC1175g.GENDER.m36317b());
        this.f2659g = jSONObject.optString(EnumC1175g.SPEAKER.m36317b());
        this.f2660h = jSONObject.optString(EnumC1175g.DOMAIN.m36317b());
        this.f2661i = jSONObject.optString(EnumC1175g.QUALITY.m36317b());
        this.f2662j = jSONObject.optString(EnumC1175g.TEXT_DATA_ID.m36317b());
        this.f2663k = jSONObject.optString(EnumC1175g.SPEECH_DATA_ID.m36317b());
    }

    public void setDomain(String str) {
        this.f2660h = str;
    }

    public void setGender(String str) {
        this.f2658f = str;
    }

    public void setLanguage(String str) {
        this.f2657e = str;
    }

    public void setMap(Map<String, String> map) {
        if (map != null) {
            this.f2653a = map.get(EnumC1175g.ID.m36317b());
            this.f2654b = map.get(EnumC1175g.NAME.m36317b());
            this.f2655c = map.get(EnumC1175g.VERSION_MIN.m36317b());
            this.f2656d = map.get(EnumC1175g.VERSION_MAX.m36317b());
            this.f2657e = map.get(EnumC1175g.LANGUAGE.m36317b());
            this.f2658f = map.get(EnumC1175g.GENDER.m36317b());
            this.f2659g = map.get(EnumC1175g.SPEAKER.m36317b());
            this.f2660h = map.get(EnumC1175g.DOMAIN.m36317b());
            this.f2661i = map.get(EnumC1175g.QUALITY.m36317b());
            this.f2662j = map.get(EnumC1175g.TEXT_DATA_ID.m36317b());
            this.f2663k = map.get(EnumC1175g.SPEECH_DATA_ID.m36317b());
        }
    }

    public void setName(String str) {
        this.f2654b = str;
    }

    public void setQuality(String str) {
        this.f2661i = str;
    }

    public void setServerId(String str) {
        this.f2653a = str;
    }

    public void setSpeaker(String str) {
        this.f2659g = str;
    }

    public void setSpeechDataId(String str) {
        this.f2663k = str;
    }

    public void setTextDataId(String str) {
        this.f2662j = str;
    }

    public void setVersionMax(String str) {
        this.f2656d = str;
    }

    public void setVersionMin(String str) {
        this.f2655c = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(EnumC1175g.ID.m36317b(), this.f2653a);
            jSONObject.putOpt(EnumC1175g.NAME.m36317b(), this.f2654b);
            jSONObject.putOpt(EnumC1175g.VERSION_MIN.m36317b(), this.f2655c);
            jSONObject.putOpt(EnumC1175g.VERSION_MAX.m36317b(), this.f2656d);
            jSONObject.putOpt(EnumC1175g.LANGUAGE.m36317b(), this.f2657e);
            jSONObject.putOpt(EnumC1175g.GENDER.m36317b(), this.f2658f);
            jSONObject.putOpt(EnumC1175g.SPEAKER.m36317b(), this.f2659g);
            jSONObject.putOpt(EnumC1175g.DOMAIN.m36317b(), this.f2660h);
            jSONObject.putOpt(EnumC1175g.QUALITY.m36317b(), this.f2661i);
            jSONObject.putOpt(EnumC1175g.TEXT_DATA_ID.m36317b(), this.f2662j);
            jSONObject.putOpt(EnumC1175g.SPEECH_DATA_ID.m36317b(), this.f2663k);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
