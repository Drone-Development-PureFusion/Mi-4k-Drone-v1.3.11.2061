package com.baidu.tts.p118p;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.loopj.JsonHttpResponseHandler;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import org.apache.http.Header;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.p.d */
/* loaded from: classes.dex */
public class C1253d extends JsonHttpResponseHandler {

    /* renamed from: a */
    private TtsError f3114a;

    /* renamed from: b */
    private int f3115b = -1;

    /* renamed from: a */
    public int m36072a() {
        return this.f3115b;
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, Throwable th, JSONObject jSONObject) {
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.toString();
        }
        this.f3114a = C1191c.m36299a().m36295a(EnumC1182n.MODEL_REQUEST_ERROR, i, str, th);
    }

    @Override // com.baidu.tts.loopj.JsonHttpResponseHandler
    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
        int optInt = jSONObject.optInt(EnumC1175g.ERROR_NUMBER.m36319a());
        String optString = jSONObject.optString(EnumC1175g.ERROR_MESSAGE.m36319a());
        if (optInt == 0) {
            this.f3115b = optInt;
        } else {
            this.f3114a = C1191c.m36299a().m36296a(EnumC1182n.MODEL_SERVER_ERROR, optInt, optString);
        }
    }
}
