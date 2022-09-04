package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;
/* loaded from: classes2.dex */
public class AddPermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddPermissionRequest> CREATOR = new C4846ab();

    /* renamed from: a */
    final int f17647a;

    /* renamed from: b */
    final DriveId f17648b;

    /* renamed from: c */
    final Permission f17649c;

    /* renamed from: d */
    final boolean f17650d;

    /* renamed from: e */
    final String f17651e;

    /* renamed from: f */
    final boolean f17652f;

    /* renamed from: g */
    final String f17653g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AddPermissionRequest(int i, DriveId driveId, Permission permission, boolean z, String str, boolean z2, String str2) {
        this.f17647a = i;
        this.f17648b = driveId;
        this.f17649c = permission;
        this.f17650d = z;
        this.f17651e = str;
        this.f17652f = z2;
        this.f17653g = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4846ab.m22592a(this, parcel, i);
    }
}
