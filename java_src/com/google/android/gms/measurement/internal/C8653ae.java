package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.amu;
import java.math.BigDecimal;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ae */
/* loaded from: classes2.dex */
public class C8653ae {

    /* renamed from: a */
    final int f27682a;

    /* renamed from: b */
    BigDecimal f27683b;

    /* renamed from: c */
    BigDecimal f27684c;

    /* renamed from: d */
    BigDecimal f27685d;

    /* renamed from: e */
    final boolean f27686e;

    public C8653ae(amu.C6583d c6583d) {
        C4588d.m23627a(c6583d);
        boolean z = true;
        if (c6583d.f22326a == null || c6583d.f22326a.intValue() == 0) {
            z = false;
        } else if (c6583d.f22326a.intValue() != 4) {
            if (c6583d.f22328c == null) {
                z = false;
            }
        } else if (c6583d.f22329d == null || c6583d.f22330e == null) {
            z = false;
        }
        if (z) {
            this.f27682a = c6583d.f22326a.intValue();
            if (c6583d.f22326a.intValue() == 4) {
                z = (!C8723m.m10494n(c6583d.f22329d) || !C8723m.m10494n(c6583d.f22330e)) ? false : z;
                try {
                    this.f27684c = new BigDecimal(c6583d.f22329d);
                    this.f27685d = new BigDecimal(c6583d.f22330e);
                } catch (NumberFormatException e) {
                    z = false;
                }
            } else {
                z = !C8723m.m10494n(c6583d.f22328c) ? false : z;
                try {
                    this.f27683b = new BigDecimal(c6583d.f22328c);
                } catch (NumberFormatException e2) {
                    z = false;
                }
            }
        } else {
            this.f27682a = 0;
        }
        this.f27686e = z;
    }

    /* renamed from: a */
    private Boolean m10810a(BigDecimal bigDecimal) {
        boolean z = true;
        if (this.f27686e && bigDecimal != null) {
            switch (this.f27682a) {
                case 1:
                    if (bigDecimal.compareTo(this.f27683b) != -1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 2:
                    if (bigDecimal.compareTo(this.f27683b) != 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 3:
                    if (bigDecimal.compareTo(this.f27683b) != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 4:
                    if (bigDecimal.compareTo(this.f27684c) == -1 || bigDecimal.compareTo(this.f27685d) == 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                default:
                    return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Boolean m10813a(double d) {
        boolean z = true;
        if (!this.f27686e) {
            return null;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(d);
            switch (this.f27682a) {
                case 1:
                    if (bigDecimal.compareTo(this.f27683b) != -1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 2:
                    if (bigDecimal.compareTo(this.f27683b) != 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 3:
                    if (bigDecimal.compareTo(this.f27683b.subtract(new BigDecimal(Math.ulp(d)).multiply(new BigDecimal(2)))) != 1 || bigDecimal.compareTo(this.f27683b.add(new BigDecimal(Math.ulp(d)).multiply(new BigDecimal(2)))) != -1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                case 4:
                    if (bigDecimal.compareTo(this.f27684c) == -1 || bigDecimal.compareTo(this.f27685d) == 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                default:
                    return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    public Boolean m10812a(long j) {
        try {
            return m10810a(new BigDecimal(j));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    public Boolean m10811a(String str) {
        if (!C8723m.m10494n(str)) {
            return null;
        }
        try {
            return m10810a(new BigDecimal(str));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
