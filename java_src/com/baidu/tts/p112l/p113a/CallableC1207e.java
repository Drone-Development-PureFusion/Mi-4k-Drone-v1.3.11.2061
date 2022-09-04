package com.baidu.tts.p112l.p113a;

import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.RequestParams;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1184o;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.l.a.e */
/* loaded from: classes.dex */
public class CallableC1207e implements Callable<ModelBags> {

    /* renamed from: a */
    private RequestHandle f3049a;

    /* renamed from: b */
    private StringEntity m36222b() {
        try {
            JSONObject jSONObject = new JSONObject(EmbeddedSynthesizerEngine.bdTTSGetEngineParam());
            jSONObject.put(EnumC1175g.FUNCTION.m36319a(), "getDefaultList");
            return new StringEntity(jSONObject.toString());
        } catch (JSONException e) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public ModelBags call() {
        SyncHttpClient syncHttpClient = new SyncHttpClient();
        String m36305a = EnumC1184o.MODEL_SERVER.m36305a();
        HttpEntity m36222b = m36222b();
        C1203a c1203a = new C1203a();
        this.f3049a = syncHttpClient.post(null, m36305a, m36222b, RequestParams.APPLICATION_JSON, c1203a);
        return c1203a.m36227a();
    }
}
