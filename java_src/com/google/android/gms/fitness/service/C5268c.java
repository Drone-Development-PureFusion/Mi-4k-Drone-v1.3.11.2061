package com.google.android.gms.fitness.service;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.fitness.data.AbstractC5167y;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.List;
/* renamed from: com.google.android.gms.fitness.service.c */
/* loaded from: classes2.dex */
class C5268c implements AbstractC5266a {

    /* renamed from: a */
    private final AbstractC5167y f19138a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5268c(AbstractC5167y abstractC5167y) {
        this.f19138a = (AbstractC5167y) C4588d.m23627a(abstractC5167y);
    }

    @Override // com.google.android.gms.fitness.service.AbstractC5266a
    /* renamed from: a */
    public void mo20844a(DataPoint dataPoint) {
        dataPoint.m21714h();
        this.f19138a.mo21081a(dataPoint);
    }

    @Override // com.google.android.gms.fitness.service.AbstractC5266a
    /* renamed from: a */
    public void mo20843a(List<DataPoint> list) {
        for (DataPoint dataPoint : list) {
            mo20844a(dataPoint);
        }
    }
}
