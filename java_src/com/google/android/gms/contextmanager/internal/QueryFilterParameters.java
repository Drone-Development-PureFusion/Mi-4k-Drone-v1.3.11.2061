package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class QueryFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QueryFilterParameters> CREATOR = new C4786n();

    /* renamed from: a */
    private final int f17437a;

    /* renamed from: b */
    private final int f17438b;

    /* renamed from: c */
    private final int f17439c;

    /* renamed from: d */
    private final int[] f17440d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QueryFilterParameters(int i, int i2, int i3, int[] iArr) {
        this.f17437a = i;
        this.f17438b = i2;
        this.f17439c = i3;
        this.f17440d = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22845a() {
        return this.f17437a;
    }

    /* renamed from: b */
    public int m22844b() {
        return this.f17438b;
    }

    /* renamed from: c */
    public int m22843c() {
        return this.f17439c;
    }

    /* renamed from: d */
    public int[] m22842d() {
        return this.f17440d;
    }

    /* renamed from: e */
    public boolean m22841e() {
        return this.f17440d != null;
    }

    public boolean equals(Object obj) {
        int[] iArr;
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QueryFilterParameters)) {
            return false;
        }
        QueryFilterParameters queryFilterParameters = (QueryFilterParameters) obj;
        if (queryFilterParameters.f17439c == this.f17439c && queryFilterParameters.f17438b == this.f17438b && queryFilterParameters.f17437a == this.f17437a && m22841e() == queryFilterParameters.m22841e()) {
            if (!m22841e()) {
                return true;
            }
            if (this.f17440d.length != queryFilterParameters.f17440d.length) {
                return false;
            }
            for (int i : queryFilterParameters.f17440d) {
                int[] iArr2 = this.f17440d;
                int length = iArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    } else if (iArr2[i2] == i) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        if (this.f17440d != null) {
            int[] iArr = this.f17440d;
            int length = iArr.length;
            int i2 = 0;
            i = 0;
            while (i2 < length) {
                int i3 = (iArr[i2] * 13) + i;
                i2++;
                i = i3;
            }
        } else {
            i = 0;
        }
        return C4585c.m23633a(Integer.valueOf(i), Integer.valueOf(this.f17438b), Integer.valueOf(this.f17439c), Integer.valueOf(this.f17437a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4786n.m22762a(this, parcel, i);
    }
}
