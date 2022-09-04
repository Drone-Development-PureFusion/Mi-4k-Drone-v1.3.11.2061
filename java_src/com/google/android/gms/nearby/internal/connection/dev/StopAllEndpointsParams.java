package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class StopAllEndpointsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StopAllEndpointsParams> CREATOR = new C8786h();

    /* renamed from: a */
    final int f28152a;

    public StopAllEndpointsParams() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StopAllEndpointsParams(int i) {
        this.f28152a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StopAllEndpointsParams) && this.f28152a == ((StopAllEndpointsParams) obj).f28152a;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28152a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8786h.m10067a(this, parcel, i);
    }
}
