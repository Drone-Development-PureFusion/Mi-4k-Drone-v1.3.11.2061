package com.baidu.tts.client.model;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p098d.C1131a;
import com.baidu.tts.p098d.C1143b;
import com.baidu.tts.p098d.p100b.C1144a;
import com.baidu.tts.p098d.p100b.C1147d;
import com.baidu.tts.p112l.C1202a;
import java.util.UUID;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class DownloadHandler {
    public static final int DOWNLOAD_SUCCESS = 0;

    /* renamed from: a */
    private C1143b f2630a;

    /* renamed from: b */
    private Future<C1131a> f2631b;

    /* renamed from: c */
    private TtsError f2632c;

    /* renamed from: f */
    private C1202a f2635f;

    /* renamed from: d */
    private C1144a f2633d = C1144a.m36474a();

    /* renamed from: e */
    private volatile boolean f2634e = false;

    /* renamed from: g */
    private RecordData f2636g = null;

    /* renamed from: h */
    private String f2637h = UUID.randomUUID().toString();

    public DownloadHandler(C1202a c1202a) {
        this.f2635f = c1202a;
    }

    /* renamed from: a */
    private OnDownloadListener m36519a() {
        return this.f2630a.m36475c();
    }

    /* renamed from: a */
    private void m36518a(String str) {
        this.f2636g = new RecordData(this.f2635f);
        synchronized (this) {
            if (Statistics.isStatistics) {
                this.f2636g.setStartInfo(this.f2637h, str, System.currentTimeMillis() + "");
            }
        }
        OnDownloadListener m36519a = m36519a();
        if (m36519a != null) {
            synchronized (this) {
                if (!this.f2634e) {
                    m36519a.onStart(str);
                }
            }
        }
    }

    /* renamed from: a */
    private void m36517a(String str, int i) {
        OnDownloadListener m36519a = m36519a();
        if (m36519a != null) {
            synchronized (this) {
                if (!this.f2634e) {
                    m36519a.onFinish(str, i);
                    this.f2630a.m36478a((OnDownloadListener) null);
                }
            }
        }
        synchronized (this) {
            if (Statistics.isStatistics) {
                this.f2636g.setEndInfo(this.f2637h, str, i, System.currentTimeMillis() + "");
            }
            if (Statistics.isStatistics) {
                LoggerProxy.m36554d("DownloadHandler", " statistics ret=" + new Statistics(this.f2635f.m36231d()).start());
            }
        }
    }

    /* renamed from: a */
    private void m36516a(String str, long j, long j2) {
        OnDownloadListener m36519a = m36519a();
        if (m36519a != null) {
            synchronized (this) {
                if (!this.f2634e) {
                    m36519a.onProgress(str, j, j2);
                }
            }
        }
    }

    public C1143b getDownloadParams() {
        return this.f2630a;
    }

    public int getErrorCode() {
        return getErrorCode(this.f2632c);
    }

    public int getErrorCode(TtsError ttsError) {
        if (ttsError != null) {
            return ttsError.getDetailCode();
        }
        return 0;
    }

    public String getErrorMessage() {
        return getErrorMessage(this.f2632c);
    }

    public String getErrorMessage(TtsError ttsError) {
        if (ttsError != null) {
            return ttsError.getDetailMessage();
        }
        return null;
    }

    public String getModelId() {
        return this.f2630a.m36479a();
    }

    public TtsError getTtsError() {
        return this.f2632c;
    }

    public synchronized void reset() {
        LoggerProxy.m36554d("DownloadHandler", "reset");
        this.f2634e = false;
    }

    public void reset(C1143b c1143b) {
        setDownloadParams(c1143b);
        reset();
    }

    public void setCheckFuture(Future<C1131a> future) {
        this.f2631b = future;
    }

    public void setDownloadParams(C1143b c1143b) {
        this.f2630a = c1143b;
    }

    public void setTtsError(TtsError ttsError) {
        this.f2632c = ttsError;
    }

    public synchronized void stop() {
        LoggerProxy.m36554d("DownloadHandler", "stop");
        this.f2634e = true;
        if (this.f2631b != null) {
            this.f2631b.cancel(true);
            this.f2631b = null;
        }
        this.f2633d.m36473a(this);
        this.f2630a.m36478a((OnDownloadListener) null);
    }

    public void updateFinish(C1147d c1147d, TtsError ttsError) {
        updateFinish(c1147d.m36424g(), ttsError);
    }

    public void updateFinish(String str, TtsError ttsError) {
        setTtsError(ttsError);
        m36517a(str, getErrorCode());
    }

    public void updateProgress(C1147d c1147d) {
        m36516a(c1147d.m36424g(), c1147d.m36423h(), c1147d.m36429c());
    }

    public void updateStart(C1147d c1147d) {
        m36518a(c1147d.m36424g());
    }
}
