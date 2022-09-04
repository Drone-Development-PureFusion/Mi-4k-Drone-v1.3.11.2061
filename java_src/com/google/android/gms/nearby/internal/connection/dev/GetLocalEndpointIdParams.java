package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GetLocalEndpointIdParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetLocalEndpointIdParams> CREATOR = new C8794o();

    /* renamed from: a */
    final int f28088a;

    public GetLocalEndpointIdParams() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetLocalEndpointIdParams(int i) {
        this.f28088a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetLocalEndpointIdParams) && this.f28088a == ((GetLocalEndpointIdParams) obj).f28088a;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28088a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8794o.m10050a(this, parcel, i);
    }
}
