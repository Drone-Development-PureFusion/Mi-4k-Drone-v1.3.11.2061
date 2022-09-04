package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;
/* loaded from: classes2.dex */
public class SetResourceParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetResourceParentsRequest> CREATOR = new C4863as();

    /* renamed from: a */
    final int f17817a;

    /* renamed from: b */
    final DriveId f17818b;

    /* renamed from: c */
    final List<DriveId> f17819c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SetResourceParentsRequest(int i, DriveId driveId, List<DriveId> list) {
        this.f17817a = i;
        this.f17818b = driveId;
        this.f17819c = list;
    }

    public SetResourceParentsRequest(DriveId driveId, List<DriveId> list) {
        this(1, driveId, list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4863as.m22544a(this, parcel, i);
    }
}
