package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class OnFetchThumbnailResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnFetchThumbnailResponse> CREATOR = new C4984z();

    /* renamed from: a */
    final int f17768a;

    /* renamed from: b */
    final ParcelFileDescriptor f17769b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnFetchThumbnailResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f17768a = i;
        this.f17769b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4984z.m22226a(this, parcel, i | 1);
    }
}
