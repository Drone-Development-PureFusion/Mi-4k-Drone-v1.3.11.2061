package com.google.android.gms.internal;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.rf */
/* loaded from: classes2.dex */
final class C7651rf {

    /* renamed from: a */
    final int f25392a;

    /* renamed from: b */
    final byte[] f25393b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7651rf(int i, byte[] bArr) {
        this.f25392a = i;
        this.f25393b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m13845a() {
        return C7640qw.m13915h(this.f25392a) + 0 + this.f25393b.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13844a(C7640qw c7640qw) {
        c7640qw.m13918g(this.f25392a);
        c7640qw.m13926d(this.f25393b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7651rf)) {
            return false;
        }
        C7651rf c7651rf = (C7651rf) obj;
        return this.f25392a == c7651rf.f25392a && Arrays.equals(this.f25393b, c7651rf.f25393b);
    }

    public int hashCode() {
        return ((this.f25392a + 527) * 31) + Arrays.hashCode(this.f25393b);
    }
}
