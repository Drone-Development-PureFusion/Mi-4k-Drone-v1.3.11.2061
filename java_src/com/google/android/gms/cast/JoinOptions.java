package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class JoinOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<JoinOptions> CREATOR = new C4447k();

    /* renamed from: a */
    private final int f15849a;

    /* renamed from: b */
    private int f15850b;

    public JoinOptions() {
        this(1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JoinOptions(int i, int i2) {
        this.f15849a = i;
        this.f15850b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25161a() {
        return this.f15849a;
    }

    /* renamed from: b */
    public int m25160b() {
        return this.f15850b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof JoinOptions) && this.f15850b == ((JoinOptions) obj).f15850b;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f15850b));
    }

    public String toString() {
        String str;
        switch (this.f15850b) {
            case 0:
                str = "STRONG";
                break;
            case 1:
            default:
                str = "UNKNOWN";
                break;
            case 2:
                str = "INVISIBLE";
                break;
        }
        return String.format("joinOptions(connectionType=%s)", str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4447k.m24105a(this, parcel, i);
    }
}
