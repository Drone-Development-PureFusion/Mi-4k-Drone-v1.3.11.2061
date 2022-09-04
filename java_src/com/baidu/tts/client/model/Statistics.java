package com.baidu.tts.client.model;

import android.content.Context;
import com.baidu.tts.p118p.C1249b;
/* loaded from: classes.dex */
public class Statistics {
    public static boolean isStatistics = true;

    /* renamed from: a */
    private C1249b f2671a;

    public Statistics(Context context) {
        this.f2671a = new C1249b(context);
    }

    public static void setEnable(boolean z) {
        isStatistics = z;
    }

    public int start() {
        this.f2671a.m36084a();
        return 0;
    }

    public int stop() {
        this.f2671a.m36083b();
        return 0;
    }
}
