package com.baidu.tts.p098d.p100b;

import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.database.C1154a;
/* renamed from: com.baidu.tts.d.b.a */
/* loaded from: classes.dex */
public class C1144a {

    /* renamed from: a */
    private static volatile C1144a f2693a = null;

    /* renamed from: b */
    private C1148e f2694b = C1148e.m36420a();

    /* renamed from: c */
    private C1154a f2695c;

    private C1144a() {
    }

    /* renamed from: a */
    public static C1144a m36474a() {
        if (f2693a == null) {
            synchronized (C1144a.class) {
                if (f2693a == null) {
                    f2693a = new C1144a();
                }
            }
        }
        return f2693a;
    }

    /* renamed from: a */
    public C1145b m36471a(String str) {
        return this.f2694b.m36414c(str);
    }

    /* renamed from: a */
    public void m36473a(DownloadHandler downloadHandler) {
        this.f2694b.m36419a(downloadHandler);
    }

    /* renamed from: a */
    public void m36472a(C1154a c1154a) {
        this.f2695c = c1154a;
    }

    /* renamed from: a */
    public void m36470a(String str, String str2) {
        this.f2694b.m36417a(str, str2);
    }

    /* renamed from: b */
    public C1147d m36468b(String str) {
        return this.f2694b.m36418a(str);
    }

    /* renamed from: b */
    public C1154a m36469b() {
        return this.f2695c;
    }

    /* renamed from: c */
    public C1146c m36466c(String str) {
        return this.f2694b.m36415b(str);
    }

    /* renamed from: c */
    public void m36467c() {
        this.f2694b.m36416b();
    }

    /* renamed from: d */
    public long m36465d(String str) {
        return this.f2694b.m36412e(str);
    }

    /* renamed from: e */
    public int m36464e(String str) {
        return this.f2694b.m36411f(str);
    }
}
