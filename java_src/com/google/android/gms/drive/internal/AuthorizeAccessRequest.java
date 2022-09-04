package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class AuthorizeAccessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizeAccessRequest> CREATOR = new C4878bb();

    /* renamed from: a */
    final int f17654a;

    /* renamed from: b */
    final long f17655b;

    /* renamed from: c */
    final DriveId f17656c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthorizeAccessRequest(int i, long j, DriveId driveId) {
        this.f17654a = i;
        this.f17655b = j;
        this.f17656c = driveId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4878bb.m22514a(this, parcel, i);
    }
}
