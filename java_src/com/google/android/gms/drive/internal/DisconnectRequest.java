package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DisconnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DisconnectRequest> CREATOR = new C4893bq();

    /* renamed from: a */
    final int f17707a;

    public DisconnectRequest() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisconnectRequest(int i) {
        this.f17707a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4893bq.m22472a(this, parcel, i);
    }
}
