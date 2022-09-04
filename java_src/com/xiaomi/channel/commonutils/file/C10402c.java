package com.xiaomi.channel.commonutils.file;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import java.io.File;
/* renamed from: com.xiaomi.channel.commonutils.file.c */
/* loaded from: classes2.dex */
public class C10402c {
    /* renamed from: a */
    public static boolean m5280a() {
        try {
            return Environment.getExternalStorageState().equals("removed");
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m5279b() {
        try {
            return !Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m5278c() {
        return m5276e() <= 102400;
    }

    /* renamed from: d */
    public static boolean m5277d() {
        return !m5279b() && !m5278c() && !m5280a();
    }

    /* renamed from: e */
    public static long m5276e() {
        File externalStorageDirectory;
        if (!m5279b() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                return (statFs.getAvailableBlocks() - 4) * statFs.getBlockSize();
            } catch (Throwable th) {
                return 0L;
            }
        }
        return 0L;
    }
}
