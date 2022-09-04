package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GetLocalDeviceIdParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetLocalDeviceIdParams> CREATOR = new C8793n();

    /* renamed from: a */
    final int f28087a;

    public GetLocalDeviceIdParams() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetLocalDeviceIdParams(int i) {
        this.f28087a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetLocalDeviceIdParams) && this.f28087a == ((GetLocalDeviceIdParams) obj).f28087a;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28087a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8793n.m10053a(this, parcel, i);
    }
}
