package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4507r;
import com.google.android.gms.common.api.C4511v;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes2.dex */
public class C4597m {
    @NonNull
    /* renamed from: a */
    public static C4507r m23597a(@NonNull ConnectionResult connectionResult) {
        return m23596a(new Status(connectionResult.m24046c(), connectionResult.m24044e(), connectionResult.m24045d()));
    }

    @NonNull
    /* renamed from: a */
    public static C4507r m23596a(@NonNull Status status) {
        return status.m24019e() ? new C4511v(status) : new C4507r(status);
    }
}
