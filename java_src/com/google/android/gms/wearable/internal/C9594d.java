package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.AbstractC9467i;
/* renamed from: com.google.android.gms.wearable.internal.d */
/* loaded from: classes2.dex */
public class C9594d extends AbstractC4531j implements AbstractC9467i {
    public C9594d(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.wearable.AbstractC9467i
    /* renamed from: c */
    public String mo7794c() {
        return e("asset_id");
    }

    @Override // com.google.android.gms.wearable.AbstractC9467i
    /* renamed from: d */
    public String mo7793d() {
        return e("asset_key");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC9467i mo7785a() {
        return new C9545b(this);
    }
}
