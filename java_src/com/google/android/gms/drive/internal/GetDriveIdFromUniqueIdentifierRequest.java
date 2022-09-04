package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GetDriveIdFromUniqueIdentifierRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetDriveIdFromUniqueIdentifierRequest> CREATOR = new C4960j();

    /* renamed from: a */
    final int f17722a;

    /* renamed from: b */
    final String f17723b;

    /* renamed from: c */
    final boolean f17724c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetDriveIdFromUniqueIdentifierRequest(int i, String str, boolean z) {
        this.f17722a = i;
        this.f17723b = str;
        this.f17724c = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4960j.m22336a(this, parcel, i);
    }
}
