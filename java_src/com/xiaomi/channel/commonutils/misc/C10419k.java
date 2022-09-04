package com.xiaomi.channel.commonutils.misc;

import android.os.Looper;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
/* renamed from: com.xiaomi.channel.commonutils.misc.k */
/* loaded from: classes2.dex */
public class C10419k {
    /* renamed from: a */
    public static void m5233a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new RuntimeException("can't do this on ui thread");
        }
    }

    /* renamed from: a */
    public static void m5232a(boolean z) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread() || !z) {
            if (Looper.getMainLooper().getThread() != Thread.currentThread() || z) {
                return;
            }
            AbstractC10404b.m5269a("can't do this on ui thread when debug_switch:" + z);
            return;
        }
        throw new RuntimeException("can't do this on ui thread when debug_switch:" + z);
    }
}
