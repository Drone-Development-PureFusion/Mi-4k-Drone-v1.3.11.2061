package com.google.android.gms.common.images;
/* renamed from: com.google.android.gms.common.images.a */
/* loaded from: classes2.dex */
public final class C4549a {

    /* renamed from: a */
    private final int f16972a;

    /* renamed from: b */
    private final int f16973b;

    public C4549a(int i, int i2) {
        this.f16972a = i;
        this.f16973b = i2;
    }

    /* renamed from: a */
    public static C4549a m23758a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            throw m23756b(str);
        }
        try {
            return new C4549a(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException e) {
            throw m23756b(str);
        }
    }

    /* renamed from: b */
    private static NumberFormatException m23756b(String str) {
        throw new NumberFormatException(new StringBuilder(String.valueOf(str).length() + 16).append("Invalid Size: \"").append(str).append("\"").toString());
    }

    /* renamed from: a */
    public int m23759a() {
        return this.f16972a;
    }

    /* renamed from: b */
    public int m23757b() {
        return this.f16973b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4549a)) {
            return false;
        }
        C4549a c4549a = (C4549a) obj;
        if (this.f16972a != c4549a.f16972a || this.f16973b != c4549a.f16973b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f16973b ^ ((this.f16972a << 16) | (this.f16972a >>> 16));
    }

    public String toString() {
        int i = this.f16972a;
        return new StringBuilder(23).append(i).append("x").append(this.f16973b).toString();
    }
}
