package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* loaded from: classes2.dex */
public abstract class aht implements AbstractC4500k, AbstractC4502m {

    /* renamed from: b */
    protected final Status f21787b;

    /* renamed from: c */
    protected final DataHolder f21788c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aht(DataHolder dataHolder, Status status) {
        this.f21787b = status;
        this.f21788c = dataHolder;
    }

    /* renamed from: a */
    public Status mo7645a() {
        return this.f21787b;
    }

    @Override // com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public void mo7804b() {
        if (this.f21788c != null) {
            this.f21788c.close();
        }
    }
}
