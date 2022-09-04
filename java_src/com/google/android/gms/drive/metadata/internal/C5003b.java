package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.AbstractC4996f;
import java.util.Collection;
/* renamed from: com.google.android.gms.drive.metadata.internal.b */
/* loaded from: classes2.dex */
public class C5003b extends AbstractC4996f<Boolean> {
    public C5003b(String str, int i) {
        super(str, i);
    }

    public C5003b(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo22100a(Bundle bundle, Boolean bool) {
        bundle.putBoolean(a(), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a_ */
    public Boolean mo17070c(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.m23884d(a(), i, i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public Boolean mo22097c(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(a()));
    }
}
