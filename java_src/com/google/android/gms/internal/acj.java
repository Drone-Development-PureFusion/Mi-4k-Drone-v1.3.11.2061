package com.google.android.gms.internal;

import android.os.StrictMode;
import com.google.android.gms.ads.internal.C3779u;
import java.util.concurrent.Callable;
@aaa
/* loaded from: classes.dex */
public class acj {
    /* renamed from: a */
    public static <T> T m18219a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return callable.call();
        } catch (Throwable th) {
            try {
                abr.b("Unexpected exception.", th);
                C3779u.m26886i().m18451a(th, "StrictModeUtil.runWithLaxStrictMode");
                StrictMode.setThreadPolicy(threadPolicy);
                return null;
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
    }
}
