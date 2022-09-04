package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;
/* loaded from: classes2.dex */
public class RemoveEventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveEventListenerRequest> CREATOR = new C4859ao();

    /* renamed from: a */
    final int f17804a;

    /* renamed from: b */
    final DriveId f17805b;

    /* renamed from: c */
    final int f17806c;

    /* renamed from: d */
    final TransferProgressOptions f17807d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoveEventListenerRequest(int i, DriveId driveId, int i2, TransferProgressOptions transferProgressOptions) {
        this.f17804a = i;
        this.f17805b = driveId;
        this.f17806c = i2;
        this.f17807d = transferProgressOptions;
    }

    public RemoveEventListenerRequest(DriveId driveId, int i) {
        this(driveId, i, null);
    }

    RemoveEventListenerRequest(DriveId driveId, int i, TransferProgressOptions transferProgressOptions) {
        this(1, driveId, i, transferProgressOptions);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4859ao.m22556a(this, parcel, i);
    }
}
