package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes2.dex */
public class Flag extends AbstractSafeParcelable implements Comparable<Flag> {

    /* renamed from: a */
    final int f28404a;

    /* renamed from: b */
    public final String f28405b;

    /* renamed from: c */
    final long f28406c;

    /* renamed from: d */
    final boolean f28407d;

    /* renamed from: e */
    final double f28408e;

    /* renamed from: f */
    final String f28409f;

    /* renamed from: g */
    final byte[] f28410g;

    /* renamed from: h */
    public final int f28411h;

    /* renamed from: i */
    public final int f28412i;
    public static final Parcelable.Creator<Flag> CREATOR = new C8917b();

    /* renamed from: k */
    private static final Charset f28403k = Charset.forName("UTF-8");

    /* renamed from: j */
    public static final C8915a f28402j = new C8915a();

    /* renamed from: com.google.android.gms.phenotype.Flag$a */
    /* loaded from: classes2.dex */
    public static class C8915a implements Comparator<Flag> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Flag flag, Flag flag2) {
            return flag.f28412i == flag2.f28412i ? flag.f28405b.compareTo(flag2.f28405b) : flag.f28412i - flag2.f28412i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Flag(int i, String str, long j, boolean z, double d, String str2, byte[] bArr, int i2, int i3) {
        this.f28404a = i;
        this.f28405b = str;
        this.f28406c = j;
        this.f28407d = z;
        this.f28408e = d;
        this.f28409f = str2;
        this.f28410g = bArr;
        this.f28411h = i2;
        this.f28412i = i3;
    }

    /* renamed from: a */
    private static int m9743a(byte b, byte b2) {
        return b - b2;
    }

    /* renamed from: a */
    private static int m9742a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    private static int m9741a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: a */
    private static int m9739a(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 != null) {
            return str.compareTo(str2);
        }
        return 1;
    }

    /* renamed from: a */
    private static int m9738a(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Flag flag) {
        int compareTo = this.f28405b.compareTo(flag.f28405b);
        if (compareTo != 0) {
            return compareTo;
        }
        int m9742a = m9742a(this.f28411h, flag.f28411h);
        if (m9742a != 0) {
            return m9742a;
        }
        switch (this.f28411h) {
            case 1:
                return m9741a(this.f28406c, flag.f28406c);
            case 2:
                return m9738a(this.f28407d, flag.f28407d);
            case 3:
                return Double.compare(this.f28408e, flag.f28408e);
            case 4:
                return m9739a(this.f28409f, flag.f28409f);
            case 5:
                if (this.f28410g == flag.f28410g) {
                    return 0;
                }
                if (this.f28410g == null) {
                    return -1;
                }
                if (flag.f28410g == null) {
                    return 1;
                }
                for (int i = 0; i < Math.min(this.f28410g.length, flag.f28410g.length); i++) {
                    int m9743a = m9743a(this.f28410g[i], flag.f28410g[i]);
                    if (m9743a != 0) {
                        return m9743a;
                    }
                }
                return m9742a(this.f28410g.length, flag.f28410g.length);
            default:
                throw new AssertionError(new StringBuilder(31).append("Invalid enum value: ").append(this.f28411h).toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (this.f28404a != flag.f28404a || !C4585c.m23634a(this.f28405b, flag.f28405b) || this.f28411h != flag.f28411h || this.f28412i != flag.f28412i) {
            return false;
        }
        switch (this.f28411h) {
            case 1:
                return this.f28406c == flag.f28406c;
            case 2:
                return this.f28407d == flag.f28407d;
            case 3:
                return this.f28408e == flag.f28408e;
            case 4:
                return C4585c.m23634a(this.f28409f, flag.f28409f);
            case 5:
                return Arrays.equals(this.f28410g, flag.f28410g);
            default:
                throw new AssertionError(new StringBuilder(31).append("Invalid enum value: ").append(this.f28411h).toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Flag(");
        sb.append(this.f28404a);
        sb.append(", ");
        sb.append(this.f28405b);
        sb.append(", ");
        switch (this.f28411h) {
            case 1:
                sb.append(this.f28406c);
                break;
            case 2:
                sb.append(this.f28407d);
                break;
            case 3:
                sb.append(this.f28408e);
                break;
            case 4:
                sb.append("'");
                sb.append(this.f28409f);
                sb.append("'");
                break;
            case 5:
                if (this.f28410g != null) {
                    sb.append("'");
                    sb.append(new String(this.f28410g, f28403k));
                    sb.append("'");
                    break;
                } else {
                    sb.append("null");
                    break;
                }
            default:
                throw new AssertionError(new StringBuilder(31).append("Invalid enum value: ").append(this.f28411h).toString());
        }
        sb.append(", ");
        sb.append(this.f28411h);
        sb.append(", ");
        sb.append(this.f28412i);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8917b.m9731a(this, parcel, i);
    }
}
