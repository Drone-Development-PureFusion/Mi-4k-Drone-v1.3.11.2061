package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i */
/* loaded from: classes2.dex */
public class C8718i {

    /* renamed from: a */
    private final AbstractC4682e f27904a;

    /* renamed from: b */
    private long f27905b;

    public C8718i(AbstractC4682e abstractC4682e) {
        C4588d.m23627a(abstractC4682e);
        this.f27904a = abstractC4682e;
    }

    /* renamed from: a */
    public void m10562a() {
        this.f27905b = this.f27904a.mo16432b();
    }

    /* renamed from: a */
    public boolean m10561a(long j) {
        return this.f27905b == 0 || this.f27904a.mo16432b() - this.f27905b >= j;
    }

    /* renamed from: b */
    public void m10560b() {
        this.f27905b = 0L;
    }
}
