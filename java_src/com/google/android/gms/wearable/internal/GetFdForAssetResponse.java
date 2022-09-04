package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetFdForAssetResponse> CREATOR = new C9610t();

    /* renamed from: a */
    public final int f29963a;

    /* renamed from: b */
    public final int f29964b;

    /* renamed from: c */
    public final ParcelFileDescriptor f29965c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetFdForAssetResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.f29963a = i;
        this.f29964b = i2;
        this.f29965c = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9610t.m7740a(this, parcel, i | 1);
    }
}
