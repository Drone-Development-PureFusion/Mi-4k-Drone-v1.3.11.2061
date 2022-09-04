package com.mob.commons;

import android.content.Context;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ResHelper;
import java.io.File;
/* renamed from: com.mob.commons.c */
/* loaded from: classes2.dex */
public class C10063c {
    /* renamed from: a */
    public static synchronized boolean m6318a(Context context, String str) {
        boolean z;
        synchronized (C10063c.class) {
            try {
                z = new File(ResHelper.getCacheRoot(context), str).exists();
            } catch (Throwable th) {
                MobLog.getInstance().m6187w(th);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized void m6317b(Context context, String str) {
        synchronized (C10063c.class) {
            try {
                File file = new File(ResHelper.getCacheRoot(context), str);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (!file.exists()) {
                    file.createNewFile();
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m6316c(Context context, String str) {
        synchronized (C10063c.class) {
            try {
                File file = new File(ResHelper.getCacheRoot(context), str);
                if (file.exists()) {
                    file.delete();
                }
            } finally {
            }
        }
    }
}
