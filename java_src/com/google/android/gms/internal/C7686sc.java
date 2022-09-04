package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.sc */
/* loaded from: classes2.dex */
public class C7686sc extends AbstractCallableC7701sq {
    public C7686sc(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        this.f25545e.f22966e = -1L;
        this.f25545e.f22967f = -1L;
        int[] iArr = (int[]) this.f25546f.invoke(null, this.f25542b.m13732a());
        synchronized (this.f25545e) {
            this.f25545e.f22966e = Long.valueOf(iArr[0]);
            this.f25545e.f22967f = Long.valueOf(iArr[1]);
        }
    }
}
