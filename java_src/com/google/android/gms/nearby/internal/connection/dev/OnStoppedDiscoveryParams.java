package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnStoppedDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnStoppedDiscoveryParams> CREATOR = new C8778ag();

    /* renamed from: a */
    final int f28117a;

    /* renamed from: b */
    private final int f28118b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnStoppedDiscoveryParams(int i, int i2) {
        this.f28117a = i;
        this.f28118b = i2;
    }

    /* renamed from: a */
    public int m10141a() {
        return this.f28118b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnStoppedDiscoveryParams)) {
            return false;
        }
        OnStoppedDiscoveryParams onStoppedDiscoveryParams = (OnStoppedDiscoveryParams) obj;
        return this.f28117a == onStoppedDiscoveryParams.f28117a && C4585c.m23634a(Integer.valueOf(this.f28118b), Integer.valueOf(onStoppedDiscoveryParams.f28118b));
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28117a), Integer.valueOf(this.f28118b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8778ag.m10091a(this, parcel, i);
    }
}
