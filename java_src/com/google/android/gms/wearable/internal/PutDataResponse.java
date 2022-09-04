package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PutDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PutDataResponse> CREATOR = new C9496ah();

    /* renamed from: a */
    public final int f29986a;

    /* renamed from: b */
    public final int f29987b;

    /* renamed from: c */
    public final DataItemParcelable f29988c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PutDataResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.f29986a = i;
        this.f29987b = i2;
        this.f29988c = dataItemParcelable;
    }

    public PutDataResponse(int i, DataItemParcelable dataItemParcelable) {
        this(1, i, dataItemParcelable);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9496ah.m8004a(this, parcel, i);
    }
}
