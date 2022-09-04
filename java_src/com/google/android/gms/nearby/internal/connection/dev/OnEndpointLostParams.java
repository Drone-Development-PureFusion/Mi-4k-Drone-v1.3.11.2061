package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnEndpointLostParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnEndpointLostParams> CREATOR = new C8773ab();

    /* renamed from: a */
    final int f28103a;

    /* renamed from: b */
    private final String f28104b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnEndpointLostParams(int i, String str) {
        this.f28103a = i;
        this.f28104b = str;
    }

    /* renamed from: a */
    public String m10150a() {
        return this.f28104b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnEndpointLostParams)) {
            return false;
        }
        OnEndpointLostParams onEndpointLostParams = (OnEndpointLostParams) obj;
        return this.f28103a == onEndpointLostParams.f28103a && C4585c.m23634a(this.f28104b, onEndpointLostParams.f28104b);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28103a), this.f28104b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8773ab.m10106a(this, parcel, i);
    }
}
