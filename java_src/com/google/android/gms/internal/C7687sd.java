package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.sd */
/* loaded from: classes2.dex */
public class C7687sd extends AbstractCallableC7701sq {

    /* renamed from: i */
    private static volatile Long f25518i = null;

    /* renamed from: j */
    private static final Object f25519j = new Object();

    public C7687sd(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        if (f25518i == null) {
            synchronized (f25519j) {
                if (f25518i == null) {
                    f25518i = (Long) this.f25546f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f25545e) {
            this.f25545e.f22940K = f25518i;
        }
    }
}
