package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class StopDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StopDiscoveryParams> CREATOR = new C8787i();

    /* renamed from: a */
    final int f28153a;

    public StopDiscoveryParams() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StopDiscoveryParams(int i) {
        this.f28153a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StopDiscoveryParams) && this.f28153a == ((StopDiscoveryParams) obj).f28153a;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28153a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8787i.m10064a(this, parcel, i);
    }
}
