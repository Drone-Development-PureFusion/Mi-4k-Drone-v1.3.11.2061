package com.baidu.tts.client.model;

import android.content.Context;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.tools.DataTool;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ModelFileBags {

    /* renamed from: a */
    private TtsError f2645a;

    /* renamed from: b */
    private List<ModelFileInfo> f2646b;

    public void addFileInfo(ModelFileInfo modelFileInfo) {
        if (this.f2646b == null) {
            this.f2646b = new ArrayList();
        }
        this.f2646b.add(modelFileInfo);
    }

    public void generateAbsPath(Context context) {
        if (this.f2646b != null) {
            for (ModelFileInfo modelFileInfo : this.f2646b) {
                modelFileInfo.generateAbsPath(context);
            }
        }
    }

    public ModelFileInfo getModelFileInfo(int i) {
        if (this.f2646b != null) {
            return this.f2646b.get(i);
        }
        return null;
    }

    public List<ModelFileInfo> getModelFileInfos() {
        return this.f2646b;
    }

    public TtsError getTtsError() {
        return this.f2645a;
    }

    public String getUrl(int i) {
        ModelFileInfo modelFileInfo = getModelFileInfo(i);
        if (modelFileInfo != null) {
            return modelFileInfo.getUrl();
        }
        return null;
    }

    public boolean isEmpty() {
        return DataTool.isListEmpty(this.f2646b);
    }

    public void parseJson(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            ModelFileInfo modelFileInfo = new ModelFileInfo();
            modelFileInfo.parseJson(optJSONObject);
            addFileInfo(modelFileInfo);
        }
    }

    public void setList(List<Map<String, String>> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            ModelFileInfo modelFileInfo = new ModelFileInfo();
            modelFileInfo.setMap(map);
            arrayList.add(modelFileInfo);
        }
        this.f2646b = arrayList;
    }

    public void setModelFileInfos(List<ModelFileInfo> list) {
        this.f2646b = list;
    }

    public void setTtsError(TtsError ttsError) {
        this.f2645a = ttsError;
    }

    public JSONArray toJson() {
        JSONArray jSONArray = new JSONArray();
        if (!isEmpty()) {
            for (ModelFileInfo modelFileInfo : this.f2646b) {
                jSONArray.put(modelFileInfo.toJson());
            }
        }
        return jSONArray;
    }
}
