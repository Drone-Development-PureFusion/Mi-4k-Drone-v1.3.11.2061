package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnStoppedAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnStoppedAdvertisingParams> CREATOR = new C8777af();

    /* renamed from: a */
    final int f28115a;

    /* renamed from: b */
    private final int f28116b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnStoppedAdvertisingParams(int i, int i2) {
        this.f28115a = i;
        this.f28116b = i2;
    }

    /* renamed from: a */
    public int m10142a() {
        return this.f28116b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnStoppedAdvertisingParams)) {
            return false;
        }
        OnStoppedAdvertisingParams onStoppedAdvertisingParams = (OnStoppedAdvertisingParams) obj;
        return this.f28115a == onStoppedAdvertisingParams.f28115a && C4585c.m23634a(Integer.valueOf(this.f28116b), Integer.valueOf(onStoppedAdvertisingParams.f28116b));
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28115a), Integer.valueOf(this.f28116b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8777af.m10094a(this, parcel, i);
    }
}
