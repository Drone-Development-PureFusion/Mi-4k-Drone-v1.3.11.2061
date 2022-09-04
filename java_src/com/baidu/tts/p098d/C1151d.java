package com.baidu.tts.p098d;

import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.p112l.C1202a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: com.baidu.tts.d.d */
/* loaded from: classes.dex */
public class C1151d {

    /* renamed from: c */
    private C1202a f2725c;

    /* renamed from: b */
    private ConcurrentMap<String, DownloadHandler> f2724b = new ConcurrentHashMap();

    /* renamed from: a */
    private C1149c f2723a = C1149c.m36410a();

    /* renamed from: c */
    private void m36396c() {
        for (DownloadHandler downloadHandler : this.f2724b.values()) {
            downloadHandler.stop();
        }
    }

    /* renamed from: a */
    public DownloadHandler m36400a(C1143b c1143b) {
        DownloadHandler m36398a;
        if (c1143b == null || !c1143b.m36476b() || (m36398a = m36398a(c1143b.m36479a())) == null) {
            return null;
        }
        m36398a.reset(c1143b);
        return this.f2723a.m36409a(m36398a);
    }

    /* renamed from: a */
    public synchronized DownloadHandler m36398a(String str) {
        DownloadHandler downloadHandler;
        try {
            downloadHandler = this.f2724b.get(str);
            if (downloadHandler == null) {
                downloadHandler = new DownloadHandler(this.f2725c);
                this.f2724b.put(str, downloadHandler);
            }
        } catch (Exception e) {
            downloadHandler = null;
        }
        return downloadHandler;
    }

    /* renamed from: a */
    public void m36401a() {
        this.f2723a.m36404g();
    }

    /* renamed from: a */
    public void m36399a(C1202a c1202a) {
        this.f2725c = c1202a;
        this.f2723a.m36407a(c1202a);
    }

    /* renamed from: b */
    public void m36397b() {
        m36396c();
        this.f2723a.mo36088e();
    }
}
