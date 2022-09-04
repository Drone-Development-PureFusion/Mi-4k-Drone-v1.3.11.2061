package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class OnPinnedDownloadPreferencesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnPinnedDownloadPreferencesResponse> CREATOR = new C4849ae();

    /* renamed from: a */
    final int f17779a;

    /* renamed from: b */
    final ParcelableTransferPreferences f17780b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnPinnedDownloadPreferencesResponse(int i, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.f17779a = i;
        this.f17780b = parcelableTransferPreferences;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4849ae.m22583a(this, parcel, i);
    }
}
