package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.internal.ais;
/* renamed from: com.google.android.gms.common.api.p */
/* loaded from: classes2.dex */
public abstract class AbstractC4505p<R extends AbstractC4502m, S extends AbstractC4502m> {
    @NonNull
    /* renamed from: a */
    public Status m23945a(@NonNull Status status) {
        return status;
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    public abstract AbstractC4494i<S> m23944a(@NonNull R r);

    @NonNull
    /* renamed from: b */
    public final AbstractC4494i<S> m23943b(@NonNull Status status) {
        return new ais(status);
    }
}
