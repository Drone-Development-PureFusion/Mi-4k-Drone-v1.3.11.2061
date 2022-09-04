package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public abstract class aib {

    /* renamed from: a */
    private static final ExecutorService f21887a = Executors.newFixedThreadPool(2, new ajm("GAC_Executor"));

    /* renamed from: a */
    public static ExecutorService m17321a() {
        return f21887a;
    }
}
