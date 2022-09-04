package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
/* renamed from: com.google.android.gms.internal.sb */
/* loaded from: classes2.dex */
public class C7685sb extends AbstractCallableC7701sq {

    /* renamed from: i */
    private static volatile C7307km f25515i = null;

    /* renamed from: j */
    private static final Object f25516j = new Object();

    /* renamed from: k */
    private boolean f25517k;

    public C7685sb(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2, boolean z) {
        super(c7677rw, str, str2, c6831a, i, i2);
        this.f25517k = false;
        this.f25517k = z;
    }

    @Override // com.google.android.gms.internal.AbstractCallableC7701sq
    /* renamed from: a */
    protected void mo13687a() {
        if (f25515i == null) {
            synchronized (f25516j) {
                if (f25515i == null) {
                    f25515i = new C7307km((String) this.f25546f.invoke(null, this.f25542b.m13732a(), Boolean.valueOf(this.f25517k)));
                }
            }
        }
        synchronized (this.f25545e) {
            if (f25515i != null) {
                this.f25545e.f22984w = f25515i.f24456a;
                this.f25545e.f22932C = Long.valueOf(f25515i.f24457b);
                this.f25545e.f22931B = f25515i.f24458c;
                if (this.f25517k) {
                    this.f25545e.f22942M = f25515i.f24459d;
                    this.f25545e.f22943N = f25515i.f24460e;
                }
            }
        }
    }
}
