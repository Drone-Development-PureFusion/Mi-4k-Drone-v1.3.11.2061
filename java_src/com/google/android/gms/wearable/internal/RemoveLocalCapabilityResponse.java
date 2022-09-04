package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class RemoveLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveLocalCapabilityResponse> CREATOR = new C9498aj();

    /* renamed from: a */
    public final int f29991a;

    /* renamed from: b */
    public final int f29992b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoveLocalCapabilityResponse(int i, int i2) {
        this.f29991a = i;
        this.f29992b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9498aj.m7998a(this, parcel, i);
    }
}
