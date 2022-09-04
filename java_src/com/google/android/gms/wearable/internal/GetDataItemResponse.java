package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetDataItemResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetDataItemResponse> CREATOR = new C9609s();

    /* renamed from: a */
    public final int f29960a;

    /* renamed from: b */
    public final int f29961b;

    /* renamed from: c */
    public final DataItemParcelable f29962c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetDataItemResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.f29960a = i;
        this.f29961b = i2;
        this.f29962c = dataItemParcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9609s.m7743a(this, parcel, i);
    }
}
