package com.google.android.gms.wearable;

import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractC4534m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C9597g;
/* renamed from: com.google.android.gms.wearable.j */
/* loaded from: classes2.dex */
public class C9627j extends AbstractC4534m<AbstractC9466h> implements AbstractC4502m {

    /* renamed from: b */
    private final Status f30152b;

    public C9627j(DataHolder dataHolder) {
        super(dataHolder);
        this.f30152b = new Status(dataHolder.m23883e());
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f30152b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: b */
    public AbstractC9466h mo7644a(int i, int i2) {
        return new C9597g(this.f16904a, i, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: h */
    protected String mo7642h() {
        return "path";
    }
}
