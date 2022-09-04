package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.AbstractC4996f;
/* renamed from: com.google.android.gms.drive.metadata.internal.f */
/* loaded from: classes2.dex */
public class C5008f extends AbstractC4996f<Integer> {
    public C5008f(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo22100a(Bundle bundle, Integer num) {
        bundle.putInt(a(), num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public Integer mo22097c(Bundle bundle) {
        return Integer.valueOf(bundle.getInt(a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: c_ */
    public Integer mo17070c(DataHolder dataHolder, int i, int i2) {
        return Integer.valueOf(dataHolder.m23888b(a(), i, i2));
    }
}
