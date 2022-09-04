package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;
import java.io.File;
/* renamed from: com.google.android.gms.common.util.x */
/* loaded from: classes2.dex */
public class C4701x {
    @TargetApi(21)
    /* renamed from: a */
    public static File m23092a(Context context) {
        return C4696s.m23103k() ? context.getNoBackupFilesDir() : m23091a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: a */
    private static synchronized File m23091a(File file) {
        synchronized (C4701x.class) {
            if (!file.exists() && !file.mkdirs() && !file.exists()) {
                String valueOf = String.valueOf(file.getPath());
                Log.w("SupportV4Utils", valueOf.length() != 0 ? "Unable to create no-backup dir ".concat(valueOf) : new String("Unable to create no-backup dir "));
                file = null;
            }
        }
        return file;
    }
}
