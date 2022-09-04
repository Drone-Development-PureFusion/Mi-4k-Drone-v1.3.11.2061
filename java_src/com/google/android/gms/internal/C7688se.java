package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.se */
/* loaded from: classes2.dex */
public class C7688se extends AbstractCallableC7701sq {

    /* renamed from: i */
    private long f25520i;

    public C7688se(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, long j, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
        this.f25520i = j;
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        long longValue = ((Long) this.f25546f.invoke(null, new Object[0])).longValue();
        synchronized (this.f25545e) {
            this.f25545e.f22961ae = Long.valueOf(longValue);
            if (this.f25520i != 0) {
                this.f25545e.f22978q = Long.valueOf(longValue - this.f25520i);
                this.f25545e.f22983v = Long.valueOf(this.f25520i);
            }
        }
    }
}
