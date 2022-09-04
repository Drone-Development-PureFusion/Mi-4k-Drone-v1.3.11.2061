package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p254c.C9803p;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.internal.nf */
/* loaded from: classes2.dex */
public class C7438nf {

    /* renamed from: a */
    private final Handler f24898a;

    /* renamed from: b */
    private final Executor f24899b;

    public C7438nf(@Nullable Executor executor) {
        this.f24899b = executor;
        if (this.f24899b != null) {
            this.f24898a = null;
        } else if (Looper.myLooper() != null) {
            this.f24898a = new Handler();
        } else {
            this.f24898a = null;
        }
    }

    /* renamed from: a */
    public void m14486a(@NonNull Runnable runnable) {
        C4588d.m23627a(runnable);
        if (this.f24898a != null) {
            this.f24898a.post(runnable);
        } else if (this.f24899b != null) {
            this.f24899b.execute(runnable);
        } else {
            C9803p.m6929a().m6925d(runnable);
        }
    }
}
