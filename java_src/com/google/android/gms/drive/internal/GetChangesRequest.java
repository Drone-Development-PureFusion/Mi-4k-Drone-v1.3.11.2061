package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class GetChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetChangesRequest> CREATOR = new C4959i();

    /* renamed from: a */
    final int f17716a;

    /* renamed from: b */
    final ChangeSequenceNumber f17717b;

    /* renamed from: c */
    final int f17718c;

    /* renamed from: d */
    final List<DriveSpace> f17719d;

    /* renamed from: e */
    final boolean f17720e;

    /* renamed from: f */
    private final Set<DriveSpace> f17721f;

    private GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list, Set<DriveSpace> set, boolean z) {
        this.f17716a = i;
        this.f17717b = changeSequenceNumber;
        this.f17718c = i2;
        this.f17719d = list;
        this.f17721f = set;
        this.f17720e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list, boolean z) {
        this(i, changeSequenceNumber, i2, list, list == null ? null : new HashSet(list), z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4959i.m22339a(this, parcel, i);
    }
}
