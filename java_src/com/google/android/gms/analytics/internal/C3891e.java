package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.util.AbstractC4682e;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.analytics.internal.e */
/* loaded from: classes2.dex */
public class C3891e {

    /* renamed from: a */
    private final long f15079a;

    /* renamed from: b */
    private final int f15080b;

    /* renamed from: c */
    private double f15081c;

    /* renamed from: d */
    private long f15082d;

    /* renamed from: e */
    private final Object f15083e;

    /* renamed from: f */
    private final String f15084f;

    /* renamed from: g */
    private final AbstractC4682e f15085g;

    public C3891e(int i, long j, String str, AbstractC4682e abstractC4682e) {
        this.f15083e = new Object();
        this.f15080b = i;
        this.f15081c = this.f15080b;
        this.f15079a = j;
        this.f15084f = str;
        this.f15085g = abstractC4682e;
    }

    public C3891e(String str, AbstractC4682e abstractC4682e) {
        this(60, 2000L, str, abstractC4682e);
    }

    /* renamed from: a */
    public boolean m26299a() {
        boolean z;
        synchronized (this.f15083e) {
            long mo16434a = this.f15085g.mo16434a();
            if (this.f15081c < this.f15080b) {
                double d = (mo16434a - this.f15082d) / this.f15079a;
                if (d > C9755a.f30449c) {
                    this.f15081c = Math.min(this.f15080b, d + this.f15081c);
                }
            }
            this.f15082d = mo16434a;
            if (this.f15081c >= 1.0d) {
                this.f15081c -= 1.0d;
                z = true;
            } else {
                String str = this.f15084f;
                C3892f.m26292c(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
                z = false;
            }
        }
        return z;
    }
}
