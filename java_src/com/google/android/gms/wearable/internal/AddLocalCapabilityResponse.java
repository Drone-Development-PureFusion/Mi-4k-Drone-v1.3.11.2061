package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AddLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddLocalCapabilityResponse> CREATOR = new C9540av();

    /* renamed from: a */
    public final int f29862a;

    /* renamed from: b */
    public final int f29863b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AddLocalCapabilityResponse(int i, int i2) {
        this.f29862a = i;
        this.f29863b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9540av.m7911a(this, parcel, i);
    }
}
