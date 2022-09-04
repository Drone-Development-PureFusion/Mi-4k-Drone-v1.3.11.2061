package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.AbstractC4999i;
import java.util.Date;
/* renamed from: com.google.android.gms.drive.metadata.internal.d */
/* loaded from: classes2.dex */
public class C5005d extends AbstractC4999i<Date> {
    public C5005d(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a */
    public void mo22100a(Bundle bundle, Date date) {
        bundle.putLong(a(), date.getTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public Date mo22097c(Bundle bundle) {
        return new Date(bundle.getLong(a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b_ */
    public Date mo17070c(DataHolder dataHolder, int i, int i2) {
        return new Date(dataHolder.m23893a(a(), i, i2));
    }
}
