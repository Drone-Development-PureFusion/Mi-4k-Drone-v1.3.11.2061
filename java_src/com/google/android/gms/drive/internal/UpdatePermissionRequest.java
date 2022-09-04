package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class UpdatePermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UpdatePermissionRequest> CREATOR = new C4877ba();

    /* renamed from: a */
    final int f17833a;

    /* renamed from: b */
    final DriveId f17834b;

    /* renamed from: c */
    final String f17835c;

    /* renamed from: d */
    final int f17836d;

    /* renamed from: e */
    final boolean f17837e;

    /* renamed from: f */
    final String f17838f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UpdatePermissionRequest(int i, DriveId driveId, String str, int i2, boolean z, String str2) {
        this.f17833a = i;
        this.f17834b = driveId;
        this.f17835c = str;
        this.f17836d = i2;
        this.f17837e = z;
        this.f17838f = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4877ba.m22517a(this, parcel, i);
    }
}
