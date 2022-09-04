package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.common.api.l */
/* loaded from: classes2.dex */
public abstract class AbstractC4501l<R extends AbstractC4502m> extends AbstractC4504o<R> {

    /* renamed from: a */
    private final Activity f16856a;

    /* renamed from: b */
    private final int f16857b;

    protected AbstractC4501l(@NonNull Activity activity, int i) {
        this.f16856a = (Activity) C4588d.m23626a(activity, "Activity must not be null");
        this.f16857b = i;
    }

    @Override // com.google.android.gms.common.api.AbstractC4504o
    /* renamed from: a */
    public final void mo23947a(@NonNull Status status) {
        if (!status.m24019e()) {
            m23948b(status);
            return;
        }
        try {
            status.m24023a(this.f16856a, this.f16857b);
        } catch (IntentSender.SendIntentException e) {
            Log.e("ResolvingResultCallback", "Failed to start resolution", e);
            m23948b(new Status(8));
        }
    }

    /* renamed from: b */
    public abstract void m23948b(@NonNull Status status);

    @Override // com.google.android.gms.common.api.AbstractC4504o
    /* renamed from: b */
    public abstract void mo23946b(@NonNull R r);
}
