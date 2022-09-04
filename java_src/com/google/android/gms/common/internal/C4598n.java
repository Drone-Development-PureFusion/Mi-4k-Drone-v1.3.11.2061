package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes2.dex */
public final class C4598n {
    /* renamed from: a */
    public static void m23595a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    /* renamed from: a */
    public static void m23594a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            Log.e("Asserts", new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length()).append("checkMainThread: current thread ").append(valueOf).append(" IS NOT the main thread ").append(valueOf2).append("!").toString());
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m23593a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m23592a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m23591b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            Log.e("Asserts", new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length()).append("checkNotMainThread: current thread ").append(valueOf).append(" IS the main thread ").append(valueOf2).append("!").toString());
            throw new IllegalStateException(str);
        }
    }
}
