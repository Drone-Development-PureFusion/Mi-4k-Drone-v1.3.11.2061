package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;
/* loaded from: classes2.dex */
public class AddEventListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddEventListenerRequest> CREATOR = new C4844a();

    /* renamed from: a */
    final int f17641a;

    /* renamed from: b */
    final DriveId f17642b;

    /* renamed from: c */
    final int f17643c;

    /* renamed from: d */
    final ChangesAvailableOptions f17644d;

    /* renamed from: e */
    final TransferStateOptions f17645e;

    /* renamed from: f */
    final TransferProgressOptions f17646f;

    public AddEventListenerRequest(int i, DriveId driveId) {
        this(1, (DriveId) C4588d.m23627a(driveId), i, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AddEventListenerRequest(int i, DriveId driveId, int i2, ChangesAvailableOptions changesAvailableOptions, TransferStateOptions transferStateOptions, TransferProgressOptions transferProgressOptions) {
        this.f17641a = i;
        this.f17642b = driveId;
        this.f17643c = i2;
        this.f17644d = changesAvailableOptions;
        this.f17645e = transferStateOptions;
        this.f17646f = transferProgressOptions;
    }

    /* renamed from: a */
    public DriveId m22623a() {
        return this.f17642b;
    }

    /* renamed from: b */
    public int m22622b() {
        return this.f17643c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4844a.m22598a(this, parcel, i);
    }
}
