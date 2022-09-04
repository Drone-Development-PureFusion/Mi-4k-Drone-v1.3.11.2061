package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SetPinnedDownloadPreferencesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetPinnedDownloadPreferencesRequest> CREATOR = new C4862ar();

    /* renamed from: a */
    final int f17815a;

    /* renamed from: b */
    final ParcelableTransferPreferences f17816b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SetPinnedDownloadPreferencesRequest(int i, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.f17815a = i;
        this.f17816b = parcelableTransferPreferences;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4862ar.m22547a(this, parcel, i);
    }
}
