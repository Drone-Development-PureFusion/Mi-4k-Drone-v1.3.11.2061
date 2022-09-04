package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class DisconnectFromEndpointParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DisconnectFromEndpointParams> CREATOR = new C8792m();

    /* renamed from: a */
    final int f28085a;

    /* renamed from: b */
    private final String f28086b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisconnectFromEndpointParams(int i, String str) {
        this.f28085a = i;
        this.f28086b = str;
    }

    /* renamed from: a */
    public String m10161a() {
        return this.f28086b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisconnectFromEndpointParams)) {
            return false;
        }
        DisconnectFromEndpointParams disconnectFromEndpointParams = (DisconnectFromEndpointParams) obj;
        return this.f28085a == disconnectFromEndpointParams.f28085a && C4585c.m23634a(this.f28086b, disconnectFromEndpointParams.f28086b);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28085a), this.f28086b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8792m.m10056a(this, parcel, i);
    }
}
