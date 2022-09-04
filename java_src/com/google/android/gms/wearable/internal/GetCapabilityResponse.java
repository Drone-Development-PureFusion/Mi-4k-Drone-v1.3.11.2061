package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCapabilityResponse> CREATOR = new C9600j();

    /* renamed from: a */
    public final int f29932a;

    /* renamed from: b */
    public final int f29933b;

    /* renamed from: c */
    public final CapabilityInfoParcelable f29934c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetCapabilityResponse(int i, int i2, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.f29932a = i;
        this.f29933b = i2;
        this.f29934c = capabilityInfoParcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9600j.m7770a(this, parcel, i);
    }
}
