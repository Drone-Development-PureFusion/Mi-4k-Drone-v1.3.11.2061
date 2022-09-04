package com.google.android.gms.vision;

import android.util.SparseArray;
/* renamed from: com.google.android.gms.vision.h */
/* loaded from: classes2.dex */
public class C9304h {

    /* renamed from: a */
    private static final Object f29353a = new Object();

    /* renamed from: b */
    private static int f29354b = 0;

    /* renamed from: c */
    private SparseArray<Integer> f29355c = new SparseArray<>();

    /* renamed from: d */
    private SparseArray<Integer> f29356d = new SparseArray<>();

    /* renamed from: a */
    public int m8669a(int i) {
        int i2;
        synchronized (f29353a) {
            Integer num = this.f29355c.get(i);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = f29354b;
                f29354b++;
                this.f29355c.append(i, Integer.valueOf(i2));
                this.f29356d.append(i2, Integer.valueOf(i));
            }
        }
        return i2;
    }

    /* renamed from: b */
    public int m8668b(int i) {
        int intValue;
        synchronized (f29353a) {
            intValue = this.f29356d.get(i).intValue();
        }
        return intValue;
    }
}
