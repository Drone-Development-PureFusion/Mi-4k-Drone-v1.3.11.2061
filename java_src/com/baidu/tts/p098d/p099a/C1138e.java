package com.baidu.tts.p098d.p099a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p098d.p099a.C1133b;
import java.util.concurrent.Future;
/* renamed from: com.baidu.tts.d.a.e */
/* loaded from: classes.dex */
public class C1138e {

    /* renamed from: a */
    private Future<Void> f2688a;

    /* renamed from: b */
    private C1133b.CallableC1134a f2689b;

    /* renamed from: a */
    public void m36484a() {
        LoggerProxy.m36554d("EngineDownloadHandler", "before stop");
        try {
            LoggerProxy.m36554d("EngineDownloadHandler", "stop fileId=" + this.f2689b.m36493c().m36492a());
        } catch (Exception e) {
        }
        if (this.f2688a != null) {
            LoggerProxy.m36554d("EngineDownloadHandler", "unDone = " + this.f2688a.cancel(true));
        }
        if (this.f2689b != null) {
            this.f2689b.m36494b();
        }
        LoggerProxy.m36554d("EngineDownloadHandler", "after stop");
    }

    /* renamed from: a */
    public void m36483a(C1133b.CallableC1134a callableC1134a) {
        this.f2689b = callableC1134a;
    }

    /* renamed from: a */
    public void m36482a(Future<Void> future) {
        this.f2688a = future;
    }
}
