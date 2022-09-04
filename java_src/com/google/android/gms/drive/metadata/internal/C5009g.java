package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.AbstractC4996f;
/* renamed from: com.google.android.gms.drive.metadata.internal.g */
/* loaded from: classes2.dex */
public class C5009g extends AbstractC4996f<Long> {
    public C5009g(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo22100a(Bundle bundle, Long l) {
        bundle.putLong(a(), l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public Long mo22097c(Bundle bundle) {
        return Long.valueOf(bundle.getLong(a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: d_ */
    public Long mo17070c(DataHolder dataHolder, int i, int i2) {
        return Long.valueOf(dataHolder.m23893a(a(), i, i2));
    }
}
