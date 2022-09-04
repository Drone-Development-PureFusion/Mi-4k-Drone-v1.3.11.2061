package com.baidu.tts.p090b.p091a.p093b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.C1062a;
import com.baidu.tts.auth.C1070c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.p102f.EnumC1167b;
import com.baidu.tts.p102f.EnumC1171c;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p102f.EnumC1184o;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.p114m.C1233d;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.p119q.C1254a;
import com.baidu.tts.tools.CommonUtility;
import com.baidu.tts.tools.StringTool;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: com.baidu.tts.b.a.b.f */
/* loaded from: classes.dex */
public class C1096f extends AbstractC1085a {

    /* renamed from: b */
    private C1098b f2532b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.b.a.b.f$a */
    /* loaded from: classes.dex */
    public class CallableC1097a implements Callable<C1237h> {

        /* renamed from: b */
        private int f2534b;

        /* renamed from: c */
        private C1099c f2535c;

        /* renamed from: d */
        private C1238i f2536d;

        /* renamed from: e */
        private C1098b f2537e;

        /* renamed from: f */
        private C1237h f2538f;

        /* renamed from: g */
        private SyncHttpClient f2539g;

        public CallableC1097a(int i, C1099c c1099c, C1238i c1238i, C1098b c1098b, C1237h c1237h) {
            this.f2534b = i;
            this.f2535c = c1099c;
            this.f2536d = c1238i;
            this.f2537e = c1098b;
            this.f2538f = c1237h;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1237h call() {
            try {
                HttpEntity m36668a = C1096f.this.m36668a(this.f2534b, this.f2535c.f2556a, this.f2536d, this.f2537e);
                this.f2539g = new SyncHttpClient();
                this.f2539g.setMaxRetriesAndTimeout(this.f2537e.m36632m(), this.f2537e.m36631n());
                int m36630o = this.f2537e.m36630o();
                LoggerProxy.m36554d("OnlineSynthesizer", "timeout=" + m36630o);
                this.f2539g.setTimeout(m36630o);
                C1102h c1102h = new C1102h(this.f2538f);
                c1102h.m36623a(this.f2537e);
                if (this.f2534b == 1) {
                    this.f2535c.f2557b = EnumC1184o.TTS_SERVER.mo36303b();
                    LoggerProxy.m36554d("OnlineSynthesizer", "serverIp=" + this.f2535c.f2557b);
                }
                if (this.f2535c.f2557b == null) {
                    this.f2538f.m36158a(C1191c.m36299a().m36292b(EnumC1182n.ONLINE_ENGINE_SERVER_IP_IS_NULL));
                } else if (!Thread.currentThread().isInterrupted()) {
                    LoggerProxy.m36554d("OnlineSynthesizer", "before post");
                    this.f2539g.post(null, this.f2535c.f2557b, m36668a, null, c1102h);
                    LoggerProxy.m36554d("OnlineSynthesizer", "after post");
                }
                return this.f2538f;
            } catch (C1254a e) {
                this.f2538f.m36158a(C1191c.m36299a().m36292b(EnumC1182n.ONLINE_TOKEN_IS_NULL));
                return this.f2538f;
            }
        }

        /* renamed from: b */
        public void m36658b() {
            if (this.f2539g != null) {
                this.f2539g.stop();
            }
        }
    }

    /* renamed from: com.baidu.tts.b.a.b.f$b */
    /* loaded from: classes.dex */
    public static class C1098b extends C1233d<C1098b> {

        /* renamed from: p */
        private static Set<String> f2540p = new HashSet();

        /* renamed from: a */
        private String f2541a;

        /* renamed from: e */
        private String f2545e;

        /* renamed from: f */
        private String f2546f;

        /* renamed from: g */
        private String f2547g;

        /* renamed from: h */
        private String f2548h;

        /* renamed from: i */
        private String f2549i;

        /* renamed from: j */
        private String f2550j;

        /* renamed from: k */
        private String f2551k;

        /* renamed from: l */
        private String f2552l;

        /* renamed from: b */
        private EnumC1167b f2542b = EnumC1167b.AMR;

        /* renamed from: c */
        private EnumC1171c f2543c = EnumC1171c.AMR_15K85;

        /* renamed from: d */
        private String f2544d = "0";

        /* renamed from: m */
        private int f2553m = 5;

        /* renamed from: n */
        private int f2554n = 1000;

        /* renamed from: o */
        private int f2555o = EnumC1180l.DEFAULT.m36311b();

        static {
            f2540p.add(EnumC1175g.SPEED.m36317b());
        }

        /* renamed from: a */
        public int m36655a(EnumC1167b enumC1167b) {
            if (enumC1167b != null) {
                this.f2542b = enumC1167b;
                return 0;
            }
            return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
        }

        /* renamed from: a */
        public String m36657a() {
            return this.f2551k;
        }

        /* renamed from: a */
        public void m36656a(int i) {
            this.f2553m = i;
        }

        /* renamed from: a */
        public void m36654a(EnumC1171c enumC1171c) {
            this.f2543c = enumC1171c;
        }

        /* renamed from: a */
        public void m36653a(String str) {
            this.f2551k = str;
        }

        /* renamed from: b */
        public String m36652b() {
            return this.f2552l;
        }

        /* renamed from: b */
        public void m36651b(int i) {
            this.f2554n = i;
        }

        /* renamed from: b */
        public void m36650b(String str) {
            this.f2552l = str;
        }

        /* renamed from: c */
        public String m36649c() {
            return this.f2542b.m36327a();
        }

        /* renamed from: c */
        public void m36648c(int i) {
            this.f2555o = i;
        }

        /* renamed from: c */
        public void m36647c(String str) {
            this.f2541a = str;
        }

        /* renamed from: d */
        public String m36646d() {
            return this.f2541a;
        }

        /* renamed from: d */
        public void m36645d(String str) {
            this.f2544d = str;
        }

        /* renamed from: e */
        public String m36644e() {
            return this.f2543c.m36325a();
        }

        /* renamed from: e */
        public void m36643e(String str) {
            this.f2547g = str;
        }

        /* renamed from: f */
        public String m36642f() {
            return this.f2544d;
        }

        /* renamed from: f */
        public void m36641f(String str) {
            this.f2548h = str;
        }

        /* renamed from: g */
        public String m36640g() {
            return this.f2545e;
        }

        /* renamed from: g */
        public void m36639g(String str) {
            this.f2549i = str;
        }

        /* renamed from: h */
        public String m36638h() {
            return this.f2546f;
        }

        /* renamed from: h */
        public void m36637h(String str) {
            this.f2550j = str;
        }

        /* renamed from: i */
        public String m36636i() {
            return this.f2547g;
        }

        /* renamed from: j */
        public String m36635j() {
            return this.f2548h;
        }

        /* renamed from: k */
        public String m36634k() {
            return this.f2549i;
        }

        /* renamed from: l */
        public String m36633l() {
            return this.f2550j;
        }

        /* renamed from: m */
        public int m36632m() {
            return this.f2553m;
        }

        /* renamed from: n */
        public int m36631n() {
            return this.f2554n;
        }

        /* renamed from: o */
        public int m36630o() {
            return this.f2555o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.b.a.b.f$c */
    /* loaded from: classes.dex */
    public class C1099c {

        /* renamed from: a */
        String f2556a = CommonUtility.generateSerialNumber();

        /* renamed from: b */
        String f2557b;

        public C1099c() {
        }
    }

    /* renamed from: com.baidu.tts.b.a.b.f$d */
    /* loaded from: classes.dex */
    private class CallableC1100d implements Callable<TtsError> {

        /* renamed from: b */
        private C1238i f2560b;

        /* renamed from: c */
        private C1099c f2561c;

        public CallableC1100d(C1238i c1238i) {
            this.f2560b = c1238i;
            this.f2561c = new C1099c();
        }

        /* renamed from: a */
        private boolean m36628a(C1237h c1237h) {
            return c1237h != null && c1237h.m36142f() == null && c1237h.m36160a() == 0;
        }

        /* renamed from: b */
        private boolean m36627b(C1237h c1237h) {
            return !m36628a(c1237h) || c1237h.m36151b() < 0;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public TtsError call() {
            C1237h m36669a;
            int i = 0;
            do {
                i++;
                LoggerProxy.m36554d("OnlineSynthesizer", "count=" + i);
                m36669a = C1096f.this.m36669a(i, this.f2561c, this.f2560b);
                if (m36628a(m36669a)) {
                    C1096f.this.a(m36669a);
                }
            } while (!m36627b(m36669a));
            return m36669a == null ? C1191c.m36299a().m36292b(EnumC1182n.ONLINE_ENGINE_CALL_EXCEPTION) : m36669a.m36142f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C1237h m36669a(int i, C1099c c1099c, C1238i c1238i) {
        C1237h m36148b = C1237h.m36148b(c1238i);
        C1098b A = this.f2532b.A();
        CallableC1097a callableC1097a = new CallableC1097a(i, c1099c, c1238i, A, m36148b);
        FutureTask futureTask = new FutureTask(callableC1097a);
        new Thread(futureTask).start();
        try {
            return (C1237h) futureTask.get(A.m36630o(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            futureTask.cancel(true);
            callableC1097a.m36658b();
            throw e;
        } catch (ExecutionException e2) {
            m36148b.m36158a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_ENGINE_GET_EXECUTION_EXCEPTION, e2.getCause()));
            return m36148b;
        } catch (TimeoutException e3) {
            LoggerProxy.m36554d("OnlineSynthesizer", "startOnceHttpRequest timeout");
            futureTask.cancel(true);
            callableC1097a.m36658b();
            m36148b.m36158a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_ENGINE_GET_TIMEOUT, e3));
            return m36148b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public HttpEntity m36668a(int i, String str, C1238i c1238i, C1098b c1098b) {
        UrlEncodedFormEntity urlEncodedFormEntity;
        if (c1098b == null) {
            return null;
        }
        ArrayList<NameValuePair> arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair(EnumC1175g.INDEX.m36319a(), String.valueOf(i)));
        arrayList.add(new BasicNameValuePair(EnumC1175g.SERIAL_NUMBER.m36319a(), str));
        arrayList.add(new BasicNameValuePair(EnumC1175g.PLATFORM.m36317b(), "Android"));
        C1193b m36288a = C1193b.m36288a();
        arrayList.add(new BasicNameValuePair(EnumC1175g.VERSION.m36319a(), m36288a.m36281j()));
        String m36646d = c1098b.m36646d();
        if (!StringTool.isEmpty(m36646d)) {
            arrayList.add(new BasicNameValuePair(EnumC1175g.PRODUCT_ID.m36319a(), m36646d));
        }
        c1238i.m36134c(c1098b.p());
        String m36133d = c1238i.m36133d();
        if (i == 1) {
            try {
                arrayList.add(new BasicNameValuePair(EnumC1175g.TEXT.m36319a(), URLEncoder.encode(c1238i.m36135c(), m36133d)));
                arrayList.add(new BasicNameValuePair(EnumC1175g.CTP.m36319a(), m36288a.m36286a(EnumC1175g.CTP.m36319a())));
                String m36282i = m36288a.m36282i();
                if (m36282i != null) {
                    arrayList.add(new BasicNameValuePair(EnumC1175g.CUID.m36319a(), m36282i));
                }
                if (StringTool.isEmpty(m36646d)) {
                    LoggerProxy.m36554d("OnlineSynthesizer", "before online auth");
                    C1070c.C1071a m36793a = C1062a.m36796a().m36793a(c1098b);
                    LoggerProxy.m36554d("OnlineSynthesizer", "after online auth");
                    if (!m36793a.mo36249g()) {
                        throw new C1254a();
                    }
                    arrayList.add(new BasicNameValuePair(EnumC1175g.TOKEN.m36319a(), m36793a.m36756a()));
                }
                arrayList.add(new BasicNameValuePair(EnumC1175g.TEXT_ENCODE.m36319a(), c1098b.q()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.AUDIO_ENCODE.m36319a(), c1098b.m36649c()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.BITRATE.m36319a(), c1098b.m36644e()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.SPEAKER.m36319a(), c1098b.m36642f()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.NUMBER.m36319a(), c1098b.m36640g()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.ENGINE.m36319a(), c1098b.m36638h()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.STYLE.m36319a(), c1098b.m36636i()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.BACKGROUND.m36319a(), c1098b.m36635j()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.TERRITORY.m36319a(), c1098b.m36634k()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.PUNCTUATION.m36319a(), c1098b.m36633l()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.LANGUAGE.m36319a(), c1098b.r()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.SPEED.m36319a(), c1098b.u()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.PITCH.m36319a(), c1098b.v()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.VOLUME.m36319a(), c1098b.w()));
                arrayList.add(new BasicNameValuePair(EnumC1175g.OPEN_XML.m36319a(), c1098b.s()));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (NameValuePair nameValuePair : arrayList) {
                stringBuffer.append(nameValuePair.getName());
                stringBuffer.append("=");
                stringBuffer.append(nameValuePair.getValue());
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            LoggerProxy.m36554d("OnlineSynthesizer", "request params: " + ((Object) stringBuffer));
            urlEncodedFormEntity = new UrlEncodedFormEntity(arrayList, m36133d);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            urlEncodedFormEntity = null;
        }
        return urlEncodedFormEntity;
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36665a(C1234e c1234e) {
        return EnumC1182n.ONLINE_UNSUPPORTED_OPERATION.m36307b();
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36664a(C1235f c1235f) {
        return EnumC1182n.ONLINE_UNSUPPORTED_OPERATION.m36307b();
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36663a(C1236g c1236g) {
        return EnumC1182n.ONLINE_UNSUPPORTED_OPERATION.m36307b();
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public TtsError mo36662a(C1238i c1238i) {
        try {
            return new CallableC1100d(c1238i).call();
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            return C1191c.m36299a().m36293a(EnumC1182n.ONLINE_ENGINE_CALL_EXCEPTION, e2);
        }
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public <OnlineSynthesizerParams> void mo36661a(OnlineSynthesizerParams onlinesynthesizerparams) {
        this.f2532b = (C1098b) onlinesynthesizerparams;
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: b */
    public int mo36660b(C1234e c1234e) {
        return EnumC1182n.ONLINE_UNSUPPORTED_OPERATION.m36307b();
    }
}
