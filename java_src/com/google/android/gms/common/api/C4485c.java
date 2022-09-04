package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.C4588d;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.common.api.c */
/* loaded from: classes2.dex */
public final class C4485c implements AbstractC4502m {

    /* renamed from: a */
    private final Status f16810a;

    /* renamed from: b */
    private final AbstractC4494i<?>[] f16811b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4485c(Status status, AbstractC4494i<?>[] abstractC4494iArr) {
        this.f16810a = status;
        this.f16811b = abstractC4494iArr;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f16810a;
    }

    /* renamed from: a */
    public <R extends AbstractC4502m> R m23983a(C4486d<R> c4486d) {
        C4588d.m23618b(c4486d.f16812a < this.f16811b.length, "The result token does not belong to this batch");
        return (R) this.f16811b[c4486d.f16812a].mo13675a(0L, TimeUnit.MILLISECONDS);
    }
}
