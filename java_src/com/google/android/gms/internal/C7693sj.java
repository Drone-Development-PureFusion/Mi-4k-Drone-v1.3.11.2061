package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.sj */
/* loaded from: classes2.dex */
public class C7693sj extends AbstractCallableC7701sq {

    /* renamed from: i */
    private static volatile String f25526i = null;

    /* renamed from: j */
    private static final Object f25527j = new Object();

    public C7693sj(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        this.f25545e.f22956a = "E";
        if (f25526i == null) {
            synchronized (f25527j) {
                if (f25526i == null) {
                    f25526i = (String) this.f25546f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f25545e) {
            this.f25545e.f22956a = f25526i;
        }
    }
}
