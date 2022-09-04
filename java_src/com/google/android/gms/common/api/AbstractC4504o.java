package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4502m;
/* renamed from: com.google.android.gms.common.api.o */
/* loaded from: classes2.dex */
public abstract class AbstractC4504o<R extends AbstractC4502m> implements AbstractC4503n<R> {
    /* renamed from: a */
    public abstract void mo23947a(@NonNull Status status);

    @Override // com.google.android.gms.common.api.AbstractC4503n
    /* renamed from: a */
    public final void mo7161a(@NonNull R r) {
        Status mo7645a = r.mo7645a();
        if (mo7645a.m24018f()) {
            mo23946b(r);
            return;
        }
        mo23947a(mo7645a);
        if (!(r instanceof AbstractC4500k)) {
            return;
        }
        try {
            ((AbstractC4500k) r).mo7804b();
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(r);
            Log.w("ResultCallbacks", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
        }
    }

    /* renamed from: b */
    public abstract void mo23946b(@NonNull R r);
}
