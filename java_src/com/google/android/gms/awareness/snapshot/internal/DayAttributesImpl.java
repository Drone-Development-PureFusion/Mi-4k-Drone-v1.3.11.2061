package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DayAttributesImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DayAttributesImpl> CREATOR = new C4113c();

    /* renamed from: a */
    private final int f15651a;

    /* renamed from: b */
    private final int[] f15652b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DayAttributesImpl(int i, int[] iArr) {
        this.f15651a = i;
        this.f15652b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25459a() {
        return this.f15651a;
    }

    /* renamed from: b */
    public int[] m25458b() {
        return this.f15652b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Attributes=");
        if (this.f15652b == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.f15652b;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4113c.m25414a(this, parcel, i);
    }
}
