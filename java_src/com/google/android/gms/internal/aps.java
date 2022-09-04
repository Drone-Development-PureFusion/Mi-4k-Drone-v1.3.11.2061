package com.google.android.gms.internal;

import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
class aps implements apo {

    /* renamed from: a */
    private final long f22754a;

    /* renamed from: b */
    private final int f22755b;

    /* renamed from: c */
    private double f22756c;

    /* renamed from: d */
    private long f22757d;

    /* renamed from: e */
    private final Object f22758e;

    public aps() {
        this(60, 2000L);
    }

    public aps(int i, long j) {
        this.f22758e = new Object();
        this.f22755b = i;
        this.f22756c = this.f22755b;
        this.f22754a = j;
    }

    @Override // com.google.android.gms.internal.apo
    /* renamed from: a */
    public boolean mo16312a() {
        boolean z;
        synchronized (this.f22758e) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f22756c < this.f22755b) {
                double d = (currentTimeMillis - this.f22757d) / this.f22754a;
                if (d > C9755a.f30449c) {
                    this.f22756c = Math.min(this.f22755b, d + this.f22756c);
                }
            }
            this.f22757d = currentTimeMillis;
            if (this.f22756c >= 1.0d) {
                this.f22756c -= 1.0d;
                z = true;
            } else {
                aph.m16394b("No more tokens available.");
                z = false;
            }
        }
        return z;
    }
}
