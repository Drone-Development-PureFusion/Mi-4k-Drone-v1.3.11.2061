package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class PartialDriveId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PartialDriveId> CREATOR = new C5017n();

    /* renamed from: a */
    final int f17999a;

    /* renamed from: b */
    final String f18000b;

    /* renamed from: c */
    final long f18001c;

    /* renamed from: d */
    final int f18002d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PartialDriveId(int i, String str, long j, int i2) {
        this.f17999a = i;
        this.f18000b = str;
        this.f18001c = j;
        this.f18002d = i2;
    }

    public PartialDriveId(String str, long j, int i) {
        this(1, str, j, i);
    }

    /* renamed from: a */
    public DriveId m22146a(long j) {
        return new DriveId(this.f18000b, this.f18001c, j, this.f18002d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5017n.m22104a(this, parcel, i);
    }
}
