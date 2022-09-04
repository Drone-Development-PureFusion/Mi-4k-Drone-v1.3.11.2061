package com.baidu.tts.p090b.p094b;

import com.baidu.tts.p090b.p094b.p096b.AbstractC1118c;
import com.baidu.tts.p090b.p094b.p096b.C1116b;
/* renamed from: com.baidu.tts.b.b.b */
/* loaded from: classes.dex */
public class C1114b {

    /* renamed from: a */
    private static volatile C1114b f2579a = null;

    private C1114b() {
    }

    /* renamed from: a */
    public static C1114b m36586a() {
        if (f2579a == null) {
            synchronized (C1114b.class) {
                if (f2579a == null) {
                    f2579a = new C1114b();
                }
            }
        }
        return f2579a;
    }

    /* renamed from: c */
    private C1116b m36584c() {
        return new C1116b();
    }

    /* renamed from: b */
    public AbstractC1118c m36585b() {
        return m36584c();
    }
}
