package com.baidu.tts.client.model;

import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.JsonTool;
import com.baidu.tts.tools.StringTool;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Conditions {

    /* renamed from: a */
    private Set<String> f2623a;

    /* renamed from: b */
    private String f2624b;

    /* renamed from: c */
    private Set<String> f2625c;

    /* renamed from: d */
    private Set<String> f2626d;

    /* renamed from: e */
    private Set<String> f2627e;

    /* renamed from: f */
    private Set<String> f2628f;

    /* renamed from: g */
    private Set<String> f2629g;

    public void appendDomain(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2628f == null) {
            this.f2628f = new HashSet();
        }
        this.f2628f.add(str);
    }

    public void appendGender(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2626d == null) {
            this.f2626d = new HashSet();
        }
        this.f2626d.add(str);
    }

    public void appendId(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2623a == null) {
            this.f2623a = new HashSet();
        }
        this.f2623a.add(str);
    }

    public void appendLanguage(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2625c == null) {
            this.f2625c = new HashSet();
        }
        this.f2625c.add(str);
    }

    public void appendQuality(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2629g == null) {
            this.f2629g = new HashSet();
        }
        this.f2629g.add(str);
    }

    public void appendSpeaker(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2627e == null) {
            this.f2627e = new HashSet();
        }
        this.f2627e.add(str);
    }

    public String[] getDomainArray() {
        return DataTool.fromSetToArray(this.f2628f);
    }

    public Set<String> getDomains() {
        return this.f2628f;
    }

    public String[] getGenderArray() {
        return DataTool.fromSetToArray(this.f2626d);
    }

    public JSONArray getGenderJA() {
        return JsonTool.fromSetToJson(this.f2626d);
    }

    public Set<String> getGenders() {
        return this.f2626d;
    }

    public JSONObject getJSONConditions() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(EnumC1175g.ID.m36317b(), JsonTool.fromSetToJson(this.f2623a));
            jSONObject.put(EnumC1175g.VERSION.m36317b(), this.f2624b);
            jSONObject.put(EnumC1175g.LANGUAGE.m36317b(), JsonTool.fromSetToJson(this.f2625c));
            jSONObject.put(EnumC1175g.GENDER.m36317b(), JsonTool.fromSetToJson(this.f2626d));
            jSONObject.put(EnumC1175g.SPEAKER.m36317b(), JsonTool.fromSetToJson(this.f2627e));
            jSONObject.put(EnumC1175g.DOMAIN.m36317b(), JsonTool.fromSetToJson(this.f2628f));
            jSONObject.put(EnumC1175g.QUALITY.m36317b(), JsonTool.fromSetToJson(this.f2629g));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String[] getLanguageArray() {
        return DataTool.fromSetToArray(this.f2625c);
    }

    public Set<String> getLanguages() {
        return this.f2625c;
    }

    public Set<String> getModelIds() {
        return this.f2623a;
    }

    public String[] getModelIdsArray() {
        return DataTool.fromSetToArray(this.f2623a);
    }

    public String[] getQualityArray() {
        return DataTool.fromSetToArray(this.f2629g);
    }

    public Set<String> getQualitys() {
        return this.f2629g;
    }

    public String[] getSpeakerArray() {
        return DataTool.fromSetToArray(this.f2627e);
    }

    public JSONArray getSpeakerJA() {
        return JsonTool.fromSetToJson(this.f2627e);
    }

    public Set<String> getSpeakers() {
        return this.f2627e;
    }

    public String getVersion() {
        return this.f2624b;
    }

    public void setDomains(Set<String> set) {
        this.f2628f = set;
    }

    public void setDomains(String[] strArr) {
        this.f2628f = DataTool.fromArrayToSet(strArr);
    }

    public void setGenders(Set<String> set) {
        this.f2626d = set;
    }

    public void setLanguages(Set<String> set) {
        this.f2625c = set;
    }

    public void setLanguages(String[] strArr) {
        this.f2625c = DataTool.fromArrayToSet(strArr);
    }

    public void setModelIds(Set<String> set) {
        this.f2623a = set;
    }

    public void setQualitys(Set<String> set) {
        this.f2629g = set;
    }

    public void setQualitys(String[] strArr) {
        this.f2629g = DataTool.fromArrayToSet(strArr);
    }

    public void setSpeakers(Set<String> set) {
        this.f2627e = set;
    }

    public void setVersion(String str) {
        this.f2624b = str;
    }
}
