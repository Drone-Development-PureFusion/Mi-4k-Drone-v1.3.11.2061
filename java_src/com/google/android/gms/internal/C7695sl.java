package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.sl */
/* loaded from: classes2.dex */
public class C7695sl extends AbstractCallableC7701sq {

    /* renamed from: i */
    private final StackTraceElement[] f25529i;

    public C7695sl(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(c7677rw, str, str2, c6831a, i, i2);
        this.f25529i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        if (this.f25529i != null) {
            C7673rt c7673rt = new C7673rt((String) this.f25546f.invoke(null, this.f25529i));
            synchronized (this.f25545e) {
                this.f25545e.f22941L = c7673rt.f25467a;
                if (c7673rt.f25468b.booleanValue()) {
                    this.f25545e.f22951V = Integer.valueOf(c7673rt.f25469c.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
