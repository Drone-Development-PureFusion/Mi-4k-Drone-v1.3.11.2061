package com.baidu.tts.client.model;

import android.content.Context;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.tools.ResourceTools;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ModelFileInfo {

    /* renamed from: a */
    private String f2647a;

    /* renamed from: b */
    private String f2648b;

    /* renamed from: c */
    private String f2649c;

    /* renamed from: d */
    private String f2650d;

    /* renamed from: e */
    private String f2651e;

    /* renamed from: f */
    private String f2652f;

    public void generateAbsPath(Context context) {
        this.f2651e = ResourceTools.getModelFileAbsName(context, this.f2650d);
    }

    public String getAbsPath() {
        return this.f2651e;
    }

    public String getLength() {
        return this.f2648b;
    }

    public String getMd5() {
        return this.f2649c;
    }

    public String getName() {
        return this.f2650d;
    }

    public String getServerid() {
        return this.f2647a;
    }

    public String getUrl() {
        return this.f2652f;
    }

    public void parseJson(JSONObject jSONObject) {
        this.f2647a = jSONObject.optString(EnumC1175g.ID.m36317b());
        this.f2648b = jSONObject.optString(EnumC1175g.LENGTH.m36317b());
        this.f2649c = jSONObject.optString(EnumC1175g.MD5.m36317b());
        this.f2650d = jSONObject.optString(EnumC1175g.NAME.m36317b());
        this.f2652f = jSONObject.optString(EnumC1175g.URL.m36317b());
    }

    public void setAbsPath(String str) {
        this.f2651e = str;
    }

    public void setLength(String str) {
        this.f2648b = str;
    }

    public void setMap(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f2647a = map.get(EnumC1175g.ID.m36317b());
        this.f2648b = map.get(EnumC1175g.LENGTH.m36317b());
        this.f2649c = map.get(EnumC1175g.MD5.m36317b());
        this.f2650d = map.get(EnumC1175g.NAME.m36317b());
        this.f2651e = map.get(EnumC1175g.ABS_PATH.m36317b());
    }

    public void setMd5(String str) {
        this.f2649c = str;
    }

    public void setName(String str) {
        this.f2650d = str;
    }

    public void setServerid(String str) {
        this.f2647a = str;
    }

    public void setUrl(String str) {
        this.f2652f = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(EnumC1175g.ID.m36317b(), this.f2647a);
            jSONObject.putOpt(EnumC1175g.LENGTH.m36317b(), this.f2648b);
            jSONObject.putOpt(EnumC1175g.MD5.m36317b(), this.f2649c);
            jSONObject.putOpt(EnumC1175g.NAME.m36317b(), this.f2650d);
            jSONObject.putOpt(EnumC1175g.ABS_PATH.m36317b(), this.f2651e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
