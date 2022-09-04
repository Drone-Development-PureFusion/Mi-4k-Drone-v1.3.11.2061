package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.sg */
/* loaded from: classes2.dex */
public class CallableC7690sg implements Callable {

    /* renamed from: a */
    private final C7677rw f25521a;

    /* renamed from: b */
    private final AbstractC6830df.C6831a f25522b;

    public CallableC7690sg(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        this.f25521a = c7677rw;
        this.f25522b = c6831a;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Void call() {
        if (this.f25521a.m13708l() != null) {
            this.f25521a.m13708l().get();
        }
        AbstractC6830df.C6831a m13709k = this.f25521a.m13709k();
        if (m13709k != null) {
            try {
                synchronized (this.f25522b) {
                    AbstractC7649rd.m13856a(this.f25522b, AbstractC7649rd.m13857a(m13709k));
                }
                return null;
            } catch (C7648rc e) {
                return null;
            }
        }
        return null;
    }
}
