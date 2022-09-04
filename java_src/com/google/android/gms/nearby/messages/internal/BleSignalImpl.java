package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.AbstractC8825a;
/* loaded from: classes2.dex */
public class BleSignalImpl extends AbstractSafeParcelable implements AbstractC8825a {
    public static final Parcelable.Creator<BleSignalImpl> CREATOR = new C8840a();

    /* renamed from: b */
    final int f28254b;

    /* renamed from: c */
    public final int f28255c;

    /* renamed from: d */
    public final int f28256d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BleSignalImpl(int i, int i2, int i3) {
        this.f28254b = i;
        this.f28255c = i2;
        this.f28256d = (-128 >= i3 || i3 >= 128) ? Integer.MIN_VALUE : i3;
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8825a
    /* renamed from: a */
    public int mo9921a() {
        return this.f28255c;
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8825a
    /* renamed from: b */
    public int mo9920b() {
        return this.f28256d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC8825a)) {
            return false;
        }
        AbstractC8825a abstractC8825a = (AbstractC8825a) obj;
        return this.f28255c == abstractC8825a.mo9921a() && this.f28256d == abstractC8825a.mo9920b();
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28255c), Integer.valueOf(this.f28256d));
    }

    public String toString() {
        int i = this.f28255c;
        return new StringBuilder(48).append("BleSignal{rssi=").append(i).append(", txPower=").append(this.f28256d).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8840a.m9897a(this, parcel, i);
    }
}
