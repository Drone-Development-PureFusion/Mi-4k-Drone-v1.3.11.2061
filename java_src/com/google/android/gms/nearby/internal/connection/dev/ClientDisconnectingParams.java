package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class ClientDisconnectingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientDisconnectingParams> CREATOR = new C8788j();

    /* renamed from: a */
    final int f28084a;

    public ClientDisconnectingParams() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClientDisconnectingParams(int i) {
        this.f28084a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientDisconnectingParams) && this.f28084a == ((ClientDisconnectingParams) obj).f28084a;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28084a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8788j.m10061a(this, parcel, i);
    }
}
