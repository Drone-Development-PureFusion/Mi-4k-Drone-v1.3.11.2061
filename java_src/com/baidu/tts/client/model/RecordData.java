package com.baidu.tts.client.model;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p112l.C1202a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class RecordData {

    /* renamed from: a */
    ExecutorService f2665a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private C1202a f2666b;

    /* loaded from: classes.dex */
    public class InsertData implements Callable<Integer> {

        /* renamed from: b */
        private JSONObject f2668b;

        /* renamed from: c */
        private String f2669c;

        /* renamed from: d */
        private String f2670d;

        public InsertData(JSONObject jSONObject, String str, String str2) {
            this.f2668b = jSONObject;
            this.f2669c = str;
            this.f2670d = str2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Integer mo40047call() {
            if (this.f2668b == null && this.f2670d == null) {
                RecordData.this.f2666b.m36232c(this.f2669c);
            } else {
                RecordData.this.f2666b.m36238a(this.f2669c, this.f2670d, this.f2668b.toString());
            }
            return 0;
        }
    }

    public RecordData(C1202a c1202a) {
        this.f2666b = c1202a;
    }

    public void setEndInfo(String str, String str2, int i, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("modeId", str2);
            jSONObject.put("result", i);
            jSONObject.put("endTime", str3);
            LoggerProxy.m36554d("RecordData", "EndInfo json= " + jSONObject.toString());
            this.f2665a.submit(new InsertData(jSONObject, str, "endInfo"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setStartInfo(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startTime", str3);
            jSONObject.put("modeId", str2);
            LoggerProxy.m36554d("RecordData", " StartInfo json= " + jSONObject.toString());
            this.f2665a.submit(new InsertData(null, str, null));
            this.f2665a.submit(new InsertData(jSONObject, str, "startInfo"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
