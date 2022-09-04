package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.google.android.gms.internal.eo */
/* loaded from: classes2.dex */
public class C6908eo {

    /* renamed from: a */
    public static final Integer f23305a = 0;

    /* renamed from: b */
    public static final Integer f23306b = 1;

    /* renamed from: c */
    private final Context f23307c;

    /* renamed from: d */
    private final ExecutorService f23308d;

    public C6908eo(Context context) {
        this(context, Executors.newSingleThreadExecutor());
    }

    C6908eo(Context context, ExecutorService executorService) {
        this.f23307c = context;
        this.f23308d = executorService;
    }
}
