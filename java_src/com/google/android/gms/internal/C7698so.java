package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.so */
/* loaded from: classes2.dex */
public class C7698so extends AbstractCallableC7701sq {
    public C7698so(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        this.f25545e.f22944O = 2;
        boolean booleanValue = ((Boolean) this.f25546f.invoke(null, this.f25542b.m13721b())).booleanValue();
        synchronized (this.f25545e) {
            if (booleanValue) {
                this.f25545e.f22944O = 1;
            } else {
                this.f25545e.f22944O = 0;
            }
        }
    }
}
