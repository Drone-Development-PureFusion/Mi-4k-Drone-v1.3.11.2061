package com.google.android.gms.wearable;

import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractC4534m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C9592br;
/* renamed from: com.google.android.gms.wearable.g */
/* loaded from: classes2.dex */
public class C9465g extends AbstractC4534m<AbstractC9464f> implements AbstractC4502m {

    /* renamed from: b */
    private final Status f29856b;

    public C9465g(DataHolder dataHolder) {
        super(dataHolder);
        this.f29856b = new Status(dataHolder.m23883e());
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f29856b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: b */
    public AbstractC9464f mo7644a(int i, int i2) {
        return new C9592br(this.f16904a, i, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: h */
    protected String mo7642h() {
        return "path";
    }
}
