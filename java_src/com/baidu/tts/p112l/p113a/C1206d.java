package com.baidu.tts.p112l.p113a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.loopj.JsonHttpResponseHandler;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.l.a.d */
/* loaded from: classes.dex */
public class C1206d extends JsonHttpResponseHandler {

    /* renamed from: a */
    private TtsError f3047a;

    /* renamed from: b */
    private ModelFileBags f3048b;

    /* renamed from: a */
    public ModelFileBags m36224a() {
        return this.f3048b;
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler, com.baidu.tts.loopj.TextHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, String str, Throwable th) {
        LoggerProxy.m36554d("GetModelFileInfosHttpHandler", "onFailure1");
        this.f3047a = C1191c.m36299a().m36295a(EnumC1182n.MODEL_REQUEST_ERROR, i, str, th);
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, Throwable th, JSONObject jSONObject) {
        LoggerProxy.m36554d("GetModelFileInfosHttpHandler", "onFailure2");
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.toString();
        }
        this.f3047a = C1191c.m36299a().m36295a(EnumC1182n.MODEL_REQUEST_ERROR, i, str, th);
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler
    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
        LoggerProxy.m36554d("GetModelFileInfosHttpHandler", "onSuccess response=" + jSONObject);
        int optInt = jSONObject.optInt(EnumC1175g.ERROR_NUMBER.m36319a());
        String optString = jSONObject.optString(EnumC1175g.ERROR_MESSAGE.m36319a());
        if (optInt != 0 && optInt != -4005) {
            this.f3047a = C1191c.m36299a().m36296a(EnumC1182n.MODEL_SERVER_ERROR, optInt, optString);
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(EnumC1175g.DATA.m36317b());
        this.f3048b = new ModelFileBags();
        this.f3048b.parseJson(optJSONArray);
    }
}
