package com.baidu.tts.p098d.p099a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p103g.p104a.ThreadFactoryC1188a;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p110j.AbstractC1196a;
import com.baidu.tts.p112l.C1202a;
import com.baidu.tts.tools.FileTools;
import com.baidu.tts.tools.StringTool;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;
/* renamed from: com.baidu.tts.d.a.b */
/* loaded from: classes.dex */
public class C1133b extends AbstractC1196a {

    /* renamed from: h */
    private ThreadPoolExecutor f2680h;

    /* renamed from: i */
    private C1202a f2681i;

    /* renamed from: b */
    private C1142i f2676b = new C1142i(this);

    /* renamed from: c */
    private C1139f f2677c = new C1139f(this);

    /* renamed from: f */
    private C1137d f2678f = new C1137d(this);

    /* renamed from: g */
    private C1141h f2679g = new C1141h(this);

    /* renamed from: a */
    private volatile AbstractC1132a f2675a = this.f2676b;

    /* renamed from: com.baidu.tts.d.a.b$a */
    /* loaded from: classes.dex */
    public class CallableC1134a implements Callable<Void> {

        /* renamed from: b */
        private C1136c f2683b;

        /* renamed from: c */
        private SyncHttpClient f2684c;

        public CallableC1134a(C1136c c1136c) {
            this.f2683b = c1136c;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f2683b.m36486d();
            final String m36492a = this.f2683b.m36492a();
            LoggerProxy.m36554d("DownloadEngine", "DownloadWork start fileId=" + m36492a);
            if (StringTool.isEmpty(m36492a)) {
                this.f2683b.m36490a(C1191c.m36299a().m36294a(EnumC1182n.MODEL_REQUEST_ERROR, "fileId is null"));
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(m36492a);
                ModelFileBags modelFileBags = C1133b.this.f2681i.m36237a(hashSet).get();
                if (modelFileBags != null) {
                    String url = modelFileBags.getUrl(0);
                    if (url != null) {
                        this.f2684c = new SyncHttpClient();
                        this.f2684c.setURLEncodingEnabled(false);
                        this.f2684c.setTimeout(EnumC1180l.DEFAULT.m36311b());
                        this.f2684c.setMaxRetriesAndTimeout(5, 1500);
                        C1140g c1140g = new C1140g(FileTools.getFile(this.f2683b.m36488b()), this.f2683b) { // from class: com.baidu.tts.d.a.b.a.1
                            @Override // com.baidu.tts.p098d.p099a.C1140g, com.baidu.tts.loopj.FileAsyncHttpResponseHandler
                            public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
                                LoggerProxy.m36554d("DownloadEngine", "1isInterrupted=" + Thread.currentThread().isInterrupted());
                                if (C1133b.this.C()) {
                                    super.onFailure(i, headerArr, th, file);
                                }
                            }

                            @Override // com.baidu.tts.p098d.p099a.C1140g, com.baidu.tts.loopj.AsyncHttpResponseHandler
                            public void onProgress(long j, long j2) {
                                if (C1133b.this.C()) {
                                    super.onProgress(j, j2);
                                }
                            }

                            @Override // com.baidu.tts.p098d.p099a.C1140g, com.baidu.tts.loopj.FileAsyncHttpResponseHandler
                            public void onSuccess(int i, Header[] headerArr, File file) {
                                LoggerProxy.m36554d("DownloadEngine", "2isInterrupted=" + Thread.currentThread().isInterrupted() + "--fileId=" + m36492a);
                                if (C1133b.this.C()) {
                                    super.onSuccess(i, headerArr, file);
                                }
                            }
                        };
                        c1140g.setUseSynchronousMode(true);
                        LoggerProxy.m36554d("DownloadEngine", "before get fileId=" + m36492a);
                        this.f2684c.get(url, c1140g);
                    } else {
                        this.f2683b.m36490a(C1191c.m36299a().m36294a(EnumC1182n.MODEL_REQUEST_ERROR, "url is null"));
                    }
                } else {
                    this.f2683b.m36490a(C1191c.m36299a().m36294a(EnumC1182n.MODEL_REQUEST_ERROR, "urlbags is null"));
                }
            }
            LoggerProxy.m36554d("DownloadEngine", "DownloadWork end");
            return null;
        }

        /* renamed from: b */
        public void m36494b() {
            if (this.f2684c != null) {
                this.f2684c.stop();
            }
        }

        /* renamed from: c */
        public C1136c m36493c() {
            return this.f2683b;
        }
    }

    public C1133b() {
        b();
    }

    /* renamed from: a */
    public AbstractC1132a m36507a() {
        return this.f2675a;
    }

    /* renamed from: a */
    public C1138e m36504a(C1136c c1136c) {
        return this.f2675a.mo36480a(c1136c);
    }

    /* renamed from: a */
    public void m36506a(AbstractC1132a abstractC1132a) {
        this.f2675a = abstractC1132a;
    }

    /* renamed from: a */
    public void m36503a(C1202a c1202a) {
        this.f2681i = c1202a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C1138e m36502b(C1136c c1136c) {
        CallableC1134a callableC1134a = new CallableC1134a(c1136c);
        c1136c.m36487c();
        LoggerProxy.m36554d("DownloadEngine", "before submit");
        Future<Void> future = null;
        try {
            future = this.f2680h.submit(callableC1134a);
        } catch (Exception e) {
            LoggerProxy.m36554d("DownloadEngine", "submit exception");
            c1136c.m36490a(C1191c.m36299a().m36293a(EnumC1182n.MODEL_FILE_DOWNLOAD_EXCEPTION, e));
        }
        C1138e c1138e = new C1138e();
        c1138e.m36482a(future);
        c1138e.m36483a(callableC1134a);
        return c1138e;
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: g */
    protected TtsError mo36258g() {
        return this.f2675a.mo36091b();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: h */
    protected void mo36257h() {
        this.f2675a.mo36481a();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: i */
    protected void mo36256i() {
        this.f2675a.mo36090c();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: j */
    protected void mo36255j() {
        this.f2675a.mo36089d();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: k */
    protected void mo36254k() {
        this.f2675a.mo36088e();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: l */
    protected void mo36253l() {
        this.f2675a.mo36087f();
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: m */
    public boolean mo36252m() {
        return this.f2675a == this.f2679g;
    }

    @Override // com.baidu.tts.p110j.AbstractC1196a
    /* renamed from: n */
    public boolean mo36251n() {
        return Thread.currentThread().isInterrupted() || this.f2675a == this.f2677c;
    }

    /* renamed from: o */
    public C1142i m36501o() {
        return this.f2676b;
    }

    /* renamed from: p */
    public C1139f m36500p() {
        return this.f2677c;
    }

    /* renamed from: q */
    public C1137d m36499q() {
        return this.f2678f;
    }

    /* renamed from: r */
    public C1141h m36498r() {
        return this.f2679g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m36497s() {
        this.f2680h = (ThreadPoolExecutor) Executors.newFixedThreadPool(5, new ThreadFactoryC1188a("downloadPoolThread"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36496t() {
        LoggerProxy.m36554d("DownloadEngine", "enter stop");
        if (this.f2680h != null) {
            if (!this.f2680h.isShutdown()) {
                this.f2680h.shutdownNow();
            }
            try {
                LoggerProxy.m36554d("DownloadEngine", "before awaitTermination");
                LoggerProxy.m36554d("DownloadEngine", "after awaitTermination isTermination=" + this.f2680h.awaitTermination(EnumC1180l.DEFAULT.m36312a(), TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
            }
            this.f2680h = null;
        }
        LoggerProxy.m36554d("DownloadEngine", "end stop");
    }
}
