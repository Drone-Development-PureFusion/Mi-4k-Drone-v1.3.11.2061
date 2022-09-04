package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.C4670c;
import com.google.android.gms.common.util.C4681d;
import com.google.android.gms.common.util.C4687j;
import java.util.List;
/* renamed from: com.google.android.gms.common.stats.h */
/* loaded from: classes2.dex */
public class C4677h {

    /* renamed from: a */
    private static String f17288a = "WakeLockTracker";

    /* renamed from: b */
    private static C4677h f17289b = new C4677h();

    /* renamed from: c */
    private static Boolean f17290c;

    /* renamed from: a */
    public static C4677h m23179a() {
        return f17289b;
    }

    /* renamed from: a */
    private static boolean m23178a(Context context) {
        if (f17290c == null) {
            f17290c = Boolean.valueOf(m23175b(context));
        }
        return f17290c.booleanValue();
    }

    /* renamed from: b */
    private static boolean m23175b(Context context) {
        try {
            if (!C4681d.m23157a()) {
                return false;
            }
            return C4670c.C4672b.f17274a.m17161a().intValue() != C4673d.f17277b;
        } catch (SecurityException e) {
            return false;
        }
    }

    /* renamed from: a */
    public void m23177a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        m23176a(context, str, i, str2, str3, str4, i2, list, 0L);
    }

    /* renamed from: a */
    public void m23176a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (!m23178a(context)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String str5 = f17288a;
            String valueOf = String.valueOf(str);
            Log.e(str5, valueOf.length() != 0 ? "missing wakeLock key. ".concat(valueOf) : new String("missing wakeLock key. "));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (7 != i && 8 != i && 10 != i && 11 != i) {
            return;
        }
        try {
            context.startService(new Intent().setComponent(C4673d.f17276a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", new WakeLockEvent(currentTimeMillis, i, str2, i2, C4675f.m23183a(list), str, SystemClock.elapsedRealtime(), C4687j.m23133a(context), str3, C4675f.m23184a(context.getPackageName()), C4687j.m23131b(context), j, str4)));
        } catch (Exception e) {
            Log.wtf(f17288a, e);
        }
    }
}
