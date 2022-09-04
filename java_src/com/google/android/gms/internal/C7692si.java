package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.si */
/* loaded from: classes2.dex */
public class C7692si extends AbstractCallableC7701sq {

    /* renamed from: i */
    private long f25525i = -1;

    public C7692si(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        this.f25545e.f22973l = -1L;
        if (this.f25525i == -1) {
            this.f25525i = ((Integer) this.f25546f.invoke(null, this.f25542b.m13732a())).intValue();
        }
        synchronized (this.f25545e) {
            this.f25545e.f22973l = Long.valueOf(this.f25525i);
        }
    }
}
