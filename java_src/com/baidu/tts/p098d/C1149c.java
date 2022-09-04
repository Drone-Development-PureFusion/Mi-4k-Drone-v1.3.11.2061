package com.baidu.tts.p098d;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.database.C1154a;
import com.baidu.tts.p098d.p099a.C1133b;
import com.baidu.tts.p098d.p099a.C1136c;
import com.baidu.tts.p098d.p100b.C1144a;
import com.baidu.tts.p098d.p100b.C1145b;
import com.baidu.tts.p098d.p100b.C1146c;
import com.baidu.tts.p098d.p100b.C1147d;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p110j.AbstractC1198b;
import com.baidu.tts.p112l.C1202a;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.StringTool;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* renamed from: com.baidu.tts.d.c */
/* loaded from: classes.dex */
public class C1149c implements AbstractC1198b {

    /* renamed from: a */
    private static volatile C1149c f2716a = null;

    /* renamed from: b */
    private C1202a f2717b;

    /* renamed from: c */
    private C1144a f2718c = C1144a.m36474a();

    /* renamed from: d */
    private C1133b f2719d = new C1133b();

    /* renamed from: e */
    private ExecutorService f2720e;

    /* renamed from: com.baidu.tts.d.c$a */
    /* loaded from: classes.dex */
    public class CallableC1150a implements Callable<C1131a> {

        /* renamed from: b */
        private DownloadHandler f2722b;

        public CallableC1150a(DownloadHandler downloadHandler) {
            this.f2722b = downloadHandler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1131a call() {
            C1131a c1131a = new C1131a();
            C1154a m36230e = C1149c.this.f2717b.m36230e();
            String modelId = this.f2722b.getModelId();
            C1147d m36468b = C1149c.this.f2718c.m36468b(modelId);
            try {
                m36468b.m36428c(this.f2722b);
                if (!m36468b.m36433a(m36230e)) {
                    Conditions conditions = new Conditions();
                    conditions.appendId(modelId);
                    ModelBags modelBags = C1149c.this.f2717b.m36243a(conditions).get();
                    if (modelBags == null || modelBags.isEmpty()) {
                        m36468b.m36437a(this.f2722b, C1191c.m36299a().m36294a(EnumC1182n.MODEL_BAGS_EMPTY, "modelId=" + modelId));
                        return c1131a;
                    }
                    m36468b.m36436a(modelBags, m36230e);
                }
                Set<String> m36425f = m36468b.m36425f();
                if (DataTool.isSetEmpty(m36425f)) {
                    m36468b.m36437a(this.f2722b, C1191c.m36299a().m36294a(EnumC1182n.MODEL_DB_MODEL_INVALID, "modelId=" + modelId));
                    return c1131a;
                }
                for (String str : m36425f) {
                    C1146c m36466c = C1149c.this.f2718c.m36466c(str);
                    if (!m36466c.m36442a(m36230e)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(str);
                        ModelFileBags modelFileBags = C1149c.this.f2717b.m36237a(hashSet).get();
                        if (modelFileBags == null || modelFileBags.isEmpty()) {
                            m36468b.m36437a(this.f2722b, C1191c.m36299a().m36294a(EnumC1182n.MODEL_FILE_BAG_EMPTY, "fileId=" + str));
                            return c1131a;
                        }
                        modelFileBags.generateAbsPath(C1149c.this.f2717b.m36231d());
                        m36466c.m36443a(modelFileBags, m36230e);
                    }
                }
                m36468b.m36427d();
                Set<String> m36432b = m36468b.m36432b();
                if (DataTool.isSetEmpty(m36432b)) {
                    m36468b.m36437a(this.f2722b, C1191c.m36299a().m36294a(EnumC1182n.MODEL_DB_MODEL_FILE_PATHS_INVALID, "modelId=" + modelId));
                    return c1131a;
                }
                for (String str2 : m36432b) {
                    if (!StringTool.isEmpty(str2)) {
                        C1145b m36471a = C1149c.this.f2718c.m36471a(str2);
                        m36471a.m36457a(modelId);
                        boolean m36458a = m36471a.m36458a(m36230e);
                        String m36453c = m36471a.m36453c();
                        LoggerProxy.m36554d("Downloader", "isNeedDownload=" + m36458a + "--fileId=" + m36453c);
                        if (m36458a) {
                            if (m36471a.m36450e()) {
                                m36471a.m36449f();
                            }
                            C1136c c1136c = new C1136c();
                            c1136c.m36489a(m36471a);
                            if (Thread.currentThread().isInterrupted()) {
                                return null;
                            }
                            LoggerProxy.m36554d("Downloader", "before download fileId=" + m36453c);
                            m36471a.m36460a(C1149c.this.f2719d.m36504a(c1136c));
                            c1131a.m36510a(true);
                        } else {
                            c1131a.m36511a(str2, m36471a.m36451d());
                        }
                    }
                }
                if (!c1131a.m36512a() && c1131a.m36509b()) {
                    this.f2722b.updateProgress(m36468b);
                    m36468b.m36437a(this.f2722b, C1191c.m36299a().m36294a(EnumC1182n.MODEL_EXISTS, "modelId=" + modelId));
                }
                return c1131a;
            } catch (Exception e) {
                LoggerProxy.m36554d("Downloader", "exception=" + e.toString());
                m36468b.m36437a(this.f2722b, C1191c.m36299a().m36294a(EnumC1182n.MODEL_CHECK_EXCEPTION, "modelId=" + modelId));
                return c1131a;
            }
        }
    }

    private C1149c() {
    }

    /* renamed from: a */
    public static C1149c m36410a() {
        if (f2716a == null) {
            synchronized (C1149c.class) {
                if (f2716a == null) {
                    f2716a = new C1149c();
                }
            }
        }
        return f2716a;
    }

    /* renamed from: h */
    private synchronized ExecutorService m36403h() {
        if (this.f2720e == null) {
            this.f2720e = Executors.newSingleThreadExecutor();
        }
        return this.f2720e;
    }

    /* renamed from: a */
    public synchronized DownloadHandler m36409a(DownloadHandler downloadHandler) {
        LoggerProxy.m36554d("Downloader", "download handler=" + downloadHandler);
        downloadHandler.setCheckFuture(m36403h().submit(new CallableC1150a(downloadHandler)));
        return downloadHandler;
    }

    /* renamed from: a */
    public void m36407a(C1202a c1202a) {
        this.f2717b = c1202a;
        this.f2718c.m36472a(this.f2717b.m36230e());
        this.f2719d.m36503a(this.f2717b);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public synchronized TtsError mo36091b() {
        return null;
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: c */
    public synchronized void mo36090c() {
        this.f2719d.c();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: d */
    public synchronized void mo36089d() {
        this.f2719d.d();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: e */
    public synchronized void mo36088e() {
        LoggerProxy.m36554d("Downloader", "enter stop");
        this.f2718c.m36467c();
        if (this.f2720e != null) {
            if (!this.f2720e.isShutdown()) {
                this.f2720e.shutdownNow();
                this.f2719d.e();
                LoggerProxy.m36554d("Downloader", "after engine stop");
            }
            try {
                LoggerProxy.m36554d("Downloader", "before awaitTermination");
                LoggerProxy.m36554d("Downloader", "after awaitTermination isTermination=" + this.f2720e.awaitTermination(EnumC1180l.DEFAULT.m36312a(), TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
            }
            this.f2720e = null;
        }
        LoggerProxy.m36554d("Downloader", "end stop");
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: f */
    public synchronized void mo36087f() {
    }

    /* renamed from: g */
    public synchronized void m36404g() {
        m36403h();
        this.f2719d.A();
    }
}
