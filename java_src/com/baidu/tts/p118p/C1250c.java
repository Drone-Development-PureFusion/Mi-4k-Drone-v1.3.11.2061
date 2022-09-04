package com.baidu.tts.p118p;

import android.content.Context;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.p102f.EnumC1184o;
import com.baidu.tts.p112l.C1202a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* renamed from: com.baidu.tts.p.c */
/* loaded from: classes.dex */
public class C1250c {

    /* renamed from: b */
    private Context f3105b;

    /* renamed from: c */
    private C1202a f3106c;

    /* renamed from: d */
    private FutureTask<Integer> f3107d;

    /* renamed from: e */
    private int f3108e = 0;

    /* renamed from: f */
    private int f3109f = 0;

    /* renamed from: a */
    ExecutorService f3104a = Executors.newSingleThreadExecutor();

    /* renamed from: com.baidu.tts.p.c$a */
    /* loaded from: classes.dex */
    public class CallableC1251a implements Callable<Integer> {

        /* renamed from: b */
        private RequestHandle f3111b;

        public CallableC1251a() {
        }

        /* renamed from: b */
        private UrlEncodedFormEntity m36073b() {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList2 = C1250c.this.f3106c.m36229f().get("listId");
            if (arrayList2.size() != 0) {
                C1250c.this.f3108e = ((Integer) arrayList2.get(0)).intValue();
                C1250c.this.f3109f = ((Integer) arrayList2.get(arrayList2.size() - 1)).intValue();
            }
            JSONArray jSONArray = new JSONArray((Collection) C1250c.this.f3106c.m36229f().get("list"));
            try {
                jSONObject.put("deviceInfo", C1248a.m36086a(C1250c.this.f3105b));
                jSONObject.put("appinfo", C1248a.m36085b(C1250c.this.f3105b));
                jSONObject.put("methodinfo", jSONArray);
                LoggerProxy.m36554d("UploadStatistics", "StatisticsData= " + jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            arrayList.add(new BasicNameValuePair(C0612f.f1063a, jSONObject.toString()));
            try {
                return new UrlEncodedFormEntity(arrayList, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            SyncHttpClient syncHttpClient = new SyncHttpClient();
            String m36305a = EnumC1184o.STATISTICS_SERVER.m36305a();
            HttpEntity m36073b = m36073b();
            C1253d c1253d = new C1253d();
            this.f3111b = syncHttpClient.post(null, m36305a, m36073b, null, c1253d);
            final int m36072a = c1253d.m36072a();
            C1250c.this.f3104a.submit(new Runnable() { // from class: com.baidu.tts.p.c.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (m36072a == 0) {
                        LoggerProxy.m36554d("UploadStatistics", "delete database code==" + C1250c.this.f3106c.m36244a(C1250c.this.f3108e, C1250c.this.f3109f));
                    }
                }
            });
            return Integer.valueOf(m36072a);
        }
    }

    public C1250c(Context context) {
        this.f3105b = context;
        this.f3106c = new C1202a(context);
    }

    /* renamed from: a */
    public FutureTask<Integer> m36082a() {
        this.f3107d = new FutureTask<>(new CallableC1251a());
        this.f3104a.submit(this.f3107d);
        return this.f3107d;
    }

    /* renamed from: b */
    public void m36079b() {
        this.f3107d.cancel(true);
    }
}
