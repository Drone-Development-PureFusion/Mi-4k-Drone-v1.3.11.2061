package com.baidu.tts.auth;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p111k.AbstractC1199a;
import com.baidu.tts.p111k.AbstractCallableC1200b;
import com.baidu.tts.tools.StringTool;
import com.tencent.connect.common.Constants;
import java.util.LinkedList;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.auth.c */
/* loaded from: classes.dex */
public class C1070c implements AbstractCallableC1200b<C1070c, C1071a> {

    /* renamed from: a */
    private String f2483a;

    /* renamed from: b */
    private String f2484b;

    /* renamed from: c */
    private String f2485c;

    /* renamed from: com.baidu.tts.auth.c$a */
    /* loaded from: classes.dex */
    public static class C1071a implements AbstractC1199a {

        /* renamed from: a */
        private String f2486a;

        /* renamed from: b */
        private String f2487b;

        /* renamed from: c */
        private long f2488c;

        /* renamed from: d */
        private TtsError f2489d;

        /* renamed from: a */
        public String m36756a() {
            return this.f2487b;
        }

        /* renamed from: a */
        public void m36755a(long j) {
            this.f2488c = j;
        }

        /* renamed from: a */
        public void m36754a(TtsError ttsError) {
            if (ttsError != null) {
                LoggerProxy.m36554d("OnlineAuth", "this=" + this + "--error=" + ttsError.getDetailMessage());
            }
            this.f2489d = ttsError;
        }

        /* renamed from: a */
        public void m36753a(String str) {
            this.f2486a = str;
        }

        /* renamed from: b */
        public TtsError m36752b() {
            return this.f2489d;
        }

        /* renamed from: b */
        public void m36751b(String str) {
            this.f2487b = str;
        }

        @Override // com.baidu.tts.p111k.AbstractC1199a
        /* renamed from: g */
        public boolean mo36249g() {
            if (StringTool.isEmpty(this.f2486a)) {
                return this.f2487b != null && System.currentTimeMillis() < this.f2488c;
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m36763a(String str, String str2) {
        return !StringTool.isEmpty(str) && !StringTool.isEmpty(str2);
    }

    /* renamed from: b */
    private String m36760b(String str, String str2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("grant_type", "client_credentials"));
        linkedList.add(new BasicNameValuePair(Constants.PARAM_CLIENT_ID, str));
        linkedList.add(new BasicNameValuePair("client_secret", str2));
        return "https://openapi.baidu.com/oauth/2.0/token?" + URLEncodedUtils.format(linkedList, "utf-8");
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C1070c c1070c) {
        String m36766a = c1070c.m36766a();
        if (StringTool.isEmpty(this.f2483a)) {
            String m36762b = c1070c.m36762b();
            String m36759c = c1070c.m36759c();
            LoggerProxy.m36554d("OnlineAuth", "mAK=" + this.f2484b + "--mSK=" + this.f2485c + "--ak2=" + m36762b + "--sk2=" + m36759c);
            return (!StringTool.isEqual(this.f2484b, m36762b) || !StringTool.isEqual(this.f2485c, m36759c)) ? 1 : 0;
        }
        LoggerProxy.m36554d("OnlineAuth", "mProductId=" + this.f2483a + "--productId2=" + m36766a);
        if (m36766a == null) {
            return 1;
        }
        return this.f2483a.compareTo(m36766a);
    }

    /* renamed from: a */
    public String m36766a() {
        return this.f2483a;
    }

    /* renamed from: a */
    public void m36764a(String str) {
        this.f2483a = str;
    }

    /* renamed from: b */
    public String m36762b() {
        return this.f2484b;
    }

    /* renamed from: b */
    public void m36761b(String str) {
        this.f2484b = str;
    }

    /* renamed from: c */
    public String m36759c() {
        return this.f2485c;
    }

    /* renamed from: c */
    public void m36758c(String str) {
        this.f2485c = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: d */
    public C1071a call() {
        LoggerProxy.m36554d("OnlineAuth", "enter online auth");
        C1071a c1071a = new C1071a();
        if (StringTool.isEmpty(this.f2483a)) {
            try {
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                if (m36763a(this.f2484b, this.f2485c)) {
                    String m36760b = m36760b(this.f2484b, this.f2485c);
                    LoggerProxy.m36554d("OnlineAuth", "url=" + m36760b);
                    HttpResponse execute = defaultHttpClient.execute(new HttpPost(m36760b));
                    String entityUtils = EntityUtils.toString(execute.getEntity());
                    int statusCode = execute.getStatusLine().getStatusCode();
                    LoggerProxy.m36554d("OnlineAuth", "body=" + entityUtils + "--code=" + statusCode);
                    if (statusCode == 200) {
                        JSONObject jSONObject = new JSONObject(entityUtils);
                        if (jSONObject.has("access_token")) {
                            c1071a.m36751b(jSONObject.getString("access_token"));
                        } else {
                            c1071a.m36754a(C1191c.m36299a().m36292b(EnumC1182n.ONLINE_ENGINE_AUTH_FAILURE));
                        }
                        if (jSONObject.has("expires_in")) {
                            c1071a.m36755a(System.nanoTime() + (Math.min(jSONObject.getInt("expires_in"), 86400L) * 1000000000));
                        }
                    } else {
                        c1071a.m36754a(C1191c.m36299a().m36292b(EnumC1182n.ONLINE_ENGINE_AUTH_FAILURE));
                    }
                } else {
                    c1071a.m36754a(C1191c.m36299a().m36292b(EnumC1182n.TTS_PARAMETER_INVALID));
                }
            } catch (Exception e) {
                c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_ENGINE_AUTH_FAILURE, e));
            }
        } else {
            c1071a.m36753a(this.f2483a);
        }
        LoggerProxy.m36554d("OnlineAuth", "end online auth");
        return c1071a;
    }
}
