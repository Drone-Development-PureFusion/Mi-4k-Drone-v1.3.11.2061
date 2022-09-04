package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class UnsubscribeResourceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnsubscribeResourceRequest> CREATOR = new C4868ax();

    /* renamed from: a */
    final int f17826a;

    /* renamed from: b */
    final DriveId f17827b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnsubscribeResourceRequest(int i, DriveId driveId) {
        this.f17826a = i;
        this.f17827b = driveId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4868ax.m22532a(this, parcel, i);
    }
}
