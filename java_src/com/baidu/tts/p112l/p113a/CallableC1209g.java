package com.baidu.tts.p112l.p113a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
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
/* renamed from: com.baidu.tts.l.a.g */
/* loaded from: classes.dex */
public class CallableC1209g implements Callable<ModelBags> {

    /* renamed from: a */
    private Conditions f3052a;

    /* renamed from: b */
    private RequestHandle f3053b;

    public CallableC1209g(Conditions conditions) {
        this.f3052a = conditions;
    }

    /* renamed from: b */
    private StringEntity m36218b() {
        JSONObject jSONConditions = this.f3052a.getJSONConditions();
        try {
            jSONConditions.put(EnumC1175g.IVERSION.m36317b(), "1");
            jSONConditions.put(EnumC1175g.FUNCTION.m36319a(), "getList");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject = jSONConditions.toString();
        LoggerProxy.m36554d("GetServerModelsWork", "getlist params=" + jSONObject);
        return new StringEntity(jSONObject);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public ModelBags call() {
        SyncHttpClient syncHttpClient = new SyncHttpClient();
        String m36305a = EnumC1184o.MODEL_SERVER.m36305a();
        HttpEntity m36218b = m36218b();
        C1203a c1203a = new C1203a();
        this.f3053b = syncHttpClient.post(null, m36305a, m36218b, RequestParams.APPLICATION_JSON, c1203a);
        return c1203a.m36227a();
    }
}
