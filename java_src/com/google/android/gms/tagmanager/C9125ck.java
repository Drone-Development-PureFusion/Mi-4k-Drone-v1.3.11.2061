package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.tagmanager.ck */
/* loaded from: classes2.dex */
class C9125ck implements AbstractC9095bu {

    /* renamed from: a */
    private final long f28836a;

    /* renamed from: b */
    private final int f28837b;

    /* renamed from: c */
    private double f28838c;

    /* renamed from: d */
    private long f28839d;

    /* renamed from: e */
    private final Object f28840e;

    /* renamed from: f */
    private final AbstractC4682e f28841f;

    public C9125ck() {
        this(60, 2000L);
    }

    public C9125ck(int i, long j) {
        this.f28840e = new Object();
        this.f28837b = i;
        this.f28838c = this.f28837b;
        this.f28836a = j;
        this.f28841f = C4685h.m23138d();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9095bu
    /* renamed from: a */
    public boolean mo9185a() {
        boolean z;
        synchronized (this.f28840e) {
            long mo16434a = this.f28841f.mo16434a();
            if (this.f28838c < this.f28837b) {
                double d = (mo16434a - this.f28839d) / this.f28836a;
                if (d > C9755a.f30449c) {
                    this.f28838c = Math.min(this.f28837b, d + this.f28838c);
                }
            }
            this.f28839d = mo16434a;
            if (this.f28838c >= 1.0d) {
                this.f28838c -= 1.0d;
                z = true;
            } else {
                C9065aw.m9299b("No more tokens available.");
                z = false;
            }
        }
        return z;
    }
}
