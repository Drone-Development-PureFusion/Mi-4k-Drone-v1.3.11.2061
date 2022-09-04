package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4585c;
import java.util.ArrayList;
import java.util.List;
@aaa
/* loaded from: classes.dex */
public class acb {

    /* renamed from: a */
    private final String[] f21079a;

    /* renamed from: b */
    private final double[] f21080b;

    /* renamed from: c */
    private final double[] f21081c;

    /* renamed from: d */
    private final int[] f21082d;

    /* renamed from: e */
    private int f21083e;

    /* renamed from: com.google.android.gms.internal.acb$a */
    /* loaded from: classes2.dex */
    public static class C6177a {

        /* renamed from: a */
        public final String f21084a;

        /* renamed from: b */
        public final double f21085b;

        /* renamed from: c */
        public final double f21086c;

        /* renamed from: d */
        public final double f21087d;

        /* renamed from: e */
        public final int f21088e;

        public C6177a(String str, double d, double d2, double d3, int i) {
            this.f21084a = str;
            this.f21086c = d;
            this.f21085b = d2;
            this.f21087d = d3;
            this.f21088e = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6177a)) {
                return false;
            }
            C6177a c6177a = (C6177a) obj;
            return C4585c.m23634a(this.f21084a, c6177a.f21084a) && this.f21085b == c6177a.f21085b && this.f21086c == c6177a.f21086c && this.f21088e == c6177a.f21088e && Double.compare(this.f21087d, c6177a.f21087d) == 0;
        }

        public int hashCode() {
            return C4585c.m23633a(this.f21084a, Double.valueOf(this.f21085b), Double.valueOf(this.f21086c), Double.valueOf(this.f21087d), Integer.valueOf(this.f21088e));
        }

        public String toString() {
            return C4585c.m23635a(this).m23632a("name", this.f21084a).m23632a("minBound", Double.valueOf(this.f21086c)).m23632a("maxBound", Double.valueOf(this.f21085b)).m23632a("percent", Double.valueOf(this.f21087d)).m23632a("count", Integer.valueOf(this.f21088e)).toString();
        }
    }

    /* renamed from: com.google.android.gms.internal.acb$b */
    /* loaded from: classes2.dex */
    public static class C6178b {

        /* renamed from: a */
        private final List<String> f21089a = new ArrayList();

        /* renamed from: b */
        private final List<Double> f21090b = new ArrayList();

        /* renamed from: c */
        private final List<Double> f21091c = new ArrayList();

        /* renamed from: a */
        public C6178b m18249a(String str, double d, double d2) {
            int i;
            int i2 = 0;
            while (true) {
                i = i2;
                if (i >= this.f21089a.size()) {
                    break;
                }
                double doubleValue = this.f21091c.get(i).doubleValue();
                double doubleValue2 = this.f21090b.get(i).doubleValue();
                if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                    break;
                }
                i2 = i + 1;
            }
            this.f21089a.add(i, str);
            this.f21091c.add(i, Double.valueOf(d));
            this.f21090b.add(i, Double.valueOf(d2));
            return this;
        }

        /* renamed from: a */
        public acb m18251a() {
            return new acb(this);
        }
    }

    private acb(C6178b c6178b) {
        int size = c6178b.f21090b.size();
        this.f21079a = (String[]) c6178b.f21089a.toArray(new String[size]);
        this.f21080b = m18252a(c6178b.f21090b);
        this.f21081c = m18252a(c6178b.f21091c);
        this.f21082d = new int[size];
        this.f21083e = 0;
    }

    /* renamed from: a */
    private double[] m18252a(List<Double> list) {
        double[] dArr = new double[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < dArr.length) {
                dArr[i2] = list.get(i2).doubleValue();
                i = i2 + 1;
            } else {
                return dArr;
            }
        }
    }

    /* renamed from: a */
    public List<C6177a> m18254a() {
        ArrayList arrayList = new ArrayList(this.f21079a.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f21079a.length) {
                arrayList.add(new C6177a(this.f21079a[i2], this.f21081c[i2], this.f21080b[i2], this.f21082d[i2] / this.f21083e, this.f21082d[i2]));
                i = i2 + 1;
            } else {
                return arrayList;
            }
        }
    }

    /* renamed from: a */
    public void m18253a(double d) {
        this.f21083e++;
        for (int i = 0; i < this.f21081c.length; i++) {
            if (this.f21081c[i] <= d && d < this.f21080b[i]) {
                int[] iArr = this.f21082d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < this.f21081c[i]) {
                return;
            }
        }
    }
}
