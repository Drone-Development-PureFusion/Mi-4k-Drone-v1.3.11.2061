package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
/* renamed from: com.google.android.gms.common.util.j */
/* loaded from: classes2.dex */
public final class C4687j {

    /* renamed from: b */
    private static long f17298b;

    /* renamed from: a */
    private static IntentFilter f17297a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: c */
    private static float f17299c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m23133a(Context context) {
        int i = 1;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f17297a);
        boolean z = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        int i2 = (m23132a(powerManager) ? 1 : 0) << 1;
        if (!z) {
            i = 0;
        }
        return i2 | i;
    }

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m23132a(PowerManager powerManager) {
        return C4696s.m23105i() ? powerManager.isInteractive() : powerManager.isScreenOn();
    }

    /* renamed from: b */
    public static synchronized float m23131b(Context context) {
        float f;
        synchronized (C4687j.class) {
            if (SystemClock.elapsedRealtime() - f17298b >= 60000 || Float.isNaN(f17299c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f17297a);
                if (registerReceiver != null) {
                    f17299c = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
                }
                f17298b = SystemClock.elapsedRealtime();
                f = f17299c;
            } else {
                f = f17299c;
            }
        }
        return f;
    }
}
