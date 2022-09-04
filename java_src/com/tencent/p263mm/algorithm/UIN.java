package com.tencent.p263mm.algorithm;

import com.google.firebase.p253b.C9755a;
/* renamed from: com.tencent.mm.algorithm.UIN */
/* loaded from: classes2.dex */
public class UIN extends Number {

    /* renamed from: h */
    private int f31547h;

    public UIN(int i) {
        this.f31547h = 0;
        this.f31547h = i;
    }

    public UIN(long j) {
        this.f31547h = 0;
        this.f31547h = (int) ((-1) & j);
    }

    public static int valueOf(String str) {
        try {
            return new UIN(Long.valueOf(str).longValue()).intValue();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return (this.f31547h | 0) + C9755a.f30449c;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) ((this.f31547h | 0) + C9755a.f30449c);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f31547h;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f31547h & 4294967295L;
    }

    public String toString() {
        return String.valueOf(this.f31547h & 4294967295L);
    }

    public int value() {
        return this.f31547h;
    }
}
