package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.AbstractC4996f;
/* renamed from: com.google.android.gms.drive.metadata.internal.p */
/* loaded from: classes2.dex */
public class C5019p extends AbstractC4996f<String> {
    public C5019p(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo22100a(Bundle bundle, String str) {
        bundle.putString(a(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public String mo22097c(Bundle bundle) {
        return bundle.getString(a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: f_ */
    public String mo17070c(DataHolder dataHolder, int i, int i2) {
        return dataHolder.m23886c(a(), i, i2);
    }
}
