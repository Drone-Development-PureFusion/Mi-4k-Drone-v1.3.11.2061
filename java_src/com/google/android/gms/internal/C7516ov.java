package com.google.android.gms.internal;

import java.math.BigDecimal;
/* renamed from: com.google.android.gms.internal.ov */
/* loaded from: classes2.dex */
public final class C7516ov extends Number {

    /* renamed from: a */
    private final String f25012a;

    public C7516ov(String str) {
        this.f25012a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f25012a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7516ov)) {
            return false;
        }
        C7516ov c7516ov = (C7516ov) obj;
        return this.f25012a == c7516ov.f25012a || this.f25012a.equals(c7516ov.f25012a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f25012a);
    }

    public int hashCode() {
        return this.f25012a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            return Integer.parseInt(this.f25012a);
        } catch (NumberFormatException e) {
            try {
                return (int) Long.parseLong(this.f25012a);
            } catch (NumberFormatException e2) {
                return new BigDecimal(this.f25012a).intValue();
            }
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f25012a);
        } catch (NumberFormatException e) {
            return new BigDecimal(this.f25012a).longValue();
        }
    }

    public String toString() {
        return this.f25012a;
    }
}
