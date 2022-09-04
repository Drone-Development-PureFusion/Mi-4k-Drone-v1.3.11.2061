package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
import java.util.List;
/* renamed from: com.google.android.gms.internal.sk */
/* loaded from: classes2.dex */
public class C7694sk extends AbstractCallableC7701sq {

    /* renamed from: i */
    private List<Long> f25528i = null;

    public C7694sk(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        super(c7677rw, str, str2, c6831a, i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        this.f25545e.f22986y = -1L;
        this.f25545e.f22987z = -1L;
        if (this.f25528i == null) {
            this.f25528i = (List) this.f25546f.invoke(null, this.f25542b.m13732a());
        }
        if (this.f25528i == null || this.f25528i.size() != 2) {
            return;
        }
        synchronized (this.f25545e) {
            this.f25545e.f22986y = Long.valueOf(this.f25528i.get(0).longValue());
            this.f25545e.f22987z = Long.valueOf(this.f25528i.get(1).longValue());
        }
    }
}
