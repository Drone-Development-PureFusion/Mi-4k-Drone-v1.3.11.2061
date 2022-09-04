package com.google.android.gms.fitness.data;

import com.google.android.gms.internal.aki;
/* renamed from: com.google.android.gms.fitness.data.k */
/* loaded from: classes2.dex */
class C5153k implements aki<DataType> {

    /* renamed from: a */
    public static final C5153k f18750a = new C5153k();

    private C5153k() {
    }

    /* renamed from: d */
    private Field m21451d(DataType dataType, int i) {
        return dataType.m21656b().get(i);
    }

    @Override // com.google.android.gms.internal.aki
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public String mo17032b(DataType dataType) {
        return dataType.m21659a();
    }

    @Override // com.google.android.gms.internal.aki
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public String mo17030c(DataType dataType, int i) {
        return m21451d(dataType, i).m21628a();
    }

    @Override // com.google.android.gms.internal.aki
    /* renamed from: a */
    public boolean mo17033a(String str) {
        return C5158p.m21438a(str) != null;
    }

    @Override // com.google.android.gms.internal.aki
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int mo17035a(DataType dataType) {
        return dataType.m21656b().size();
    }

    @Override // com.google.android.gms.internal.aki
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean mo17031b(DataType dataType, int i) {
        return Boolean.TRUE.equals(m21451d(dataType, i).m21621c());
    }

    @Override // com.google.android.gms.internal.aki
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public int mo17034a(DataType dataType, int i) {
        return m21451d(dataType, i).m21623b();
    }
}
