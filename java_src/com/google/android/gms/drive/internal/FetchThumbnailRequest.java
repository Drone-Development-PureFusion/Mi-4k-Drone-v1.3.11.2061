package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class FetchThumbnailRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FetchThumbnailRequest> CREATOR = new C4957g();

    /* renamed from: a */
    final int f17710a;

    /* renamed from: b */
    final DriveId f17711b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FetchThumbnailRequest(int i, DriveId driveId) {
        this.f17710a = i;
        this.f17711b = driveId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4957g.m22345a(this, parcel, i);
    }
}
