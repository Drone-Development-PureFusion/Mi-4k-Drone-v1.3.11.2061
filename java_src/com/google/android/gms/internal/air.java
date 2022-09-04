package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public abstract class air {

    /* renamed from: a */
    private static final ExecutorService f21952a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ajm("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m17198a() {
        return f21952a;
    }
}
