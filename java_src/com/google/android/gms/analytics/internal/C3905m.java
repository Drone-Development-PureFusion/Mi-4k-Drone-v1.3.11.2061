package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.analytics.internal.m */
/* loaded from: classes2.dex */
public class C3905m {

    /* renamed from: a */
    private final AbstractC4682e f15119a;

    /* renamed from: b */
    private long f15120b;

    public C3905m(AbstractC4682e abstractC4682e) {
        C4588d.m23627a(abstractC4682e);
        this.f15119a = abstractC4682e;
    }

    public C3905m(AbstractC4682e abstractC4682e, long j) {
        C4588d.m23627a(abstractC4682e);
        this.f15119a = abstractC4682e;
        this.f15120b = j;
    }

    /* renamed from: a */
    public void m26222a() {
        this.f15120b = this.f15119a.mo16432b();
    }

    /* renamed from: a */
    public boolean m26221a(long j) {
        return this.f15120b == 0 || this.f15119a.mo16432b() - this.f15120b > j;
    }

    /* renamed from: b */
    public void m26220b() {
        this.f15120b = 0L;
    }
}
