package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class StopAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StopAdvertisingParams> CREATOR = new C8785g();

    /* renamed from: a */
    final int f28151a;

    public StopAdvertisingParams() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StopAdvertisingParams(int i) {
        this.f28151a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StopAdvertisingParams) && this.f28151a == ((StopAdvertisingParams) obj).f28151a;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28151a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8785g.m10070a(this, parcel, i);
    }
}
