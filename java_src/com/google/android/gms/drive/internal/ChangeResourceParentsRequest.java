package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;
/* loaded from: classes2.dex */
public class ChangeResourceParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChangeResourceParentsRequest> CREATOR = new C4881be();

    /* renamed from: a */
    final int f17659a;

    /* renamed from: b */
    final DriveId f17660b;

    /* renamed from: c */
    final List<DriveId> f17661c;

    /* renamed from: d */
    final List<DriveId> f17662d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangeResourceParentsRequest(int i, DriveId driveId, List<DriveId> list, List<DriveId> list2) {
        this.f17659a = i;
        this.f17660b = driveId;
        this.f17661c = list;
        this.f17662d = list2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4881be.m22508a(this, parcel, i);
    }
}
