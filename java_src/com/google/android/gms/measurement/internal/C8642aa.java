package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.measurement.internal.AbstractC8740y;
/* renamed from: com.google.android.gms.measurement.internal.aa */
/* loaded from: classes2.dex */
public class C8642aa extends AbstractC4600p<AbstractC8740y> {
    public C8642aa(Context context, Looper looper, AbstractC4600p.AbstractC4602b abstractC4602b, AbstractC4600p.AbstractC4603c abstractC4603c) {
        super(context, looper, 93, abstractC4602b, abstractC4603c, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC8740y mo7440b(IBinder iBinder) {
        return AbstractC8740y.AbstractBinderC8741a.m10327a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
