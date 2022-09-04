package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class RemovePermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemovePermissionRequest> CREATOR = new C4860ap();

    /* renamed from: a */
    final int f17808a;

    /* renamed from: b */
    final DriveId f17809b;

    /* renamed from: c */
    final String f17810c;

    /* renamed from: d */
    final boolean f17811d;

    /* renamed from: e */
    final String f17812e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemovePermissionRequest(int i, DriveId driveId, String str, boolean z, String str2) {
        this.f17808a = i;
        this.f17809b = driveId;
        this.f17810c = str;
        this.f17811d = z;
        this.f17812e = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4860ap.m22553a(this, parcel, i);
    }
}
