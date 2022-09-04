package com.baidu.tts.p098d.p100b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.database.C1154a;
import com.baidu.tts.p098d.p099a.C1138e;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.MD5;
import com.baidu.tts.tools.StringTool;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.baidu.tts.d.b.b */
/* loaded from: classes.dex */
public class C1145b {

    /* renamed from: a */
    private String f2696a;

    /* renamed from: b */
    private long f2697b;

    /* renamed from: c */
    private String f2698c;

    /* renamed from: f */
    private String f2701f;

    /* renamed from: g */
    private C1138e f2702g;

    /* renamed from: d */
    private volatile int f2699d = 0;

    /* renamed from: e */
    private volatile int f2700e = 9;

    /* renamed from: h */
    private CopyOnWriteArraySet<String> f2703h = new CopyOnWriteArraySet<>();

    public C1145b(String str) {
        this.f2696a = str;
    }

    /* renamed from: j */
    private void m36445j() {
        if (this.f2702g != null) {
            LoggerProxy.m36554d("FsFileInfoFlyweight", "unregisterObserver stop");
            this.f2702g.m36484a();
            this.f2702g = null;
            if (this.f2699d != 4 && this.f2699d != 5) {
                return;
            }
            this.f2699d = 8;
            this.f2700e = 8;
            C1144a.m36474a().m36469b().m36380a(this.f2696a, this.f2700e);
        }
    }

    /* renamed from: a */
    public int m36459a(C1146c c1146c) {
        File file = new File(this.f2696a);
        if (file.exists()) {
            this.f2697b = file.length();
            if (this.f2697b == Long.parseLong(c1146c.m36441b())) {
                this.f2698c = MD5.getInstance().getBigFileMd5(file);
                if (c1146c.m36440c().equalsIgnoreCase(this.f2698c)) {
                    this.f2699d = 7;
                } else {
                    this.f2699d = 3;
                }
            } else {
                this.f2699d = 2;
            }
        } else {
            this.f2699d = 1;
        }
        return this.f2699d;
    }

    /* renamed from: a */
    public long m36463a() {
        return this.f2697b;
    }

    /* renamed from: a */
    public void m36462a(long j, long j2) {
        C1144a m36474a = C1144a.m36474a();
        this.f2697b = j;
        if (this.f2703h != null) {
            Iterator<String> it2 = this.f2703h.iterator();
            while (it2.hasNext()) {
                m36474a.m36468b(it2.next()).m36435a(this);
            }
        }
    }

    /* renamed from: a */
    public void m36461a(TtsError ttsError) {
        LoggerProxy.m36554d("FsFileInfoFlyweight", "onDownloadFailure");
        this.f2699d = 8;
        this.f2700e = 8;
        C1144a m36474a = C1144a.m36474a();
        m36474a.m36469b().m36380a(this.f2696a, this.f2700e);
        if (this.f2703h != null) {
            Iterator<String> it2 = this.f2703h.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                m36474a.m36468b(next).m36434a(this, ttsError);
                this.f2703h.remove(next);
            }
        }
    }

    /* renamed from: a */
    public void m36460a(C1138e c1138e) {
        this.f2702g = c1138e;
    }

    /* renamed from: a */
    public void m36457a(String str) {
        if (this.f2703h != null) {
            this.f2703h.add(str);
        }
    }

    /* renamed from: a */
    public boolean m36458a(C1154a c1154a) {
        C1146c m36415b = C1148e.m36420a().m36415b(this.f2701f);
        if (this.f2699d == 0) {
            m36459a(m36415b);
            m36455b(c1154a);
        } else if (this.f2699d == 8 || this.f2699d == 7) {
            m36459a(m36415b);
        }
        if (this.f2699d == 7 && this.f2700e != 7) {
            this.f2700e = 7;
            c1154a.m36380a(this.f2696a, this.f2700e);
        }
        LoggerProxy.m36554d("FsFileInfoFlyweight", "fileId=" + this.f2701f + "--filestate=" + this.f2699d + "--dbstate=" + this.f2700e);
        return (this.f2699d == 4 || this.f2699d == 5 || this.f2699d == 7) ? false : true;
    }

    /* renamed from: b */
    public int m36455b(C1154a c1154a) {
        String mapValue = DataTool.getMapValue(c1154a.m36373c(this.f2696a), EnumC1175g.STATE.m36317b());
        if (StringTool.isEmpty(mapValue)) {
            this.f2700e = 9;
        } else {
            this.f2700e = Integer.parseInt(mapValue);
        }
        return this.f2700e;
    }

    /* renamed from: b */
    public String m36456b() {
        return this.f2696a;
    }

    /* renamed from: b */
    public void m36454b(String str) {
        boolean isSetEmpty = DataTool.isSetEmpty(this.f2703h);
        LoggerProxy.m36554d("FsFileInfoFlyweight", "unregisterObserver 1isEmpty=" + isSetEmpty);
        if (!isSetEmpty) {
            this.f2703h.remove(str);
            boolean isSetEmpty2 = DataTool.isSetEmpty(this.f2703h);
            LoggerProxy.m36554d("FsFileInfoFlyweight", "unregisterObserver 2isEmpty=" + isSetEmpty2);
            if (!isSetEmpty2) {
                return;
            }
            m36445j();
        }
    }

    /* renamed from: c */
    public String m36453c() {
        return this.f2701f;
    }

    /* renamed from: c */
    public void m36452c(String str) {
        this.f2701f = str;
    }

    /* renamed from: d */
    public int m36451d() {
        return this.f2699d;
    }

    /* renamed from: e */
    public boolean m36450e() {
        if (this.f2699d == 7 || this.f2699d == 4 || this.f2699d == 5) {
            return false;
        }
        return this.f2697b >= Long.parseLong(C1148e.m36420a().m36415b(this.f2701f).m36441b());
    }

    /* renamed from: f */
    public boolean m36449f() {
        return new File(this.f2696a).delete();
    }

    /* renamed from: g */
    public void m36448g() {
        LoggerProxy.m36554d("FsFileInfoFlyweight", "queueForDownload fileId=" + this.f2701f + "--filestate=" + this.f2699d);
        this.f2699d = 4;
    }

    /* renamed from: h */
    public void m36447h() {
        this.f2699d = 5;
        this.f2700e = 6;
        C1144a.m36474a().m36469b().m36380a(this.f2696a, this.f2700e);
    }

    /* renamed from: i */
    public void m36446i() {
        LoggerProxy.m36554d("FsFileInfoFlyweight", "onDownloadSuccess");
        this.f2699d = 7;
        this.f2700e = 7;
        C1144a m36474a = C1144a.m36474a();
        m36474a.m36469b().m36380a(this.f2696a, this.f2700e);
        if (this.f2703h != null) {
            Iterator<String> it2 = this.f2703h.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                m36474a.m36468b(next).m36430b(this);
                this.f2703h.remove(next);
            }
        }
    }
}
