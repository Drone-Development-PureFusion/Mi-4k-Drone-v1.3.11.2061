package com.google.android.gms.tagmanager;
/* renamed from: com.google.android.gms.tagmanager.cv */
/* loaded from: classes2.dex */
class C9146cv extends Number implements Comparable<C9146cv> {

    /* renamed from: a */
    private double f28875a;

    /* renamed from: b */
    private long f28876b;

    /* renamed from: c */
    private boolean f28877c = false;

    private C9146cv(double d) {
        this.f28875a = d;
    }

    private C9146cv(long j) {
        this.f28876b = j;
    }

    /* renamed from: a */
    public static C9146cv m9141a(long j) {
        return new C9146cv(j);
    }

    /* renamed from: a */
    public static C9146cv m9139a(Double d) {
        return new C9146cv(d.doubleValue());
    }

    /* renamed from: a */
    public static C9146cv m9138a(String str) {
        try {
            return new C9146cv(Long.parseLong(str));
        } catch (NumberFormatException e) {
            try {
                return new C9146cv(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new NumberFormatException(String.valueOf(str).concat(" is not a valid TypedNumber"));
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C9146cv c9146cv) {
        return (!m9137b() || !c9146cv.m9137b()) ? Double.compare(doubleValue(), c9146cv.doubleValue()) : new Long(this.f28876b).compareTo(Long.valueOf(c9146cv.f28876b));
    }

    /* renamed from: a */
    public boolean m9142a() {
        return !m9137b();
    }

    /* renamed from: b */
    public boolean m9137b() {
        return this.f28877c;
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return (byte) longValue();
    }

    /* renamed from: c */
    public long m9136c() {
        return m9137b() ? this.f28876b : (long) this.f28875a;
    }

    /* renamed from: d */
    public int m9135d() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return m9137b() ? this.f28876b : this.f28875a;
    }

    /* renamed from: e */
    public short m9134e() {
        return (short) longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9146cv) && compareTo((C9146cv) obj) == 0;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return m9135d();
    }

    @Override // java.lang.Number
    public long longValue() {
        return m9136c();
    }

    @Override // java.lang.Number
    public short shortValue() {
        return m9134e();
    }

    public String toString() {
        return m9137b() ? Long.toString(this.f28876b) : Double.toString(this.f28875a);
    }
}
