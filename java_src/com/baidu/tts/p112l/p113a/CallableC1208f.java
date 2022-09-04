package com.baidu.tts.p112l.p113a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.RequestParams;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1184o;
import com.baidu.tts.tools.JsonTool;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.l.a.f */
/* loaded from: classes.dex */
public class CallableC1208f implements Callable<ModelFileBags> {

    /* renamed from: a */
    private RequestHandle f3050a;

    /* renamed from: b */
    private Set<String> f3051b;

    public CallableC1208f(Set<String> set) {
        this.f3051b = set;
    }

    /* renamed from: b */
    private StringEntity m36220b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EnumC1175g.FUNCTION.m36319a(), "getURL");
            jSONObject.put(EnumC1175g.IVERSION.m36317b(), "1");
            jSONObject.put(EnumC1175g.ID.m36317b(), JsonTool.fromSetToJson(this.f3051b));
            String jSONObject2 = jSONObject.toString();
            LoggerProxy.m36554d("GetServerModelFileInfosWork", "geturl params=" + jSONObject2);
            return new StringEntity(jSONObject2);
        } catch (JSONException e) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public ModelFileBags call() {
        SyncHttpClient syncHttpClient = new SyncHttpClient();
        String m36305a = EnumC1184o.MODEL_SERVER.m36305a();
        HttpEntity m36220b = m36220b();
        C1206d c1206d = new C1206d();
        this.f3050a = syncHttpClient.post(null, m36305a, m36220b, RequestParams.APPLICATION_JSON, c1206d);
        return c1206d.m36224a();
    }
}
