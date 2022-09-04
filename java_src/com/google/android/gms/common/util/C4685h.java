package com.google.android.gms.common.util;

import android.os.SystemClock;
/* renamed from: com.google.android.gms.common.util.h */
/* loaded from: classes2.dex */
public final class C4685h implements AbstractC4682e {

    /* renamed from: a */
    private static C4685h f17292a;

    /* renamed from: d */
    public static synchronized AbstractC4682e m23138d() {
        C4685h c4685h;
        synchronized (C4685h.class) {
            if (f17292a == null) {
                f17292a = new C4685h();
            }
            c4685h = f17292a;
        }
        return c4685h;
    }

    @Override // com.google.android.gms.common.util.AbstractC4682e
    /* renamed from: a */
    public long mo16434a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.AbstractC4682e
    /* renamed from: b */
    public long mo16432b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.AbstractC4682e
    /* renamed from: c */
    public long mo16431c() {
        return System.nanoTime();
    }
}
