package com.tencent.stat.common;

import android.content.Context;
/* renamed from: com.tencent.stat.common.f */
/* loaded from: classes2.dex */
public class C10341f {

    /* renamed from: a */
    static long f32235a = -1;

    /* renamed from: a */
    static long m5449a(Context context, String str) {
        return C10351p.m5381a(context, str, f32235a);
    }

    /* renamed from: a */
    static void m5448a(Context context, String str, long j) {
        C10351p.m5378b(context, str, j);
    }

    /* renamed from: a */
    public static synchronized boolean m5450a(Context context) {
        boolean z;
        synchronized (C10341f.class) {
            long m5449a = m5449a(context, "1.6.2_begin_protection");
            long m5449a2 = m5449a(context, "1.6.2_end__protection");
            if (m5449a <= 0 || m5449a2 != f32235a) {
                if (m5449a == f32235a) {
                    m5448a(context, "1.6.2_begin_protection", System.currentTimeMillis());
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized void m5447b(Context context) {
        synchronized (C10341f.class) {
            if (m5449a(context, "1.6.2_end__protection") == f32235a) {
                m5448a(context, "1.6.2_end__protection", System.currentTimeMillis());
            }
        }
    }
}
