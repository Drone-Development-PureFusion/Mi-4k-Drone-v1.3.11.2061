package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.sa */
/* loaded from: classes2.dex */
public class C7684sa extends AbstractCallableC7701sq {

    /* renamed from: i */
    private static volatile String f25513i = null;

    /* renamed from: j */
    private static final Object f25514j = new Object();

    public C7684sa(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        this.f25545e.f22985x = "E";
        if (f25513i == null) {
            synchronized (f25514j) {
                if (f25513i == null) {
                    f25513i = (String) this.f25546f.invoke(null, this.f25542b.m13732a());
                }
            }
        }
        synchronized (this.f25545e) {
            this.f25545e.f22985x = C7253jl.m15088a(f25513i.getBytes(), true);
        }
    }
}
