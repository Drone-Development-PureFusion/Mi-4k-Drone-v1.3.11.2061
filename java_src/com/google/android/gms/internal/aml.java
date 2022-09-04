package com.google.android.gms.internal;

import android.os.StrictMode;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public class aml {
    /* renamed from: a */
    public static <T> T m16789a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            return null;
        }
    }
}
