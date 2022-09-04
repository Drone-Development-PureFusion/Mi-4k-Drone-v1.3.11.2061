package com.google.android.gms.fitness.data;

import com.google.android.gms.internal.akg;
import com.google.android.gms.internal.aki;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.fitness.data.j */
/* loaded from: classes2.dex */
public class C5152j implements akg<DataPoint, DataType> {

    /* renamed from: a */
    public static final C5152j f18749a = new C5152j();

    private C5152j() {
    }

    @Override // com.google.android.gms.internal.akg
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public long mo17044a(DataPoint dataPoint, TimeUnit timeUnit) {
        return dataPoint.m21719c(timeUnit) - dataPoint.m21721b(timeUnit);
    }

    @Override // com.google.android.gms.internal.akg
    /* renamed from: a */
    public aki<DataType> mo17047a() {
        return C5153k.f18750a;
    }

    @Override // com.google.android.gms.internal.akg
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public String mo17043b(DataPoint dataPoint) {
        return dataPoint.m21723b().m21659a();
    }

    @Override // com.google.android.gms.internal.akg
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public boolean mo17041c(DataPoint dataPoint, int i) {
        return dataPoint.m21735a(i).m21520a();
    }

    @Override // com.google.android.gms.internal.akg
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int mo17042b(DataPoint dataPoint, int i) {
        return dataPoint.m21735a(i).m21511c();
    }

    @Override // com.google.android.gms.internal.akg
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public DataType mo17046a(DataPoint dataPoint) {
        return dataPoint.m21723b();
    }

    @Override // com.google.android.gms.internal.akg
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public double mo17045a(DataPoint dataPoint, int i) {
        return dataPoint.m21735a(i).m21509d();
    }
}
