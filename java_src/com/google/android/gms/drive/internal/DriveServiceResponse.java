package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4562ad;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DriveServiceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DriveServiceResponse> CREATOR = new C4952e();

    /* renamed from: a */
    final int f17708a;

    /* renamed from: b */
    final IBinder f17709b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DriveServiceResponse(int i, IBinder iBinder) {
        this.f17708a = i;
        this.f17709b = iBinder;
    }

    /* renamed from: a */
    public AbstractC4562ad m22619a() {
        return AbstractC4562ad.AbstractBinderC4563a.m23700a(this.f17709b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4952e.m22352a(this, parcel, i);
    }
}
