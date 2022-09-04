package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final C3957e CREATOR = new C3957e();

    /* renamed from: a */
    final int f15247a;

    /* renamed from: b */
    public final int f15248b;

    /* renamed from: c */
    final Bundle f15249c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Feature(int i, int i2, Bundle bundle) {
        this.f15247a = i;
        this.f15248b = i2;
        this.f15249c = bundle;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            return C4585c.m23634a(Integer.valueOf(feature.f15248b), Integer.valueOf(this.f15248b)) && C4585c.m23634a(feature.f15249c, this.f15249c);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f15248b), this.f15249c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3957e c3957e = CREATOR;
        C3957e.m25917a(this, parcel, i);
    }
}
