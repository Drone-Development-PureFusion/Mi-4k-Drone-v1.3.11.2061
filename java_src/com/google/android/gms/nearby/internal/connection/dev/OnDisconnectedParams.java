package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnDisconnectedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnDisconnectedParams> CREATOR = new C8821z();

    /* renamed from: a */
    final int f28097a;

    /* renamed from: b */
    private final String f28098b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnDisconnectedParams(int i, String str) {
        this.f28097a = i;
        this.f28098b = str;
    }

    /* renamed from: a */
    public String m10154a() {
        return this.f28098b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnDisconnectedParams)) {
            return false;
        }
        OnDisconnectedParams onDisconnectedParams = (OnDisconnectedParams) obj;
        return this.f28097a == onDisconnectedParams.f28097a && C4585c.m23634a(this.f28098b, onDisconnectedParams.f28098b);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28097a), this.f28098b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8821z.m9984a(this, parcel, i);
    }
}
