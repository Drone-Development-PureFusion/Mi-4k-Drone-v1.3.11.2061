package com.baidu.tts.p112l.p113a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.loopj.JsonHttpResponseHandler;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.l.a.a */
/* loaded from: classes.dex */
public class C1203a extends JsonHttpResponseHandler {

    /* renamed from: a */
    private TtsError f3039a;

    /* renamed from: b */
    private ModelBags f3040b;

    /* renamed from: a */
    public ModelBags m36227a() {
        return this.f3040b;
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler, com.baidu.tts.loopj.TextHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, String str, Throwable th) {
        LoggerProxy.m36554d("GetListHttpHandler", "onFailure1");
        this.f3039a = C1191c.m36299a().m36295a(EnumC1182n.MODEL_REQUEST_ERROR, i, str, th);
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, Throwable th, JSONObject jSONObject) {
        LoggerProxy.m36554d("GetListHttpHandler", "onFailure2");
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.toString();
        }
        this.f3039a = C1191c.m36299a().m36295a(EnumC1182n.MODEL_REQUEST_ERROR, i, str, th);
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler
    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
        LoggerProxy.m36554d("GetListHttpHandler", "onSuccess response=" + jSONObject);
        int optInt = jSONObject.optInt(EnumC1175g.ERROR_NUMBER.m36319a());
        String optString = jSONObject.optString(EnumC1175g.ERROR_MESSAGE.m36319a());
        if (optInt != 0 && optInt != -1004) {
            this.f3039a = C1191c.m36299a().m36296a(EnumC1182n.MODEL_SERVER_ERROR, optInt, optString);
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(EnumC1175g.DATA_LIST.m36317b());
        this.f3040b = new ModelBags();
        this.f3040b.parseJson(optJSONArray);
    }
}
