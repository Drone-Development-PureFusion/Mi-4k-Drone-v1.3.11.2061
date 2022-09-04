package com.baidu.tts.p098d.p100b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.database.C1154a;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.StringTool;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.baidu.tts.d.b.d */
/* loaded from: classes.dex */
public class C1147d {

    /* renamed from: a */
    private String f2706a;

    /* renamed from: b */
    private String f2707b;

    /* renamed from: c */
    private String f2708c;

    /* renamed from: d */
    private long f2709d = 0;

    /* renamed from: e */
    private C1144a f2710e = C1144a.m36474a();

    /* renamed from: f */
    private CopyOnWriteArraySet<DownloadHandler> f2711f = new CopyOnWriteArraySet<>();

    public C1147d(String str) {
        this.f2706a = str;
    }

    /* renamed from: j */
    private void m36421j() {
        this.f2710e.m36470a(this.f2707b, this.f2706a);
        this.f2710e.m36470a(this.f2708c, this.f2706a);
    }

    /* renamed from: a */
    public void m36439a() {
        this.f2711f.clear();
        m36421j();
    }

    /* renamed from: a */
    public void m36438a(DownloadHandler downloadHandler) {
        if (this.f2711f != null) {
            this.f2711f.add(downloadHandler);
        }
    }

    /* renamed from: a */
    public void m36437a(DownloadHandler downloadHandler, TtsError ttsError) {
        downloadHandler.updateFinish(this, ttsError);
        m36431b(downloadHandler);
    }

    /* renamed from: a */
    public void m36436a(ModelBags modelBags, C1154a c1154a) {
        c1154a.m36383a(modelBags);
        m36433a(c1154a);
    }

    /* renamed from: a */
    public void m36435a(C1145b c1145b) {
        if (this.f2711f != null) {
            Iterator<DownloadHandler> it2 = this.f2711f.iterator();
            while (it2.hasNext()) {
                it2.next().updateProgress(this);
            }
        }
    }

    /* renamed from: a */
    public void m36434a(C1145b c1145b, TtsError ttsError) {
        LoggerProxy.m36554d("ModelFlyweight", "onFileDownloadFailure");
        if (this.f2711f != null) {
            Iterator<DownloadHandler> it2 = this.f2711f.iterator();
            while (it2.hasNext()) {
                m36437a(it2.next(), ttsError);
            }
        }
    }

    /* renamed from: a */
    public boolean m36433a(C1154a c1154a) {
        Map<String, String> m36371e = c1154a.m36371e(this.f2706a);
        if (m36371e == null || m36371e.isEmpty()) {
            return false;
        }
        this.f2707b = DataTool.getMapValue(m36371e, EnumC1175g.TEXT_DATA_ID.m36317b());
        this.f2708c = DataTool.getMapValue(m36371e, EnumC1175g.SPEECH_DATA_ID.m36317b());
        boolean isEmpty = StringTool.isEmpty(this.f2707b);
        boolean isEmpty2 = StringTool.isEmpty(this.f2708c);
        if (!isEmpty && !isEmpty2) {
            return true;
        }
        c1154a.m36381a(this.f2706a);
        return false;
    }

    /* renamed from: b */
    public Set<String> m36432b() {
        HashSet hashSet = new HashSet();
        C1148e m36420a = C1148e.m36420a();
        C1146c m36415b = m36420a.m36415b(this.f2707b);
        C1146c m36415b2 = m36420a.m36415b(this.f2708c);
        String m36444a = m36415b.m36444a();
        String m36444a2 = m36415b2.m36444a();
        hashSet.add(m36444a);
        hashSet.add(m36444a2);
        return hashSet;
    }

    /* renamed from: b */
    public void m36431b(DownloadHandler downloadHandler) {
        boolean isSetEmpty = DataTool.isSetEmpty(this.f2711f);
        LoggerProxy.m36554d("ModelFlyweight", "unregisterListener 1isEmpty=" + isSetEmpty);
        if (!isSetEmpty) {
            this.f2711f.remove(downloadHandler);
            boolean isSetEmpty2 = DataTool.isSetEmpty(this.f2711f);
            LoggerProxy.m36554d("ModelFlyweight", "unregisterListener 2isEmpty=" + isSetEmpty2);
            if (isSetEmpty2) {
                m36421j();
                return;
            }
            Iterator<DownloadHandler> it2 = this.f2711f.iterator();
            while (it2.hasNext()) {
                LoggerProxy.m36554d("ModelFlyweight", "unregisterListener item=" + it2.next());
            }
        }
    }

    /* renamed from: b */
    public void m36430b(C1145b c1145b) {
        boolean m36422i = m36422i();
        LoggerProxy.m36554d("ModelFlyweight", "onFileDownloadSuccess isAllFileDownloadSuccess=" + m36422i);
        if (!m36422i || this.f2711f == null) {
            return;
        }
        Iterator<DownloadHandler> it2 = this.f2711f.iterator();
        while (it2.hasNext()) {
            m36437a(it2.next(), (TtsError) null);
        }
    }

    /* renamed from: c */
    public long m36429c() {
        m36427d();
        return this.f2709d;
    }

    /* renamed from: c */
    public void m36428c(DownloadHandler downloadHandler) {
        m36438a(downloadHandler);
        downloadHandler.updateStart(this);
    }

    /* renamed from: d */
    public void m36427d() {
        if (this.f2709d == 0) {
            m36426e();
        }
    }

    /* renamed from: e */
    public void m36426e() {
        C1148e m36420a = C1148e.m36420a();
        String m36441b = m36420a.m36415b(this.f2707b).m36441b();
        String m36441b2 = m36420a.m36415b(this.f2708c).m36441b();
        Long valueOf = Long.valueOf(Long.parseLong(m36441b));
        Long valueOf2 = Long.valueOf(Long.parseLong(m36441b2));
        this.f2709d = valueOf2.longValue() + valueOf.longValue();
    }

    /* renamed from: f */
    public Set<String> m36425f() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f2707b);
        hashSet.add(this.f2708c);
        return hashSet;
    }

    /* renamed from: g */
    public String m36424g() {
        return this.f2706a;
    }

    /* renamed from: h */
    public long m36423h() {
        return this.f2710e.m36465d(this.f2707b) + this.f2710e.m36465d(this.f2708c);
    }

    /* renamed from: i */
    public boolean m36422i() {
        return this.f2710e.m36464e(this.f2707b) == 7 && this.f2710e.m36464e(this.f2708c) == 7;
    }
}
