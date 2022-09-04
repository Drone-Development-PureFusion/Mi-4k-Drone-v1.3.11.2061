package com.baidu.tts.p098d.p100b;

import com.baidu.tts.client.model.DownloadHandler;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.baidu.tts.d.b.e */
/* loaded from: classes.dex */
public class C1148e {

    /* renamed from: a */
    private static volatile C1148e f2712a = null;

    /* renamed from: b */
    private ConcurrentHashMap<String, C1147d> f2713b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private ConcurrentHashMap<String, C1146c> f2714c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private ConcurrentHashMap<String, C1145b> f2715d = new ConcurrentHashMap<>();

    private C1148e() {
    }

    /* renamed from: a */
    public static C1148e m36420a() {
        if (f2712a == null) {
            synchronized (C1148e.class) {
                if (f2712a == null) {
                    f2712a = new C1148e();
                }
            }
        }
        return f2712a;
    }

    /* renamed from: a */
    public C1147d m36418a(String str) {
        try {
            C1147d c1147d = new C1147d(str);
            C1147d putIfAbsent = this.f2713b.putIfAbsent(str, c1147d);
            return putIfAbsent == null ? c1147d : putIfAbsent;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public void m36419a(DownloadHandler downloadHandler) {
        m36418a(downloadHandler.getModelId()).m36431b(downloadHandler);
    }

    /* renamed from: a */
    public void m36417a(String str, String str2) {
        C1145b m36413d = m36413d(str);
        if (m36413d != null) {
            m36413d.m36454b(str2);
        }
    }

    /* renamed from: b */
    public C1146c m36415b(String str) {
        try {
            C1146c c1146c = new C1146c(str);
            C1146c putIfAbsent = this.f2714c.putIfAbsent(str, c1146c);
            return putIfAbsent == null ? c1146c : putIfAbsent;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: b */
    public void m36416b() {
        for (C1147d c1147d : this.f2713b.values()) {
            c1147d.m36439a();
        }
    }

    /* renamed from: c */
    public C1145b m36414c(String str) {
        try {
            C1145b c1145b = new C1145b(str);
            C1145b putIfAbsent = this.f2715d.putIfAbsent(str, c1145b);
            return putIfAbsent == null ? c1145b : putIfAbsent;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: d */
    public C1145b m36413d(String str) {
        C1146c m36415b = m36415b(str);
        if (m36415b != null) {
            return m36414c(m36415b.m36444a());
        }
        return null;
    }

    /* renamed from: e */
    public long m36412e(String str) {
        return m36413d(str).m36463a();
    }

    /* renamed from: f */
    public int m36411f(String str) {
        return m36413d(str).m36451d();
    }
}
